package HW;

public class SuperCat implements Cloneable, Comparable<SuperCat> {


    private double tail = 3.0;
    private String name;

    public SuperCat(){
    }

    private SuperCat(double tail, String name) {
        this.name = name;
        this.tail = tail;
    }

    public void print() {
        System.out.println("SUUUUPERCAT");
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return new SuperCat(tail,name);
    }

    public void setTail(double tail) {
        this.tail = tail;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "SuperCatty{" + "tail = " + tail +
                ", name = " + name + '\'' + '}';
    }


    public int compareTo(SuperCat o) {
        return (int) (tail - o.tail);
    }
}
