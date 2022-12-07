package com.Updwncst;

public class Solution {
		public static void main(String[] args) {
			Vehicle v = new Car();//Upcasting
			v.start();
			System.out.println("----------------");
			Car c =  (Car) v; //Downcasting
			c.start();
			c.stop();
		}
	}

