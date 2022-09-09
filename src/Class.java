public class Class {
	public static void main(String[] args) {
		int i;
		int j;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			int x = 1;
			for (j = 1; j <= i; j++) {
				x = j * x;
			}
			sum = sum + x;
		}
		System.out.println("1!+2!+3!+4!+5!+6!+7!+8!+9!+10!=" + sum);
	}
}