package Connection;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

public class GetFollowingProjects {

    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD685PLHACBdwMyB_R1vpLHxDzQHSJRM7FxRcd")
                        .build();

        System.out.println(adminClient.query(
                Paginate(Join(
                        Match(
                                Index(Value("followeeByFollower")),
                                Select(Arr(Value("ref")), Get(Match(Index(Value("userByName")), Value("Jacob"))))
                        ),
                        Index(Value("tweetByUser"))
                        )
                )

        ).get());
    }
}