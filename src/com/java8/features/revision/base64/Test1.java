package com.java8.features.revision.base64;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class Test1 {
	public static void main(String[] args) throws IOException {
		String msg = "Hello, How are you ?";
		Base64.Encoder encoder = Base64.getEncoder();
		String res = encoder.encodeToString(msg.getBytes());
		System.out.println(msg);
		System.out.println(res);
		byte ar [] = {8, 7, 5, 3, 4};
		byte r[] = encoder.encode(ar);
		for(byte b : r) {
			System.out.print(b+" ");
		}
		System.out.println();
		Base64.Decoder decoder = Base64.getDecoder();
		byte a [] =decoder.decode(r);
		for(byte b : a) {
			System.out.print(b+ " ");
		}
//		First way
		String s = new String(decoder.decode(res));
		System.out.println(s);
//		Second way
		byte b[] =decoder.decode(res.getBytes());
		System.out.println(new String(b));
//		----------------------URL---------------------
		String url = "https://www.geeksforgeeks.org/converting-arraylist-to-hashmap-in-java-8-using-a-lambda-expression/?ref=lbp";
		Base64.Encoder urlencode = Base64.getUrlEncoder();
		String encodeurl = urlencode.encodeToString(url.getBytes());
		System.out.println(encodeurl);
		Base64.Decoder urldecode = Base64.getUrlDecoder();
		byte decodeurl[] = urldecode.decode(encodeurl.getBytes());
		System.out.println(new String(decodeurl));
//		------------Files-------------------------
		Path original = Paths.get("G:\\Netgear", "text1.txt");
		Path target = Paths.get("G:\\Netgear", "text2.txt");
		Base64.Encoder mime = Base64.getMimeEncoder();
		try(OutputStream out = Files.newOutputStream(target)){
			Files.copy(original, mime.wrap(out));
			OutputStream encoded = mime.wrap(out);
		}
	}
}
