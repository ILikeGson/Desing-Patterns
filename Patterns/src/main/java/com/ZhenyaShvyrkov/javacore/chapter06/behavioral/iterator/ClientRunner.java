package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.iterator;

public class ClientRunner {
    public static void main(String[] args) {
        Container container = new PersonData("Vasya", new String[]{"Agent", "Manager", "Sportsmen"});
        Iterator iterator = container.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

}
