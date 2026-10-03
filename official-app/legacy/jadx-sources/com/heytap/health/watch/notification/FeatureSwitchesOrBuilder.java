package com.heytap.health.watch.notification;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface FeatureSwitchesOrBuilder extends MessageLiteOrBuilder {
    FeatureSwitch getSwitches(int i);

    int getSwitchesCount();

    List<FeatureSwitch> getSwitchesList();
}
