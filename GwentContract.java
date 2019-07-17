package com.meletur.gwent_beta.data;

import android.provider.BaseColumns;

/**
 * Created by Мелетур on 12.07.2018.
 */

public class GwentContract {

    private GwentContract(){

    }
    public final static class CardsTable implements BaseColumns{
        public final static String TABLE_NAME = "Cards";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_NAME = "name";
        public final static String COLUMN_FACTION = "faction";
        public final static String COLUMN_TYPE = "type";
        public final static String COLUMN_RARITY = "rarity";
        public final static String COLUMN_LOYALTY = "loyalty";
        public final static String COLUMN_POWER = "power";
        public final static String COLUMN_TAG_1 = "tag_1";
        public final static String COLUMN_TAG_2 = "tag_2";
        public final static String COLUMN_TAG_3 = "tag_3";
    }


}
