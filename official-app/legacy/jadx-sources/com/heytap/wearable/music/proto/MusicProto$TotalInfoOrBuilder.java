package com.heytap.wearable.music.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface MusicProto$TotalInfoOrBuilder extends MessageLiteOrBuilder {
    MusicProto$PlayInfo getPlayInfo();

    MusicProto$PlayState getPlayState();

    MusicProto$VolumeInfo getVolumeInfo();

    boolean hasPlayInfo();

    boolean hasPlayState();

    boolean hasVolumeInfo();
}
