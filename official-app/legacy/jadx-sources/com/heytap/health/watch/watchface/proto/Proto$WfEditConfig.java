package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fze;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class Proto$WfEditConfig extends GeneratedMessageLite<Proto$WfEditConfig, Builder> implements Proto$WfEditConfigOrBuilder {
    private static final Proto$WfEditConfig DEFAULT_INSTANCE;
    public static final int EXTRA_JSON_FIELD_NUMBER = 16;
    public static final int LAST_SYNC_TIME_FIELD_NUMBER = 8;
    private static volatile Parser<Proto$WfEditConfig> PARSER = null;
    public static final int WF_COLOR_INDEX_FIELD_NUMBER = 4;
    public static final int WF_STYLE_INDEX_FIELD_NUMBER = 3;
    public static final int WF_TIME_INDEX_FIELD_NUMBER = 7;
    public static final int WF_UNIQUE_FIELD_NUMBER = 1;
    public static final int WF_VERSION_FIELD_NUMBER = 2;
    public static final int WIDGET_LIST_FIELD_NUMBER = 9;
    private long lastSyncTime_;
    private int wfColorIndex_;
    private int wfStyleIndex_;
    private int wfTimeIndex_;
    private String wfUnique_ = "";
    private String wfVersion_ = "";
    private Internal.ProtobufList<Proto$WfWidget> widgetList_ = GeneratedMessageLite.emptyProtobufList();
    private String extraJson_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$WfEditConfig, Builder> implements Proto$WfEditConfigOrBuilder {
        public Builder addAllWidgetList(Iterable<? extends Proto$WfWidget> iterable) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).addAllWidgetList(iterable);
            return this;
        }

        public Builder addWidgetList(Proto$WfWidget proto$WfWidget) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).addWidgetList(proto$WfWidget);
            return this;
        }

        public Builder clearExtraJson() {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).clearExtraJson();
            return this;
        }

        public Builder clearLastSyncTime() {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).clearLastSyncTime();
            return this;
        }

        public Builder clearWfColorIndex() {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).clearWfColorIndex();
            return this;
        }

        public Builder clearWfStyleIndex() {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).clearWfStyleIndex();
            return this;
        }

        public Builder clearWfTimeIndex() {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).clearWfTimeIndex();
            return this;
        }

        public Builder clearWfUnique() {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).clearWfUnique();
            return this;
        }

        public Builder clearWfVersion() {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).clearWfVersion();
            return this;
        }

        public Builder clearWidgetList() {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).clearWidgetList();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public String getExtraJson() {
            return ((Proto$WfEditConfig) this.instance).getExtraJson();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public ByteString getExtraJsonBytes() {
            return ((Proto$WfEditConfig) this.instance).getExtraJsonBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public long getLastSyncTime() {
            return ((Proto$WfEditConfig) this.instance).getLastSyncTime();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public int getWfColorIndex() {
            return ((Proto$WfEditConfig) this.instance).getWfColorIndex();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public int getWfStyleIndex() {
            return ((Proto$WfEditConfig) this.instance).getWfStyleIndex();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public int getWfTimeIndex() {
            return ((Proto$WfEditConfig) this.instance).getWfTimeIndex();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public String getWfUnique() {
            return ((Proto$WfEditConfig) this.instance).getWfUnique();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public ByteString getWfUniqueBytes() {
            return ((Proto$WfEditConfig) this.instance).getWfUniqueBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public String getWfVersion() {
            return ((Proto$WfEditConfig) this.instance).getWfVersion();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public ByteString getWfVersionBytes() {
            return ((Proto$WfEditConfig) this.instance).getWfVersionBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public Proto$WfWidget getWidgetList(int i) {
            return ((Proto$WfEditConfig) this.instance).getWidgetList(i);
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public int getWidgetListCount() {
            return ((Proto$WfEditConfig) this.instance).getWidgetListCount();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
        public List<Proto$WfWidget> getWidgetListList() {
            return Collections.unmodifiableList(((Proto$WfEditConfig) this.instance).getWidgetListList());
        }

        public Builder removeWidgetList(int i) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).removeWidgetList(i);
            return this;
        }

        public Builder setExtraJson(String str) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).setExtraJson(str);
            return this;
        }

        public Builder setExtraJsonBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).setExtraJsonBytes(byteString);
            return this;
        }

        public Builder setLastSyncTime(long j2) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).setLastSyncTime(j2);
            return this;
        }

        public Builder setWfColorIndex(int i) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).setWfColorIndex(i);
            return this;
        }

        public Builder setWfStyleIndex(int i) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).setWfStyleIndex(i);
            return this;
        }

        public Builder setWfTimeIndex(int i) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).setWfTimeIndex(i);
            return this;
        }

        public Builder setWfUnique(String str) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).setWfUnique(str);
            return this;
        }

        public Builder setWfUniqueBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).setWfUniqueBytes(byteString);
            return this;
        }

        public Builder setWfVersion(String str) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).setWfVersion(str);
            return this;
        }

        public Builder setWfVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).setWfVersionBytes(byteString);
            return this;
        }

        public Builder setWidgetList(int i, Proto$WfWidget proto$WfWidget) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).setWidgetList(i, proto$WfWidget);
            return this;
        }

        private Builder() {
            super(Proto$WfEditConfig.DEFAULT_INSTANCE);
        }

        public Builder addWidgetList(int i, Proto$WfWidget proto$WfWidget) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).addWidgetList(i, proto$WfWidget);
            return this;
        }

        public Builder setWidgetList(int i, Proto$WfWidget.Builder builder) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).setWidgetList(i, builder.build());
            return this;
        }

        public Builder addWidgetList(Proto$WfWidget.Builder builder) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).addWidgetList(builder.build());
            return this;
        }

        public Builder addWidgetList(int i, Proto$WfWidget.Builder builder) {
            copyOnWrite();
            ((Proto$WfEditConfig) this.instance).addWidgetList(i, builder.build());
            return this;
        }
    }

    static {
        Proto$WfEditConfig proto$WfEditConfig = new Proto$WfEditConfig();
        DEFAULT_INSTANCE = proto$WfEditConfig;
        GeneratedMessageLite.registerDefaultInstance(Proto$WfEditConfig.class, proto$WfEditConfig);
    }

    private Proto$WfEditConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWidgetList(Iterable<? extends Proto$WfWidget> iterable) {
        ensureWidgetListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.widgetList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWidgetList(Proto$WfWidget proto$WfWidget) {
        proto$WfWidget.getClass();
        ensureWidgetListIsMutable();
        this.widgetList_.add(proto$WfWidget);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtraJson() {
        this.extraJson_ = getDefaultInstance().getExtraJson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastSyncTime() {
        this.lastSyncTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfColorIndex() {
        this.wfColorIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfStyleIndex() {
        this.wfStyleIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfTimeIndex() {
        this.wfTimeIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfUnique() {
        this.wfUnique_ = getDefaultInstance().getWfUnique();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWfVersion() {
        this.wfVersion_ = getDefaultInstance().getWfVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidgetList() {
        this.widgetList_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureWidgetListIsMutable() {
        Internal.ProtobufList<Proto$WfWidget> protobufList = this.widgetList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.widgetList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Proto$WfEditConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$WfEditConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$WfEditConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WfEditConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$WfEditConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$WfEditConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWidgetList(int i) {
        ensureWidgetListIsMutable();
        this.widgetList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraJson(String str) {
        str.getClass();
        this.extraJson_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraJsonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraJson_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastSyncTime(long j2) {
        this.lastSyncTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfColorIndex(int i) {
        this.wfColorIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfStyleIndex(int i) {
        this.wfStyleIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfTimeIndex(int i) {
        this.wfTimeIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfUnique(String str) {
        str.getClass();
        this.wfUnique_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfUniqueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wfUnique_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfVersion(String str) {
        str.getClass();
        this.wfVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWfVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wfVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidgetList(int i, Proto$WfWidget proto$WfWidget) {
        proto$WfWidget.getClass();
        ensureWidgetListIsMutable();
        this.widgetList_.set(i, proto$WfWidget);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$WfEditConfig();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\u0010\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0007\u0004\b\u0002\t\u001b\u0010Ȉ", new Object[]{"wfUnique_", "wfVersion_", "wfStyleIndex_", "wfColorIndex_", "wfTimeIndex_", "lastSyncTime_", "widgetList_", Proto$WfWidget.class, "extraJson_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$WfEditConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$WfEditConfig.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public String getExtraJson() {
        return this.extraJson_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public ByteString getExtraJsonBytes() {
        return ByteString.copyFromUtf8(this.extraJson_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public long getLastSyncTime() {
        return this.lastSyncTime_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public int getWfColorIndex() {
        return this.wfColorIndex_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public int getWfStyleIndex() {
        return this.wfStyleIndex_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public int getWfTimeIndex() {
        return this.wfTimeIndex_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public String getWfUnique() {
        return this.wfUnique_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public ByteString getWfUniqueBytes() {
        return ByteString.copyFromUtf8(this.wfUnique_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public String getWfVersion() {
        return this.wfVersion_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public ByteString getWfVersionBytes() {
        return ByteString.copyFromUtf8(this.wfVersion_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public Proto$WfWidget getWidgetList(int i) {
        return this.widgetList_.get(i);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public int getWidgetListCount() {
        return this.widgetList_.size();
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WfEditConfigOrBuilder
    public List<Proto$WfWidget> getWidgetListList() {
        return this.widgetList_;
    }

    public Proto$WfWidgetOrBuilder getWidgetListOrBuilder(int i) {
        return this.widgetList_.get(i);
    }

    public List<? extends Proto$WfWidgetOrBuilder> getWidgetListOrBuilderList() {
        return this.widgetList_;
    }

    public static Builder newBuilder(Proto$WfEditConfig proto$WfEditConfig) {
        return DEFAULT_INSTANCE.createBuilder(proto$WfEditConfig);
    }

    public static Proto$WfEditConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WfEditConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WfEditConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WfEditConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$WfEditConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$WfEditConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWidgetList(int i, Proto$WfWidget proto$WfWidget) {
        proto$WfWidget.getClass();
        ensureWidgetListIsMutable();
        this.widgetList_.add(i, proto$WfWidget);
    }

    public static Proto$WfEditConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WfEditConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$WfEditConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$WfEditConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$WfEditConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WfEditConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$WfEditConfig parseFrom(InputStream inputStream) throws IOException {
        return (Proto$WfEditConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WfEditConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WfEditConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WfEditConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$WfEditConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$WfEditConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WfEditConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
