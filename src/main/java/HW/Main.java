package HW;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        SuperCat superBarsik = new SuperCat();
        superBarsik.setName("Barsik");
        SuperCat twinBarsik = (SuperCat) superBarsik.clone();

        twinBarsik.setTail(2.0);

        System.out.println("superBarsik = " + superBarsik);
        System.out.println("twinBarsik = " + twinBarsik);

        SuperCat cat1 = new SuperCat();
        SuperCat cat2 = new SuperCat();
        SuperCat cat3 = new SuperCat();
        cat1.setTail(1.0);
        cat2.setTail(6.0);
        SuperCat[] superCatArray = new SuperCat[]{cat1,cat2,cat3};
        Arrays.sort(superCatArray);
        System.out.println("Arrays.toString(superCatArray) = " + Arrays.toString(superCatArray));
    }
}
