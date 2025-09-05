/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;
import java.util.ArrayList;
/**
 *
 * @author kevinbhawan
 */
public class QueueOfDistinctStrings {
    // Overview: QueueOfDistinctStrings are mutable, bounded
// collection of distinct strings that operate in
// FIFO (First-In-First-Out) order.
//
// The abstraction function is:
// a) Write the abstraction function here
// A constructor creates a new list of Strings
// all strings should be distinct from one another
// follows FIFO rules
// first element is listed as s1
// last element is sn (n is the length of array)
// elements are removed form the front [FIFO]    
// The rep invariant is:
// b) Write the rep invariant here
// no element in the queue should be null
// duplicate strings are not allowed
// FIFO order means first enqueued will be the first dequeued
// front element is the first string added and the end element is the most recent string added 
private ArrayList<String> items;
// constructor
public QueueOfDistinctStrings () {
// EFFECTS: Creates a new QueueOfDistinctStrings object
items = new ArrayList<String>();
}
// MODIFIES: this
// EFFECTS: Appends the element at the end of the queue
// if the element is not in the queue, otherwise
// does nothing.
public void enqueue(String element) throws Exception {
if(element == null) throw new Exception();
if(false == items.contains(element))
items.add(element);
}
public String dequeue() throws Exception {
// MODIFIES: this
// EFFECTS: Removes an element from the front of the queue
if (items.size() == 0) throw new Exception();
return items.remove(0);
}
public boolean repOK() {
// EFFECTS: Returns true if the rep invariant holds for this
// object; otherwise returns false
// c) Write the code for the repOK() here

ArrayList<String> newList = new ArrayList<>(items);

for (int i = 0; i < newList.size(); i++) {
    for (int j = i + 1; j < newList.size(); j++) {
        if (newList.get(i).equals(newList.get(j))) {
            return false;
        }
    }
}

return true;
}

public String toString() {
// EFFECTS: Returns a string that contains the strings in the
// queue, the front element and the end element.
// Implements the abstraction function.
// d) Write the code for the toString() here

if (items.isEmpty()) {
    return "Queue is Empty.";
}

StringBuilder sb = new StringBuilder();
sb.append("Queue: ").append(items);
sb.append("\nFront: ").append(items.get(0));
sb.append("\nLast: ").append(items.get(items.size() - 1));

return sb.toString();

}
}


