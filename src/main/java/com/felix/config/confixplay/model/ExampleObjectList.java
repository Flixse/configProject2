package com.felix.config.confixplay.model;

import java.util.ArrayList;

/**
 * Created by Felix Porres on 14/01/2019.
 */
public class ExampleObjectList {
    private ExampleObject[] exampleObjectArrayList;

    public ExampleObjectList(ExampleObject[] exampleObjectArrayList){
        exampleObjectArrayList = this.exampleObjectArrayList;
    }

    public ExampleObject[] getExampleObjectArrayList() {
        return exampleObjectArrayList;
    }

    public void setExampleObjectArrayList(ExampleObject[] exampleObjectArrayList) {
        this.exampleObjectArrayList = exampleObjectArrayList;
    }
}
