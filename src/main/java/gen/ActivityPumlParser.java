// Generated from /home/anna/Рабочий стол/javaBeanGeneratorApi/src/main/antlr4/ActivityPuml.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ActivityPumlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, START_UML=2, START=3, FORK_START=4, FORK_END=5, NOTE_START=6, 
		NOTE_END=7, END=8, END_UML=9, ATRIBUTE_KEY=10, ATRIBUTE_START=11, ATRIBUTE_END=12, 
		ATRIBUTE_CONTENT=13;
	public static final int
		RULE_activityDiagram = 0, RULE_activity = 1, RULE_atribute = 2, RULE_note = 3, 
		RULE_title = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"activityDiagram", "activity", "atribute", "note", "title"
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

	@Override
	public String getGrammarFileName() { return "ActivityPuml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ActivityPumlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActivityDiagramContext extends ParserRuleContext {
		public TerminalNode START_UML() { return getToken(ActivityPumlParser.START_UML, 0); }
		public TerminalNode END_UML() { return getToken(ActivityPumlParser.END_UML, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode START() { return getToken(ActivityPumlParser.START, 0); }
		public List<TerminalNode> ATRIBUTE_START() { return getTokens(ActivityPumlParser.ATRIBUTE_START); }
		public TerminalNode ATRIBUTE_START(int i) {
			return getToken(ActivityPumlParser.ATRIBUTE_START, i);
		}
		public List<ActivityContext> activity() {
			return getRuleContexts(ActivityContext.class);
		}
		public ActivityContext activity(int i) {
			return getRuleContext(ActivityContext.class,i);
		}
		public List<TerminalNode> ATRIBUTE_END() { return getTokens(ActivityPumlParser.ATRIBUTE_END); }
		public TerminalNode ATRIBUTE_END(int i) {
			return getToken(ActivityPumlParser.ATRIBUTE_END, i);
		}
		public TerminalNode END() { return getToken(ActivityPumlParser.END, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public ActivityDiagramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activityDiagram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterActivityDiagram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitActivityDiagram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitActivityDiagram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActivityDiagramContext activityDiagram() throws RecognitionException {
		ActivityDiagramContext _localctx = new ActivityDiagramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_activityDiagram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(10);
				title();
				}
			}

			setState(13);
			match(START_UML);
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START) {
				{
				setState(14);
				match(START);
				}
			}

			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NOTE_START) {
					{
					{
					setState(17);
					note();
					}
					}
					setState(22);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(23);
				match(ATRIBUTE_START);
				setState(24);
				activity();
				setState(25);
				match(ATRIBUTE_END);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOTE_START || _la==ATRIBUTE_START );
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(31);
				match(END);
				}
			}

			setState(34);
			match(END_UML);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActivityContext extends ParserRuleContext {
		public AtributeContext atribute() {
			return getRuleContext(AtributeContext.class,0);
		}
		public TerminalNode FORK_START() { return getToken(ActivityPumlParser.FORK_START, 0); }
		public TerminalNode FORK_END() { return getToken(ActivityPumlParser.FORK_END, 0); }
		public ActivityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterActivity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitActivity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitActivity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActivityContext activity() throws RecognitionException {
		ActivityContext _localctx = new ActivityContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_activity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORK_START) {
				{
				setState(36);
				match(FORK_START);
				}
			}

			setState(39);
			atribute();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORK_END) {
				{
				setState(40);
				match(FORK_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtributeContext extends ParserRuleContext {
		public List<TerminalNode> ATRIBUTE_CONTENT() { return getTokens(ActivityPumlParser.ATRIBUTE_CONTENT); }
		public TerminalNode ATRIBUTE_CONTENT(int i) {
			return getToken(ActivityPumlParser.ATRIBUTE_CONTENT, i);
		}
		public List<TerminalNode> ATRIBUTE_KEY() { return getTokens(ActivityPumlParser.ATRIBUTE_KEY); }
		public TerminalNode ATRIBUTE_KEY(int i) {
			return getToken(ActivityPumlParser.ATRIBUTE_KEY, i);
		}
		public AtributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterAtribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitAtribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitAtribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributeContext atribute() throws RecognitionException {
		AtributeContext _localctx = new AtributeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATRIBUTE_KEY) {
					{
					setState(43);
					match(ATRIBUTE_KEY);
					}
				}

				setState(46);
				match(ATRIBUTE_CONTENT);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATRIBUTE_KEY || _la==ATRIBUTE_CONTENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class NoteContext extends ParserRuleContext {
		public TerminalNode NOTE_START() { return getToken(ActivityPumlParser.NOTE_START, 0); }
		public TerminalNode ATRIBUTE_CONTENT() { return getToken(ActivityPumlParser.ATRIBUTE_CONTENT, 0); }
		public TerminalNode NOTE_END() { return getToken(ActivityPumlParser.NOTE_END, 0); }
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitNote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(NOTE_START);
			setState(52);
			match(ATRIBUTE_CONTENT);
			setState(53);
			match(NOTE_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TitleContext extends ParserRuleContext {
		public TerminalNode ATRIBUTE_CONTENT() { return getToken(ActivityPumlParser.ATRIBUTE_CONTENT, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__0);
			setState(56);
			match(ATRIBUTE_CONTENT);
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
		"\u0004\u0001\r;\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0003\u0000\f\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0010"+
		"\b\u0000\u0001\u0000\u0005\u0000\u0013\b\u0000\n\u0000\f\u0000\u0016\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u001c"+
		"\b\u0000\u000b\u0000\f\u0000\u001d\u0001\u0000\u0003\u0000!\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001*\b\u0001\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0002"+
		"\u0004\u00020\b\u0002\u000b\u0002\f\u00021\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000"+
		"\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000>\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000"+
		"\u0000\u00063\u0001\u0000\u0000\u0000\b7\u0001\u0000\u0000\u0000\n\f\u0003"+
		"\b\u0004\u0000\u000b\n\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000"+
		"\u0000\f\r\u0001\u0000\u0000\u0000\r\u000f\u0005\u0002\u0000\u0000\u000e"+
		"\u0010\u0005\u0003\u0000\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0001\u0000\u0000\u0000\u0010\u001b\u0001\u0000\u0000\u0000\u0011"+
		"\u0013\u0003\u0006\u0003\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013"+
		"\u0016\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u0017\u0001\u0000\u0000\u0000\u0016"+
		"\u0014\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u000b\u0000\u0000\u0018"+
		"\u0019\u0003\u0002\u0001\u0000\u0019\u001a\u0005\f\u0000\u0000\u001a\u001c"+
		"\u0001\u0000\u0000\u0000\u001b\u0014\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f!\u0005\b"+
		"\u0000\u0000 \u001f\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"#\u0005\t\u0000\u0000#\u0001\u0001\u0000"+
		"\u0000\u0000$&\u0005\u0004\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0003\u0004\u0002\u0000"+
		"(*\u0005\u0005\u0000\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*\u0003\u0001\u0000\u0000\u0000+-\u0005\n\u0000\u0000,+\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0005"+
		"\r\u0000\u0000/,\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0005\u0001\u0000\u0000"+
		"\u000034\u0005\u0006\u0000\u000045\u0005\r\u0000\u000056\u0005\u0007\u0000"+
		"\u00006\u0007\u0001\u0000\u0000\u000078\u0005\u0001\u0000\u000089\u0005"+
		"\r\u0000\u00009\t\u0001\u0000\u0000\u0000\t\u000b\u000f\u0014\u001d %"+
		"),1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}