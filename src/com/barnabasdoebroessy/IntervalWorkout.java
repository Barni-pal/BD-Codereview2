package com.barnabasdoebroessy;

public class IntervalWorkout {                                                      //6.//
    private String exercisename;
    private String exercisename1;
    private String exercisename2;
    private int repetition;
    private String breaktime;
    private int b;
    public IntervalWorkout(String exercisename, String exercisename1, String exercisename2, int repetition, String breaktime, int b){
        this.setExercisename(exercisename);
        this.setBreaktime(breaktime);
        this.setRepetition(repetition);
        this.setExercisename1(exercisename1);
        this.setExercisename2(exercisename2);
        this.setB(b);
    }

    public String getExercisename() {
        return exercisename;
    }

    public void setExercisename(String exercisename) {
        this.exercisename = exercisename;
    }

    public int getRepetition() {
        return repetition;
    }

    public void setRepetition(int repetition) {
        this.repetition = repetition;
    }

    public String getBreaktime() {
        return breaktime;
    }

    public void setBreaktime(String breaktime) {
        this.breaktime = breaktime;
    }
    public String getExercisename1() {
        return exercisename1;
    }

    public void setExercisename1(String exercisename1) {
        this.exercisename1 = exercisename1;
    }

    public String getExercisename2() {
        return exercisename2;
    }

    public void setExercisename2(String exercisename2) {
        this.exercisename2 = exercisename2;
    }
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void Out(){
        String a = "=============================";
        System.out.println( a + "\n" + getBreaktime() + "\n" + a + "\n" + "ROUND "+ getB() + ":\n" + getExercisename() + "\n" + getExercisename1() + "\n" + getExercisename2() );
        b++;
    }

}
