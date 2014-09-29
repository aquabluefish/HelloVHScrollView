package hm.orz.bluefish.hellovhscrollview;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    private static final String LIST_TEXT_BASE = "ABCDEFGHIJKLMNOPQRSUVWXYZ_abcdefghijklmnopqrstuvwxyz_%02d";
    private static final int ITEM_NUM = 20;

    public ArrayList<String> mListData;
    public Context mContext;

    public MyAdapter(Context context) {
        mContext = context;
        mListData = new ArrayList<String>();

        for(int i = 0; i < ITEM_NUM; i++) {
            String text = String.format(LIST_TEXT_BASE, i);
            mListData.add(text);
        }
    }

    @Override
    public int getCount() {
        return mListData.size();
    }

    @Override
    public Object getItem(int position) {
        return mListData.get(position);
    }

    @Override
    public long getItemId(int arg0) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup rootView) {

        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.list, null);
        }

        TextView tv = (TextView)convertView.findViewById(R.id.list_textView1);
        tv.setText(mListData.get(position));

        return convertView;
    }
}
