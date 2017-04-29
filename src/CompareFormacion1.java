import java.util.Comparator;

public class CompareFormacion1 implements Comparator<Soldados> {

	@Override
	public int compare(Soldados o1, Soldados o2) {
		if(o1.getRango()<=o2.getRango()){
			return -1;
		}
		else{
			return 1;
		}
	}

}
