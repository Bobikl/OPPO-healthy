package com.heytap.health.owconnect.diagnosis;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface Events$WConnectEventOrBuilder extends MessageLiteOrBuilder {
    boolean getBackground();

    int getCode();

    boolean getConnect();

    String getMac();

    ByteString getMacBytes();

    String getMessage();

    ByteString getMessageBytes();

    Events$OWStep getStep();

    int getStepValue();

    long getTime();
}
