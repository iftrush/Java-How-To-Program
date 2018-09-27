import java.util.Scanner;
import java.util.Random;

public class EX7_19{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        int n, seat, temp = 0;
        boolean ffull = false;
        boolean efull = false;
        int fc = randomNumber.nextInt(10);
        int ec = randomNumber.nextInt(10);
        int t[] = new int[1];
        if(fc == 0){
            ffull = true;
        }else if(ec == 0){
            efull = true;
        }
        System.out.printf("There are %d seats in first class and %d seats in economy class%n", fc, ec);
        int f[] = new int[fc];
        for(int i = 0; i < fc; i++){
            f[i] = i+1;
        }
        int e[] = new int[ec];
        for(int i = 0; i < ec; i++){
            e[i] = i+1;
        }
        System.out.println("Please type 1 for First Class");
        System.out.println("Please type 2 for Economy Class");
        n = input.nextInt();
        while(ffull == false && efull == false){
            if(n != 1 && n != 2){
                System.out.println("Please type 1 for First Class");
                System.out.println("Please type 2 for Economy Class");
                n = input.nextInt();
            }else{
                if(n == 1){
                    t[0] = 0;
                    seat = randomNumber.nextInt(fc);
                    System.out.printf("Your seat for First Class is #%d%n", f[seat]);
                    t[temp] = f[seat];
                    f[seat] = f[fc-1];
                    f[fc-1] = t[temp];
                    fc--;
                    if(fc == 0){
                        ffull = true;
                    }
                }else{
                    t[0] = 0;
                    seat = randomNumber.nextInt(ec);
                    System.out.printf("Your seat for Economy Class is #%d%n", e[seat]);
                    t[temp] = e[seat];
                    e[seat] = e[ec-1];
                    e[ec-1] = t[temp];
                    ec--;
                    if(ec == 0){
                        efull = true;
                    }
                }
                System.out.println("Please type 1 for First Class");
                System.out.println("Please type 2 for Economy Class");
                n = input.nextInt();
            }
        }
        while(ffull == true && efull == false){
            System.out.println("The First Class is no longer available for booking");
            System.out.println("Type 1 to end the program or 2 to purchase for Economy Class");
            n = input.nextInt();
            if(n == 1){
                System.out.printf("There are %d seats in first class and %d seats in economy class%n", fc, ec);
                System.exit(0);
            }else if(n == 2){
                t[0] = 0;
                seat = randomNumber.nextInt(ec);
                System.out.printf("Your seat for Economy Class is #%d%n", e[seat]);
                t[temp] = e[seat];
                e[seat] = e[ec-1];
                e[ec-1]   = t[temp];
                ec--;
                if(ec == 0){
                    efull = true;
                }
            }else{
                System.out.println("The First Class is no longer available for booking");
                System.out.println("Type 1 to end the program or 2 to purchase for Economy Class");
                n = input.nextInt();
            }
        }
        while(ffull == false && efull == true){
            System.out.println("The Economy Class is no longer available for booking");
            System.out.println("Type 2 to end the program or 1 to purchase for Economy Class");
            n = input.nextInt();
            if(n == 2){
                System.out.printf("There are %d seats in first class and %d seats in economy class%n", fc, ec);
                System.exit(0);
            }else if(n == 1){
                t[0] = 0;
                seat = randomNumber.nextInt(fc);
                System.out.printf("Your seat for First Class is #%d%n", f[seat]);
                t[temp] = f[seat];
                f[seat] = f[fc-1];
                f[fc-1] = t[temp];
                fc--;
                if(fc == 0){
                    ffull = true;
                }
            }else{
                System.out.println("The Economy Class is no longer available for booking");
                System.out.println("Type 1 to end the program or 2 to purchase for Economy Class");
                n = input.nextInt();
            }
        }
        input.close();
    }
}