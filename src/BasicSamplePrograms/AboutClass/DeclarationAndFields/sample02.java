package BasicSamplePrograms.AboutClass.DeclarationAndFields;

public class sample02 {
    static class Book {
        String title;
        int pages;
        boolean borrowed;
    }

    public static void main(String[] args) {
        Book book = new Book();

        System.out.println("Tieu de mac dinh: " + book.title);
        System.out.println("So trang mac dinh: " + book.pages);
        System.out.println("Da muon mac dinh: " + book.borrowed);
    }
}
