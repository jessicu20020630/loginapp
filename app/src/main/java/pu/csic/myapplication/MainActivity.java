package pu.csic.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList list = new ArrayList();
        list .add("test1");
        list .add("test2");
        list .add("test3");

        ListView lv = findViewById(R.id.listv);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);

        lv.setAdapter(adapter);

    }
}