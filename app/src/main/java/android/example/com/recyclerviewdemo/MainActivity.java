package android.example.com.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    String[] country = {
            "India",
            "Japan",
            "Kazakhstan",
            "Greece",
            "Colombia",
            "Canada",
            "Austria",
            "France",
            "Jamaica",
            "Kenya",
            "Libya",
            "Kuwait",
            "Jordan",
            "Switzerland",
            "Pilippines",
            "Pakistan"
    };

    String[] capital = {
            "New Delhi",
            "Tokyo",
            "Astana",
            "Athens",
            "Bogota",
            "Ottawa",
            "Vienna",
            "Paris",
            "Kingston",
            "Nairobi",
            "Tripoli",
            "Kuwait City",
            "Amman",
            "Bern",
            "Manila",
            "Islamabad",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new RecyclerAdapter(country,capital);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}
