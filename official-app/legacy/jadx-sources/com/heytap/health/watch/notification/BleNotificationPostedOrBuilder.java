package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface BleNotificationPostedOrBuilder extends MessageLiteOrBuilder {
    boolean getHasRemoteInput();

    int getIconType();

    int getIntId();

    int getIntType();

    int getPhoneState();

    int getPostTime();

    String getStrAppName();

    ByteString getStrAppNameBytes();

    String getStrContent();

    ByteString getStrContentBytes();

    String getStrKey();

    ByteString getStrKeyBytes();

    String getStrPackageName();

    ByteString getStrPackageNameBytes();

    String getStrTag();

    ByteString getStrTagBytes();

    String getStrTitle();

    ByteString getStrTitleBytes();
}
