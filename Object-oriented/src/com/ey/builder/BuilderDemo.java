package com.ey.builder;

public class BuilderDemo {
	public static void main(String[] args) {
		Computer pc1=new Computer.Builder("Intel i3",16,512).build();
		System.out.println(pc1);
		
		Computer pc2=new Computer.Builder("Intel i5",32,512).setSsd(128).build();
		System.out.println(pc2);
	}

}
