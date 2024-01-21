grammar ActivityPuml;
activityDiagram:    title?
                    START_UML
                    START?
                    (note*
                    ATRIBUTE_START
                    activity
                    ATRIBUTE_END)+
                    END?
                    END_UML;

activity        :   FORK_START?
                    atribute
                    FORK_END? ;
atribute        :   (ATRIBUTE_KEY? ATRIBUTE_CONTENT)+;
note            :   NOTE_START ATRIBUTE_CONTENT NOTE_END;
title           :   'title'ATRIBUTE_CONTENT;

START_UML       :   '@startuml';
START           :   'start';
FORK_START      :   'fork';
FORK_END        :   'end fork';
NOTE_START      :   'note ' ('right' || 'left')?;
NOTE_END        :   'end note';
END             :   ('stop' | 'end' | 'kill' | 'detach');
END_UML         :   '@enduml';
ATRIBUTE_KEY    :   [A-Z_]+ ':';
ATRIBUTE_START  :   ':';
ATRIBUTE_END    :   ';';
ATRIBUTE_CONTENT:   [а-яА-Яa-z!,.\u0022*0-9_?(){}\u002D\u003E ]+;










