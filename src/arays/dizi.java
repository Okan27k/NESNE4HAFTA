package arays;

public class dizi {
	
	public static void main(String[]args){
	int length=9;
	int[] array = {1,2,3,4,5,6,7,8,9,10};
	
	System.out.printf("%s%8s%n", "Index","Value");
	
	for (int counter=0; counter < 10; counter++) {
		System.out.printf("%5d%8d%n", counter,array[counter] );
	}
		for (int counter=0; counter < 5; counter++) {	
			int temp=0;
			temp=array[length];
			array[length]=array[counter];
			array[counter]=temp;
			length--;
			
	}
		for(int i=0;i<10;i++) {
			System.out.printf("%5d%8d%n",i,array[i]);
		}
	}
	
	

}
