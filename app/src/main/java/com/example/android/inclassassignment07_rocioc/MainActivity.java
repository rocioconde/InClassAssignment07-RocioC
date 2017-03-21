package com.example.android.inclassassignment07_rocioc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference title = database.getReference("genre");
    private DatabaseReference movieCollection = database.getReference("movieCollection");

    private EditText genre;
    private EditText movieName;
    private EditText releaseDate;
    private CheckBox wonOscar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        genre = (EditText) findViewById(R.id.genre);
        movieName = (EditText) findViewById(R.id.movie_name);
        releaseDate = (EditText) findViewById(R.id.release_date);
        wonOscar = (CheckBox) findViewById(R.id.won_oscar);
    }

    public void setTitle(View view) {
        String movieGenre = genre.getText().toString();
        title.setValue(new String(movieGenre));


    }

    public void addMovie(View view) {
        String movieTitle = movieName.getText().toString();
        String releaseY = releaseDate.getText().toString();
        int releaseYear = Integer.parseInt(releaseY);
        boolean wonAnOscar;
        wonAnOscar = wonOscar.isChecked();

        movieCollection.push().setValue(new Movie(movieTitle, releaseYear, wonAnOscar));

    }
}
