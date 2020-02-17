package com.demo.restapi.API;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class SingleTonRequest {

    private static SingleTonRequest mInstance;
    private Context mContext;
    private RequestQueue mRequestQueue;

    private SingleTonRequest(Context context) {
        mContext = context;
        mRequestQueue = getRequestQueue();
    }

    public static synchronized SingleTonRequest getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SingleTonRequest(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(mContext);
        }
        return mRequestQueue;
    }
}
