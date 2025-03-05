package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		/*
		// 불변성(Immutable)의 String
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.hashCode()); //69609650
		System.out.println(str2.hashCode()); //69609650
		str2 = str2 + "world";
		System.out.println(str2.hashCode()); //468881952

		// 가변성(Mutable)의 StringBuilder, StringBuffer
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode()); //1706377736
		sb.append("123456");
		sb.append("Hello world");
		System.out.println(sb.hashCode()); //1706377736*/

		ByteService service = new ByteService();
		//service.fileBytrOutput();
		//service.bufferdeFileOutput();
		//service.fileByInput();
		//service.fileByInput2();
		//service.bufferedByteInput();
		//service.readProperty();
		service.fileCopy();
	}

}

