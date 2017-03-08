package org.zy.multitypeadapter.Type;

import android.view.View;

import org.zy.multitypeadapter.holder.BaseViewHolder;
import org.zy.multitypeadapter.model.Normal;
import org.zy.multitypeadapter.model.One;
import org.zy.multitypeadapter.model.Three;
import org.zy.multitypeadapter.model.Two;

public interface TypeFactory {
    int type(One one);

    int type(Two two);

    int type(Three three);

    int type(Normal normal);

    BaseViewHolder createViewHolder(int type, View itemView);
}
