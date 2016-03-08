package sample;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import sun.rmi.runtime.Log;

import java.io.IOException;
import java.util.Map;

public class Main  {

    public static void main (String[] args) throws IOException

    {
        GroupsService service = ApiFactory.getAirportsService();
        Call<Object> call = service.getGroups("23665641", "admin", 10, 1, "cea3813c77dec3b549324a8a0807d0bcad13d4ead9508f15e35fd1f275c8b852b3e9af774297129ff059");

         Object o = call.execute().body();
        int a = 10;
    }






}
