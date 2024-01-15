public class Football extends Sport implements TrainingEquipment{
        private String fieldSize;
        private int numGoals;

        Football(String name,int players,String rules){
            super(name, players, rules);
        }
        String getFieldSize(){
            return fieldSize;
        }
        void setFieldSize(String fieldSize)throws IllegalArgumentException{
            if(fieldSize==null||fieldSize.isEmpty()){
                throw new IllegalArgumentException("Fieldsize cannot be an empty string");
            }this.fieldSize=fieldSize;
        }
        int getNumGoals(){
            return numGoals;
        }
        void setNumGoals(int numGoals){
            if(numGoals<0){
                throw new IllegalArgumentException("Numgoals cannot be a negative number");
            }
            this.numGoals=numGoals;
        }
        public void display(){
            if(getName().equalsIgnoreCase("rugby")||getName().equalsIgnoreCase("ръгби")){
                System.out.println();
                System.out.println("⠀⠀⡠⣤⠤⣤⣤⡤⠤⣀⡀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                        "⡠⡫⢋⠕⠛⠂⡭⢝⣕⠒⠌⠑⠢⡀⠀⠀⠀⠀\r\n" + //
                        "⡗⡰⠃⠀⠀⠀⠠⢚⣨⠖⣭⢽⣿⣍⣦⡀⠀⠀\r\n" + //
                        "⡷⠁⠀⠀⠀⠀⠀⠁⠁⠊⡠⣟⣯⠿⠟⠳⡀⠀\r\n" + //
                        "⠰⡘⠂⠀⠀⠀⠀⠀⠀⠀⡐⠋⠑⠵⢄⠳⣱⡀\r\n" + //
                        "⠀⠹⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠊⢃⣀⢃\r\n" + //
                        "⠀⠀⠙⢿⣧⣄⡀⠀⠀⠀⠀⢀⠞⢀⡔⠋⢧⠸\r\n" + //
                        "⠀⠀⠀⠀⠙⠻⢿⣿⣶⣤⣤⡌⠀⡎⣀⢀⠨⣆\r\n" + //
                        "⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⠛⠃⠐⠛⠛⠛⠛⠁");
                super.display();
                System.out.println("Размер на игрището:"+getFieldSize());
                System.out.println("Брой голове:"+getNumGoals());}
            else{
                System.out.println();
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                        "⠀⠀⠀⠀⠀⡀⠄⠂⣩⠿⠿⠿⣿⡿⠿⠛⠶⣤⣀⠀⠀⠀⠀⠀\r\n" + //
                        "⠀⠀⠀⡠⠊⠁⡠⠊⠀⠀⠀⠀⠀⢣⠀⠀⠀⠀⠙⠷⣄⠀⠀⠀\r\n" + //
                        "⠀⠀⣔⣠⣴⣾⠀⠀⠀⠀⠀⠀⠀⢘⣄⡀⠀⠀⠀⠀⢹⣧⠀⠀\r\n" + //
                        "⠀⡜⣼⣿⣿⣿⣇⣀⠀⠀⠀⢀⣴⣿⣿⣿⣶⣄⡀⠤⠜⢿⣧⠀\r\n" + //
                        "⢰⢁⣿⣿⣿⡿⠁⠀⠀⠉⠉⢻⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⢻⡄\r\n" + //
                        "⢸⡘⠛⠿⡟⠁⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⡏⠀⠀⠀⠀⢸⡇\r\n" + //
                        "⢸⡇⠀⠀⠘⡄⠀⠀⠀⠀⠀⠀⡜⠉⠉⠉⠉⠱⡀⠀⠀⠀⡜⡇\r\n" + //
                        "⠀⢧⠀⠀⠀⠘⣄⡀⠀⠀⢀⠞⠀⠀⠀⠀⠀⠀⠘⣤⣤⣶⢱⠁\r\n" + //
                        "⠀⠘⢆⠀⠀⢠⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⢀⣼⣿⣿⡿⠃⠀\r\n" + //
                        "⠀⠀⠈⠫⡑⠺⣿⣿⣿⣿⣿⣿⣄⣀⡀⠠⠤⣾⣿⣿⠟⠁⠀⠀\r\n" + //
                        "⠀⠀⠀⠀⠈⠒⠤⣉⠻⢿⠛⠉⠀⠀⠀⠀⣀⡨⠛⠁⠀⠀⠀⠀\r\n" + //
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠉⠐⠓⠒⠒⠒⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀");
                super.display();
                System.out.println("Размер на игрището:"+getFieldSize());
                System.out.println("Брой голове:"+getNumGoals());}
            }
        void practice(){}
        void playGame(){}
        void getDetails(){}
        public void useTrainingEquipment(){}
        public void checkEquipmentCondition(){
}
}