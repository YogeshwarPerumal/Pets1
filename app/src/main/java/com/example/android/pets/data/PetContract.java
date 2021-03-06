package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {

    private PetContract() {}

    public static final class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "Pets";

        public static final String COLUMN_ID = "_ID";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_BREED = "breed";
        public static final String COLUMN_GENDER = "gender";
        public static final String COLUMN_WEIGHT = "weight";

        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_MALE = 1;
        public static final int UNKNOWN_GENDER = 0;
    }



}
