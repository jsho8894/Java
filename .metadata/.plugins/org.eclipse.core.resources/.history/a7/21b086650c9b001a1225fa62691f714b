package src.com.bit.day11;


    class Ball{
        private int num;
        boolean check;
        String color = "";
        Ball(int num){
            this.num=num;
            check=false;
            if(num<11){
                color="노란색";
            }else if(num<21){
                color="파란색";
            }else if(num<31){
                color="빨간색";
            }else if(num<41){
                color="검정색";
            }else{
                color="초록색";
            } 
        }
        void making(){check = true;};
        boolean checking(){return check;}
        void printNum(){System.out.println(color+"공"+num);}
        int showNum(){return num;}
    }
public class Ex07 {
    public static void main(String[] args) {
        Ball[] box =new Ball[45];
        //박스안에 공을 넣기
        for(int i=0; i<box.length; i++){
            box[i] = new Ball(1+i);
        }
        // //박스 흔틀어 섞기
        // Ball temp = null;
        // for(int i = 0; i<99999; i++){
        //     temp = box[0];
        //     int ran =1+(int)(Math.random()*44); //1~44
        //     box[0] = box[ran];
        //     box[ran]=temp;
        // }
        int[] note = new int[6];
        int cnt = 0;
        while(true){
            int ran =(int)(Math.random()*45);//0~44
            Ball ball =  box[ran];
            if(ball.checking()){
                //중복
            }else{
                //중복 아님
                ball.printNum();
                note[cnt] = ball.showNum();
                ball.making();
                cnt++;
                if(cnt == 6){break;}
            }
        }
        int tmp = 0;
        for(int i = 0; i<note.length-1; i++){
            for(int j=i+1; j<note.length; j++){
                if(note[i]>note[j]){
                    tmp = note[i];
                    note[i] = note[j];
                    note[j] = tmp;
                }
            }
        }
        for(int i = 0; i<note.length; i++){
            System.out.print(note[i]+" ");
        }
        System.out.println(" 입니다.\n축하드립니다.");
    }
}