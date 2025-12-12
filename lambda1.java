//пример лямбда-выражения:
//()-> 100; возврат значения 100 при вызове лямбда функции при отсутствии параметров
//(n) -> 1/n; возврат обратного значения параметра (передаётся 1 параметр)
//(n,m) -> n/m; возврат отношения параметра n к параметру m;
//подобные действия в традю записи выглядят так:
class myClacc {
	static int myMeth() {
		return 100;
	}
}
//пример интерфейса абстрактого метода myMeth() и MyMeth2()
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
//для вызова реализованного метода mymeth() необходимо создать новый объект MeClass1 и вызвать метод указывающей на этот объект
//альтернативное решение с использованием лямбда функции и функц. интерфейса
interface MyFUNCinterface {
	int MyMeth();
}
//лямбда выражение может быть присвоено переменной функционального интерфейса
MyFUNCinterface var1 = () -> 100;
System.out.println("Вызов лямбда функции для переменной var1: " + var1.MyMeth());
System.out.println("Вызов лямбда функции для переменной var2: " + var2.MyMeth());

interface FUNCinterface2 {
	double MyMeth(int n);
}
FUNCinterface2 reciprocal = (n)->(double)1/n;
System.out.println("Результат ызова метода интерфейса с одним параметром (обратное значение параметра): " + reciprocal.MyMeth(10));
