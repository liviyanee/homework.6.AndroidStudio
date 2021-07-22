package com.example.homework6androidstudio;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;

public class PicAdapter extends RecyclerView.Adapter<PicAdapter.PicHolder> {

    List <PicModel> list = new ArrayList<>();

    public PicAdapter(List<PicModel> list) {
        this.list = list;
    }
    public void addTask(PicModel model){
        list.add(model);
        notifyDataSetChanged();
    }


    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public PicAdapter.PicHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_holder,parent,false);
        return new PicHolder(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PicAdapter.PicHolder holder, int position) {
        holder.txtTitle.setText(list.get(position).getTitle());
        holder.txtDescription.setText(list.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PicHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtDescription;


        public PicHolder(@NonNull @NotNull View itemView) {
            super(itemView);

        }


    };


}




