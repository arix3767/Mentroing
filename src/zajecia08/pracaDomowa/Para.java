package zajecia08.pracaDomowa;

public class Para<T,K> {
    private T element1;
    private K element2;

    public Para(T element1, K żona) {
        this.element1 = element1;
        this.element2 = żona;
    }

    public T getElement1() {
        return element1;
    }

    public K getElement2() {
        return element2;
    }
}
