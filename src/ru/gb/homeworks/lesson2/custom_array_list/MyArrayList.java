package ru.gb.homeworks.lesson2.custom_array_list;

public class MyArrayList<T> {
    private final Integer INITIAL_SIZE = 16;
    private T[] data;
    private Integer size = INITIAL_SIZE;
    private Integer indexOfLastElement = -1;

    public MyArrayList() {
        init(null);
    }

    public MyArrayList(Integer size) {
        init(size);
    }

    private void init(Integer size) {
        if (size != null && size > 0) {
            this.size = size;
        }
        makeEmptyArray();
    }

    public void add(T element) {
        indexOfLastElement++;
        data[indexOfLastElement] = element;
        growIfFull();
    }

    public T get(Integer index) {
        if (withinFilledArraySize(index)) {
            return data[index];
        } else
            throw new ArrayIndexOutOfBoundsException("No elements found at given index: " + index);
    }


    public void delete(int index){
        if(withinFilledArraySize(index)){
            if(index == indexOfLastElement){
                indexOfLastElement--; //last element will be replaced in case new is added
            } else {
                T temp = null;
                for(int i = index; i < indexOfLastElement -1 ; i++){ //replace deleted with next by index and so on
                    temp = data[i+1];
                    data[i] = temp;
                }
                data[indexOfLastElement - 1] = temp;
                indexOfLastElement--;
            }
        } else throw new ArrayIndexOutOfBoundsException("No elements found at given index: " + index);
    }

    private void growIfFull() {
        if (indexOfLastElement == size - 1) {
            size = (int) (size * 1.5); //make size bigger
            T[] temp = data;

            makeEmptyArray();
            for (int i = 0; i <= indexOfLastElement; i++) { //transfer all elements to new array
                data[i] = temp[i];
            }
        }
    }

    private void makeEmptyArray() {
        data = (T[]) new Object[size];
    }

    public Integer getSize() { //will return how many elements are in collection
        return indexOfLastElement + 1;
    }

    private boolean withinFilledArraySize(Integer index){
        return (index <= indexOfLastElement && index >= 0);
    }
}
