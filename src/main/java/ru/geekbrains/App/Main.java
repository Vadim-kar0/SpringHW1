package ru.geekbrains.App;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.geekbrains.model.Person;

import java.io.FileWriter;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Person person = new Person("Вадим","Кардаполов",27);

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();

        String personInJson = gson.toJson(person);
        System.out.println(personInJson);

        Person person1 = gson.fromJson(personInJson,Person.class);
        System.out.println(person1);

    }
}