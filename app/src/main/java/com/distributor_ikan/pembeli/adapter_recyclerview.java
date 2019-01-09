package com.distributor_ikan.pembeli;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.distributor_ikan.R;
import com.distributor_ikan.model.list_ikan;

import java.util.List;

public class adapter_recyclerview extends RecyclerView.Adapter<adapter_recyclerview.MyViewHolder> {
    //TODO:: adapter halaman awal penjual
    private List<list_ikan> list_ikanList;

    public adapter_recyclerview(List<list_ikan> lemparan){
        this.list_ikanList = lemparan;
    }

    @Override
    public adapter_recyclerview.MyViewHolder
    onCreateViewHolder(ViewGroup viewGroup,
                       int i) {
        //TODO : ngeset layout
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_dashboard_pembeli,viewGroup,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(adapter_recyclerview.MyViewHolder pengendali,
                                 int i) {
    //TODO : ngeset isi komponen
        list_ikan ikan = list_ikanList.get(i);
        pengendali.penjual.setText(ikan.getPenjual());
        pengendali.stok.setText(ikan.getStok());
        pengendali.harga.setText(ikan.getHarga());
    }

    @Override
    public int getItemCount() {
        return list_ikanList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView penjual,stok,harga;
        ImageView imageView;

        public MyViewHolder(View view){
          super(view);
        //TODO : inisiasi variabel
            penjual = (TextView) view.findViewById(R.id.tv_penjual);
            stok = (TextView) view.findViewById(R.id.tv_stock);
            harga =(TextView) view.findViewById(R.id.tv_harga);
            imageView = (ImageView) view.findViewById(R.id.iv_fotoikan);

        }
    }

}
