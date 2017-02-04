package com.example.android.miwok;


public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mMiwokSound = NO_SOUND_PROVIDED;
    private int mMiwokImage = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1, NO_SOUND_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int miwokImage, int sound){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMiwokImage = miwokImage;
        mMiwokSound = sound;
    }

    public Word(String defaultTranslation, String miwokTranslation, int miwokSound){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMiwokSound = miwokSound;
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

    public int getMiwokSound(){
        return mMiwokSound;
    }

    public boolean hasSound(){
        return mMiwokSound != NO_SOUND_PROVIDED;
    }

}
