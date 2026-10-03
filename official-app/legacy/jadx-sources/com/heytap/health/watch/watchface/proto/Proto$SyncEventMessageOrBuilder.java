package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$SyncEventMessageOrBuilder extends MessageLiteOrBuilder {
    String getAlbumWfUnique();

    ByteString getAlbumWfUniqueBytes();

    String getAlbumWfVersion();

    ByteString getAlbumWfVersionBytes();

    String getAodWfUnique();

    ByteString getAodWfUniqueBytes();

    String getAodWfVersion();

    ByteString getAodWfVersionBytes();

    String getClassicWfUnique();

    ByteString getClassicWfUniqueBytes();

    String getClassicWfVersion();

    ByteString getClassicWfVersionBytes();

    String getCurrentWf();

    ByteString getCurrentWfBytes();

    String getHandPaintWfUnique();

    ByteString getHandPaintWfUniqueBytes();

    String getHandPaintWfVersion();

    ByteString getHandPaintWfVersionBytes();

    int getMaxCount();

    String getOmojiWfUnique();

    ByteString getOmojiWfUniqueBytes();

    String getOmojiWfVersion();

    ByteString getOmojiWfVersionBytes();

    String getOutfitWfUnique();

    ByteString getOutfitWfUniqueBytes();

    String getOutfitWfVersion();

    ByteString getOutfitWfVersionBytes();

    String getVideoWfUnique();

    ByteString getVideoWfUniqueBytes();

    String getVideoWfVersion();

    ByteString getVideoWfVersionBytes();

    String getWallpaperWfUnique();

    ByteString getWallpaperWfUniqueBytes();

    String getWallpaperWfVersion();

    ByteString getWallpaperWfVersionBytes();

    Proto$WfEntity getWatchFaces(int i);

    int getWatchFacesCount();

    List<Proto$WfEntity> getWatchFacesList();
}
