package carpetcalculator;

public class Calculator {
    Floor floor;
    Carpet carpet;

    Calculator(Floor floor, Carpet carpet){
       this.carpet=carpet;
       this.floor=floor;

    }
    public double getTotalCost(){
        double total= floor.getArea()*carpet.getCost();
        return total;
    }
}
