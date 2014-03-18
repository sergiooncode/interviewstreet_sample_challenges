import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CardShuffling {

	public static int[] shuffler(int[][] kp, int n, int k) {
		int count = 0;
		int nk = n/k;
		int sd[] = new int[n];
		for(int p=0; p < nk; p++) {
			for(int t=k-1; t >= 0; t--) {
				sd[count] = kp[p][t];
				count++;
			}
		}
		return sd;
	}

	public static int[] initialdeckcreator(int n) {
		int id[] = new int[n];
		for(int c=0; c < n; c++) {
			id[c] = c;
		}
		return id; 
	}

	public static int[][] piler(int deck[], int n, int k) {
		int count = 0;
		int nk = n/k;
		int kp[][] = new int[nk][k];
		for(int t=0; t < k; t++) {
			for(int p=0; p < nk; p++) {
				kp[p][t] = deck[count];
				count++;
			}
		}
		return kp;
	}

	public static boolean thereyet(int id[], int sd[]) {
		for(int i=0; i < sd.length; i++) {
			if(sd[i] != id[i]) {
				return false;
			}
		}
		return true;
	}

	public static void test (Scanner sc, PrintWriter pw) {
        Scanner s = sc;
        int least = 1;
        int nparam = s.nextInt();
        int kparam = s.nextInt();
        sc.nextLine();

		int initial_deck[]; 
		int shuffled_deck[]; 
		int kpiles[][]; 

		initial_deck = initialdeckcreator(nparam);
		kpiles = piler(initial_deck, nparam, kparam);
		shuffled_deck = shuffler(kpiles, nparam, kparam);

		while(!thereyet(initial_deck, shuffled_deck)) {
			least++;
			kpiles = piler(shuffled_deck, nparam, kparam);
			shuffled_deck = shuffler(kpiles, nparam, kparam);
		}
		pw.println(least);
	}

	public static void main(String[] args) {
		String base="./";
        String input=base + "cs.in";
        String output=base + "cs.out";
        
        try {
            Scanner sc = new Scanner(new FileReader(input));
            PrintWriter pw = new PrintWriter(output);
            
            int n = sc.nextInt();
            sc.nextLine();
            for (int c=0; c<n; c++) {
                System.out.println("Test case " + (c+1) + "...");
                test(sc, pw);
            }
            pw.flush();
            pw.close();
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CardShuffling.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
}

