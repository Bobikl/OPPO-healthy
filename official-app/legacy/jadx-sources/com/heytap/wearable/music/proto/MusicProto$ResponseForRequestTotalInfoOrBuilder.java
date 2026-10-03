package com.heytap.wearable.music.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface MusicProto$ResponseForRequestTotalInfoOrBuilder extends MessageLiteOrBuilder {
    boolean getHasPermission();

    boolean getIsPlaying();

    MusicProto$TotalInfo getTotalInfo();

    boolean hasTotalInfo();
}
