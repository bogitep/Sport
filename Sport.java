import java.io.Serializable;
import java.util.Scanner;

public abstract class Sport implements Serializable{
        private String name;
        private int players;
        private String rules;
static Scanner sc = new Scanner(System.in);

    Sport(String name, int players, String rules) {
        }
        public String getName(){
                return name;
        }
        public void setName(String name)throws IllegalArgumentException{
                if(name==null||name.isEmpty()){
                        throw new IllegalArgumentException("Name cannot be an empty string.");
                }
                this.name=name;
                }
        public int getPlayers(){
                return players;
        }
        public void setPlayers(int players)throws IllegalArgumentException{
                if(players<0){
                        throw new IllegalArgumentException("Players cannot be a negative number.");
                }
                this.players=players;     
        }
        public String getRules(){
                return rules;
        }
        public void setRules(String rules)throws IllegalArgumentException{
                if(rules==null||rules.isEmpty()){
                        throw new IllegalArgumentException("Rules cannot be an empty string.");
                }
                this.rules=rules;
        }
        public void display(){
                System.out.println();
                System.out.println("Име:"+getName());
                System.out.println("Играчи:"+getPlayers());
                System.out.println("Правила:"+getRules());
        }
        abstract void practice();
        abstract void playGame();
        abstract void getDetails();
}