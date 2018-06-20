package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;



    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public Long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

    @Override
    public String toString() {

        return "\n Earthquake{" +
                "mMagnitude='" + getmMagnitude() + '\''+
                ",   mLocation='" + getmLocation() + '\'' +
                ",   mTimeInMilliseconds=" + getmTimeInMilliseconds() + '\'' +
                ",   website URL=" + getUrl() +
                '}' +"\n";
    }
}

