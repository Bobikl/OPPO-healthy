package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface WorkoutProto$VoiceRemindDataOrBuilder extends MessageLiteOrBuilder {
    String getFileName(int i);

    ByteString getFileNameBytes(int i);

    int getFileNameCount();

    List<String> getFileNameList();

    int getVersion();

    int getVoiceId();

    String getVoicePackName();

    ByteString getVoicePackNameBytes();
}
