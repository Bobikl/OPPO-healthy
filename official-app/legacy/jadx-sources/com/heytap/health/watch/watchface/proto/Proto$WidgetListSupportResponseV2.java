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
public final class Proto$WidgetListSupportResponseV2 extends GeneratedMessageLite<Proto$WidgetListSupportResponseV2, Builder> implements Proto$WidgetListSupportResponseV2OrBuilder {
    private static final Proto$WidgetListSupportResponseV2 DEFAULT_INSTANCE;
    private static volatile Parser<Proto$WidgetListSupportResponseV2> PARSER = null;
    public static final int WIDGET_LIST_FIELD_NUMBER = 2;
    public static final int WIDGET_MODE_FIELD_NUMBER = 1;
    private int widgetListMemoizedSerializedSize = -1;
    private Internal.IntList widgetList_ = GeneratedMessageLite.emptyIntList();
    private int widgetMode_;

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$WidgetListSupportResponseV2, Builder> implements Proto$WidgetListSupportResponseV2OrBuilder {
        public Builder addAllWidgetList(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((Proto$WidgetListSupportResponseV2) this.instance).addAllWidgetList(iterable);
            return this;
        }

        public Builder addWidgetList(int i) {
            copyOnWrite();
            ((Proto$WidgetListSupportResponseV2) this.instance).addWidgetList(i);
            return this;
        }

        public Builder clearWidgetList() {
            copyOnWrite();
            ((Proto$WidgetListSupportResponseV2) this.instance).clearWidgetList();
            return this;
        }

        public Builder clearWidgetMode() {
            copyOnWrite();
            ((Proto$WidgetListSupportResponseV2) this.instance).clearWidgetMode();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportResponseV2OrBuilder
        public int getWidgetList(int i) {
            return ((Proto$WidgetListSupportResponseV2) this.instance).getWidgetList(i);
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportResponseV2OrBuilder
        public int getWidgetListCount() {
            return ((Proto$WidgetListSupportResponseV2) this.instance).getWidgetListCount();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportResponseV2OrBuilder
        public List<Integer> getWidgetListList() {
            return Collections.unmodifiableList(((Proto$WidgetListSupportResponseV2) this.instance).getWidgetListList());
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportResponseV2OrBuilder
        public int getWidgetMode() {
            return ((Proto$WidgetListSupportResponseV2) this.instance).getWidgetMode();
        }

        public Builder setWidgetList(int i, int i2) {
            copyOnWrite();
            ((Proto$WidgetListSupportResponseV2) this.instance).setWidgetList(i, i2);
            return this;
        }

        public Builder setWidgetMode(int i) {
            copyOnWrite();
            ((Proto$WidgetListSupportResponseV2) this.instance).setWidgetMode(i);
            return this;
        }

        private Builder() {
            super(Proto$WidgetListSupportResponseV2.DEFAULT_INSTANCE);
        }
    }

    static {
        Proto$WidgetListSupportResponseV2 proto$WidgetListSupportResponseV2 = new Proto$WidgetListSupportResponseV2();
        DEFAULT_INSTANCE = proto$WidgetListSupportResponseV2;
        GeneratedMessageLite.registerDefaultInstance(Proto$WidgetListSupportResponseV2.class, proto$WidgetListSupportResponseV2);
    }

    private Proto$WidgetListSupportResponseV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWidgetList(Iterable<? extends Integer> iterable) {
        ensureWidgetListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.widgetList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWidgetList(int i) {
        ensureWidgetListIsMutable();
        this.widgetList_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidgetList() {
        this.widgetList_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidgetMode() {
        this.widgetMode_ = 0;
    }

    private void ensureWidgetListIsMutable() {
        Internal.IntList intList = this.widgetList_;
        if (intList.isModifiable()) {
            return;
        }
        this.widgetList_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static Proto$WidgetListSupportResponseV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$WidgetListSupportResponseV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$WidgetListSupportResponseV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WidgetListSupportResponseV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$WidgetListSupportResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$WidgetListSupportResponseV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidgetList(int i, int i2) {
        ensureWidgetListIsMutable();
        this.widgetList_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidgetMode(int i) {
        this.widgetMode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$WidgetListSupportResponseV2();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002'", new Object[]{"widgetMode_", "widgetList_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$WidgetListSupportResponseV2> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$WidgetListSupportResponseV2.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportResponseV2OrBuilder
    public int getWidgetList(int i) {
        return this.widgetList_.getInt(i);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportResponseV2OrBuilder
    public int getWidgetListCount() {
        return this.widgetList_.size();
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportResponseV2OrBuilder
    public List<Integer> getWidgetListList() {
        return this.widgetList_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WidgetListSupportResponseV2OrBuilder
    public int getWidgetMode() {
        return this.widgetMode_;
    }

    public static Builder newBuilder(Proto$WidgetListSupportResponseV2 proto$WidgetListSupportResponseV2) {
        return DEFAULT_INSTANCE.createBuilder(proto$WidgetListSupportResponseV2);
    }

    public static Proto$WidgetListSupportResponseV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WidgetListSupportResponseV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WidgetListSupportResponseV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WidgetListSupportResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$WidgetListSupportResponseV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$WidgetListSupportResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$WidgetListSupportResponseV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WidgetListSupportResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$WidgetListSupportResponseV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$WidgetListSupportResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$WidgetListSupportResponseV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WidgetListSupportResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$WidgetListSupportResponseV2 parseFrom(InputStream inputStream) throws IOException {
        return (Proto$WidgetListSupportResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WidgetListSupportResponseV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WidgetListSupportResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WidgetListSupportResponseV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$WidgetListSupportResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$WidgetListSupportResponseV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WidgetListSupportResponseV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
