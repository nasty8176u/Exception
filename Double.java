public class Ex1{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число");
        double number;
        boolean check = true;
        while (check){
            try{
                number=new Scanner(System.in).nextDouble();
                check = false;
            }
            catch(Exception e){
                System.out.println(e.getMessege());
            }
        }
    }
}