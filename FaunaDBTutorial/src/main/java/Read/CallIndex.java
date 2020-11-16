package Read;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

/**
 * Rufe hier den INdex auf, der alle Dokumente einer Collection aufruft
 */

public class CallIndex {
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
