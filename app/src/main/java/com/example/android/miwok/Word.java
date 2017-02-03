package com.example.android.miwok;


public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mMiwokImage = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int miwokImage){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMiwokImage = miwokImage;
    }

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmMiwokImage(){
        return mMiwokImage;
    }

    public boolean hasImage(){
        return mMiwokImage != NO_IMAGE_PROVIDED;
    }

}
