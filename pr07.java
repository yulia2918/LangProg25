class ExcTest {
	//генерация исключительной ситуации
	static void genException() {
		int nums[] = new int[4];
		System.out.println("До исключительной ситуации");
		nums[8] = 10;
		System.out.println("строка после исключительной ситуации внутри try");
	}
}
//получение подробной информации об исключениях при помощи метода throwable
class pr07 {
	public static void main(String args[]){
		int nums[] = new int[4];
		int number[] = {4,8,16,32,64,128,256,512};
		int denom[] = {2,0,4,4,0,8};
		for (int i=0; i<number.length; i++) {
			try {
				System.out.println(number[i] + " / " + denom[i] + " = " + number[i]/denom[i]);
			}
			catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("Исключительная ситуация: вызод за границы массива");
				System.out.println(exc);
				System.out.println("\nТрассировка стека: ");
				exc.printStackTrace();
				System.out.println("Информация об исключении, представляемая методом toString(): ");
				System.out.println(exc.toString());
			}
			catch (Throwable exc) {
				System.out.println("Исключение для которого не написан спец. обработчик");
			}

		}
	}
}
