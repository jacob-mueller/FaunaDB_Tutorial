package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.CreateIndex;
import static com.faunadb.client.query.Language.*;

/**
 * Hier muss ein Index erstellt werden, der Anhand des Vornamens den Nachnamen ausgibt

**/
public class CreateIndex {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("yourKey")
                        .build();


        System.out.println(
                adminClient.query(
                        CreateIndex(
                                Obj(
                                        "name", Value("title_by_name"),
                                        "source", Collection(Value("Teilnehmer_Java")),
                                        "terms", Arr(Obj("field", Arr(Value("data"), Value("name")))),
                                        "values", Arr(Obj("field", Arr(Value("data"), Value("title"))))
                                )))
                        .get());


    }
}
