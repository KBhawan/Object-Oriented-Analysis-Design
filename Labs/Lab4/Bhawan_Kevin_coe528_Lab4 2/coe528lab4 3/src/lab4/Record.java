/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;
import java.io.*;

/**
 *
 * @author kevinbhawan
 */
public class Record {
    // Name of the associated file
private String filename;
private static Record instance = null;


private Record(String n) {
    if (instance != null) {
        throw new IllegalStateException("Only one instance of this object is allowed.");
    }
filename = n;
instance = this;
}

public static Record getInstance() {
    if (instance == null) {
        instance = new Record("record.txt");
    }
    
    return instance;
}

// Effects: Reads and prints the contents of the associated
// file to the standard output.
public void read() {
try (FileReader file = new FileReader(filename)) {
    int character;
    StringBuilder c = new StringBuilder();
    while ((character = file.read()) != -1) {
        c.append((char) character);
    }
    System.out.println(c);
// Write the code here
} catch (IOException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}

// Effects: Appends the specified message, msg, to the
// associated file.
public void write(String msg) {
try (FileWriter fileWriter = new FileWriter(filename, true)){
    fileWriter.write(msg);
// Write the code here
} catch (IOException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}
public static void main(String[] args) {
    
    
// Fill the blank below that obtains the sole instance
// of the Record class.
// (You should not invoke the Record constructor here.)
Record r = Record.getInstance();
// Do not modify the code below
r.write("Hello-1\n");
r.write("Hello-2\n");
System.out.println("Currently the file record.txt " +
"contains the following lines:");
r.read();
}
}

    

