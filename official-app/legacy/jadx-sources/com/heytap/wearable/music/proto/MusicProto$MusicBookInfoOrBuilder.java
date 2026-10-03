package com.heytap.wearable.music.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface MusicProto$MusicBookInfoOrBuilder extends MessageLiteOrBuilder {
    MusicProto$BookFileInfo getBookFile(int i);

    int getBookFileCount();

    List<MusicProto$BookFileInfo> getBookFileList();

    String getMusicBookName();

    ByteString getMusicBookNameBytes();
}
