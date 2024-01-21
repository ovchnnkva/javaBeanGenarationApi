// Generated from /home/anna/Рабочий стол/javaBeanGeneratorApi/src/main/antlr4/ActivityPuml.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ActivityPumlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, START_UML=2, START=3, FORK_START=4, FORK_END=5, NOTE_START=6, 
		NOTE_END=7, END=8, END_UML=9, ATRIBUTE_KEY=10, ATRIBUTE_START=11, ATRIBUTE_END=12, 
		ATRIBUTE_CONTENT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "START_UML", "START", "FORK_START", "FORK_END", "NOTE_START", 
			"NOTE_END", "END", "END_UML", "ATRIBUTE_KEY", "ATRIBUTE_START", "ATRIBUTE_END", 
			"ATRIBUTE_CONTENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'title'", "'@startuml'", "'start'", "'fork'", "'end fork'", null, 
			"'end note'", null, "'@enduml'", null, "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "START_UML", "START", "FORK_START", "FORK_END", "NOTE_START", 
			"NOTE_END", "END", "END_UML", "ATRIBUTE_KEY", "ATRIBUTE_START", "ATRIBUTE_END", 
			"ATRIBUTE_CONTENT"
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


	public ActivityPumlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ActivityPuml.g4"; }

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
		"\u0004\u0000\r\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005P\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007l\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0004\tw\b\t\u000b\t\f\tx\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0004\f\u0082\b\f\u000b\f\f\f\u0083\u0000\u0000"+
		"\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000"+
		"\u0002\u0002\u0000AZ__\t\u0000 \"(*,.09>?__a{}}\u0410\u044f\u008c\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003!\u0001"+
		"\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000"+
		"\u0000\t6\u0001\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\rQ\u0001"+
		"\u0000\u0000\u0000\u000fk\u0001\u0000\u0000\u0000\u0011m\u0001\u0000\u0000"+
		"\u0000\u0013v\u0001\u0000\u0000\u0000\u0015|\u0001\u0000\u0000\u0000\u0017"+
		"~\u0001\u0000\u0000\u0000\u0019\u0081\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0005t\u0000\u0000\u001c\u001d\u0005i\u0000\u0000\u001d\u001e\u0005t"+
		"\u0000\u0000\u001e\u001f\u0005l\u0000\u0000\u001f \u0005e\u0000\u0000"+
		" \u0002\u0001\u0000\u0000\u0000!\"\u0005@\u0000\u0000\"#\u0005s\u0000"+
		"\u0000#$\u0005t\u0000\u0000$%\u0005a\u0000\u0000%&\u0005r\u0000\u0000"+
		"&\'\u0005t\u0000\u0000\'(\u0005u\u0000\u0000()\u0005m\u0000\u0000)*\u0005"+
		"l\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005s\u0000\u0000,-\u0005"+
		"t\u0000\u0000-.\u0005a\u0000\u0000./\u0005r\u0000\u0000/0\u0005t\u0000"+
		"\u00000\u0006\u0001\u0000\u0000\u000012\u0005f\u0000\u000023\u0005o\u0000"+
		"\u000034\u0005r\u0000\u000045\u0005k\u0000\u00005\b\u0001\u0000\u0000"+
		"\u000067\u0005e\u0000\u000078\u0005n\u0000\u000089\u0005d\u0000\u0000"+
		"9:\u0005 \u0000\u0000:;\u0005f\u0000\u0000;<\u0005o\u0000\u0000<=\u0005"+
		"r\u0000\u0000=>\u0005k\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005"+
		"n\u0000\u0000@A\u0005o\u0000\u0000AB\u0005t\u0000\u0000BC\u0005e\u0000"+
		"\u0000CD\u0005 \u0000\u0000DO\u0001\u0000\u0000\u0000EF\u0005r\u0000\u0000"+
		"FG\u0005i\u0000\u0000GH\u0005g\u0000\u0000HI\u0005h\u0000\u0000IP\u0005"+
		"t\u0000\u0000JP\u0001\u0000\u0000\u0000KL\u0005l\u0000\u0000LM\u0005e"+
		"\u0000\u0000MN\u0005f\u0000\u0000NP\u0005t\u0000\u0000OE\u0001\u0000\u0000"+
		"\u0000OJ\u0001\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000P\f\u0001\u0000\u0000\u0000QR\u0005e\u0000\u0000RS\u0005n"+
		"\u0000\u0000ST\u0005d\u0000\u0000TU\u0005 \u0000\u0000UV\u0005n\u0000"+
		"\u0000VW\u0005o\u0000\u0000WX\u0005t\u0000\u0000XY\u0005e\u0000\u0000"+
		"Y\u000e\u0001\u0000\u0000\u0000Z[\u0005s\u0000\u0000[\\\u0005t\u0000\u0000"+
		"\\]\u0005o\u0000\u0000]l\u0005p\u0000\u0000^_\u0005e\u0000\u0000_`\u0005"+
		"n\u0000\u0000`l\u0005d\u0000\u0000ab\u0005k\u0000\u0000bc\u0005i\u0000"+
		"\u0000cd\u0005l\u0000\u0000dl\u0005l\u0000\u0000ef\u0005d\u0000\u0000"+
		"fg\u0005e\u0000\u0000gh\u0005t\u0000\u0000hi\u0005a\u0000\u0000ij\u0005"+
		"c\u0000\u0000jl\u0005h\u0000\u0000kZ\u0001\u0000\u0000\u0000k^\u0001\u0000"+
		"\u0000\u0000ka\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000l\u0010"+
		"\u0001\u0000\u0000\u0000mn\u0005@\u0000\u0000no\u0005e\u0000\u0000op\u0005"+
		"n\u0000\u0000pq\u0005d\u0000\u0000qr\u0005u\u0000\u0000rs\u0005m\u0000"+
		"\u0000st\u0005l\u0000\u0000t\u0012\u0001\u0000\u0000\u0000uw\u0007\u0000"+
		"\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z{\u0005:\u0000\u0000{\u0014\u0001\u0000\u0000\u0000|}\u0005:\u0000\u0000"+
		"}\u0016\u0001\u0000\u0000\u0000~\u007f\u0005;\u0000\u0000\u007f\u0018"+
		"\u0001\u0000\u0000\u0000\u0080\u0082\u0007\u0001\u0000\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u001a"+
		"\u0001\u0000\u0000\u0000\u0005\u0000Okx\u0083\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}