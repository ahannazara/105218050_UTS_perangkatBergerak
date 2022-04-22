package com.example.miniprojectuts;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RCAdapter extends RecyclerView.Adapter<RCAdapter.MyViewHolder> {

    private final RVinterface rVinterface;
    List<maillist> listmail;
    Context context;


    public RCAdapter(List<maillist> listmail, Context context, RVinterface rVinterface) {
        this.listmail = listmail;
        this.context = context;
        this.rVinterface = rVinterface;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_maillinelit,parent, false);

        return new MyViewHolder(view, rVinterface);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.Sender.setText(listmail.get(position).getName());
        holder.Details.setText(listmail.get(position).getTexted());
        holder.Icon.setText(listmail.get(position).getName().substring(0, 1));
        holder.subjek.setText(listmail.get(position).getSubjek());
        holder.tanggal.setText(listmail.get(position).getTanggal());
        holder.bulan.setText(listmail.get(position).getBulan());
    }

    @Override
    public int getItemCount() {
        return listmail.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder  {
        TextView Sender;
        TextView Details;
        TextView Icon;
        TextView subjek;
        TextView tanggal;
        TextView bulan;



        public MyViewHolder(@NonNull View itemView, RVinterface rVinterface) {
            super(itemView);
            Sender = itemView.findViewById(R.id.tvEmailSender);
            Details = itemView.findViewById(R.id.tvEmailDetails);
            Icon = itemView.findViewById(R.id.tvIcon);
            subjek = itemView.findViewById(R.id.titletitle);
            tanggal = itemView.findViewById(R.id.tanggal);
            bulan = itemView.findViewById(R.id.tahun);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(rVinterface != null){
                        int pos =getAdapterPosition();

                        if(pos !=RecyclerView.NO_POSITION){
                            rVinterface.onItemClick(pos);
                        }

                    }

                    Sender.setTypeface(null, Typeface.NORMAL);
                    Details.setTypeface(null, Typeface.NORMAL);
                    subjek.setTypeface(null, Typeface.NORMAL);
                }
            });
        }

}}
