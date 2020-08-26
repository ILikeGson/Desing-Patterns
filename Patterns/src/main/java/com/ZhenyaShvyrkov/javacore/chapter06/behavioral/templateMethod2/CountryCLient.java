package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.templateMethod2;

public class CountryCLient {
    public static void main(String[] args) {
        Country country = new Poland();
        country.develop();

        country = new Finland();
        country.help();
    }
}
