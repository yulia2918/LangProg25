//пример обобщенного интерфейса
interface Containment<T>  {
	//проверка содержимого объекта некоторого класса на наличие указанного элемента
	boolean contains(T o);
}
//обобщённые типы ограничиваются только теми классами, которые расширяют класс number
class NumFns<T extends Number> { 
	T num;
	NumFns (T n) {
		num = n;
	}
	//получение обратной величины num
	double inverse() {
		return 1/num.doubleValue();
	}
	//получение целой части num
	int whole() {
		return num.intValue();
	}
	//получение дробной части num
	double dr() {
		return num.doubleValue() - num.intValue();
	}
	//использование шаблонов аргументов
	boolean absEqual (NumFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
}
	// при помощи конструкции "T, V extends T" можно выполнять проверку совместимости типов при создании новых объектов 
	class A <T, V extends T>{
		T first;
		V second;
		
		A(T a, V b) {
			first = a;
			second = b;
		}
	}
//использование ограниченных шаблонов
class B{//родительский класс для B_A, B_B, B_C
}
class B_A extends B {
}
class B_B extends B {
}
class B_C extends B {
}
class BA {//самостоятельный класс не имеющий родственных связей с B
}
class Gen1<T> {
	T ob;
	Gen1 (T o) {
		ob = o;
	}
}
class Test {
	//передаваемый обобщённый класс типа ограничивается классов b и его потомками
	static void test (Gen1<? extends B> o) {
	}
	//передаваемый обобщённый класс типа ограничивается классов b_a и его родителями
	static void test2 (Gen1<? super B_A> o) {
	}
}
class GenM {
	//метод определяющий совпадают ли содержимое двухмассивов
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
		//сравнение длины массивов
		if(x.length != y.length)
			return false;
		
		for(int i=0; i<x.length; i++)
			if(!x[i].equals(y[i]))
				return false;
		return true;
	}
}
//обобщённый конструктор 
class Summation {
	private int sum;
	<T extends Number> Summation(T arg) {
		sum = 0;

		for (int i = 0; i <= arg.intValue(); i++)
			sum += i;
	}
	int getSum() {
		return sum;
	}
}

//реализация обобщённого интерфейса
class ClassGenInt<T> implements Containment<T> {
	//класс реализующий обобщённый интерфейс должен быть обобщённым
	T[] arrayRef;
	ClassGenInt(T[] o) {
		arrayRef = o;
	}
	//реализация метода conteins()
	public boolean contains(T o) {
		for(T x:arrayRef)
			if(x.equals(o)) return true;
		return false;
	}
}
//при реализации обобщённого типа можно ограничить вот так:
//class ClassGenInt2 implements Containment<Integer> {
//. . .
//}

