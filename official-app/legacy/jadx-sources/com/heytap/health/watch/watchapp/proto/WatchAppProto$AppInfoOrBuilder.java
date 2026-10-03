package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface WatchAppProto$AppInfoOrBuilder extends MessageLiteOrBuilder {
    String getPkgName();

    ByteString getPkgNameBytes();

    int getType();

    String getVersion();

    ByteString getVersionBytes();
}
