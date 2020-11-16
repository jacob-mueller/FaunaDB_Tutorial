package Read;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

/**
 * Hier soll der kreierte Index für bestimmte Teilnehmer (bestimmt durch namen) abgerufen werden
 */
public class CallIndexSpecific {
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

