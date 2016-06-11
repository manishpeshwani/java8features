package com.manish.nio.examples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelExample {

	public static void main(String[] args) throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("C:\\Git\\java8features\\src\\com\\manish\\nio\\examples\\test.txt","rw");
		FileChannel fileChannel = aFile.getChannel();
		
		ByteBuffer buf = ByteBuffer.allocate(48);
		System.out.println("Starting to read....");
		int result = fileChannel.read(buf);
		
		while(result != -1){
			System.out.println("Read:" + result);
			buf.flip();
			while(buf.hasRemaining()){
				System.out.print((char)buf.get());
			}
			buf.clear();
			result = fileChannel.read(buf);
		}

	}

}
