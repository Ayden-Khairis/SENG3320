import java.util.Random;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Fuzz {

    /* to store all expected values & their occurance */
     HashMap<String, Integer> results = new HashMap<String, Integer>();

    /* The Triangle program, which determines if three inputs 
    specify an equilateral triangle, an isosceles
    triangle, an ordinary triangle, or non-triangle. */

    /* This has been changed from C to java to accomidate 
    our greater knowledge of the java lang */

    public String triangle(int a, int b, int c){
        if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
            if (a==b || a==c || b==c) {
                if (a==c && a==b)
                    return ("equilateral triangle.\n");
                else if (a==c||b==c)
                    return ("isosceles triangle.\n");
            }
            else
                return ("triangle.\n");
        }
        else
            return ("non-triangle.\n");

    /* at this staage, the C program would not print anything, 
    so we return null to show this */
    return "No Result\n";
    }


    /* Create random values */
    public int rand(){
        Random randA = new Random();
        int upperbound = 10;
        /*for (int i=1; i < 4; i++){
            int intRand = randA.nextInt(upperbound);
            System.out.println(intRand);
        }*/
        int intRand = randA.nextInt(upperbound);
        return intRand;
    }

    
    //Run the fuzz program and add the results to the map
    public void fuzz(){

        int a = rand();
        int b = rand();
        int c = rand();

        System.out.print("Value a = " + a + ", Value b = " + b + ", Value c = " + c +"\n");
        String out = triangle(a,b,c);

        int i = results.get(out);
        results.put(out, ++i);
        System.out.print(out);

    }

    //initalises the has map & runs the program until all valid responses are met
    public void run(){
        
        results.put("equilateral triangle.\n", 0);
        results.put("isosceles triangle.\n", 0);
        results.put("triangle.\n", 0);
        results.put("non-triangle.\n", 0);
        results.put("No Result\n", 0);
        
        long startTime = System.nanoTime();

        while(check()){
            fuzz();
        }

        long endTime = System.nanoTime();

        //Outputs the total data results
        System.out.println("\nTotal resuls:\nequilateral triangle: " + results.get("equilateral triangle.\n"));
        System.out.println("isosceles triangle: " + results.get("isosceles triangle.\n"));
        System.out.println("triangle: " + results.get("triangle.\n"));
        System.out.println("non-triangle: " + results.get("non-triangle.\n"));
        System.out.println("ERRORED RESULTS: " + results.get("No Result\n"));

        int total = results.get("equilateral triangle.\n") + results.get("isosceles triangle.\n") + results.get("triangle.\n") + results.get("non-triangle.\n") + results.get("No Result\n");

        System.out.println("\nTotal Runs: " + total);
        System.out.println("Total Time to compute (milliseconds): " + TimeUnit.NANOSECONDS.toMillis((endTime - startTime)));

    }


    //Checks to see if all objectives have been met
    public boolean check(){
        if(results.get("equilateral triangle.\n") == 0){ return true; }
        if(results.get("isosceles triangle.\n") == 0){ return true; }
        if(results.get("triangle.\n") == 0){ return true; }
        if(results.get("non-triangle.\n") == 0){ return true; }

        return false;
    }


    //runs the program
    public static void main(String[] args){
        Fuzz main = new Fuzz();
        main.run();
    }
}
