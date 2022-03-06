package Algoritm;


/*
 * 퀵정렬
 * 시간 복잡도 O(N*logN)
 * 
 * */
public class quickSort {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int array[] = {1,10,5,8,7,6,4,3,2,9};
		int number =array.length;
		quickSort(array,0,number-1);
		
		for(int i =0; i<10; i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

	
	public static void quickSort(int[] data,int start,int end) {
		
		if(start>=end) { //원소가 1개인경우 
			return; 
		}
		
		int key = start;
		int i =start+1;
		int j =end ; 
		int temp;
		
		while(i<=j)//엇갈릴때까지 반복 
		{
			
			while(i <= end && data[i] <= data[key]) // 키값보다 큰 값을 만날때까지 오른쪽으로 이동시키겠다..
			{
				i++;	
			}
			while(data[j] > data[key] && j>start)// 키값보다 작은값을 만날때까지..
			{
				j--;
			}
			//키값보다 작은값없는상태 ..1이니까 
			
			if(i>j) { //현재 엇갈린상태면..
				temp=data[j];
				data[j] =data[key];
				data[key] =temp;
			}
			else
			{
				temp= data[j];
				data[j] = data[i];
				data[i] = temp;
			}
			
		}
		/*재귀함수*/
		quickSort(data, start, j-1); 
		quickSort(data, j+1, end); 

	}
	

}
