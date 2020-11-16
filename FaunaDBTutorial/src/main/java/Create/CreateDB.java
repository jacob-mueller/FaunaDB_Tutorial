package Create;// key= fnAD6RtcNOACAUmurLfHh3ciVY01LZJfH-EgwG0X

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

/**
 * Hier muss eine Database mit Namen KFRU_Database erstellt werden
 */
public class CreateDB {
    public static void main(String[] args) throws Exception {

        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("yourKey")
                        .build();


    }
}



