package Connection;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

public class GetFollowingProjects {

    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD68skKnACAQLyIybMoAx0CrXddm_-hrZRVecf")
                        .build();

        System.out.println(adminClient.query(
                Paginate(Join(
                        Match(
                                Index(Value("followeeByFollower")),
                                Call(Function("getTeilnehmer"), Value("Jacob"))
                        ),
                        Index(Value("projectByDeveloper") )
                        )
                )

        ).get());
    }
}