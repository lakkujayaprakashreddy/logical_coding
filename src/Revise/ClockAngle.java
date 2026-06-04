package Revise;

public class ClockAngle {
    public static void main(String[] args) {
        String input= "1hr20min";
        int hrindex=input.indexOf("hr");
        int minIndex=input.indexOf("min");
        int hours=Integer.parseInt(input.substring(0,hrindex));
        int minutes=Integer.parseInt(input.substring(hrindex+2,minIndex));
        double degrees=(Math.abs(60*hours+(minutes)))/5.5;
        System.out.println((int)degrees);
    }
}
