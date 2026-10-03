package com.oplus.pantaconnect.devicemgr;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface LocalResourceInfoOrBuilder extends MessageOrBuilder {
    boolean containsMetaData(String str);

    boolean containsSpec(String str);

    boolean containsStatus(String str);

    String getDeviceId();

    ByteString getDeviceIdBytes();

    String getKind();

    ByteString getKindBytes();

    @Deprecated
    Map<String, String> getMetaData();

    int getMetaDataCount();

    Map<String, String> getMetaDataMap();

    String getMetaDataOrDefault(String str, String str2);

    String getMetaDataOrThrow(String str);

    @Deprecated
    Map<String, String> getSpec();

    int getSpecCount();

    Map<String, String> getSpecMap();

    String getSpecOrDefault(String str, String str2);

    String getSpecOrThrow(String str);

    @Deprecated
    Map<String, String> getStatus();

    int getStatusCount();

    Map<String, String> getStatusMap();

    String getStatusOrDefault(String str, String str2);

    String getStatusOrThrow(String str);

    String getVersion();

    ByteString getVersionBytes();
}
