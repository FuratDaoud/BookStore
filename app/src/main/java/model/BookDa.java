package model;

import java.util.ArrayList;
import java.util.List;

 class BookDa implements IBookDa{
    private ArrayList<Book> books = new ArrayList<>();

    public BookDa() {
        books.add(new Book(300, "Thinking in java", "Java"));
        books.add(new Book(400, "HI", "C#"));
        books.add(new Book(890, "p", "PAython"));

    }

    public List<Book> getBooks(String cat) {
        ArrayList<Book> data = new ArrayList<>();
        for (Book b : books) {
            if (b.getCategory().equals(cat)) {
                data.add(b);
            }
        }

    return data;
}
}
