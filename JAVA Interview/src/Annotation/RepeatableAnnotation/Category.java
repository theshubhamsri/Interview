package Annotation.RepeatableAnnotation;

import java.lang.annotation.Repeatable;

@Repeatable(Categories.class)
@interface Category {
    //This way we can define more field as well
    //there should not be any parameter or body just () braces only
    // We can provide default value as well but default value can't be
    //null
    String name() default "hello";
}
