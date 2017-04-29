import java.util.Comparator;

public class CompareFormacion2  implements Comparator<Soldados> {

	@Override
	public int compare(Soldados o1, Soldados o2) {
		if(o1.getVelocidad()<=o2.getVelocidad()){
			return -1;
		}
		else{
			return 1;
		}
	}

}
