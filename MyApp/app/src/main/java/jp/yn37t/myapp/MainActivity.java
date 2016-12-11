package jp.yn37t.myapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup rootView = (ViewGroup) findViewById(R.id.activity_main);
        addTextRow(rootView, "aaa", "bbb");
        addTextRow(rootView, "ccc", "ddd");

        Intent intent = new Intent(this, DialogTestActivity.class);
        startActivity(intent);
    }

    private void addTextRow(ViewGroup rootView, String text0, String text1) {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.layout_row, null);

        TextView textView_0 = (TextView)rowView.findViewById(R.id.layout_row_section_0);
        textView_0.setText(text0);
        TextView textView_1 = (TextView)rowView.findViewById(R.id.layout_row_section_1);
        textView_1.setText(text1);

        rootView.addView(rowView);
    }
}
