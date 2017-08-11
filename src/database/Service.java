package database;

import java.util.Arrays;

/**
 * Created by Ваня on 11.08.2017.
 */
public class Service {

    DataBase db = new DataBase();

    public void getAllDataBase(){
        System.out.println(Arrays.toString(db.arrayOfNames));
    }

    public void getFirst(){
        System.out.println(db.arrayOfNames[0]);
    }

    public void getLast(){
        System.out.println(db.arrayOfNames[db.arrayOfNames.length-1]);
    }

    public void getByName(String name){
        int count=0;
        String []arrayOfSertenNames;
        for (int i = 0; i <db.arrayOfNames.length ; i++) {
            if(db.arrayOfNames[i].startsWith(name)){
                count++;
            }
        }
        if(count>0) {
            arrayOfSertenNames=new String[count];
            count=0;
            for (int i = 0; i <db.arrayOfNames.length ; i++) {
                if(db.arrayOfNames[i].startsWith(name)){
                    arrayOfSertenNames[count]=db.arrayOfNames[i];
                    count++;
                }
            }
            System.out.println(Arrays.toString(arrayOfSertenNames));
        }else{
            System.out.println("Такого имени нет в базе данных!");
        }

    }
    public void getBySurname(String surname){      // По большому счету,все можно реализовать только этим методом.
        int count=0;                               // (getByName, getBySurname, getByAge)
        String []arrayOfSertenNames;
        for (int i = 0; i <db.arrayOfNames.length ; i++) {
            if(db.arrayOfNames[i].contains(surname)){
                count++;
            }
        }
        if(count>0) {
            arrayOfSertenNames=new String[count];
            count=0;
            for (int i = 0; i <db.arrayOfNames.length ; i++) {
                if(db.arrayOfNames[i].contains(surname)){
                    arrayOfSertenNames[count]=db.arrayOfNames[i];
                    count++;
                }
            }
            System.out.println(Arrays.toString(arrayOfSertenNames));
        }else{
            System.out.println("Такой фамилии нет в базе данных!");
        }
    }


    public void getByAge(String age){
        int count=0;
        String []arrayOfSertenNames;
        for (int i = 0; i <db.arrayOfNames.length ; i++) {
            if(db.arrayOfNames[i].endsWith(age)){
                count++;
            }
        }
        if(count>0) {
            arrayOfSertenNames=new String[count];
            count=0;
            for (int i = 0; i <db.arrayOfNames.length ; i++) {
                if(db.arrayOfNames[i].endsWith(age)){
                    arrayOfSertenNames[count]=db.arrayOfNames[i];
                    count++;
                }
            }
            System.out.println(Arrays.toString(arrayOfSertenNames));
        }else{
            System.out.println("Нет людей с таким возрастом в базе данных!");
        }

    }
}
