package imwi.milostory.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import imwi.milostory.model.Item;

/**
 * Created by linh on 11/18/2017.
 */

public class ItemAdapter extends BaseAdapter {
    private List<Item> listItem;
    private Activity activity;

    public ItemAdapter(List<Item> listItem, Activity activity){
        this.listItem = listItem;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return listItem.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_contact, parent, false);
            ViewHolder holder = new ViewHolder();
            holder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            holder.ivAvatar = (ImageView) convertView.findViewById(R.id.iv_avatar);
            convertView.setTag(holder);
        }
        ViewHolder holder = (ViewHolder) convertView.getTag();
        Item model = listItem.get(position);
        holder.tvName.setText(model.getName());
        holder.ivAvatar.setImageResource(model.getImage());

        return convertView;
    }
    static class ViewHolder {
        TextView tvName;
        ImageView ivAvatar;
    }
}
