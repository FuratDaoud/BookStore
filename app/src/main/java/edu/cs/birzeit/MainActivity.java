package edu.cs.birzeit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import model.Book;
import model.Bookfactory;
import model.IBookDa;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;

    public MainActivity(Spinner spinner) {
        this.spinner = spinner;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        populateSpinner();
    }

    private void populateSpinner() {
        Bookfactory factory=new  Bookfactory();
        IBookDa objBook=factory.getModel();
        String [] cats= objBook.getCategorries();

        ArrayAdapter<String> adapter =new ArrayAdapter<>(this , android.R.layout.simple_spinner_item, cats);
        spinner.setAdapter(adapter);



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