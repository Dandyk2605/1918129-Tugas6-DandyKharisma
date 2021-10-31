package com.example.tugas4dandy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>{

    private ArrayList<Mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new MahasiswaViewHolder(view);
    }

    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.profile_image.setImageResource(dataList.get(position).getPhoto());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNim.setText(dataList.get(position).getNim());
        holder.txtAngkatan.setText(dataList.get(position).getAngkatan());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private CircleImageView profile_image;
        private TextView txtNama, txtNim, txtAngkatan;
//        private CircleImageView profile_image;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            profile_image= (CircleImageView) itemView.findViewById(R.id.profile_image);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtNim = (TextView) itemView.findViewById(R.id.txt_nim);
            txtAngkatan = (TextView) itemView.findViewById(R.id.txt_angkatan);
        }
    }
}

