public class Basketball extends Sport implements TrainingEquipment{
        private String hoopHeight;
        private String ballSize;
        Basketball(String name,int players,String rules){
                super(name,players,rules);
        }           
        String getHoopHeight(){
                return hoopHeight;
        }
        void setHoopHeight(String hoopHeight)throws IllegalArgumentException{
                if(hoopHeight==null || hoopHeight.isEmpty()){
                        throw new IllegalArgumentException("Hoopheight cannot be an empty string.");
                }
                this.hoopHeight=hoopHeight;
        }
        String getBallSize(){
                return ballSize;
        }
        void setBallSize(String ballSize)throws IllegalArgumentException{
                if(ballSize==null|| ballSize.isEmpty()){
                        throw new IllegalArgumentException("Ballsize cannot be an empty string.");
                }
                this.ballSize=ballSize;
                }      
        public void display() {
                System.out.println();
                System.out.println();
                System.out.println("⠀⠀⠀⠀⢀⠄⡢⠚⠉⠀⠈⠉⠀⠀⠠⡀⠀⠀⠀⠀\r\n" + //
                                "⠀⠀⡠⠊⢀⠎⠀⠀⠀⠀⠀⠀⠀⣀⡤⠤⠑⢄⠀⠀\r\n" + //
                                "⠀⡔⠀⢀⠎⠀⠀⠀⠀⢀⡠⠖⠋⠁⠀⠀⠀⠀⠠⠀\r\n" + //
                                "⢸⡄⠀⡼⠀⠀⢀⣠⠖⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                "⡇⠛⠦⡧⠴⠖⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸\r\n" + //
                                "⣧⣀⣀⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣤⠴⠖⢻\r\n" + //
                                "⢀⠀⠉⡍⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀\r\n" + //
                                "⠀⠳⠒⢳⠲⠤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠔⠀\r\n" + //
                                "⠀⠀⠑⢌⢧⡀⠀⠉⠒⠤⣄⡀⠀⠀⠀⠀⡠⠊⠀⠀\r\n" + //
                                "⠀⠀⠀⠀⠈⠛⠄⠀⣀⡀⠀⣀⠉⠉⠑⠉⠀⠀⠀⠀");
                super.display();
                System.out.println("Височина на коша: " + getHoopHeight());
                System.out.println("Размер на топката: " + getBallSize());
        }
        void practice(){}
        void playGame(){}
        void getDetails(){}
        public void useTrainingEquipment(){}
        public void checkEquipmentCondition(){}
}