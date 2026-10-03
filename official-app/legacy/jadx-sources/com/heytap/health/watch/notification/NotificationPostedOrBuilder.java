package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface NotificationPostedOrBuilder extends MessageLiteOrBuilder {
    ByteString getByteLargeIcon();

    ByteString getByteSmallIcon();

    boolean getHasRemoteInput();

    int getIntId();

    int getIntType();

    long getLPostTime();

    String getStrAppName();

    ByteString getStrAppNameBytes();

    String getStrContent();

    ByteString getStrContentBytes();

    String getStrFrom();

    ByteString getStrFromBytes();

    String getStrKey();

    ByteString getStrKeyBytes();

    String getStrPackageName();

    ByteString getStrPackageNameBytes();

    String getStrSubContent();

    ByteString getStrSubContentBytes();

    String getStrTag();

    ByteString getStrTagBytes();

    String getStrTitle();

    ByteString getStrTitleBytes();
}
