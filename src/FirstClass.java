class Home{
// Variable section
    String color;
    int total_area=1888;
    int num_of_room;
    int num_of_windows;

    //Methods
    void display_details(){
        System.out.println("color: "+color);
        System.out.println("Total area: "+total_area +" sq.ft");
        System.out.println("Numbers of room: "+num_of_room);
        System.out.println("Numbers of windows: "+num_of_windows);
    }


}


//Main
public class FirstClass {
    static void main(String[] args) {
    //Creating object
        Home newHome = new Home();
        //newHome.display_details();
        newHome.color="pink";
        newHome.total_area=2100;
        newHome.num_of_room=5;
        newHome.num_of_windows=10;



        Home newHome2 = new Home();
        newHome2.color="White";
        newHome2.total_area=4100;
        newHome2.num_of_room=50;
        newHome2.num_of_windows=100;
        System.out.println("First Home Details:");
        newHome.display_details();

        System.out.println("Secound Home Details:");
        newHome2.display_details();



    }
}
