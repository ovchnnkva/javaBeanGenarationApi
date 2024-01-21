package antlr;

import gen.ActivityPumlListener;
import gen.ActivityPumlParser;
import lombok.extern.slf4j.Slf4j;
import model.Activity;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
public class DiagramListener implements ActivityPumlListener {
    private List<Activity> activities = new ArrayList<>();

    @Override
    public void enterAtribute(ActivityPumlParser.AtributeContext ctx) {

    }

    @Override
    public void exitAtribute(ActivityPumlParser.AtributeContext ctx) {
        Activity activity = Activity.builder()
                .name("act_num_" + (activities.size() + 1))
                .content((ctx.ATRIBUTE_KEY().isEmpty())
                        ? String.valueOf(ctx.ATRIBUTE_CONTENT(0).getSymbol().getText())
                        : null)
                .atributes(new HashMap<>())
                .build();


        if(ctx.ATRIBUTE_KEY() != null){
            log.info("keys size " + ctx.ATRIBUTE_KEY().size());
            for(int i = 0; i < ctx.ATRIBUTE_KEY().size(); i++) {
                activity.addAtribute(String.valueOf(ctx.ATRIBUTE_KEY(i).getSymbol().getText()), String.valueOf(ctx.ATRIBUTE_CONTENT(i).getSymbol().getText()));
            }
        }

        activities.add(activity);

        log.info("find activity bean" + activity.toString());
    }

    @Override
    public void enterNote(ActivityPumlParser.NoteContext ctx) {

    }

    @Override
    public void exitNote(ActivityPumlParser.NoteContext ctx) {

    }

    @Override
    public void enterActivity(ActivityPumlParser.ActivityContext ctx) {
    }

    @Override
    public void exitActivity(ActivityPumlParser.ActivityContext ctx) {
    }

    @Override
    public void enterActivityDiagram(ActivityPumlParser.ActivityDiagramContext ctx) {

    }

    @Override
    public void exitActivityDiagram(ActivityPumlParser.ActivityDiagramContext ctx) {

    }

    @Override
    public void enterTitle(ActivityPumlParser.TitleContext ctx) {

    }

    @Override
    public void exitTitle(ActivityPumlParser.TitleContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
