package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.pi7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProto$PacketIndexData extends GeneratedMessageLite<FitnessProto$PacketIndexData, Builder> implements FitnessProto$PacketIndexDataOrBuilder {
    private static final FitnessProto$PacketIndexData DEFAULT_INSTANCE;
    public static final int MAX_DAY_CNT_FIELD_NUMBER = 3;
    public static final int PACK_TOTAL_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$PacketIndexData> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 2;
    private int maxDayCnt_;
    private int packTotal_;
    private String sessionId_ = "";
    private int startTimestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$PacketIndexData, Builder> implements FitnessProto$PacketIndexDataOrBuilder {
        public Builder clearMaxDayCnt() {
            copyOnWrite();
            ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).clearMaxDayCnt();
            return this;
        }

        public Builder clearPackTotal() {
            copyOnWrite();
            ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).clearPackTotal();
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).clearSessionId();
            return this;
        }

        public Builder clearStartTimestamp() {
            copyOnWrite();
            ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).clearStartTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketIndexDataOrBuilder
        public int getMaxDayCnt() {
            return ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).getMaxDayCnt();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketIndexDataOrBuilder
        public int getPackTotal() {
            return ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).getPackTotal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketIndexDataOrBuilder
        public String getSessionId() {
            return ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).getSessionId();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketIndexDataOrBuilder
        public ByteString getSessionIdBytes() {
            return ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).getSessionIdBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketIndexDataOrBuilder
        public int getStartTimestamp() {
            return ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).getStartTimestamp();
        }

        public Builder setMaxDayCnt(int i) {
            copyOnWrite();
            ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).setMaxDayCnt(i);
            return this;
        }

        public Builder setPackTotal(int i) {
            copyOnWrite();
            ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).setPackTotal(i);
            return this;
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).setSessionIdBytes(byteString);
            return this;
        }

        public Builder setStartTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$PacketIndexData) ((GeneratedMessageLite.Builder) this).instance).setStartTimestamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$PacketIndexData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$PacketIndexData fitnessProto$PacketIndexData = new FitnessProto$PacketIndexData();
        DEFAULT_INSTANCE = fitnessProto$PacketIndexData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$PacketIndexData.class, fitnessProto$PacketIndexData);
    }

    private FitnessProto$PacketIndexData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxDayCnt() {
        this.maxDayCnt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackTotal() {
        this.packTotal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimestamp() {
        this.startTimestamp_ = 0;
    }

    public static FitnessProto$PacketIndexData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$PacketIndexData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$PacketIndexData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$PacketIndexData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$PacketIndexData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$PacketIndexData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxDayCnt(int i) {
        this.maxDayCnt_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackTotal(int i) {
        this.packTotal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimestamp(int i) {
        this.startTimestamp_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pi7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$PacketIndexData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004Ȉ", new Object[]{"packTotal_", "startTimestamp_", "maxDayCnt_", "sessionId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$PacketIndexData.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketIndexDataOrBuilder
    public int getMaxDayCnt() {
        return this.maxDayCnt_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketIndexDataOrBuilder
    public int getPackTotal() {
        return this.packTotal_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketIndexDataOrBuilder
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketIndexDataOrBuilder
    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketIndexDataOrBuilder
    public int getStartTimestamp() {
        return this.startTimestamp_;
    }

    public static Builder newBuilder(FitnessProto$PacketIndexData fitnessProto$PacketIndexData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProto$PacketIndexData);
    }

    public static FitnessProto$PacketIndexData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$PacketIndexData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$PacketIndexData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$PacketIndexData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$PacketIndexData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$PacketIndexData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$PacketIndexData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$PacketIndexData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$PacketIndexData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$PacketIndexData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$PacketIndexData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$PacketIndexData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$PacketIndexData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$PacketIndexData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$PacketIndexData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$PacketIndexData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$PacketIndexData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$PacketIndexData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$PacketIndexData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$PacketIndexData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}