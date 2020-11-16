package Connection;

import com.faunadb.client.FaunaClient;
import com.faunadb.client.query.Expr;

import static com.faunadb.client.query.Language.*;

public class CreateRelationships {

    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD6zCCusACBUJxEmPNx2lZojSluoAoNvfXo5RU")
                        .build();

        Expr data = Obj("data", Obj(
                "follower", Call(Function("getTeilnehmer"), Value("Max")),
                "followee", Call(Function("getTeilnehmer"), Value("Joe"))));


        System.out.println(adminClient.query(Create(
                Collection(Value("Relationships"))
                , data)).get());


    }
}
