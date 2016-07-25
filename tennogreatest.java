package aa;

import java.util.Scanner;

public class tennogreatest {
	public static void main(String[] args){
		int a[]=new int[10];
		int max;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(int j=0;j<10;j++){
			if(max<a[j]){
				max=a[j];
			}
			
		}
		System.out.println(max);
	}

}
