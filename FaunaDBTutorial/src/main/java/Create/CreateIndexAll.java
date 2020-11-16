package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.CreateIndex;
import static com.faunadb.client.query.Language.*;

/**
 * Hier muss ein Index erstellt werden, der alle Teilnehmer ausgibt
 */


public class CreateIndexAll {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("dein key")
                        .build();




        System.out.println(
                //Hier die Query entwerfen
                );




    }
}
