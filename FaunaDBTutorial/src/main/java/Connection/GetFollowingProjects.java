package Connection;

import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

public class GetFollowingProjects {

    public static void main(String[] args) throws Exception {
        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD6zCCusACBUJxEmPNx2lZojSluoAoNvfXo5RU")
                        .build();

    }
}