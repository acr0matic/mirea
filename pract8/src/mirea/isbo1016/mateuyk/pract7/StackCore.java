package mirea.isbo1016.mateuyk.pract7;

import java.util.*;

public class StackCore {

   public Stack<Integer> firstStack = new Stack<>();
   public Stack<Integer> secondStack = new Stack<>();

   private LinkedList<Integer> listForMove = new LinkedList<>(Arrays.asList());
   private LinkedList<Integer> firstDeck = new LinkedList<>(Arrays.asList());
   private LinkedList<Integer> secondDeck = new LinkedList<>(Arrays.asList());
   private Scanner input = new Scanner(System.in);
   private int count = 0;
   private boolean isGameRunning = true;

   public void setDecks()
   {
       System.out.println("Карты не могут повторяться в колодах! " +
               "\n Введите карты первой колоды(0-9): ");
       for (int i = 0; i < 5; i++)
           firstDeck.add(input.nextInt());

       System.out.println("Введите карты второй колоды(0-9): ");
       for (int i = 0; i < 5; i++)
           secondDeck.add(input.nextInt());
   }

   public void setStacks()
   {
       Collections.reverse(firstDeck);
       Collections.reverse(secondDeck);

       for (int i = 0; i < 5; i++) {
           firstStack.push(firstDeck.get(i));
           secondStack.push(secondDeck.get(i));
       }
   }

   public void CompareStacks() {

       while (isGameRunning == true) {

           int firstStackTop = firstStack.pop();
           int secondStackTop = secondStack.pop();

           if (firstStackTop < secondStackTop || (firstStackTop == 9 && secondStackTop == 0)) {
               while (!secondStack.empty())
                   listForMove.add(secondStack.pop());

               Collections.reverse(listForMove);

               listForMove.addFirst(secondStackTop);
               listForMove.addFirst(firstStackTop);

               for (int i = 0; i < listForMove.size(); i++) {
                   secondStack.push(listForMove.get(i));
               }
               checkStatus();

           } else if (firstStackTop > secondStackTop || (firstStackTop == 0 && secondStackTop == 9)) {
               while (!firstStack.empty())
                   listForMove.add(firstStack.pop());

               Collections.reverse(listForMove);

               listForMove.addFirst(secondStackTop);
               listForMove.addFirst(firstStackTop);

               for (int i = 0; i < listForMove.size(); i++) {
                   firstStack.push(listForMove.get(i));
               }
               checkStatus();
           }
       }
   }

   public void checkStatus()
   {
       count++;
       listForMove.clear();

       if(firstStack.empty())
       {
           System.out.println("Победа второго игрока! Количество ходов: " + count);
           isGameRunning = false;
       }
       if (secondStack.empty())
       {
           System.out.println("Победа первого игрока! Количество ходов: " + count);
           isGameRunning = false;
       }
       if (count == 106)
       {
           System.out.println("Ботва! Количество ходов: " + count);
           isGameRunning = false;
       }

   }

   public void getDecks()
   {
       System.out.println("Первая колода: " + firstDeck);
       System.out.println("Вторая колода: " + secondDeck);
   }
}
