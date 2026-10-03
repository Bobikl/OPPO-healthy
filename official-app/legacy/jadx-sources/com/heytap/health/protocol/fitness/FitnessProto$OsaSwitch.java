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
public final class FitnessProto$OsaSwitch extends GeneratedMessageLite<FitnessProto$OsaSwitch, Builder> implements FitnessProto$OsaSwitchOrBuilder {
    private static final FitnessProto$OsaSwitch DEFAULT_INSTANCE;
    public static final int OSA_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$OsaSwitch> PARSER;
    private int osa_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$OsaSwitch, Builder> implements FitnessProto$OsaSwitchOrBuilder {
        public Builder clearOsa() {
            copyOnWrite();
            ((FitnessProto$OsaSwitch) this.instance).clearOsa();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaSwitchOrBuilder
        public int getOsa() {
            return ((FitnessProto$OsaSwitch) this.instance).getOsa();
        }

        public Builder setOsa(int i) {
            copyOnWrite();
            ((FitnessProto$OsaSwitch) this.instance).setOsa(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$OsaSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$OsaSwitch fitnessProto$OsaSwitch = new FitnessProto$OsaSwitch();
        DEFAULT_INSTANCE = fitnessProto$OsaSwitch;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$OsaSwitch.class, fitnessProto$OsaSwitch);
    }

    private FitnessProto$OsaSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsa() {
        this.osa_ = 0;
    }

    public static FitnessProto$OsaSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$OsaSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$OsaSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$OsaSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$OsaSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsa(int i) {
        this.osa_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$OsaSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"osa_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$OsaSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$OsaSwitch.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaSwitchOrBuilder
    public int getOsa() {
        return this.osa_;
    }

    public static Builder newBuilder(FitnessProto$OsaSwitch fitnessProto$OsaSwitch) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$OsaSwitch);
    }

    public static FitnessProto$OsaSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$OsaSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$OsaSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$OsaSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$OsaSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$OsaSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$OsaSwitch parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$OsaSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$OsaSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$OsaSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$OsaSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$OsaSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
