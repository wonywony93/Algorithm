package Algoritm;

/*
 *선택정렬 -비효율적인 알고리
 *시간복잡도 : O(N^2) 
 * */

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,index,temp;
		int array[] = {1,10,5,8,7,6,4,3,2,9};
		index =0;
		
		for (int i=0; i<array.length; i++)
		{
			min =9999;
			
			for(int j=i; j<array.length; j++)
			{
				if(min>array[j])
				{
					min=array[j];
					index =j;
					
				}
			}
			temp =array[i];
			array[i]= min;
			array[index] = temp;
			
			
		}
		
		for(int i =0 ; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		

	}

}
