package tp_pgm;
import java.io.*;

public class Lirepgm {
	public static void main(String[] args){
		String chaine="";
		String fichier ="lena.pgm";
		
		//lecture du fichier texte	
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				System.out.println(ligne);
				chaine+=ligne+"\n";
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
	
		//cr�ation ou ajout dans le fichier texte
		try {
			FileWriter fw = new FileWriter (fichier);
			BufferedWriter bw = new BufferedWriter (fw);
			PrintWriter fichierSortie = new PrintWriter (bw); 
				fichierSortie.println (chaine+"\n test de lecture et �criture !!"); 
			fichierSortie.close();
			System.out.println("Le fichier " + fichier + " a �t� cr��!"); 
		}
		catch (Exception e){
			System.out.println(e.toString());
		}		
	}
}
