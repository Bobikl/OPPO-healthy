package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$WatchFaceChangedEventOrBuilder extends MessageLiteOrBuilder {
    int getEventType();

    Proto$WatchFaceVersion getWatchFaceVersion();

    boolean hasWatchFaceVersion();
}
