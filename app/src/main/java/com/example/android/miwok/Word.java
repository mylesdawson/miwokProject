package com.example.android.miwok;


public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private String mMiwokImage;

    public Word(String defaultTranslation, String miwokTranslation, String miwokImage){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMiwokImage = miwokImage;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getmMiwokImage(){
        return mMiwokImage;
    }

}
