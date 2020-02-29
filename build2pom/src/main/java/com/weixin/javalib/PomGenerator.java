package com.weixin.javalib;

import static com.weixin.utils.Utils.stg;

import com.weixin.datastore.DependenciesMap;
import com.weixin.javalib.gen.PANTSLexer;
import com.weixin.javalib.gen.PANTSParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;

public class PomGenerator {
  public void process(InputStream is) throws IOException {
    PANTSLexer lex = new PANTSLexer(CharStreams.fromStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    PANTSParser parser = new PANTSParser(tokens);
    ParseTree tree = parser.pants();

    ParseTreeWalker walker = new ParseTreeWalker();
    JavaLibEmitter emitter = new JavaLibEmitter();
    walker.walk(emitter,tree);
  }


}
