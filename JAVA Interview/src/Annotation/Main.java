package Annotation;

public class Main {
    public static void main(String[] args) {
        System.out.println(new TestClass().getClass().getAnnotation(MyCustomAnnotationWithInherited.class));
    }
}
