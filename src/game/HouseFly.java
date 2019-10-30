package game;

public class HouseFly extends Insect implements IPest {
    public void flyAroundHeads() { }
    public void landOnFoods() { }
    public void hide() { }
    public void makeNoise() { }

    @Override
    public void annoy() {
        flyAroundHeads();
        makeNoise();
        landOnFoods();
    }
}
