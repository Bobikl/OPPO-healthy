package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface WearEngineProto$WEPermissionInfoOrBuilder extends MessageLiteOrBuilder {
    String getPackageName();

    ByteString getPackageNameBytes();

    WearEngineProto$WEPermission getPermission(int i);

    int getPermissionCount();

    List<WearEngineProto$WEPermission> getPermissionList();
}
