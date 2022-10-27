package arays;

public class finall {
	
	public static void main(String[]args){
	
	final int array_length =10;
	int[] array=new int[array_length];
	
	
	for (int counter=0; counter<10;counter++) {
		array[counter]=2+2*counter;
		
	}
	System.out.printf("%s%8s%n","Index","Value");
	
	for (int counter=0; counter<10;counter++) {
		System.out.printf("%5d%8d%n",counter,array[counter]);
	}
	
	
	}
	

}
