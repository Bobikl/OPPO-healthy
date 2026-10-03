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
public final class MenstrualCycle$SymptomRequest extends GeneratedMessageLite<MenstrualCycle$SymptomRequest, Builder> implements MenstrualCycle$SymptomRequestOrBuilder {
    private static final MenstrualCycle$SymptomRequest DEFAULT_INSTANCE;
    public static final int PACKAGEID_FIELD_NUMBER = 2;
    private static volatile Parser<MenstrualCycle$SymptomRequest> PARSER = null;
    public static final int SYNCTIME_FIELD_NUMBER = 1;
    private int packageId_;
    private int syncTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$SymptomRequest, Builder> implements MenstrualCycle$SymptomRequestOrBuilder {
        public Builder clearPackageId() {
            copyOnWrite();
            ((MenstrualCycle$SymptomRequest) this.instance).clearPackageId();
            return this;
        }

        public Builder clearSyncTime() {
            copyOnWrite();
            ((MenstrualCycle$SymptomRequest) this.instance).clearSyncTime();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomRequestOrBuilder
        public int getPackageId() {
            return ((MenstrualCycle$SymptomRequest) this.instance).getPackageId();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomRequestOrBuilder
        public int getSyncTime() {
            return ((MenstrualCycle$SymptomRequest) this.instance).getSyncTime();
        }

        public Builder setPackageId(int i) {
            copyOnWrite();
            ((MenstrualCycle$SymptomRequest) this.instance).setPackageId(i);
            return this;
        }

        public Builder setSyncTime(int i) {
            copyOnWrite();
            ((MenstrualCycle$SymptomRequest) this.instance).setSyncTime(i);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$SymptomRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        MenstrualCycle$SymptomRequest menstrualCycle$SymptomRequest = new MenstrualCycle$SymptomRequest();
        DEFAULT_INSTANCE = menstrualCycle$SymptomRequest;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$SymptomRequest.class, menstrualCycle$SymptomRequest);
    }

    private MenstrualCycle$SymptomRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageId() {
        this.packageId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncTime() {
        this.syncTime_ = 0;
    }

    public static MenstrualCycle$SymptomRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$SymptomRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$SymptomRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$SymptomRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$SymptomRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageId(int i) {
        this.packageId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncTime(int i) {
        this.syncTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$SymptomRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"syncTime_", "packageId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$SymptomRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$SymptomRequest.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomRequestOrBuilder
    public int getPackageId() {
        return this.packageId_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomRequestOrBuilder
    public int getSyncTime() {
        return this.syncTime_;
    }

    public static Builder newBuilder(MenstrualCycle$SymptomRequest menstrualCycle$SymptomRequest) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$SymptomRequest);
    }

    public static MenstrualCycle$SymptomRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SymptomRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MenstrualCycle$SymptomRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$SymptomRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomRequest parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$SymptomRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$SymptomRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SymptomRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$SymptomRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$SymptomRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SymptomRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
