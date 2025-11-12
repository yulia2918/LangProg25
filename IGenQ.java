public IGenQ <T> {
	//метод помещения в очередь
	void put (T ch) throws QueueFullException;
	//извлечение элемента
	T get() throws QueueEmptyException;
}
