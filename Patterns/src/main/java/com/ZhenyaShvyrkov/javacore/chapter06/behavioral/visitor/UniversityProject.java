package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.visitor;

import java.util.Arrays;

public class UniversityProject implements University{
    private University universities[];

    public UniversityProject(){
        universities = new University[]{
                new Harward(),
                new Stanford(),
                new Massachusetts()};
    }



    @Override
    public void accept(Student student) {
        Arrays.stream(universities).forEach(x -> x.accept(student));
    }
}
