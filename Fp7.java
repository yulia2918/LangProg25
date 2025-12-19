Interface SomeTest<T> {
	boolean test(T n, T m);
}
isfactor.test(10, 3)
	SomeTest <Double> isfactor = n,d ->(n%d) == 0;
	SomeTest<String< isIn = (a,b) -> a.indexOf(b) != 1;
	interface StringFunc {
		String func(String str);
	}
static String changeStr(StringFunc sf, string s) {
	return sf.func(s);
}
String inStr = "исходная строка";
String outStr;
StringFunc reverse = (str) -> {String result = "";
	for(int i = str.length()-1; i>=0; i--)
		result +=str.charAt(i);
	return result;
}
outStr = changeStr(reverse, inStr);
outStr = changeStr(reverse, "вторая строка");
outStr = changeStr((str) -> {
	String result = "";
	char ch;
	for (int i=0; i<str.length();i++) {
		ch = str.charAt(i);
		if(Character.isUpperCase(ch))
			result+= Character.toLowerCase(ch);
		else
			result +=Character.toLowerCase(ch);
	}
	return result;
}
MyIOAction myIO2 = (rdr) -> {
	int ch = rdr.read();
	System.out.println("введен символ: " + ch);
	return true;
}
BufferedReader reader = new BufferedReader(new InputStremReader(Sistem.ib));
myIO.ioAction(reader)
interface MyIOActin {
	boolean ioAction (Reader rdr) throws IOException;
}
MyTransform<Double> sqrts = (v) -> {
	for(int i=0; i< v.length; i++)
		v[i] = Math.sqrt(v[i]);
}
Double arrayD[] = new Double[3];
class MyIntPredicates {
	static boolean isPrime(int n) {
		if (n<2) return false;
		for(int i=2; i<=n/i; ii++) {
			if((n%i) ==0)
				return false;
		}
		return true;
	}
	statis boolean isPositive(int n) {
		return n > 0;
	}
	static bollean isEven(int n) {
		return (n%2)==0;
	}
}
boolean result;
interface IntPredicate {
	boolean test(int n);
}

static boolean numTest(IntPredicate p, int v) {
	return p.test(v);
}
result = numTest(MyIntPredicates:: isPrime, 17);
class MyIntNum {
	private int v;
	MyIntNum(int x) {v=x;}
	int getNum() {return v;}
	boolean isFactor(int n) {
		return v%n) == 0;
	}
}
MyIntNum myNum = new MyIntNum(12);
interface IntPredicate {
	boolean test(int n);
}

interface SomeTest<T> {
	boolean test(T n, T m);
}
class MyClass {
	static <T> boolean myGenMeth(T x, T y) {
	boolean result = false;
	//..
	return result;
	}
}
SomeTest<Integer> mRef = MyClass::<Integer>myGenMeth
