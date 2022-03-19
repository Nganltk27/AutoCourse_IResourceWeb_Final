package Common;

import java.io.File;
import java.io.IOException;

public class CreateCSVFile {

    public static void main(String[] args) {
        String FILE_NAME = "TestData.csv";
        try {
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.println("File da duoc tao thanh cong: " + file.getName());
            } else {
                System.out.println("File da ton tai");
            }
        } catch (IOException e) {
            System.out.println("Da xay ra loi!");
            e.printStackTrace();
        }
    }
}
