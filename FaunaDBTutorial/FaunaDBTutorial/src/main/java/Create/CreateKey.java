package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.CreateKey;
import static com.faunadb.client.query.Language.*;

public class CreateKey {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD6o84lWACAHwe2W6MYXHkOs5u__aoAnh9Mj5s")
                        .build();

        System.out.println(
                adminClient.query(
                        CreateKey(
                                Obj(
                                        "database", Database(Value("Teilnehmer_Java")),
                                        "role", Value("server")
                                )
                        )
                ).get());


    }
}
