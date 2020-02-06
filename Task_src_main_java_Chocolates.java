
public class Chocolates implements Items{
    double calaries;
    double dryfruitquantity;
    double weight;
}

class DairyMilk extends Chocolates{
    public double display() {
        return weight;
    }
    public void calculate() {

    }
}

class Cadbury extends DairyMilk{
    public double display() {
        System.out.println("Total Calaries in cadbury is : "+calaries+" g cal");
        String d=String.format("%.2f", dryfruitquantity);
        System.out.println("Total amount of dryfruits quantity in Cadbury is : "+d+" gms");
        String w=String.format("%.2f", weight);
        System.out.println("Total weight of cadbury is : "+w+" gms");
        return weight;
    }
    public void calculate(float n) {
        calaries=10*n;
        dryfruitquantity=0.8*n;
        weight=1.5*n;
    }
}

class RoastAlmond extends DairyMilk{
    public double display() {
        System.out.println("Total Calaries in Roast Almond is : "+calaries+" g cal");
        String d=String.format("%.2f",dryfruitquantity);
        System.out.println("Total amount of dryfruits quantity in Roast Almond is : "+d+" gms");
        String w=String.format("%.2f", weight);
        System.out.println("Total weight of Roast Almond is : "+w+" gms");
        return weight;
    }
    public void calculate(float n) {
        calaries=15*n;
        dryfruitquantity=1.2*n;
        weight=1.8*n;
    }
}
