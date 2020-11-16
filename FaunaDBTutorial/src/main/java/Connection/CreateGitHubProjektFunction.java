package Connection;

import com.faunadb.client.FaunaClient;
import com.faunadb.client.query.Expr;

import static com.faunadb.client.query.Language.*;

public class CreateGitHubProjektFunction {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD6o9LvsACAY1P-jvYDMFDbyJkgM70tW2raItB")
                        .build();

    }
}