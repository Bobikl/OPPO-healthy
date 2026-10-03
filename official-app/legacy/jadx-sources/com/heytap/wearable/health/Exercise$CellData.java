package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.dv6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Exercise$CellData extends GeneratedMessageLite<Exercise$CellData, Builder> implements Exercise$CellDataOrBuilder {
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final Exercise$CellData DEFAULT_INSTANCE;
    private static volatile Parser<Exercise$CellData> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int dataType_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<Exercise$CellData, Builder> implements Exercise$CellDataOrBuilder {
        public Builder clearDataType() {
            copyOnWrite();
            ((Exercise$CellData) this.instance).clearDataType();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((Exercise$CellData) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.wearable.health.Exercise$CellDataOrBuilder
        public Exercise$DataType getDataType() {
            return ((Exercise$CellData) this.instance).getDataType();
        }

        @Override // com.heytap.wearable.health.Exercise$CellDataOrBuilder
        public int getDataTypeValue() {
            return ((Exercise$CellData) this.instance).getDataTypeValue();
        }

        @Override // com.heytap.wearable.health.Exercise$CellDataOrBuilder
        public int getValue() {
            return ((Exercise$CellData) this.instance).getValue();
        }

        public Builder setDataType(Exercise$DataType exercise$DataType) {
            copyOnWrite();
            ((Exercise$CellData) this.instance).setDataType(exercise$DataType);
            return this;
        }

        public Builder setDataTypeValue(int i) {
            copyOnWrite();
            ((Exercise$CellData) this.instance).setDataTypeValue(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((Exercise$CellData) this.instance).setValue(i);
            return this;
        }

        private Builder() {
            super(Exercise$CellData.DEFAULT_INSTANCE);
        }
    }

    static {
        Exercise$CellData exercise$CellData = new Exercise$CellData();
        DEFAULT_INSTANCE = exercise$CellData;
        GeneratedMessageLite.registerDefaultInstance(Exercise$CellData.class, exercise$CellData);
    }

    private Exercise$CellData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataType() {
        this.dataType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static Exercise$CellData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Exercise$CellData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Exercise$CellData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$CellData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Exercise$CellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Exercise$CellData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataType(Exercise$DataType exercise$DataType) {
        this.dataType_ = exercise$DataType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataTypeValue(int i) {
        this.dataType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = dv6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Exercise$CellData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"dataType_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Exercise$CellData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Exercise$CellData.class) {
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

    @Override // com.heytap.wearable.health.Exercise$CellDataOrBuilder
    public Exercise$DataType getDataType() {
        Exercise$DataType exercise$DataTypeForNumber = Exercise$DataType.forNumber(this.dataType_);
        return exercise$DataTypeForNumber == null ? Exercise$DataType.UNRECOGNIZED : exercise$DataTypeForNumber;
    }

    @Override // com.heytap.wearable.health.Exercise$CellDataOrBuilder
    public int getDataTypeValue() {
        return this.dataType_;
    }

    @Override // com.heytap.wearable.health.Exercise$CellDataOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(Exercise$CellData exercise$CellData) {
        return DEFAULT_INSTANCE.createBuilder(exercise$CellData);
    }

    public static Exercise$CellData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$CellData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$CellData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$CellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Exercise$CellData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Exercise$CellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Exercise$CellData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$CellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Exercise$CellData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Exercise$CellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Exercise$CellData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$CellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Exercise$CellData parseFrom(InputStream inputStream) throws IOException {
        return (Exercise$CellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$CellData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$CellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$CellData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Exercise$CellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Exercise$CellData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$CellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
