package ch11innerclasses;// innerclasses/ch11innerclasses.Parcel8.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Calling the base-class constructor

public class Parcel8 {
  public Wrapping wrapping(int x) {
    // Base constructor call:
    return new Wrapping(x){
      @Override
      public int getValue(){
        return super.getValue() * 47;
      }
    };
     // [2]
  }
  public static void main(String[] args) {
    Parcel8 p = new Parcel8();
    Wrapping w = p.wrapping(10);
    System.out.println(w.getValue());
  }
}
