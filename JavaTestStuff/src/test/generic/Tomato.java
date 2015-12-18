package test.generic;

import test.access.modifiers.Vegetable;

public class Tomato extends Vegetable {
    
    protected int seeds = 5;

    /*
    * Doesn't work, Vegetable.seeds is private
     */
//    int seeds = Vegetable.seeds;
    
    @Override
    protected void setNumberOfSeeds(int newSeeds){
        seeds += newSeeds;
    }
    
    @Override
    public void grow(){
        size+= 3;
    }
    
    @Override
    public void print(){
        System.out.println("Seeds:" + seeds);
        System.out.println("Size:" + size);
    }
}
