/**
 * Created by Serge on 28.06.2016.
 */
public class Active {
    public static void main(String[] args) {
        String s1 ="ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

        System.out.println("1. "+s1.compareTo(s2)); //Что касается сортировки - ABC на 3 пункта предшествует DEF
        System.out.println("2. "+s2.equals(s3));    //Сравнивает их значения. Естествено, что не одно и то же
        System.out.println("3. "+(s3 == s1));       //Ну да, s1 и s2 равны.
        System.out.println("4. "+s2.compareTo(s3)); //Что касается сортировки - DEF на 3 пункта дальше, чем ABC
        System.out.println("5. "+s3.equals(s1));    //И по содержанию тоже равны
    }
}
