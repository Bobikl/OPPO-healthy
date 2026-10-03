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
public final class MenstrualCycle$Symptom extends GeneratedMessageLite<MenstrualCycle$Symptom, Builder> implements MenstrualCycle$SymptomOrBuilder {
    private static final MenstrualCycle$Symptom DEFAULT_INSTANCE;
    public static final int MODIFIEDTIME_FIELD_NUMBER = 3;
    private static volatile Parser<MenstrualCycle$Symptom> PARSER = null;
    public static final int SYMPTOMTYPE_FIELD_NUMBER = 1;
    public static final int SYMPTOMVALUE_FIELD_NUMBER = 2;
    private int modifiedTime_;
    private int symptomType_;
    private int symptomValue_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$Symptom, Builder> implements MenstrualCycle$SymptomOrBuilder {
        public Builder clearModifiedTime() {
            copyOnWrite();
            ((MenstrualCycle$Symptom) this.instance).clearModifiedTime();
            return this;
        }

        public Builder clearSymptomType() {
            copyOnWrite();
            ((MenstrualCycle$Symptom) this.instance).clearSymptomType();
            return this;
        }

        public Builder clearSymptomValue() {
            copyOnWrite();
            ((MenstrualCycle$Symptom) this.instance).clearSymptomValue();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomOrBuilder
        public int getModifiedTime() {
            return ((MenstrualCycle$Symptom) this.instance).getModifiedTime();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomOrBuilder
        public int getSymptomType() {
            return ((MenstrualCycle$Symptom) this.instance).getSymptomType();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomOrBuilder
        public int getSymptomValue() {
            return ((MenstrualCycle$Symptom) this.instance).getSymptomValue();
        }

        public Builder setModifiedTime(int i) {
            copyOnWrite();
            ((MenstrualCycle$Symptom) this.instance).setModifiedTime(i);
            return this;
        }

        public Builder setSymptomType(int i) {
            copyOnWrite();
            ((MenstrualCycle$Symptom) this.instance).setSymptomType(i);
            return this;
        }

        public Builder setSymptomValue(int i) {
            copyOnWrite();
            ((MenstrualCycle$Symptom) this.instance).setSymptomValue(i);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$Symptom.DEFAULT_INSTANCE);
        }
    }

    static {
        MenstrualCycle$Symptom menstrualCycle$Symptom = new MenstrualCycle$Symptom();
        DEFAULT_INSTANCE = menstrualCycle$Symptom;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$Symptom.class, menstrualCycle$Symptom);
    }

    private MenstrualCycle$Symptom() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModifiedTime() {
        this.modifiedTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymptomType() {
        this.symptomType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymptomValue() {
        this.symptomValue_ = 0;
    }

    public static MenstrualCycle$Symptom getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$Symptom parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$Symptom) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$Symptom parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Symptom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$Symptom> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModifiedTime(int i) {
        this.modifiedTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSymptomType(int i) {
        this.symptomType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSymptomValue(int i) {
        this.symptomValue_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$Symptom();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"symptomType_", "symptomValue_", "modifiedTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$Symptom> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$Symptom.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomOrBuilder
    public int getModifiedTime() {
        return this.modifiedTime_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomOrBuilder
    public int getSymptomType() {
        return this.symptomType_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomOrBuilder
    public int getSymptomValue() {
        return this.symptomValue_;
    }

    public static Builder newBuilder(MenstrualCycle$Symptom menstrualCycle$Symptom) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$Symptom);
    }

    public static MenstrualCycle$Symptom parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$Symptom) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$Symptom parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Symptom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$Symptom parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Symptom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MenstrualCycle$Symptom parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Symptom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$Symptom parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Symptom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$Symptom parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Symptom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$Symptom parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$Symptom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$Symptom parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$Symptom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$Symptom parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$Symptom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$Symptom parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$Symptom) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
