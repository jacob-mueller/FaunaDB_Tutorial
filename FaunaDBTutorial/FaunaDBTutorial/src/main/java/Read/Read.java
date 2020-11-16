package Read;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

public class Read {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("Yourkey")
                        .build();


        System.out.println(
                adminClient.query(Get(Ref(Collection("Teilnehmer"), Value("282195573338014209"))))
                        .get());

    }


}
