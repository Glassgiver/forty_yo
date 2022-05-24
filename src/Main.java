public class Main {


    public static void main(String[] args) {

        int C_year = 2022;
        int C_month = 5;
        int C_day = 23;

        Person me = new Person(2004, 13, 3);

        me.setCp_year(C_year);
        me.setCp_month(C_month);
        me.setCp_day(C_day);


        me.howOldAmI();
        me.roadTo40();
    }
}
