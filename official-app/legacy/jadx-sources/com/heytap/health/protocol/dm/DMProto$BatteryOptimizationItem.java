package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yl4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DMProto$BatteryOptimizationItem extends GeneratedMessageLite<DMProto$BatteryOptimizationItem, Builder> implements DMProto$BatteryOptimizationItemOrBuilder {
    private static final DMProto$BatteryOptimizationItem DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<DMProto$BatteryOptimizationItem> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int id_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$BatteryOptimizationItem, Builder> implements DMProto$BatteryOptimizationItemOrBuilder {
        public Builder clearId() {
            copyOnWrite();
            ((DMProto$BatteryOptimizationItem) this.instance).clearId();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((DMProto$BatteryOptimizationItem) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$BatteryOptimizationItemOrBuilder
        public int getId() {
            return ((DMProto$BatteryOptimizationItem) this.instance).getId();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$BatteryOptimizationItemOrBuilder
        public int getValue() {
            return ((DMProto$BatteryOptimizationItem) this.instance).getValue();
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((DMProto$BatteryOptimizationItem) this.instance).setId(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((DMProto$BatteryOptimizationItem) this.instance).setValue(i);
            return this;
        }

        private Builder() {
            super(DMProto$BatteryOptimizationItem.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$BatteryOptimizationItem dMProto$BatteryOptimizationItem = new DMProto$BatteryOptimizationItem();
        DEFAULT_INSTANCE = dMProto$BatteryOptimizationItem;
        GeneratedMessageLite.registerDefaultInstance(DMProto$BatteryOptimizationItem.class, dMProto$BatteryOptimizationItem);
    }

    private DMProto$BatteryOptimizationItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static DMProto$BatteryOptimizationItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$BatteryOptimizationItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$BatteryOptimizationItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$BatteryOptimizationItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$BatteryOptimizationItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$BatteryOptimizationItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$BatteryOptimizationItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"id_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$BatteryOptimizationItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$BatteryOptimizationItem.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$BatteryOptimizationItemOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$BatteryOptimizationItemOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(DMProto$BatteryOptimizationItem dMProto$BatteryOptimizationItem) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$BatteryOptimizationItem);
    }

    public static DMProto$BatteryOptimizationItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$BatteryOptimizationItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$BatteryOptimizationItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$BatteryOptimizationItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$BatteryOptimizationItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$BatteryOptimizationItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$BatteryOptimizationItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$BatteryOptimizationItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$BatteryOptimizationItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$BatteryOptimizationItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$BatteryOptimizationItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$BatteryOptimizationItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$BatteryOptimizationItem parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$BatteryOptimizationItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$BatteryOptimizationItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$BatteryOptimizationItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$BatteryOptimizationItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$BatteryOptimizationItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$BatteryOptimizationItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$BatteryOptimizationItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
