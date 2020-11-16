package Read;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

/**
 * Erzeuge einen lesenden Zugriff auf deinen Teilnehmer eintrag mithilfe der ID
 */

public class Read {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("yourkey")
                        .build();


        System.out.println(
                "Your code goes here"
        );

    }


}
