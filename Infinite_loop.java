public class Infinite_loop {
    public boolean infinte(){
        do{
            System.out.println("Hi");
        }while (true);
    }
    public static void main(String[] args){
        Infinite_loop pack = new Infinite_loop();
        pack.infinte();
    }
}
