package ch.interdiscount.knowhow.springgettingstarted.profiles;

import lombok.Data;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
@ConfigurationProperties
@Data
@Validated
public class PropertiesExampleService {

    @Value("${integer}")
    @NotNull
    private int integerProperty;

    @Value("${double}")
    private double doubleProperty;

    @Value("${long}")
    private long longProperty;

    @Value("${boolean}")
    private boolean booleanProperty;

    @Value("${overwrite}")
    private String overwrite;

    @Setter
    /**
     * To have the map set, we need a setter and the ConfigurationProperties annotation
     */
    private Map<String, String> awesomeMap = new HashMap<>();

    @Setter
    /**
     * To have the list set, we need a setter and the ConfigurationProperties annotation
     */
    private List<String> awesomeList = new ArrayList<>();

    @Valid
    @NotNull
    private NestedProperties nestedProperties;

    public void logProperties() {
        log.info("Integer " + getIntegerProperty());
        log.info("Double " + getDoubleProperty());
        log.info("Long " + getLongProperty());
        log.info("Boolean " + isBooleanProperty());
        log.info("String overwrite from profile " + getOverwrite());

        for (String awesomeListItem : getAwesomeList()) {
            log.info("Awesome List: " + awesomeListItem);
        }

        for (String key: getAwesomeMap().keySet()){
            log.info("Awesome Map: key:" + key + " - value: " + getAwesomeMap().get(key));
        }
    }
}
