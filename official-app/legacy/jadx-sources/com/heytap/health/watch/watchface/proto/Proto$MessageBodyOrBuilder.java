package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$MessageBodyOrBuilder extends MessageLiteOrBuilder {
    Proto$WatchFacesActionEvent getActionEvent();

    Proto$AlbumEvent getAlbumEvent();

    Proto$LocationEvent getLocationEvent();

    String getReservedExtra();

    ByteString getReservedExtraBytes();

    Proto$WatchFacesStatusSync getStatusSync();

    Proto$WatchFaceChangedEvent getWatchFaceChangedEvent();

    boolean hasActionEvent();

    boolean hasAlbumEvent();

    boolean hasLocationEvent();

    boolean hasStatusSync();

    boolean hasWatchFaceChangedEvent();
}
