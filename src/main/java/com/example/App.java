package com.example;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.google.common.collect.ImmutableList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ImmutableList<String> fruits=ImmutableList.of("Apple","Banana","Cherry");
    	System.out.println(fruits);
    	File sourcefile =new File("source.txt");
    	File destfile= new File("destination.txt");
    	try{
    		FileUtils.copyFile(sourcefile,destfile);
    		System.out.println("Successfully copied");
    	}
    	catch(IOException e){
    		System.out.println("Error:"+e.getMessage());
    	}
        System.out.println( "Hello World!" );
    }
}
