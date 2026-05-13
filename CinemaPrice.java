public class CinemaPrice {

    // Cinema price plan calculator
    /*
    Mon - Thursday €6
    Fri - Sunday €8
    student&Senior €5 (Mon-Thursday) €7(Fri-Sunday)
    Senior age>65
    kids age < 6 (free of charge)
    */
    private int age;
    private boolean isStudent;
    private String dayOfweek; //mon,tue,wed,thur,fri,sat,sun
    private int price;

    CinemaPrice(int age,String dayOfweek){
        this.age =age;
        this.dayOfweek=dayOfweek;
        this.isStudent=false;
        setPrice();
    }
    CinemaPrice(boolean isStudent,String dayOfweek){
        this.isStudent=isStudent;
        this.dayOfweek=dayOfweek;
        setPrice();
    }
    CinemaPrice(){
    }
    void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return this.age;
    }
    void setDayOfWeek(String dayOfweek){
        this.dayOfweek=dayOfweek;
    }
    public String getDayOfWeek(){
        return this.dayOfweek;
    }

    void setIsStudent(boolean isStudent){
        this.isStudent=isStudent;
    }
    public boolean getIsStudent(){
        return this.isStudent;
    }

    void setPrice(){
        if(age>6&&age<65){
             this.price = switch (dayOfweek) {
                case "mon","tue","wed","thur" -> 6;
                case "fri","sat","sun" -> 8;
                default->0;
            };
        }else if(isStudent||age>=65){
            this.price =switch(dayOfweek){
                case "mon","tue","wed","thur" -> 5;
                case "fri","sat","sun" -> 7;
                default->0;
            };
        }//end elif    
    }//end setPrice method

    public int getPrice(){
       return this.price=price;
    }

    public String toString(){
        return "Your cinema price is "+price;
    }
}
