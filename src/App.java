import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner puter = new Scanner(System.in);


        int[] fältUser = new int[4];
        System.out.println("Skriv in fyra heltal");
        String in = puter.nextLine();

        int space1 = in.indexOf(" ");
        fältUser[0] = Integer.parseInt(in.substring(0, space1));
        int space2 = in.indexOf(" ", space1+1);
        fältUser[1] = Integer.parseInt(in.substring(space1+1, space2));
        int space3 = in.indexOf(" ", space2+1);
        fältUser[2] = Integer.parseInt(in.substring(space2+1, space3));
        fältUser[3] = Integer.parseInt(in.substring(space3+1));

        int blank;
        blank = fältUser[0];
        fältUser[0] = fältUser[3];
        fältUser[3] = blank;
        blank = fältUser[1];
        fältUser[1] = fältUser[2];
        fältUser[2] = blank; 
        
        System.out.println("Dina tal är: "+fältUser[0]+fältUser[1]+fältUser[2]+fältUser[3]);

        


    }
}
