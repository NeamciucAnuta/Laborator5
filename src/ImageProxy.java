public class ImageProxy extends AbstractElement {

	private String fileName;
	private Imagine realImage = null;
	
	public ImageProxy(String fileName) {
		this.fileName = fileName;
	}
	
	public void print() {	
		if (realImage.equals(null)) {
			 realImage = new Imagine(fileName);
		}
	}
	
}
