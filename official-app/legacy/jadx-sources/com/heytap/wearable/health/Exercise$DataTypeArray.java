package com.heytap.wearable.health;

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
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Exercise$DataTypeArray extends GeneratedMessageLite<Exercise$DataTypeArray, Builder> implements Exercise$DataTypeArrayOrBuilder {
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final Exercise$DataTypeArray DEFAULT_INSTANCE;
    private static volatile Parser<Exercise$DataTypeArray> PARSER;
    private static final Internal.ListAdapter.Converter<Integer, Exercise$DataType> dataType_converter_ = new a();
    private int dataTypeMemoizedSerializedSize;
    private Internal.IntList dataType_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<Exercise$DataTypeArray, Builder> implements Exercise$DataTypeArrayOrBuilder {
        public Builder addAllDataType(Iterable<? extends Exercise$DataType> iterable) {
            copyOnWrite();
            ((Exercise$DataTypeArray) this.instance).addAllDataType(iterable);
            return this;
        }

        public Builder addAllDataTypeValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((Exercise$DataTypeArray) this.instance).addAllDataTypeValue(iterable);
            return this;
        }

        public Builder addDataType(Exercise$DataType exercise$DataType) {
            copyOnWrite();
            ((Exercise$DataTypeArray) this.instance).addDataType(exercise$DataType);
            return this;
        }

        public Builder addDataTypeValue(int i) {
            copyOnWrite();
            ((Exercise$DataTypeArray) this.instance).addDataTypeValue(i);
            return this;
        }

        public Builder clearDataType() {
            copyOnWrite();
            ((Exercise$DataTypeArray) this.instance).clearDataType();
            return this;
        }

        @Override // com.heytap.wearable.health.Exercise$DataTypeArrayOrBuilder
        public Exercise$DataType getDataType(int i) {
            return ((Exercise$DataTypeArray) this.instance).getDataType(i);
        }

        @Override // com.heytap.wearable.health.Exercise$DataTypeArrayOrBuilder
        public int getDataTypeCount() {
            return ((Exercise$DataTypeArray) this.instance).getDataTypeCount();
        }

        @Override // com.heytap.wearable.health.Exercise$DataTypeArrayOrBuilder
        public List<Exercise$DataType> getDataTypeList() {
            return ((Exercise$DataTypeArray) this.instance).getDataTypeList();
        }

        @Override // com.heytap.wearable.health.Exercise$DataTypeArrayOrBuilder
        public int getDataTypeValue(int i) {
            return ((Exercise$DataTypeArray) this.instance).getDataTypeValue(i);
        }

        @Override // com.heytap.wearable.health.Exercise$DataTypeArrayOrBuilder
        public List<Integer> getDataTypeValueList() {
            return Collections.unmodifiableList(((Exercise$DataTypeArray) this.instance).getDataTypeValueList());
        }

        public Builder setDataType(int i, Exercise$DataType exercise$DataType) {
            copyOnWrite();
            ((Exercise$DataTypeArray) this.instance).setDataType(i, exercise$DataType);
            return this;
        }

        public Builder setDataTypeValue(int i, int i2) {
            copyOnWrite();
            ((Exercise$DataTypeArray) this.instance).setDataTypeValue(i, i2);
            return this;
        }

        private Builder() {
            super(Exercise$DataTypeArray.DEFAULT_INSTANCE);
        }
    }

    public class a implements Internal.ListAdapter.Converter<Integer, Exercise$DataType> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exercise$DataType convert(Integer num) {
            Exercise$DataType exercise$DataTypeForNumber = Exercise$DataType.forNumber(num.intValue());
            return exercise$DataTypeForNumber == null ? Exercise$DataType.UNRECOGNIZED : exercise$DataTypeForNumber;
        }
    }

    static {
        Exercise$DataTypeArray exercise$DataTypeArray = new Exercise$DataTypeArray();
        DEFAULT_INSTANCE = exercise$DataTypeArray;
        GeneratedMessageLite.registerDefaultInstance(Exercise$DataTypeArray.class, exercise$DataTypeArray);
    }

    private Exercise$DataTypeArray() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDataType(Iterable<? extends Exercise$DataType> iterable) {
        ensureDataTypeIsMutable();
        Iterator<? extends Exercise$DataType> it = iterable.iterator();
        while (it.hasNext()) {
            this.dataType_.addInt(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDataTypeValue(Iterable<Integer> iterable) {
        ensureDataTypeIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.dataType_.addInt(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataType(Exercise$DataType exercise$DataType) {
        exercise$DataType.getClass();
        ensureDataTypeIsMutable();
        this.dataType_.addInt(exercise$DataType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataTypeValue(int i) {
        ensureDataTypeIsMutable();
        this.dataType_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataType() {
        this.dataType_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureDataTypeIsMutable() {
        Internal.IntList intList = this.dataType_;
        if (intList.isModifiable()) {
            return;
        }
        this.dataType_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static Exercise$DataTypeArray getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Exercise$DataTypeArray parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Exercise$DataTypeArray) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$DataTypeArray parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Exercise$DataTypeArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Exercise$DataTypeArray> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataType(int i, Exercise$DataType exercise$DataType) {
        exercise$DataType.getClass();
        ensureDataTypeIsMutable();
        this.dataType_.setInt(i, exercise$DataType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataTypeValue(int i, int i2) {
        ensureDataTypeIsMutable();
        this.dataType_.setInt(i, i2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = dv6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Exercise$DataTypeArray();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"dataType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Exercise$DataTypeArray> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Exercise$DataTypeArray.class) {
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

    @Override // com.heytap.wearable.health.Exercise$DataTypeArrayOrBuilder
    public Exercise$DataType getDataType(int i) {
        Exercise$DataType exercise$DataTypeForNumber = Exercise$DataType.forNumber(this.dataType_.getInt(i));
        return exercise$DataTypeForNumber == null ? Exercise$DataType.UNRECOGNIZED : exercise$DataTypeForNumber;
    }

    @Override // com.heytap.wearable.health.Exercise$DataTypeArrayOrBuilder
    public int getDataTypeCount() {
        return this.dataType_.size();
    }

    @Override // com.heytap.wearable.health.Exercise$DataTypeArrayOrBuilder
    public List<Exercise$DataType> getDataTypeList() {
        return new Internal.ListAdapter(this.dataType_, dataType_converter_);
    }

    @Override // com.heytap.wearable.health.Exercise$DataTypeArrayOrBuilder
    public int getDataTypeValue(int i) {
        return this.dataType_.getInt(i);
    }

    @Override // com.heytap.wearable.health.Exercise$DataTypeArrayOrBuilder
    public List<Integer> getDataTypeValueList() {
        return this.dataType_;
    }

    public static Builder newBuilder(Exercise$DataTypeArray exercise$DataTypeArray) {
        return DEFAULT_INSTANCE.createBuilder(exercise$DataTypeArray);
    }

    public static Exercise$DataTypeArray parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$DataTypeArray) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$DataTypeArray parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$DataTypeArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Exercise$DataTypeArray parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Exercise$DataTypeArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Exercise$DataTypeArray parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$DataTypeArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Exercise$DataTypeArray parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Exercise$DataTypeArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Exercise$DataTypeArray parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$DataTypeArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Exercise$DataTypeArray parseFrom(InputStream inputStream) throws IOException {
        return (Exercise$DataTypeArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$DataTypeArray parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$DataTypeArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$DataTypeArray parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Exercise$DataTypeArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Exercise$DataTypeArray parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$DataTypeArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
