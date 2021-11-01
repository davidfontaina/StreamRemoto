package com.davidf.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class Factory {
	
	public static BufferedReader getReader(String strUrl) throws
				IOException, MalformedURLException {
		
		URL url = new URL(strUrl);
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(url.openConnection().getInputStream()));
		
		return reader;
	}
}
