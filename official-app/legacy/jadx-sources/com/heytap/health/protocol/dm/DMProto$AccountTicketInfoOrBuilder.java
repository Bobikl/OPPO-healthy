package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$AccountTicketInfoOrBuilder extends MessageLiteOrBuilder {
    String getAppId();

    ByteString getAppIdBytes();

    String getAppKey();

    ByteString getAppKeyBytes();

    String getAppPkg();

    ByteString getAppPkgBytes();

    int getErrorCode();

    boolean getIsOpOversea();

    String getTicketNo();

    ByteString getTicketNoBytes();

    String getUserCountry();

    ByteString getUserCountryBytes();
}
