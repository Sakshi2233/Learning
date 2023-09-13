package com.ey.builder;

public class Computer {
private	String cpu;
private	int ram;
private	int hdd;
private	String gpu;
private	int ssd;
	
	

	public Computer(Builder builder) {
//	public Computer(String cpu, int ram, int hdd, String gpu, int ssd) {
		this.cpu = builder.cpu;
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.gpu = builder.gpu;
		this.ssd = builder.ssd;
	}
 
	@Override
	public String toString() {
		
		return "Computer[Cpu:" + cpu+",ram: "+ram+",hdd:"+hdd+",gpu"+gpu+",ssd: "+ssd+"]";
	}

	public static class Builder {
		private final String cpu;
		private final int ram;
		private final int hdd;
		private String gpu;
		private int ssd;
		
		
		public Builder(String cpu, int ram, int hdd) {
			super();
			this.cpu = cpu;
			this.ram = ram;
			this.hdd = hdd;
			//this.gpu = gpu;
			//this.ssd = ssd;
		}
		
		public Builder setGpu(String gpu) {
			this.gpu = gpu;
			return this;
		}

		public Builder setSsd(int ssd) {
			this.ssd = ssd;
			return this;
		}

		public Computer build() {
			Computer pc= new Computer(this);
			return pc;
		}
		
	
};}
