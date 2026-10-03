package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$WatchFaceOrBuilder extends MessageLiteOrBuilder {
    boolean getIsCurrent();

    int getPositionIndex();

    String getStyleData();

    ByteString getStyleDataBytes();

    int getStyleIndex();

    String getWatchFaceKey();

    ByteString getWatchFaceKeyBytes();

    String getWatchFaceName();

    ByteString getWatchFaceNameBytes();
}
