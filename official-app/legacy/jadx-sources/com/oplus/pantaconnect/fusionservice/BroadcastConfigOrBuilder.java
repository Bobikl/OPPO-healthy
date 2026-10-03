package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface BroadcastConfigOrBuilder extends MessageOrBuilder {
    IntentParams getIntentParams();

    IntentParamsOrBuilder getIntentParamsOrBuilder();

    String getReceiverPermission();

    ByteString getReceiverPermissionBytes();

    boolean hasIntentParams();

    boolean hasReceiverPermission();
}
