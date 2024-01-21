package model;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class Activity {
    private String name;
    private String content;
    private Map<String, String> atributes;

    public void addAtribute(String name, String value) {
        atributes.put(name, value);
    }
}
