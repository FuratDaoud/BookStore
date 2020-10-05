package model;

public class Bookfactory {
    public IBookDa getModel(){
        return new BookDa();
    }
}
