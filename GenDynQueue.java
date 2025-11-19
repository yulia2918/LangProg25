//обобщённый класс динамической очереди
class GenDynQueue<T> implements IGenQ<T> {
	private int putloc, getloc;
	private T[] q;
	public GenQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;
	}
	public void put(T obj) throws QueueFullException {
		if (putloc==q.length) {
			//T[] t = new T[q.length * 2];
			for (int i =0; i<q.length; i++)
				t[i] = q[i];
			g=t;
		}
		//	throw new QueueFullException(q.length);
		q[putloc++] = obj;
	}
	public T get() throws QueueEmptyException {
		if(getloc == putloc)
			throw new QueueEmptyException();
		return q[getloc++];
	}
}
