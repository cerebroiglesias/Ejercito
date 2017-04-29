import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Armada implements Comparator<Soldados> {
	
	private List<Soldados> lista;
	
	public Armada(){
		lista = new ArrayList<Soldados>();
	}
	
	public void agregar(Soldados nuevo){
		lista.add(nuevo);		
	}

	public List<Soldados> formacion1(){
		List<Soldados> formacion = new ArrayList<Soldados>(this.lista);
		formacion.sort(new CompareFormacion1());
		return formacion;
	}

	public List<Soldados> formacion2(){
		List<Soldados> formacion2 = new ArrayList<Soldados>();
		return formacion2;
	}

	public List<Soldados> formacion3(){
		List<Soldados> formacion3 = new ArrayList<Soldados>();
		return formacion3;
	}

	@Override
	public int compare(Soldados o1, Soldados o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
