import java.util.Scanner;
public class yahtzee {
    public Die6 die1;
    public Die6 die2;
    public Die6 die3;
    public Die6 die4;
    public Die6 die5;
    int amt1 = 0;
    int amt2 = 0;
    int amt3 = 0;
    int amt4 = 0;
    int amt5 = 0;
    int amt6 = 0;
    String str = "";
    public yahtzee() {
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();
        str = die1.getValue() + " " + die2.getValue() + " " + die3.getValue() + " " + die4.getValue() + " " + die5.getValue();
    }

    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
    
    public void roll(int dieNumber) {
        if (dieNumber == 1) {
            die1.roll();
        } else if (dieNumber == 2) {
            die2.roll();
        } else if (dieNumber == 3) {
            die3.roll();
        } else if (dieNumber == 4) {
            die4.roll();
        } else if (dieNumber == 5) {
            die5.roll();
        }
    }
    
    public String summarize() {
         str = die1.getValue() + " " + die2.getValue() + " " + die3.getValue() + " " + die4.getValue() + " " + die5.getValue();
         Scanner scanner = new Scanner(str);
         amt1=0;
         amt2=0;
         amt3=0;
         amt4=0;
         amt5=0;
         amt6=0;
         while (scanner.hasNext()) {
             if (scanner.hasNext("1")) {
                 amt1++;
             }
             if (scanner.hasNext("2")) {
                 amt2++;
             }
             if (scanner.hasNext("3")) {
                 amt3++;
             }
             if (scanner.hasNext("4")) {
                 amt4++;
             }
             if (scanner.hasNext("5")) {
                 amt5++;
             }
             if (scanner.hasNext("6")) {
                 amt6++;
             }
             scanner.next();
         }
         return "1-"+amt1+"; "+"2-"+amt2+"; "+"3-"+amt3+"; "+"4-"+amt4+"; "+"5-"+amt5+"; "+"6-"+amt6;
    }
    
    public String toString() {
        str = die1.getValue() + " " + die2.getValue() + " " + die3.getValue() + " " + die4.getValue() + " " + die5.getValue();
        return str;
    }
    
}