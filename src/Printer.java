public class Printer <T>{
    T printData;

    public Printer(T printData){
        this.printData= printData;
    }

    public void print(){
        System.out.println(printData);
    }

    public T returndata() {
        return printData;
    }
}
