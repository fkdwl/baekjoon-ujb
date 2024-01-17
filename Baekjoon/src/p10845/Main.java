package p10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<Integer>();
		
		/*
		try {
			int N = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < N; i++) {
				String inp = br.readLine();
				StringTokenizer st = new StringToken(inp);
				String cmd = "";
				int num = 0;
				
				int num = Integer.parseInt(st.nextToken());
			} else {
				cmd = st.nextToken();
			}
			
			switch(cmd) {
			case "push":
				System.out.println("push");
				q.offer(num);
				break;
			case "pop":
				System.out.println("pop");
				System.out.println(q.poll());
				break;
			case "size":
				System.out.println("size");
				System.out.println(q.size());
				break;
			case "empty":
				System.out.println("empty");
				System.out.println(q.isEmpty());
				break;
			case "front":
				System.out.println("front");
				System.out.println(q.peek());
				break;	
			case "back":
				System.out.println("back");
				System.out.println(q.peek()-1);
				break;	
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* 
		 
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		 
		위 코드를 아래 코드와 같이 줄여서(정리해서) 쓸 수 있다 
		 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		*/

	}

}
