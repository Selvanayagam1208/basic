package automation_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class httprequestexample {
	URL url;
	HttpsURLConnection openconnection;
	int responseCode;
	String message;
	public void getmethodexample() throws IOException
	{
		try {
			url=new URL("https://dummy.restapiexample.com/api/v1/employees");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			openconnection = (HttpsURLConnection)url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			openconnection.setRequestMethod("GET");
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			openconnection.connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			responseCode = openconnection.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the response code is-->"+responseCode);
		try {
			message=openconnection.getResponseMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the response message is-->"+message);
		InputStream inputStream = openconnection.getInputStream();
		InputStreamReader inputstreamreader=new InputStreamReader(inputStream);
		BufferedReader br=new BufferedReader(inputstreamreader);
		String line;
		StringBuffer sb=new StringBuffer();
		while((line=br.readLine())!=null)
		{
			sb.append(line);
		}
		System.out.println(sb);
	}
	
	
	public void postexample() throws IOException
	{
		URL url=new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-type", "application/json");
		connection.setDoOutput(true);
		
		String jsondata="{\"name\":\"babi\",\"salary\":\"2000\",\"age\":\"20\"}";
		byte[] jsonbytes = jsondata.getBytes();
		
		OutputStream outputstream = connection.getOutputStream();
		outputstream.write(jsonbytes);
		System.out.println(connection.getResponseCode());
		System.out.println(connection.getResponseMessage());
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader reader=new InputStreamReader(inputStream);
		BufferedReader br=new BufferedReader(reader);
		String line;
		StringBuffer sb=new StringBuffer();
		while((line=br.readLine())!=null)
		{
			sb.append(line);
		}
		System.out.println("new id details is-->"+sb);
		
	}
	public void getsingledata() throws IOException
	{
		try {
			url=new URL("https://dummy.restapiexample.com/api/v1/employee/887");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			openconnection = (HttpsURLConnection)url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			openconnection.setRequestMethod("GET");
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			openconnection.connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			responseCode = openconnection.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the response code is-->"+responseCode);
		try {
			message=openconnection.getResponseMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the response message is-->"+message);
		InputStream inputStream = openconnection.getInputStream();
		InputStreamReader inputstreamreader=new InputStreamReader(inputStream);
		BufferedReader br=new BufferedReader(inputstreamreader);
		String line;
		StringBuffer sb=new StringBuffer();
		while((line=br.readLine())!=null)
		{
			sb.append(line);
		}
		System.out.println(sb);
	}
	


	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		httprequestexample hp=new httprequestexample();
		hp.getsingledata();
	}

}
