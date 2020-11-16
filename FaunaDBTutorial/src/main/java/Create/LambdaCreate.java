package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

public class LambdaCreate {

    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD6o9LvsACAY1P-jvYDMFDbyJkgM70tW2raItB")
                        .build();


        System.out.println(
                adminClient.query(
                        Map(
                                Arr(
                                        Value("My cat and other marvels"),
                                        Value("Pondering during a commute"),
                                        Value("Deep meanings in a latte")
                                ),
                                Lambda(
                                        Value("post_title"),
                                        Create(
                                                Collection(Value("Teilnehmer_Java")),
                                                Obj("data",
                                                        Obj(
                                                                "title", Var("post_title")
                                                        )
                                                )
                                        )
                                )
                        )
                ).get());


    }
}
