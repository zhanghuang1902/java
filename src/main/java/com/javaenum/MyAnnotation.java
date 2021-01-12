package com.javaenum;

/**
 * ClassName:MyAnnotation
 * Package:com.javaenum
 * Description:
 *
 * @date:2020/9/17 14:49
 * @author:zh
 */
public @interface MyAnnotation {

    String value() default "hello";
}
