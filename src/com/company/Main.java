package com.company;
import java.util.ArrayList;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<String> rice = new ArrayList<String>();

        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");

        ArrayList<String> meat = new ArrayList<String>();

        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggies");

        ArrayList<String> beans = new ArrayList<String>();

        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("no beans");

        ArrayList<String> salsa = new ArrayList<String>();
        salsa.add("mild");
        salsa.add("medium");
        salsa.add("hot");
        salsa.add("no salsa");
        salsa.add("mild salsa, medium salsa, hot salsa");

        ArrayList<String> veggies = new ArrayList<String>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("no veggies");
        veggies.add("lettuce, fajita veggies");

        for (int j = 0; j <= 10; j++) {
            int riceIndex = random.nextInt(rice.size());
            int meatIndex = random.nextInt(meat.size());
            int beansIndex = random.nextInt(beans.size());
            int salsaIndex = random.nextInt(salsa.size());
            int veggiesIndex = random.nextInt(veggies.size());
            System.out.println("Burrito " + j + ": " + rice.get(riceIndex) + ", " + meat.get(meatIndex) + ", " + beans.get(beansIndex) + ", " + salsa.get(salsaIndex) + ", " +
                    veggies.get(veggiesIndex));
        }
    }



//        String [] Chip = new String [10];
//
//        Chipotle[0] = "white rice, carnidas meat, no beans, hot salsa, no veggies";
//        Chipotle[1] = "no rice, chicken meat, no beans,hot salsa, Fajita veggies";
//        Chipotle[2] = "brown rice, sofritas meat, no beans, hot salsa, no veggies";
//        Chipotle[3] = "brown rice, carnidas meat, pinto beans, mild salsa, lettuce";
//        Chipotle[4] = "no rice, chicken meat, black beans, medium salsa, no veggies";
//        Chipotle[5] = "white rice, carnidas meat, pinto beans, mild salsa, lettuce";
//        Chipotle[6] = "wite rice, sofritas meat, black beans, medium salsa, lettuce";
//        Chipotle[7] = "white rice, chorizo meat, no beans, hot salsa, lettuce";
//        Chipotle[8] = "no rice, chicken meat, pinto beans, mild salsa, no veggies";
//        Chipotle[9] = "white rice, chicken meat, no beans, hot salsa, lettuce";
//
//        System.out.println("Burrito 1:  " + Chipotle[0]);
//        System.out.println("Burrito 2:  " + Chipotle[1]);
//        System.out.println("Burrito 3:  " + Chipotle[2]);
//        System.out.println("Burrito 4:  " + Chipotle[3]);
//        System.out.println("Burrito 5:  " + Chipotle[4]);
//        System.out.println("Burrito 6:  " + Chipotle[5]);
//        System.out.println("Burrito 7:  " + Chipotle[6]);
//        System.out.println("Burrito 8:  " + Chipotle[7]);
//        System.out.println("Burrito 9:  " + Chipotle[8]);
//        System.out.println("Burrito 10: " + Chipotle[9]);
//
////
          }



