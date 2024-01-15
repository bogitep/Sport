import java.util.*;
public class Main{
        private static Scanner sc=new Scanner(System.in);
        public static void main(String[] args) {
                FileHandler.readFromFile(); 
                System.out.print("Зареждане");
                
                try{
                        for(int i=1;i<=3;i++){
                                Thread.sleep(500);
                                System.out.print(".");
                        }
                }catch(Exception e){
                        System.out.println(e);
                }
                        while (true){
                                System.out.println("\n");
                                System.out.println("Меню:");
                                System.out.println("1.Добави спорт");
                                System.out.println("2.Търси спорт");
                                System.out.println("3.Прочети спорт");
                                System.out.println("4.Премахни спорт");
                                System.out.println("5.Изход");
                                System.out.print("Изберете опция: ");
                                
                                int choice=sc.nextInt();
                                sc.nextLine();
                                switch(choice){
                                        case 1:
                                                SportHandler.addSport();
                                                break;
                                        case 2: 
                                                SportHandler.searchSport();
                                                break;
                                        case 3:
                                                SportHandler.readSport();
                                                break;
                                        case 4:
                                                SportHandler.removeSport();
                                                break;
                                        case 5:
                                                FileHandler.writeToFile();
                                                System.exit(0);
                                                break;
                                        default:
                                        System.out.println("Невалиден избор. Изберете отново: ");
                                }     
                        }
        }
}