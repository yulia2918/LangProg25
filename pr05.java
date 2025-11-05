class pr04 {
	public static void main(String args[]) {

		try { //генерацияисключения вручную
		      System.out.println("до оператора throw");
		      throw new ArithmeticException();
	        }
		catch (ArithmeticException exc) {
			System.out.println("перехват исключения класса arithmeticexception");
		}
		System.out.println("после oператора catch");	
	}
	
}
