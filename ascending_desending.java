package array_package;

import java.util.Scanner;

public class ascending_desending {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int temp=0;
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		   for (int i = 0; i < a.length; i++) {     
	            for (int j = i+1; j < a.length; j++) {     
	               if(a[i] > a[j]) {    
	                   temp = a[i];    
	                   a[i] = a[j];    
	                   a[j] = temp;    
	               }     
	            }     
	        }    
		 System.out.println();   
		System.out.println("Acending oredr of  array elements");
		for(int e:a) {
			System.out.println(e+ " ");
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] < a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			}
		 System.out.println();   
			System.out.println("Decending oredr of  array elements");
			for(int e:a) {
				System.out.println(e+ " ");
			}

		}

}
