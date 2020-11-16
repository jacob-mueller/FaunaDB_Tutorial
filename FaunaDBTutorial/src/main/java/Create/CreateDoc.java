package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

public class CreateDoc {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD6o9LvsACAY1P-jvYDMFDbyJkgM70tW2raItB")
                        .build();

        System.out.println(
                adminClient.query(
                        Create(
                                Collection(Value("Teilnehmer_Java")),
                                Obj(
                                        "data", Obj(
                                                "title", Value("OFten blabla"),
                                                "name", Value("Sabine")
                                        )
                                )
                        )
                ).get());
    }
}
