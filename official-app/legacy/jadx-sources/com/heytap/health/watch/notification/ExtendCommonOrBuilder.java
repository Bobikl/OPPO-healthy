package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface ExtendCommonOrBuilder extends MessageLiteOrBuilder {
    int getDeviceFlag();

    String getDeviceFrom();

    ByteString getDeviceFromBytes();

    String getDeviceMac();

    ByteString getDeviceMacBytes();

    boolean getHasRead();

    boolean getHasRemoteInput();

    boolean getMultipleLink();

    int getPlatform();

    String getStrFrom();

    ByteString getStrFromBytes();
}
