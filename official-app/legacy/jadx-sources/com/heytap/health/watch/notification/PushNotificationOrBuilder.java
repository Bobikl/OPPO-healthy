package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface PushNotificationOrBuilder extends MessageLiteOrBuilder {
    int getAppVersion();

    String getBigPictureUrl();

    ByteString getBigPictureUrlBytes();

    String getButtonPackageName();

    ByteString getButtonPackageNameBytes();

    String getButtonTitle();

    ByteString getButtonTitleBytes();

    String getClickActionActivity();

    ByteString getClickActionActivityBytes();

    int getClickActionType();

    String getClickActionUrl();

    ByteString getClickActionUrlBytes();

    int getCommand();

    String getContent();

    ByteString getContentBytes();

    int getDeviceSystemMode();

    int getDeviceType();

    String getDeviceUniqueId();

    ByteString getDeviceUniqueIdBytes();

    int getFirmwareVersion();

    String getLargeIcon();

    ByteString getLargeIconBytes();

    int getMessageType();

    String getModel();

    ByteString getModelBytes();

    int getNotifyId();

    int getOffLine();

    int getOffLineTtl();

    String getPrincipalName();

    ByteString getPrincipalNameBytes();

    String getPrincipalPackageName();

    ByteString getPrincipalPackageNameBytes();

    int getPushMode();

    long getPushStartTime();

    int getPushTimeType();

    long getShowEndTime();

    long getShowStartTime();

    int getShowTimeType();

    int getShowTtl();

    String getSku();

    ByteString getSkuBytes();

    String getSmallIcon();

    ByteString getSmallIconBytes();

    String getTitle();

    ByteString getTitleBytes();
}
