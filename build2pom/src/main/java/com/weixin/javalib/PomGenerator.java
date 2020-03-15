package com.weixin.javalib;


import com.weixin.javalib.gen.PANTSLexer;
import com.weixin.javalib.gen.PANTSParser;
import com.weixin.utils.UnderLineErrorListener;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class PomGenerator {
  public void process(InputStream is) throws IOException {
    PANTSLexer lex = new PANTSLexer(CharStreams.fromStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    PANTSParser parser = new PANTSParser(tokens);
    parser.removeErrorListeners();
    parser.addErrorListener(new UnderLineErrorListener());
    ParseTree tree = parser.pants();

    ParseTreeWalker walker = new ParseTreeWalker();
    JavaLibEmitter emitter = new JavaLibEmitter();
    walker.walk(emitter,tree);
  }


}
