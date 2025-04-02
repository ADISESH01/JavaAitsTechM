import java.time.*;
public class DateAndTime {
    public static void main(String[] args)
    {
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime dt=LocalDateTime.now();

        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
        System.out.println("Date and Time: "+dt);
    }
}
