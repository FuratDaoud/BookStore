package edu.cs.birzeit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import model.Book;
import model.Bookfactory;
import model.IBookDa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnGetBooksOnclick(View view) {
        Bookfactory factory=new  Bookfactory();
        IBookDa objBook=factory.getModel();
        List<Book> books = objBook.getBooks("Java");
        String str = "";
        for (Book b:books){
            str+=b.getTitle() + "\n";
        }
        Toast.makeText(this,str, Toast.LENGTH_SHORT).show();
    }
}