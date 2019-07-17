package com.meletur.gwent_beta;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.meletur.gvintalpha_version10.R;
import java.util.ArrayList;

/**
 * Created by Мелетур on 07.06.2018.
 */

public class Table extends LinearLayout{

    protected ArrayList <Row> tableListOfRows;
    protected Hand hand;

    public Table(Context context, AttributeSet attrs) {
        super(context, attrs);
        initTable();
        setOnClickListener(tableListener);
        tableListOfRows.get(1).getRowListOfImages().get(4).setBackgroundResource(R.drawable.mons_5);
        tableListOfRows.get(4).getRowListOfImages().get(0).setBackgroundResource(R.drawable.mons_15);
    }

    public void initTable(){

        tableListOfRows = new ArrayList<>();

        setOrientation(VERTICAL);
        for(int i = 0; i < 6; i++){
            Row row = new Row(getContext());
            tableListOfRows.add(i, row);
            this.addView(row);
        }
        hand = new Hand(getContext());
        this.addView(hand);
    }

    OnClickListener tableListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast click = Toast.makeText(getContext(), "CHECK TABLE", Toast.LENGTH_SHORT);
            click.show();
        }};

    public void onClick(){

    }

}
