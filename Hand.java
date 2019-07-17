package com.meletur.gwent_beta;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.meletur.gvintalpha_version10.R;

import java.util.ArrayList;

/**
 * Created by Мелетур on 07.06.2018.
 */

public class Hand extends LinearLayout {

    protected ArrayList<ImageView> handListOfImages;

    public Hand (Context context) {
        super(context);
        initHand();
    }

    public Hand (Context context, AttributeSet attrs) {
        super(context, attrs);
        initHand();
    }

    public void initHand(){
        handListOfImages = new ArrayList<>();
        LinearLayout.LayoutParams imageViewParams = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, 0.1f);
        LinearLayout.LayoutParams handParams = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, 0.143f);

        setOrientation(HORIZONTAL);
        setLayoutParams(handParams);

        for(int i = 0; i < 10; i++){
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(imageViewParams);
            imageView.setBackgroundResource(R.drawable.nilf_17);
            handListOfImages.add(i, imageView);
            this.addView(imageView);
        }
    }

    public ArrayList <ImageView> getHandListOfImages(){
        return handListOfImages;
    }


}
