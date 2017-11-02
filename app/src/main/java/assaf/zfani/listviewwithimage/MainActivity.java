package assaf.zfani.listviewwithimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,R.layout.linecontent,R.id.textView,new String[]{"rexi","lucky","like"});
        lv.setAdapter(myAdapter);
    }
}
