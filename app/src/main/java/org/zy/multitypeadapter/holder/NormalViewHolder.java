package org.zy.multitypeadapter.holder;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.zy.multitypeadapter.R;
import org.zy.multitypeadapter.adapter.MultiTypeAdapter;
import org.zy.multitypeadapter.model.Normal;


public class NormalViewHolder extends BaseViewHolder<Normal> {
    public NormalViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(final Normal model, int position, MultiTypeAdapter adapter) {
        final TextView textView = (TextView) getView(R.id.normal_title);
        textView.setText(model.getText());

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(textView.getContext(),model.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
