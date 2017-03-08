package org.zy.multitypeadapter.model;

import org.zy.multitypeadapter.Type.TypeFactory;
import org.zy.multitypeadapter.model.Visitable;

public class Two implements Visitable {
    String text;

    public Two(String text) {
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
