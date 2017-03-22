package com.example.administrator.materialdesign;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private GirlsAdapter adapter;

    private List<Girls> girlsList=new ArrayList<>();

    private Girls girls1=new Girls("zudi",R.drawable.a1);
    private Girls girls2=new Girls("lusi",R.drawable.a2);
    private Girls girls3=new Girls("kiki",R.drawable.a3);
    private Girls girls4=new Girls("juju",R.drawable.a4);
    private Girls girls5=new Girls("cindy",R.drawable.a5);
    private Girls girls6=new Girls("kasi",R.drawable.a6);
    private Girls girls7=new Girls("kasi",R.drawable.a7);
    private Girls girls8=new Girls("kasi",R.drawable.a8);
    private Girls girls9=new Girls("kasi",R.drawable.a9);
    private Girls girls10=new Girls("kasi",R.drawable.a10); private Girls girls14=new Girls("kasi",R.drawable.a14);
    private Girls girls11=new Girls("kasi",R.drawable.a11);
    private Girls girls12=new Girls("kasi",R.drawable.a12);
    private Girls girls13=new Girls("kasi",R.drawable.a13);




    private FloatingActionButton floatingActionButton;
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        girlsList.add(girls1);
        girlsList.add(girls2);
        girlsList.add(girls3);
        girlsList.add(girls4);girlsList.add(girls5);girlsList.add(girls6);
        girlsList.add(girls7);girlsList.add(girls10);girlsList.add(girls11);
        girlsList.add(girls8);girlsList.add(girls12);girlsList.add(girls13);
        girlsList.add(girls9);girlsList.add(girls14);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerview);
        GridLayoutManager manager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(manager);
        adapter=new GirlsAdapter(girlsList);
        recyclerView.setAdapter(adapter);

        setSupportActionBar(toolbar);
        drawerLayout= (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView= (NavigationView) findViewById(R.id.nav_view);

        floatingActionButton= (FloatingActionButton) findViewById(R.id.floatView);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(MainActivity.this,"are you miss me",Toast.LENGTH_LONG).show();ou
                Snackbar.make(v,"are you real miss me",Snackbar.LENGTH_LONG).setAction("Undo",
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this,"are you miss me",Toast.LENGTH_LONG).show();
                            }
                        }).show();
            }
        });
        ActionBar actionbar=getSupportActionBar();
        if(actionbar!=null){
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setHomeAsUpIndicator(R.mipmap.w2);
        }
        navigationView.setCheckedItem(R.id.nav_call);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawers();
                return true;
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.BackUp:
                Toast.makeText(this,"you clicked Backup",Toast.LENGTH_LONG).show();
                break;
            case R.id.delete:
                Toast.makeText(MainActivity.this,"you clicked delete",Toast.LENGTH_LONG).show();
                break;
            case R.id.setting:
                Toast.makeText(this,"you clicked setting",Toast.LENGTH_LONG).show();
                break;
            default:
        }
        return true;
    }
}
