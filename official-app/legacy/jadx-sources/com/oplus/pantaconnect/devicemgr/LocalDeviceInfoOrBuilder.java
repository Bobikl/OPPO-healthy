package com.oplus.pantaconnect.devicemgr;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface LocalDeviceInfoOrBuilder extends MessageOrBuilder {
    String getDeviceType();

    ByteString getDeviceTypeBytes();

    MetaData getMetaData();

    MetaDataOrBuilder getMetaDataOrBuilder();

    Spec getSpec();

    SpecOrBuilder getSpecOrBuilder();

    Status getStatus();

    StatusOrBuilder getStatusOrBuilder();

    boolean hasMetaData();

    boolean hasSpec();

    boolean hasStatus();
}
