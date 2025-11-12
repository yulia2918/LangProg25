class Rethrow {
	public static void genException() {
		int number[] = {4,8,15,32,64,128,256,512};
		int denom[] = {2,0,4,4,0,8};

		for(int i=0; i<number.length; i++) {
			try {
				System.out.println(number[i] + " / " + denom[i] + " = " + number[i]/denom[i]);
			}
			catch(ArithmeticException exc) {
				//перехват первого исключения
				System.out.println("недопустимая операция");
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				//перехват исключения связанного с выходом за границы массива
				System.out.println("сообщение из метода genException(): Выход за границы массива");
				throw exc; //повторная генерация
			}
		}
	}	
}

class pr06 {
	public static void main (String args[]) {
		try {
			Rethrow.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Сообщение из метода main(): выход за границы массива");
			System.out.println("аварийное завершение программы");
		}
	}
}
