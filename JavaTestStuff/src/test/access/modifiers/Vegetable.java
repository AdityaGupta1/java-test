package test.access.modifiers;

public class Vegetable {

    private int seeds = 10;

    protected int size = 5;

    static int packageTestInteger = 10;
    
    public void main(int seeds) {
        print();
        setNumberOfSeeds(seeds);
        grow();
        print();
    }

    protected void setNumberOfSeeds(int newSeeds) {
        seeds = newSeeds;
    }

    public void grow() {
        size++;
    }
    
    public void print(){
        System.out.println("Seeds:" + seeds);
        System.out.println("Size:" + size);
    }

}
