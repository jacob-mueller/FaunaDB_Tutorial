package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.CreateIndex;
import static com.faunadb.client.query.Language.*;

public class CreateIndexAll {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD6o9LvsACAY1P-jvYDMFDbyJkgM70tW2raItB")
                        .build();




        System.out.println(
                adminClient.query(
                        CreateIndex(
                                Obj(
                                        "name", Value("alle_teilnehmer2"),
                                        "source", Collection(Value("Teilnehmer_Java")),
                                        "values", Arr(Obj("field", Arr(Value("data"),Value( "name"))))
                                )))
                        .get());




    }
}
