package com.kino.main;

import android.content.Intent;
import android.os.Parcelable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.kino.main.adapter.AdapterListOutletSectioned;
import com.kino.main.model.SectionOutletModel;
import com.kino.main.modelservice.GroupOutlet;
import com.kino.main.modelservice.Outlet;
import com.kino.main.utilities.AppUtil;

import java.util.ArrayList;
import java.util.List;

public class ListOutlet extends AppCompatActivity {
    private View parent_view;

    private RecyclerView recyclerView;
    private AdapterListOutletSectioned mAdapter;
    private int pilih =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_outlet);
        parent_view = findViewById(android.R.id.content);
        Bundle extras = getIntent().getExtras();
        pilih  = extras.getInt("pilih");
        initToolbar();
        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Location");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initComponent() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);



        List<GroupOutlet> groupOutlets = AppUtil.getMarketModel().getMasterMarket().getAllMarket().get(pilih).getGroupOutlet();


        List<SectionOutletModel> outletSect = new ArrayList<SectionOutletModel>();

        for(int x = 0 ; x <groupOutlets.size();x++){
           outletSect.add(new SectionOutletModel(true,groupOutlets.get(x),null,null));
                  List<Outlet> outlets = groupOutlets.get(x).getOutlet();
                     for(int y = 0 ; y < outlets.size();y++){
                         outletSect.add(new SectionOutletModel(false,null,outlets.get(y),AppUtil.getMarketModel().getMasterMarket().getAllMarket().get(pilih).getImage()));
                     }

        }


        //set data and list adapter
        mAdapter = new AdapterListOutletSectioned(this, outletSect);
        recyclerView.setAdapter(mAdapter);

        // on item list clicked
        mAdapter.setOnItemClickListener(new AdapterListOutletSectioned.OnItemClickListener() {
            @Override
            public void onItemClick(View view, SectionOutletModel obj, int position) {
               Intent intent = new Intent(ListOutlet.this,TabActivity.class);
                intent.putExtra("marketid", obj.getOutlet().getMarketId());
                intent.putExtra("outletid", obj.getOutlet().getId());
                intent.putExtra("namaoutlet", obj.getOutlet().getOutletName());

                    startActivity(intent);


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search_setting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
