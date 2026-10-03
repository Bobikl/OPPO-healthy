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
public final class WatchAppProto$AppListInfo extends GeneratedMessageLite<WatchAppProto$AppListInfo, Builder> implements WatchAppProto$AppListInfoOrBuilder {
    public static final int APP_INFO_FIELD_NUMBER = 4;
    private static final WatchAppProto$AppListInfo DEFAULT_INSTANCE;
    public static final int PAGE_COUNT_FIELD_NUMBER = 2;
    public static final int PAGE_FIELD_NUMBER = 3;
    private static volatile Parser<WatchAppProto$AppListInfo> PARSER = null;
    public static final int TOTAL_COUNT_FIELD_NUMBER = 1;
    private Internal.ProtobufList<WatchAppProto$AppInfo> appInfo_ = GeneratedMessageLite.emptyProtobufList();
    private int pageCount_;
    private int page_;
    private int totalCount_;

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$AppListInfo, Builder> implements WatchAppProto$AppListInfoOrBuilder {
        public Builder addAllAppInfo(Iterable<? extends WatchAppProto$AppInfo> iterable) {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).addAllAppInfo(iterable);
            return this;
        }

        public Builder addAppInfo(WatchAppProto$AppInfo watchAppProto$AppInfo) {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).addAppInfo(watchAppProto$AppInfo);
            return this;
        }

        public Builder clearAppInfo() {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).clearAppInfo();
            return this;
        }

        public Builder clearPage() {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).clearPage();
            return this;
        }

        public Builder clearPageCount() {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).clearPageCount();
            return this;
        }

        public Builder clearTotalCount() {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).clearTotalCount();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfoOrBuilder
        public WatchAppProto$AppInfo getAppInfo(int i) {
            return ((WatchAppProto$AppListInfo) this.instance).getAppInfo(i);
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfoOrBuilder
        public int getAppInfoCount() {
            return ((WatchAppProto$AppListInfo) this.instance).getAppInfoCount();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfoOrBuilder
        public List<WatchAppProto$AppInfo> getAppInfoList() {
            return Collections.unmodifiableList(((WatchAppProto$AppListInfo) this.instance).getAppInfoList());
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfoOrBuilder
        public int getPage() {
            return ((WatchAppProto$AppListInfo) this.instance).getPage();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfoOrBuilder
        public int getPageCount() {
            return ((WatchAppProto$AppListInfo) this.instance).getPageCount();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfoOrBuilder
        public int getTotalCount() {
            return ((WatchAppProto$AppListInfo) this.instance).getTotalCount();
        }

        public Builder removeAppInfo(int i) {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).removeAppInfo(i);
            return this;
        }

        public Builder setAppInfo(int i, WatchAppProto$AppInfo watchAppProto$AppInfo) {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).setAppInfo(i, watchAppProto$AppInfo);
            return this;
        }

        public Builder setPage(int i) {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).setPage(i);
            return this;
        }

        public Builder setPageCount(int i) {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).setPageCount(i);
            return this;
        }

        public Builder setTotalCount(int i) {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).setTotalCount(i);
            return this;
        }

        private Builder() {
            super(WatchAppProto$AppListInfo.DEFAULT_INSTANCE);
        }

        public Builder addAppInfo(int i, WatchAppProto$AppInfo watchAppProto$AppInfo) {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).addAppInfo(i, watchAppProto$AppInfo);
            return this;
        }

        public Builder setAppInfo(int i, WatchAppProto$AppInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).setAppInfo(i, builder.build());
            return this;
        }

        public Builder addAppInfo(WatchAppProto$AppInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).addAppInfo(builder.build());
            return this;
        }

        public Builder addAppInfo(int i, WatchAppProto$AppInfo.Builder builder) {
            copyOnWrite();
            ((WatchAppProto$AppListInfo) this.instance).addAppInfo(i, builder.build());
            return this;
        }
    }

    static {
        WatchAppProto$AppListInfo watchAppProto$AppListInfo = new WatchAppProto$AppListInfo();
        DEFAULT_INSTANCE = watchAppProto$AppListInfo;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$AppListInfo.class, watchAppProto$AppListInfo);
    }

    private WatchAppProto$AppListInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAppInfo(Iterable<? extends WatchAppProto$AppInfo> iterable) {
        ensureAppInfoIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.appInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAppInfo(WatchAppProto$AppInfo watchAppProto$AppInfo) {
        watchAppProto$AppInfo.getClass();
        ensureAppInfoIsMutable();
        this.appInfo_.add(watchAppProto$AppInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInfo() {
        this.appInfo_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPage() {
        this.page_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageCount() {
        this.pageCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalCount() {
        this.totalCount_ = 0;
    }

    private void ensureAppInfoIsMutable() {
        Internal.ProtobufList<WatchAppProto$AppInfo> protobufList = this.appInfo_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.appInfo_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static WatchAppProto$AppListInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchAppProto$AppListInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$AppListInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$AppListInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$AppListInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAppInfo(int i) {
        ensureAppInfoIsMutable();
        this.appInfo_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInfo(int i, WatchAppProto$AppInfo watchAppProto$AppInfo) {
        watchAppProto$AppInfo.getClass();
        ensureAppInfoIsMutable();
        this.appInfo_.set(i, watchAppProto$AppInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPage(int i) {
        this.page_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageCount(int i) {
        this.pageCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalCount(int i) {
        this.totalCount_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l8l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchAppProto$AppListInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u001b", new Object[]{"totalCount_", "pageCount_", "page_", "appInfo_", WatchAppProto$AppInfo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$AppListInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$AppListInfo.class) {
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

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfoOrBuilder
    public WatchAppProto$AppInfo getAppInfo(int i) {
        return this.appInfo_.get(i);
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfoOrBuilder
    public int getAppInfoCount() {
        return this.appInfo_.size();
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfoOrBuilder
    public List<WatchAppProto$AppInfo> getAppInfoList() {
        return this.appInfo_;
    }

    public WatchAppProto$AppInfoOrBuilder getAppInfoOrBuilder(int i) {
        return this.appInfo_.get(i);
    }

    public List<? extends WatchAppProto$AppInfoOrBuilder> getAppInfoOrBuilderList() {
        return this.appInfo_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfoOrBuilder
    public int getPage() {
        return this.page_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfoOrBuilder
    public int getPageCount() {
        return this.pageCount_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$AppListInfoOrBuilder
    public int getTotalCount() {
        return this.totalCount_;
    }

    public static Builder newBuilder(WatchAppProto$AppListInfo watchAppProto$AppListInfo) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$AppListInfo);
    }

    public static WatchAppProto$AppListInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$AppListInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$AppListInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$AppListInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAppInfo(int i, WatchAppProto$AppInfo watchAppProto$AppInfo) {
        watchAppProto$AppInfo.getClass();
        ensureAppInfoIsMutable();
        this.appInfo_.add(i, watchAppProto$AppInfo);
    }

    public static WatchAppProto$AppListInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$AppListInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$AppListInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$AppListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$AppListInfo parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$AppListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$AppListInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$AppListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$AppListInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$AppListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$AppListInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$AppListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
