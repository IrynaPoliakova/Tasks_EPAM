package ua.epam;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.AnnotatedElement;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        // write your code here
        Triangle triangle = new Triangle(3, 4, 5);
        //System.out.println(triangle.square());
        Triangle square = new Quadrangle(2, 2, 2, 2);
        //System.out.println(square.square());


        Class clazz = triangle.getClass();
        Object obj = clazz.newInstance();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyFirstAnn.class)) {
                method.invoke(obj);
                System.out.println(method.getName());
            }
        }

        Class c = square.getClass();
        Field[] allFields = c.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("Модификатор:" + field.getModifiers() + "\n" +
                    "Тип: " + field.getType() + "\n" + "Имя: " + field.getName());
        }

        Method[] methodsAll = c.getDeclaredMethods();
        for (Method m : methodsAll) {
            Annotation[] annotations = m.getAnnotations();
            System.out.print("\t");
            for (Annotation a : annotations){
                System.out.print("@" + a.annotationType().getSimpleName() + " ");
            }
        }

    }
}
