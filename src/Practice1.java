public class Practice1 {
    public static void main(String[] args) {
        boolean a = true;
        if (a){
            System.out.print("OK. I think...");
            System.out.println("a is true");
        }
        System.out.println("a is still true");


        int age =-1;
        if(age>0){
            if(age<14) {
                System.out.println("無行為能力人");
            } else if(14<age && age<18  || age>=80) {
                System.out.println("限制行為能力人");
            }else {
                System.out.println("完全行為能力人");
            }

        }else {
            System.out.println("請重新輸入!");
        }

    }

}
