package com.example.tt.list3;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


//public class MainActivity extends ActionBarActivity {
public class MainActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String p_Arr[]=getResources().getStringArray(R.array.array_item_data);
        final String p_Arr_detail[]=getResources().getStringArray(R.array.array_item_detail);

        Adapter myAdapter= new ArrayAdapter<String>(this,R.layout.activity_main,R.id.Animal,p_Arr);
        this.setListAdapter((ArrayAdapter)myAdapter);
        //
        ListView listView= getListView();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //todo
                Intent intent = new Intent(MainActivity.this,MoreDetail.class);
                intent.putExtra("tag",p_Arr[position]);
                intent.putExtra(p_Arr[position],p_Arr_detail[position]);
                startActivity(intent);
                /* end */
            }
        });


        //
    }

}

