package org.zy.multitypeadapter.Type;

import android.view.View;

import org.zy.multitypeadapter.R;
import org.zy.multitypeadapter.holder.BaseViewHolder;
import org.zy.multitypeadapter.holder.NormalViewHolder;
import org.zy.multitypeadapter.holder.OneViewHolder;
import org.zy.multitypeadapter.holder.ThreeViewHolder;
import org.zy.multitypeadapter.holder.TwoViewHolder;
import org.zy.multitypeadapter.model.Normal;
import org.zy.multitypeadapter.model.One;
import org.zy.multitypeadapter.model.Three;
import org.zy.multitypeadapter.model.Two;

public class TypeFactoryForList implements TypeFactory {
    private final int TYPE_RESOURCE_ONE = R.layout.layout_item_one;
    private final int TYPE_RESOURCE_TWO = R.layout.layout_item_two;
    private final int TYPE_RESOURCE_THREE = R.layout.layout_item_three;
    private final int TYPE_RESOURCE_NORMAL = R.layout.layout_item_normal;
    @Override
    public int type(One one) {
        return TYPE_RESOURCE_ONE;
    }

    @Override
    public int type(Two one) {
        return TYPE_RESOURCE_TWO;
    }

    @Override
    public int type(Three one) {
        return TYPE_RESOURCE_THREE;
    }

    @Override
    public int type(Normal normal) {
        return TYPE_RESOURCE_NORMAL;
    }

    @Override
    public BaseViewHolder createViewHolder(int type, View itemView) {

        if(TYPE_RESOURCE_ONE == type){
            return new OneViewHolder(itemView);
        }else if (TYPE_RESOURCE_TWO == type){
            return new TwoViewHolder(itemView);
        }else if (TYPE_RESOURCE_THREE == type){
            return new ThreeViewHolder(itemView);
        }else if (TYPE_RESOURCE_NORMAL == type){
            return new NormalViewHolder(itemView);
        }

        return null;
    }
}
