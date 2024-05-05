package Annotation.RepeatableAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Categories {
    //We have to define the array here to store the multiple values
    //we will provide via annotation
    Category[] value();
}
