package model;

import akkgframework.model.fundamental.GraphicalObject;
import java.awt.image.BufferedImage;

public abstract class Item extends GraphicalObject {

    private String name;
    private int amount;
    private BufferedImage image;

    public Item(String name, int amount, BufferedImage image){
        this.name = name;
        this.amount = amount;
        this.image = image;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAmount(){
       return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public BufferedImage getImage(){
        return image;
    }
}