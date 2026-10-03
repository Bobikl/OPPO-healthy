package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface ConfirmIccoaKeySharing$ConfirmIccoaKeySharingRequestOrBuilder extends MessageLiteOrBuilder {
    String getAuthedModel();

    ByteString getAuthedModelBytes();

    String getBrandId();

    ByteString getBrandIdBytes();

    String getFriendSessionId();

    ByteString getFriendSessionIdBytes();

    String getFriendlyName();

    ByteString getFriendlyNameBytes();

    String getPackageName();

    ByteString getPackageNameBytes();

    String getShareId();

    ByteString getShareIdBytes();

    ByteString getVehicleOemId();

    String getWirelessCapabilities(int i);

    ByteString getWirelessCapabilitiesBytes(int i);

    int getWirelessCapabilitiesCount();

    List<String> getWirelessCapabilitiesList();
}
