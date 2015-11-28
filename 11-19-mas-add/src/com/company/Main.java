package com.company;

public class Main {

    public static void main(String[] args) {
        NarrayList simonArray = new NarrayList(2);
        //NarrayList felixArray = new NarrayList(50);
        User simon = new User();
        simon.setPassword("password is set 112815");
        simon.setUsername("simon");
        User felix = new User();
        felix.setPassword("passwort");
        felix.setUsername("felix");
        /*for (int i = 0; i<209; i++){
            felixArray.add(i,i);
         //   simonArray.add(1,2);
        }
*/
        //felixArray.print();
simonArray.add(0,simon);
simonArray.add(1,felix);
simonArray.add(2,simon);
simonArray.add(5,simon);
        simonArray.print();


        UserSet userSet = new UserSet(User[]);

	// write your code here
    }
}
