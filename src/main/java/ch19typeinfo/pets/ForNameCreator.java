// typeinfo/pets/ForNameCreator.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package ch19typeinfo.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<>();
  // Types you want randomly created:
  private static String[] typeNames = {
    "ch19typeinfo.pets.Mutt",
    "ch19typeinfo.pets.Pug",
    "ch19typeinfo.pets.EgyptianMau",
    "ch19typeinfo.pets.Manx",
    "ch19typeinfo.pets.Cymric",
    "ch19typeinfo.pets.Rat",
    "ch19typeinfo.pets.Mouse",
    "ch19typeinfo.pets.Hamster"
  };
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  @Override
  public List<Class<? extends Pet>> types() {
    return types;
  }
}
