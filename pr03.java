class ExcTest {
	//генерация исключительной ситуации
	static void genException() {
		int nums[] = new int[4];
		System.out.println("До исключительной ситуации");
		nums[8] = 10;
		System.out.println("строка после исключительной ситуации внутри try");
	}
}

class pr03 {
	public static void main(String args[]){
		int nums[] = new int[4];
		int number[] = {4,8,16,32,64,128,256,512};
		int denom[] = {2,0,4,4,0,8};
		for (int i=0; i<number.length; i++) {
			try {
				//System.out.println("До исключительной ситуации");
				//nums[8] = 10;
				//System.out.println("Строка после исключительной ситуации внтри блока try");
				//генерация исключительной ситуациипри вызове статического метода
				System.out.println(number[i] + " / " + denom[i] + " = " + number[i]/denom[i]);
				//ExcTest.genException();
			}
			//exc - переменная содержащая ссылку на объект исключения
			//ArrayIndexOutOfBoundsException - класс исключительной ситуации
			//catch {. . .} - блок перехвата исключения
		
			catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("Исключительная ситуация: вызод за границы массива");
			}
			//обработка событий класса arithmeticexception
			catch(ArithmeticException exc2) {
				System.out.println("Исключительная ситуация: неверная арифметическая операция");
			}
			System.out.println("После оператора catch");
		}
	}
}
