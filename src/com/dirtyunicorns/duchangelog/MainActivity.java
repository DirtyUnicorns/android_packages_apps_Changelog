package com.dirtyunicorns.duchangelog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Weeklies();
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Official();
            }
        });
    }

    public void Weeklies() {
        Intent w = new Intent(MainActivity.this, Weeklies.class);
        startActivity(w);
    }

    public void Official() {
        Intent o = new Intent(MainActivity.this, Official.class);
        startActivity(o);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}
