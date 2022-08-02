package io.github.stuartwdouglas.hacbstest.shaded.shadedjdk11;


public class Placeholder {

    public static void main() {
        //removed in JDK17
        //this means JDK11 is required
        sun.misc.Unsafe.getUnsafe().defineAnonymousClass(Placeholder.class, new byte[]{}, new Object[]{});
    }

}
