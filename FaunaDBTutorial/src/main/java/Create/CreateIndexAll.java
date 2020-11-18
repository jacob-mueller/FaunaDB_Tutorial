package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.CreateIndex;
import static com.faunadb.client.query.Language.*;

public class CreateIndexAll {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD68skKnACAQLyIybMoAx0CrXddm_-hrZRVecf")
                        .build();




        System.out.println(
                adminClient.query(
                        CreateIndex(
                                Obj(
                                        "name", Value("allTeilnehmer"),
                                        "source", Collection(Value("Teilnehmer"))
                                )))
                        .get());




    }
}
