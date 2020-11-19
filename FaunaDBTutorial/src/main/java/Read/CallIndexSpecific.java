package Read;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

public class CallIndexSpecific {
    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("Yourkey")
                        .build();


        System.out.println(
                adminClient.query(
                        Paginate(
                                Match(
                                        Index(Value("TeilnehmerByName")), Value("Joe")))
                ).get());


    }
}

