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

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class httprequestexampldelete {
	URL url;
	HttpsURLConnection openconnection;
	int responseCode;
	String message;
	public void getmethodexample() throws IOException
	{
		try {
			url=new URL("https://dummy.restapiexample.com/api/v1/delete/9");
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
		
		openconnection.setRequestMethod("DELETE");
	 responseCode = openconnection.getResponseCode();
		 message = openconnection.getResponseMessage();
		System.out.println("the response code is"+responseCode);		
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
		httprequestexampldelete hp=new httprequestexampldelete();
		hp.getmethodexample();
	}

}
