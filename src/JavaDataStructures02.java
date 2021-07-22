import java.util.*;

/* public class javaDataStructures02 {
    public static void main(String[] args) {
        LinkedList<String> animalList = new LinkedList<>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);
// => [frog, giraffe, buffalo, mongoose]

// Puts shark as the first element in the ArrayList
        animalList.addFirst("shark");
        System.out.println(animalList);
// => [shark, frog, giraffe, buffalo, mongoose]

// Puts koala as the last element in the ArrayList
        animalList.addLast("koala");
        System.out.println(animalList);
// => [shark, frog, giraffe, buffalo, mongoose, koala]

// This adds the value cuttlefish to the 3rd index of the LinkedList
        animalList.add(3, "cuttlefish");
        System.out.println(animalList);
// => [shark, frog, giraffe, cuttlefish, buffalo, mongoose, koala]

        animalList.remove(3);
// Removes the element that is at the 3rd index of the LinkedList
        animalList.remove("piranha");
// Removes the first instance of "piranha" in the LinkedList

        animalList.removeFirst();
// Removes the first element of the LinkedList
        animalList.removeLast();
// Removes the last elements of the LinkedList

        animalList.contains("giraffe");
// Returns `true` if "giraffe" is present in the LinkedList

        animalList.size();
// Returns an integer denoting the size of the LinkedList

        animalList.get(3);
// Returns the value located at the 3rd index of the LinkedList
        animalList.set(3, "emu");
//Sets the value at index 4 to "emu"
        System.out.println(animalList);
// => [frog, giraffe, buffalo, emu]

    }
}  */

// LinkedList

/* -- LinkedList are very important data structure because it serves as a template for other structures.
   LinkedLists consist of many objects with references to other objects.
      Because of this structure, LinkedLists are not indexed.

    --LinkedList itself functions as a container for its nodes, the objects which make up the list.
         This container object keeps track of the first and the last object in the list. It uses reference variables
          to point to these objects.

          Review: LinkedLists aren't indexed, so we don't know what position an object has in reference to the entire
          list, only which is first, which is last, and which comes after it.
 */


// QUEUES

  /* First In, First Out: Whoever joins the line first will leave the line first.

 Objects are added to the back and removed from the front. When adding and removing from a queue,
 we call it "Engqueuing and dequeuing". Each data structure has a different name for adding and removing objects.

Queues have references to their first and last objects, and each object has a reference to the next one.

Queue acts as an interface rather than an actual object.

We can't instantiate an interface, but we can create an instance of LinkedList and assign it to a Queue interface

*/

public class JavaDataStructures02 {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();

// Adds elements {5, 6, 7, 8, 9} to queue
        for (int i = 5; i < 10; i++)
            myQueue.add(i);

// Display contents of the queue.
        System.out.println("Elements of queue-" + myQueue);

// To remove the head of queue.
        int removedHead = myQueue.remove();
        System.out.println("removed element-" + removedHead);

        System.out.println(myQueue);

// To view the head of queue
        int head = myQueue.peek();
        System.out.println("head of queue-" + head);

// Rest all methods of collection interface,
// Like size and contains can be used with this
// implementation.
        int size = myQueue.size();
        System.out.println("Size of queue-" + size);

    }
}