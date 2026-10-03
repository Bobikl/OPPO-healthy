package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.heytap.health.protocol.userinfo.UserInfoProto$UserInfo;

/* JADX INFO: loaded from: classes17.dex */
public interface FitnessProto$UserBodyInfoResponseOrBuilder extends MessageLiteOrBuilder {
    int getErrorCode();

    String getExtra();

    ByteString getExtraBytes();

    UserInfoProto$UserInfo getUserinfo();

    boolean hasUserinfo();
}
