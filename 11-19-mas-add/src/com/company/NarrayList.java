package com.company;

/**
 * Created by Vitaliy on 11/19/2015.
 */
public class NarrayList {
    private User[] mas;
    private int size;

    public NarrayList() {
        this.size = 50;
        this.mas = new User[size];
    }

    public NarrayList(int size) {

        if (size < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.size = size;
        this.mas = new User[size];
    }

    public void add(int index, User myUser) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index > size-1){
            int newSize = (int)(1.2*index)+index;
            User[] temp = new User[newSize];
                    //index + (index *100/20)];
            for (int i = 0; i < size; i++) {
                temp[i] = mas[i];
            }
            size = newSize;
            this.mas = temp;
        }
        this.mas[index] = myUser;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(mas[i]);
        }

    }
}
