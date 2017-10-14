package mirea.isbo1016.mateyuk.lab2.human;

public class human {
    public static void main(String[] args) {
        leg leftLeg = new leg(39,70);
        leg rightLeg = new leg(39,70);

        hand leftHand = new hand(50,true);
        hand rightHand = new hand(50,false);

        head Head = new head("Black", "Brown");

        System.out.println(leftLeg);
        System.out.println(rightLeg);
        System.out.println(leftHand);
        System.out.println(rightHand);
        System.out.println(Head);

    }
}
