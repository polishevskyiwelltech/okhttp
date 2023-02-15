package network;

import data.UserServerResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RandomUserService {
    @GET("api")
    Call<UserServerResponse> getUser();
}
