package org.zy.multitypeadapter.model;

import org.zy.multitypeadapter.Type.TypeFactory;

public class One implements Visitable {
    String text;

    public One(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
