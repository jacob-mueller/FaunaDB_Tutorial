package Delete;

import com.faunadb.client.FaunaClient;

import java.util.concurrent.ExecutionException;

import static com.faunadb.client.query.Language.*;

/**
 * Lösche dich selbst
 */
public class DeleteDoc {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAD6o9LvsACAY1P-jvYDMFDbyJkgM70tW2raItB")
                        .build();
        System.out.println(
                "Your Code goes here");

    }
}
