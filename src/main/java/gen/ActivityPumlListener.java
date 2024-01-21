// Generated from /home/anna/Рабочий стол/javaBeanGeneratorApi/src/main/antlr4/ActivityPuml.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ActivityPumlParser}.
 */
public interface ActivityPumlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#activityDiagram}.
	 * @param ctx the parse tree
	 */
	void enterActivityDiagram(ActivityPumlParser.ActivityDiagramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#activityDiagram}.
	 * @param ctx the parse tree
	 */
	void exitActivityDiagram(ActivityPumlParser.ActivityDiagramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#activity}.
	 * @param ctx the parse tree
	 */
	void enterActivity(ActivityPumlParser.ActivityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#activity}.
	 * @param ctx the parse tree
	 */
	void exitActivity(ActivityPumlParser.ActivityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#atribute}.
	 * @param ctx the parse tree
	 */
	void enterAtribute(ActivityPumlParser.AtributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#atribute}.
	 * @param ctx the parse tree
	 */
	void exitAtribute(ActivityPumlParser.AtributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(ActivityPumlParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(ActivityPumlParser.NoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(ActivityPumlParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(ActivityPumlParser.TitleContext ctx);
}