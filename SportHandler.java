import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportHandler {
        private static List<Sport> sportsCollection = new ArrayList<>();
        private static Scanner sc=new Scanner(System.in);
        public static void addSport() {
                System.out.print("Изберете тип спорт(1-Футбол, 2-Тенис, 3-Баскетбол): ");
                int sportType = sc.nextInt();
                sc.nextLine();
                
                switch(sportType) {
                    case 1: 
                        Football football = createFootball();
                        sportsCollection.add(football); 
                        break;
                    case 2:
                        Tennis tennis = createTennis();
                        sportsCollection.add(tennis); 
                        break;
                    case 3:
                        Basketball basketball = createBasketball();
                        sportsCollection.add(basketball); 
                        break;
                }
                System.out.println("Успешно добавихте спорт.");
            }
            public static Football createFootball() {
                Football f = new Football(null, 0, null);
                boolean validInput = false;
                while (!validInput) {
                    try {
                        System.out.print("Въведете име на футболната игра: ");
                        String name = sc.nextLine();
                        f.setName(name);
            
                        System.out.print("Въведете брой играчи: ");
                        int players = Integer.parseInt(sc.nextLine());
                        f.setPlayers(players);
            
                        System.out.print("Въведете правила на играта: ");
                        String rules = sc.nextLine();
                        f.setRules(rules);
            
                        System.out.print("Въведете размер на игрището: ");
                        String fieldSize = sc.nextLine();
                        f.setFieldSize(fieldSize);
            
                        System.out.print("Въведете брой голове: ");
                        int goals = Integer.parseInt(sc.nextLine());
                        f.setNumGoals(goals);
            
                        validInput = true;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Грешка: " + e.getMessage());
                        System.exit(1);
                    }
                }
                return f;
            }
            public static Tennis createTennis() {
                Tennis t = new Tennis(null, 0, null);
                boolean validInput = false;
                while (!validInput) {
                    try {
                        System.out.print("Въведете име на тенис спорта: ");
                        String name = sc.nextLine();
                        t.setName(name);
            
                        System.out.print("Въведете брой играчи: ");
                        int players = Integer.parseInt(sc.nextLine());
                        t.setPlayers(players);
            
                        System.out.print("Въведете правила на играта: ");
                        String rules = sc.nextLine();
                        t.setRules(rules);
            
                        System.out.print("Въведете вид на корта: ");
                        String courtType = sc.nextLine();
                        t.setCourtType(courtType);
            
                        System.out.print("Въведете тегло на ракетата: ");
                        double racquetWeight = Double.parseDouble(sc.nextLine());
                        t.setRacquetWeight(racquetWeight);
            
                        validInput = true;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Грешка: " + e.getMessage());
                        System.exit(1);
                    }
                }
                return t;
            }
            public static Basketball createBasketball() {
                Basketball b = new Basketball(null, 0, null);
                boolean validInput = false;
                while (!validInput) {
                    try {
                        System.out.print("Въведете име на спорта: ");
                        String name = sc.nextLine();
                        b.setName(name);
            
                        System.out.print("Въведете брой играчи: ");
                        int players = Integer.parseInt(sc.nextLine());
                        b.setPlayers(players);
            
                        System.out.print("Въведете правила на играта: ");
                        String rules = sc.nextLine();
                        b.setRules(rules);
            
                        System.out.print("Въведете размер на коша: ");
                        String hoopHeight = sc.nextLine();
                        b.setHoopHeight(hoopHeight);
            
                        System.out.print("Въведете размер на топката: ");
                        String ballSize = sc.nextLine();
                        b.setBallSize(ballSize);
            
                        validInput = true;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Грешка: " + e.getMessage());
                        System.exit(1);
                    }
                }
                return b;
            }
        public static void searchSport() {
                System.out.print("Въведете име на спорта, който търсите: ");
                String sportName = sc.nextLine();
        
                boolean found=false;
                for (Sport sport : sportsCollection) {
                    if (sport.getName().equalsIgnoreCase(sportName)) {

                        System.out.println("Спорт намерен: " + sport.getName());
                        found=true;
                        break;
                    }
                    }
                    if(!found){
                        System.out.println("Спорт с име " + sportName + " не е намерен.");
                }
        }
        public static void readSport() {
            boolean exitReadSport=false;
            while(!exitReadSport){
                if (sportsCollection.isEmpty()) {
                System.out.println("Няма налични спортове за четене.");
                return;
            }
        
            System.out.println("Налични спортове:");
            for (int i = 0; i < sportsCollection.size(); i++) {
                System.out.println((i + 1) + ". " + sportsCollection.get(i).getName());
            }
        
            System.out.print("Изберете номер на спорт, който искате да прегледате(0 за да се върнете към менюто):");
            int choice = sc.nextInt();
            sc.nextLine(); 
            if(choice==0){
                exitReadSport=true;
            }
            else if (choice >= 1 && choice <= sportsCollection.size()) {
                Sport chosenSport = sportsCollection.get(choice - 1);
                System.out.print("Зареждане на спорта за четене");
                try{
                    for(int i=0;i<3;i++){
                            Thread.sleep(1000);
                            System.out.print(".");
                    }
            }
            catch(Exception e){
                    System.out.println(e);
            }
                chosenSport.display();
            } else {
                System.out.println("Невалиден избор на спорт.");
            }
            }
            
        }
        public static void removeSport() {
                boolean exitRemoveSport = false;

                while (!exitRemoveSport) {
                        if (sportsCollection.isEmpty()) {
                        System.out.println("Няма спортове за премахване.");
                        exitRemoveSport = true;
                        } else {
                        System.out.println("Налични спортове:");
                for (int i = 0; i < sportsCollection.size(); i++) {
                System.out.println((i + 1) + ". " + sportsCollection.get(i).getName());
                }
                System.out.println("Изберете спорт, който желаете да премахнете (или 0 за да се върнете на менюто): ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 0) {
                exitRemoveSport = true;
                } else if (choice >= 1 && choice <= sportsCollection.size()) {
                sportsCollection.remove(choice - 1);
                System.out.println("Този спорт беше успешно премахнат.");
                } else {
                System.out.println("Невалиден избор.");
            }
        }
    }
}
}