package com.example.android.quakereport;

import java.lang.ref.SoftReference;

/**
 * An {@link Earthquake} object contains information related to a single earthquake.
 */
public class Earthquake {
    private double mMag;
    private String mPlace;

    /** Time of the earthquake */
    private long mTime;

    private String mUrl;
    /**
     * 构造一个新的 {@link Earthquake} 对象。
     *
     * @param mag 表示地震的震级（大小）
     * @param place 表示地震的城市位置
     * @param time 表示地震发生时以毫秒（根据 Epoch）计的时间
     */
    public Earthquake(double mag, String place, long time, String url) {
        mMag = mag;
        mPlace = place;
        mTime = time;
        mUrl = url;
    }

    public double getmMag() {
        return mMag;
    }

    public String getmPlace() {
        return mPlace;
    }

    public long getmTime() {
        return mTime;
    }

    public String getUrl() {
        return mUrl;
    }
}
