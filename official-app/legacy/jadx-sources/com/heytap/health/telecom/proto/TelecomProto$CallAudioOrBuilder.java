package com.heytap.health.telecom.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface TelecomProto$CallAudioOrBuilder extends MessageLiteOrBuilder {
    TelecomProto$CallAudioItem getData(int i);

    int getDataCount();

    List<TelecomProto$CallAudioItem> getDataList();

    boolean getPrimary();
}
