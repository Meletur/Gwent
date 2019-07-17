package com.meletur.gwent_beta;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.meletur.gvintalpha_version10.R;
import java.util.ArrayList;

/**
 * Created by Мелетур on 07.06.2018.
 */

public class Row extends LinearLayout {


    //подумать над интерфейсами для перемещения, как минимум
    //для стола и ряда

    protected ArrayList <ImageView> rowListOfImages;

    public Row (Context context) {
        super(context);
        initRow();
        setOnClickListener(rowListener);
        rowListOfImages.get(2).setBackgroundResource(R.drawable.sev_6);
        getRowListOfImages().get(8).setBackgroundResource(R.drawable.sev_h4);
    }

    public Row (Context context, AttributeSet attrs) {
        super(context, attrs);
        initRow();
    }

    public void initRow(){
        rowListOfImages = new ArrayList<>();
        LinearLayout.LayoutParams imageViewParams = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, 0.1f);
        LinearLayout.LayoutParams rowParams = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, 0.143f);

        setOrientation(HORIZONTAL);
        setLayoutParams(rowParams);

        for(int i = 0; i < 10; i++){
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(imageViewParams);
            imageView.setBackgroundResource(R.drawable.nilf_1);
            rowListOfImages.add(i, imageView);
            this.addView(imageView);
        }
    }

    OnClickListener rowListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast click = Toast.makeText(getContext(), "CHECK ROW", Toast.LENGTH_SHORT);
            click.show();
        }};

    public ArrayList <ImageView> getRowListOfImages(){
        return rowListOfImages;
    }

}
