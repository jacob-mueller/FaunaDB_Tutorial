package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.CreateKey;
import static com.faunadb.client.query.Language.*;

/**
 * Hier soll ein key für die datenbank Teilnehmer entworfen werden
 */

public class CreateKey {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("dein key")
                        .build();




    }
}
