package com.heytap.wearable.btnet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface FileUploadPreRequestOrBuilder extends MessageLiteOrBuilder {
    boolean containsReqHeaders(String str);

    String getFileName();

    ByteString getFileNameBytes();

    int getFileSize();

    @Deprecated
    Map<String, String> getReqHeaders();

    int getReqHeadersCount();

    Map<String, String> getReqHeadersMap();

    String getReqHeadersOrDefault(String str, String str2);

    String getReqHeadersOrThrow(String str);

    long getReqId();

    int getReqMethod();

    String getUrl();

    ByteString getUrlBytes();
}
