package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.iterator;

public class PersonData implements Container {
    private String name;
    private String [] data;

    public PersonData(String name, String[] data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public Iterator getIterator() {
        return new DataIterator();
    }
    private class DataIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if(index < data.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return data[index++];
        }
    }
}
