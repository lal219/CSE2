//Lela Lerner
//cse02 hw02 Arithmetic Calculations
//got help from upperclassman in FML named Jason

public class Arithmetic {
    public static void main (String[] args){
        //define variables
        int numPants = 3; //number of pairs of pants
        double pantsPrice = 34.98; //cost per pair of pants
        int numShirts = 2; //number of sweatshirts
        double shirtPrice = 24.99; //cost per shirt
        int numBelts = 2; //number of belts
        double beltPrice = 33.99; //cost per belt
        
        double paSalesTax = 0.06; //tax rate
        
        //declare values for total cost, getting quantity
        double totalpantsPrice = (numPants*pantsPrice);//total cost of pants
        double totalshirtPrice = (numShirts*shirtPrice);//total cost of shirts
        double totalbeltPrice = (numBelts*beltPrice);//total cost of belts
        double totalPrice = (totalpantsPrice + totalshirtPrice + totalbeltPrice); //total price before tax
        double totalSalesTax = (totalPrice*paSalesTax);//total sales tax of purchases
       
        int taxPricepantsint = (int)((totalpantsPrice * paSalesTax)*100);
        //trying to get result that equation inty = (int)(x*100) would give
        // acts as 'x' when converting
        double taxPricepants = (taxPricepantsint/100.0);//divided int by double (.0 indicates double), get 2 decimal positions
       
        int taxPriceshirtint = (int)((totalshirtPrice * paSalesTax)*100);
        double taxPriceshirt = (taxPriceshirtint/100.0);
       
        int taxPricebeltint = (int)((totalbeltPrice * paSalesTax)*100);
        double taxPricebelt = (taxPricebeltint/100.0);
        
        //getting total sales tax down to 2 decimal places
        int SalesTaxint = (int)(totalSalesTax*100);
        double decimalSalesTax = (SalesTaxint/100.0);//fixes decimal place
        
        int subTotalInt = (int)(totalPrice*100);//subTotalInt refers to total price before tax
        double decimalSubTotal = (subTotalInt/100.0);

        
        System.out.println ("The total price of pants is $" +
        (totalpantsPrice) + " plus a $" + (taxPricepants) + " tax");
        
        System.out.println ("The total price of shirts is $" +
        (totalshirtPrice) + " plus a $" + (taxPriceshirt) + " tax");
        
        System.out.println ("The total price of belts is $" +
        (totalbeltPrice) + " plus a $" + (taxPricebelt) + " tax");
        
        System.out.println ("The total price before tax is $" +
        (decimalSubTotal));
        
        System.out.println ("The total sales tax is $" +
        (decimalSalesTax));
        
        System.out.println ("The total cost of the purchases including sales tax is $" +
        (decimalSalesTax + decimalSubTotal));
    }
}