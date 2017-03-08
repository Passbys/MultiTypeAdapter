package org.zy.multitypeadapter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import org.zy.multitypeadapter.Type.TypeFactory;
import org.zy.multitypeadapter.Type.TypeFactoryForList;
import org.zy.multitypeadapter.holder.BaseViewHolder;
import org.zy.multitypeadapter.model.Visitable;

import java.util.List;

public class MultiTypeAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private TypeFactory typeFactory;
    private List<Visitable> models;

    public MultiTypeAdapter(List<Visitable> models) {
        this.models = models;
        this.typeFactory = new TypeFactoryForList();

    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();

        View itemView = View.inflate(context,viewType,null);
        return typeFactory.createViewHolder(viewType,itemView);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setUpView(models.get(position),position,this);
    }

    @Override
    public int getItemCount() {
        if(null == models){
            return  0;
        }
        return models.size();
    }


    @Override
    public int getItemViewType(int position) {
        return models.get(position).type(typeFactory);
    }

}
