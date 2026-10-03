package com.heytap.wearable.btnet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface FileUploadResponseOrBuilder extends MessageLiteOrBuilder {
    boolean containsRspHeaders(String str);

    long getReqId();

    ByteString getRspBody();

    int getRspCode();

    @Deprecated
    Map<String, String> getRspHeaders();

    int getRspHeadersCount();

    Map<String, String> getRspHeadersMap();

    String getRspHeadersOrDefault(String str, String str2);

    String getRspHeadersOrThrow(String str);

    int getRspType();
}
