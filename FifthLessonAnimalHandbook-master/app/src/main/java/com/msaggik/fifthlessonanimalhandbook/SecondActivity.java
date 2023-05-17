package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Monke", "it is normal monke",
                R.drawable.monkey, "Численность средняя"));
        animals.add( new Animal("bober", "POLAND",
                R.drawable.beaver, "Численность большая"));
        animals.add( new Animal("cat", "it is just cat",
                R.drawable.cat, "Численность большая"));
        animals.add( new Animal("dearf", "awooooo",
                R.drawable.dear, "Численность большая"));
        animals.add( new Animal("buzz", "where is my shotgun",
                R.drawable.buzz, "Численность большая"));
    }
}