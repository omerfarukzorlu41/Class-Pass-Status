import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mathematic,physics,chemistry,turkish,music,average,toplam=0,lesson=0;
        System.out.println("Please enter grades" +
                " in Mathematics, Turkish, Physics, Chemistry and Music courses.");
        System.out.print("Mathematic grade: ");
        mathematic = scanner.nextInt();
        if(mathematic>=0 && mathematic <=100){
           toplam += mathematic;
           lesson++;
        }
        System.out.print("Physics grade: ");
        physics = scanner.nextInt();
        if(physics>=0 && physics <=100){
            toplam += physics;
            lesson++;
        }System.out.print("Chemistry grade: ");
        chemistry = scanner.nextInt();
        if(chemistry>=0 && chemistry <=100){
            toplam += chemistry;
            lesson++;
        }System.out.print("Turkish grade: ");
        turkish= scanner.nextInt();
        if(turkish>=0 && turkish<=100){
            toplam += turkish;
            lesson++;
        }System.out.print("Music grade: ");
        music = scanner.nextInt();
        if(music>=0 && music <=100){
            toplam += music;
            lesson++;
        }
        average = toplam/lesson;
        System.out.println("Average = "+average);
        if(average>=55){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
