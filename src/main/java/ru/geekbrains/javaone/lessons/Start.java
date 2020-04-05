package ru.geekbrains.javaone.lessons;

public class Start {
    public static void main(String[] args) {

        Participants cat = new Cat();
        cat.setName("Barsik");
        Participants man = new Man();
        man.setName("Vasily");
        Participants robot = new Robot();
        robot.setName("Alf");


        Participants[] participants = {cat, man, robot};
        Barrier[] barriers = {
                new Running_track(100),
                new Wall(1),
                new Running_track(400),
                new Wall(1)
        };

        for (Participants participant: participants) {
             boolean passed = participant.passThrough(barriers);

             if (passed) {
                 System.out.println(participant.getName() +" прошел");
             } else {
                 System.out.println(participant.getName() +" не прошел");
             }
        }

    }
}

