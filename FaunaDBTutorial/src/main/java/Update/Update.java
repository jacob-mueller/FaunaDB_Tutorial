package Update;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;
import static com.faunadb.client.query.Language.Value;

/**
 * Update deinen Namen, sodass er nur in Großbuchstaben geschrieben wird
 */

public class Update {

    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD6o9LvsACAY1P-jvYDMFDbyJkgM70tW2raItB")
                        .build();

        System.out.println(
                "Hier deinen Code einsetzen");





    }
}
