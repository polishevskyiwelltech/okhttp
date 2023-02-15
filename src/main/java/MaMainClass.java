import network.ReqresListUsers;
import network.RetrofitClient;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class MaMainClass {
    public static void main(String[] args) throws IOException {
        String url = "https://reqres.in/";

        Retrofit retrofit = RetrofitClient.getClient(url);

        ReqresListUsers user = retrofit.create(ReqresListUsers.class);
        Response response = user.getUser().execute();
        System.out.println(response);

        ReqresListUsers users = retrofit.create(ReqresListUsers.class);
        Response response2 = users.getUsers().execute();
        System.out.println(response2);

        ReqresListUsers wrong = retrofit.create(ReqresListUsers.class);
        Response response3 = wrong.getWrongUser().execute();
        System.out.println(response3);

    }
}
