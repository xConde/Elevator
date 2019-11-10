package command;

public interface Observable {
    ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Oberserver o){
        this.observers.add(o);
    }

    public void deleteObserver(Observer o){
        this.observers.delete(o);
    }

    public void setChanged(){

    }

    public void notifyObservers(){

    }

}