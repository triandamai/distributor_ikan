package com.distributor_ikan.penjual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.distributor_ikan.R;

public class dashboard_penjual extends AppCompatActivity implements View.OnClickListener {
//TODO:: halaman awal penjual
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_penjual);
        inisiasi_variabel();
    }
    //TODO ::: onclick
    @Override
    public void onClick(View v) {

    }
    //TODO ::: methods
    private void inisiasi_variabel() {
    }
}
