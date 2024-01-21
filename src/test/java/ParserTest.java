import antlr.DiagramListener;
import gen.ActivityPumlLexer;
import gen.ActivityPumlParser;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;
import util.ContentUtil;

@Slf4j
public class ParserTest {

    @Test
    public void parseSimpleActivityDiagramText() {
        String simpleText = "@startuml\n" +
                "start\n" +
                ":Привет мир!;\n" +
                ":Эта активность описывается \n" +
                "несколькими **строчками** текста;\n" +
                "stop\n" +
                "@enduml\n";
        CharStream strStream = CharStreams.fromString(ContentUtil.removeLineFeeds(simpleText));
        ActivityPumlLexer lexer = new ActivityPumlLexer(strStream);
        ActivityPumlParser parser = new ActivityPumlParser(new CommonTokenStream(lexer));
        parser.addParseListener(new DiagramListener());
        parser.activityDiagram();
    }

    @Test
    public void parseActivitiDiagramWithAtributes() {
        String textWithAtributes = "title Методика расчета биржевых индексов цен топлива для реактивных двигателей в резервуарах ТЗК аэропортов. url  version 1 revision 1\n" +
                "@startuml\n" +
                "start\n " +
                "note right\n" +
                " INPUT_DATA:\n" +
                " spot_contract\n" +
                " **Вопрос по формату обмена, json?**\n" +
                "\n" +
                "\n" +
                "end note\n" +
                "\n" +
                "\n" +
                ":ACT_NUM:1\n" +
                "ACT_DESC:Создать инстанс esia контракта (Бин: esiacontract -> Таблица: esia_contract **Обсудить вопрос персистенции**)\n" +
                "ACT_NAME:esia_new_ctr\n" +
                "PARAMS:{spot_contract};\n" +
                "fork\n" +
                ":ACT_NUM:2\n" +
                "ACT_DESC:Установка фильтров, все поля с перфиксом f_ (z_epp_limit -> z_epp_limit_history)\n" +
                "ACT_NAME:esia_set_fltr\n" +
                "PARAMS:{esiacontract};\n" +
                "end fork\n" +
                "fork\n" +
                ":ACT_NUM:3\n" +
                "ACT_DESC:Установка лимитов\n" +
                "ACT_NAME:esia_set_lmt\n" +
                "PARAMS:{esiacontract};\n" +
                "end fork\n" +
                ":ACT_NUM:4\n" +
                "ACT_DESC: Расчет индиктора\n" +
                "ACT_NAME:esia_calc_idr;\n" +
                "\n" +
                "\n" +
                ":ACT_NUM:5\n" +
                "ACT_DESC:Расчет диффов\n" +
                "ACT_NAME:esia_calc_dif;\n" +
                "\n" +
                "\n" +
                ":ACT_NUM:6\n" +
                "ACT_DESC:\"Протяжка\" в visible public\n" +
                "ACT_NAME:esia_mov_to_vis_pub;\n" +
                "\n" +
                "\n" +
                "stop\n" +
                "@enduml";
        CharStream strStream = CharStreams.fromString(ContentUtil.removeLineFeeds(textWithAtributes));
        ActivityPumlLexer lexer = new ActivityPumlLexer(strStream);
        ActivityPumlParser parser = new ActivityPumlParser(new CommonTokenStream(lexer));
        parser.addParseListener(new DiagramListener());
        parser.activityDiagram();
    }
}
