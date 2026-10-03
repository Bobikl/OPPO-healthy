package com.heytap.wearable.music.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface MusicProto$RspMusicFilesOrBuilder extends MessageLiteOrBuilder {
    int getDataIndex();

    MusicProto$MusicFileInfo getMusicFiles(int i);

    int getMusicFilesCount();

    List<MusicProto$MusicFileInfo> getMusicFilesList();

    int getPackTotal();
}
