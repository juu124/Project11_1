package com.example.project11_1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<ListViewItem> arrayList1 = new ArrayList<ListViewItem>();

    @Override//지금 현재 어댑터에 사용되는 데이타의 갯수 ArrayList1에서 가져온다.
    public int getCount() {
        return arrayList1.size();
    }

    @Override//get(i)의 i는 포지션이라고 생각해라
    public Object getItem(int i) {
        return arrayList1.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override //커스텀한 각각의 리스트를 리턴을 시켜준다.(중요) 뷰를 가져다 붙여야 한다.
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        //뷰가 여기서 convertView라고 한다.
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //첫번째 인수는어떤 xml 파일인지 지정한다. 두번째 인수는 어디서 붙일 것이냐
            convertView = inflater.inflate(R.layout.listview_item, viewGroup, false);

            ImageView iconImageView = convertView.findViewById(R.id.imageView1);
            TextView titleTextView = convertView.findViewById(R.id.textView1);
            TextView descTextView = convertView.findViewById(R.id.textView2);

            //ListViewItem에서 포지션에 위치한 데이터 참조
            ListViewItem listViewItem = arrayList1.get(i);

            //각 item내에서 각 위젯에 데이터 반영
            iconImageView.setImageDrawable(listViewItem.getIconDrawable());
            titleTextView.setText(listViewItem.getTitleStr());
            descTextView.setText(listViewItem.getDescStr());

        }
        return convertView;

    }
    public void addItem(Drawable icon, String title, String desc){
        ListViewItem item = new ListViewItem();
        item.setIconDrawable(icon);
        item.setTitleStr(title);
        item.setDescStr(desc);

        arrayList1.add(item);

    }
}
