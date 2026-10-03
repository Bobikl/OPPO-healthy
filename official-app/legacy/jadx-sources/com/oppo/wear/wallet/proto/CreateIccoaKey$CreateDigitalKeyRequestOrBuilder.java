package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface CreateIccoaKey$CreateDigitalKeyRequestOrBuilder extends MessageLiteOrBuilder {
    String getAuthedModel();

    ByteString getAuthedModelBytes();

    String getBrandId();

    ByteString getBrandIdBytes();

    String getFriendlyName();

    ByteString getFriendlyNameBytes();

    String getPackageName();

    ByteString getPackageNameBytes();

    String getSessionId();

    ByteString getSessionIdBytes();

    ByteString getVehicleId();

    ByteString getVehicleOemId();

    String getWirelessCapabilities(int i);

    ByteString getWirelessCapabilitiesBytes(int i);

    int getWirelessCapabilitiesCount();

    List<String> getWirelessCapabilitiesList();
}
