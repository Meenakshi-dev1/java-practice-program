public class Pen {
    String color;
    String name;
    float height;
    public void write(){
        System.out.println("writing");
    }
    public static void main(String[] args){ 
       Pen pen=new Pen();
       pen.color="black";
        pen.height=10.5f;
        pen.name="cello";
        pen.write();
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.name="reynolds";
        System.out.println(pen.color);
        System.out.println(pen.name);
        Pen pen2=new Pen();
        pen2.color="red";
        System.out.println(pen2.color);
    }
}




    

    
