package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$CreationResourceSyncOrBuilder extends MessageLiteOrBuilder {
    String getImgs(int i);

    ByteString getImgsBytes(int i);

    int getImgsCount();

    List<String> getImgsList();

    String getVideos(int i);

    ByteString getVideosBytes(int i);

    int getVideosCount();

    List<String> getVideosList();

    String getWfUnique();

    ByteString getWfUniqueBytes();
}
