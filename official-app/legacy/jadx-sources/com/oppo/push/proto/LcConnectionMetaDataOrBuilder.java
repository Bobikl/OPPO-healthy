package com.oppo.push.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface LcConnectionMetaDataOrBuilder extends MessageOrBuilder {
    String getAppPackage();

    ByteString getAppPackageBytes();

    String getDuid();

    ByteString getDuidBytes();

    String getExt();

    ByteString getExtBytes();

    String getLocationX();

    ByteString getLocationXBytes();

    String getLocationY();

    ByteString getLocationYBytes();

    String getMessageId();

    ByteString getMessageIdBytes();

    String getModel();

    ByteString getModelBytes();

    String getNetworkType();

    ByteString getNetworkTypeBytes();

    String getOuid();

    ByteString getOuidBytes();

    String getServerName();

    ByteString getServerNameBytes();

    String getSource();

    ByteString getSourceBytes();

    String getWifiSsid();

    ByteString getWifiSsidBytes();

    boolean hasAppPackage();

    boolean hasDuid();

    boolean hasExt();

    boolean hasLocationX();

    boolean hasLocationY();

    boolean hasMessageId();

    boolean hasModel();

    boolean hasNetworkType();

    boolean hasOuid();

    boolean hasServerName();

    boolean hasSource();

    boolean hasWifiSsid();
}
