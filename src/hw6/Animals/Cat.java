package hw6.Animals;


public class Cat extends Animal{

    private final static int MAX_RUN = 200;
    static int number_of_representative;

    public Cat(String name){
        super(name);
        number_of_representative++;
    }

    public void calculateInit(){
        System.out.printf("Появился котик %s!\n", name);
        System.out.println("Всего котиков на данный момент: "+number_of_representative);
        super.calculate();
    }

    public void swim(int length){
        System.out.printf("Котэ %s отказался плыть на %d метров - котики не плавают!\n",name,length);
    }

    public void run(int length){
        String message = "Котэ " + name + " пробежал на " +
                (length>MAX_RUN ? (MAX_RUN + " метров из "+length +"." ): (length+" метров! Мяу!"));
        System.out.println(message);
    }
}
