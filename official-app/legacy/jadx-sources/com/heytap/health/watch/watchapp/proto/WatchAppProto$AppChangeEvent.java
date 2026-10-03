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
public final class WatchAppProto$AppChangeEvent extends GeneratedMessageLite<WatchAppProto$AppChangeEvent, Builder> implements WatchAppProto$AppChangeEventOrBuilder {
    public static final int APP_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int APP_INFO_FIELD_NUMBER = 2;
    private static final WatchAppProto$AppChangeEvent DEFAULT_INSTANCE;
    private static volatile Parser<WatchAppProto$AppChangeEvent> PARSER;
    private int appChangeType_;
    private WatchAppProto$AppInfo appInfo_;
    private int bitField0_;

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$AppChangeEvent, Builder> implements WatchAppProto$AppChangeEventOrBuilder {
        public Builder clearAppChangeType() {
            copyOnWrite();
            ((WatchAppProto$AppChangeEvent) this.instance).clearAppChangeType();
            return this;
        }

        public Builder clearAppInfo() {
            copyOnWrite();
            ((WatchAppProto$AppChangeEvent) this.instance).clearAppInfo();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppChangeEventOrBuilder
        public WatchAppProto$AppChangeType getAppChangeType() {
            return ((WatchAppProto$AppChangeEvent) this.instance).getAppChangeType();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppChangeEventOrBuilder
        public int getAppChangeTypeValue() {
            return ((WatchAppProto$AppChangeEvent) this.instance).getAppChangeTypeValue();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppChangeEventOrBuilder
        public WatchAppProto$AppInfo getAppInfo() {
            return ((WatchAppProto$AppChangeEvent) this.instance).getAppInfo();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppChangeEventOrBuilder
        public boolean hasAppInfo() {
            return ((WatchAppProto$AppChangeEvent) this.instance).hasAppInfo();
        }

        public Builder mergeAppInfo(WatchAppProto$AppInfo watchAppProto$AppInfo) {
            copyOnWrite();
            ((WatchAppProto$AppChangeEvent) this.instance).mergeAppInfo(watchAppProto$AppInfo);
            return this;
        }

        public Builder setAppChangeType(WatchAppProto$AppChangeType watchAppProto$AppChangeType) {
            copyOnWrite();
            ((WatchAppProto$AppChangeEvent) this.instance).setAppChangeType(watchAppProto$AppChangeType);
            return this;
        }

        public Builder setAppChangeTypeValue(int i) {
            copyOnWrite();
            ((WatchAppProto$AppChangeEvent) this.instance).setAppChangeTypeValue(i);
            return this;
        }

        public Builder setAppInfo(WatchAppProto$AppInfo watchAppProto$AppInfo) {
            copyOnWrite();
            ((WatchAppProto$AppChangeEvent) this.instance).setAppInfo(watchAppProto$AppInfo);
            return this;
        }

        private Builder() {
            super(WatchAppProto$AppChangeEvent.DEFAULT_INSTANCE);
        }

        public Builder setAppInfo(WatchAppProto$AppInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$AppChangeEvent) this.instance).setAppInfo(builder.build());
            return this;
        }
    }

    static {
        WatchAppProto$AppChangeEvent watchAppProto$AppChangeEvent = new WatchAppProto$AppChangeEvent();
        DEFAULT_INSTANCE = watchAppProto$AppChangeEvent;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$AppChangeEvent.class, watchAppProto$AppChangeEvent);
    }

    private WatchAppProto$AppChangeEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppChangeType() {
        this.appChangeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInfo() {
        this.appInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static WatchAppProto$AppChangeEvent getDefaultInstance() {
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

    public static WatchAppProto$AppChangeEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$AppChangeEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$AppChangeEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppChangeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$AppChangeEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppChangeType(WatchAppProto$AppChangeType watchAppProto$AppChangeType) {
        this.appChangeType_ = watchAppProto$AppChangeType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppChangeTypeValue(int i) {
        this.appChangeType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInfo(WatchAppProto$AppInfo watchAppProto$AppInfo) {
        watchAppProto$AppInfo.getClass();
        this.appInfo_ = watchAppProto$AppInfo;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l8l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchAppProto$AppChangeEvent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "appChangeType_", "appInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$AppChangeEvent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$AppChangeEvent.class) {
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

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppChangeEventOrBuilder
    public WatchAppProto$AppChangeType getAppChangeType() {
        WatchAppProto$AppChangeType watchAppProto$AppChangeTypeForNumber = WatchAppProto$AppChangeType.forNumber(this.appChangeType_);
        return watchAppProto$AppChangeTypeForNumber == null ? WatchAppProto$AppChangeType.UNRECOGNIZED : watchAppProto$AppChangeTypeForNumber;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppChangeEventOrBuilder
    public int getAppChangeTypeValue() {
        return this.appChangeType_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppChangeEventOrBuilder
    public WatchAppProto$AppInfo getAppInfo() {
        WatchAppProto$AppInfo watchAppProto$AppInfo = this.appInfo_;
        return watchAppProto$AppInfo == null ? WatchAppProto$AppInfo.getDefaultInstance() : watchAppProto$AppInfo;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppChangeEventOrBuilder
    public boolean hasAppInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(WatchAppProto$AppChangeEvent watchAppProto$AppChangeEvent) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$AppChangeEvent);
    }

    public static WatchAppProto$AppChangeEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$AppChangeEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$AppChangeEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppChangeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$AppChangeEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppChangeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchAppProto$AppChangeEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppChangeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$AppChangeEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppChangeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$AppChangeEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppChangeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$AppChangeEvent parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$AppChangeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$AppChangeEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$AppChangeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$AppChangeEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$AppChangeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$AppChangeEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$AppChangeEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
