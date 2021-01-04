package com.nt.beans;

import java.util.Random;

public final class Bat {
	public Bat() {
		System.out.println("Bat.Bat()");
	}
	
	public int scoreRuns() {
		int run=0;
		run=new Random().nextInt(200);
		return run;
	}
}