package inaki.sw.calc.view;

import inaki.sw.calc.controller.Controller;

/**
 *
 * @author inaki
 * @since 3.1
 */
public interface IView {

    public void setController(Controller c);

    public void startView();

    public void enableView();

    public void disableView();

}
