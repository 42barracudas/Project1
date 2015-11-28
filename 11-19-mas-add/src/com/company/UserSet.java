package com.company;

/**
 * Created by Vitaliy on 11/26/2015.
 */
public class UserSet extends Object {
    //private UserSet set = new UserSet();
    private User[] mas;
    private int size;

    public UserSet() {
        this.size = 44;
        this.mas = new User[size];

    }

    public UserSet(int size) {
        this.size = size;
    }

    public UserSet(User[] mas) {
        this.size = mas.length;
        this.mas = new User[size];

        // implement copying of elements from given array to array set
        // use 2 cycles 'for' - one to read 1st and other to write to 2nd
        //

    }
}
}
