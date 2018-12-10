package com.graywater.customgraywater.component.model;


public interface BaseModel {
    interface Title {
        String getTitle();
    }

    interface Head {
        String getTitle();

        String getButtonText();
    }
}
