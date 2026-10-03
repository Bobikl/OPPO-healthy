package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.l8l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchAppProto$MsgBody extends GeneratedMessageLite<WatchAppProto$MsgBody, Builder> implements WatchAppProto$MsgBodyOrBuilder {
    public static final int ACTIVE_APP_LIST_INFO_FIELD_NUMBER = 8;
    public static final int APP_CHANGE_EVENT_FIELD_NUMBER = 6;
    public static final int APP_INSTALL_STATUS_INFO_FIELD_NUMBER = 5;
    public static final int APP_LIST_INFO_FIELD_NUMBER = 3;
    public static final int CHECK_REQUEST_FIELD_NUMBER = 16;
    public static final int CHECK_RESULT_FIELD_NUMBER = 17;
    private static final WatchAppProto$MsgBody DEFAULT_INSTANCE;
    public static final int DOWNLOAD_NEW_APP_FIELD_NUMBER = 7;
    public static final int DOWNLOAD_SPECIAL_APP_FIELD_NUMBER = 9;
    private static volatile Parser<WatchAppProto$MsgBody> PARSER = null;
    public static final int PRIVACY_AGREEMENT_FIELD_NUMBER = 2;
    public static final int UPDATE_APP_INFO_FIELD_NUMBER = 4;
    public static final int WATCH_DEVICE_INFO_FIELD_NUMBER = 1;
    private WatchAppProto$ActiveAppStatusListInfo activeAppListInfo_;
    private WatchAppProto$AppChangeEvent appChangeEvent_;
    private WatchAppProto$ActiveAppStatusInfo appInstallStatusInfo_;
    private WatchAppProto$AppListInfo appListInfo_;
    private int bitField0_;
    private WatchAppProto$InstallCheckRequest checkRequest_;
    private WatchAppProto$InstallCheckResult checkResult_;
    private WatchAppProto$DownloadNewApp downloadNewApp_;
    private WatchAppProto$DownloadSpecialApp downloadSpecialApp_;
    private WatchAppProto$PrivacyAgreement privacyAgreement_;
    private WatchAppProto$UpdateAppInfo updateAppInfo_;
    private WatchAppProto$WatchDeviceInfo watchDeviceInfo_;

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$MsgBody, Builder> implements WatchAppProto$MsgBodyOrBuilder {
        public Builder clearActiveAppListInfo() {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).clearActiveAppListInfo();
            return this;
        }

        public Builder clearAppChangeEvent() {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).clearAppChangeEvent();
            return this;
        }

        public Builder clearAppInstallStatusInfo() {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).clearAppInstallStatusInfo();
            return this;
        }

        public Builder clearAppListInfo() {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).clearAppListInfo();
            return this;
        }

        public Builder clearCheckRequest() {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).clearCheckRequest();
            return this;
        }

        public Builder clearCheckResult() {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).clearCheckResult();
            return this;
        }

        public Builder clearDownloadNewApp() {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).clearDownloadNewApp();
            return this;
        }

        public Builder clearDownloadSpecialApp() {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).clearDownloadSpecialApp();
            return this;
        }

        public Builder clearPrivacyAgreement() {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).clearPrivacyAgreement();
            return this;
        }

        public Builder clearUpdateAppInfo() {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).clearUpdateAppInfo();
            return this;
        }

        public Builder clearWatchDeviceInfo() {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).clearWatchDeviceInfo();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public WatchAppProto$ActiveAppStatusListInfo getActiveAppListInfo() {
            return ((WatchAppProto$MsgBody) this.instance).getActiveAppListInfo();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public WatchAppProto$AppChangeEvent getAppChangeEvent() {
            return ((WatchAppProto$MsgBody) this.instance).getAppChangeEvent();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public WatchAppProto$ActiveAppStatusInfo getAppInstallStatusInfo() {
            return ((WatchAppProto$MsgBody) this.instance).getAppInstallStatusInfo();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public WatchAppProto$AppListInfo getAppListInfo() {
            return ((WatchAppProto$MsgBody) this.instance).getAppListInfo();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public WatchAppProto$InstallCheckRequest getCheckRequest() {
            return ((WatchAppProto$MsgBody) this.instance).getCheckRequest();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public WatchAppProto$InstallCheckResult getCheckResult() {
            return ((WatchAppProto$MsgBody) this.instance).getCheckResult();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public WatchAppProto$DownloadNewApp getDownloadNewApp() {
            return ((WatchAppProto$MsgBody) this.instance).getDownloadNewApp();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public WatchAppProto$DownloadSpecialApp getDownloadSpecialApp() {
            return ((WatchAppProto$MsgBody) this.instance).getDownloadSpecialApp();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public WatchAppProto$PrivacyAgreement getPrivacyAgreement() {
            return ((WatchAppProto$MsgBody) this.instance).getPrivacyAgreement();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public WatchAppProto$UpdateAppInfo getUpdateAppInfo() {
            return ((WatchAppProto$MsgBody) this.instance).getUpdateAppInfo();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public WatchAppProto$WatchDeviceInfo getWatchDeviceInfo() {
            return ((WatchAppProto$MsgBody) this.instance).getWatchDeviceInfo();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public boolean hasActiveAppListInfo() {
            return ((WatchAppProto$MsgBody) this.instance).hasActiveAppListInfo();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public boolean hasAppChangeEvent() {
            return ((WatchAppProto$MsgBody) this.instance).hasAppChangeEvent();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public boolean hasAppInstallStatusInfo() {
            return ((WatchAppProto$MsgBody) this.instance).hasAppInstallStatusInfo();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public boolean hasAppListInfo() {
            return ((WatchAppProto$MsgBody) this.instance).hasAppListInfo();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public boolean hasCheckRequest() {
            return ((WatchAppProto$MsgBody) this.instance).hasCheckRequest();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public boolean hasCheckResult() {
            return ((WatchAppProto$MsgBody) this.instance).hasCheckResult();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public boolean hasDownloadNewApp() {
            return ((WatchAppProto$MsgBody) this.instance).hasDownloadNewApp();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public boolean hasDownloadSpecialApp() {
            return ((WatchAppProto$MsgBody) this.instance).hasDownloadSpecialApp();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public boolean hasPrivacyAgreement() {
            return ((WatchAppProto$MsgBody) this.instance).hasPrivacyAgreement();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public boolean hasUpdateAppInfo() {
            return ((WatchAppProto$MsgBody) this.instance).hasUpdateAppInfo();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
        public boolean hasWatchDeviceInfo() {
            return ((WatchAppProto$MsgBody) this.instance).hasWatchDeviceInfo();
        }

        public Builder mergeActiveAppListInfo(WatchAppProto$ActiveAppStatusListInfo watchAppProto$ActiveAppStatusListInfo) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).mergeActiveAppListInfo(watchAppProto$ActiveAppStatusListInfo);
            return this;
        }

        public Builder mergeAppChangeEvent(WatchAppProto$AppChangeEvent watchAppProto$AppChangeEvent) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).mergeAppChangeEvent(watchAppProto$AppChangeEvent);
            return this;
        }

        public Builder mergeAppInstallStatusInfo(WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).mergeAppInstallStatusInfo(watchAppProto$ActiveAppStatusInfo);
            return this;
        }

        public Builder mergeAppListInfo(WatchAppProto$AppListInfo watchAppProto$AppListInfo) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).mergeAppListInfo(watchAppProto$AppListInfo);
            return this;
        }

        public Builder mergeCheckRequest(WatchAppProto$InstallCheckRequest watchAppProto$InstallCheckRequest) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).mergeCheckRequest(watchAppProto$InstallCheckRequest);
            return this;
        }

        public Builder mergeCheckResult(WatchAppProto$InstallCheckResult watchAppProto$InstallCheckResult) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).mergeCheckResult(watchAppProto$InstallCheckResult);
            return this;
        }

        public Builder mergeDownloadNewApp(WatchAppProto$DownloadNewApp watchAppProto$DownloadNewApp) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).mergeDownloadNewApp(watchAppProto$DownloadNewApp);
            return this;
        }

        public Builder mergeDownloadSpecialApp(WatchAppProto$DownloadSpecialApp watchAppProto$DownloadSpecialApp) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).mergeDownloadSpecialApp(watchAppProto$DownloadSpecialApp);
            return this;
        }

        public Builder mergePrivacyAgreement(WatchAppProto$PrivacyAgreement watchAppProto$PrivacyAgreement) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).mergePrivacyAgreement(watchAppProto$PrivacyAgreement);
            return this;
        }

        public Builder mergeUpdateAppInfo(WatchAppProto$UpdateAppInfo watchAppProto$UpdateAppInfo) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).mergeUpdateAppInfo(watchAppProto$UpdateAppInfo);
            return this;
        }

        public Builder mergeWatchDeviceInfo(WatchAppProto$WatchDeviceInfo watchAppProto$WatchDeviceInfo) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).mergeWatchDeviceInfo(watchAppProto$WatchDeviceInfo);
            return this;
        }

        public Builder setActiveAppListInfo(WatchAppProto$ActiveAppStatusListInfo watchAppProto$ActiveAppStatusListInfo) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setActiveAppListInfo(watchAppProto$ActiveAppStatusListInfo);
            return this;
        }

        public Builder setAppChangeEvent(WatchAppProto$AppChangeEvent watchAppProto$AppChangeEvent) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setAppChangeEvent(watchAppProto$AppChangeEvent);
            return this;
        }

        public Builder setAppInstallStatusInfo(WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setAppInstallStatusInfo(watchAppProto$ActiveAppStatusInfo);
            return this;
        }

        public Builder setAppListInfo(WatchAppProto$AppListInfo watchAppProto$AppListInfo) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setAppListInfo(watchAppProto$AppListInfo);
            return this;
        }

        public Builder setCheckRequest(WatchAppProto$InstallCheckRequest watchAppProto$InstallCheckRequest) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setCheckRequest(watchAppProto$InstallCheckRequest);
            return this;
        }

        public Builder setCheckResult(WatchAppProto$InstallCheckResult watchAppProto$InstallCheckResult) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setCheckResult(watchAppProto$InstallCheckResult);
            return this;
        }

        public Builder setDownloadNewApp(WatchAppProto$DownloadNewApp watchAppProto$DownloadNewApp) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setDownloadNewApp(watchAppProto$DownloadNewApp);
            return this;
        }

        public Builder setDownloadSpecialApp(WatchAppProto$DownloadSpecialApp watchAppProto$DownloadSpecialApp) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setDownloadSpecialApp(watchAppProto$DownloadSpecialApp);
            return this;
        }

        public Builder setPrivacyAgreement(WatchAppProto$PrivacyAgreement watchAppProto$PrivacyAgreement) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setPrivacyAgreement(watchAppProto$PrivacyAgreement);
            return this;
        }

        public Builder setUpdateAppInfo(WatchAppProto$UpdateAppInfo watchAppProto$UpdateAppInfo) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setUpdateAppInfo(watchAppProto$UpdateAppInfo);
            return this;
        }

        public Builder setWatchDeviceInfo(WatchAppProto$WatchDeviceInfo watchAppProto$WatchDeviceInfo) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setWatchDeviceInfo(watchAppProto$WatchDeviceInfo);
            return this;
        }

        private Builder() {
            super(WatchAppProto$MsgBody.DEFAULT_INSTANCE);
        }

        public Builder setActiveAppListInfo(WatchAppProto$ActiveAppStatusListInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setActiveAppListInfo(builder.build());
            return this;
        }

        public Builder setAppChangeEvent(WatchAppProto$AppChangeEvent.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setAppChangeEvent(builder.build());
            return this;
        }

        public Builder setAppInstallStatusInfo(WatchAppProto$ActiveAppStatusInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setAppInstallStatusInfo(builder.build());
            return this;
        }

        public Builder setAppListInfo(WatchAppProto$AppListInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setAppListInfo(builder.build());
            return this;
        }

        public Builder setCheckRequest(WatchAppProto$InstallCheckRequest.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setCheckRequest(builder.build());
            return this;
        }

        public Builder setCheckResult(WatchAppProto$InstallCheckResult.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setCheckResult(builder.build());
            return this;
        }

        public Builder setDownloadNewApp(WatchAppProto$DownloadNewApp.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setDownloadNewApp(builder.build());
            return this;
        }

        public Builder setDownloadSpecialApp(WatchAppProto$DownloadSpecialApp.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setDownloadSpecialApp(builder.build());
            return this;
        }

        public Builder setPrivacyAgreement(WatchAppProto$PrivacyAgreement.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setPrivacyAgreement(builder.build());
            return this;
        }

        public Builder setUpdateAppInfo(WatchAppProto$UpdateAppInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setUpdateAppInfo(builder.build());
            return this;
        }

        public Builder setWatchDeviceInfo(WatchAppProto$WatchDeviceInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$MsgBody) this.instance).setWatchDeviceInfo(builder.build());
            return this;
        }
    }

    static {
        WatchAppProto$MsgBody watchAppProto$MsgBody = new WatchAppProto$MsgBody();
        DEFAULT_INSTANCE = watchAppProto$MsgBody;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$MsgBody.class, watchAppProto$MsgBody);
    }

    private WatchAppProto$MsgBody() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActiveAppListInfo() {
        this.activeAppListInfo_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppChangeEvent() {
        this.appChangeEvent_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInstallStatusInfo() {
        this.appInstallStatusInfo_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppListInfo() {
        this.appListInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCheckRequest() {
        this.checkRequest_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCheckResult() {
        this.checkResult_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloadNewApp() {
        this.downloadNewApp_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloadSpecialApp() {
        this.downloadSpecialApp_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrivacyAgreement() {
        this.privacyAgreement_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateAppInfo() {
        this.updateAppInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchDeviceInfo() {
        this.watchDeviceInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static WatchAppProto$MsgBody getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActiveAppListInfo(WatchAppProto$ActiveAppStatusListInfo watchAppProto$ActiveAppStatusListInfo) {
        watchAppProto$ActiveAppStatusListInfo.getClass();
        WatchAppProto$ActiveAppStatusListInfo watchAppProto$ActiveAppStatusListInfo2 = this.activeAppListInfo_;
        if (watchAppProto$ActiveAppStatusListInfo2 == null || watchAppProto$ActiveAppStatusListInfo2 == WatchAppProto$ActiveAppStatusListInfo.getDefaultInstance()) {
            this.activeAppListInfo_ = watchAppProto$ActiveAppStatusListInfo;
        } else {
            this.activeAppListInfo_ = WatchAppProto$ActiveAppStatusListInfo.newBuilder(this.activeAppListInfo_).mergeFrom(watchAppProto$ActiveAppStatusListInfo).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppChangeEvent(WatchAppProto$AppChangeEvent watchAppProto$AppChangeEvent) {
        watchAppProto$AppChangeEvent.getClass();
        WatchAppProto$AppChangeEvent watchAppProto$AppChangeEvent2 = this.appChangeEvent_;
        if (watchAppProto$AppChangeEvent2 == null || watchAppProto$AppChangeEvent2 == WatchAppProto$AppChangeEvent.getDefaultInstance()) {
            this.appChangeEvent_ = watchAppProto$AppChangeEvent;
        } else {
            this.appChangeEvent_ = WatchAppProto$AppChangeEvent.newBuilder(this.appChangeEvent_).mergeFrom(watchAppProto$AppChangeEvent).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppInstallStatusInfo(WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo) {
        watchAppProto$ActiveAppStatusInfo.getClass();
        WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo2 = this.appInstallStatusInfo_;
        if (watchAppProto$ActiveAppStatusInfo2 == null || watchAppProto$ActiveAppStatusInfo2 == WatchAppProto$ActiveAppStatusInfo.getDefaultInstance()) {
            this.appInstallStatusInfo_ = watchAppProto$ActiveAppStatusInfo;
        } else {
            this.appInstallStatusInfo_ = WatchAppProto$ActiveAppStatusInfo.newBuilder(this.appInstallStatusInfo_).mergeFrom(watchAppProto$ActiveAppStatusInfo).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppListInfo(WatchAppProto$AppListInfo watchAppProto$AppListInfo) {
        watchAppProto$AppListInfo.getClass();
        WatchAppProto$AppListInfo watchAppProto$AppListInfo2 = this.appListInfo_;
        if (watchAppProto$AppListInfo2 == null || watchAppProto$AppListInfo2 == WatchAppProto$AppListInfo.getDefaultInstance()) {
            this.appListInfo_ = watchAppProto$AppListInfo;
        } else {
            this.appListInfo_ = WatchAppProto$AppListInfo.newBuilder(this.appListInfo_).mergeFrom(watchAppProto$AppListInfo).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCheckRequest(WatchAppProto$InstallCheckRequest watchAppProto$InstallCheckRequest) {
        watchAppProto$InstallCheckRequest.getClass();
        WatchAppProto$InstallCheckRequest watchAppProto$InstallCheckRequest2 = this.checkRequest_;
        if (watchAppProto$InstallCheckRequest2 == null || watchAppProto$InstallCheckRequest2 == WatchAppProto$InstallCheckRequest.getDefaultInstance()) {
            this.checkRequest_ = watchAppProto$InstallCheckRequest;
        } else {
            this.checkRequest_ = WatchAppProto$InstallCheckRequest.newBuilder(this.checkRequest_).mergeFrom(watchAppProto$InstallCheckRequest).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCheckResult(WatchAppProto$InstallCheckResult watchAppProto$InstallCheckResult) {
        watchAppProto$InstallCheckResult.getClass();
        WatchAppProto$InstallCheckResult watchAppProto$InstallCheckResult2 = this.checkResult_;
        if (watchAppProto$InstallCheckResult2 == null || watchAppProto$InstallCheckResult2 == WatchAppProto$InstallCheckResult.getDefaultInstance()) {
            this.checkResult_ = watchAppProto$InstallCheckResult;
        } else {
            this.checkResult_ = WatchAppProto$InstallCheckResult.newBuilder(this.checkResult_).mergeFrom(watchAppProto$InstallCheckResult).buildPartial();
        }
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDownloadNewApp(WatchAppProto$DownloadNewApp watchAppProto$DownloadNewApp) {
        watchAppProto$DownloadNewApp.getClass();
        WatchAppProto$DownloadNewApp watchAppProto$DownloadNewApp2 = this.downloadNewApp_;
        if (watchAppProto$DownloadNewApp2 == null || watchAppProto$DownloadNewApp2 == WatchAppProto$DownloadNewApp.getDefaultInstance()) {
            this.downloadNewApp_ = watchAppProto$DownloadNewApp;
        } else {
            this.downloadNewApp_ = WatchAppProto$DownloadNewApp.newBuilder(this.downloadNewApp_).mergeFrom(watchAppProto$DownloadNewApp).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDownloadSpecialApp(WatchAppProto$DownloadSpecialApp watchAppProto$DownloadSpecialApp) {
        watchAppProto$DownloadSpecialApp.getClass();
        WatchAppProto$DownloadSpecialApp watchAppProto$DownloadSpecialApp2 = this.downloadSpecialApp_;
        if (watchAppProto$DownloadSpecialApp2 == null || watchAppProto$DownloadSpecialApp2 == WatchAppProto$DownloadSpecialApp.getDefaultInstance()) {
            this.downloadSpecialApp_ = watchAppProto$DownloadSpecialApp;
        } else {
            this.downloadSpecialApp_ = WatchAppProto$DownloadSpecialApp.newBuilder(this.downloadSpecialApp_).mergeFrom(watchAppProto$DownloadSpecialApp).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrivacyAgreement(WatchAppProto$PrivacyAgreement watchAppProto$PrivacyAgreement) {
        watchAppProto$PrivacyAgreement.getClass();
        WatchAppProto$PrivacyAgreement watchAppProto$PrivacyAgreement2 = this.privacyAgreement_;
        if (watchAppProto$PrivacyAgreement2 == null || watchAppProto$PrivacyAgreement2 == WatchAppProto$PrivacyAgreement.getDefaultInstance()) {
            this.privacyAgreement_ = watchAppProto$PrivacyAgreement;
        } else {
            this.privacyAgreement_ = WatchAppProto$PrivacyAgreement.newBuilder(this.privacyAgreement_).mergeFrom(watchAppProto$PrivacyAgreement).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateAppInfo(WatchAppProto$UpdateAppInfo watchAppProto$UpdateAppInfo) {
        watchAppProto$UpdateAppInfo.getClass();
        WatchAppProto$UpdateAppInfo watchAppProto$UpdateAppInfo2 = this.updateAppInfo_;
        if (watchAppProto$UpdateAppInfo2 == null || watchAppProto$UpdateAppInfo2 == WatchAppProto$UpdateAppInfo.getDefaultInstance()) {
            this.updateAppInfo_ = watchAppProto$UpdateAppInfo;
        } else {
            this.updateAppInfo_ = WatchAppProto$UpdateAppInfo.newBuilder(this.updateAppInfo_).mergeFrom(watchAppProto$UpdateAppInfo).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWatchDeviceInfo(WatchAppProto$WatchDeviceInfo watchAppProto$WatchDeviceInfo) {
        watchAppProto$WatchDeviceInfo.getClass();
        WatchAppProto$WatchDeviceInfo watchAppProto$WatchDeviceInfo2 = this.watchDeviceInfo_;
        if (watchAppProto$WatchDeviceInfo2 == null || watchAppProto$WatchDeviceInfo2 == WatchAppProto$WatchDeviceInfo.getDefaultInstance()) {
            this.watchDeviceInfo_ = watchAppProto$WatchDeviceInfo;
        } else {
            this.watchDeviceInfo_ = WatchAppProto$WatchDeviceInfo.newBuilder(this.watchDeviceInfo_).mergeFrom(watchAppProto$WatchDeviceInfo).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchAppProto$MsgBody parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$MsgBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$MsgBody parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$MsgBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$MsgBody> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveAppListInfo(WatchAppProto$ActiveAppStatusListInfo watchAppProto$ActiveAppStatusListInfo) {
        watchAppProto$ActiveAppStatusListInfo.getClass();
        this.activeAppListInfo_ = watchAppProto$ActiveAppStatusListInfo;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppChangeEvent(WatchAppProto$AppChangeEvent watchAppProto$AppChangeEvent) {
        watchAppProto$AppChangeEvent.getClass();
        this.appChangeEvent_ = watchAppProto$AppChangeEvent;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstallStatusInfo(WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo) {
        watchAppProto$ActiveAppStatusInfo.getClass();
        this.appInstallStatusInfo_ = watchAppProto$ActiveAppStatusInfo;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppListInfo(WatchAppProto$AppListInfo watchAppProto$AppListInfo) {
        watchAppProto$AppListInfo.getClass();
        this.appListInfo_ = watchAppProto$AppListInfo;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckRequest(WatchAppProto$InstallCheckRequest watchAppProto$InstallCheckRequest) {
        watchAppProto$InstallCheckRequest.getClass();
        this.checkRequest_ = watchAppProto$InstallCheckRequest;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckResult(WatchAppProto$InstallCheckResult watchAppProto$InstallCheckResult) {
        watchAppProto$InstallCheckResult.getClass();
        this.checkResult_ = watchAppProto$InstallCheckResult;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadNewApp(WatchAppProto$DownloadNewApp watchAppProto$DownloadNewApp) {
        watchAppProto$DownloadNewApp.getClass();
        this.downloadNewApp_ = watchAppProto$DownloadNewApp;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadSpecialApp(WatchAppProto$DownloadSpecialApp watchAppProto$DownloadSpecialApp) {
        watchAppProto$DownloadSpecialApp.getClass();
        this.downloadSpecialApp_ = watchAppProto$DownloadSpecialApp;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrivacyAgreement(WatchAppProto$PrivacyAgreement watchAppProto$PrivacyAgreement) {
        watchAppProto$PrivacyAgreement.getClass();
        this.privacyAgreement_ = watchAppProto$PrivacyAgreement;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateAppInfo(WatchAppProto$UpdateAppInfo watchAppProto$UpdateAppInfo) {
        watchAppProto$UpdateAppInfo.getClass();
        this.updateAppInfo_ = watchAppProto$UpdateAppInfo;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchDeviceInfo(WatchAppProto$WatchDeviceInfo watchAppProto$WatchDeviceInfo) {
        watchAppProto$WatchDeviceInfo.getClass();
        this.watchDeviceInfo_ = watchAppProto$WatchDeviceInfo;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l8l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchAppProto$MsgBody();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\u0010ဉ\t\u0011ဉ\n", new Object[]{"bitField0_", "watchDeviceInfo_", "privacyAgreement_", "appListInfo_", "updateAppInfo_", "appInstallStatusInfo_", "appChangeEvent_", "downloadNewApp_", "activeAppListInfo_", "downloadSpecialApp_", "checkRequest_", "checkResult_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$MsgBody> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$MsgBody.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public WatchAppProto$ActiveAppStatusListInfo getActiveAppListInfo() {
        WatchAppProto$ActiveAppStatusListInfo watchAppProto$ActiveAppStatusListInfo = this.activeAppListInfo_;
        return watchAppProto$ActiveAppStatusListInfo == null ? WatchAppProto$ActiveAppStatusListInfo.getDefaultInstance() : watchAppProto$ActiveAppStatusListInfo;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public WatchAppProto$AppChangeEvent getAppChangeEvent() {
        WatchAppProto$AppChangeEvent watchAppProto$AppChangeEvent = this.appChangeEvent_;
        return watchAppProto$AppChangeEvent == null ? WatchAppProto$AppChangeEvent.getDefaultInstance() : watchAppProto$AppChangeEvent;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public WatchAppProto$ActiveAppStatusInfo getAppInstallStatusInfo() {
        WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo = this.appInstallStatusInfo_;
        return watchAppProto$ActiveAppStatusInfo == null ? WatchAppProto$ActiveAppStatusInfo.getDefaultInstance() : watchAppProto$ActiveAppStatusInfo;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public WatchAppProto$AppListInfo getAppListInfo() {
        WatchAppProto$AppListInfo watchAppProto$AppListInfo = this.appListInfo_;
        return watchAppProto$AppListInfo == null ? WatchAppProto$AppListInfo.getDefaultInstance() : watchAppProto$AppListInfo;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public WatchAppProto$InstallCheckRequest getCheckRequest() {
        WatchAppProto$InstallCheckRequest watchAppProto$InstallCheckRequest = this.checkRequest_;
        return watchAppProto$InstallCheckRequest == null ? WatchAppProto$InstallCheckRequest.getDefaultInstance() : watchAppProto$InstallCheckRequest;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public WatchAppProto$InstallCheckResult getCheckResult() {
        WatchAppProto$InstallCheckResult watchAppProto$InstallCheckResult = this.checkResult_;
        return watchAppProto$InstallCheckResult == null ? WatchAppProto$InstallCheckResult.getDefaultInstance() : watchAppProto$InstallCheckResult;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public WatchAppProto$DownloadNewApp getDownloadNewApp() {
        WatchAppProto$DownloadNewApp watchAppProto$DownloadNewApp = this.downloadNewApp_;
        return watchAppProto$DownloadNewApp == null ? WatchAppProto$DownloadNewApp.getDefaultInstance() : watchAppProto$DownloadNewApp;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public WatchAppProto$DownloadSpecialApp getDownloadSpecialApp() {
        WatchAppProto$DownloadSpecialApp watchAppProto$DownloadSpecialApp = this.downloadSpecialApp_;
        return watchAppProto$DownloadSpecialApp == null ? WatchAppProto$DownloadSpecialApp.getDefaultInstance() : watchAppProto$DownloadSpecialApp;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public WatchAppProto$PrivacyAgreement getPrivacyAgreement() {
        WatchAppProto$PrivacyAgreement watchAppProto$PrivacyAgreement = this.privacyAgreement_;
        return watchAppProto$PrivacyAgreement == null ? WatchAppProto$PrivacyAgreement.getDefaultInstance() : watchAppProto$PrivacyAgreement;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public WatchAppProto$UpdateAppInfo getUpdateAppInfo() {
        WatchAppProto$UpdateAppInfo watchAppProto$UpdateAppInfo = this.updateAppInfo_;
        return watchAppProto$UpdateAppInfo == null ? WatchAppProto$UpdateAppInfo.getDefaultInstance() : watchAppProto$UpdateAppInfo;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public WatchAppProto$WatchDeviceInfo getWatchDeviceInfo() {
        WatchAppProto$WatchDeviceInfo watchAppProto$WatchDeviceInfo = this.watchDeviceInfo_;
        return watchAppProto$WatchDeviceInfo == null ? WatchAppProto$WatchDeviceInfo.getDefaultInstance() : watchAppProto$WatchDeviceInfo;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public boolean hasActiveAppListInfo() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public boolean hasAppChangeEvent() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public boolean hasAppInstallStatusInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public boolean hasAppListInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public boolean hasCheckRequest() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public boolean hasCheckResult() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public boolean hasDownloadNewApp() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public boolean hasDownloadSpecialApp() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public boolean hasPrivacyAgreement() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public boolean hasUpdateAppInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBodyOrBuilder
    public boolean hasWatchDeviceInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(WatchAppProto$MsgBody watchAppProto$MsgBody) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$MsgBody);
    }

    public static WatchAppProto$MsgBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$MsgBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$MsgBody parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$MsgBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$MsgBody parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$MsgBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchAppProto$MsgBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$MsgBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$MsgBody parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$MsgBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$MsgBody parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$MsgBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$MsgBody parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$MsgBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$MsgBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$MsgBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$MsgBody parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$MsgBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$MsgBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$MsgBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
