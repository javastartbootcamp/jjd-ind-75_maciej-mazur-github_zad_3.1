package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Kettle kettle1 = new Kettle();
        Kettle kettle2 = new Kettle();

        kettle1.capacity = 1.0;
        kettle1.color = "Srebrny";
        kettle1.netWeight = 0.5;

        kettle2.capacity = 1.2;
        kettle2.color = "Czarny";
        kettle2.netWeight = 0.8;

        System.out.println("Czajnik nr 1: "
                + "\n\tPojemność: " + kettle1.capacity
                + "\n\tKolor: " + kettle1.color
                + "\n\tWaga netto: " + kettle1.netWeight);

        System.out.println("\n\nCzajnik nr 2: "
                + "\n\tPojemność: " + kettle2.capacity
                + "\n\tKolor: " + kettle2.color
                + "\n\tWaga netto: " + kettle2.netWeight);
    }
}
