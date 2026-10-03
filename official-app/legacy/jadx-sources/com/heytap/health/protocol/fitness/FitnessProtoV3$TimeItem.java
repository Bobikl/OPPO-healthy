package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.aq7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV3$TimeItem extends GeneratedMessageLite<FitnessProtoV3$TimeItem, Builder> implements FitnessProtoV3$TimeItemOrBuilder {
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final FitnessProtoV3$TimeItem DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProtoV3$TimeItem> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private int dataType_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV3$TimeItem, Builder> implements FitnessProtoV3$TimeItemOrBuilder {
        public Builder clearDataType() {
            copyOnWrite();
            ((FitnessProtoV3$TimeItem) this.instance).clearDataType();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProtoV3$TimeItem) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$TimeItemOrBuilder
        public int getDataType() {
            return ((FitnessProtoV3$TimeItem) this.instance).getDataType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$TimeItemOrBuilder
        public int getTimestamp() {
            return ((FitnessProtoV3$TimeItem) this.instance).getTimestamp();
        }

        public Builder setDataType(int i) {
            copyOnWrite();
            ((FitnessProtoV3$TimeItem) this.instance).setDataType(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProtoV3$TimeItem) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV3$TimeItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV3$TimeItem fitnessProtoV3$TimeItem = new FitnessProtoV3$TimeItem();
        DEFAULT_INSTANCE = fitnessProtoV3$TimeItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV3$TimeItem.class, fitnessProtoV3$TimeItem);
    }

    private FitnessProtoV3$TimeItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataType() {
        this.dataType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static FitnessProtoV3$TimeItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV3$TimeItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV3$TimeItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV3$TimeItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$TimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV3$TimeItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataType(int i) {
        this.dataType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = aq7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV3$TimeItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"dataType_", "timestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV3$TimeItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV3$TimeItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$TimeItemOrBuilder
    public int getDataType() {
        return this.dataType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$TimeItemOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(FitnessProtoV3$TimeItem fitnessProtoV3$TimeItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV3$TimeItem);
    }

    public static FitnessProtoV3$TimeItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV3$TimeItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV3$TimeItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$TimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV3$TimeItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$TimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV3$TimeItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$TimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV3$TimeItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$TimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV3$TimeItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$TimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV3$TimeItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV3$TimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV3$TimeItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV3$TimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV3$TimeItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV3$TimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV3$TimeItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV3$TimeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
