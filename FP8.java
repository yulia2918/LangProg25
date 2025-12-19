interface MyFunc {
    MyClass Func(String S);
}
MyFunc myClassCons = MyClass::new;
class MyClass {
    private String str;
    MyClass(String s) {
        str = s;
    }
    MyClass() {
        str = "";
    }
    String getStr() {
        return str;
    }
}
MyClass mc = myClassCons.Func("Строка");
mc.getStr()
interface MyFunc2 {
    MyClass func();
}
MyFunc2 myClassCons2 = MyClass::new;
MyClass mc2= myClassCons2.func();
mc2.getStr()
interface MyClassArrayCreator {
    MyClass[] func(int n);
}
MyClassArrayCreator mcArrayConc = MyClass[]::new;
MyClass[] a = mcArrayConc.func(3);
uO.apply(3)
UnaryOperator<String> uO = (s) -> s + " " + s;
uO.apply("Строка-тест")
bO.apply(15,3)
bO.apply(4,3)
bO.apply(4.0,3.0)
BinaryOperator<String> bO = (s1, s2) -> s1+s2;
bO.apply("Строка1","Строка2")
cons.accept(5)
Consumer<Integer> cons = (n) -> {
    System.out.println("приняли параметр " + n);
    n = n+5;
    System.out.println("изменённое значени параметра: " + n);
};
cons.accept(5)
static double test(int a, int b) {
    return (double)a/b;
}
Supplier<Double> suppl = () -> test(10,3);
suppl.get()
Function<String, Integer> func = (str) -> str.length();
func.apply("String-test")
Predicate<Integer> pred = (n) -> n<5;
pred.test(10)
pred.test(4)