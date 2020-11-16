package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

/**
 * Hier muss eine Collection mit dem Namen Teilnehmer erstellt werden
 */
public class CreateCol {
    public static void main(String[] args) throws Exception  {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("your secretkey")
                        .build();



    }
}

