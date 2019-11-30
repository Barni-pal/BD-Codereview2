package com.barnabasdoebroessy;

public class Output {
    public static void main(String[] args) {
        Exercise num1 = new Exercise("Push-ups", "Place your hands on the floor." +                 //2.Beginn//
                " Raise up onto your toes so that all of your body weight is on your hands and your feet." +
                " Bend your elbows and lower your chest down toward the floor." +
                " Then, push off the floor and extend them so that you return to starting position.",
                30,
                "floor");

        Exercise num2 = new Exercise("Planks", "Start on the floor on your hands and knees." +
                " Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart." +
                " Maintain a straight line from heels through the top of your head, looking down at the floor." +
                " Now, tighten your abs and hold.",
                90,
                "floor");

        Exercise num3 = new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart," +
                " hips stacked over knees, and knees over ankles." +
                " Extend arms out straight so they are parallel with the ground, palms facing down." +
                "  Goto a squat and exhale, then explode back up to standing, driving through heels.",
                45,
                "standup");

        Exercise num4 = new Exercise("Backward Kick", "Get in an all-fours position with your knees and hands on the floor." +
                " Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle." +
                "  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs." +
                " Return to the starting position and repeat.",
                60,
                "floor");

        Exercise num5 = new Exercise("Leg Curl", "Stand up on, shift your weight to" +
                "  one feet and pull another heel toward your buttocks." +
                " Stay for 15 seconds, then repeat with your other leg.",
                90,
                "standup");

        Exercise num6 = new Exercise("Sidewards Back Stretch", " Go into standing position," +
                " put your hands on your hips and then stretch with one hand over your head to the opposite side." +
                " Repeat with other hand.",
                60,
                "standup");                                                         //2.Ende//

        Exercise[] nums = {num1, num2, num3, num4, num5, num6};                              //4.//

        for (Exercise num : nums) {
            num.Out();
        }
        for (Exercise num : nums) {
            num.Out1();

           }
        IntervalWorkout name1 = new IntervalWorkout("Leg Curl", "Squats",                                       //6.//
                "Push-ups", 4, "DO THE BREAK: (30 SECONDS)", 1);
        System.out.println("\n" + "***************************** \n" +
                " Interval Workout STARTS !!!!\n" +
                "***************************** \n");
        for (int i = 0; i < name1.getRepetition(); i++) {
                 name1.Out();
        }
        System.out.println("\n" + "***************************** \n" +
                "  CONGRATS - YOU ARE DONE !!!\n" +
                "***************************** \n");
        }
    }