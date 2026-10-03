package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.vu4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class DataProto$Value extends GeneratedMessageLite<DataProto$Value, Builder> implements DataProto$ValueOrBuilder {
    public static final int BOOL_VAL_FIELD_NUMBER = 1;
    public static final int BYTE_ARRAY_VAL_FIELD_NUMBER = 5;
    private static final DataProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_ARRAY_VAL_FIELD_NUMBER = 4;
    public static final int DOUBLE_VAL_FIELD_NUMBER = 3;
    public static final int LONG_VAL_FIELD_NUMBER = 2;
    private static volatile Parser<DataProto$Value> PARSER;
    private int valueCase_ = 0;
    private Object value_;

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$Value, Builder> implements DataProto$ValueOrBuilder {
        public Builder clearBoolVal() {
            copyOnWrite();
            ((DataProto$Value) this.instance).clearBoolVal();
            return this;
        }

        public Builder clearByteArrayVal() {
            copyOnWrite();
            ((DataProto$Value) this.instance).clearByteArrayVal();
            return this;
        }

        public Builder clearDoubleArrayVal() {
            copyOnWrite();
            ((DataProto$Value) this.instance).clearDoubleArrayVal();
            return this;
        }

        public Builder clearDoubleVal() {
            copyOnWrite();
            ((DataProto$Value) this.instance).clearDoubleVal();
            return this;
        }

        public Builder clearLongVal() {
            copyOnWrite();
            ((DataProto$Value) this.instance).clearLongVal();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((DataProto$Value) this.instance).clearValue();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
        public boolean getBoolVal() {
            return ((DataProto$Value) this.instance).getBoolVal();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
        public ByteString getByteArrayVal() {
            return ((DataProto$Value) this.instance).getByteArrayVal();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
        public DoubleArray getDoubleArrayVal() {
            return ((DataProto$Value) this.instance).getDoubleArrayVal();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
        public double getDoubleVal() {
            return ((DataProto$Value) this.instance).getDoubleVal();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
        public long getLongVal() {
            return ((DataProto$Value) this.instance).getLongVal();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
        public ValueCase getValueCase() {
            return ((DataProto$Value) this.instance).getValueCase();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
        public boolean hasBoolVal() {
            return ((DataProto$Value) this.instance).hasBoolVal();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
        public boolean hasByteArrayVal() {
            return ((DataProto$Value) this.instance).hasByteArrayVal();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
        public boolean hasDoubleArrayVal() {
            return ((DataProto$Value) this.instance).hasDoubleArrayVal();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
        public boolean hasDoubleVal() {
            return ((DataProto$Value) this.instance).hasDoubleVal();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
        public boolean hasLongVal() {
            return ((DataProto$Value) this.instance).hasLongVal();
        }

        public Builder mergeDoubleArrayVal(DoubleArray doubleArray) {
            copyOnWrite();
            ((DataProto$Value) this.instance).mergeDoubleArrayVal(doubleArray);
            return this;
        }

        public Builder setBoolVal(boolean z) {
            copyOnWrite();
            ((DataProto$Value) this.instance).setBoolVal(z);
            return this;
        }

        public Builder setByteArrayVal(ByteString byteString) {
            copyOnWrite();
            ((DataProto$Value) this.instance).setByteArrayVal(byteString);
            return this;
        }

        public Builder setDoubleArrayVal(DoubleArray doubleArray) {
            copyOnWrite();
            ((DataProto$Value) this.instance).setDoubleArrayVal(doubleArray);
            return this;
        }

        public Builder setDoubleVal(double d) {
            copyOnWrite();
            ((DataProto$Value) this.instance).setDoubleVal(d);
            return this;
        }

        public Builder setLongVal(long j2) {
            copyOnWrite();
            ((DataProto$Value) this.instance).setLongVal(j2);
            return this;
        }

        private Builder() {
            super(DataProto$Value.DEFAULT_INSTANCE);
        }

        public Builder setDoubleArrayVal(DoubleArray.Builder builder) {
            copyOnWrite();
            ((DataProto$Value) this.instance).setDoubleArrayVal(builder.build());
            return this;
        }
    }

    public static final class DoubleArray extends GeneratedMessageLite<DoubleArray, Builder> implements DoubleArrayOrBuilder {
        private static final DoubleArray DEFAULT_INSTANCE;
        public static final int DOUBLE_ARRAY_FIELD_NUMBER = 1;
        private static volatile Parser<DoubleArray> PARSER;
        private int doubleArrayMemoizedSerializedSize = -1;
        private Internal.DoubleList doubleArray_ = GeneratedMessageLite.emptyDoubleList();

        public static final class Builder extends GeneratedMessageLite.Builder<DoubleArray, Builder> implements DoubleArrayOrBuilder {
            public Builder addAllDoubleArray(Iterable<? extends Double> iterable) {
                copyOnWrite();
                ((DoubleArray) this.instance).addAllDoubleArray(iterable);
                return this;
            }

            public Builder addDoubleArray(double d) {
                copyOnWrite();
                ((DoubleArray) this.instance).addDoubleArray(d);
                return this;
            }

            public Builder clearDoubleArray() {
                copyOnWrite();
                ((DoubleArray) this.instance).clearDoubleArray();
                return this;
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$Value.DoubleArrayOrBuilder
            public double getDoubleArray(int i) {
                return ((DoubleArray) this.instance).getDoubleArray(i);
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$Value.DoubleArrayOrBuilder
            public int getDoubleArrayCount() {
                return ((DoubleArray) this.instance).getDoubleArrayCount();
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$Value.DoubleArrayOrBuilder
            public List<Double> getDoubleArrayList() {
                return Collections.unmodifiableList(((DoubleArray) this.instance).getDoubleArrayList());
            }

            public Builder setDoubleArray(int i, double d) {
                copyOnWrite();
                ((DoubleArray) this.instance).setDoubleArray(i, d);
                return this;
            }

            private Builder() {
                super(DoubleArray.DEFAULT_INSTANCE);
            }
        }

        static {
            DoubleArray doubleArray = new DoubleArray();
            DEFAULT_INSTANCE = doubleArray;
            GeneratedMessageLite.registerDefaultInstance(DoubleArray.class, doubleArray);
        }

        private DoubleArray() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDoubleArray(Iterable<? extends Double> iterable) {
            ensureDoubleArrayIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.doubleArray_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDoubleArray(double d) {
            ensureDoubleArrayIsMutable();
            this.doubleArray_.addDouble(d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDoubleArray() {
            this.doubleArray_ = GeneratedMessageLite.emptyDoubleList();
        }

        private void ensureDoubleArrayIsMutable() {
            Internal.DoubleList doubleList = this.doubleArray_;
            if (doubleList.isModifiable()) {
                return;
            }
            this.doubleArray_ = GeneratedMessageLite.mutableCopy(doubleList);
        }

        public static DoubleArray getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DoubleArray parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DoubleArray) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DoubleArray parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DoubleArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DoubleArray> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDoubleArray(int i, double d) {
            ensureDoubleArrayIsMutable();
            this.doubleArray_.setDouble(i, d);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = vu4.a[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new DoubleArray();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"doubleArray_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DoubleArray> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DoubleArray.class) {
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

        @Override // com.oplus.ocs.wearengine.proto.DataProto$Value.DoubleArrayOrBuilder
        public double getDoubleArray(int i) {
            return this.doubleArray_.getDouble(i);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$Value.DoubleArrayOrBuilder
        public int getDoubleArrayCount() {
            return this.doubleArray_.size();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$Value.DoubleArrayOrBuilder
        public List<Double> getDoubleArrayList() {
            return this.doubleArray_;
        }

        public static Builder newBuilder(DoubleArray doubleArray) {
            return DEFAULT_INSTANCE.createBuilder(doubleArray);
        }

        public static DoubleArray parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DoubleArray) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DoubleArray parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DoubleArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DoubleArray parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DoubleArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DoubleArray parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DoubleArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DoubleArray parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DoubleArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DoubleArray parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DoubleArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DoubleArray parseFrom(InputStream inputStream) throws IOException {
            return (DoubleArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DoubleArray parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DoubleArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DoubleArray parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DoubleArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DoubleArray parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DoubleArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DoubleArrayOrBuilder extends MessageLiteOrBuilder {
        double getDoubleArray(int i);

        int getDoubleArrayCount();

        List<Double> getDoubleArrayList();
    }

    public enum ValueCase {
        BOOL_VAL(1),
        LONG_VAL(2),
        DOUBLE_VAL(3),
        DOUBLE_ARRAY_VAL(4),
        BYTE_ARRAY_VAL(5),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i) {
            this.value = i;
        }

        public static ValueCase forNumber(int i) {
            if (i == 0) {
                return VALUE_NOT_SET;
            }
            if (i == 1) {
                return BOOL_VAL;
            }
            if (i == 2) {
                return LONG_VAL;
            }
            if (i == 3) {
                return DOUBLE_VAL;
            }
            if (i == 4) {
                return DOUBLE_ARRAY_VAL;
            }
            if (i != 5) {
                return null;
            }
            return BYTE_ARRAY_VAL;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ValueCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        DataProto$Value dataProto$Value = new DataProto$Value();
        DEFAULT_INSTANCE = dataProto$Value;
        GeneratedMessageLite.registerDefaultInstance(DataProto$Value.class, dataProto$Value);
    }

    private DataProto$Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolVal() {
        if (this.valueCase_ == 1) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearByteArrayVal() {
        if (this.valueCase_ == 5) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleArrayVal() {
        if (this.valueCase_ == 4) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleVal() {
        if (this.valueCase_ == 3) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongVal() {
        if (this.valueCase_ == 2) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    public static DataProto$Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDoubleArrayVal(DoubleArray doubleArray) {
        doubleArray.getClass();
        if (this.valueCase_ != 4 || this.value_ == DoubleArray.getDefaultInstance()) {
            this.value_ = doubleArray;
        } else {
            this.value_ = DoubleArray.newBuilder((DoubleArray) this.value_).mergeFrom(doubleArray).buildPartial();
        }
        this.valueCase_ = 4;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolVal(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setByteArrayVal(ByteString byteString) {
        byteString.getClass();
        this.valueCase_ = 5;
        this.value_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleArrayVal(DoubleArray doubleArray) {
        doubleArray.getClass();
        this.value_ = doubleArray;
        this.valueCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleVal(double d) {
        this.valueCase_ = 3;
        this.value_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongVal(long j2) {
        this.valueCase_ = 2;
        this.value_ = Long.valueOf(j2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = vu4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DataProto$Value();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0004<\u0000\u0005=\u0000", new Object[]{"value_", "valueCase_", DoubleArray.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$Value> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$Value.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
    public boolean getBoolVal() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
    public ByteString getByteArrayVal() {
        return this.valueCase_ == 5 ? (ByteString) this.value_ : ByteString.EMPTY;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
    public DoubleArray getDoubleArrayVal() {
        return this.valueCase_ == 4 ? (DoubleArray) this.value_ : DoubleArray.getDefaultInstance();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
    public double getDoubleVal() {
        if (this.valueCase_ == 3) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
    public long getLongVal() {
        if (this.valueCase_ == 2) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
    public ValueCase getValueCase() {
        return ValueCase.forNumber(this.valueCase_);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
    public boolean hasBoolVal() {
        return this.valueCase_ == 1;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
    public boolean hasByteArrayVal() {
        return this.valueCase_ == 5;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
    public boolean hasDoubleArrayVal() {
        return this.valueCase_ == 4;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
    public boolean hasDoubleVal() {
        return this.valueCase_ == 3;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ValueOrBuilder
    public boolean hasLongVal() {
        return this.valueCase_ == 2;
    }

    public static Builder newBuilder(DataProto$Value dataProto$Value) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$Value);
    }

    public static DataProto$Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DataProto$Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$Value parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$Value parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
