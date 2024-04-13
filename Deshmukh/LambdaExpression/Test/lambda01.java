package LambdaExpression.Test;


import java.util.Scanner;

public  class lambda01    {
    public static void main(String[] args) {
        int numA=0;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter no = ");
        numA = scanner.nextInt();


        Lambda02 numberRef = (nom) -> nom * nom;
        System.out.println(" square---" +numberRef.tekeNon(numA));


        Lambda02 numberRefTbl = (nom) ->
        {
            System.out.println(nom + " x 8 = " + nom * 8);
            return nom;
        };

    }

}
