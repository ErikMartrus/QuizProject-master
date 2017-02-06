package es.ulpgc.eite.android.quiz;

/**
 * Created by Erik on 06/02/2017.
 */

public class Presenter {
    Model myModel;
    QuestionActivity View;


    public Presenter(QuestionActivity view) {
        myModel = new Model();
        View = questionActivity;
    }

    public void buttonTruePressed() {
        myModel.increment();
        View.setDisplay (myModel.getCounter().toString());
    }

    public void buttonFalsePressed() {
        myModel.decrement();
        myView.setDisplay (myModel.getCounter().toString());
    }

    public void buttonCheatPressed() {
        myModel.decrement();
        myView.setDisplay (myModel.getCounter().toString());
    }

}

}
