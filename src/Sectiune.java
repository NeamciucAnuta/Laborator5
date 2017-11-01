
import java.util.ArrayList;

public class Sectiune extends AbstractElement {
	private String titlu;
	private ArrayList<Element> sectiune = new ArrayList<>();
	public Sectiune(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public ArrayList<Element> getSectiune() {
		return sectiune;
	}
	public void setSectiune(ArrayList<Element> sectiune) {
		this.sectiune = sectiune;
	}

}
