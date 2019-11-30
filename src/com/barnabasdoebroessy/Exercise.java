package com.barnabasdoebroessy;

public class Exercise {                     //1//
    private String name;
    private String description;
    private int duration;
    private String position;                //1//
    public Exercise(String name, String description, int duration, String position){
        this.setName(name);
        this.setDescription(description);
        this.setDuration(duration);
        this.setPosition(position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void Out(){                                                          //3.//
        System.out.print("\n" + getName() + "\t\t\t\t\t\t\t\t" + "DURATION: " + getDuration() + " seconds." + "\n" +
                "--------------------------------------------------" + "\nDESCRIPTION: " + getDescription());
    }
    public void Out1(){                                                         //5.//
        if (getPosition().equals("floor")){
            System.out.print("\n" + getName() + "\t\t\t\t\t\t\t\t" + "DURATION: " + getDuration() + " seconds." + "\n" +
                    "--------------------------------------------------" + "\nDESCRIPTION: " + getDescription());
        }
        if (getDuration() > 60 && getPosition().equals("floor")){
            System.out.print("\n" + getName() + "\t\t\t\t\t\t\t\t" + "DURATION: " + getDuration() + " seconds." + "\n" +
                    "--------------------------------------------------" + "\nDESCRIPTION: " + getDescription());
        }
    }
}
