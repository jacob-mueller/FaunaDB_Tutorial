package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;


/**
 * Hier ist angedacht, einen Teilnehmer in der Collection Teilnehmer zu erstellen. Trage dich selbst mit Vor- und
 * Nachnamen, sowie Alter ein.
**/
public class CreateDoc {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("your secretkey")
                        .build();


    }
}
