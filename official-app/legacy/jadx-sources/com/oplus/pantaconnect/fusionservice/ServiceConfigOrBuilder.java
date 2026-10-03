package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface ServiceConfigOrBuilder extends MessageOrBuilder {
    int getBindFlags();

    IntentParams getIntentParams();

    IntentParamsOrBuilder getIntentParamsOrBuilder();

    ServiceLaunchType getLaunchType();

    int getLaunchTypeValue();

    long getUnbindDelayMs();

    boolean hasBindFlags();

    boolean hasIntentParams();

    boolean hasUnbindDelayMs();
}
