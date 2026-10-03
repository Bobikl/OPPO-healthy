package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fze;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class Proto$MessageEnhanceBody extends GeneratedMessageLite<Proto$MessageEnhanceBody, Builder> implements Proto$MessageEnhanceBodyOrBuilder {
    public static final int ALBUM_EVENT_MSG_FIELD_NUMBER = 3;
    public static final int APP_CHANGE_EVENT_MSG_FIELD_NUMBER = 6;
    public static final int ASK_STATUS_MSG_FIELD_NUMBER = 7;
    public static final int ASK_STATUS_RESP_MSG_FIELD_NUMBER = 8;
    public static final int BASE_EVENT_MSG_FIELD_NUMBER = 2;
    private static final Proto$MessageEnhanceBody DEFAULT_INSTANCE;
    public static final int DEVICE_INFO_FIELD_NUMBER = 1;
    public static final int EDIT_CONFIG_REQUEST_FIELD_NUMBER = 14;
    public static final int EDIT_CONFIG_RESPONSE_FIELD_NUMBER = 15;
    public static final int INSTALL_STATUS_RESP_MSG_FIELD_NUMBER = 9;
    public static final int OUTFIT_EVENT_MSG_FIELD_NUMBER = 4;
    private static volatile Parser<Proto$MessageEnhanceBody> PARSER = null;
    public static final int PAY_INFO_FIELD_NUMBER = 13;
    public static final int RESERVED_EXTRA_FIELD_NUMBER = 153;
    public static final int RESOURCE_SYNC_MSG_FIELD_NUMBER = 10;
    public static final int STYLE_SYNC_MSG_FIELD_NUMBER = 11;
    public static final int SYNC_EVENT_MSG_FIELD_NUMBER = 5;
    public static final int SYNC_MODE_FIELD_NUMBER = 12;
    public static final int WIDGET_LIST_RESPONSE_FIELD_NUMBER = 17;
    public static final int WIDGET_LIST_SUPPORT_REQUEST_FIELD_NUMBER = 16;
    private Proto$AlbumEventMessage albumEventMsg_;
    private Proto$AppChangeEventMessage appChangeEventMsg_;
    private Proto$AskStatus askStatusMsg_;
    private Proto$AskStatusResp askStatusRespMsg_;
    private Proto$WfBaseEventMessage baseEventMsg_;
    private int bitField0_;
    private Proto$DeviceInfo deviceInfo_;
    private Proto$WfEditConfigRequest editConfigRequest_;
    private Proto$WfEditConfigMessage editConfigResponse_;
    private Proto$InstallStatusResp installStatusRespMsg_;
    private Proto$OutfitEventMessage outfitEventMsg_;
    private Proto$WfPayInfo payInfo_;
    private String reservedExtra_ = "";
    private Proto$CreationResourceSync resourceSyncMsg_;
    private Proto$CreationStyleSync styleSyncMsg_;
    private Proto$SyncEventMessage syncEventMsg_;
    private Proto$SyncMode syncMode_;
    private Proto$WidgetListSupportResponse widgetListResponse_;
    private Proto$WidgetListSupportRequest widgetListSupportRequest_;

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$MessageEnhanceBody, Builder> implements Proto$MessageEnhanceBodyOrBuilder {
        public Builder clearAlbumEventMsg() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearAlbumEventMsg();
            return this;
        }

        public Builder clearAppChangeEventMsg() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearAppChangeEventMsg();
            return this;
        }

        public Builder clearAskStatusMsg() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearAskStatusMsg();
            return this;
        }

        public Builder clearAskStatusRespMsg() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearAskStatusRespMsg();
            return this;
        }

        public Builder clearBaseEventMsg() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearBaseEventMsg();
            return this;
        }

        public Builder clearDeviceInfo() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearDeviceInfo();
            return this;
        }

        public Builder clearEditConfigRequest() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearEditConfigRequest();
            return this;
        }

        public Builder clearEditConfigResponse() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearEditConfigResponse();
            return this;
        }

        public Builder clearInstallStatusRespMsg() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearInstallStatusRespMsg();
            return this;
        }

        public Builder clearOutfitEventMsg() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearOutfitEventMsg();
            return this;
        }

        public Builder clearPayInfo() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearPayInfo();
            return this;
        }

        public Builder clearReservedExtra() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearReservedExtra();
            return this;
        }

        public Builder clearResourceSyncMsg() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearResourceSyncMsg();
            return this;
        }

        public Builder clearStyleSyncMsg() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearStyleSyncMsg();
            return this;
        }

        public Builder clearSyncEventMsg() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearSyncEventMsg();
            return this;
        }

        public Builder clearSyncMode() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearSyncMode();
            return this;
        }

        public Builder clearWidgetListResponse() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearWidgetListResponse();
            return this;
        }

        public Builder clearWidgetListSupportRequest() {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).clearWidgetListSupportRequest();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$AlbumEventMessage getAlbumEventMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).getAlbumEventMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$AppChangeEventMessage getAppChangeEventMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).getAppChangeEventMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$AskStatus getAskStatusMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).getAskStatusMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$AskStatusResp getAskStatusRespMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).getAskStatusRespMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$WfBaseEventMessage getBaseEventMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).getBaseEventMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$DeviceInfo getDeviceInfo() {
            return ((Proto$MessageEnhanceBody) this.instance).getDeviceInfo();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$WfEditConfigRequest getEditConfigRequest() {
            return ((Proto$MessageEnhanceBody) this.instance).getEditConfigRequest();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$WfEditConfigMessage getEditConfigResponse() {
            return ((Proto$MessageEnhanceBody) this.instance).getEditConfigResponse();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$InstallStatusResp getInstallStatusRespMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).getInstallStatusRespMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$OutfitEventMessage getOutfitEventMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).getOutfitEventMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$WfPayInfo getPayInfo() {
            return ((Proto$MessageEnhanceBody) this.instance).getPayInfo();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public String getReservedExtra() {
            return ((Proto$MessageEnhanceBody) this.instance).getReservedExtra();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public ByteString getReservedExtraBytes() {
            return ((Proto$MessageEnhanceBody) this.instance).getReservedExtraBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$CreationResourceSync getResourceSyncMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).getResourceSyncMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$CreationStyleSync getStyleSyncMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).getStyleSyncMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$SyncEventMessage getSyncEventMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).getSyncEventMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$SyncMode getSyncMode() {
            return ((Proto$MessageEnhanceBody) this.instance).getSyncMode();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$WidgetListSupportResponse getWidgetListResponse() {
            return ((Proto$MessageEnhanceBody) this.instance).getWidgetListResponse();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public Proto$WidgetListSupportRequest getWidgetListSupportRequest() {
            return ((Proto$MessageEnhanceBody) this.instance).getWidgetListSupportRequest();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasAlbumEventMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).hasAlbumEventMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasAppChangeEventMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).hasAppChangeEventMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasAskStatusMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).hasAskStatusMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasAskStatusRespMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).hasAskStatusRespMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasBaseEventMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).hasBaseEventMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasDeviceInfo() {
            return ((Proto$MessageEnhanceBody) this.instance).hasDeviceInfo();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasEditConfigRequest() {
            return ((Proto$MessageEnhanceBody) this.instance).hasEditConfigRequest();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasEditConfigResponse() {
            return ((Proto$MessageEnhanceBody) this.instance).hasEditConfigResponse();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasInstallStatusRespMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).hasInstallStatusRespMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasOutfitEventMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).hasOutfitEventMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasPayInfo() {
            return ((Proto$MessageEnhanceBody) this.instance).hasPayInfo();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasResourceSyncMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).hasResourceSyncMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasStyleSyncMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).hasStyleSyncMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasSyncEventMsg() {
            return ((Proto$MessageEnhanceBody) this.instance).hasSyncEventMsg();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasSyncMode() {
            return ((Proto$MessageEnhanceBody) this.instance).hasSyncMode();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasWidgetListResponse() {
            return ((Proto$MessageEnhanceBody) this.instance).hasWidgetListResponse();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
        public boolean hasWidgetListSupportRequest() {
            return ((Proto$MessageEnhanceBody) this.instance).hasWidgetListSupportRequest();
        }

        public Builder mergeAlbumEventMsg(Proto$AlbumEventMessage proto$AlbumEventMessage) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeAlbumEventMsg(proto$AlbumEventMessage);
            return this;
        }

        public Builder mergeAppChangeEventMsg(Proto$AppChangeEventMessage proto$AppChangeEventMessage) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeAppChangeEventMsg(proto$AppChangeEventMessage);
            return this;
        }

        public Builder mergeAskStatusMsg(Proto$AskStatus proto$AskStatus) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeAskStatusMsg(proto$AskStatus);
            return this;
        }

        public Builder mergeAskStatusRespMsg(Proto$AskStatusResp proto$AskStatusResp) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeAskStatusRespMsg(proto$AskStatusResp);
            return this;
        }

        public Builder mergeBaseEventMsg(Proto$WfBaseEventMessage proto$WfBaseEventMessage) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeBaseEventMsg(proto$WfBaseEventMessage);
            return this;
        }

        public Builder mergeDeviceInfo(Proto$DeviceInfo proto$DeviceInfo) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeDeviceInfo(proto$DeviceInfo);
            return this;
        }

        public Builder mergeEditConfigRequest(Proto$WfEditConfigRequest proto$WfEditConfigRequest) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeEditConfigRequest(proto$WfEditConfigRequest);
            return this;
        }

        public Builder mergeEditConfigResponse(Proto$WfEditConfigMessage proto$WfEditConfigMessage) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeEditConfigResponse(proto$WfEditConfigMessage);
            return this;
        }

        public Builder mergeInstallStatusRespMsg(Proto$InstallStatusResp proto$InstallStatusResp) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeInstallStatusRespMsg(proto$InstallStatusResp);
            return this;
        }

        public Builder mergeOutfitEventMsg(Proto$OutfitEventMessage proto$OutfitEventMessage) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeOutfitEventMsg(proto$OutfitEventMessage);
            return this;
        }

        public Builder mergePayInfo(Proto$WfPayInfo proto$WfPayInfo) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergePayInfo(proto$WfPayInfo);
            return this;
        }

        public Builder mergeResourceSyncMsg(Proto$CreationResourceSync proto$CreationResourceSync) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeResourceSyncMsg(proto$CreationResourceSync);
            return this;
        }

        public Builder mergeStyleSyncMsg(Proto$CreationStyleSync proto$CreationStyleSync) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeStyleSyncMsg(proto$CreationStyleSync);
            return this;
        }

        public Builder mergeSyncEventMsg(Proto$SyncEventMessage proto$SyncEventMessage) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeSyncEventMsg(proto$SyncEventMessage);
            return this;
        }

        public Builder mergeSyncMode(Proto$SyncMode proto$SyncMode) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeSyncMode(proto$SyncMode);
            return this;
        }

        public Builder mergeWidgetListResponse(Proto$WidgetListSupportResponse proto$WidgetListSupportResponse) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeWidgetListResponse(proto$WidgetListSupportResponse);
            return this;
        }

        public Builder mergeWidgetListSupportRequest(Proto$WidgetListSupportRequest proto$WidgetListSupportRequest) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).mergeWidgetListSupportRequest(proto$WidgetListSupportRequest);
            return this;
        }

        public Builder setAlbumEventMsg(Proto$AlbumEventMessage proto$AlbumEventMessage) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setAlbumEventMsg(proto$AlbumEventMessage);
            return this;
        }

        public Builder setAppChangeEventMsg(Proto$AppChangeEventMessage proto$AppChangeEventMessage) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setAppChangeEventMsg(proto$AppChangeEventMessage);
            return this;
        }

        public Builder setAskStatusMsg(Proto$AskStatus proto$AskStatus) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setAskStatusMsg(proto$AskStatus);
            return this;
        }

        public Builder setAskStatusRespMsg(Proto$AskStatusResp proto$AskStatusResp) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setAskStatusRespMsg(proto$AskStatusResp);
            return this;
        }

        public Builder setBaseEventMsg(Proto$WfBaseEventMessage proto$WfBaseEventMessage) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setBaseEventMsg(proto$WfBaseEventMessage);
            return this;
        }

        public Builder setDeviceInfo(Proto$DeviceInfo proto$DeviceInfo) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setDeviceInfo(proto$DeviceInfo);
            return this;
        }

        public Builder setEditConfigRequest(Proto$WfEditConfigRequest proto$WfEditConfigRequest) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setEditConfigRequest(proto$WfEditConfigRequest);
            return this;
        }

        public Builder setEditConfigResponse(Proto$WfEditConfigMessage proto$WfEditConfigMessage) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setEditConfigResponse(proto$WfEditConfigMessage);
            return this;
        }

        public Builder setInstallStatusRespMsg(Proto$InstallStatusResp proto$InstallStatusResp) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setInstallStatusRespMsg(proto$InstallStatusResp);
            return this;
        }

        public Builder setOutfitEventMsg(Proto$OutfitEventMessage proto$OutfitEventMessage) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setOutfitEventMsg(proto$OutfitEventMessage);
            return this;
        }

        public Builder setPayInfo(Proto$WfPayInfo proto$WfPayInfo) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setPayInfo(proto$WfPayInfo);
            return this;
        }

        public Builder setReservedExtra(String str) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setReservedExtra(str);
            return this;
        }

        public Builder setReservedExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setReservedExtraBytes(byteString);
            return this;
        }

        public Builder setResourceSyncMsg(Proto$CreationResourceSync proto$CreationResourceSync) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setResourceSyncMsg(proto$CreationResourceSync);
            return this;
        }

        public Builder setStyleSyncMsg(Proto$CreationStyleSync proto$CreationStyleSync) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setStyleSyncMsg(proto$CreationStyleSync);
            return this;
        }

        public Builder setSyncEventMsg(Proto$SyncEventMessage proto$SyncEventMessage) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setSyncEventMsg(proto$SyncEventMessage);
            return this;
        }

        public Builder setSyncMode(Proto$SyncMode proto$SyncMode) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setSyncMode(proto$SyncMode);
            return this;
        }

        public Builder setWidgetListResponse(Proto$WidgetListSupportResponse proto$WidgetListSupportResponse) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setWidgetListResponse(proto$WidgetListSupportResponse);
            return this;
        }

        public Builder setWidgetListSupportRequest(Proto$WidgetListSupportRequest proto$WidgetListSupportRequest) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setWidgetListSupportRequest(proto$WidgetListSupportRequest);
            return this;
        }

        private Builder() {
            super(Proto$MessageEnhanceBody.DEFAULT_INSTANCE);
        }

        public Builder setAlbumEventMsg(Proto$AlbumEventMessage.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setAlbumEventMsg(builder.build());
            return this;
        }

        public Builder setAppChangeEventMsg(Proto$AppChangeEventMessage.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setAppChangeEventMsg(builder.build());
            return this;
        }

        public Builder setAskStatusMsg(Proto$AskStatus.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setAskStatusMsg(builder.build());
            return this;
        }

        public Builder setAskStatusRespMsg(Proto$AskStatusResp.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setAskStatusRespMsg(builder.build());
            return this;
        }

        public Builder setBaseEventMsg(Proto$WfBaseEventMessage.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setBaseEventMsg(builder.build());
            return this;
        }

        public Builder setDeviceInfo(Proto$DeviceInfo.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setDeviceInfo(builder.build());
            return this;
        }

        public Builder setEditConfigRequest(Proto$WfEditConfigRequest.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setEditConfigRequest(builder.build());
            return this;
        }

        public Builder setEditConfigResponse(Proto$WfEditConfigMessage.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setEditConfigResponse(builder.build());
            return this;
        }

        public Builder setInstallStatusRespMsg(Proto$InstallStatusResp.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setInstallStatusRespMsg(builder.build());
            return this;
        }

        public Builder setOutfitEventMsg(Proto$OutfitEventMessage.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setOutfitEventMsg(builder.build());
            return this;
        }

        public Builder setPayInfo(Proto$WfPayInfo.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setPayInfo(builder.build());
            return this;
        }

        public Builder setResourceSyncMsg(Proto$CreationResourceSync.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setResourceSyncMsg(builder.build());
            return this;
        }

        public Builder setStyleSyncMsg(Proto$CreationStyleSync.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setStyleSyncMsg(builder.build());
            return this;
        }

        public Builder setSyncEventMsg(Proto$SyncEventMessage.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setSyncEventMsg(builder.build());
            return this;
        }

        public Builder setSyncMode(Proto$SyncMode.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setSyncMode(builder.build());
            return this;
        }

        public Builder setWidgetListResponse(Proto$WidgetListSupportResponse.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setWidgetListResponse(builder.build());
            return this;
        }

        public Builder setWidgetListSupportRequest(Proto$WidgetListSupportRequest.Builder builder) {
            copyOnWrite();
            ((Proto$MessageEnhanceBody) this.instance).setWidgetListSupportRequest(builder.build());
            return this;
        }
    }

    static {
        Proto$MessageEnhanceBody proto$MessageEnhanceBody = new Proto$MessageEnhanceBody();
        DEFAULT_INSTANCE = proto$MessageEnhanceBody;
        GeneratedMessageLite.registerDefaultInstance(Proto$MessageEnhanceBody.class, proto$MessageEnhanceBody);
    }

    private Proto$MessageEnhanceBody() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlbumEventMsg() {
        this.albumEventMsg_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppChangeEventMsg() {
        this.appChangeEventMsg_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAskStatusMsg() {
        this.askStatusMsg_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAskStatusRespMsg() {
        this.askStatusRespMsg_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseEventMsg() {
        this.baseEventMsg_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceInfo() {
        this.deviceInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditConfigRequest() {
        this.editConfigRequest_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditConfigResponse() {
        this.editConfigResponse_ = null;
        this.bitField0_ &= -16385;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstallStatusRespMsg() {
        this.installStatusRespMsg_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutfitEventMsg() {
        this.outfitEventMsg_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayInfo() {
        this.payInfo_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservedExtra() {
        this.reservedExtra_ = getDefaultInstance().getReservedExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceSyncMsg() {
        this.resourceSyncMsg_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyleSyncMsg() {
        this.styleSyncMsg_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncEventMsg() {
        this.syncEventMsg_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncMode() {
        this.syncMode_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidgetListResponse() {
        this.widgetListResponse_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidgetListSupportRequest() {
        this.widgetListSupportRequest_ = null;
        this.bitField0_ &= -32769;
    }

    public static Proto$MessageEnhanceBody getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlbumEventMsg(Proto$AlbumEventMessage proto$AlbumEventMessage) {
        proto$AlbumEventMessage.getClass();
        Proto$AlbumEventMessage proto$AlbumEventMessage2 = this.albumEventMsg_;
        if (proto$AlbumEventMessage2 == null || proto$AlbumEventMessage2 == Proto$AlbumEventMessage.getDefaultInstance()) {
            this.albumEventMsg_ = proto$AlbumEventMessage;
        } else {
            this.albumEventMsg_ = Proto$AlbumEventMessage.newBuilder(this.albumEventMsg_).mergeFrom(proto$AlbumEventMessage).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppChangeEventMsg(Proto$AppChangeEventMessage proto$AppChangeEventMessage) {
        proto$AppChangeEventMessage.getClass();
        Proto$AppChangeEventMessage proto$AppChangeEventMessage2 = this.appChangeEventMsg_;
        if (proto$AppChangeEventMessage2 == null || proto$AppChangeEventMessage2 == Proto$AppChangeEventMessage.getDefaultInstance()) {
            this.appChangeEventMsg_ = proto$AppChangeEventMessage;
        } else {
            this.appChangeEventMsg_ = Proto$AppChangeEventMessage.newBuilder(this.appChangeEventMsg_).mergeFrom(proto$AppChangeEventMessage).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAskStatusMsg(Proto$AskStatus proto$AskStatus) {
        proto$AskStatus.getClass();
        Proto$AskStatus proto$AskStatus2 = this.askStatusMsg_;
        if (proto$AskStatus2 == null || proto$AskStatus2 == Proto$AskStatus.getDefaultInstance()) {
            this.askStatusMsg_ = proto$AskStatus;
        } else {
            this.askStatusMsg_ = Proto$AskStatus.newBuilder(this.askStatusMsg_).mergeFrom(proto$AskStatus).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAskStatusRespMsg(Proto$AskStatusResp proto$AskStatusResp) {
        proto$AskStatusResp.getClass();
        Proto$AskStatusResp proto$AskStatusResp2 = this.askStatusRespMsg_;
        if (proto$AskStatusResp2 == null || proto$AskStatusResp2 == Proto$AskStatusResp.getDefaultInstance()) {
            this.askStatusRespMsg_ = proto$AskStatusResp;
        } else {
            this.askStatusRespMsg_ = Proto$AskStatusResp.newBuilder(this.askStatusRespMsg_).mergeFrom(proto$AskStatusResp).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBaseEventMsg(Proto$WfBaseEventMessage proto$WfBaseEventMessage) {
        proto$WfBaseEventMessage.getClass();
        Proto$WfBaseEventMessage proto$WfBaseEventMessage2 = this.baseEventMsg_;
        if (proto$WfBaseEventMessage2 == null || proto$WfBaseEventMessage2 == Proto$WfBaseEventMessage.getDefaultInstance()) {
            this.baseEventMsg_ = proto$WfBaseEventMessage;
        } else {
            this.baseEventMsg_ = Proto$WfBaseEventMessage.newBuilder(this.baseEventMsg_).mergeFrom(proto$WfBaseEventMessage).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceInfo(Proto$DeviceInfo proto$DeviceInfo) {
        proto$DeviceInfo.getClass();
        Proto$DeviceInfo proto$DeviceInfo2 = this.deviceInfo_;
        if (proto$DeviceInfo2 == null || proto$DeviceInfo2 == Proto$DeviceInfo.getDefaultInstance()) {
            this.deviceInfo_ = proto$DeviceInfo;
        } else {
            this.deviceInfo_ = Proto$DeviceInfo.newBuilder(this.deviceInfo_).mergeFrom(proto$DeviceInfo).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEditConfigRequest(Proto$WfEditConfigRequest proto$WfEditConfigRequest) {
        proto$WfEditConfigRequest.getClass();
        Proto$WfEditConfigRequest proto$WfEditConfigRequest2 = this.editConfigRequest_;
        if (proto$WfEditConfigRequest2 == null || proto$WfEditConfigRequest2 == Proto$WfEditConfigRequest.getDefaultInstance()) {
            this.editConfigRequest_ = proto$WfEditConfigRequest;
        } else {
            this.editConfigRequest_ = Proto$WfEditConfigRequest.newBuilder(this.editConfigRequest_).mergeFrom(proto$WfEditConfigRequest).buildPartial();
        }
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEditConfigResponse(Proto$WfEditConfigMessage proto$WfEditConfigMessage) {
        proto$WfEditConfigMessage.getClass();
        Proto$WfEditConfigMessage proto$WfEditConfigMessage2 = this.editConfigResponse_;
        if (proto$WfEditConfigMessage2 == null || proto$WfEditConfigMessage2 == Proto$WfEditConfigMessage.getDefaultInstance()) {
            this.editConfigResponse_ = proto$WfEditConfigMessage;
        } else {
            this.editConfigResponse_ = Proto$WfEditConfigMessage.newBuilder(this.editConfigResponse_).mergeFrom(proto$WfEditConfigMessage).buildPartial();
        }
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInstallStatusRespMsg(Proto$InstallStatusResp proto$InstallStatusResp) {
        proto$InstallStatusResp.getClass();
        Proto$InstallStatusResp proto$InstallStatusResp2 = this.installStatusRespMsg_;
        if (proto$InstallStatusResp2 == null || proto$InstallStatusResp2 == Proto$InstallStatusResp.getDefaultInstance()) {
            this.installStatusRespMsg_ = proto$InstallStatusResp;
        } else {
            this.installStatusRespMsg_ = Proto$InstallStatusResp.newBuilder(this.installStatusRespMsg_).mergeFrom(proto$InstallStatusResp).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOutfitEventMsg(Proto$OutfitEventMessage proto$OutfitEventMessage) {
        proto$OutfitEventMessage.getClass();
        Proto$OutfitEventMessage proto$OutfitEventMessage2 = this.outfitEventMsg_;
        if (proto$OutfitEventMessage2 == null || proto$OutfitEventMessage2 == Proto$OutfitEventMessage.getDefaultInstance()) {
            this.outfitEventMsg_ = proto$OutfitEventMessage;
        } else {
            this.outfitEventMsg_ = Proto$OutfitEventMessage.newBuilder(this.outfitEventMsg_).mergeFrom(proto$OutfitEventMessage).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePayInfo(Proto$WfPayInfo proto$WfPayInfo) {
        proto$WfPayInfo.getClass();
        Proto$WfPayInfo proto$WfPayInfo2 = this.payInfo_;
        if (proto$WfPayInfo2 == null || proto$WfPayInfo2 == Proto$WfPayInfo.getDefaultInstance()) {
            this.payInfo_ = proto$WfPayInfo;
        } else {
            this.payInfo_ = Proto$WfPayInfo.newBuilder(this.payInfo_).mergeFrom(proto$WfPayInfo).buildPartial();
        }
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResourceSyncMsg(Proto$CreationResourceSync proto$CreationResourceSync) {
        proto$CreationResourceSync.getClass();
        Proto$CreationResourceSync proto$CreationResourceSync2 = this.resourceSyncMsg_;
        if (proto$CreationResourceSync2 == null || proto$CreationResourceSync2 == Proto$CreationResourceSync.getDefaultInstance()) {
            this.resourceSyncMsg_ = proto$CreationResourceSync;
        } else {
            this.resourceSyncMsg_ = Proto$CreationResourceSync.newBuilder(this.resourceSyncMsg_).mergeFrom(proto$CreationResourceSync).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStyleSyncMsg(Proto$CreationStyleSync proto$CreationStyleSync) {
        proto$CreationStyleSync.getClass();
        Proto$CreationStyleSync proto$CreationStyleSync2 = this.styleSyncMsg_;
        if (proto$CreationStyleSync2 == null || proto$CreationStyleSync2 == Proto$CreationStyleSync.getDefaultInstance()) {
            this.styleSyncMsg_ = proto$CreationStyleSync;
        } else {
            this.styleSyncMsg_ = Proto$CreationStyleSync.newBuilder(this.styleSyncMsg_).mergeFrom(proto$CreationStyleSync).buildPartial();
        }
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSyncEventMsg(Proto$SyncEventMessage proto$SyncEventMessage) {
        proto$SyncEventMessage.getClass();
        Proto$SyncEventMessage proto$SyncEventMessage2 = this.syncEventMsg_;
        if (proto$SyncEventMessage2 == null || proto$SyncEventMessage2 == Proto$SyncEventMessage.getDefaultInstance()) {
            this.syncEventMsg_ = proto$SyncEventMessage;
        } else {
            this.syncEventMsg_ = Proto$SyncEventMessage.newBuilder(this.syncEventMsg_).mergeFrom(proto$SyncEventMessage).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSyncMode(Proto$SyncMode proto$SyncMode) {
        proto$SyncMode.getClass();
        Proto$SyncMode proto$SyncMode2 = this.syncMode_;
        if (proto$SyncMode2 == null || proto$SyncMode2 == Proto$SyncMode.getDefaultInstance()) {
            this.syncMode_ = proto$SyncMode;
        } else {
            this.syncMode_ = Proto$SyncMode.newBuilder(this.syncMode_).mergeFrom(proto$SyncMode).buildPartial();
        }
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWidgetListResponse(Proto$WidgetListSupportResponse proto$WidgetListSupportResponse) {
        proto$WidgetListSupportResponse.getClass();
        Proto$WidgetListSupportResponse proto$WidgetListSupportResponse2 = this.widgetListResponse_;
        if (proto$WidgetListSupportResponse2 == null || proto$WidgetListSupportResponse2 == Proto$WidgetListSupportResponse.getDefaultInstance()) {
            this.widgetListResponse_ = proto$WidgetListSupportResponse;
        } else {
            this.widgetListResponse_ = Proto$WidgetListSupportResponse.newBuilder(this.widgetListResponse_).mergeFrom(proto$WidgetListSupportResponse).buildPartial();
        }
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWidgetListSupportRequest(Proto$WidgetListSupportRequest proto$WidgetListSupportRequest) {
        proto$WidgetListSupportRequest.getClass();
        Proto$WidgetListSupportRequest proto$WidgetListSupportRequest2 = this.widgetListSupportRequest_;
        if (proto$WidgetListSupportRequest2 == null || proto$WidgetListSupportRequest2 == Proto$WidgetListSupportRequest.getDefaultInstance()) {
            this.widgetListSupportRequest_ = proto$WidgetListSupportRequest;
        } else {
            this.widgetListSupportRequest_ = Proto$WidgetListSupportRequest.newBuilder(this.widgetListSupportRequest_).mergeFrom(proto$WidgetListSupportRequest).buildPartial();
        }
        this.bitField0_ |= 32768;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$MessageEnhanceBody parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$MessageEnhanceBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$MessageEnhanceBody parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$MessageEnhanceBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$MessageEnhanceBody> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlbumEventMsg(Proto$AlbumEventMessage proto$AlbumEventMessage) {
        proto$AlbumEventMessage.getClass();
        this.albumEventMsg_ = proto$AlbumEventMessage;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppChangeEventMsg(Proto$AppChangeEventMessage proto$AppChangeEventMessage) {
        proto$AppChangeEventMessage.getClass();
        this.appChangeEventMsg_ = proto$AppChangeEventMessage;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAskStatusMsg(Proto$AskStatus proto$AskStatus) {
        proto$AskStatus.getClass();
        this.askStatusMsg_ = proto$AskStatus;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAskStatusRespMsg(Proto$AskStatusResp proto$AskStatusResp) {
        proto$AskStatusResp.getClass();
        this.askStatusRespMsg_ = proto$AskStatusResp;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseEventMsg(Proto$WfBaseEventMessage proto$WfBaseEventMessage) {
        proto$WfBaseEventMessage.getClass();
        this.baseEventMsg_ = proto$WfBaseEventMessage;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceInfo(Proto$DeviceInfo proto$DeviceInfo) {
        proto$DeviceInfo.getClass();
        this.deviceInfo_ = proto$DeviceInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditConfigRequest(Proto$WfEditConfigRequest proto$WfEditConfigRequest) {
        proto$WfEditConfigRequest.getClass();
        this.editConfigRequest_ = proto$WfEditConfigRequest;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditConfigResponse(Proto$WfEditConfigMessage proto$WfEditConfigMessage) {
        proto$WfEditConfigMessage.getClass();
        this.editConfigResponse_ = proto$WfEditConfigMessage;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallStatusRespMsg(Proto$InstallStatusResp proto$InstallStatusResp) {
        proto$InstallStatusResp.getClass();
        this.installStatusRespMsg_ = proto$InstallStatusResp;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutfitEventMsg(Proto$OutfitEventMessage proto$OutfitEventMessage) {
        proto$OutfitEventMessage.getClass();
        this.outfitEventMsg_ = proto$OutfitEventMessage;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayInfo(Proto$WfPayInfo proto$WfPayInfo) {
        proto$WfPayInfo.getClass();
        this.payInfo_ = proto$WfPayInfo;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedExtra(String str) {
        str.getClass();
        this.reservedExtra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reservedExtra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceSyncMsg(Proto$CreationResourceSync proto$CreationResourceSync) {
        proto$CreationResourceSync.getClass();
        this.resourceSyncMsg_ = proto$CreationResourceSync;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleSyncMsg(Proto$CreationStyleSync proto$CreationStyleSync) {
        proto$CreationStyleSync.getClass();
        this.styleSyncMsg_ = proto$CreationStyleSync;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncEventMsg(Proto$SyncEventMessage proto$SyncEventMessage) {
        proto$SyncEventMessage.getClass();
        this.syncEventMsg_ = proto$SyncEventMessage;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncMode(Proto$SyncMode proto$SyncMode) {
        proto$SyncMode.getClass();
        this.syncMode_ = proto$SyncMode;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidgetListResponse(Proto$WidgetListSupportResponse proto$WidgetListSupportResponse) {
        proto$WidgetListSupportResponse.getClass();
        this.widgetListResponse_ = proto$WidgetListSupportResponse;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidgetListSupportRequest(Proto$WidgetListSupportRequest proto$WidgetListSupportRequest) {
        proto$WidgetListSupportRequest.getClass();
        this.widgetListSupportRequest_ = proto$WidgetListSupportRequest;
        this.bitField0_ |= 32768;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (fze.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Proto$MessageEnhanceBody();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0001\u0001\u0099\u0012\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0099Ȉ", new Object[]{"bitField0_", "deviceInfo_", "baseEventMsg_", "albumEventMsg_", "outfitEventMsg_", "syncEventMsg_", "appChangeEventMsg_", "askStatusMsg_", "askStatusRespMsg_", "installStatusRespMsg_", "resourceSyncMsg_", "styleSyncMsg_", "syncMode_", "payInfo_", "editConfigRequest_", "editConfigResponse_", "widgetListSupportRequest_", "widgetListResponse_", "reservedExtra_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$MessageEnhanceBody> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$MessageEnhanceBody.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$AlbumEventMessage getAlbumEventMsg() {
        Proto$AlbumEventMessage proto$AlbumEventMessage = this.albumEventMsg_;
        return proto$AlbumEventMessage == null ? Proto$AlbumEventMessage.getDefaultInstance() : proto$AlbumEventMessage;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$AppChangeEventMessage getAppChangeEventMsg() {
        Proto$AppChangeEventMessage proto$AppChangeEventMessage = this.appChangeEventMsg_;
        return proto$AppChangeEventMessage == null ? Proto$AppChangeEventMessage.getDefaultInstance() : proto$AppChangeEventMessage;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$AskStatus getAskStatusMsg() {
        Proto$AskStatus proto$AskStatus = this.askStatusMsg_;
        return proto$AskStatus == null ? Proto$AskStatus.getDefaultInstance() : proto$AskStatus;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$AskStatusResp getAskStatusRespMsg() {
        Proto$AskStatusResp proto$AskStatusResp = this.askStatusRespMsg_;
        return proto$AskStatusResp == null ? Proto$AskStatusResp.getDefaultInstance() : proto$AskStatusResp;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$WfBaseEventMessage getBaseEventMsg() {
        Proto$WfBaseEventMessage proto$WfBaseEventMessage = this.baseEventMsg_;
        return proto$WfBaseEventMessage == null ? Proto$WfBaseEventMessage.getDefaultInstance() : proto$WfBaseEventMessage;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$DeviceInfo getDeviceInfo() {
        Proto$DeviceInfo proto$DeviceInfo = this.deviceInfo_;
        return proto$DeviceInfo == null ? Proto$DeviceInfo.getDefaultInstance() : proto$DeviceInfo;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$WfEditConfigRequest getEditConfigRequest() {
        Proto$WfEditConfigRequest proto$WfEditConfigRequest = this.editConfigRequest_;
        return proto$WfEditConfigRequest == null ? Proto$WfEditConfigRequest.getDefaultInstance() : proto$WfEditConfigRequest;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$WfEditConfigMessage getEditConfigResponse() {
        Proto$WfEditConfigMessage proto$WfEditConfigMessage = this.editConfigResponse_;
        return proto$WfEditConfigMessage == null ? Proto$WfEditConfigMessage.getDefaultInstance() : proto$WfEditConfigMessage;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$InstallStatusResp getInstallStatusRespMsg() {
        Proto$InstallStatusResp proto$InstallStatusResp = this.installStatusRespMsg_;
        return proto$InstallStatusResp == null ? Proto$InstallStatusResp.getDefaultInstance() : proto$InstallStatusResp;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$OutfitEventMessage getOutfitEventMsg() {
        Proto$OutfitEventMessage proto$OutfitEventMessage = this.outfitEventMsg_;
        return proto$OutfitEventMessage == null ? Proto$OutfitEventMessage.getDefaultInstance() : proto$OutfitEventMessage;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$WfPayInfo getPayInfo() {
        Proto$WfPayInfo proto$WfPayInfo = this.payInfo_;
        return proto$WfPayInfo == null ? Proto$WfPayInfo.getDefaultInstance() : proto$WfPayInfo;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public String getReservedExtra() {
        return this.reservedExtra_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public ByteString getReservedExtraBytes() {
        return ByteString.copyFromUtf8(this.reservedExtra_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$CreationResourceSync getResourceSyncMsg() {
        Proto$CreationResourceSync proto$CreationResourceSync = this.resourceSyncMsg_;
        return proto$CreationResourceSync == null ? Proto$CreationResourceSync.getDefaultInstance() : proto$CreationResourceSync;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$CreationStyleSync getStyleSyncMsg() {
        Proto$CreationStyleSync proto$CreationStyleSync = this.styleSyncMsg_;
        return proto$CreationStyleSync == null ? Proto$CreationStyleSync.getDefaultInstance() : proto$CreationStyleSync;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$SyncEventMessage getSyncEventMsg() {
        Proto$SyncEventMessage proto$SyncEventMessage = this.syncEventMsg_;
        return proto$SyncEventMessage == null ? Proto$SyncEventMessage.getDefaultInstance() : proto$SyncEventMessage;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$SyncMode getSyncMode() {
        Proto$SyncMode proto$SyncMode = this.syncMode_;
        return proto$SyncMode == null ? Proto$SyncMode.getDefaultInstance() : proto$SyncMode;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$WidgetListSupportResponse getWidgetListResponse() {
        Proto$WidgetListSupportResponse proto$WidgetListSupportResponse = this.widgetListResponse_;
        return proto$WidgetListSupportResponse == null ? Proto$WidgetListSupportResponse.getDefaultInstance() : proto$WidgetListSupportResponse;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public Proto$WidgetListSupportRequest getWidgetListSupportRequest() {
        Proto$WidgetListSupportRequest proto$WidgetListSupportRequest = this.widgetListSupportRequest_;
        return proto$WidgetListSupportRequest == null ? Proto$WidgetListSupportRequest.getDefaultInstance() : proto$WidgetListSupportRequest;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasAlbumEventMsg() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasAppChangeEventMsg() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasAskStatusMsg() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasAskStatusRespMsg() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasBaseEventMsg() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasDeviceInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasEditConfigRequest() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasEditConfigResponse() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasInstallStatusRespMsg() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasOutfitEventMsg() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasPayInfo() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasResourceSyncMsg() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasStyleSyncMsg() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasSyncEventMsg() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasSyncMode() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasWidgetListResponse() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBodyOrBuilder
    public boolean hasWidgetListSupportRequest() {
        return (this.bitField0_ & 32768) != 0;
    }

    public static Builder newBuilder(Proto$MessageEnhanceBody proto$MessageEnhanceBody) {
        return DEFAULT_INSTANCE.createBuilder(proto$MessageEnhanceBody);
    }

    public static Proto$MessageEnhanceBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$MessageEnhanceBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$MessageEnhanceBody parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$MessageEnhanceBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$MessageEnhanceBody parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$MessageEnhanceBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$MessageEnhanceBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$MessageEnhanceBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$MessageEnhanceBody parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$MessageEnhanceBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$MessageEnhanceBody parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$MessageEnhanceBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$MessageEnhanceBody parseFrom(InputStream inputStream) throws IOException {
        return (Proto$MessageEnhanceBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$MessageEnhanceBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$MessageEnhanceBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$MessageEnhanceBody parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$MessageEnhanceBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$MessageEnhanceBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$MessageEnhanceBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
