// patterns/doubledispatch/Paper.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Paper for double dispatching
package ch25patterns.doubledispatch;

import java.util.List;

public class Paper extends ch25patterns.trash.Paper
        implements TypedBinMember {
    public Paper(double wt) {
        super(wt);
    }

    @Override
    public boolean addToBin(List<TypedBin> tbins) {
        return tbins.stream()
                .anyMatch(tb -> tb.add(this));
    }
}
