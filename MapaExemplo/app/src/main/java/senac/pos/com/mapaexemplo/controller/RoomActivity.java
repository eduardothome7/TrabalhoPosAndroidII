package senac.pos.com.mapaexemplo.controller;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import senac.pos.com.mapaexemplo.R;
import senac.pos.com.mapaexemplo.adapter.RoomAdapter;
import senac.pos.com.mapaexemplo.custom.ClickRecyclerView;
import senac.pos.com.mapaexemplo.model.Room;

public class RoomActivity extends AppCompatActivity implements ClickRecyclerView {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    RoomAdapter adapter;
    private List<Room> rooms = new ArrayList<>();
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btnAdd);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Room room1 = new Room("Espaço Criativo", "", "Rua Barbedo 364 Menino Deus", "90110250", "-30.0572058", "-51.2249756", 472393, 100.0, 1);
        Room room2 = new Room("Local de Trabalho", "", "Rua Barbedo 364 Menino Deus", "90110250", "-30.0572058", "-51.2249756", 472393, 100.0, 1);
        Room room3 = new Room("Estúdio Design", "", "Rua Barbedo 364 Menino Deus", "90110250", "-30.0572058", "-51.2249756", 472393, 100.0, 1);
        Room room4 = new Room("Agência RAGE", "", "Rua Barbedo 364 Menino Deus", "90110250", "-30.0572058", "-51.2249756", 472393, 100.0, 1);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.lstRoom);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);

        mRecyclerView = (RecyclerView) findViewById(R.id.lstRoom);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        adapter = new RoomAdapter(this, this.rooms, this);
        mRecyclerView.setAdapter(adapter);

    }

    @Override
    public void onCustomClick(Object object) {
        Log.e("OK", "Ok ok");
    }
}
