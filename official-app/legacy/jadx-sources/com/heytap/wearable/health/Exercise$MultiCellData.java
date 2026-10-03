package com.heytap.wearable.health;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.dv6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Exercise$MultiCellData extends GeneratedMessageLite<Exercise$MultiCellData, Builder> implements Exercise$MultiCellDataOrBuilder {
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final Exercise$MultiCellData DEFAULT_INSTANCE;
    private static volatile Parser<Exercise$MultiCellData> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int dataType_;
    private int valueMemoizedSerializedSize = -1;
    private Internal.IntList value_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<Exercise$MultiCellData, Builder> implements Exercise$MultiCellDataOrBuilder {
        public Builder addAllValue(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((Exercise$MultiCellData) this.instance).addAllValue(iterable);
            return this;
        }

        public Builder addValue(int i) {
            copyOnWrite();
            ((Exercise$MultiCellData) this.instance).addValue(i);
            return this;
        }

        public Builder clearDataType() {
            copyOnWrite();
            ((Exercise$MultiCellData) this.instance).clearDataType();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((Exercise$MultiCellData) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.wearable.health.Exercise$MultiCellDataOrBuilder
        public Exercise$DataType getDataType() {
            return ((Exercise$MultiCellData) this.instance).getDataType();
        }

        @Override // com.heytap.wearable.health.Exercise$MultiCellDataOrBuilder
        public int getDataTypeValue() {
            return ((Exercise$MultiCellData) this.instance).getDataTypeValue();
        }

        @Override // com.heytap.wearable.health.Exercise$MultiCellDataOrBuilder
        public int getValue(int i) {
            return ((Exercise$MultiCellData) this.instance).getValue(i);
        }

        @Override // com.heytap.wearable.health.Exercise$MultiCellDataOrBuilder
        public int getValueCount() {
            return ((Exercise$MultiCellData) this.instance).getValueCount();
        }

        @Override // com.heytap.wearable.health.Exercise$MultiCellDataOrBuilder
        public List<Integer> getValueList() {
            return Collections.unmodifiableList(((Exercise$MultiCellData) this.instance).getValueList());
        }

        public Builder setDataType(Exercise$DataType exercise$DataType) {
            copyOnWrite();
            ((Exercise$MultiCellData) this.instance).setDataType(exercise$DataType);
            return this;
        }

        public Builder setDataTypeValue(int i) {
            copyOnWrite();
            ((Exercise$MultiCellData) this.instance).setDataTypeValue(i);
            return this;
        }

        public Builder setValue(int i, int i2) {
            copyOnWrite();
            ((Exercise$MultiCellData) this.instance).setValue(i, i2);
            return this;
        }

        private Builder() {
            super(Exercise$MultiCellData.DEFAULT_INSTANCE);
        }
    }

    static {
        Exercise$MultiCellData exercise$MultiCellData = new Exercise$MultiCellData();
        DEFAULT_INSTANCE = exercise$MultiCellData;
        GeneratedMessageLite.registerDefaultInstance(Exercise$MultiCellData.class, exercise$MultiCellData);
    }

    private Exercise$MultiCellData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<? extends Integer> iterable) {
        ensureValueIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.value_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(int i) {
        ensureValueIsMutable();
        this.value_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataType() {
        this.dataType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureValueIsMutable() {
        Internal.IntList intList = this.value_;
        if (intList.isModifiable()) {
            return;
        }
        this.value_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static Exercise$MultiCellData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Exercise$MultiCellData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Exercise$MultiCellData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$MultiCellData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Exercise$MultiCellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Exercise$MultiCellData> parser() {
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
    public void setValue(int i, int i2) {
        ensureValueIsMutable();
        this.value_.setInt(i, i2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = dv6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Exercise$MultiCellData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002'", new Object[]{"dataType_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Exercise$MultiCellData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Exercise$MultiCellData.class) {
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

    @Override // com.heytap.wearable.health.Exercise$MultiCellDataOrBuilder
    public Exercise$DataType getDataType() {
        Exercise$DataType exercise$DataTypeForNumber = Exercise$DataType.forNumber(this.dataType_);
        return exercise$DataTypeForNumber == null ? Exercise$DataType.UNRECOGNIZED : exercise$DataTypeForNumber;
    }

    @Override // com.heytap.wearable.health.Exercise$MultiCellDataOrBuilder
    public int getDataTypeValue() {
        return this.dataType_;
    }

    @Override // com.heytap.wearable.health.Exercise$MultiCellDataOrBuilder
    public int getValue(int i) {
        return this.value_.getInt(i);
    }

    @Override // com.heytap.wearable.health.Exercise$MultiCellDataOrBuilder
    public int getValueCount() {
        return this.value_.size();
    }

    @Override // com.heytap.wearable.health.Exercise$MultiCellDataOrBuilder
    public List<Integer> getValueList() {
        return this.value_;
    }

    public static Builder newBuilder(Exercise$MultiCellData exercise$MultiCellData) {
        return DEFAULT_INSTANCE.createBuilder(exercise$MultiCellData);
    }

    public static Exercise$MultiCellData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$MultiCellData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$MultiCellData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$MultiCellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Exercise$MultiCellData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Exercise$MultiCellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Exercise$MultiCellData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$MultiCellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Exercise$MultiCellData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Exercise$MultiCellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Exercise$MultiCellData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$MultiCellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Exercise$MultiCellData parseFrom(InputStream inputStream) throws IOException {
        return (Exercise$MultiCellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$MultiCellData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$MultiCellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$MultiCellData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Exercise$MultiCellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Exercise$MultiCellData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$MultiCellData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
