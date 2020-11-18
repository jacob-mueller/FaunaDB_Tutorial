package Connection;

import com.faunadb.client.FaunaClient;
import com.faunadb.client.query.Expr;

import static com.faunadb.client.query.Language.*;

public class CreateGitHubProjektFunction {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD68skKnACAQLyIybMoAx0CrXddm_-hrZRVecf")
                        .build();


        Expr data = Obj("data", Obj(
                "Project", Value("Machine Learning"),
                "Mandays", Value("12"),
                "Developer", Call(Function("getTeilnehmer"), Value("Jacob"))));


        System.out.println(
                adminClient.query(
                        Create(
                                Collection(
                                        Value("GithubProjects")
                                ),
                                data
                        )
                ).get());
    }
}