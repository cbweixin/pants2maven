// Generated from /Users/xinwei/Documents/weixin/github/BUILD2pom/build2pom/src/main/java/com/weixin/grammar/JarsLib.g4 by ANTLR 4.8
package com.weixin.jarslib.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JarsLibParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CLASSIFIER=7, URL=8, MUTABLE=9, 
		TARGET=10, JAR_LIBRARY=11, JARS=12, JAR=13, SCALA_JAR=14, NAME=15, ORG=16, 
		REV=17, INTRANSITIVE=18, EXCLUDES=19, EXCLUDE=20, FORCE=21, DEPENDENCIES=22, 
		BOOL_VALUE=23, SINGLE_QUOTED_STRING=24, NEWLINE=25, IDENTIFIER=26, WS=27, 
		LINE_COMMENT=28;
	public static final int
		RULE_jarslib = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_var_declare = 3, 
		RULE_target_lib_stmt = 4, RULE_target_item_list = 5, RULE_target_item = 6, 
		RULE_jar_lib_stmt = 7, RULE_jars_item_list = 8, RULE_jars_item = 9, RULE_jar_list = 10, 
		RULE_jar_entries = 11, RULE_jar_entry = 12, RULE_java_jar_entry = 13, 
		RULE_scala_jar_entry = 14, RULE_jar_coordinates = 15, RULE_jar_coordinate = 16, 
		RULE_excludes_list = 17, RULE_exclude_entries = 18, RULE_exclude_entry = 19, 
		RULE_exclude_coordinates = 20, RULE_exclude_coordinate = 21, RULE_name_item = 22, 
		RULE_dependencies_item = 23, RULE_dependent_list = 24, RULE_dependent_entry = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"jarslib", "stmt_list", "stmt", "var_declare", "target_lib_stmt", "target_item_list", 
			"target_item", "jar_lib_stmt", "jars_item_list", "jars_item", "jar_list", 
			"jar_entries", "jar_entry", "java_jar_entry", "scala_jar_entry", "jar_coordinates", 
			"jar_coordinate", "excludes_list", "exclude_entries", "exclude_entry", 
			"exclude_coordinates", "exclude_coordinate", "name_item", "dependencies_item", 
			"dependent_list", "dependent_entry"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'['", "']'", "','", "'classifier'", "'url'", 
			"'mutable'", "'target'", "'jar_library'", "'jars'", "'jar'", "'scala_jar'", 
			"'name'", "'org'", "'rev'", "'intransitive'", "'excludes'", "'exclude'", 
			"'force'", "'dependencies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "CLASSIFIER", "URL", "MUTABLE", 
			"TARGET", "JAR_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", 
			"INTRANSITIVE", "EXCLUDES", "EXCLUDE", "FORCE", "DEPENDENCIES", "BOOL_VALUE", 
			"SINGLE_QUOTED_STRING", "NEWLINE", "IDENTIFIER", "WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JarsLib.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JarsLibParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JarslibContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public JarslibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jarslib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJarslib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJarslib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJarslib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JarslibContext jarslib() throws RecognitionException {
		JarslibContext _localctx = new JarslibContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jarslib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			stmt_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JarsLibParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JarsLibParser.NEWLINE, i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitStmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitStmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TARGET) | (1L << JAR_LIBRARY) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(54);
				stmt();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(55);
					match(NEWLINE);
					}
				}

				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Var_declareContext var_declare() {
			return getRuleContext(Var_declareContext.class,0);
		}
		public Jar_lib_stmtContext jar_lib_stmt() {
			return getRuleContext(Jar_lib_stmtContext.class,0);
		}
		public Target_lib_stmtContext target_lib_stmt() {
			return getRuleContext(Target_lib_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				var_declare();
				}
				break;
			case JAR_LIBRARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				jar_lib_stmt();
				}
				break;
			case TARGET:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				target_lib_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declareContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JarsLibParser.IDENTIFIER, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Var_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterVar_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitVar_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitVar_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declareContext var_declare() throws RecognitionException {
		Var_declareContext _localctx = new Var_declareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(IDENTIFIER);
			setState(69);
			match(T__0);
			setState(70);
			match(SINGLE_QUOTED_STRING);
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(71);
				match(NEWLINE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Target_lib_stmtContext extends ParserRuleContext {
		public TerminalNode TARGET() { return getToken(JarsLibParser.TARGET, 0); }
		public Target_item_listContext target_item_list() {
			return getRuleContext(Target_item_listContext.class,0);
		}
		public Target_lib_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_lib_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterTarget_lib_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitTarget_lib_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitTarget_lib_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_lib_stmtContext target_lib_stmt() throws RecognitionException {
		Target_lib_stmtContext _localctx = new Target_lib_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_target_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(TARGET);
			setState(75);
			match(T__1);
			setState(76);
			target_item_list();
			setState(77);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Target_item_listContext extends ParserRuleContext {
		public List<Target_itemContext> target_item() {
			return getRuleContexts(Target_itemContext.class);
		}
		public Target_itemContext target_item(int i) {
			return getRuleContext(Target_itemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JarsLibParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JarsLibParser.NEWLINE, i);
		}
		public Target_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterTarget_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitTarget_item_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitTarget_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_item_listContext target_item_list() throws RecognitionException {
		Target_item_listContext _localctx = new Target_item_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_target_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME || _la==DEPENDENCIES) {
				{
				{
				setState(79);
				target_item();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(80);
					match(NEWLINE);
					}
				}

				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Target_itemContext extends ParserRuleContext {
		public Name_itemContext name_item() {
			return getRuleContext(Name_itemContext.class,0);
		}
		public Dependencies_itemContext dependencies_item() {
			return getRuleContext(Dependencies_itemContext.class,0);
		}
		public Target_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterTarget_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitTarget_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitTarget_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_itemContext target_item() throws RecognitionException {
		Target_itemContext _localctx = new Target_itemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_target_item);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				name_item();
				}
				break;
			case DEPENDENCIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				dependencies_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jar_lib_stmtContext extends ParserRuleContext {
		public TerminalNode JAR_LIBRARY() { return getToken(JarsLibParser.JAR_LIBRARY, 0); }
		public Jars_item_listContext jars_item_list() {
			return getRuleContext(Jars_item_listContext.class,0);
		}
		public Jar_lib_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_lib_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJar_lib_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJar_lib_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJar_lib_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_lib_stmtContext jar_lib_stmt() throws RecognitionException {
		Jar_lib_stmtContext _localctx = new Jar_lib_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jar_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(JAR_LIBRARY);
			setState(93);
			match(T__1);
			setState(94);
			jars_item_list();
			setState(95);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jars_item_listContext extends ParserRuleContext {
		public List<Jars_itemContext> jars_item() {
			return getRuleContexts(Jars_itemContext.class);
		}
		public Jars_itemContext jars_item(int i) {
			return getRuleContext(Jars_itemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JarsLibParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JarsLibParser.NEWLINE, i);
		}
		public Jars_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jars_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJars_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJars_item_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJars_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jars_item_listContext jars_item_list() throws RecognitionException {
		Jars_item_listContext _localctx = new Jars_item_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jars_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JARS) | (1L << NAME) | (1L << DEPENDENCIES))) != 0)) {
				{
				{
				setState(97);
				jars_item();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(98);
					match(NEWLINE);
					}
				}

				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jars_itemContext extends ParserRuleContext {
		public Name_itemContext name_item() {
			return getRuleContext(Name_itemContext.class,0);
		}
		public Dependencies_itemContext dependencies_item() {
			return getRuleContext(Dependencies_itemContext.class,0);
		}
		public Jar_listContext jar_list() {
			return getRuleContext(Jar_listContext.class,0);
		}
		public Jars_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jars_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJars_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJars_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJars_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jars_itemContext jars_item() throws RecognitionException {
		Jars_itemContext _localctx = new Jars_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jars_item);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				name_item();
				}
				break;
			case DEPENDENCIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				dependencies_item();
				}
				break;
			case JARS:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				jar_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jar_listContext extends ParserRuleContext {
		public TerminalNode JARS() { return getToken(JarsLibParser.JARS, 0); }
		public Jar_entriesContext jar_entries() {
			return getRuleContext(Jar_entriesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Jar_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJar_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJar_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJar_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_listContext jar_list() throws RecognitionException {
		Jar_listContext _localctx = new Jar_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jar_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(JARS);
			setState(112);
			match(T__0);
			setState(113);
			match(T__3);
			setState(114);
			jar_entries();
			setState(115);
			match(T__4);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(116);
				match(T__5);
				}
			}

			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(119);
				match(NEWLINE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jar_entriesContext extends ParserRuleContext {
		public List<Jar_entryContext> jar_entry() {
			return getRuleContexts(Jar_entryContext.class);
		}
		public Jar_entryContext jar_entry(int i) {
			return getRuleContext(Jar_entryContext.class,i);
		}
		public Jar_entriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_entries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJar_entries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJar_entries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJar_entries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_entriesContext jar_entries() throws RecognitionException {
		Jar_entriesContext _localctx = new Jar_entriesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jar_entries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAR || _la==SCALA_JAR) {
				{
				{
				setState(122);
				jar_entry();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jar_entryContext extends ParserRuleContext {
		public Java_jar_entryContext java_jar_entry() {
			return getRuleContext(Java_jar_entryContext.class,0);
		}
		public Scala_jar_entryContext scala_jar_entry() {
			return getRuleContext(Scala_jar_entryContext.class,0);
		}
		public Jar_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJar_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJar_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJar_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_entryContext jar_entry() throws RecognitionException {
		Jar_entryContext _localctx = new Jar_entryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jar_entry);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				java_jar_entry();
				}
				break;
			case SCALA_JAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				scala_jar_entry();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_jar_entryContext extends ParserRuleContext {
		public TerminalNode JAR() { return getToken(JarsLibParser.JAR, 0); }
		public Jar_coordinatesContext jar_coordinates() {
			return getRuleContext(Jar_coordinatesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Java_jar_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_jar_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJava_jar_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJava_jar_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJava_jar_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_jar_entryContext java_jar_entry() throws RecognitionException {
		Java_jar_entryContext _localctx = new Java_jar_entryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_java_jar_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(JAR);
			setState(133);
			match(T__1);
			setState(134);
			jar_coordinates();
			setState(135);
			match(T__2);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(136);
				match(T__5);
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(139);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scala_jar_entryContext extends ParserRuleContext {
		public TerminalNode SCALA_JAR() { return getToken(JarsLibParser.SCALA_JAR, 0); }
		public Jar_coordinatesContext jar_coordinates() {
			return getRuleContext(Jar_coordinatesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Scala_jar_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scala_jar_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterScala_jar_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitScala_jar_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitScala_jar_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scala_jar_entryContext scala_jar_entry() throws RecognitionException {
		Scala_jar_entryContext _localctx = new Scala_jar_entryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scala_jar_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(SCALA_JAR);
			setState(143);
			match(T__1);
			setState(144);
			jar_coordinates();
			setState(145);
			match(T__2);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(146);
				match(T__5);
				}
			}

			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(149);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jar_coordinatesContext extends ParserRuleContext {
		public List<Jar_coordinateContext> jar_coordinate() {
			return getRuleContexts(Jar_coordinateContext.class);
		}
		public Jar_coordinateContext jar_coordinate(int i) {
			return getRuleContext(Jar_coordinateContext.class,i);
		}
		public Jar_coordinatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_coordinates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterJar_coordinates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitJar_coordinates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitJar_coordinates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_coordinatesContext jar_coordinates() throws RecognitionException {
		Jar_coordinatesContext _localctx = new Jar_coordinatesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jar_coordinates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASSIFIER) | (1L << URL) | (1L << MUTABLE) | (1L << NAME) | (1L << ORG) | (1L << REV) | (1L << INTRANSITIVE) | (1L << EXCLUDES) | (1L << FORCE))) != 0)) {
				{
				{
				setState(152);
				jar_coordinate();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jar_coordinateContext extends ParserRuleContext {
		public Jar_coordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_coordinate; }
	 
		public Jar_coordinateContext() { }
		public void copyFrom(Jar_coordinateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GroupidContext extends Jar_coordinateContext {
		public TerminalNode ORG() { return getToken(JarsLibParser.ORG, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public GroupidContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterGroupid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitGroupid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitGroupid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntransitiveContext extends Jar_coordinateContext {
		public TerminalNode INTRANSITIVE() { return getToken(JarsLibParser.INTRANSITIVE, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(JarsLibParser.BOOL_VALUE, 0); }
		public IntransitiveContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterIntransitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitIntransitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitIntransitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MutableContext extends Jar_coordinateContext {
		public TerminalNode MUTABLE() { return getToken(JarsLibParser.MUTABLE, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(JarsLibParser.BOOL_VALUE, 0); }
		public MutableContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterMutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitMutable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitMutable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassifierContext extends Jar_coordinateContext {
		public TerminalNode CLASSIFIER() { return getToken(JarsLibParser.CLASSIFIER, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public ClassifierContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterClassifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitClassifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitClassifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArtifactidContext extends Jar_coordinateContext {
		public TerminalNode NAME() { return getToken(JarsLibParser.NAME, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public ArtifactidContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterArtifactid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitArtifactid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitArtifactid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exclude_jars_listContext extends Jar_coordinateContext {
		public Excludes_listContext excludes_list() {
			return getRuleContext(Excludes_listContext.class,0);
		}
		public Exclude_jars_listContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_jars_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_jars_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_jars_list(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForceableContext extends Jar_coordinateContext {
		public TerminalNode FORCE() { return getToken(JarsLibParser.FORCE, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(JarsLibParser.BOOL_VALUE, 0); }
		public ForceableContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterForceable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitForceable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitForceable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VersionContext extends Jar_coordinateContext {
		public TerminalNode REV() { return getToken(JarsLibParser.REV, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JarsLibParser.IDENTIFIER, 0); }
		public VersionContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UrlContext extends Jar_coordinateContext {
		public TerminalNode URL() { return getToken(JarsLibParser.URL, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public UrlContext(Jar_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_coordinateContext jar_coordinate() throws RecognitionException {
		Jar_coordinateContext _localctx = new Jar_coordinateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jar_coordinate);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORG:
				_localctx = new GroupidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(ORG);
				setState(159);
				match(T__0);
				setState(160);
				match(SINGLE_QUOTED_STRING);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(161);
					match(T__5);
					}
				}

				}
				break;
			case NAME:
				_localctx = new ArtifactidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(NAME);
				setState(165);
				match(T__0);
				setState(166);
				match(SINGLE_QUOTED_STRING);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(167);
					match(T__5);
					}
				}

				}
				break;
			case REV:
				_localctx = new VersionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(REV);
				setState(171);
				match(T__0);
				setState(172);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_QUOTED_STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(173);
					match(T__5);
					}
				}

				}
				break;
			case INTRANSITIVE:
				_localctx = new IntransitiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(INTRANSITIVE);
				setState(177);
				match(T__0);
				setState(178);
				match(BOOL_VALUE);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(179);
					match(T__5);
					}
				}

				}
				break;
			case FORCE:
				_localctx = new ForceableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				match(FORCE);
				setState(183);
				match(T__0);
				setState(184);
				match(BOOL_VALUE);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(185);
					match(T__5);
					}
				}

				}
				break;
			case MUTABLE:
				_localctx = new MutableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(MUTABLE);
				setState(189);
				match(T__0);
				setState(190);
				match(BOOL_VALUE);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(191);
					match(T__5);
					}
				}

				}
				break;
			case CLASSIFIER:
				_localctx = new ClassifierContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				match(CLASSIFIER);
				setState(195);
				match(T__0);
				setState(196);
				match(SINGLE_QUOTED_STRING);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(197);
					match(T__5);
					}
				}

				}
				break;
			case URL:
				_localctx = new UrlContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(200);
				match(URL);
				setState(201);
				match(T__0);
				setState(202);
				match(SINGLE_QUOTED_STRING);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(203);
					match(T__5);
					}
				}

				}
				break;
			case EXCLUDES:
				_localctx = new Exclude_jars_listContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(206);
				excludes_list();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(207);
					match(T__5);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Excludes_listContext extends ParserRuleContext {
		public TerminalNode EXCLUDES() { return getToken(JarsLibParser.EXCLUDES, 0); }
		public Exclude_entriesContext exclude_entries() {
			return getRuleContext(Exclude_entriesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Excludes_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excludes_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExcludes_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExcludes_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExcludes_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Excludes_listContext excludes_list() throws RecognitionException {
		Excludes_listContext _localctx = new Excludes_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_excludes_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(EXCLUDES);
			setState(213);
			match(T__0);
			setState(214);
			match(T__3);
			setState(215);
			exclude_entries();
			setState(216);
			match(T__4);
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(217);
				match(T__5);
				}
				break;
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(220);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclude_entriesContext extends ParserRuleContext {
		public List<Exclude_entryContext> exclude_entry() {
			return getRuleContexts(Exclude_entryContext.class);
		}
		public Exclude_entryContext exclude_entry(int i) {
			return getRuleContext(Exclude_entryContext.class,i);
		}
		public Exclude_entriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_entries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_entries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_entries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_entries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_entriesContext exclude_entries() throws RecognitionException {
		Exclude_entriesContext _localctx = new Exclude_entriesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exclude_entries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXCLUDE) {
				{
				{
				setState(223);
				exclude_entry();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclude_entryContext extends ParserRuleContext {
		public TerminalNode EXCLUDE() { return getToken(JarsLibParser.EXCLUDE, 0); }
		public Exclude_coordinatesContext exclude_coordinates() {
			return getRuleContext(Exclude_coordinatesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Exclude_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_entryContext exclude_entry() throws RecognitionException {
		Exclude_entryContext _localctx = new Exclude_entryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exclude_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(EXCLUDE);
			setState(230);
			match(T__1);
			setState(231);
			exclude_coordinates();
			setState(232);
			match(T__2);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(233);
				match(T__5);
				}
			}

			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(236);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclude_coordinatesContext extends ParserRuleContext {
		public List<Exclude_coordinateContext> exclude_coordinate() {
			return getRuleContexts(Exclude_coordinateContext.class);
		}
		public Exclude_coordinateContext exclude_coordinate(int i) {
			return getRuleContext(Exclude_coordinateContext.class,i);
		}
		public Exclude_coordinatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_coordinates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_coordinates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_coordinates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_coordinates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_coordinatesContext exclude_coordinates() throws RecognitionException {
		Exclude_coordinatesContext _localctx = new Exclude_coordinatesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exclude_coordinates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << ORG) | (1L << REV))) != 0)) {
				{
				{
				setState(239);
				exclude_coordinate();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclude_coordinateContext extends ParserRuleContext {
		public Exclude_coordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude_coordinate; }
	 
		public Exclude_coordinateContext() { }
		public void copyFrom(Exclude_coordinateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Exclude_groupidContext extends Exclude_coordinateContext {
		public TerminalNode ORG() { return getToken(JarsLibParser.ORG, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public Exclude_groupidContext(Exclude_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_groupid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_groupid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_groupid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exclude_artifactidContext extends Exclude_coordinateContext {
		public TerminalNode NAME() { return getToken(JarsLibParser.NAME, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public Exclude_artifactidContext(Exclude_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_artifactid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_artifactid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_artifactid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exclude_versionContext extends Exclude_coordinateContext {
		public TerminalNode REV() { return getToken(JarsLibParser.REV, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JarsLibParser.IDENTIFIER, 0); }
		public Exclude_versionContext(Exclude_coordinateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterExclude_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitExclude_version(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitExclude_version(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclude_coordinateContext exclude_coordinate() throws RecognitionException {
		Exclude_coordinateContext _localctx = new Exclude_coordinateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exclude_coordinate);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORG:
				_localctx = new Exclude_groupidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(ORG);
				setState(246);
				match(T__0);
				setState(247);
				match(SINGLE_QUOTED_STRING);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(248);
					match(T__5);
					}
				}

				}
				break;
			case NAME:
				_localctx = new Exclude_artifactidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(NAME);
				setState(252);
				match(T__0);
				setState(253);
				match(SINGLE_QUOTED_STRING);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(254);
					match(T__5);
					}
				}

				}
				break;
			case REV:
				_localctx = new Exclude_versionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(REV);
				setState(258);
				match(T__0);
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_QUOTED_STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(260);
					match(T__5);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_itemContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JarsLibParser.NAME, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public Name_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterName_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitName_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitName_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_itemContext name_item() throws RecognitionException {
		Name_itemContext _localctx = new Name_itemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_name_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(NAME);
			setState(266);
			match(T__0);
			setState(267);
			match(SINGLE_QUOTED_STRING);
			setState(268);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dependencies_itemContext extends ParserRuleContext {
		public TerminalNode DEPENDENCIES() { return getToken(JarsLibParser.DEPENDENCIES, 0); }
		public Dependent_listContext dependent_list() {
			return getRuleContext(Dependent_listContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Dependencies_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencies_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterDependencies_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitDependencies_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitDependencies_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependencies_itemContext dependencies_item() throws RecognitionException {
		Dependencies_itemContext _localctx = new Dependencies_itemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dependencies_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(DEPENDENCIES);
			setState(271);
			match(T__0);
			setState(272);
			match(T__3);
			setState(273);
			dependent_list();
			setState(274);
			match(T__4);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(275);
				match(T__5);
				}
			}

			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(278);
				match(NEWLINE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dependent_listContext extends ParserRuleContext {
		public List<Dependent_entryContext> dependent_entry() {
			return getRuleContexts(Dependent_entryContext.class);
		}
		public Dependent_entryContext dependent_entry(int i) {
			return getRuleContext(Dependent_entryContext.class,i);
		}
		public Dependent_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependent_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterDependent_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitDependent_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitDependent_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependent_listContext dependent_list() throws RecognitionException {
		Dependent_listContext _localctx = new Dependent_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dependent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_QUOTED_STRING) {
				{
				{
				setState(281);
				dependent_entry();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dependent_entryContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(JarsLibParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(JarsLibParser.NEWLINE, 0); }
		public Dependent_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependent_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).enterDependent_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JarsLibListener ) ((JarsLibListener)listener).exitDependent_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarsLibVisitor ) return ((JarsLibVisitor<? extends T>)visitor).visitDependent_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependent_entryContext dependent_entry() throws RecognitionException {
		Dependent_entryContext _localctx = new Dependent_entryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dependent_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(SINGLE_QUOTED_STRING);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(288);
				match(T__5);
				}
			}

			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(291);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0129\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\5\3;\n\3\7\3=\n\3\f\3\16\3@\13\3"+
		"\3\4\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\5\7T\n\7\7\7V\n\7\f\7\16\7Y\13\7\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\5\nf\n\n\7\nh\n\n\f\n\16\nk\13\n\3\13\3\13\3\13\5\13p\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\fx\n\f\3\f\5\f{\n\f\3\r\7\r~\n\r\f\r\16\r\u0081"+
		"\13\r\3\16\3\16\5\16\u0085\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u008c\n"+
		"\17\3\17\5\17\u008f\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0096\n\20\3\20"+
		"\5\20\u0099\n\20\3\21\7\21\u009c\n\21\f\21\16\21\u009f\13\21\3\22\3\22"+
		"\3\22\3\22\5\22\u00a5\n\22\3\22\3\22\3\22\3\22\5\22\u00ab\n\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00b1\n\22\3\22\3\22\3\22\3\22\5\22\u00b7\n\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00bd\n\22\3\22\3\22\3\22\3\22\5\22\u00c3\n\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00c9\n\22\3\22\3\22\3\22\3\22\5\22\u00cf\n\22"+
		"\3\22\3\22\5\22\u00d3\n\22\5\22\u00d5\n\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u00dd\n\23\3\23\5\23\u00e0\n\23\3\24\7\24\u00e3\n\24\f\24\16"+
		"\24\u00e6\13\24\3\25\3\25\3\25\3\25\3\25\5\25\u00ed\n\25\3\25\5\25\u00f0"+
		"\n\25\3\26\7\26\u00f3\n\26\f\26\16\26\u00f6\13\26\3\27\3\27\3\27\3\27"+
		"\5\27\u00fc\n\27\3\27\3\27\3\27\3\27\5\27\u0102\n\27\3\27\3\27\3\27\3"+
		"\27\5\27\u0108\n\27\5\27\u010a\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0117\n\31\3\31\5\31\u011a\n\31\3\32\7\32\u011d"+
		"\n\32\f\32\16\32\u0120\13\32\3\33\3\33\5\33\u0124\n\33\3\33\5\33\u0127"+
		"\n\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\2\3\4\2\32\32\34\34\2\u0144\2\66\3\2\2\2\4>\3\2\2\2\6D\3\2\2\2\bF"+
		"\3\2\2\2\nL\3\2\2\2\fW\3\2\2\2\16\\\3\2\2\2\20^\3\2\2\2\22i\3\2\2\2\24"+
		"o\3\2\2\2\26q\3\2\2\2\30\177\3\2\2\2\32\u0084\3\2\2\2\34\u0086\3\2\2\2"+
		"\36\u0090\3\2\2\2 \u009d\3\2\2\2\"\u00d4\3\2\2\2$\u00d6\3\2\2\2&\u00e4"+
		"\3\2\2\2(\u00e7\3\2\2\2*\u00f4\3\2\2\2,\u0109\3\2\2\2.\u010b\3\2\2\2\60"+
		"\u0110\3\2\2\2\62\u011e\3\2\2\2\64\u0121\3\2\2\2\66\67\5\4\3\2\67\3\3"+
		"\2\2\28:\5\6\4\29;\7\33\2\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<8\3\2\2\2=@"+
		"\3\2\2\2><\3\2\2\2>?\3\2\2\2?\5\3\2\2\2@>\3\2\2\2AE\5\b\5\2BE\5\20\t\2"+
		"CE\5\n\6\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\7\3\2\2\2FG\7\34\2\2GH\7\3\2"+
		"\2HJ\7\32\2\2IK\7\33\2\2JI\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LM\7\f\2\2MN\7"+
		"\4\2\2NO\5\f\7\2OP\7\5\2\2P\13\3\2\2\2QS\5\16\b\2RT\7\33\2\2SR\3\2\2\2"+
		"ST\3\2\2\2TV\3\2\2\2UQ\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2"+
		"\2YW\3\2\2\2Z]\5.\30\2[]\5\60\31\2\\Z\3\2\2\2\\[\3\2\2\2]\17\3\2\2\2^"+
		"_\7\r\2\2_`\7\4\2\2`a\5\22\n\2ab\7\5\2\2b\21\3\2\2\2ce\5\24\13\2df\7\33"+
		"\2\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gc\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2j\23\3\2\2\2ki\3\2\2\2lp\5.\30\2mp\5\60\31\2np\5\26\f\2ol\3\2\2\2"+
		"om\3\2\2\2on\3\2\2\2p\25\3\2\2\2qr\7\16\2\2rs\7\3\2\2st\7\6\2\2tu\5\30"+
		"\r\2uw\7\7\2\2vx\7\b\2\2wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2y{\7\33\2\2zy\3"+
		"\2\2\2z{\3\2\2\2{\27\3\2\2\2|~\5\32\16\2}|\3\2\2\2~\u0081\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\31\3\2\2\2\u0081\177\3\2\2\2\u0082\u0085"+
		"\5\34\17\2\u0083\u0085\5\36\20\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2"+
		"\2\u0085\33\3\2\2\2\u0086\u0087\7\17\2\2\u0087\u0088\7\4\2\2\u0088\u0089"+
		"\5 \21\2\u0089\u008b\7\5\2\2\u008a\u008c\7\b\2\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\7\33\2\2\u008e\u008d\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\35\3\2\2\2\u0090\u0091\7\20\2\2\u0091"+
		"\u0092\7\4\2\2\u0092\u0093\5 \21\2\u0093\u0095\7\5\2\2\u0094\u0096\7\b"+
		"\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0099\7\33\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\37\3\2\2"+
		"\2\u009a\u009c\5\"\22\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e!\3\2\2\2\u009f\u009d\3\2\2\2"+
		"\u00a0\u00a1\7\22\2\2\u00a1\u00a2\7\3\2\2\u00a2\u00a4\7\32\2\2\u00a3\u00a5"+
		"\7\b\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00d5\3\2\2\2\u00a6"+
		"\u00a7\7\21\2\2\u00a7\u00a8\7\3\2\2\u00a8\u00aa\7\32\2\2\u00a9\u00ab\7"+
		"\b\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00d5\3\2\2\2\u00ac"+
		"\u00ad\7\23\2\2\u00ad\u00ae\7\3\2\2\u00ae\u00b0\t\2\2\2\u00af\u00b1\7"+
		"\b\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00d5\3\2\2\2\u00b2"+
		"\u00b3\7\24\2\2\u00b3\u00b4\7\3\2\2\u00b4\u00b6\7\31\2\2\u00b5\u00b7\7"+
		"\b\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00d5\3\2\2\2\u00b8"+
		"\u00b9\7\27\2\2\u00b9\u00ba\7\3\2\2\u00ba\u00bc\7\31\2\2\u00bb\u00bd\7"+
		"\b\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00d5\3\2\2\2\u00be"+
		"\u00bf\7\13\2\2\u00bf\u00c0\7\3\2\2\u00c0\u00c2\7\31\2\2\u00c1\u00c3\7"+
		"\b\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00d5\3\2\2\2\u00c4"+
		"\u00c5\7\t\2\2\u00c5\u00c6\7\3\2\2\u00c6\u00c8\7\32\2\2\u00c7\u00c9\7"+
		"\b\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d5\3\2\2\2\u00ca"+
		"\u00cb\7\n\2\2\u00cb\u00cc\7\3\2\2\u00cc\u00ce\7\32\2\2\u00cd\u00cf\7"+
		"\b\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d5\3\2\2\2\u00d0"+
		"\u00d2\5$\23\2\u00d1\u00d3\7\b\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00a0\3\2\2\2\u00d4\u00a6\3\2\2\2\u00d4"+
		"\u00ac\3\2\2\2\u00d4\u00b2\3\2\2\2\u00d4\u00b8\3\2\2\2\u00d4\u00be\3\2"+
		"\2\2\u00d4\u00c4\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5"+
		"#\3\2\2\2\u00d6\u00d7\7\25\2\2\u00d7\u00d8\7\3\2\2\u00d8\u00d9\7\6\2\2"+
		"\u00d9\u00da\5&\24\2\u00da\u00dc\7\7\2\2\u00db\u00dd\7\b\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00e0\7\33\2\2"+
		"\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0%\3\2\2\2\u00e1\u00e3\5"+
		"(\25\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\'\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\26\2"+
		"\2\u00e8\u00e9\7\4\2\2\u00e9\u00ea\5*\26\2\u00ea\u00ec\7\5\2\2\u00eb\u00ed"+
		"\7\b\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00f0\7\33\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0)\3\2\2\2"+
		"\u00f1\u00f3\5,\27\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5+\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f8\7\22\2\2\u00f8\u00f9\7\3\2\2\u00f9\u00fb\7\32\2\2\u00fa\u00fc\7"+
		"\b\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u010a\3\2\2\2\u00fd"+
		"\u00fe\7\21\2\2\u00fe\u00ff\7\3\2\2\u00ff\u0101\7\32\2\2\u0100\u0102\7"+
		"\b\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u010a\3\2\2\2\u0103"+
		"\u0104\7\23\2\2\u0104\u0105\7\3\2\2\u0105\u0107\t\2\2\2\u0106\u0108\7"+
		"\b\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u00f7\3\2\2\2\u0109\u00fd\3\2\2\2\u0109\u0103\3\2\2\2\u010a-\3\2\2\2"+
		"\u010b\u010c\7\21\2\2\u010c\u010d\7\3\2\2\u010d\u010e\7\32\2\2\u010e\u010f"+
		"\7\b\2\2\u010f/\3\2\2\2\u0110\u0111\7\30\2\2\u0111\u0112\7\3\2\2\u0112"+
		"\u0113\7\6\2\2\u0113\u0114\5\62\32\2\u0114\u0116\7\7\2\2\u0115\u0117\7"+
		"\b\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u011a\7\33\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\61\3\2\2"+
		"\2\u011b\u011d\5\64\33\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\63\3\2\2\2\u0120\u011e\3\2\2"+
		"\2\u0121\u0123\7\32\2\2\u0122\u0124\7\b\2\2\u0123\u0122\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0127\7\33\2\2\u0126\u0125\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\65\3\2\2\2.:>DJSW\\eiowz\177\u0084\u008b"+
		"\u008e\u0095\u0098\u009d\u00a4\u00aa\u00b0\u00b6\u00bc\u00c2\u00c8\u00ce"+
		"\u00d2\u00d4\u00dc\u00df\u00e4\u00ec\u00ef\u00f4\u00fb\u0101\u0107\u0109"+
		"\u0116\u0119\u011e\u0123\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}