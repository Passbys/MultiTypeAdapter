package org.zy.multitypeadapter.holder;

import android.view.View;
import android.widget.TextView;

import org.zy.multitypeadapter.R;
import org.zy.multitypeadapter.adapter.MultiTypeAdapter;
import org.zy.multitypeadapter.model.Two;

public class TwoViewHolder extends BaseViewHolder<Two> {
    public TwoViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(Two model, int position, MultiTypeAdapter adapter) {
        TextView textView = (TextView) getView(R.id.two_title);
        textView.setText(model.getText());
    }


}
