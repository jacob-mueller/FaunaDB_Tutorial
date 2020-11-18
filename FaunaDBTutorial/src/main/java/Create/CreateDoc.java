package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

public class CreateDoc {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD68skKnACAQLyIybMoAx0CrXddm_-hrZRVecf")
                        .build();

        System.out.println(
                adminClient.query(Create(
                        Collection(Value("Teilnehmer")),
                        Obj("data", Obj(
                                "Name", Value("Daniel"),
                                "Age", Value("26"),
                                "FavoriteDB", Value("CouchDB")
                        ))
                )).get()
        );

    }
}
