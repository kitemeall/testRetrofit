package sample;

import com.google.gson.annotations.SerializedName;

import retrofit.Response;

public class Groups {

    private Response[] response;

    public Response[] getResponse ()
    {
        return response;
    }

    public void setResponse (Response[] response)
    {
        this.response = response;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [response = "+response+"]";
    }
}