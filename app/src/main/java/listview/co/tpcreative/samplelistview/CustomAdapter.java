package listview.co.tpcreative.samplelistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by phong on 8/21/16.
 */
public class CustomAdapter extends ArrayAdapter<Product> {

    List<Product> listProduct;
    Activity activity;
    private LayoutInflater inflater = null;
    public CustomAdapter(Context context, int resource,
                            List<Product> objects) {
        super(context, resource, objects);

        activity = (Activity) context;
        listProduct = objects;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    class ViewHolder {
        TextView title;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        if (convertView == null) {

            convertView = inflater.inflate(R.layout.custom_item,
                    parent, false);
            holder = new ViewHolder();
            holder.title = (TextView) convertView
                    .findViewById(R.id.txtShow);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Product product = listProduct.get(position);

        holder.title.setText(product.getName());

        return convertView;
    }


}
