package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$OsaStateRsp extends GeneratedMessageLite<FitnessProto$OsaStateRsp, Builder> implements FitnessProto$OsaStateRspOrBuilder {
    private static final FitnessProto$OsaStateRsp DEFAULT_INSTANCE;
    public static final int ERRORCODE_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProto$OsaStateRsp> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int errorCode_;
    private int type_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$OsaStateRsp, Builder> implements FitnessProto$OsaStateRspOrBuilder {
        private Builder() {
            super(FitnessProto$OsaStateRsp.DEFAULT_INSTANCE);
        }

        public Builder clearErrorCode() {
            copyOnWrite();
            ((FitnessProto$OsaStateRsp) this.instance).clearErrorCode();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FitnessProto$OsaStateRsp) this.instance).clearType();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((FitnessProto$OsaStateRsp) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaStateRspOrBuilder
        public int getErrorCode() {
            return ((FitnessProto$OsaStateRsp) this.instance).getErrorCode();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaStateRspOrBuilder
        public int getType() {
            return ((FitnessProto$OsaStateRsp) this.instance).getType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaStateRspOrBuilder
        public int getValue() {
            return ((FitnessProto$OsaStateRsp) this.instance).getValue();
        }

        public Builder setErrorCode(int i) {
            copyOnWrite();
            ((FitnessProto$OsaStateRsp) this.instance).setErrorCode(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((FitnessProto$OsaStateRsp) this.instance).setType(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((FitnessProto$OsaStateRsp) this.instance).setValue(i);
            return this;
        }
    }

    static {
        FitnessProto$OsaStateRsp fitnessProto$OsaStateRsp = new FitnessProto$OsaStateRsp();
        DEFAULT_INSTANCE = fitnessProto$OsaStateRsp;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$OsaStateRsp.class, fitnessProto$OsaStateRsp);
    }

    private FitnessProto$OsaStateRsp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.errorCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static FitnessProto$OsaStateRsp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$OsaStateRsp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$OsaStateRsp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$OsaStateRsp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$OsaStateRsp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(int i) {
        this.errorCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$OsaStateRsp();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"type_", "value_", "errorCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$OsaStateRsp> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$OsaStateRsp.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaStateRspOrBuilder
    public int getErrorCode() {
        return this.errorCode_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaStateRspOrBuilder
    public int getType() {
        return this.type_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaStateRspOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(FitnessProto$OsaStateRsp fitnessProto$OsaStateRsp) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$OsaStateRsp);
    }

    public static FitnessProto$OsaStateRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaStateRsp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$OsaStateRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$OsaStateRsp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$OsaStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$OsaStateRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$OsaStateRsp parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$OsaStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$OsaStateRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$OsaStateRsp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$OsaStateRsp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$OsaStateRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$OsaStateRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
