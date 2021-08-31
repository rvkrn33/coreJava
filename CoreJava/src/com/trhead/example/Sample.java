package com.trhead.example;

public class Sample extends Thread {
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			
			if(i<=3)
			{
				if(this.getName().equals("First"))
					System.out.println(this.getName()+"--->"+i);
			}
			
			if(i>3)
			{
				if(this.getName().equals("Second"))
					System.out.println(this.getName()+"--->"+i);
			}
			
			try {
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		Sample sa=new Sample();
		sa.setName("First");
		
		Sample sa1=new Sample();
		sa1.setName("Second");
		
		sa.start();
		sa1.start();
		
	}

}
