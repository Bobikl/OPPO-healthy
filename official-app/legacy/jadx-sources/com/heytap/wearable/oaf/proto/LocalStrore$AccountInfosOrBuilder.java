package com.heytap.wearable.oaf.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface LocalStrore$AccountInfosOrBuilder extends MessageLiteOrBuilder {
    boolean containsSsodiToAccountName(String str);

    @Deprecated
    Map<String, String> getSsodiToAccountName();

    int getSsodiToAccountNameCount();

    Map<String, String> getSsodiToAccountNameMap();

    String getSsodiToAccountNameOrDefault(String str, String str2);

    String getSsodiToAccountNameOrThrow(String str);
}
