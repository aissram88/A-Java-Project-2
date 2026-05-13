public class Main{
    public static void main(String[] args) {
        CinemaPrice p1 = new CinemaPrice(15,"mon");
        System.out.println(p1.toString()); //6

        CinemaPrice p2 = new CinemaPrice(5,"fri");
        System.out.println(p2.toString()); //0

        CinemaPrice p3 = new CinemaPrice(true,"tue");
        System.out.println(p3.toString());//5

        CinemaPrice p4 = new CinemaPrice();
        p4.setAge(65);
        p4.setIsStudent(true);
        p4.setDayOfWeek("fri");
        p4.setPrice();
        System.out.println(p4.toString());//7

    }
}