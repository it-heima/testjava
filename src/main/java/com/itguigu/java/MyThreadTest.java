package com.itguigu.java;

class Mythread extends Thread{
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		super.run();
		for(int i=0;i<100;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}

public class MyThreadTest {

	public static void main(String[] args) {
		Mythread mythread=new Mythread();
		mythread.start();
	}

}
