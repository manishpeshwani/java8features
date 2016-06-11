package com.manish.nio.examples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class ChannelToChannelTransferExample {

	public static void main(String[] args) throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("C:\\Git\\java8features\\src\\com\\manish\\nio\\examples\\test.txt","rw");
		FileChannel fromChannel = aFile.getChannel();
		
		RandomAccessFile bFile = new RandomAccessFile("C:\\Git\\java8features\\src\\com\\manish\\nio\\examples\\testTo.txt","rw");
		FileChannel toChannel = bFile.getChannel();
		
		fromChannel.transferTo(0, fromChannel.size(), toChannel);

	}
	

}
