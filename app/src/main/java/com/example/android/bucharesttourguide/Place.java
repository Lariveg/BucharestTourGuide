package com.example.android.bucharesttourguide;

/**
 * Created by Lariveg on 14/05/2017.
 */

public class Place {

    private String mName;
    private String mAddress;
    private int mImageId;

    public Place(String name, String address, int imageId){
        mName = name;
        mAddress = address;
        mImageId = imageId;
    }

    public String getPlaceName() {
        return mName;
    }
    public String getPlaceAddress() {
        return mAddress;
    }
    public int getImageId() {
        return mImageId;
    }

}
