import java.time.LocalDate;
import java.time.Period;

public class Person {

    LocalDate BDayDate = LocalDate.of(2004, 3, 13);
    LocalDate CurrentDate = LocalDate.of(2022, 5, 24);


    //узнаем сколько человеку в данный момент

    public int getCurrentAge(){
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
        giveMeCongrats(40);
        LocalDate DateForty = BDayDate.plusYears(40);
        System.out.println("You will be 40 y.o in " + DateForty);
    }
}
