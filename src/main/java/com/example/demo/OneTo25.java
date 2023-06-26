package com.example.demo;

import java.util.stream.IntStream;

public class OneTo25 {

	public static void main(String[] args) {
		IntStream.range(1, 26).forEach(System.out::println);
	}
}
