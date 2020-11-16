package Update;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;
import static com.faunadb.client.query.Language.Value;

public class Update {

    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("YourCode")
                        .build();

        System.out.println(
                adminClient.query(
                        Update(
                                Ref(Collection("Teilnehmer_Java"), Value("282195573338014209")),
                                Obj("data",Obj("Vorname",Value(("JACOB")))
                                )
                        )
                ).get());





    }
}

