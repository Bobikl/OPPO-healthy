package com.oplus.ocs.wearengine.proto;

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
public final class DataProto$ExtraInfo extends GeneratedMessageLite<DataProto$ExtraInfo, Builder> implements DataProto$ExtraInfoOrBuilder {
    private static final DataProto$ExtraInfo DEFAULT_INSTANCE;
    public static final int EXTRA_INFO_VAL_FIELD_NUMBER = 1;
    private static volatile Parser<DataProto$ExtraInfo> PARSER;
    private ByteString extraInfoVal_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$ExtraInfo, Builder> implements DataProto$ExtraInfoOrBuilder {
        public Builder clearExtraInfoVal() {
            copyOnWrite();
            ((DataProto$ExtraInfo) this.instance).clearExtraInfoVal();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExtraInfoOrBuilder
        public ByteString getExtraInfoVal() {
            return ((DataProto$ExtraInfo) this.instance).getExtraInfoVal();
        }

        public Builder setExtraInfoVal(ByteString byteString) {
            copyOnWrite();
            ((DataProto$ExtraInfo) this.instance).setExtraInfoVal(byteString);
            return this;
        }

        private Builder() {
            super(DataProto$ExtraInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        DataProto$ExtraInfo dataProto$ExtraInfo = new DataProto$ExtraInfo();
        DEFAULT_INSTANCE = dataProto$ExtraInfo;
        GeneratedMessageLite.registerDefaultInstance(DataProto$ExtraInfo.class, dataProto$ExtraInfo);
    }

    private DataProto$ExtraInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtraInfoVal() {
        this.extraInfoVal_ = getDefaultInstance().getExtraInfoVal();
    }

    public static DataProto$ExtraInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$ExtraInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$ExtraInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$ExtraInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$ExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$ExtraInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraInfoVal(ByteString byteString) {
        byteString.getClass();
        this.extraInfoVal_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = vu4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DataProto$ExtraInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"extraInfoVal_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$ExtraInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$ExtraInfo.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExtraInfoOrBuilder
    public ByteString getExtraInfoVal() {
        return this.extraInfoVal_;
    }

    public static Builder newBuilder(DataProto$ExtraInfo dataProto$ExtraInfo) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$ExtraInfo);
    }

    public static DataProto$ExtraInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExtraInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$ExtraInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$ExtraInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$ExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DataProto$ExtraInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$ExtraInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$ExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$ExtraInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$ExtraInfo parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$ExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$ExtraInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$ExtraInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$ExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$ExtraInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
