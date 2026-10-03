package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface ProcessInfoOrBuilder extends MessageLiteOrBuilder {
    int getAllSteps();

    int getBgColor();

    int getCurrentStep();

    int getForeColor();

    String getImageKey();

    ByteString getImageKeyBytes();

    String getNodeName(int i);

    ByteString getNodeNameBytes(int i);

    int getNodeNameCount();

    List<String> getNodeNameList();

    int getPercent();
}
