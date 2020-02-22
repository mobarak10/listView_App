package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.main_animalLIst);

        // create animal object
        Animal bird = new Animal("bird", "Bird", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.ever since the 1500s,");
        Animal cat = new Animal("cat", "Cat", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.ever since the 1500s,");
        Animal cow = new Animal("cow", "Cow", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.ever since the 1500s,");
        Animal crow = new Animal("crow", "Crow", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.ever since the 1500s,");
        Animal dog = new Animal("dog", "Dog", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.ever since the 1500s,");
        Animal fish = new Animal("fish", "Fish", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.ever since the 1500s,");
        Animal horse = new Animal("horse", "Horse", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.ever since the 1500s,");
        Animal monkey = new Animal("monkey", "Monkey", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.ever since the 1500s,");
        Animal spider = new Animal("spider", "Spider", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.ever since the 1500s,");
        Animal human = new Animal("human", "Human", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.ever since the 1500s,");

        // create arrayList
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(bird);
        animals.add(cat);
        animals.add(cow);
        animals.add(crow);
        animals.add(dog);
        animals.add(fish);
        animals.add(horse);
        animals.add(monkey);
        animals.add(spider);
        animals.add(human);

        // create adapter
        AnimalArrayAdapter animalArrayAdapter = new AnimalArrayAdapter(this, R.layout.animal_row, animals);
        listView.setAdapter(animalArrayAdapter);
    }
}
