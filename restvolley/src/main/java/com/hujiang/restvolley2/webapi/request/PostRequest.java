/*
 * PostRequest      2015-11-25
 * Copyright (c) 2015 hujiang Co.Ltd. All right reserved(http://www.hujiang.com).
 * 
 */

package com.hujiang.restvolley2.webapi.request;

import android.content.Context;

import com.android.volley.Request;

/**
 * Post Method request.
 *
 * @author simon
 * @version 1.0.0
 * @since 2015-11-25
 */
public class PostRequest extends RVRequestWithBody<PostRequest> {
    /**
     * constructor.
     * @param context {@link Context}
     */
    public PostRequest(Context context) {
        super(context, Request.Method.POST);
    }
}