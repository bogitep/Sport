import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static List<Sport> sportsCollection = new ArrayList<>();
    public static final String FILE_PATH="sports.bin";
    public static void createFile() {
            try {
                File file = new File(FILE_PATH);
                if (file.createNewFile()) {
                    System.out.println("Файлът е създаден:" + file.getName());
                } else {
                    System.out.println("Файлът вече съществува: " + file.getName());
                }
            } catch (IOException e) {
                System.out.println("Грешка при създаване на файл: " + e.getMessage());
            }
        }
        public static void writeToFile() {
            try (FileOutputStream fileOut = new FileOutputStream(FILE_PATH);
                 ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
    
                objectOut.writeObject(sportsCollection);
                System.out.println("Данните бяха успешно записани във файл.");
    
            } catch (IOException e) {
                System.out.println("Грешка при запис във файл: " + e.getMessage());
            }
        }
        @SuppressWarnings("unchecked")
        public static void readFromFile() {
        try (FileInputStream fileIn = new FileInputStream(FILE_PATH);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            sportsCollection = (List<Sport>) objectIn.readObject();
            System.out.println("Данните бяха успешно прочетени от файла.");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Грешка при четене от файл: " + e.getMessage());
        }
    }
}
