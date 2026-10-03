package com.heytap.health.protocol;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface PermissionProto$PermissionOrBuilder extends MessageLiteOrBuilder {
    PermissionProto$Permission.FeatureItem getFeatures(int i);

    int getFeaturesCount();

    List<PermissionProto$Permission.FeatureItem> getFeaturesList();
}
