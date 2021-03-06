public interface Deque<T>{

    public void addFirst( T t );
    public void addLast( T t );
    public T getFirst();
    public T getLast();
    public T removeFirst();
    public T removeLast();
    public int size();
    public boolean isEmpty();

    // Methods for FIFO behavior
    public void add( T t );
    public T remove();

    // Methods for FILO behavior
    public void push( T t );
    public T pop();

    // For both FILO and FIFO
    public T peek();
}
