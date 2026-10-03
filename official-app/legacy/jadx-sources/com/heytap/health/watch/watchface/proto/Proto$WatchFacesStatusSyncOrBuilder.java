package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$WatchFacesStatusSyncOrBuilder extends MessageLiteOrBuilder {
    String getAiResMd5();

    ByteString getAiResMd5Bytes();

    String getAlbumKey();

    ByteString getAlbumKeyBytes();

    float getDensity();

    String getDeviceType();

    ByteString getDeviceTypeBytes();

    int getMaxCount();

    String getModel();

    ByteString getModelBytes();

    String getOutfitsKey();

    ByteString getOutfitsKeyBytes();

    String getPresent();

    ByteString getPresentBytes();

    String getPreviewImages(int i);

    ByteString getPreviewImagesBytes(int i);

    int getPreviewImagesCount();

    List<String> getPreviewImagesList();

    float getScaledDensity();

    int getScreenHeight();

    int getScreenWidth();

    String getSkuCode();

    ByteString getSkuCodeBytes();

    Proto$WatchFaceVersion getVersions(int i);

    int getVersionsCount();

    List<Proto$WatchFaceVersion> getVersionsList();

    int getWatchFaceVersion();

    Proto$WatchFace getWatchFaces(int i);

    int getWatchFacesCount();

    List<Proto$WatchFace> getWatchFacesList();
}
