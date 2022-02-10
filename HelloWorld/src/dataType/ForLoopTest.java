package dataType;

public class ForLoopTest {

	public static void main(String[] args) {
		for (int n=1;n<5;n++) {
			for (int i=1;i<10;i++) {
				if (i%2==0) 
					System.out.print(i++ + " ");
			}

			System.out.println();
	}
		
}

}
