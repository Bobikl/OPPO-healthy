package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.l8l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchAppProto$ActiveAppStatusListInfo extends GeneratedMessageLite<WatchAppProto$ActiveAppStatusListInfo, Builder> implements WatchAppProto$ActiveAppStatusListInfoOrBuilder {
    public static final int ACTIVE_APP_STATUS_INFO_FIELD_NUMBER = 1;
    private static final WatchAppProto$ActiveAppStatusListInfo DEFAULT_INSTANCE;
    private static volatile Parser<WatchAppProto$ActiveAppStatusListInfo> PARSER;
    private Internal.ProtobufList<WatchAppProto$ActiveAppStatusInfo> activeAppStatusInfo_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$ActiveAppStatusListInfo, Builder> implements WatchAppProto$ActiveAppStatusListInfoOrBuilder {
        public Builder addActiveAppStatusInfo(WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusListInfo) this.instance).addActiveAppStatusInfo(watchAppProto$ActiveAppStatusInfo);
            return this;
        }

        public Builder addAllActiveAppStatusInfo(Iterable<? extends WatchAppProto$ActiveAppStatusInfo> iterable) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusListInfo) this.instance).addAllActiveAppStatusInfo(iterable);
            return this;
        }

        public Builder clearActiveAppStatusInfo() {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusListInfo) this.instance).clearActiveAppStatusInfo();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusListInfoOrBuilder
        public WatchAppProto$ActiveAppStatusInfo getActiveAppStatusInfo(int i) {
            return ((WatchAppProto$ActiveAppStatusListInfo) this.instance).getActiveAppStatusInfo(i);
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusListInfoOrBuilder
        public int getActiveAppStatusInfoCount() {
            return ((WatchAppProto$ActiveAppStatusListInfo) this.instance).getActiveAppStatusInfoCount();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusListInfoOrBuilder
        public List<WatchAppProto$ActiveAppStatusInfo> getActiveAppStatusInfoList() {
            return Collections.unmodifiableList(((WatchAppProto$ActiveAppStatusListInfo) this.instance).getActiveAppStatusInfoList());
        }

        public Builder removeActiveAppStatusInfo(int i) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusListInfo) this.instance).removeActiveAppStatusInfo(i);
            return this;
        }

        public Builder setActiveAppStatusInfo(int i, WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusListInfo) this.instance).setActiveAppStatusInfo(i, watchAppProto$ActiveAppStatusInfo);
            return this;
        }

        private Builder() {
            super(WatchAppProto$ActiveAppStatusListInfo.DEFAULT_INSTANCE);
        }

        public Builder addActiveAppStatusInfo(int i, WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusListInfo) this.instance).addActiveAppStatusInfo(i, watchAppProto$ActiveAppStatusInfo);
            return this;
        }

        public Builder setActiveAppStatusInfo(int i, WatchAppProto$ActiveAppStatusInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusListInfo) this.instance).setActiveAppStatusInfo(i, builder.build());
            return this;
        }

        public Builder addActiveAppStatusInfo(WatchAppProto$ActiveAppStatusInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusListInfo) this.instance).addActiveAppStatusInfo(builder.build());
            return this;
        }

        public Builder addActiveAppStatusInfo(int i, WatchAppProto$ActiveAppStatusInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$ActiveAppStatusListInfo) this.instance).addActiveAppStatusInfo(i, builder.build());
            return this;
        }
    }

    static {
        WatchAppProto$ActiveAppStatusListInfo watchAppProto$ActiveAppStatusListInfo = new WatchAppProto$ActiveAppStatusListInfo();
        DEFAULT_INSTANCE = watchAppProto$ActiveAppStatusListInfo;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$ActiveAppStatusListInfo.class, watchAppProto$ActiveAppStatusListInfo);
    }

    private WatchAppProto$ActiveAppStatusListInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActiveAppStatusInfo(WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo) {
        watchAppProto$ActiveAppStatusInfo.getClass();
        ensureActiveAppStatusInfoIsMutable();
        this.activeAppStatusInfo_.add(watchAppProto$ActiveAppStatusInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllActiveAppStatusInfo(Iterable<? extends WatchAppProto$ActiveAppStatusInfo> iterable) {
        ensureActiveAppStatusInfoIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.activeAppStatusInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActiveAppStatusInfo() {
        this.activeAppStatusInfo_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureActiveAppStatusInfoIsMutable() {
        Internal.ProtobufList<WatchAppProto$ActiveAppStatusInfo> protobufList = this.activeAppStatusInfo_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.activeAppStatusInfo_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static WatchAppProto$ActiveAppStatusListInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchAppProto$ActiveAppStatusListInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$ActiveAppStatusListInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$ActiveAppStatusListInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$ActiveAppStatusListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$ActiveAppStatusListInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeActiveAppStatusInfo(int i) {
        ensureActiveAppStatusInfoIsMutable();
        this.activeAppStatusInfo_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveAppStatusInfo(int i, WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo) {
        watchAppProto$ActiveAppStatusInfo.getClass();
        ensureActiveAppStatusInfoIsMutable();
        this.activeAppStatusInfo_.set(i, watchAppProto$ActiveAppStatusInfo);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l8l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchAppProto$ActiveAppStatusListInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"activeAppStatusInfo_", WatchAppProto$ActiveAppStatusInfo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$ActiveAppStatusListInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$ActiveAppStatusListInfo.class) {
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

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusListInfoOrBuilder
    public WatchAppProto$ActiveAppStatusInfo getActiveAppStatusInfo(int i) {
        return this.activeAppStatusInfo_.get(i);
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusListInfoOrBuilder
    public int getActiveAppStatusInfoCount() {
        return this.activeAppStatusInfo_.size();
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$ActiveAppStatusListInfoOrBuilder
    public List<WatchAppProto$ActiveAppStatusInfo> getActiveAppStatusInfoList() {
        return this.activeAppStatusInfo_;
    }

    public WatchAppProto$ActiveAppStatusInfoOrBuilder getActiveAppStatusInfoOrBuilder(int i) {
        return this.activeAppStatusInfo_.get(i);
    }

    public List<? extends WatchAppProto$ActiveAppStatusInfoOrBuilder> getActiveAppStatusInfoOrBuilderList() {
        return this.activeAppStatusInfo_;
    }

    public static Builder newBuilder(WatchAppProto$ActiveAppStatusListInfo watchAppProto$ActiveAppStatusListInfo) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$ActiveAppStatusListInfo);
    }

    public static WatchAppProto$ActiveAppStatusListInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$ActiveAppStatusListInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$ActiveAppStatusListInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$ActiveAppStatusListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$ActiveAppStatusListInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$ActiveAppStatusListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActiveAppStatusInfo(int i, WatchAppProto$ActiveAppStatusInfo watchAppProto$ActiveAppStatusInfo) {
        watchAppProto$ActiveAppStatusInfo.getClass();
        ensureActiveAppStatusInfoIsMutable();
        this.activeAppStatusInfo_.add(i, watchAppProto$ActiveAppStatusInfo);
    }

    public static WatchAppProto$ActiveAppStatusListInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$ActiveAppStatusListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$ActiveAppStatusListInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$ActiveAppStatusListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$ActiveAppStatusListInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$ActiveAppStatusListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$ActiveAppStatusListInfo parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$ActiveAppStatusListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$ActiveAppStatusListInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$ActiveAppStatusListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$ActiveAppStatusListInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$ActiveAppStatusListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$ActiveAppStatusListInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$ActiveAppStatusListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
