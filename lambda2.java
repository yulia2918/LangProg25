class myClacc {
	static int myMeth() {
		return 100;
	}
}
interface MyInterface {
	int MyMeth();
	String MyMeth2();
}
class MyClass1 implements MyInterface {
	public int MyMeth() {
		return 100;
	}
	public String MyMeth2() {
		//...
		return "Строка";
	}
}
MyInterface var2 = new MyClass1();
interface MyFUNCinterface {
	int MyMeth();
}
MyFUNCinterface var1 = () -> 100;
System.out.println("Вызов лямбда функции для переменной var1: " + var1.MyMeth());
System.out.println("Вызов лямбда функции для переменной var2: " + var2.MyMeth());
interface FUNCinterface2 {
	double MyMeth(int n);
}
FUNCinterface2 reciprocal = (n)->(double)1/n;
System.out.println("Результат ызова метода интерфейса с одним параметром (обратное значение параметра): " + reciprocal.MyMeth(10));

interface INT3 {
	double MM(int x, int m);
}

INT3 delen = (x,m)->(double)x/m;
System.out.println(delen.MM(9,4));


