
public class Sweets implements Items {
    double calaries;
    double dryfruitquantity;
    double weight;


}

class GheeSweets extends Sweets{
    public double display() {
        return weight;
    }

    public void calculate() {

    }
}

class Khaja extends GheeSweets{
    public double display() {
        System.out.println("Total Calaries in Khaja is : "+calaries+" g cal");
        String d=String.format("%.2f", dryfruitquantity);
        System.out.println("Total amount of dryfruits quantity in khaja is : "+d+" gms");
        String w=String.format("%.2f", weight);
        System.out.println("Total weight of Khaja is : "+w+" gms");
        return weight;
    }
    public void calculate(float n) {
        calaries=10*n;
        dryfruitquantity=0.4*n;
        weight=0.8*n;
    }
}

class Laddu extends GheeSweets{
    public double display() {
        System.out.println("Total Calaries in Laddu is : "+calaries+" g cal");
        String d=String.format("%.2f", dryfruitquantity);
        System.out.println("Total amount of dryfruits quantity in Laddu is : "+d+" gms");
        String w=String.format("%.2f", weight);
        System.out.println("Total weight of Laddu is : "+w+" gms");
        return weight;
    }
    public void calculate(float n) {
        calaries=12*n;
        dryfruitquantity=0.6*n;
        weight=1.5*n;
    }
}

