package com.davidf.App;

import java.io.BufferedReader;
import java.io.IOException;

public class Lector {
	private BufferedReader reader;

	public Lector(BufferedReader reader) {
		this.reader = reader;
	}
	
	public void lee() throws IOException {
		boolean eof = false;
		String linea;
		
		// Mientras no encuentre el final del archivo seguirá leyendo
		while(!eof) {
			linea = reader.readLine();
			
			if(linea==null) {
				eof = true;
			} else {
				System.out.println(linea);
			}
		}
	}
	
}
