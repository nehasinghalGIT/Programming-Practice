package com.wbqa.loops;

public class PingPong {

	public String printPingPong(int num) {
		
			if (((num % 3) && (num % 5))==0)
			{
				System.out.println("PingPong");
				return "PingPong";
			} else if ((num % 3) == 0) {
				System.out.println("Ping");
				return "Ping";
			}

			else {
				System.out.println("Pong");
				return "pong";
			}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PingPong pp = new PingPong();
		String output = pp.printPingPong(9);

	}

}
