package com.heytap.wearable.devicemanager.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface WatchfacePayInfoProto$WfPayRequestOrBuilder extends MessageLiteOrBuilder {
    ByteString getBody();

    String getDeviceAppVersion();

    ByteString getDeviceAppVersionBytes();

    String getDeviceType();

    ByteString getDeviceTypeBytes();

    String getKey();

    ByteString getKeyBytes();

    String getScreen();

    ByteString getScreenBytes();

    String getShape();

    ByteString getShapeBytes();
}
