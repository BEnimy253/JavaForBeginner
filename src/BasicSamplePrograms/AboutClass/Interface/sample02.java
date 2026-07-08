package BasicSamplePrograms.AboutClass.Interface;

public class sample02 {
    interface Readable {
        void read();
    }

    interface Writable {
        void write();
    }

    static class Notebook implements Readable, Writable {
        @Override
        public void read() {
            System.out.println("Doc ghi chu.");
        }

        @Override
        public void write() {
            System.out.println("Viet ghi chu moi.");
        }
    }

    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.read();
        notebook.write();
    }
}
