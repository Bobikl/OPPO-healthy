package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface CpUpdateConfigOrBuilder extends MessageOrBuilder {
    String getSelection();

    String getSelectionArgs(int i);

    ByteString getSelectionArgsBytes(int i);

    int getSelectionArgsCount();

    List<String> getSelectionArgsList();

    ByteString getSelectionBytes();

    ByteString getSerializedContentValuesBytes();

    boolean hasSelection();
}
