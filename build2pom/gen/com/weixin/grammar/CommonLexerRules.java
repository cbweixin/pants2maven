// Generated from /Users/xinwei/Documents/weixin/github/BUILD2pom/build2pom/src/main/java/com/weixin/grammar/CommonLexerRules.g4 by ANTLR 4.8
package com.weixin.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonLexerRules extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JAR_LIBRARY=1, JARS=2, JAR=3, SCALA_JAR=4, NAME=5, ORG=6, REV=7, INTRANSITIVE=8, 
		EXCLUDES=9, EXCLUDE=10, FORCE=11, DEPENDENCIES=12, BOOL_VALUE=13, SINGLE_QUOTED_STRING=14, 
		NEWLINE=15, IDENTIFIER=16, WS=17, LINE_COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"JAR_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "INTRANSITIVE", 
			"EXCLUDES", "EXCLUDE", "FORCE", "DEPENDENCIES", "BOOL_VALUE", "SINGLE_QUOTED_STRING", 
			"NEWLINE", "IDENTIFIER", "ESC", "UNICODE", "HEX", "LetterOrDigit", "Letter", 
			"WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'jar_library'", "'jars'", "'jar'", "'scala_jar'", "'name'", "'org'", 
			"'rev'", "'intransitive'", "'excludes'", "'exclude'", "'force'", "'dependencies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "JAR_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", 
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


	public CommonLexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommonLexerRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0098\n\16\3\17\3\17\3\17\7\17\u009d\n\17\f\17\16\17\u00a0\13\17"+
		"\3\17\3\17\3\20\5\20\u00a5\n\20\3\20\3\20\3\21\3\21\7\21\u00ab\n\21\f"+
		"\21\16\21\u00ae\13\21\3\22\3\22\3\22\5\22\u00b3\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u00bf\n\25\3\26\3\26\3\27\6\27"+
		"\u00c4\n\27\r\27\16\27\u00c5\3\27\3\27\3\30\3\30\7\30\u00cc\n\30\f\30"+
		"\16\30\u00cf\13\30\3\30\5\30\u00d2\n\30\3\30\3\30\3\30\3\30\4\u009e\u00cd"+
		"\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\2%\2\'\2)\2+\2-\23/\24\3\2\b\4\2$$^^\n\2$$\61\61^^ddhh"+
		"ppttvv\5\2\62;CHch\3\2\62;\6\2&&C\\aac|\5\2\13\f\17\17\"\"\2\u00db\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\3\61\3\2\2\2\5=\3\2\2\2\7B\3\2\2\2\tF\3\2\2\2\13P\3\2\2\2"+
		"\rU\3\2\2\2\17Y\3\2\2\2\21]\3\2\2\2\23j\3\2\2\2\25s\3\2\2\2\27{\3\2\2"+
		"\2\31\u0081\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2\2\37\u00a4\3\2\2\2"+
		"!\u00a8\3\2\2\2#\u00af\3\2\2\2%\u00b4\3\2\2\2\'\u00ba\3\2\2\2)\u00be\3"+
		"\2\2\2+\u00c0\3\2\2\2-\u00c3\3\2\2\2/\u00c9\3\2\2\2\61\62\7l\2\2\62\63"+
		"\7c\2\2\63\64\7t\2\2\64\65\7a\2\2\65\66\7n\2\2\66\67\7k\2\2\678\7d\2\2"+
		"89\7t\2\29:\7c\2\2:;\7t\2\2;<\7{\2\2<\4\3\2\2\2=>\7l\2\2>?\7c\2\2?@\7"+
		"t\2\2@A\7u\2\2A\6\3\2\2\2BC\7l\2\2CD\7c\2\2DE\7t\2\2E\b\3\2\2\2FG\7u\2"+
		"\2GH\7e\2\2HI\7c\2\2IJ\7n\2\2JK\7c\2\2KL\7a\2\2LM\7l\2\2MN\7c\2\2NO\7"+
		"t\2\2O\n\3\2\2\2PQ\7p\2\2QR\7c\2\2RS\7o\2\2ST\7g\2\2T\f\3\2\2\2UV\7q\2"+
		"\2VW\7t\2\2WX\7i\2\2X\16\3\2\2\2YZ\7t\2\2Z[\7g\2\2[\\\7x\2\2\\\20\3\2"+
		"\2\2]^\7k\2\2^_\7p\2\2_`\7v\2\2`a\7t\2\2ab\7c\2\2bc\7p\2\2cd\7u\2\2de"+
		"\7k\2\2ef\7v\2\2fg\7k\2\2gh\7x\2\2hi\7g\2\2i\22\3\2\2\2jk\7g\2\2kl\7z"+
		"\2\2lm\7e\2\2mn\7n\2\2no\7w\2\2op\7f\2\2pq\7g\2\2qr\7u\2\2r\24\3\2\2\2"+
		"st\7g\2\2tu\7z\2\2uv\7e\2\2vw\7n\2\2wx\7w\2\2xy\7f\2\2yz\7g\2\2z\26\3"+
		"\2\2\2{|\7h\2\2|}\7q\2\2}~\7t\2\2~\177\7e\2\2\177\u0080\7g\2\2\u0080\30"+
		"\3\2\2\2\u0081\u0082\7f\2\2\u0082\u0083\7g\2\2\u0083\u0084\7r\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7p\2\2\u0086\u0087\7f\2\2\u0087\u0088\7g\2\2"+
		"\u0088\u0089\7p\2\2\u0089\u008a\7e\2\2\u008a\u008b\7k\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7u\2\2\u008d\32\3\2\2\2\u008e\u008f\7V\2\2\u008f\u0090"+
		"\7t\2\2\u0090\u0091\7w\2\2\u0091\u0098\7g\2\2\u0092\u0093\7H\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7n\2\2\u0095\u0096\7u\2\2\u0096\u0098\7g\2\2"+
		"\u0097\u008e\3\2\2\2\u0097\u0092\3\2\2\2\u0098\34\3\2\2\2\u0099\u009e"+
		"\7)\2\2\u009a\u009d\5#\22\2\u009b\u009d\n\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7)\2\2\u00a2"+
		"\36\3\2\2\2\u00a3\u00a5\7\17\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2"+
		"\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\f\2\2\u00a7 \3\2\2\2\u00a8\u00ac"+
		"\5+\26\2\u00a9\u00ab\5)\25\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\"\3\2\2\2\u00ae\u00ac\3\2\2\2"+
		"\u00af\u00b2\7^\2\2\u00b0\u00b3\t\3\2\2\u00b1\u00b3\5%\23\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6"+
		"\5\'\24\2\u00b6\u00b7\5\'\24\2\u00b7\u00b8\5\'\24\2\u00b8\u00b9\5\'\24"+
		"\2\u00b9&\3\2\2\2\u00ba\u00bb\t\4\2\2\u00bb(\3\2\2\2\u00bc\u00bf\5+\26"+
		"\2\u00bd\u00bf\t\5\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf*"+
		"\3\2\2\2\u00c0\u00c1\t\6\2\2\u00c1,\3\2\2\2\u00c2\u00c4\t\7\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\27\2\2\u00c8.\3\2\2\2\u00c9\u00cd"+
		"\7%\2\2\u00ca\u00cc\13\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00d2\7\17\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\7\f\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\30"+
		"\2\2\u00d6\60\3\2\2\2\r\2\u0097\u009c\u009e\u00a4\u00ac\u00b2\u00be\u00c5"+
		"\u00cd\u00d1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}