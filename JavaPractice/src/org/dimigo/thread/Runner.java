/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_Runner
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 *
 * @author : 이은영
 * @version : 1.0
 */
public class Runner extends Thread{
		private String name;
		public Runner(){
			
		}
		public Runner(String name){
			this.name=name;
		}
		public void run(){
			System.out.println(name+"출발");
			for(int i=0;i<=10;i++){
				System.out.println(name + " " + (100-10*i) + " 미터");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(name+" 골인");
		}
}
