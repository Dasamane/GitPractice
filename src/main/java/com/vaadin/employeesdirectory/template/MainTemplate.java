package com.vaadin.employeesdirectory.template;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLayout;

public class MainTemplate extends VerticalLayout implements RouterLayout {


    public MainTemplate(){
        getStyle().set("background-image", "url('images/modern-white-background-free-vector.jpg')")
                .set("background-size", "cover");
        setSizeFull();
//        setBackGroundImage();
    }

    private void setBackGroundImage() {
        getStyle().set("background-image", "META-INF/resources/images/modern-white-background-free-vector.jpg")
                .set("background-size", "cover");
       // getStyle().set("background-color","green");

        setSizeFull();;
    }

}
