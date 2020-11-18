package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.CreateIndex;
import static com.faunadb.client.query.Language.*;

public class CreateIndex {
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
                                        "name", Value("teilnehmerByName"),
                                        "source", Collection(Value("Teilnehmer")),
                                        "terms", Arr(Obj("field", Arr(Value("data"), Value("Name"))))
                                )))
                        .get());


    }
}
