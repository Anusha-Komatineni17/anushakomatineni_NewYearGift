import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class NewYearGift {
    public static void main(String[] args) {
        ArrayList<String> sweets=new ArrayList<>(Arrays.asList("Khaja","Laddu"));
        ArrayList<String> chocolates=new ArrayList<>(Arrays.asList("Cadbury","Roast Almond"));
        ArrayList<String> candies=new ArrayList<>(Arrays.asList("JellyCandies","SweetHeartCandy","CandyButtons"));
        ArrayList<String> customers=new ArrayList<>(Arrays.asList("Anusha","Sivani","Susmitha","Bhavya","Valchaaaa"));
        int size=5;
        ArrayList<Double> arr=new ArrayList<>(size);
        double weight=0;
        for(int i=0;i<customers.size();i++) {
            System.out.println("--------------------------------------------");
            System.out.println(customers.get(i));
            System.out.println("--------------------------------------------");
            Random random=new Random();
            String x=sweets.get(random.nextInt(sweets.size()));
            String y=chocolates.get(random.nextInt(chocolates.size()));
            String z=candies.get(random.nextInt(candies.size()));
            ThreadLocalRandom random1=ThreadLocalRandom.current();
            float n;
            switch (x){
                case "Khaja":Khaja khaja=new Khaja();
                            n=random1.nextInt(0,51);
                            khaja.calculate(n);
                            weight+=khaja.display();
                            break;
                case "Laddu":Laddu laddu=new Laddu();
                            n=random1.nextInt(0,51);
                            laddu.calculate(n);
                            weight+=laddu.display();
            }

            switch (y){
                case "Cadbury":Cadbury cadbury=new Cadbury();
                                n=random1.nextInt(1,51);
                                cadbury.calculate(n);
                                weight+=cadbury.display();
                                break;
                case "Roast Almond":RoastAlmond roastAlmond=new RoastAlmond();
                                    n=random1.nextInt(1,51);
                                    roastAlmond.calculate(n);
                                    weight+=roastAlmond.display();
                                    break;
            }

            switch (z){
                case "JellyCandies":JellyCandies jellycandies=new JellyCandies();
                                    n=random1.nextInt(0,51);
                                    jellycandies.calculate(n);
                                    weight+=jellycandies.display();
                                    break;
                case "SweetHeartCandy": SweetHeartCandy sweetheartcandy=new SweetHeartCandy();
                                        n=random1.nextInt(0,51);
                                        sweetheartcandy.calculate(n);
                                        weight+=sweetheartcandy.display();
                                        break;
                case "CandyButtons": CandyButtons candyButtons = new CandyButtons();
                                     n = random1.nextInt(0, 51);
                                     candyButtons.calculate(n);
                                     weight += candyButtons.display();
            }

            System.out.println("*****************************************************");
            System.out.println("Total Weight of "+customers.get(i)+"'s New Year Gift is "+weight+" gms");
            System.out.println("*****************************************************");
            arr.add(weight);
            weight=0;
        }
        //Arrays.sort(arr);
        System.out.println("----------------------------------------");
        System.out.println("\"The sorted weights of New Year Gifts\"");
        System.out.println("----------------------------------------");
        while(!arr.isEmpty()) {
            int min=arr.indexOf(Collections.min(arr));
            String we=String.format("%.2f",arr.get(min));
            System.out.println(customers.get(min)+" : "+we+" gms");
            arr.remove(arr.get(min));
            customers.remove(min);
        }
        System.out.println("----------------------------------------");
    }
}
