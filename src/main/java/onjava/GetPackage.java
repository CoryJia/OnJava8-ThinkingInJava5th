package onjava;

public class GetPackage {
    static String getPackageName(Object o){
        return o.getClass().getPackage().toString();
    }
}
