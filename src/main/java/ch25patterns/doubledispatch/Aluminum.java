// patterns/doubledispatch/Aluminum.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Aluminum for double dispatching
package ch25patterns.doubledispatch;

import java.util.List;

public class Aluminum extends ch25patterns.trash.Aluminum
        implements TypedBinMember {
    public Aluminum(double wt) {
        super(wt);
    }

    @Override
    public boolean addToBin(List<TypedBin> tbins) {
        return tbins.stream()
                .anyMatch(tb -> tb.add(this));
    }
}
