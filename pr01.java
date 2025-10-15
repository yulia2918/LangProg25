class Gen<T> {
	T ob;
	Gen(T o) {
		ob = o;
	}
	T getOb() {
		return ob;
	}

	void showType() {
		System.out.println("Тип Т: " + ob.getClass().getName());
	}
}

class pro1 {
	public static void main(String[] args) {
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.getOb();
		System.out.println("Значение: " + v);
	}
}
