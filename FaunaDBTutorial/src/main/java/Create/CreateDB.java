package Create;// key= fnAD6RtcNOACAUmurLfHh3ciVY01LZJfH-EgwG0X

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

/**
 * This example connects to FaunaDB using the secret provided
 * and creates a new database named "my-first-database"
 */
public class CreateDB {
    public static void main(String[] args) throws Exception {

        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD68rYQiACA6c8FVn43o-_AikTwmBCGvKktUSb")
                        .build();

        System.out.println(
                adminClient.query(CreateDatabase(Obj("name", Value("KFRU_Database_Solution")))
                ).get());

        adminClient.close();
    }
}



