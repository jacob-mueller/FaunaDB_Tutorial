package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.CreateKey;
import static com.faunadb.client.query.Language.*;

public class CreateKey {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD68rYQiACA6c8FVn43o-_AikTwmBCGvKktUSb")
                        .build();

        System.out.println(
                adminClient.query(
                        CreateKey(
                                Obj(
                                        "database", Database(Value("KFRU_DB_Solution")),
                                        "role", Value("server")
                                )
                        )
                ).get());


    }
}
