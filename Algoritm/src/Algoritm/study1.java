package Algoritm;

public class study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,min,index,temp;
		index=0;
		int array[] = {1,10,5,8,7,6,4,3,2,9};
		
		for(i =0; i<10; i++)
		{
			min=99999;
			for(j=i; j<10;j++) {
				if(min>array[j])
				{
					min =array[j];
					index=j;
				}
			}
			temp=array[i];
			array[i] =array[index];
			array[index] =temp;
			
		}
		
			
			
			for(i = 0; i<10; i++) {
				System.out.print(array[i]+" ");
			}
			
		
		
	}

}



