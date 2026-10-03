package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface ExtendMcuOrBuilder extends MessageLiteOrBuilder {
    long getAppData();

    boolean getHasRtosUserDate();

    int getRtosUserDate();

    String getWechatCodeFormat();

    ByteString getWechatCodeFormatBytes();

    String getWechatPicPath();

    ByteString getWechatPicPathBytes();

    ByteString getWechatPicture();

    int getWechatType();

    String getWinName();

    ByteString getWinNameBytes();
}
