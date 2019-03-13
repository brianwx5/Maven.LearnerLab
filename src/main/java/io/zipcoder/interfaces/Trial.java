package io.zipcoder.interfaces;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Trial {

    public static void main(String[] args) {
        //Runnable
        Trial trial = new Trial();
        Runnable runnable = Trial::playGame;
        runnable.run();

        //Consumer
//        Consumer<String> consumer = (str) -> System.out.println(str);
//        consumer.accept("Pause");
//        Consumer<String> consumer = trial::difficultyLevel; //this is for non-static
        Consumer<String> consumer1 = Trial::difficultyLevel;
        consumer1.accept("Hard");

        Supplier<Double> random = () -> Math.random()*6;
        Double diceRoll = random.get();
        System.out.println(diceRoll);


        Function<Integer, String> function;
        function = (someNumber) -> String.valueOf(someNumber);
        String randomNumber2 = function.apply(25);
        System.out.println(randomNumber2);

        // When using :: Before it is the class and after is the method(THis method is located in the specified class)


    }

    public static void playGame() {
        System.out.println("Game Start");
    }

    public static void difficultyLevel(String difficulty) {
        System.out.println(difficulty);
    }
}
