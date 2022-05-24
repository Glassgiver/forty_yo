import java.time.LocalDate;
import java.time.Period;

public class Person {

    LocalDate BDayDate = LocalDate.of(2004, 3, 13);
    LocalDate CurrentDate = LocalDate.of(2022, 5, 24);

    private int B_year;
    private int B_month;
    private int B_day;

    private int Cp_year;
    private int Cp_month;
    private int Cp_day;

    public Person() {
    }

    public Person(int b_year, int b_month, int b_day) {
        B_year = b_year;
        B_month = b_month;
        B_day = b_day;
    }

    public int getCp_year() {
        return Cp_year;
    }

    public void setCp_year(int cp_year) {
        Cp_year = cp_year;
    }

    public int getCp_month() {
        return Cp_month;
    }

    public void setCp_month(int cp_month) {
        Cp_month = cp_month;
    }

    public int getCp_day() {
        return Cp_day;
    }

    public void setCp_day(int cp_day) {
        Cp_day = cp_day;
    }

    //узнаем сколько человеку в данный момент

    public int getCurrentAge(){
        //LocalDate BDayDate = LocalDate.of(B_year, B_month, B_day);
        //LocalDate CurrentDate = LocalDate.of(getCp_year(), getCp_month(), getCp_day());
        return Period.between(BDayDate, CurrentDate).getYears();
    }

    public void howOldAmI(){
        System.out.println("Current age is - " + getCurrentAge());
    }

    //поздравляшки

    public void giveMeCongrats(int lastAge){
        for (int i = getCurrentAge(); i <= lastAge; i++){
            if (i % 5 == 0){
                System.out.println("congratulations on the anniversary! it's your " + i + "s");
            }
        }
    }


    public void roadTo40(){
        //LocalDate BDayDate = LocalDate.of(B_year, B_month, B_day);
        giveMeCongrats(40);
        LocalDate DateForty = BDayDate.plusYears(40);
        System.out.println("You will be 40 y.o in " + DateForty);
    }
}
