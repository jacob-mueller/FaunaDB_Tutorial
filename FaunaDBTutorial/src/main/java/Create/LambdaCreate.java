package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

public class LambdaCreate {

    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD68skKnACAQLyIybMoAx0CrXddm_-hrZRVecf")
                        .build();


        System.out.println(
                adminClient.query(
                        Map(
                                Arr(
                                        Value("Valentin"),
                                        Value("Benjamin"),
                                        Value("Hannes")
                                ),
                                Lambda(
                                        Value("teilnehmerX"),
                                        Create(
                                                Collection(Value("Teilnehmer")),
                                                Obj("data",
                                                        Obj(
                                                                "title", Var("teilnehmerX")
                                                        )
                                                )
                                        )
                                )
                        )
                ).get());


    }
}
