import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Principal {
	
	
	public static void main(String[] args) {
		
		Cesta<Fruta> frutas = new Cesta<>();
		frutas.adiciona(new Fruta("Ma��"));
		frutas.adiciona(new Fruta("Banana"));
		frutas.adiciona(new Fruta("Mam�o"));
		frutas.adiciona(new Fruta("Pera"));
		frutas.adiciona(new Fruta("Uva"));
		frutas.adiciona(new FrutaVermelha("morango"));
		
		List<FrutaVermelha> vermelhas = new ArrayList<>();
		vermelhas.add(new FrutaVermelha("Amora"));
		vermelhas.add(new FrutaVermelha("Cereja"));
		
		
		
		while (frutas.temItens()){
			System.out.println(frutas.retira());
		}
	}
}
