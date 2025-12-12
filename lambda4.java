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
interface FUNC4 {
    boolean MyMeth(int m, int n);
}
FUNC4 del3 = (n,m) -> (n+m)%2==0;
del3.MyMeth(5,2)
del3.MyMeth(6,2)
if (del3.MyMeth(6,2)) System.out.println("сумма четное число"); else System.out.println("сумма нечетное число");
if (del3.MyMeth(3,2)) System.out.println("сумма четное число"); else System.out.println("сумма нечетное число");
interface MyVlue {
    double getVlue();
}
interface MyParamVlue {
    double getVlue(double v);
}
MyVlue myVal;
myVal = () -> 35.5
myVal.getVlue()
MyParamVlue myPval = (n) -> n*n / 1000;
myPval.getVlue(50)
myPval.getVlue(10000)
FUNC4 lessThan = (n,m) -> (n<m);
lessThan.MyMeth(3,10)
lessThan.MyMeth(13,10)
FUNC4 absEquals = (n,m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
absEquals.MyMeth(-100,100)
absEquals.MyMeth(-110,100)
absEquals.MyMeth(110,100)
absEquals.MyMeth(100,100)
interface StringTest {
    boolean test (String aStr, String bStr);
}
isIn.test("Подстрока", "Строка")
isIn.test("Подстрока", "строка")
StringTest isIn = (a,b) -> a.indexOf(b) != -1;
isIn.test("Подстрока", "строка")
isIn.test("Подстрока", "Строка")
interface interface1 {
    int Meth(String a1, String b1);
}
String a = "строка";
a.compareToIgnoreCase(b)
String b = "строка111";
a.compareToIgnoreCase(b)
interface NumericFunc {
    int func(int n);
}
smallestF.func(12)
smallestF.func(9)
smallestF.func(25)
smallestF.func(7)
smallestF.func(7)
smallestF.func(11)
smallestF.func(11)
smallestF.func(25)
smallestF.func(17)