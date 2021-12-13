package Task2;

public class Main {
  public static void main(String[] args) {
    int wood = 40;
    int plastic = 50;
    int paper = 60;
    int pricewoodf1 = 10;
    int priceplasticf1 = 15;
    int pricepaperf1 = 5;
    double authortax=0.01;
    double tax = 0.2;

    int totalwood=wood*pricewoodf1;
    int totalplastic=plastic*priceplasticf1;
    int totalpaper=paper*pricepaperf1;
    double pricewtax=(totalwood+totalplastic+totalpaper)*tax;
    double pricewauthortax=(totalwood+totalplastic+totalpaper)*authortax;
    double totalprice = totalwood+totalplastic+totalpaper+pricewtax+pricewauthortax;
    System.out.println("Price of game:"+totalprice);
  }
}