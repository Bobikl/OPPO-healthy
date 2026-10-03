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
public final class FitnessProto$FamilyBloodGlucoseNotice extends GeneratedMessageLite<FitnessProto$FamilyBloodGlucoseNotice, Builder> implements FitnessProto$FamilyBloodGlucoseNoticeOrBuilder {
    public static final int ALERTTYPE_FIELD_NUMBER = 4;
    private static final FitnessProto$FamilyBloodGlucoseNotice DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$FamilyBloodGlucoseNotice> PARSER = null;
    public static final int THRESHOLD_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int alertType_;
    private float threshold_;
    private int timestamp_;
    private float value_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$FamilyBloodGlucoseNotice, Builder> implements FitnessProto$FamilyBloodGlucoseNoticeOrBuilder {
        public Builder clearAlertType() {
            copyOnWrite();
            ((FitnessProto$FamilyBloodGlucoseNotice) this.instance).clearAlertType();
            return this;
        }

        public Builder clearThreshold() {
            copyOnWrite();
            ((FitnessProto$FamilyBloodGlucoseNotice) this.instance).clearThreshold();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProto$FamilyBloodGlucoseNotice) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((FitnessProto$FamilyBloodGlucoseNotice) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyBloodGlucoseNoticeOrBuilder
        public int getAlertType() {
            return ((FitnessProto$FamilyBloodGlucoseNotice) this.instance).getAlertType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyBloodGlucoseNoticeOrBuilder
        public float getThreshold() {
            return ((FitnessProto$FamilyBloodGlucoseNotice) this.instance).getThreshold();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyBloodGlucoseNoticeOrBuilder
        public int getTimestamp() {
            return ((FitnessProto$FamilyBloodGlucoseNotice) this.instance).getTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyBloodGlucoseNoticeOrBuilder
        public float getValue() {
            return ((FitnessProto$FamilyBloodGlucoseNotice) this.instance).getValue();
        }

        public Builder setAlertType(int i) {
            copyOnWrite();
            ((FitnessProto$FamilyBloodGlucoseNotice) this.instance).setAlertType(i);
            return this;
        }

        public Builder setThreshold(float f) {
            copyOnWrite();
            ((FitnessProto$FamilyBloodGlucoseNotice) this.instance).setThreshold(f);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$FamilyBloodGlucoseNotice) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setValue(float f) {
            copyOnWrite();
            ((FitnessProto$FamilyBloodGlucoseNotice) this.instance).setValue(f);
            return this;
        }

        private Builder() {
            super(FitnessProto$FamilyBloodGlucoseNotice.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$FamilyBloodGlucoseNotice fitnessProto$FamilyBloodGlucoseNotice = new FitnessProto$FamilyBloodGlucoseNotice();
        DEFAULT_INSTANCE = fitnessProto$FamilyBloodGlucoseNotice;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$FamilyBloodGlucoseNotice.class, fitnessProto$FamilyBloodGlucoseNotice);
    }

    private FitnessProto$FamilyBloodGlucoseNotice() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertType() {
        this.alertType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreshold() {
        this.threshold_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0.0f;
    }

    public static FitnessProto$FamilyBloodGlucoseNotice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$FamilyBloodGlucoseNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$FamilyBloodGlucoseNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$FamilyBloodGlucoseNotice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyBloodGlucoseNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$FamilyBloodGlucoseNotice> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertType(int i) {
        this.alertType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreshold(float f) {
        this.threshold_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(float f) {
        this.value_ = f;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$FamilyBloodGlucoseNotice();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0001\u0003\u0001\u0004\u0004", new Object[]{"timestamp_", "value_", "threshold_", "alertType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$FamilyBloodGlucoseNotice> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$FamilyBloodGlucoseNotice.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyBloodGlucoseNoticeOrBuilder
    public int getAlertType() {
        return this.alertType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyBloodGlucoseNoticeOrBuilder
    public float getThreshold() {
        return this.threshold_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyBloodGlucoseNoticeOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyBloodGlucoseNoticeOrBuilder
    public float getValue() {
        return this.value_;
    }

    public static Builder newBuilder(FitnessProto$FamilyBloodGlucoseNotice fitnessProto$FamilyBloodGlucoseNotice) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$FamilyBloodGlucoseNotice);
    }

    public static FitnessProto$FamilyBloodGlucoseNotice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FamilyBloodGlucoseNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$FamilyBloodGlucoseNotice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyBloodGlucoseNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$FamilyBloodGlucoseNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyBloodGlucoseNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$FamilyBloodGlucoseNotice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyBloodGlucoseNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$FamilyBloodGlucoseNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyBloodGlucoseNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$FamilyBloodGlucoseNotice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyBloodGlucoseNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$FamilyBloodGlucoseNotice parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$FamilyBloodGlucoseNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$FamilyBloodGlucoseNotice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FamilyBloodGlucoseNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$FamilyBloodGlucoseNotice parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$FamilyBloodGlucoseNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$FamilyBloodGlucoseNotice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FamilyBloodGlucoseNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
