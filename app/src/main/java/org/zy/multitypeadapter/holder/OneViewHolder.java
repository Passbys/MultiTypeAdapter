package org.zy.multitypeadapter.holder;

import android.view.View;
import android.widget.TextView;

import org.zy.multitypeadapter.R;
import org.zy.multitypeadapter.adapter.MultiTypeAdapter;
import org.zy.multitypeadapter.model.One;

public class OneViewHolder extends BaseViewHolder<One> {
    public OneViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(One model, int position, MultiTypeAdapter adapter) {
        TextView textView = (TextView) getView(R.id.one_title);
        textView.setText(model.getText());
    }
}
