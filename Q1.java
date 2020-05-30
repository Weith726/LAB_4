package homework4;

public class Q1 {

	public static void main(String[] args) {
		int arrayA[] = {29,100,39,41,50,8,66,77,95,15};
		int average=0;
		int total=0;
		for (int i = 0; i < arrayA.length; i++) {
			total += arrayA[i];
			
		}
		average = total/arrayA.length;
		System.out.println("平均值"+average);
		System.out.println("大於平均值的元素");
		for (int i = 0; i < arrayA.length; i++) {
			if(arrayA[i]>average) {
				System.out.print(arrayA[i]+" ");
			}
		}
	}
}
