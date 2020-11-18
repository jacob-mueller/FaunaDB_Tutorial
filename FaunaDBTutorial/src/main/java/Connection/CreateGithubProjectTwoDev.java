package Connection;

import com.faunadb.client.FaunaClient;
import com.faunadb.client.query.Expr;

import static com.faunadb.client.query.Language.*;

public class CreateGithubProjectTwoDev {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD68skKnACAQLyIybMoAx0CrXddm_-hrZRVecf")
                        .build();

        Expr data = Obj("data", Obj(
                "Project", Value("CGI_TopSecret"),
                "Mandays", Value("10"),
                "Release", Value("April 2020"),
                "Developer",Arr(Call(Function("getUser"),Value("Daniel")),
                                    Select(Arr(Value("ref")),Get(Match(Index(Value("teilnehmerByName")),Value("Jacob")))))))
                ;

        System.out.println(
                adminClient.query(
                        Create(
                                Collection(
                                        Value("GithubProjects")),
                                data
                        )
                ).get());
    }
}