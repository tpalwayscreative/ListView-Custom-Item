package listview.co.tpcreative.samplelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lv ;
    private ArrayList<Product> list ;
    private CustomAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        list = new ArrayList<>();
        list.add(new Product("1","A"));
        list.add(new Product("2","B"));
        list.add(new Product("3","C"));
        list.add(new Product("4","D"));
        list.add(new Product("5","E"));

        adapter = new CustomAdapter(this,R.layout.custom_item,list);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(),list.get(i).getID(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
