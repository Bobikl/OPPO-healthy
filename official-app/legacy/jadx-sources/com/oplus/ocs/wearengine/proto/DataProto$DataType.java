package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.vu4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class DataProto$DataType extends GeneratedMessageLite<DataProto$DataType, Builder> implements DataProto$DataTypeOrBuilder {
    private static final DataProto$DataType DEFAULT_INSTANCE;
    public static final int FORMAT_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<DataProto$DataType> PARSER;
    private int format_;
    private String name_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$DataType, Builder> implements DataProto$DataTypeOrBuilder {
        public Builder clearFormat() {
            copyOnWrite();
            ((DataProto$DataType) this.instance).clearFormat();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DataProto$DataType) this.instance).clearName();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$DataTypeOrBuilder
        public int getFormat() {
            return ((DataProto$DataType) this.instance).getFormat();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$DataTypeOrBuilder
        public String getName() {
            return ((DataProto$DataType) this.instance).getName();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$DataTypeOrBuilder
        public ByteString getNameBytes() {
            return ((DataProto$DataType) this.instance).getNameBytes();
        }

        public Builder setFormat(int i) {
            copyOnWrite();
            ((DataProto$DataType) this.instance).setFormat(i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DataProto$DataType) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DataProto$DataType) this.instance).setNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(DataProto$DataType.DEFAULT_INSTANCE);
        }
    }

    static {
        DataProto$DataType dataProto$DataType = new DataProto$DataType();
        DEFAULT_INSTANCE = dataProto$DataType;
        GeneratedMessageLite.registerDefaultInstance(DataProto$DataType.class, dataProto$DataType);
    }

    private DataProto$DataType() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFormat() {
        this.format_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static DataProto$DataType getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$DataType parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$DataType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$DataType parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$DataType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$DataType> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFormat(int i) {
        this.format_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = vu4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DataProto$DataType();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"name_", "format_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$DataType> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$DataType.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.DataProto$DataTypeOrBuilder
    public int getFormat() {
        return this.format_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$DataTypeOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$DataTypeOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static Builder newBuilder(DataProto$DataType dataProto$DataType) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$DataType);
    }

    public static DataProto$DataType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$DataType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$DataType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$DataType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$DataType parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$DataType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DataProto$DataType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$DataType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$DataType parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$DataType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$DataType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$DataType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$DataType parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$DataType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$DataType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$DataType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$DataType parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$DataType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$DataType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$DataType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
