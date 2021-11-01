package com.davidf.App;


import java.io.IOException;
import java.net.MalformedURLException;

import com.davidf.factory.Factory;

public class App {

	public static void main(String[] args) throws MalformedURLException,
												  IOException {
		
		String url = "https://raw.githubusercontent.com/davidfontaina/"
				+ "StreamRemoto/main/ArchivosRemotos/TextoRemoto";
				
		Lector lector = new Lector(Factory.getReader(url));
		lector.lee();
	}
}
