public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() { //si existe el objeto
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.
                display();
    }
}

