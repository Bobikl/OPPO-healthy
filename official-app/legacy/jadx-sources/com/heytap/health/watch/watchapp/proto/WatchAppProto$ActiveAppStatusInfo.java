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
public final class WatchAppProto$ActiveAppStatusInfo extends GeneratedMessageLite<WatchAppProto$ActiveAppStatusInfo, Builder> implements WatchAppProto$ActiveAppStatusInfoOrBuilder {
    public static final int ACTIVE_STATUS_FIELD_NUMBER = 2;
    public static final int APP_INFO_FIELD_NUMBER = 1;
    private static final WatchAppProto$ActiveAppStatusInfo DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 4;
    public static final int MODEL_FIELD_NUMBER = 5;
    private static volatile Parser<WatchAppProto$ActiveAppStatusInfo> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    private int activeStatus_;
    private WatchAppProto$AppInfo appInfo_;
    private int bitField0_;
    private int from_;
    private int model_;
    private int reason_;

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$ActiveAppStatusInfo, Builder> implements WatchAppProto$ActiveAppStatusInfoOrBuilder {
        public Builder clearActiveStatus() {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).clearActiveStatus();
            return this;
        }

        public Builder clearAppInfo() {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).clearAppInfo();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).clearFrom();
            return this;
        }

        public Builder clearModel() {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).clearModel();
            return this;
        }

        public Builder clearReason() {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).clearReason();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
        public int getActiveStatus() {
            return ((WatchAppProto$ActiveAppStatusInfo) this.instance).getActiveStatus();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
        public WatchAppProto$AppInfo getAppInfo() {
            return ((WatchAppProto$ActiveAppStatusInfo) this.instance).getAppInfo();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
        public WatchAppProto$ActiveAppFrom getFrom() {
            return ((WatchAppProto$ActiveAppStatusInfo) this.instance).getFrom();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
        public int getFromValue() {
            return ((WatchAppProto$ActiveAppStatusInfo) this.instance).getFromValue();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
        public int getModel() {
            return ((WatchAppProto$ActiveAppStatusInfo) this.instance).getModel();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
        public int getReason() {
            return ((WatchAppProto$ActiveAppStatusInfo) this.instance).getReason();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
        public boolean hasAppInfo() {
            return ((WatchAppProto$ActiveAppStatusInfo) this.instance).hasAppInfo();
        }

        public Builder mergeAppInfo(WatchAppProto$AppInfo watchAppProto$AppInfo) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).mergeAppInfo(watchAppProto$AppInfo);
            return this;
        }

        public Builder setActiveStatus(int i) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).setActiveStatus(i);
            return this;
        }

        public Builder setAppInfo(WatchAppProto$AppInfo watchAppProto$AppInfo) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).setAppInfo(watchAppProto$AppInfo);
            return this;
        }

        public Builder setFrom(WatchAppProto$ActiveAppFrom watchAppProto$ActiveAppFrom) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).setFrom(watchAppProto$ActiveAppFrom);
            return this;
        }

        public Builder setFromValue(int i) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).setFromValue(i);
            return this;
        }

        public Builder setModel(int i) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).setModel(i);
            return this;
        }

        public Builder setReason(int i) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).setReason(i);
            return this;
        }

        private Builder() {
            super(WatchAppProto$ActiveAppStatusInfo.DEFAULT_INSTANCE);
        }

        public Builder setAppInfo(WatchAppProto$AppInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusInfo) this.instance).setAppInfo(builder.build());
            return this;
        }
    }

    static {
        WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo = new WatchAppProto$ActiveAppStatusInfo();
        DEFAULT_INSTANCE = watchAppProto$ActiveAppStatusInfo;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$ActiveAppStatusInfo.class, watchAppProto$ActiveAppStatusInfo);
    }

    private WatchAppProto$ActiveAppStatusInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActiveStatus() {
        this.activeStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInfo() {
        this.appInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.model_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static WatchAppProto$ActiveAppStatusInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppInfo(WatchAppProto$AppInfo watchAppProto$AppInfo) {
        watchAppProto$AppInfo.getClass();
        WatchAppProto$AppInfo watchAppProto$AppInfo2 = this.appInfo_;
        if (watchAppProto$AppInfo2 == null || watchAppProto$AppInfo2 == WatchAppProto$AppInfo.getDefaultInstance()) {
            this.appInfo_ = watchAppProto$AppInfo;
        } else {
            this.appInfo_ = WatchAppProto$AppInfo.newBuilder(this.appInfo_).mergeFrom(watchAppProto$AppInfo).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchAppProto$ActiveAppStatusInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$ActiveAppStatusInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$ActiveAppStatusInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$ActiveAppStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$ActiveAppStatusInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveStatus(int i) {
        this.activeStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInfo(WatchAppProto$AppInfo watchAppProto$AppInfo) {
        watchAppProto$AppInfo.getClass();
        this.appInfo_ = watchAppProto$AppInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(WatchAppProto$ActiveAppFrom watchAppProto$ActiveAppFrom) {
        this.from_ = watchAppProto$ActiveAppFrom.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromValue(int i) {
        this.from_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(int i) {
        this.model_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(int i) {
        this.reason_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l8l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchAppProto$ActiveAppStatusInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004\u0003\u0004\u0004\f\u0005\u0004", new Object[]{"bitField0_", "appInfo_", "activeStatus_", "reason_", "from_", "model_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$ActiveAppStatusInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$ActiveAppStatusInfo.class) {
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

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
    public int getActiveStatus() {
        return this.activeStatus_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
    public WatchAppProto$AppInfo getAppInfo() {
        WatchAppProto$AppInfo watchAppProto$AppInfo = this.appInfo_;
        return watchAppProto$AppInfo == null ? WatchAppProto$AppInfo.getDefaultInstance() : watchAppProto$AppInfo;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
    public WatchAppProto$ActiveAppFrom getFrom() {
        WatchAppProto$ActiveAppFrom watchAppProto$ActiveAppFromForNumber = WatchAppProto$ActiveAppFrom.forNumber(this.from_);
        return watchAppProto$ActiveAppFromForNumber == null ? WatchAppProto$ActiveAppFrom.UNRECOGNIZED : watchAppProto$ActiveAppFromForNumber;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
    public int getFromValue() {
        return this.from_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
    public int getModel() {
        return this.model_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
    public int getReason() {
        return this.reason_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusInfoOrBuilder
    public boolean hasAppInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$ActiveAppStatusInfo);
    }

    public static WatchAppProto$ActiveAppStatusInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$ActiveAppStatusInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$ActiveAppStatusInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$ActiveAppStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$ActiveAppStatusInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$ActiveAppStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchAppProto$ActiveAppStatusInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$ActiveAppStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$ActiveAppStatusInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$ActiveAppStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$ActiveAppStatusInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$ActiveAppStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$ActiveAppStatusInfo parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$ActiveAppStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$ActiveAppStatusInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$ActiveAppStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$ActiveAppStatusInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$ActiveAppStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$ActiveAppStatusInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$ActiveAppStatusInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
