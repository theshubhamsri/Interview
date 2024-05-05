package Annotation.RepeatableAnnotation;

public class Main {
    public static void main(String[] args) {
//        Category[] annotationArray=new Eagle().getClass().getAnnotationsByType(Category.class);
//
//        for(Category annotation:annotationArray){
//            System.out.println(annotation.name());
//        }
        int a=4;
        int sum= a++ + ++a;
        System.out.println(sum);
    }
}