//class ClassGenInt3 <T extends Number> Containment<T> {
//...
//}
class pr02 {
	public static void main(String args[]) {
		NumFns<Integer> iOb = new NumFns<Integer>(5);
		System.out.println("Обратная величина iOb: " + iOb.inverse());
		System.out.println("Целая часть iOb: " + iOb.whole());
		System.out.println("Дробная часть iOb: " + iOb.dr());

		NumFns<Double> dOb = new NumFns<Double>(10.14);
		System.out.println("Обратная величина dOb: " + dOb.inverse());
		System.out.println("Целая часть dOb: " + dOb.whole());
		System.out.println("Дробная часть dOb: " + dOb.dr());
		//String не является классом совместимым с Number

		//проверка совместимости типов при создании объектов класса A
		A<Integer, Integer> x = new A<Integer, Integer>(1,2);
		A<Number, Integer> y = new A<Number, Integer>(1.1,2);
		
		//Демонстрация вызова метоа absEqual() и использованием шаблонов аргументов <?> (wildcard)
		NumFns<Integer> intOb = new NumFns<Integer>(6);
		NumFns<Double> doubleOb = new NumFns<Double>(-6.0);
		NumFns<Long> longOb = new NumFns<Long>(5L);
		
		System.out.println("Сравнение int и double");
		if(intOb.absEqual(doubleOb))
			System.out.println("Абсолютные значения величин совпадают");
		else
			System.out.println("Абсолютные значения величин не совпадают");
		
		System.out.println("Сравнение абсолютных значений int и long"); 
		if(intOb.absEqual(longOb))
			System.out.println("Абсолютные значения величин совпадают");
		else
			System.out.println("Абсолютные значения величин не совпадают");
		//демонстрация использования ограниченных шаблонов
		B b1 = new B();
		B_A b2 = new B_A();
		B_B b3 = new B_B();
		B_C b4 = new B_C();
		BA ba1 = new BA();
		Gen1<B> w1 = new Gen1<B>(b1);
		Gen1<B_A> v2  = new Gen1<B_A>(b2);
		Gen1<B_B> v3  = new Gen1<B_B>(b3);
		Gen1<B_C> v4  = new Gen1<B_C>(b4);
		Gen1<BA> v5  = new Gen1<BA>(ba1);

		//тип параметра при вызове статического метода тест ограничивается шаблоном
		Test.test(w1);
		Test.test(v2);
		Test.test(v3);
		Test.test(v4);
		//test.test(v5); - не скомпилируется в связи с тем что v5 имеет тип, не являющийся родственным классу B
		
		//использование и демонстрация обобщённого метода arraysEqual определённого в классе GenM
		Integer nums[] = {1, 2, 3, 4, 5};
		Integer nums2[] = {1, 2, 3, 4, 5};		
		Integer nums3[] = {1, 2, 7, 4, 5};
		Integer nums4[] = {1, 2, 7, 4, 5, 6};

		if(GenM.arraysEqual(nums, nums))
			System.out.println("Массив nums совпадает сам с собой");
		if(GenM.arraysEqual(nums, nums2))
			System.out.println("Массив nums и nums2 совпадает");
		if(GenM.arraysEqual(nums, nums3))
			System.out.println("Массив nums и nums3 совпадает");
		if(GenM.arraysEquals(nums, nums4))
			System.out.println("Массив nums и nums4 совпадает");

		String s1[] = {"первая строка", "вторая строка"};
		String s2[] = {"первая строка", "вторая строка"};
		String s3[] = {"первая строка", "вторая  строка"};

		if(GenM.arraysEqual(s1, s2))
			System.out.println("Массивы s1, s2 совпадают");
		if(GenM.arraysEqual(s1, s3))
			System.out.println("Массивы s1, s3 совпадают");

		Number nums5[] = {1.0, 2.0, 3.0, 4.0, 5.0};
		Number nums6[] = {1.1, 2.1, 3.1, 4.1, 5.1};
		
		//if (GenM.arraysEqual(nums5, nums))
		//	System.out.println("Массивы nums5, nums совпадают");
		//if (GenM.arraysEqual(nums6, nums5))
		//	System.out.println("Массивы nums6, nums5 совпадают");

		//использование класса с обобщённым констурктором
		System.out.println();
		Summation ob = new Summation(4.2);
		System.out.println("Сумма целых чисел от 0 до 4.2 равна: " + ob.getSum());

		System.out.println();
		Summation ob2 = new Summation(4);
		System.out.println("Сумма целых чисел от 0 до 4 равна: " + ob2.getSum());

		//демонстрация использования реализации обобщённого интерфейса
		System.out.println();
		Integer x10[] = {1, 2, 3};
		Double y10[] = {1.0, 2.0, 3.0};
		ClassGenInt<Integer> ob3 = new ClassGenInt<Integer>(x10);

		if (ob3.contains(2))
			System.out.println("2 содержится в ob3");
		else
			System.out.println("2 не содержится в ob3");
		
		if (ob3.contains(4))
			System.out.println("4 содержится в ob3");
		else
			System.out.println("4 не одержится в ob3");

		ClassGenInt<Double> ob4 = new ClassGenInt<Double>(y10);

		if (ob4.contains(2.0))
			System.out.println("2.0 содержится в ob4");
		else
			System.out.println("2.0 не содержится в ob4");
		
		if (ob4.contains(4.0))
			System.out.println("4.0 содержится в ob4");
		else
			System.out.println("4.0 не содерится в ob4");
	}
}
