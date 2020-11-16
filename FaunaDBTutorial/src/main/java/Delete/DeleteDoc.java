package Delete;

import com.faunadb.client.FaunaClient;

import java.util.concurrent.ExecutionException;

import static com.faunadb.client.query.Language.*;


public class DeleteDoc {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("YourCode")
                        .build();
        System.out.println(
                adminClient.query(
                        Delete(Ref(Collection("Teilnehmer_Java"),Value(282195573338014209L))))
                        .get());

    }
}
