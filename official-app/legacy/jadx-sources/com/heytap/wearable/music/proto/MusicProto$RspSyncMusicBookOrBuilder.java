package com.heytap.wearable.music.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface MusicProto$RspSyncMusicBookOrBuilder extends MessageLiteOrBuilder {
    int getDataIndex();

    MusicProto$MusicBookInfo getMusicBook(int i);

    int getMusicBookCount();

    List<MusicProto$MusicBookInfo> getMusicBookList();

    int getPackTotal();
}
