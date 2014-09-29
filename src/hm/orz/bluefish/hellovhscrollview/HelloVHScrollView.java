package hm.orz.bluefish.hellovhscrollview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class HelloVHScrollView extends Activity {
    private ListView list;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        String[] ldata = {"AAA","BBB","CCC","DDD","EEE","FFF","GGG","HHH","III","JJJ","KKK","LLL","MMM","NNN",
        					"OOO","PPP","QQQ","RRR","SSS","TTT","UUU","VVV","WWW","XXX","YYY","ZZZ"};

        list = (ListView)this.findViewById(R.id.list_id);
        MyAdapter adapter = new MyAdapter(this);
        list.setAdapter(adapter);
        list.setSelection(1);

//        list.setOnItemClickListener(new OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?>adapter, View view, int pos, long id) {
//                Toast.makeText(HelloGridView.this, list.getAdapter().getItem(pos) +" が選択されました", Toast.LENGTH_LONG).show();
//            }
//        });
    }


}
