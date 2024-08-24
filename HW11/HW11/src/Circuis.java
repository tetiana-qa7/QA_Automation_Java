import java.io.*;
import java.util.ArrayList;

/*Створіть клас Circus<T>, де T — це тип елементів, які зберігаються в цирку (в даному випадку, артисти).
    Реалізуйте методи:
    addPerformer(T performer) - додати артиста до цирку
    removePerformer(T performer) - видалити артиста з цирку
    listPerformers() - повертає список всіх артистів у цирку
    Додайте до класу Circus метод saveToFile(String filename), який зберігає всіх артистів з цирку до текстового файлу.
    Додайте метод loadFromFile(String filename), який завантажує артистів з файлу до цирку.

*/

public class Circuis<T extends CircuisPerformer > {

    private ArrayList<T> performers = new ArrayList<>(); // це будуть артисти поки незрозуміло якого класу


    public void addPerformer(T performer){
        performers.add(performer);
        System.out.println("New performer added");
    }

    public void removePerformer(T performer){
        performers.remove(performer);
        System.out.println("The performer was removed");
    }

    @RunImmediately(times = 3)
    public void listPerformers(){
        System.out.println("All the performers are ");
        performers.forEach(performer -> System.out.println(performer.getAllInfo()));
        System.out.println("-----");
    }

    public void saveToFile(String filename) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) { // try with resource instead of explicitly using finally
            for (CircuisPerformer performer : performers) {
                writer.write(performer.getName() + "," + performer.getAct() + "," + performer.getExperience() + "\n");
            }
        } catch (IOException ioe) {
            System.out.println("IO exception caught" + ioe.getMessage());
        }

    }


    public void loadFromFile(String filename) {
        String line = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) { /// try with resource instead of explicitly using finally
            while ((line = reader.readLine()) != null) { // нас цікавлять заповнені рядочки
                String[] element = line.split(","); // один артист - 1 рядок, розділений комами
                if (element.length == 3) { // перевіримо, що в нас точно 3 елементи в результаті
                    T circusPerformer = (T) new CircuisPerformer(element[0], element[1], Integer.parseInt(element[2]));
                    addPerformer(circusPerformer);
                } else {
                    throw new IllegalArgumentException("Something went wrong when parsing");
                }
            }
        } catch (IOException ioe) {
            System.out.println("IO exception caught" + ioe.getMessage());
        }
    }





}