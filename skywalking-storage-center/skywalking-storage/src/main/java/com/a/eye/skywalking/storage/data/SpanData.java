package com.a.eye.skywalking.storage.data;

/**
 * Created by xin on 2016/11/4.
 */
public interface SpanData {
    long getTimestamp();

    byte[] convertToByte();
}
