import java.util.Arrays;

public class ArraySorting {
	
	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		int temp = 0,min;
//	for(int i:arr) {
//		System.out.println(i);
//	}
////		System.out.println("Sorted array with Java API");
//		long start =System.currentTimeMillis();
//		Arrays.sort(arr);
//		
//		long end=System.currentTimeMillis();
//		System.out.println("time Taken: "+(end-start)+ "ms");
////		
////		for(int i:arr) {
////			System.out.println(i);
////		}
//	
//	start=System.currentTimeMillis();
//	end=System.currentTimeMillis();
//	
//	System.out.println("time Taken: "+(end-start)+ "ms");
		
		
		
		
		
		
		
////	//bubble sort
//	
	for(int i=0;i<arr.length-1;i++) {
		
	for(int j=0;j<arr.length-1-i;j++) {
		
		if(arr[j]>arr[j+1]) {
		    temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
	
	}
        
		
	}	System.out.println("Bubble Sort");
	for (int i = 0; i < arr.length; ++i) {
		System.out.println(arr[i]); }
		
		
		
		
	
//selection sort	
//	
//	   for (int a=0;a<arr.length-1;a++) {
//		   	  min=a;
//		   for(int b=a;b<arr.length;b++) {
//			   if(arr[b]<arr[min]);
//			   min=b;
//			   
//			   
//			   
////			   if(arr[b]>arr[b+1]) {
////				    temp=arr[b];
////					arr[b]=arr[b+1];
////					arr[b+1]=temp;
////				}
//			  }
//		   
//		   
//		   
//	   }
//	   for(int a=0;a<arr.length;a++) {
//		   System.out.println(arr[a]);
//	   }
//	   
	}
	}


		


