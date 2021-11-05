public class SortedArrayPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {

    protected class ArrEntry<K,E> implements Entry<K,E>{
        K key;
        E element;

        public ArrEntry (K k, E e){
            key =  k;
            element = e;
        }
    }
    ArrEntry<K,E> []array;

    int n = 0;
    int defaultsize = 1000;

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    private static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void insert(Entry<K, E> entry) {
        if(isEmpty()){
            array[n] = entry;
            n++;
        }
        else{
            n++; /* Tăng kích thước của hàng đợi lên 1
            khi ta chèn thêm phần tử vào */
            int i = n;    /* N là biến toàn cục, không nên thay đổi giá trị của nó,
                    ta sử dụng biến tạm i ở đây, để có thể tùy ý xử lý */
            array[i] = entry.element; /* Trước tiên phần tử được chèn vào vị trí cuối cùng của hàng đợi */
            // array[i/2] < array[i]
            while( i > 1 && (array[i/2].element < array[i].element)) /* Nếu giá trị node cha nhỏ hơn giá trị của nó */
            {
                swap(A[ i/2 ], A[ i ]); /* Đổi chỗ hai node */
                i = i/2;                     /* Tiếp tục kiểm tra tại vị trí của node cha */
            }
        }
       

    }

    public void insert(K k, E e) {
        ArrEntry arrEntry = new ArrEntry(k, e);
        if(isEmpty()){
            array[n] = arrEntry;
        }
        else{

        }

    }

    public Entry<k, E> removeMin() {

    }

    public Entry<k, E> min() {

    }
}


void insert_element(int A[ ], int val)
{
   
}