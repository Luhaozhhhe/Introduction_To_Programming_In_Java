public class FooCorporation {
    public static void jisuan(double Base_pay,int time){
        if(Base_pay < 8 || time>60){
            System.out.println("wrong!the input is incorrect!");
        }
        else{
            double result;
            if(time<=40){
                result=time*Base_pay;
                System.out.println(result);
            }
            else{
                result=40*Base_pay+(time-40)*1.5*Base_pay;
                System.out.println(result);
            }
        }

    }
    public static void main(String[] arguments){
        double pay1=7.5;
        int time1=35;
        jisuan(pay1,time1);
        double pay2=8.2;
        int time2=47;
        jisuan(pay2,time2);
        double pay3=10;
        int time3=73;
        jisuan(pay3,time3);

    }
}
