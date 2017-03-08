package org.zy.multitypeadapter.holder;

import android.view.View;
import android.widget.TextView;


import org.zy.multitypeadapter.R;
import org.zy.multitypeadapter.adapter.MultiTypeAdapter;
import org.zy.multitypeadapter.holder.BaseViewHolder;
import org.zy.multitypeadapter.model.Three;


public class ThreeViewHolder extends BaseViewHolder<Three> {
    public ThreeViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(Three model, int position, MultiTypeAdapter adapter) {
        TextView textView = (TextView) getView(R.id.three_title);
        textView.setText(model.getText());
    }
}
