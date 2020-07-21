package drinkGame;

public interface Observer<Subject, ModelData> {

    public void update(Subject subject, ModelData data);
}
