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
public final class FitnessProto$FamilyBloodGlucoseDeviceNotice extends GeneratedMessageLite<FitnessProto$FamilyBloodGlucoseDeviceNotice, Builder> implements FitnessProto$FamilyBloodGlucoseDeviceNoticeOrBuilder {
    public static final int ALERTTYPE_FIELD_NUMBER = 2;
    private static final FitnessProto$FamilyBloodGlucoseDeviceNotice DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$FamilyBloodGlucoseDeviceNotice> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int alertType_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$FamilyBloodGlucoseDeviceNotice, Builder> implements FitnessProto$FamilyBloodGlucoseDeviceNoticeOrBuilder {
        public Builder clearAlertType() {
            copyOnWrite();
            ((FitnessProto$FamilyBloodGlucoseDeviceNotice) this.instance).clearAlertType();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProto$FamilyBloodGlucoseDeviceNotice) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyBloodGlucoseDeviceNoticeOrBuilder
        public int getAlertType() {
            return ((FitnessProto$FamilyBloodGlucoseDeviceNotice) this.instance).getAlertType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyBloodGlucoseDeviceNoticeOrBuilder
        public int getTimestamp() {
            return ((FitnessProto$FamilyBloodGlucoseDeviceNotice) this.instance).getTimestamp();
        }

        public Builder setAlertType(int i) {
            copyOnWrite();
            ((FitnessProto$FamilyBloodGlucoseDeviceNotice) this.instance).setAlertType(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$FamilyBloodGlucoseDeviceNotice) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$FamilyBloodGlucoseDeviceNotice.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$FamilyBloodGlucoseDeviceNotice fitnessProto$FamilyBloodGlucoseDeviceNotice = new FitnessProto$FamilyBloodGlucoseDeviceNotice();
        DEFAULT_INSTANCE = fitnessProto$FamilyBloodGlucoseDeviceNotice;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$FamilyBloodGlucoseDeviceNotice.class, fitnessProto$FamilyBloodGlucoseDeviceNotice);
    }

    private FitnessProto$FamilyBloodGlucoseDeviceNotice() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertType() {
        this.alertType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$FamilyBloodGlucoseDeviceNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyBloodGlucoseDeviceNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$FamilyBloodGlucoseDeviceNotice> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertType(int i) {
        this.alertType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$FamilyBloodGlucoseDeviceNotice();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"timestamp_", "alertType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$FamilyBloodGlucoseDeviceNotice> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$FamilyBloodGlucoseDeviceNotice.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyBloodGlucoseDeviceNoticeOrBuilder
    public int getAlertType() {
        return this.alertType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilyBloodGlucoseDeviceNoticeOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(FitnessProto$FamilyBloodGlucoseDeviceNotice fitnessProto$FamilyBloodGlucoseDeviceNotice) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$FamilyBloodGlucoseDeviceNotice);
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FamilyBloodGlucoseDeviceNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyBloodGlucoseDeviceNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyBloodGlucoseDeviceNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyBloodGlucoseDeviceNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyBloodGlucoseDeviceNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilyBloodGlucoseDeviceNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$FamilyBloodGlucoseDeviceNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FamilyBloodGlucoseDeviceNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$FamilyBloodGlucoseDeviceNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$FamilyBloodGlucoseDeviceNotice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FamilyBloodGlucoseDeviceNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
