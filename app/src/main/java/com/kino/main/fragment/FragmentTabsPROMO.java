package com.kino.main.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.kino.main.FormSurvey;
import com.kino.main.ListOutlet;
import com.kino.main.R;
import com.kino.main.adapter.AdapterListProduct;
import com.kino.main.modelservice.Product;
import com.kino.main.modelservice.Produk;
import com.kino.main.service.APIClient;
import com.kino.main.service.APIInterfacesRest;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FragmentTabsPROMO extends Fragment {
    private View parent_view;

    private RecyclerView recyclerView;
    private AdapterListProduct mAdapter;

    public FragmentTabsPROMO() {
    }
    private static String outletid,moduleid;
    public static FragmentTabsPROMO newInstance(String moduleid, String outletid) {

        FragmentTabsPROMO.moduleid = moduleid;
        FragmentTabsPROMO.outletid =outletid;
        FragmentTabsPROMO fragment = new FragmentTabsPROMO();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_list_skuaktif, container, false);
        recyclerView = (RecyclerView)root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        getMarketList();

        return root;
    }


    private void initComponent() {


        List<Product> items = marketList;

        //set data and list adapter
        mAdapter = new AdapterListProduct(getContext(), items);
        recyclerView.setAdapter(mAdapter);

        // on item list clicked
        mAdapter.setOnItemClickListener(new AdapterListProduct.OnItemClickListener() {
            @Override
            public void onItemClick(View view, Product obj, int position) {
                //  Snackbar.make(parent_view, "Item " + obj.getMarketName() + " clicked", Snackbar.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(),FormSurvey.class);
                intent.putExtra("product", (Parcelable) obj);
                startActivity(intent);
            }
        });

    }




    List<Product> marketList;
    private void getMarketList() {
        marketList = new ArrayList<Product>();


        APIInterfacesRest apiInterface = APIClient.getClient().create(APIInterfacesRest.class);
        Call<Produk> produk = apiInterface.getProduk(outletid,moduleid,"2");


        produk.enqueue(new Callback<Produk>() {
            @Override
            public void onResponse(Call<Produk> call, Response<Produk> response) {
                Produk prodak = response.body();


                if (response.body() != null) {
                    //  Toast.makeText(LoginActivity.this,userList.getToken().toString(),Toast.LENGTH_LONG).show();
                    marketList =response.body().getProdukall().getProduct();
                    initComponent();


                } else {
                    try {
                        JSONObject jObjError = new JSONObject(response.errorBody().string());
                        Toast.makeText(getContext(), jObjError.getString("message"), Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }


            }

            @Override
            public void onFailure(Call<Produk> call, Throwable t) {

                Toast.makeText(getContext(), "Terjadi gangguan koneksi", Toast.LENGTH_LONG).show();
                call.cancel();
            }

        });
    }

}