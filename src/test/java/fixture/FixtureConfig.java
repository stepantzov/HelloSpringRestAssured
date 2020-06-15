package fixture;

import io.restassured.RestAssured;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@TestConfiguration
@PropertySource("classpath:config.properties")
public class FixtureConfig {

    @Value("${api.base.url}")
    private String restApiBase;

    @PostConstruct
    void setupTestVariables() {
        RestAssured.baseURI = restApiBase;
    }
}
