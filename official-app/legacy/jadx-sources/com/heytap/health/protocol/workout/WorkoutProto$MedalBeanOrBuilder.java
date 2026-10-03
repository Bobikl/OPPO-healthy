package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$MedalBeanOrBuilder extends MessageLiteOrBuilder {
    int getBreakRecordTimes();

    String getCode();

    ByteString getCodeBytes();

    int getColorType();

    int getDisplay();

    String getImageGet();

    ByteString getImageGetBytes();

    String getImageUnget();

    ByteString getImageUngetBytes();

    int getLogicStatus();

    String getMedalResUrl();

    ByteString getMedalResUrlBytes();

    String getName();

    ByteString getNameBytes();

    int getObtainStatus();

    int getObtainTime();

    int getRecordDuration();

    String getRemark();

    ByteString getRemarkBytes();

    int getSort();

    int getStatus();

    String getTarget();

    ByteString getTargetBytes();

    String getTypeCode();

    ByteString getTypeCodeBytes();

    String getUnattainedContent();

    ByteString getUnattainedContentBytes();
}
