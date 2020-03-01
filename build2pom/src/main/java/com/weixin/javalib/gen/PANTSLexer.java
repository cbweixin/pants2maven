// Generated from /Users/xinwei/Documents/weixin/github/BUILD2pom/build2pom/src/main/java/com/weixin/grammar/PANTS.g4 by ANTLR 4.8
package com.weixin.javalib.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PANTSLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "JAVA_LIBRARY", 
			"JVM_LIBRARY", "SOURCES", "GLOBS", "MAIN", "STRICTDEPS", "TAGS", "DOUBLE_QUOTED_STRING", 
			"JAR_LIBRARY", "JARS", "JAR", "SCALA_JAR", "NAME", "ORG", "REV", "INTRANSITIVE", 
			"EXCLUDES", "EXCLUDE", "FORCE", "DEPENDENCIES", "BOOL_VALUE", "SINGLE_QUOTED_STRING", 
			"NEWLINE", "IDENTIFIER", "ESC", "UNICODE", "HEX", "LetterOrDigit", "Letter", 
			"WS"
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


	public PANTSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PANTS.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0140\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u009f\n\21\3\21\7\21"+
		"\u00a2\n\21\f\21\16\21\u00a5\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u010f\n\36\3\37\3\37\3\37\7\37\u0114\n\37\f\37\16\37\u0117\13\37\3\37"+
		"\3\37\3 \5 \u011c\n \3 \3 \3!\3!\7!\u0122\n!\f!\16!\u0125\13!\3\"\3\""+
		"\3\"\5\"\u012a\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\5%\u0136\n%\3&\3&\3\'"+
		"\6\'\u013b\n\'\r\'\16\'\u013c\3\'\3\'\4\u00a3\u0115\2(\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C\2E\2G\2"+
		"I\2K\2M#\3\2\b\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\62;\6\2"+
		"&&C\\aac|\5\2\13\f\17\17\"\"\2\u0144\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2"+
		"\2\rY\3\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25l\3\2\2\2\27w\3\2"+
		"\2\2\31\177\3\2\2\2\33\u0085\3\2\2\2\35\u008a\3\2\2\2\37\u0096\3\2\2\2"+
		"!\u009b\3\2\2\2#\u00a8\3\2\2\2%\u00b4\3\2\2\2\'\u00b9\3\2\2\2)\u00bd\3"+
		"\2\2\2+\u00c7\3\2\2\2-\u00cc\3\2\2\2/\u00d0\3\2\2\2\61\u00d4\3\2\2\2\63"+
		"\u00e1\3\2\2\2\65\u00ea\3\2\2\2\67\u00f2\3\2\2\29\u00f8\3\2\2\2;\u010e"+
		"\3\2\2\2=\u0110\3\2\2\2?\u011b\3\2\2\2A\u011f\3\2\2\2C\u0126\3\2\2\2E"+
		"\u012b\3\2\2\2G\u0131\3\2\2\2I\u0135\3\2\2\2K\u0137\3\2\2\2M\u013a\3\2"+
		"\2\2OP\7*\2\2P\4\3\2\2\2QR\7+\2\2R\6\3\2\2\2ST\7?\2\2T\b\3\2\2\2UV\7."+
		"\2\2V\n\3\2\2\2WX\7]\2\2X\f\3\2\2\2YZ\7_\2\2Z\16\3\2\2\2[\\\7}\2\2\\\20"+
		"\3\2\2\2]^\7\177\2\2^\22\3\2\2\2_`\7l\2\2`a\7c\2\2ab\7x\2\2bc\7c\2\2c"+
		"d\7a\2\2de\7n\2\2ef\7k\2\2fg\7d\2\2gh\7t\2\2hi\7c\2\2ij\7t\2\2jk\7{\2"+
		"\2k\24\3\2\2\2lm\7l\2\2mn\7x\2\2no\7o\2\2op\7a\2\2pq\7d\2\2qr\7k\2\2r"+
		"s\7p\2\2st\7c\2\2tu\7t\2\2uv\7{\2\2v\26\3\2\2\2wx\7u\2\2xy\7q\2\2yz\7"+
		"w\2\2z{\7t\2\2{|\7e\2\2|}\7g\2\2}~\7u\2\2~\30\3\2\2\2\177\u0080\7i\2\2"+
		"\u0080\u0081\7n\2\2\u0081\u0082\7q\2\2\u0082\u0083\7d\2\2\u0083\u0084"+
		"\7u\2\2\u0084\32\3\2\2\2\u0085\u0086\7o\2\2\u0086\u0087\7c\2\2\u0087\u0088"+
		"\7k\2\2\u0088\u0089\7p\2\2\u0089\34\3\2\2\2\u008a\u008b\7u\2\2\u008b\u008c"+
		"\7v\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e\u008f\7e\2\2\u008f"+
		"\u0090\7v\2\2\u0090\u0091\7a\2\2\u0091\u0092\7f\2\2\u0092\u0093\7g\2\2"+
		"\u0093\u0094\7r\2\2\u0094\u0095\7u\2\2\u0095\36\3\2\2\2\u0096\u0097\7"+
		"v\2\2\u0097\u0098\7c\2\2\u0098\u0099\7i\2\2\u0099\u009a\7u\2\2\u009a "+
		"\3\2\2\2\u009b\u009e\7$\2\2\u009c\u009f\5C\"\2\u009d\u009f\n\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a2\13"+
		"\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7$"+
		"\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\7l\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\u00ac\7a\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7d\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7t\2\2"+
		"\u00b2\u00b3\7{\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7l\2\2\u00b5\u00b6\7c\2"+
		"\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7u\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7"+
		"l\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7t\2\2\u00bc(\3\2\2\2\u00bd\u00be"+
		"\7u\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7n\2\2\u00c1"+
		"\u00c2\7c\2\2\u00c2\u00c3\7a\2\2\u00c3\u00c4\7l\2\2\u00c4\u00c5\7c\2\2"+
		"\u00c5\u00c6\7t\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7c\2"+
		"\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7g\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7"+
		"q\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7i\2\2\u00cf.\3\2\2\2\u00d0\u00d1"+
		"\7t\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7x\2\2\u00d3\60\3\2\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7t\2\2\u00d8"+
		"\u00d9\7c\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7k\2\2"+
		"\u00dc\u00dd\7v\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7x\2\2\u00df\u00e0"+
		"\7g\2\2\u00e0\62\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7z\2\2\u00e3\u00e4"+
		"\7e\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7f\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7u\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7g\2\2\u00eb"+
		"\u00ec\7z\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7w\2\2"+
		"\u00ef\u00f0\7f\2\2\u00f0\u00f1\7g\2\2\u00f1\66\3\2\2\2\u00f2\u00f3\7"+
		"h\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7"+
		"\7g\2\2\u00f78\3\2\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb"+
		"\7r\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7f\2\2\u00fe"+
		"\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7e\2\2\u0101\u0102\7k\2\2"+
		"\u0102\u0103\7g\2\2\u0103\u0104\7u\2\2\u0104:\3\2\2\2\u0105\u0106\7V\2"+
		"\2\u0106\u0107\7t\2\2\u0107\u0108\7w\2\2\u0108\u010f\7g\2\2\u0109\u010a"+
		"\7H\2\2\u010a\u010b\7c\2\2\u010b\u010c\7n\2\2\u010c\u010d\7u\2\2\u010d"+
		"\u010f\7g\2\2\u010e\u0105\3\2\2\2\u010e\u0109\3\2\2\2\u010f<\3\2\2\2\u0110"+
		"\u0115\7)\2\2\u0111\u0114\5C\"\2\u0112\u0114\n\2\2\2\u0113\u0111\3\2\2"+
		"\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0116\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7)\2\2\u0119"+
		">\3\2\2\2\u011a\u011c\7\17\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011e\7\f\2\2\u011e@\3\2\2\2\u011f\u0123\5"+
		"K&\2\u0120\u0122\5I%\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124B\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0129\7^\2\2\u0127\u012a\t\3\2\2\u0128\u012a\5E#\2\u0129\u0127\3\2\2"+
		"\2\u0129\u0128\3\2\2\2\u012aD\3\2\2\2\u012b\u012c\7w\2\2\u012c\u012d\5"+
		"G$\2\u012d\u012e\5G$\2\u012e\u012f\5G$\2\u012f\u0130\5G$\2\u0130F\3\2"+
		"\2\2\u0131\u0132\t\4\2\2\u0132H\3\2\2\2\u0133\u0136\5K&\2\u0134\u0136"+
		"\t\5\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136J\3\2\2\2\u0137"+
		"\u0138\t\6\2\2\u0138L\3\2\2\2\u0139\u013b\t\7\2\2\u013a\u0139\3\2\2\2"+
		"\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013f\b\'\2\2\u013fN\3\2\2\2\r\2\u009e\u00a3\u010e\u0113"+
		"\u0115\u011b\u0123\u0129\u0135\u013c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}