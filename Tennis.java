
public class Tennis extends Sport implements TrainingEquipment{
        private String courtType;
        private double racquetWeight;
        Tennis(String name,int players,String rules){
                super(name,players,rules);
        }
        String getCourtType(){
                return courtType;
        }
        void setCourtType(String courtType)throws IllegalArgumentException{
                if(courtType==null||courtType.isEmpty()){
                        throw new IllegalArgumentException("Courttype cannot be an empty String.");
                }
                this.courtType=courtType;
                }
        double getRacquetWeight(){
                return racquetWeight;
        }
        void setRacquetWeight(double racquetWeight)throws IllegalArgumentException{
                if(racquetWeight<0){
                        throw new IllegalArgumentException("Racquetweight cannot be a negative number.");
                }
                this.racquetWeight=racquetWeight;
        }
        public void display() {
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣶⣶⣾⡇⢸⣷⣶⣶⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                "⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⠁⣼⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀\r\n" + //
                                "⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⡏⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀\r\n" + //
                                "⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⠟⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀\r\n" + //
                                "⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⠟⢁⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀\r\n" + //
                                "⠀⠀⣸⣿⣿⠿⠟⠛⢉⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀\r\n" + //
                                "⠀⠀⣉⣠⣤⣴⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠛⢉⣉⣉⠀⠀\r\n" + //
                                "⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⢉⣤⣶⣾⣿⣿⣿⡏⠀⠀\r\n" + //
                                "⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⢁⣴⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀\r\n" + //
                                "⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⢠⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀\r\n" + //
                                "⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢀⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀\r\n" + //
                                "⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⠁⣼⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀\r\n" + //
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠿⠿⢿⡏⢠⡿⠿⠿⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                super.display();
                System.out.println("Вид на корта:" + getCourtType());
                System.out.println("Teгло на ракетата:"+getRacquetWeight());
                }
        void playGame(){}
        void practice(){}
        void getDetails(){}
        public void useTrainingEquipment(){}
        public void checkEquipmentCondition(){}
}
