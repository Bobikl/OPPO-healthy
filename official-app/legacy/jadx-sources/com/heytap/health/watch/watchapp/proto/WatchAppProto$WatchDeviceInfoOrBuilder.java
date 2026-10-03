package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface WatchAppProto$WatchDeviceInfoOrBuilder extends MessageLiteOrBuilder {
    String getChannel();

    ByteString getChannelBytes();

    String getColorOsVersion();

    ByteString getColorOsVersionBytes();

    String getFirmwareId();

    ByteString getFirmwareIdBytes();

    boolean getInstantSwClose();

    int getInstantVersion();

    String getLocale();

    ByteString getLocaleBytes();

    WatchAppProto$WatchScreenType getScreenType();

    int getScreenTypeValue();

    int getStoreVersion();

    String getUa();

    ByteString getUaBytes();

    String getUniqueId();

    ByteString getUniqueIdBytes();
}
