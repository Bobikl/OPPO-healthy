package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface MessagingStyleProtoOrBuilder extends MessageLiteOrBuilder {
    String getBody();

    ByteString getBodyBytes();

    String getDeviceUser();

    MsgPictureProto getDeviceUserAvatar();

    ByteString getDeviceUserBytes();

    String getDeviceUserKey();

    ByteString getDeviceUserKeyBytes();

    boolean getIsGroupConversation();

    ChatMessageProto getMessages(int i);

    int getMessagesCount();

    List<ChatMessageProto> getMessagesList();

    String getTitle();

    ByteString getTitleBytes();

    boolean hasDeviceUserAvatar();
}
