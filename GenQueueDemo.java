class GenQueueDemo {
	public static void main (String[] args) {
		//создаем очередь
		Integer[] iArray = new Integer[4];
		GenQueue<Integer> q = new GenQueue<Integer>(iArray);
		Integer iVal;
		System.out.println("Операции с очередью из Integer");
		try {
			for (int i=0; i < 6; i++) {
				System.out.println("Добавляем " + i + " в очередь q");
				q.put(i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Извлечение элемента из очереди");
				iVal = q.get();
				System.out.println(iVal);
			}
		}
		catch(QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();

		//очередь String
		String[] sArray = new String[10];
		GenQueue<String> q1 = new GenQueue<String>(sArray);
		String sVal;
		System.out.println("Операции с очередью из String");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Добавляем строку " + i + " в очередь q1");
				q1.put("Строка " + i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("извлечение строки из q1");
				sVal = q1.get();
				System.out.println(sVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();		
		//кольцевая очередь
		Integer[] iArray1 = new Integer[4];
		GenCircQueue<Integer> q2 = new GenCircQueue<Integer>(iArrat1);
		System.out.println("операции с кольцевой очередью из Integer");
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("Добавляем " + i + " в очередь из q2: ");
				q2.put(i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
			}
		System.out.println();
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("Извлечение элемента  из q2:");
				iVal = q2.get();
				System.out.println(iVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();
	}
}
