package com.itic91.luispech.weatherpop_up;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {

    ListView lst;
    ArrayList<List>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst=(ListView) findViewById(R.id.lst);
        list=new ArrayList<List>();
        list.add(new List("Lunes", "Soleado - 32° 23°", R.drawable.sunny));
        list.add(new List("Martes", "Tormenta electrica - 35° 33°", R.drawable.thunderstorm));
        list.add(new List("Miercoles", "Agua nieve - 20° 17°", R.drawable.rainysnow));
        list.add(new List("Jueves", "Probabilidad de tormenta - 33° 31°", R.drawable.chancestorm));
        list.add(new List("Viernes", "Lluvioso - 31° 28°", R.drawable.rainy));
        list.add(new List("Sabado", "Parcialmente nublado - 30° 27°", R.drawable.partlycloudy));
        list.add(new List("Domingo", "Nublado - 33 Grad. 29 Grad.", R.drawable.cloudy));

        Adapter adapter=new Adapter(list,MainActivity.this.getApplicationContext());
        lst.setAdapter(adapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), list.get(position).toString(),Toast.LENGTH_SHORT).show();

            }


        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
