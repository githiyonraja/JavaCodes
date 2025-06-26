package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

public class Reflection {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Bird> birdClass = Bird.class;
        String name = birdClass.getName();
        System.out.println(name);

        Method[] method = birdClass.getMethods();
        System.out.println(Arrays.toString(method));

        Method[] decMethod = birdClass.getDeclaredMethods();
        System.out.println(Arrays.toString(decMethod));

        Field[] field = birdClass.getFields();
        System.out.println(Arrays.toString(field));

        Field[] decField = birdClass.getDeclaredFields();
        System.out.println(Arrays.toString(decField));

        Bird birdObj = new Bird();
        Method b1 = birdClass.getMethod("fly");
        b1.invoke(birdObj);

        Class<Animal> animalClass = Animal.class;

        Animal animalObj = new Animal();
        Method a1 = animalClass.getMethod("Wild");
        a1.invoke(animalObj);

        Method a2 = animalClass.getMethod("myName", String.class);
        a2.invoke(animalObj,"Lion");
    }
}
