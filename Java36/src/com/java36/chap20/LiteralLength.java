package com.java36.chap20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class LiteralLength {
	
	public static void main(String[] args) {
		String fileName = "D:/Literal.java";
		final int LARGE_NUM = 1000000; //1M
		final char CHAR = 'A';
		
		int low = 1;
		int high = LARGE_NUM;
		String header = "public class Literal {String s = \"";
		String tail = "\";}";
		StringBuilder middle = new StringBuilder();
		int compile_result;
		
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		OutputStream err = new OutputStream() {
			@Override
			public void write(int b) throws IOException {
				//do nothing
			}
		};
		
		int mid;	//这种方法消除溢出造成的错误
		while(true) {
			System.out.println("range: "+low+"~"+high);
			mid = (high+low)>>>1;
			if(low==mid) break;	//loop stop condition
			
			middle = new StringBuilder();
			for(int i=0; i<mid; i++) {
				middle.append(CHAR);
				
			}
			
			StringBuilder fileContent = new StringBuilder(mid + header.length()*2);	//avoid re-allocation
			fileContent.append(header);
			fileContent.append(middle);
			fileContent.append(tail);
			
			try {
				FileWriter fw = new FileWriter(fileName);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(fileContent.toString());
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//System.err can be used instead of err
			compile_result = compiler.run(null, null, err, fileName);	//return 0 for success, otherwise for errors
			
			if(compile_result==0) {
				low = mid;
			} else {
				high = mid;
			}
		}
		
		try {
			err.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
