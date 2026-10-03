package com.heytap.wearable.oaf.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface OafRecorder$OAFKscRecordeOrBuilder extends MessageLiteOrBuilder {
    ByteString getKsc();

    ByteString getKscAlias();

    ByteString getLocalDeviceId();

    ByteString getRemoteDeviceId();
}
