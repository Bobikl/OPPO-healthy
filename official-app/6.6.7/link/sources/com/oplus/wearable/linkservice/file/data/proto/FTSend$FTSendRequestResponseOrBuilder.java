package com.oplus.wearable.linkservice.file.data.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface FTSend$FTSendRequestResponseOrBuilder extends MessageLiteOrBuilder {
    String getErrorMsg();

    ByteString getErrorMsgBytes();

    String getFilePath();

    ByteString getFilePathBytes();

    int getFileSize();

    int getFtBufferSize();

    ByteString getMD5();

    int getServiceId();

    int getState();

    int getSupportOption();

    int getTaskId();

    String getUri();

    ByteString getUriBytes();
}
