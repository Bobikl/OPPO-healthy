package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface ParsedNotificationProtoOrBuilder extends MessageLiteOrBuilder {
    ParsedNotificationActionProto getActions(int i);

    int getActionsCount();

    List<ParsedNotificationActionProto> getActionsList();

    MsgPictureProto getAppIconBitmap();

    String getAppName();

    ByteString getAppNameBytes();

    String getBridgeTag();

    ByteString getBridgeTagBytes();

    int getColor();

    String getContentIntentId();

    ByteString getContentIntentIdBytes();

    Extend getExt();

    int getFlags();

    String getGroup();

    int getGroupAlertBehavior();

    ByteString getGroupBytes();

    String getGroupKey();

    ByteString getGroupKeyBytes();

    int getId();

    boolean getIsEmergency();

    boolean getIsGroupSummary();

    boolean getIsInterruptible();

    boolean getIsWorkProfile();

    String getKey();

    ByteString getKeyBytes();

    MsgPictureProto getLarge144IconBitmap();

    MsgPictureProto getLargeIconBitmap();

    String getPackageName();

    ByteString getPackageNameBytes();

    long getPostTimeMillis();

    boolean getShouldOnlyAlertOnce();

    MsgPictureProto getSmallIconBitmap();

    NotificationStyleProto getStyle();

    String getSubText();

    ByteString getSubTextBytes();

    String getTag();

    ByteString getTagBytes();

    String getTitle();

    ByteString getTitleBytes();

    int getUserId();

    ParsedNotificationActionProto getWearableActions(int i);

    int getWearableActionsCount();

    List<ParsedNotificationActionProto> getWearableActionsList();

    long getWhenTimeMillis();

    boolean hasAppIconBitmap();

    boolean hasExt();

    boolean hasLarge144IconBitmap();

    boolean hasLargeIconBitmap();

    boolean hasSmallIconBitmap();

    boolean hasStyle();
}
