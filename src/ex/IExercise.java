package ex;

public interface IExercise {
    //only constants are allowed as data
    int TIME = 0; //instance field is NOT allowed (public static final is implicit)

    //only public abstract methods are allowed
    void movement(); //public is implicit
    void restPeriod();
    void burnCalories();
}
