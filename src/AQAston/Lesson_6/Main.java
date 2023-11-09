package AQAston.Lesson_6;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/resources/saveAndRead.csv");
        AppData appDate = new AppData();
        String [] header = appDate.getHeader();
        int[][] date = appDate.getData();

        try (PrintStream streamSave = new PrintStream(new FileOutputStream(file))) {
            for (String value: header) {
                streamSave.printf(value);
                streamSave.print(";");
            }
            streamSave.println();

            for (int[] row : date){
                for(int elem : row) {
                    streamSave.printf(String.valueOf(elem));
                    streamSave.print(";");
                }
                streamSave.println();
            }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            try (BufferedReader stream = new BufferedReader(new FileReader(file))) {
                int dataFromFile;

                while ((dataFromFile = stream.read())!=-1) {
                    System.out.print((char) dataFromFile);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

