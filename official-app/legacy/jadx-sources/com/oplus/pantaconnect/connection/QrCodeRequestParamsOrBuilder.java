package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface QrCodeRequestParamsOrBuilder extends MessageOrBuilder {
    int getDeviceType();

    String getModelId();

    ByteString getModelIdBytes();

    String getPid();

    ByteString getPidBytes();

    QrCodeRequestParams.InternalQrCodeType getQrCodeType();

    int getQrCodeTypeValue();
}
