package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.rsb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class MenstrualCycle$SelectSymptomType extends GeneratedMessageLite<MenstrualCycle$SelectSymptomType, Builder> implements MenstrualCycle$SelectSymptomTypeOrBuilder {
    private static final MenstrualCycle$SelectSymptomType DEFAULT_INSTANCE;
    private static volatile Parser<MenstrualCycle$SelectSymptomType> PARSER = null;
    public static final int SYMPTOMTYPE_FIELD_NUMBER = 1;
    private int symptomType_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$SelectSymptomType, Builder> implements MenstrualCycle$SelectSymptomTypeOrBuilder {
        public Builder clearSymptomType() {
            copyOnWrite();
            ((MenstrualCycle$SelectSymptomType) this.instance).clearSymptomType();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SelectSymptomTypeOrBuilder
        public int getSymptomType() {
            return ((MenstrualCycle$SelectSymptomType) this.instance).getSymptomType();
        }

        public Builder setSymptomType(int i) {
            copyOnWrite();
            ((MenstrualCycle$SelectSymptomType) this.instance).setSymptomType(i);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$SelectSymptomType.DEFAULT_INSTANCE);
        }
    }

    static {
        MenstrualCycle$SelectSymptomType menstrualCycle$SelectSymptomType = new MenstrualCycle$SelectSymptomType();
        DEFAULT_INSTANCE = menstrualCycle$SelectSymptomType;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$SelectSymptomType.class, menstrualCycle$SelectSymptomType);
    }

    private MenstrualCycle$SelectSymptomType() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymptomType() {
        this.symptomType_ = 0;
    }

    public static MenstrualCycle$SelectSymptomType getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$SelectSymptomType parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$SelectSymptomType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$SelectSymptomType parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SelectSymptomType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$SelectSymptomType> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSymptomType(int i) {
        this.symptomType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$SelectSymptomType();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"symptomType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$SelectSymptomType> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$SelectSymptomType.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SelectSymptomTypeOrBuilder
    public int getSymptomType() {
        return this.symptomType_;
    }

    public static Builder newBuilder(MenstrualCycle$SelectSymptomType menstrualCycle$SelectSymptomType) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$SelectSymptomType);
    }

    public static MenstrualCycle$SelectSymptomType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SelectSymptomType) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$SelectSymptomType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SelectSymptomType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$SelectSymptomType parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SelectSymptomType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MenstrualCycle$SelectSymptomType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SelectSymptomType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$SelectSymptomType parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SelectSymptomType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$SelectSymptomType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SelectSymptomType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$SelectSymptomType parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$SelectSymptomType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$SelectSymptomType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SelectSymptomType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$SelectSymptomType parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$SelectSymptomType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$SelectSymptomType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SelectSymptomType) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
