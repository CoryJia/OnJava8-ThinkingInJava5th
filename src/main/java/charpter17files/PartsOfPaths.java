package charpter17files;// files/PartsOfPaths.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.nio.file.*;

public class PartsOfPaths {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println("************************************************************************");

        Path p =
                Paths.get("PartsOfPaths.java").toAbsolutePath();

        System.out.println(p);
        for (int i = 0; i < p.getNameCount(); i++)
            System.out.println(p.getName(i));
        System.out.println("************************************************************************");

        System.out.println("ends with '.java': " +
                p.endsWith(".java"));
        System.out.println("ends with '.java': " +
                p.toString().endsWith(".java"));
        System.out.println("************************************************************************");


        for (Path pp : p) {
            System.out.print(pp + ": ");
            System.out.print(p.startsWith(pp) + " : ");
            System.out.println(p.endsWith(pp));
        }
        System.out.println("************************************************************************");

        System.out.println("Starts with " + p.getRoot() +
                " " + p.startsWith(p.getRoot()));
    }
}
/* Output:
Windows 10
Users
Bruce
Documents
GitHub
on-java
ExtractedExamples
files
PartsOfPaths.java
ends with '.java': false
Users: false : false
Bruce: false : false
Documents: false : false
GitHub: false : false
on-java: false : false
ExtractedExamples: false : false
files: false : false
PartsOfPaths.java: false : true
Starts with C:\ true
*/
