package com.vaadin.employeesdirectory.mvputils;

public interface View<P extends Presenter> {
    P getPresenter();
}
