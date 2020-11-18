package Update;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;
import static com.faunadb.client.query.Language.Value;

public class Update {

    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD68skKnACAQLyIybMoAx0CrXddm_-hrZRVecf")
                        .build();

        System.out.println(
                adminClient.query(
                        Update(
                                Ref(Collection("Teilnehmer"), Value("282543208430305799")),
                                Obj("data",Obj("FavoriteDB",Value("SQLMicrosoft"))
                                )
                        )
                ).get());





    }
}

