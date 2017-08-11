package database;

/**
 * Created by Ваня on 11.08.2017.
 */
public class DataBase {

    Integer AlexMcCaneAge = 31;         // Все эти Integer(ы) можно было не писать, а поставить на прямую, но так
    Integer BobNitrouAge = 27;          // хоть понятно, что это возраст.
    Integer JonnyDeppAge = 45;
    Integer BobGeinAge = 27;
    Integer AlexJinAge = 29;
    Integer RobertDeNiroAge = 63;
    Integer JonnyDAge = 32;
    Integer AlexHitAge = 41;
    Integer VinnyPouchAge = 92;
    Integer PytaChoucAge = 10;


    String[] arrayOfNames = {"Alex McCane "+AlexMcCaneAge, "Bob Nitrou "+BobNitrouAge, "Jonny Depp "+JonnyDeppAge, "Bob Gein "+BobGeinAge, "Alex Jin "+AlexJinAge, "Robert DeNiro "+RobertDeNiroAge, "Jonny D "+JonnyDAge, "Alex Hit "+AlexHitAge, "Vinny Puch "+VinnyPouchAge, "Pyata Chouk "+PytaChoucAge};

    public String[] getArrayOfNames() {
        return arrayOfNames;
    }
}
