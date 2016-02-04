import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RecordsSaver {
    public static int loadRecord(){
        int record = 0;

        try {
            Scanner in = new Scanner(new BufferedInputStream(new FileInputStream(RECORD_FILE)));
            record = in.nextInt();
        } catch (FileNotFoundException | NoSuchElementException e) {
            createFile();
            saveRecord(record);
        }

        return record;
    }

    public static void saveRecord(int record){
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(RECORD_FILE));
            out.write(Integer.toString(record));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFile(){
        if (!RECORD_FILE.exists()) {
            try {
                RECORD_FILE.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static final File RECORD_FILE = new File("record.txt");
}