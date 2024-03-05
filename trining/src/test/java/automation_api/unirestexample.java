package automation_api;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;




public class unirestexample {
		public void getmethodexample() throws IOException
	{ 	HttpResponse<JsonNode> asjson = Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
		System.out.println("status code is -->"+asjson.getStatus());
		System.out.println("status text is -->"+asjson.getStatusText());
		System.out.println("body text are -->"+asjson.getBody());
	}
		public void postmethodexample()
		{
			HttpResponse<JsonNode> json = Unirest.post("https://dummy.restapiexample.com/api/v1/create").
			body("{\"name\":\"selvanayagam\",\"salary\":\"2000000\",\"age\":\"24\"}").asJson();
			System.out.println("status code is -->"+json.getStatus());
			System.out.println("status text is -->"+json.getStatusText());
			System.out.println("body text are -->"+json.getBody());
		}
		public void putmethodexample()
		{
			HttpResponse<JsonNode> asjson = Unirest.put("https://dummy.restapiexample.com/api/v1/update/9255").
			body("{\"name\":\"selvanayagam\",\"salary\":\"2000000\",\"age\":\"27\"}").asJson();
			System.out.println("status code is -->"+asjson.getStatus());
			System.out.println("status text is -->"+asjson.getStatusText());
			System.out.println("body text are -->"+asjson.getBody());
		}
		public void deletemethoexample()
		{
			HttpResponse<JsonNode> asjson = Unirest.delete("https://dummy.restapiexample.com/api/v1/delete/9255/").asJson();
			System.out.println("status code is -->"+asjson.getStatus());
			System.out.println("status text is -->"+asjson.getStatusText());
			System.out.println("body text are -->"+asjson.getBody());
	
		}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		unirestexample hp=new unirestexample();
		//hp.getmethodexample();
		hp.deletemethoexample();
	}

}
