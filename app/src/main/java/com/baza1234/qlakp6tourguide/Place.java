package com.baza1234.qlakp6tourguide;


/**
 * Represents a particular place in the City.
 * Gets information about the Place Name, Adress, Description, Location, its Rating and Picture of it.
 */
public class Place {

    private String mPlaceName;
    private String mAddress;
    private String mInformation;
    private String mLocation;

    private int mRatingRes;
    private int mImageRes;

    public Place(String placeName, String address, String information, String location, int ratingRes, int imageRes){

        mPlaceName = placeName;
        mAddress = address;
        mInformation = information;
        mLocation = location;
        mRatingRes = ratingRes;
        mImageRes = imageRes;
    }

    public String getPlaceName() {
        return mPlaceName;
    }
    public String getAdress(){
        return mAddress;
    }
    public String getInformation() {
        return mInformation;
    }
    public String getLocation(){
        return mLocation;
    }
    public int getRatingRes(){
        return mRatingRes;
    }
    public int getImageRes(){
        return mImageRes;
    }







}