package Connection;

import com.faunadb.client.FaunaClient;
import com.faunadb.client.query.Expr;

import static com.faunadb.client.query.Language.*;

public class CreateRelationships {

    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD68skKnACAQLyIybMoAx0CrXddm_-hrZRVecf")
                        .build();

        Expr data = Obj("data", Obj(
                "follower", Call(Function("getTeilnehmer"), Value("Jacob")),
                "followee", Call(Function("getTeilnehmer"), Value("Ralf"))));


        System.out.println(adminClient.query(Create(
                Collection(Value("Relationships"))
                , data)).get());


    }
}
