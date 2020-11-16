package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

/**
 * Hier soll mittels einer Lambda funktion 3 namen hinzugefügt werden
 */

public class LambdaCreate {

    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("Dein key")
                        .build();





    }
}
