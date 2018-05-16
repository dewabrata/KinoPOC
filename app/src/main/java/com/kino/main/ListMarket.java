package com.kino.main;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Config;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.kino.main.adapter.AdapterListMarket;
import com.kino.main.data.DataGenerator;

import com.kino.main.modelservice.AllMarket;
import com.kino.main.modelservice.Market;
import com.kino.main.modelservice.MasterMarket;
import com.kino.main.service.APIClient;
import com.kino.main.service.APIInterfacesRest;
import com.kino.main.utilities.AppUtil;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListMarket extends AppCompatActivity {

    private View parent_view;

    private RecyclerView recyclerView;
    private AdapterListMarket mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_market);
        parent_view = findViewById(android.R.id.content);

        initToolbar();

        getMarketList();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Market");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initComponent() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        List<AllMarket> items = AppUtil.getMarketModel().getMasterMarket().getAllMarket();

        //set data and list adapter
        mAdapter = new AdapterListMarket(this, items);
        recyclerView.setAdapter(mAdapter);

        // on item list clicked
        mAdapter.setOnItemClickListener(new AdapterListMarket.OnItemClickListener() {
            @Override
            public void onItemClick(View view, AllMarket obj, int position) {
              //  Snackbar.make(parent_view, "Item " + obj.getMarketName() + " clicked", Snackbar.LENGTH_SHORT).show();
                Intent intent = new Intent(ListMarket.this,ListOutlet.class);
                intent.putExtra("pilih",position);
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


    List<MasterMarket> marketList;

    private void getMarketList() {
        marketList = new ArrayList<MasterMarket>();


        APIInterfacesRest apiInterface = APIClient.getClient().create(APIInterfacesRest.class);
        Call<Market> market = apiInterface.getMarket();


        market.enqueue(new Callback<Market>() {
            @Override
            public void onResponse(Call<Market> call, Response<Market> response) {
                Market market = response.body();


                if (response.body() != null) {
                    //  Toast.makeText(LoginActivity.this,userList.getToken().toString(),Toast.LENGTH_LONG).show();
                    AppUtil.setMarketModel(market);
                    initComponent();

                } else {
                    try {
                        JSONObject jObjError = new JSONObject(response.errorBody().string());
                        Toast.makeText(ListMarket.this, jObjError.getString("message"), Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(ListMarket.this, e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }


            }

            @Override
            public void onFailure(Call<Market> call, Throwable t) {

                Toast.makeText(ListMarket.this, "Terjadi gangguan koneksi", Toast.LENGTH_LONG).show();
                call.cancel();
            }

        });
    }
}