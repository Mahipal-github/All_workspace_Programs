package com.cg.Interface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableInterface implements Serializable{

	
	int i;
	String s;
	public SerializableInterface(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		SerializableInterface obj = new SerializableInterface(20, "gfg");
		
		FileOutputStream fos= new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializableInterface b = (SerializableInterface)ois.readObject();
		System.out.println(b.i+" "+b.s);
		oos.close();
		ois.close();
		
	}
}
