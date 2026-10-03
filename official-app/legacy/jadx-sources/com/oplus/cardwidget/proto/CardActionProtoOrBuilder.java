package com.oplus.cardwidget.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface CardActionProtoOrBuilder extends MessageOrBuilder {
    boolean containsParam(String str);

    int getAction();

    int getCardId();

    int getCardType();

    int getHostId();

    @Deprecated
    Map<String, String> getParam();

    int getParamCount();

    Map<String, String> getParamMap();

    String getParamOrDefault(String str, String str2);

    String getParamOrThrow(String str);

    boolean hasAction();

    boolean hasCardId();

    boolean hasCardType();

    boolean hasHostId();
}
