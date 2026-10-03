package com.heytap.wearable.soundrecord.bean;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface SoundRecord$RecordListResponseOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    SoundRecord$RecordInfo getRecordInfoList(int i);

    int getRecordInfoListCount();

    List<SoundRecord$RecordInfo> getRecordInfoListList();

    long getTimeStamp();

    int getTotalSize();
}
