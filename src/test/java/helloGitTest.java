import fixture.EndPoints;
import fixture.FixtureConfig;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = FixtureConfig.class)
public class helloGitTest {
    @Before
    public void preconditions() {
        //establish connection, test preconditions, create test data check if up and running;
    }

    @After
    public void postConditions() {
        //delete test data, tear down, close driver, browser;
    }

    @Test
    public void searchGitRepositoryTest(){
        Response response = RestAssured
                .given()
                .param("q", "testng")
                .param("sort", "stars")
                .param("page", 1)
                .when()
                .get(EndPoints.searchPath)
                .then()
                .statusCode(200)
                .extract()
                .response();

        response.toString();
    }
}