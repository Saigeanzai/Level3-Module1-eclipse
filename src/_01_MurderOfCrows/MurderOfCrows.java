package _01_MurderOfCrows;

import java.util.ArrayList;
import java.util.Random;

public class MurderOfCrows {

    ArrayList<Crow> theMurder = new ArrayList<Crow>();

    public static void main(String[] args) {
        MurderOfCrows murderOfCrows = new MurderOfCrows();
        murderOfCrows.initializeCrows();
        murderOfCrows.hideTheDiamond();
        murderOfCrows.findTheDiamond();
    }

    private void findTheDiamond() {
        // 1. One of the Crows has eaten the diamond. You need to search
        //    through the stomach of each Crow, then print the name of the
        //    guilty Crow.
    	int innocentCrows = 0;
		for (Crow crow: theMurder) {
			if(crow.getStomachContents().contains("diamond")==true) {
				System.out.println(crow.getName());
				break;
			}
			else {
				innocentCrows +=1;
			}
			
		}//
        // 2. How many innocent crows had to die before the diamond was found?
		System.out.println(innocentCrows + " innocent Crows had to die before the diamond was found");
    }

    private void initializeCrows() {
        theMurder.add(new Crow("Rok"));
        theMurder.add(new Crow("Merle"));
        theMurder.add(new Crow("Poe"));
        theMurder.add(new Crow("Grenwyn"));
        theMurder.add(new Crow("Crawford"));
       
    }

    private void hideTheDiamond() {
        int randomness = new Random().nextInt(theMurder.size());
        theMurder.get(randomness).getStomachContents().add("diamond");
    }
}

class Crow {
    private String name;
    private ArrayList<String> stomachContents = new ArrayList<String>();

    public Crow(String name) {
        this.name = name;
        fillCrowsStomach();
    }

    private void fillCrowsStomach() {
        for (int i = 0; i < 10; i++)
            this.stomachContents.add(getRandomCrowFood());
    }

    private String getRandomCrowFood() {
        int randomness = new Random().nextInt(4);
        if (randomness == 0) return "carrion";
        else if (randomness == 1)return "snail";
        else if (randomness == 2)return "acorn";
        else if (randomness == 3)return "spider";
        else return "grub";
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getStomachContents() {
        return stomachContents;
    }
}
