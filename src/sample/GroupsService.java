package sample;

import retrofit.Call;
import retrofit.Response;
import retrofit.http.GET;
import retrofit.http.Query;

import java.util.List;
import java.util.Map;

public interface GroupsService {
    @GET("method/groups.get")
    Call<Object> getGroups(@Query("user_id") String userId,
                        @Query("filter") String filter,
                        @Query("count") int count,
                        @Query("extended") int extended,
                        @Query("access_token") String token);


}