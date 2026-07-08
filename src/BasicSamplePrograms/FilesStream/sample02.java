package BasicSamplePrograms.FilesStream;

import java.io.File;

public class sample02 {
    public static void main(String[] args) {
        File currentFolder = new File(".");
        File[] items = currentFolder.listFiles();

        if (items == null) {
            System.out.println("Khong doc duoc thu muc hien tai.");
            return;
        }

        for (File item : items) {
            if (item.isDirectory()) {
                System.out.println("[Thu muc] " + item.getName());
            } else {
                System.out.println("[Tep tin] " + item.getName());
            }
        }
    }
}
