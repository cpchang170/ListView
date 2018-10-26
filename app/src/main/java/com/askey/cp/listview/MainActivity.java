package com.askey.cp.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private String[] linestring;
    private String[] notify;
    private Spinner notify_spinner;

    //    String[] linestring =getResources().getStringArray(R.array.liststring);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.spinner_view);
        //list = findViewById(R.id.list);
        //linestring = getResources().getStringArray(R.array.liststring);
//      ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, linestring);
//        list.setAdapter(adapter);
        notify_spinner = findViewById(R.id.notify_spinner);
        notify = getResources().getStringArray(R.array.notify);
        //final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, notify);
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.notify,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        notify_spinner.setAdapter(adapter);
        notify_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,adapter.getItem(position).toString(),LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
