package n358vu.krisa.youtubemostpopular.presenter;

/**
 * Created by kkrisst on 24/04/2016.
 */
public abstract class Presenter<S> {
    protected S view;

    public void attachView(S screen) {
        this.view = screen;
    }

    public void detachView() {
        this.view = null;
    }
}