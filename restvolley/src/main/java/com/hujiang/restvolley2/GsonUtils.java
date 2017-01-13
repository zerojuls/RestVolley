/*
 * GsonUtils      2015-12-10
 * Copyright (c) 2015 hujiang Co.Ltd. All right reserved(http://www.hujiang.com).
 * 
 */

package com.hujiang.restvolley2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.lang.reflect.Type;

/**
 * GsonUtils.
 *
 * @author simon
 * @version 1.0.0
 * @since 2015-12-10
 */
public class GsonUtils {

    private static Gson sGson;

    /**
     * get Gson.
     * @return Gson.
     */
    public static Gson getGson() {
        if (sGson == null) {
            sGson = newGson();
        }

        return sGson;
    }

    /**
     * new Gson.
     * @return Gson.
     */
    public static Gson newGson() {
        return new GsonBuilder().create();
    }

    /**
     * convert json String to Object.
     * @param jsonString json string
     * @param clazz Object class
     * @param <T> Object Class Type
     * @return Object
     */
    public static <T> T fromJsonString(String jsonString, Class<T> clazz) throws JsonSyntaxException {
        return getGson().fromJson(jsonString, clazz);
    }

    /**
     * convert json string to the Object of the specified Type.
     * @param json json string
     * @param typeOfT Type
     * @param <T> Type
     * @return Object of T
     */
    public static <T> T fromJsonString(String json, Type typeOfT) throws JsonSyntaxException {
        return getGson().fromJson(json, typeOfT);
    }

    /**
     * vonvert Object to json string.
     * @param object Object
     * @return json string.
     */
    public static String toJsonString(Object object) throws Exception  {
        return getGson().toJson(object);
    }
}