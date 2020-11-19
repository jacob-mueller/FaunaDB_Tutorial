package Connection;

import com.faunadb.client.FaunaClient;
import com.faunadb.client.query.Expr;

import static com.faunadb.client.query.Language.*;

public class CreateRelationships {

    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD685PLHACBdwMyB_R1vpLHxDzQHSJRM7FxRcd")
                        .build();

        Expr data = Obj("data", Obj(
                "follower", Select(Arr(Value("ref")),Get(Match(Index(Value("userByName")),Value("David")))),
                "followee", Select(Arr(Value("ref")),Get(Match(Index(Value("userByName")),Value("Jacob"))))));


        System.out.println(adminClient.query(Create(
                Collection(Value("Relationships"))
                , data)).get());


    }
}
