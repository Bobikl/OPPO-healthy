package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface CpQueryConfigOrBuilder extends MessageOrBuilder {
    String getProjection(int i);

    ByteString getProjectionBytes(int i);

    int getProjectionCount();

    List<String> getProjectionList();

    String getSelection();

    String getSelectionArgs(int i);

    ByteString getSelectionArgsBytes(int i);

    int getSelectionArgsCount();

    List<String> getSelectionArgsList();

    ByteString getSelectionBytes();

    String getSortOrder();

    ByteString getSortOrderBytes();

    boolean hasSelection();

    boolean hasSortOrder();
}
