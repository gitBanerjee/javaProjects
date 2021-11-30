package com.company;

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String kahani(){
        return "No plot here";
    }
    public String getName(){
        return name;
    }
}

class Pk extends Movie{
    public Pk(){
       super("PK");
    }

    @Override
    public String kahani() {
        return "An alien comes to earth.";
    }
}

class Avengers extends Movie{
    public Avengers(){
        super("Avengers");
    }

    @Override
    public String kahani() {
        return "Super Hero Movie.";
    }
}

class Bagban extends Movie{
    public Bagban(){
        super("Bagban");
    }

    @Override
    public String kahani() {
        return "Amitabh's Movie.";
    }
}

class ThreeIdiots extends Movie{
    public ThreeIdiots(){
        super("ThreeIdiots");
    }

    @Override
    public String kahani() {
        return "Amir's Movie.";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("IndependenceDay");
    }

    @Override
    public String kahani() {
        return "Alien Wala Movie.";
    }
}


public class Main {

    public static void main(String[] args) {
        Main.randomMovie();

    }

    public static void randomMovie(){
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);}}








