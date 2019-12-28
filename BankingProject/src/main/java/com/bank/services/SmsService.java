package com.bank.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Service;

@Service
public class SmsService {

	public int sendSms(long phoneNo, String name) {
		int OTP;
		try {
			// Construct data
			String apiKey = "apikey=" + "8epO8LWjUxU-1314zZL1f1uPaweaCLlak2yihGXYge";
			Random rand = new Random();
			OTP = rand.nextInt(999999);
			String message = "&message=" + "Hey "+name+" your OTP is "+OTP;
			String sender = "&sender=" + "Hera Pheri Bank";
			String numbers = "&numbers=" + "9632752763";
			
			// Send data
			System.out.println(message);
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			JOptionPane.showConfirmDialog(null, "OTP SEND SUCCESSFULLY!!");
			return OTP;
//			return stringBuffer.toString();
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
//			return "Error "+e;
			System.out.println("error"+e);
			return 0;
		}
	}
	
}
