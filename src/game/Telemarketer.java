package game;

public class Telemarketer extends Person implements IPest {
    private void call(String callTime) { }
    private void introduceProduct() { }
    private void sayGoodbye() { }
    private void continueTalkingWithoutListening() { }
    private void sell(boolean customerSaysYes, boolean aggressive) {
        if(aggressive) {
            continueTalkingWithoutListening();
        } else {
            if (customerSaysYes) {
                introduceProduct();
            } else {
                sayGoodbye();
            }
        }
    }

    @Override
    public void annoy() {
        call("During Dinner");
        sell(false, true);
    }
}
