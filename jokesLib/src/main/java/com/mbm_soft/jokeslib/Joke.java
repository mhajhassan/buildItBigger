package com.mbm_soft.jokeslib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joke {
    private List<String> jokeList = new ArrayList<>();

    public Joke() {
        jokeList.add("Guest to the waiter: “Can you bring me what the lady at the next table is having?\n Waiter: “Sorry, sir, but I’m pretty sure she wants to eat it herself.");
        jokeList.add("Husband: Wow, honey, you look really different today. Did you do something to your hair?\n Wife: Michael, I’m over here!");
        jokeList.add("One of the most wonderful things in life is to wake up and enjoy a cuddle with somebody; unless you are in prison.");
        jokeList.add("Doctor: You're obese.\nPatient: For that I definitely want a second opinion.\nDoctor: You’re quite ugly, too.");
        jokeList.add("Two donkeys are standing at a roadside, one asks the other: So, shall we cross?\nThe other shakes his head: No way, look at what happened to the zebra.");
        jokeList.add("Can you please hold my hand? A mother asks her son: Anton, do you think I’m a bad mom?\nSon: My name is Paul.");
        jokeList.add("I dreamed I was forced to eat a giant marshmallow. When I woke up, my pillow was gone.");
        jokeList.add("I got another letter from this lawyer today. It said “Final Notice”. Good that he will not bother me anymore.");
    }

    public String getRandomJoke() {
        int listSize = jokeList.size();
        Random random = new Random();
        int randomInt = random.nextInt(listSize);
        return jokeList.get(randomInt);
    }
}
