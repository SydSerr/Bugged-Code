import java.util.Scanner;

public class RadiusCalc {

    /**
     * @param args the command line arguments
     */
    //carry out calculations or circular items
    //such as a circle, a sphere, a cone, a column
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This program calculates round item numbers such as \n" +
                "1 - Area of a circle (pi r^2)\n" +
                "2 - Volume of a sphere (4/3 pi r^3)\n" +
                "3 - Volume of a cone (pi r^2 h/3)\n" +
                "4 - Volume of a column (pi r^2 h)");
        System.out.println("Type the number for which one you want to calculate");
        int i = s.nextInt();
        if (i == 1){
            circleCalc();
        }else if (i == 2){
            sphereCalc();
        }else if(i == 3){
            coneCalc();
        }else if(i == 4){
            columnCalc(); //fixed the correct number corresponding with the correct formula
        }
    }
    //calculated area of circle
    public static void circleCalc(){ //reordered methods and renamed them to make more clear and easily read
        Scanner s = new Scanner(System.in); //declare scanner
        System.out.println("enter the radius of your circle");
        int r = s.nextInt();
        double result = Math.PI * Math.pow(r, 2);
        System.out.println(result);//print result instead of just r
    }
    public static void sphereCalc(){
        Scanner s = new Scanner(System.in);//declare scanner
        System.out.println("enter the radius of your sphere");
        int r = s.nextInt();
        double result = (4.0/3.0)*Math.PI * Math.pow(r, 3); //added decimal places to 4/3 in order for it to be a double
        System.out.println(result);
    }
    public static void coneCalc(){
        Scanner s = new Scanner(System.in); //declare scanner
        System.out.println("enter the radius of your cone, then height of your cone");
        int r = s.nextInt();
        int h = s.nextInt(); //added h int for the height input
        double result = Math.PI * Math.pow(r, 2) * h/3; //corrected formula, needed to divide h by 3
        System.out.println(result);
    }

    public static void columnCalc(){ //specified the Calc
        Scanner s = new Scanner(System.in); //declare scanner
        System.out.println("enter the radius of your column, then height of your column"); //added "column" text not "cone"
        int r = s.nextInt();
        int h = s.nextInt();
        double result = Math.PI * Math.pow(r, 2) * h;
        System.out.println(result);
    }



}