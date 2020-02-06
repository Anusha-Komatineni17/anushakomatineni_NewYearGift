
public class Candies implements Items{
    double calaries;
    double dryfruitquantity;
    double weight;
}

class JellyCandies extends Candies{
    public double display() {
        System.out.println("Total Calaries in JellyCandies is :"+calaries+"g cal");
        String d=String.format("%.2f", dryfruitquantity);
        System.out.println("Total amount of dryfruits quantity in JellyCandies is : "+d+" gms");
        String w=String.format("%.2f", weight);
        System.out.println("Total weight of JellyCandies is : "+w+" gms");
        return weight;
    }
    public void calculate(float n) {
        calaries=1*n;
        dryfruitquantity=0.2*n;
        weight=0.9*10;
    }
}

class SweetHeartCandy extends Candies{
    public double display() {
        System.out.println("Total Calaries in SweetHeartCandies is : "+calaries+" g cal");
        String d=String.format("%.2f", dryfruitquantity);
        System.out.println("Total amount of dryfruits quantity in SweetHeartCandies is : "+d+" gms");
        String w=String.format("%.2f", weight);
        System.out.println("Total weight of SweetHeartCandies is : "+w+" gms");
        return weight;
    }
    public void calculate(float n) {
        calaries=2*n;
        dryfruitquantity=0.3*n;
        weight=0.8*n;
    }
}
class CandyButtons extends Candies{
    public double display() {
        System.out.println("Total Calaries in CandyButtons is :"+calaries+" g cal");
        String d=String.format("%.2f", dryfruitquantity);
        System.out.println("Total amount of dryfruits quantity in CandyButtons is :"+d+" gms");
        String w=String.format("%.2f", weight);
        System.out.println("Total weight of CandyButtons is :"+w+" gms");
        return weight;
    }
    public void calculate(float n) {
        calaries=4*n;
        dryfruitquantity=0.2*n;
        weight=1.5*n;
    }
}
