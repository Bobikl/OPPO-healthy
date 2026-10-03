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
public final class Proto$WidgetListSupportRequestV2 extends GeneratedMessageLite<Proto$WidgetListSupportRequestV2, Builder> implements Proto$WidgetListSupportRequestV2OrBuilder {
    private static final Proto$WidgetListSupportRequestV2 DEFAULT_INSTANCE;
    private static volatile Parser<Proto$WidgetListSupportRequestV2> PARSER = null;
    public static final int WIDGET_MODE_LIST_FIELD_NUMBER = 1;
    private int widgetModeListMemoizedSerializedSize = -1;
    private Internal.IntList widgetModeList_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$WidgetListSupportRequestV2, Builder> implements Proto$WidgetListSupportRequestV2OrBuilder {
        public Builder addAllWidgetModeList(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((Proto$WidgetListSupportRequestV2) this.instance).addAllWidgetModeList(iterable);
            return this;
        }

        public Builder addWidgetModeList(int i) {
            copyOnWrite();
            ((Proto$WidgetListSupportRequestV2) this.instance).addWidgetModeList(i);
            return this;
        }

        public Builder clearWidgetModeList() {
            copyOnWrite();
            ((Proto$WidgetListSupportRequestV2) this.instance).clearWidgetModeList();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportRequestV2OrBuilder
        public int getWidgetModeList(int i) {
            return ((Proto$WidgetListSupportRequestV2) this.instance).getWidgetModeList(i);
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportRequestV2OrBuilder
        public int getWidgetModeListCount() {
            return ((Proto$WidgetListSupportRequestV2) this.instance).getWidgetModeListCount();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportRequestV2OrBuilder
        public List<Integer> getWidgetModeListList() {
            return Collections.unmodifiableList(((Proto$WidgetListSupportRequestV2) this.instance).getWidgetModeListList());
        }

        public Builder setWidgetModeList(int i, int i2) {
            copyOnWrite();
            ((Proto$WidgetListSupportRequestV2) this.instance).setWidgetModeList(i, i2);
            return this;
        }

        private Builder() {
            super(Proto$WidgetListSupportRequestV2.DEFAULT_INSTANCE);
        }
    }

    static {
        Proto$WidgetListSupportRequestV2 proto$WidgetListSupportRequestV2 = new Proto$WidgetListSupportRequestV2();
        DEFAULT_INSTANCE = proto$WidgetListSupportRequestV2;
        GeneratedMessageLite.registerDefaultInstance(Proto$WidgetListSupportRequestV2.class, proto$WidgetListSupportRequestV2);
    }

    private Proto$WidgetListSupportRequestV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWidgetModeList(Iterable<? extends Integer> iterable) {
        ensureWidgetModeListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.widgetModeList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWidgetModeList(int i) {
        ensureWidgetModeListIsMutable();
        this.widgetModeList_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidgetModeList() {
        this.widgetModeList_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureWidgetModeListIsMutable() {
        Internal.IntList intList = this.widgetModeList_;
        if (intList.isModifiable()) {
            return;
        }
        this.widgetModeList_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static Proto$WidgetListSupportRequestV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$WidgetListSupportRequestV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$WidgetListSupportRequestV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WidgetListSupportRequestV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$WidgetListSupportRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$WidgetListSupportRequestV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidgetModeList(int i, int i2) {
        ensureWidgetModeListIsMutable();
        this.widgetModeList_.setInt(i, i2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$WidgetListSupportRequestV2();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"widgetModeList_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$WidgetListSupportRequestV2> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$WidgetListSupportRequestV2.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportRequestV2OrBuilder
    public int getWidgetModeList(int i) {
        return this.widgetModeList_.getInt(i);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportRequestV2OrBuilder
    public int getWidgetModeListCount() {
        return this.widgetModeList_.size();
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportRequestV2OrBuilder
    public List<Integer> getWidgetModeListList() {
        return this.widgetModeList_;
    }

    public static Builder newBuilder(Proto$WidgetListSupportRequestV2 proto$WidgetListSupportRequestV2) {
        return DEFAULT_INSTANCE.createBuilder(proto$WidgetListSupportRequestV2);
    }

    public static Proto$WidgetListSupportRequestV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WidgetListSupportRequestV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WidgetListSupportRequestV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WidgetListSupportRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$WidgetListSupportRequestV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$WidgetListSupportRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$WidgetListSupportRequestV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WidgetListSupportRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$WidgetListSupportRequestV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$WidgetListSupportRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$WidgetListSupportRequestV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WidgetListSupportRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$WidgetListSupportRequestV2 parseFrom(InputStream inputStream) throws IOException {
        return (Proto$WidgetListSupportRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WidgetListSupportRequestV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WidgetListSupportRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WidgetListSupportRequestV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$WidgetListSupportRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$WidgetListSupportRequestV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WidgetListSupportRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
