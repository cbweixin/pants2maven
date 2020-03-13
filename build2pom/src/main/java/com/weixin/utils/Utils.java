package com.weixin.utils;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Utils {

  public static String stripSingleQuotes(String s) {
    if (s == null || s.charAt(0) != '\'') {
      return s;
    }
    return s.substring(1, s.length() - 1);
  }

  public static String getBasePath(String curPath) {

    String[] paths = curPath.split("/");
    int idx = IntStream.range(0, paths.length).filter(i -> "palo".equals(paths[i])).findFirst().orElse(-1);
    if (idx == -1) {
      return null;
    }

    String[] basePaths = Arrays.copyOfRange(paths, 0, idx + 1);
    return Arrays.stream(basePaths).collect(Collectors.joining("/"));
  }

  public static void writePomFile(String contents, String filePath) throws IOException {
    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath + "/pom.xml"));
    writer.write(contents);
    writer.close();
  }

  public static String getGroupId(String path) {
    String[] modules = path.split("/");
    String[] groups = Arrays.copyOfRange(modules, 0, modules.length - 1);
    int idx = IntStream.range(0, groups.length).filter(i -> "java".equals(groups[i])).findFirst().orElse(-1);
    if (idx == -1) {
      return Arrays.stream(groups).collect(Collectors.joining("."));
    }
    String[] candidates = Arrays.copyOfRange(groups, idx + 1, groups.length);
    return Arrays.stream(candidates).collect(Collectors.joining("."));
  }

  public static String getArtifcatId(String path) {
    String[] modules = path.split("/");
    return modules[modules.length - 1];
  }

  public static String xmlDeduplicate(String xmlStr) {
    final Set<String> jars = new HashSet<>();
    try {
      InputStream is = new ByteArrayInputStream(xmlStr.getBytes(StandardCharsets.UTF_8));
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = null;
      dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(is);

      NodeList list = doc.getElementsByTagName("dependency");
      System.out.println("list.getLength() = " + list.getLength());

      List<Element> needToRemove = new ArrayList<>();

      for (int i = 0; i < list.getLength(); i++) {

        Element element = (Element) list.item(i);
        String groupId = element.getElementsByTagName("groupId").item(0).getFirstChild()
            .getNodeValue();
        String aId = element.getElementsByTagName("artifactId").item(0).getFirstChild()
            .getNodeValue();
        NodeList versions = element.getElementsByTagName("version");
        String version = "";
        if (versions != null && versions.getLength() > 0) {
          version = versions.item(0).getFirstChild().getNodeValue();
        }

        System.out.println("element at " + i);
        String coordinates = groupId + ":" + aId + ":" + version;
        System.out.println("coordinates = " + coordinates);
        if (jars.contains(coordinates)) {
          needToRemove.add(element);
        } else {
          jars.add(coordinates);
        }
      }

      for (Element e : needToRemove) {
        e.getParentNode().removeChild(e);
      }

      String xmlDoc = documentToString(doc);
      return xmlDoc;


    } catch (ParserConfigurationException e) {
      e.printStackTrace();
    } catch (SAXException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return "";

  }


  public static String documentToString(Document document) {
    try {
      TransformerFactory tf = TransformerFactory.newInstance();
      InputStream in = Class.forName("App").getClassLoader().getResourceAsStream("strip-space.xsl");
      Transformer trans = tf.newTransformer(new StreamSource(in));
      trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
      trans.setOutputProperty(OutputKeys.METHOD, "xml");
      trans.setOutputProperty(OutputKeys.INDENT, "yes");
      trans.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
      trans.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      StringWriter sw = new StringWriter();
      trans.transform(new DOMSource(document), new StreamResult(sw));
      return sw.toString();
    } catch (TransformerException tEx) {
      tEx.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return null;
  }

}
