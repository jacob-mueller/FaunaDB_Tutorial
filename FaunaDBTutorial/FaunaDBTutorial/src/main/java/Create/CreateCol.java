package Create;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;


public class CreateCol {
    public static void main(String[] args) throws Exception  {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD6o9LvsACAY1P-jvYDMFDbyJkgM70tW2raItB")
                        .build();



        System.out.println(
                adminClient.query(CreateCollection(Obj("name", Value("Github_Projekte"))))
                        .get());

        adminClient.close();
    }
}

