package com.cg.Streams;

import java.util.Random;

public class Random_number {
 public static void main(String[] args) {
	Random rand = new Random();
	rand.ints(1,100).limit(5).forEach(System.out::println);
}
}
