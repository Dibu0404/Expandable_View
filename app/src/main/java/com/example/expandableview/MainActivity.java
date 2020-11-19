package com.example.expandableview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView ;
List<product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    recyclerView = findViewById(R.id.recyclerview);
    initData();
    setRecyclerView();
    }

    private void setRecyclerView() {
        ProductAdapter productAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(productAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        productList = new ArrayList<>();
        productList.add(new product("Fair Glow","INR 120","80ml","Fair & Lovely offers its consumer a high definition glow - which comprises skin clarity, more radiance and skin that is free from imperfections. Infused with Multivitamins - Vitamin B3, C, E and B6 and Niacinamide, it brightens your skin, reduces inflammation and hyperpigmentation and smoothens overall skin texture."));
        productList.add(new product("Olay","INR 350","300ml","Olay offers its consumer a high definition glow - which comprises skin clarity, more radiance and skin that is free from imperfections. Infused with Multivitamins - Vitamin B3, C, E and B6 and Niacinamide, it brightens your skin, reduces inflammation and hyperpigmentation and smoothens overall skin texture."));
        productList.add(new product("Lakme","INR 400","150ml","Lakme offers its consumer a high definition glow - which comprises skin clarity, more radiance and skin that is free from imperfections. Infused with Multivitamins - Vitamin B3, C, E and B6 and Niacinamide, it brightens your skin, reduces inflammation and hyperpigmentation and smoothens overall skin texture."));
        productList.add(new product("Ponds","INR 50","180ml","Ponds offers its consumer a high definition glow - which comprises skin clarity, more radiance and skin that is free from imperfections. Infused with Multivitamins - Vitamin B3, C, E and B6 and Niacinamide, it brightens your skin, reduces inflammation and hyperpigmentation and smoothens overall skin texture."));
        productList.add(new product("Mamaearth","INR 700","500ml","Mamaearth offers its consumer a high definition glow - which comprises skin clarity, more radiance and skin that is free from imperfections. Infused with Multivitamins - Vitamin B3, C, E and B6 and Niacinamide, it brightens your skin, reduces inflammation and hyperpigmentation and smoothens overall skin texture."));
        productList.add(new product("Nivea","INR 100","120ml","Nivea offers its consumer a high definition glow - which comprises skin clarity, more radiance and skin that is free from imperfections. Infused with Multivitamins - Vitamin B3, C, E and B6 and Niacinamide, it brightens your skin, reduces inflammation and hyperpigmentation and smoothens overall skin texture."));
        productList.add(new product("Biotique","INR 250","80ml","Biotique offers its consumer a high definition glow - which comprises skin clarity, more radiance and skin that is free from imperfections. Infused with Multivitamins - Vitamin B3, C, E and B6 and Niacinamide, it brightens your skin, reduces inflammation and hyperpigmentation and smoothens overall skin texture."));
        productList.add(new product("Boroplus","INR 80","100ml","Boroplus offers its consumer a high definition glow - which comprises skin clarity, more radiance and skin that is free from imperfections. Infused with Multivitamins - Vitamin B3, C, E and B6 and Niacinamide, it brightens your skin, reduces inflammation and hyperpigmentation and smoothens overall skin texture."));
        productList.add(new product("Himalaya","INR 125","80ml","Himalaya offers its consumer a high definition glow - which comprises skin clarity, more radiance and skin that is free from imperfections. Infused with Multivitamins - Vitamin B3, C, E and B6 and Niacinamide, it brightens your skin, reduces inflammation and hyperpigmentation and smoothens overall skin texture."));
        productList.add(new product("Loreal","INR 400","50ml","Loreal offers its consumer a high definition glow - which comprises skin clarity, more radiance and skin that is free from imperfections. Infused with Multivitamins - Vitamin B3, C, E and B6 and Niacinamide, it brightens your skin, reduces inflammation and hyperpigmentation and smoothens overall skin texture."));
        productList.add(new product("Joy","INR 180","600ml","Joy offers its consumer a high definition glow - which comprises skin clarity, more radiance and skin that is free from imperfections. Infused with Multivitamins - Vitamin B3, C, E and B6 and Niacinamide, it brightens your skin, reduces inflammation and hyperpigmentation and smoothens overall skin texture."));
    }
}