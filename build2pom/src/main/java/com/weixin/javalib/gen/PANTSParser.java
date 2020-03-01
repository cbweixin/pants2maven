// Generated from /Users/xinwei/Documents/weixin/github/BUILD2pom/build2pom/src/main/java/com/weixin/grammar/PANTS.g4 by ANTLR 4.8
package com.weixin.javalib.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PANTSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, JAVA_LIBRARY=9, 
		JVM_LIBRARY=10, SOURCES=11, GLOBS=12, MAIN=13, STRICTDEPS=14, TAGS=15, 
		DOUBLE_QUOTED_STRING=16, JAR_LIBRARY=17, JARS=18, JAR=19, SCALA_JAR=20, 
		NAME=21, ORG=22, REV=23, INTRANSITIVE=24, EXCLUDES=25, EXCLUDE=26, FORCE=27, 
		DEPENDENCIES=28, BOOL_VALUE=29, SINGLE_QUOTED_STRING=30, NEWLINE=31, IDENTIFIER=32, 
		WS=33;
	public static final int
		RULE_pants = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_java_lib_stmt = 3, 
		RULE_jvm_lib_stmt = 4, RULE_lib_item_list = 5, RULE_lib_item = 6, RULE_name_item = 7, 
		RULE_dependencies_item = 8, RULE_dependent_list = 9, RULE_dependent_entry = 10, 
		RULE_sources_item = 11, RULE_strict_deps = 12, RULE_tags = 13, RULE_main_item = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"pants", "stmt_list", "stmt", "java_lib_stmt", "jvm_lib_stmt", "lib_item_list", 
			"lib_item", "name_item", "dependencies_item", "dependent_list", "dependent_entry", 
			"sources_item", "strict_deps", "tags", "main_item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "','", "'['", "']'", "'{'", "'}'", "'java_library'", 
			"'jvm_binary'", "'sources'", "'globs'", "'main'", "'strict_deps'", "'tags'", 
			null, "'jar_library'", "'jars'", "'jar'", "'scala_jar'", "'name'", "'org'", 
			"'rev'", "'intransitive'", "'excludes'", "'exclude'", "'force'", "'dependencies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "JAVA_LIBRARY", 
			"JVM_LIBRARY", "SOURCES", "GLOBS", "MAIN", "STRICTDEPS", "TAGS", "DOUBLE_QUOTED_STRING", 
			"JAR_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "INTRANSITIVE", 
			"EXCLUDES", "EXCLUDE", "FORCE", "DEPENDENCIES", "BOOL_VALUE", "SINGLE_QUOTED_STRING", 
			"NEWLINE", "IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "PANTS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PANTSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PantsContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public PantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterPants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitPants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitPants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PantsContext pants() throws RecognitionException {
		PantsContext _localctx = new PantsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
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
		public List<TerminalNode> NEWLINE() { return getTokens(PANTSParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PANTSParser.NEWLINE, i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitStmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitStmt_list(this);
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JAVA_LIBRARY || _la==JVM_LIBRARY) {
				{
				{
				setState(32);
				stmt();
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(33);
					match(NEWLINE);
					}
				}

				}
				}
				setState(40);
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
		public Java_lib_stmtContext java_lib_stmt() {
			return getRuleContext(Java_lib_stmtContext.class,0);
		}
		public Jvm_lib_stmtContext jvm_lib_stmt() {
			return getRuleContext(Jvm_lib_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA_LIBRARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				java_lib_stmt();
				}
				break;
			case JVM_LIBRARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				jvm_lib_stmt();
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

	public static class Java_lib_stmtContext extends ParserRuleContext {
		public TerminalNode JAVA_LIBRARY() { return getToken(PANTSParser.JAVA_LIBRARY, 0); }
		public Lib_item_listContext lib_item_list() {
			return getRuleContext(Lib_item_listContext.class,0);
		}
		public Java_lib_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_lib_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJava_lib_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJava_lib_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJava_lib_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_lib_stmtContext java_lib_stmt() throws RecognitionException {
		Java_lib_stmtContext _localctx = new Java_lib_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_java_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(JAVA_LIBRARY);
			setState(46);
			match(T__0);
			setState(47);
			lib_item_list();
			setState(48);
			match(T__1);
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

	public static class Jvm_lib_stmtContext extends ParserRuleContext {
		public TerminalNode JVM_LIBRARY() { return getToken(PANTSParser.JVM_LIBRARY, 0); }
		public Lib_item_listContext lib_item_list() {
			return getRuleContext(Lib_item_listContext.class,0);
		}
		public Jvm_lib_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jvm_lib_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterJvm_lib_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitJvm_lib_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitJvm_lib_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jvm_lib_stmtContext jvm_lib_stmt() throws RecognitionException {
		Jvm_lib_stmtContext _localctx = new Jvm_lib_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jvm_lib_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(JVM_LIBRARY);
			setState(51);
			match(T__0);
			setState(52);
			lib_item_list();
			setState(53);
			match(T__1);
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

	public static class Lib_item_listContext extends ParserRuleContext {
		public List<Lib_itemContext> lib_item() {
			return getRuleContexts(Lib_itemContext.class);
		}
		public Lib_itemContext lib_item(int i) {
			return getRuleContext(Lib_itemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PANTSParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PANTSParser.NEWLINE, i);
		}
		public Lib_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lib_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterLib_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitLib_item_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitLib_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lib_item_listContext lib_item_list() throws RecognitionException {
		Lib_item_listContext _localctx = new Lib_item_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lib_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOURCES) | (1L << MAIN) | (1L << STRICTDEPS) | (1L << TAGS) | (1L << NAME) | (1L << DEPENDENCIES))) != 0)) {
				{
				{
				setState(55);
				lib_item();
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(56);
					match(NEWLINE);
					}
				}

				}
				}
				setState(63);
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

	public static class Lib_itemContext extends ParserRuleContext {
		public Name_itemContext name_item() {
			return getRuleContext(Name_itemContext.class,0);
		}
		public Dependencies_itemContext dependencies_item() {
			return getRuleContext(Dependencies_itemContext.class,0);
		}
		public Sources_itemContext sources_item() {
			return getRuleContext(Sources_itemContext.class,0);
		}
		public Strict_depsContext strict_deps() {
			return getRuleContext(Strict_depsContext.class,0);
		}
		public Main_itemContext main_item() {
			return getRuleContext(Main_itemContext.class,0);
		}
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public Lib_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lib_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterLib_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitLib_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitLib_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lib_itemContext lib_item() throws RecognitionException {
		Lib_itemContext _localctx = new Lib_itemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lib_item);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				name_item();
				}
				break;
			case DEPENDENCIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				dependencies_item();
				}
				break;
			case SOURCES:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				sources_item();
				}
				break;
			case STRICTDEPS:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				strict_deps();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				main_item();
				}
				break;
			case TAGS:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				tags();
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
		public TerminalNode NAME() { return getToken(PANTSParser.NAME, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(PANTSParser.SINGLE_QUOTED_STRING, 0); }
		public Name_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterName_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitName_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitName_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_itemContext name_item() throws RecognitionException {
		Name_itemContext _localctx = new Name_itemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_name_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(NAME);
			setState(73);
			match(T__2);
			setState(74);
			match(SINGLE_QUOTED_STRING);
			setState(75);
			match(T__3);
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
		public TerminalNode DEPENDENCIES() { return getToken(PANTSParser.DEPENDENCIES, 0); }
		public Dependent_listContext dependent_list() {
			return getRuleContext(Dependent_listContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PANTSParser.NEWLINE, 0); }
		public Dependencies_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencies_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterDependencies_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitDependencies_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitDependencies_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependencies_itemContext dependencies_item() throws RecognitionException {
		Dependencies_itemContext _localctx = new Dependencies_itemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dependencies_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(DEPENDENCIES);
			setState(78);
			match(T__2);
			setState(79);
			match(T__4);
			setState(80);
			dependent_list();
			setState(81);
			match(T__5);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(82);
				match(T__3);
				}
			}

			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(85);
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
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterDependent_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitDependent_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitDependent_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependent_listContext dependent_list() throws RecognitionException {
		Dependent_listContext _localctx = new Dependent_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dependent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_QUOTED_STRING) {
				{
				{
				setState(88);
				dependent_entry();
				}
				}
				setState(93);
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
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(PANTSParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(PANTSParser.NEWLINE, 0); }
		public Dependent_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependent_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterDependent_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitDependent_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitDependent_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependent_entryContext dependent_entry() throws RecognitionException {
		Dependent_entryContext _localctx = new Dependent_entryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dependent_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(SINGLE_QUOTED_STRING);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(95);
				match(T__3);
				}
			}

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

	public static class Sources_itemContext extends ParserRuleContext {
		public TerminalNode SOURCES() { return getToken(PANTSParser.SOURCES, 0); }
		public TerminalNode GLOBS() { return getToken(PANTSParser.GLOBS, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(PANTSParser.SINGLE_QUOTED_STRING, 0); }
		public Sources_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sources_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterSources_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitSources_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitSources_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sources_itemContext sources_item() throws RecognitionException {
		Sources_itemContext _localctx = new Sources_itemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sources_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(SOURCES);
			setState(102);
			match(T__2);
			setState(103);
			match(GLOBS);
			setState(104);
			match(T__0);
			setState(105);
			match(SINGLE_QUOTED_STRING);
			setState(106);
			match(T__1);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(107);
				match(T__3);
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

	public static class Strict_depsContext extends ParserRuleContext {
		public TerminalNode STRICTDEPS() { return getToken(PANTSParser.STRICTDEPS, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(PANTSParser.BOOL_VALUE, 0); }
		public Strict_depsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strict_deps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterStrict_deps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitStrict_deps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitStrict_deps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Strict_depsContext strict_deps() throws RecognitionException {
		Strict_depsContext _localctx = new Strict_depsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_strict_deps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(STRICTDEPS);
			setState(111);
			match(T__2);
			setState(112);
			match(BOOL_VALUE);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(113);
				match(T__3);
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

	public static class TagsContext extends ParserRuleContext {
		public TerminalNode TAGS() { return getToken(PANTSParser.TAGS, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(PANTSParser.SINGLE_QUOTED_STRING, 0); }
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitTags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(TAGS);
			setState(117);
			match(T__2);
			setState(118);
			match(T__6);
			setState(119);
			match(SINGLE_QUOTED_STRING);
			setState(120);
			match(T__7);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(121);
				match(T__3);
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

	public static class Main_itemContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(PANTSParser.MAIN, 0); }
		public TerminalNode DOUBLE_QUOTED_STRING() { return getToken(PANTSParser.DOUBLE_QUOTED_STRING, 0); }
		public Main_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).enterMain_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PANTSListener ) ((PANTSListener)listener).exitMain_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PANTSVisitor ) return ((PANTSVisitor<? extends T>)visitor).visitMain_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_itemContext main_item() throws RecognitionException {
		Main_itemContext _localctx = new Main_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_main_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(MAIN);
			setState(125);
			match(T__2);
			setState(126);
			match(DOUBLE_QUOTED_STRING);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(127);
				match(T__3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0085\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\5\3"+
		"%\n\3\7\3\'\n\3\f\3\16\3*\13\3\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7<\n\7\7\7>\n\7\f\7\16\7A\13\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bI\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\nV\n\n\3\n\5\nY\n\n\3\13\7\13\\\n\13\f\13\16\13_\13\13\3\f\3\f\5\fc\n"+
		"\f\3\f\5\ff\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\ro\n\r\3\16\3\16\3\16\3"+
		"\16\5\16u\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17}\n\17\3\20\3\20\3\20"+
		"\3\20\5\20\u0083\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\2\2\u0088\2 \3\2\2\2\4(\3\2\2\2\6-\3\2\2\2\b/\3\2\2\2\n\64\3\2\2"+
		"\2\f?\3\2\2\2\16H\3\2\2\2\20J\3\2\2\2\22O\3\2\2\2\24]\3\2\2\2\26`\3\2"+
		"\2\2\30g\3\2\2\2\32p\3\2\2\2\34v\3\2\2\2\36~\3\2\2\2 !\5\4\3\2!\3\3\2"+
		"\2\2\"$\5\6\4\2#%\7!\2\2$#\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&\"\3\2\2\2\'*"+
		"\3\2\2\2(&\3\2\2\2()\3\2\2\2)\5\3\2\2\2*(\3\2\2\2+.\5\b\5\2,.\5\n\6\2"+
		"-+\3\2\2\2-,\3\2\2\2.\7\3\2\2\2/\60\7\13\2\2\60\61\7\3\2\2\61\62\5\f\7"+
		"\2\62\63\7\4\2\2\63\t\3\2\2\2\64\65\7\f\2\2\65\66\7\3\2\2\66\67\5\f\7"+
		"\2\678\7\4\2\28\13\3\2\2\29;\5\16\b\2:<\7!\2\2;:\3\2\2\2;<\3\2\2\2<>\3"+
		"\2\2\2=9\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\r\3\2\2\2A?\3\2\2\2BI"+
		"\5\20\t\2CI\5\22\n\2DI\5\30\r\2EI\5\32\16\2FI\5\36\20\2GI\5\34\17\2HB"+
		"\3\2\2\2HC\3\2\2\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\17\3\2\2\2"+
		"JK\7\27\2\2KL\7\5\2\2LM\7 \2\2MN\7\6\2\2N\21\3\2\2\2OP\7\36\2\2PQ\7\5"+
		"\2\2QR\7\7\2\2RS\5\24\13\2SU\7\b\2\2TV\7\6\2\2UT\3\2\2\2UV\3\2\2\2VX\3"+
		"\2\2\2WY\7!\2\2XW\3\2\2\2XY\3\2\2\2Y\23\3\2\2\2Z\\\5\26\f\2[Z\3\2\2\2"+
		"\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\25\3\2\2\2_]\3\2\2\2`b\7 \2\2ac\7\6\2"+
		"\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\7!\2\2ed\3\2\2\2ef\3\2\2\2f\27\3\2"+
		"\2\2gh\7\r\2\2hi\7\5\2\2ij\7\16\2\2jk\7\3\2\2kl\7 \2\2ln\7\4\2\2mo\7\6"+
		"\2\2nm\3\2\2\2no\3\2\2\2o\31\3\2\2\2pq\7\20\2\2qr\7\5\2\2rt\7\37\2\2s"+
		"u\7\6\2\2ts\3\2\2\2tu\3\2\2\2u\33\3\2\2\2vw\7\21\2\2wx\7\5\2\2xy\7\t\2"+
		"\2yz\7 \2\2z|\7\n\2\2{}\7\6\2\2|{\3\2\2\2|}\3\2\2\2}\35\3\2\2\2~\177\7"+
		"\17\2\2\177\u0080\7\5\2\2\u0080\u0082\7\22\2\2\u0081\u0083\7\6\2\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\37\3\2\2\2\21$(-;?HUX]bent|\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}