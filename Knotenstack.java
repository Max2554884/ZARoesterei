public class Knotenstack<T> {
    private T content;  // Der Inhalt des Knotens
    private Knotenstack<T> nextKnoten;  // Verweis auf den nächsten Knoten

    // Konstruktor, um den Inhalt des Knotens zu setzen
    public Knotenstack(T pContent) {
        this.content = pContent;
        this.nextKnoten = null;  // Der nächste Knoten ist zu Beginn null
    }

    // Getter für den Inhalt des Knotens
    public T getContent() {
        return content;
    }

    // Setter für den Inhalt des Knotens
    public void setContent(T pContent) {
        this.content = pContent;
    }

    // Getter für den nächsten Knoten
    public Knotenstack<T> getNextNode() {
        return nextKnoten;
    }

    // Setter für den nächsten Knoten
    public void setNextNode(Knotenstack<T> nextKnoten) {
        this.nextKnoten = nextKnoten;
    }
}

