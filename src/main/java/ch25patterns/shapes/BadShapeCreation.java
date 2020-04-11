// patterns/shapes/BadShapeCreation.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package ch25patterns.shapes;

public class BadShapeCreation
        extends RuntimeException {
    public BadShapeCreation(String msg) {
        super(msg);
    }
}
