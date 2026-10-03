package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.in7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV2$SyncStatus extends GeneratedMessageLite<FitnessProtoV2$SyncStatus, Builder> implements FitnessProtoV2$SyncStatusOrBuilder {
    private static final FitnessProtoV2$SyncStatus DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProtoV2$SyncStatus> PARSER = null;
    public static final int SYNC_STATUS_FIELD_NUMBER = 1;
    private int syncStatus_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SyncStatus, Builder> implements FitnessProtoV2$SyncStatusOrBuilder {
        public Builder clearSyncStatus() {
            copyOnWrite();
            ((FitnessProtoV2$SyncStatus) this.instance).clearSyncStatus();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SyncStatusOrBuilder
        public int getSyncStatus() {
            return ((FitnessProtoV2$SyncStatus) this.instance).getSyncStatus();
        }

        public Builder setSyncStatus(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SyncStatus) this.instance).setSyncStatus(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SyncStatus.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SyncStatus fitnessProtoV2$SyncStatus = new FitnessProtoV2$SyncStatus();
        DEFAULT_INSTANCE = fitnessProtoV2$SyncStatus;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SyncStatus.class, fitnessProtoV2$SyncStatus);
    }

    private FitnessProtoV2$SyncStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncStatus() {
        this.syncStatus_ = 0;
    }

    public static FitnessProtoV2$SyncStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SyncStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SyncStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SyncStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SyncStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SyncStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncStatus(int i) {
        this.syncStatus_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SyncStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"syncStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SyncStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SyncStatus.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SyncStatusOrBuilder
    public int getSyncStatus() {
        return this.syncStatus_;
    }

    public static Builder newBuilder(FitnessProtoV2$SyncStatus fitnessProtoV2$SyncStatus) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SyncStatus);
    }

    public static FitnessProtoV2$SyncStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SyncStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SyncStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SyncStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SyncStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SyncStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SyncStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SyncStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SyncStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SyncStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SyncStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SyncStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SyncStatus parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SyncStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SyncStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SyncStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SyncStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SyncStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SyncStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SyncStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
