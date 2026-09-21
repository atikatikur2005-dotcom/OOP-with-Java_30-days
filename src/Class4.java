
class Hom{
    // Variable section
    private String color;
    private int total_area;
    private int num_of_room;
    private int num_of_windows;


    Hom(String color,int total_area, int num_of_room,int num_of_windows){
        this.color=color;
        this.total_area=total_area;
        this.num_of_room=num_of_room;
        this.num_of_windows=num_of_windows;



    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTotal_area() {
        return total_area;
    }

    public void setTotal_area(int total_area) {
        this.total_area = total_area;
    }

    public int getNum_of_room() {
        return num_of_room;
    }

    public void setNum_of_room(int num_of_room) {
        this.num_of_room = num_of_room;
    }

    public int getNum_of_windows() {
        return num_of_windows;
    }

    public void setNum_of_windows(int num_of_windows) {
        this.num_of_windows = num_of_windows;
    }


    Hom(int total_area, int num_of_room, int num_of_windows){

        this.total_area=total_area;
        this.num_of_room=num_of_room;
        this.num_of_windows=num_of_windows;



    }


//    //Methods
    void display_details(){
        System.out.println("color: "+color);
        System.out.println("Total area: "+total_area +" sq.ft");
        System.out.println("Numbers of room: "+num_of_room);
        System.out.println("Numbers of windows: "+num_of_windows);
    }


}



// Main clss

public class Class4 {
    public static void main(String[] args) {

        Hom h1=new Hom("pink",2333,5,8);
        Hom h2=new Hom(23367 ,9,80);

      h1.setNum_of_room(12);

        h1.display_details();
        h2.display_details();


    }
}
