package encapsulation;

public class ParentAnimal {
   
    public static void main(String[] args){
        Animal a1=new Animal();
        a1.setName("deer");
        System.out.println(a1.getName());
        a1.setCategory("moose");
        System.out.println(a1.getCategory());

    }
    
}
