package com.heytap.health.watch.notification.flashback;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface FlashbackMsgOrBuilder extends MessageLiteOrBuilder {
    boolean getBackground();

    ButtonMsg getButtonMsg(int i);

    int getButtonMsgCount();

    List<ButtonMsg> getButtonMsgList();

    ByteString getByteIcon();

    MediaMsg getMediaMsg();

    int getMsgId();

    String getPackageName();

    ByteString getPackageNameBytes();

    int getRingtone();

    int getStatus();

    String getStrContent();

    ByteString getStrContentBytes();

    String getStrTitle();

    ByteString getStrTitleBytes();

    int getTemplateId();

    int getVibration();

    boolean hasMediaMsg();
}
