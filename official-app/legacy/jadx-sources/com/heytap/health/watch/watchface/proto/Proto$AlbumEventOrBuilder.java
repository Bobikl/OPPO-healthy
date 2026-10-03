package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$AlbumEventOrBuilder extends MessageLiteOrBuilder {
    String getCurrentAlbum();

    ByteString getCurrentAlbumBytes();

    int getEventType();

    String getImageNames(int i);

    ByteString getImageNamesBytes(int i);

    int getImageNamesCount();

    List<String> getImageNamesList();

    boolean getIsSelectAll();

    int getMemoryCount();

    String getWatchfaceKey();

    ByteString getWatchfaceKeyBytes();
}
