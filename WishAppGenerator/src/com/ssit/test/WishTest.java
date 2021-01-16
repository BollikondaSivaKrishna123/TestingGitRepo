package com.ssit.test;

import com.ssit.wish.WishMessage;

public class WishTest {

	public static void main(String[] args) {
		WishMessage wm=new WishMessage();
		System.out.println(wm.getDate());
		System.out.println(WishMessage.sum(10, 20));
		System.out.println(WishMessage.sub(20, 10));
		System.out.println("Welcome to Github Show!!!");
	}
	

}
