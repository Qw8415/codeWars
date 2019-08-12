package kyu4;

import java.util.regex.Pattern;

class BinaryRegexp {

    static Pattern multipleOf3() {
        return Pattern.compile("((0*(11)*)*(1(01*0)*1)*)*");
    }

}
