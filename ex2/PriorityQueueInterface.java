public interface PriorityQueueInterface<K , E>{
    public int size();
    public boolean isEmpty();
    public void insert(Entry<K, E> entry); //thêm một entry vào PQ
    public void insert(K k, E e); //thêm phẩn tử có key k và giá trị e vào PQ
    public Entry<k, E> removeMin(); //loại phần tử có giá trị nhỏ nhất
    public Entry<k, E> min(); //trả về phần tử có key nhỏ nhất
}

public interface Entry<K,E> {
    K getKey(); //K là khóa của phần tử
    E getValue(); //E là giá trị phần tử
}
