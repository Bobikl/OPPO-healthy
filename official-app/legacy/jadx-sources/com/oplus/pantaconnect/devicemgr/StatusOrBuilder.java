package com.oplus.pantaconnect.devicemgr;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface StatusOrBuilder extends MessageOrBuilder {
    String getBtStatus();

    ByteString getBtStatusBytes();

    String getConnectionToMajor();

    ByteString getConnectionToMajorBytes();

    String getDarkMode();

    ByteString getDarkModeBytes();

    String getEarPhone();

    ByteString getEarPhoneBytes();

    String getLatitude();

    ByteString getLatitudeBytes();

    String getLocationCoordinateType();

    ByteString getLocationCoordinateTypeBytes();

    String getLocationStatus();

    ByteString getLocationStatusBytes();

    String getLongitude();

    ByteString getLongitudeBytes();

    String getMemAvail();

    ByteString getMemAvailBytes();

    String getMemTotal();

    ByteString getMemTotalBytes();

    String getNetworkType();

    ByteString getNetworkTypeBytes();

    String getStorageAvail();

    ByteString getStorageAvailBytes();
}
