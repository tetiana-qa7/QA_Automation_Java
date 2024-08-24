import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) {

        CircuisPerformer alex = new CircuisPerformer("Alex", "Acrobatics", 5);
        CircuisPerformer invalid = new CircuisPerformer("Alex", "Aerial Acts", -1);
        CircuisPerformer invalid2 = new CircuisPerformer("Alex", "Animal Acts", 51);
        CircuisPerformer anna = new CircuisPerformer("Anna", "Clown Acts", 20);
        CircuisPerformer sanna = new CircuisPerformer("Sanna", "Fire Performance", 10);
        CircuisPerformer julia = new CircuisPerformer("Julia", "Hula Hooping", 30);
        CircuisPerformer oleh = new CircuisPerformer("Oleh", "Juggling", 15);
        CircuisPerformer max = new CircuisPerformer("Max", "Magic Arts", 1);
        CircuisPerformer serhii = new CircuisPerformer("Serhii", "Mime", 50);

        Circuis<CircuisPerformer> curcuis = new Circuis<>();
        curcuis.addPerformer(alex);
        curcuis.addPerformer(anna);
        curcuis.addPerformer(sanna);
        curcuis.addPerformer(julia);
        curcuis.addPerformer(oleh);
        curcuis.addPerformer(max);
        curcuis.addPerformer(serhii);


        for (Method method : curcuis.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    try {
                        method.invoke(curcuis);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        curcuis.listPerformers();

        curcuis.removePerformer(serhii);

        curcuis.listPerformers();

        curcuis.saveToFile("performers.txt");

        curcuis.loadFromFile("performers222.txt");

        curcuis.listPerformers();









    }
}