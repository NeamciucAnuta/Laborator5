import java.util.Vector;

public class Capitol {
	Vector<Subcapitol> subcapitole;
	Capitol() { }
	Capitol(Vector<Subcapitol> subcapitole) {
		this.subcapitole = subcapitole;
	}
	public Vector<Subcapitol> getSubcapitole() {
		return subcapitole;
	}

	public void setSubcapitole(Vector<Subcapitol> subcapitole) {
		this.subcapitole = subcapitole;
	}
}
