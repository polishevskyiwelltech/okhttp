package network;

import data.UserServerResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ReqresListUsers {
    @GET("api/users/2")
    Call<UserServerResponse> getUser();

    @GET("api/users?page=2")
    Call<UserServerResponse> getUsers();

    @GET("api/users/23")
    Call<UserServerResponse> getWrongUser();

}
