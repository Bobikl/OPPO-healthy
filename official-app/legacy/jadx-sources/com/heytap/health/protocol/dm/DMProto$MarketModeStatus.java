package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yl4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DMProto$MarketModeStatus extends GeneratedMessageLite<DMProto$MarketModeStatus, Builder> implements DMProto$MarketModeStatusOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final DMProto$MarketModeStatus DEFAULT_INSTANCE;
    public static final int ENDTIME_FIELD_NUMBER = 3;
    private static volatile Parser<DMProto$MarketModeStatus> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int code_;
    private long endTime_;
    private int status_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$MarketModeStatus, Builder> implements DMProto$MarketModeStatusOrBuilder {
        public Builder clearCode() {
            copyOnWrite();
            ((DMProto$MarketModeStatus) this.instance).clearCode();
            return this;
        }

        public Builder clearEndTime() {
            copyOnWrite();
            ((DMProto$MarketModeStatus) this.instance).clearEndTime();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((DMProto$MarketModeStatus) this.instance).clearStatus();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$MarketModeStatusOrBuilder
        public int getCode() {
            return ((DMProto$MarketModeStatus) this.instance).getCode();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$MarketModeStatusOrBuilder
        public long getEndTime() {
            return ((DMProto$MarketModeStatus) this.instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$MarketModeStatusOrBuilder
        public int getStatus() {
            return ((DMProto$MarketModeStatus) this.instance).getStatus();
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((DMProto$MarketModeStatus) this.instance).setCode(i);
            return this;
        }

        public Builder setEndTime(long j2) {
            copyOnWrite();
            ((DMProto$MarketModeStatus) this.instance).setEndTime(j2);
            return this;
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((DMProto$MarketModeStatus) this.instance).setStatus(i);
            return this;
        }

        private Builder() {
            super(DMProto$MarketModeStatus.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$MarketModeStatus dMProto$MarketModeStatus = new DMProto$MarketModeStatus();
        DEFAULT_INSTANCE = dMProto$MarketModeStatus;
        GeneratedMessageLite.registerDefaultInstance(DMProto$MarketModeStatus.class, dMProto$MarketModeStatus);
    }

    private DMProto$MarketModeStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static DMProto$MarketModeStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$MarketModeStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$MarketModeStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$MarketModeStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$MarketModeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$MarketModeStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(long j2) {
        this.endTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$MarketModeStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0002", new Object[]{"code_", "status_", "endTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$MarketModeStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$MarketModeStatus.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$MarketModeStatusOrBuilder
    public int getCode() {
        return this.code_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$MarketModeStatusOrBuilder
    public long getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$MarketModeStatusOrBuilder
    public int getStatus() {
        return this.status_;
    }

    public static Builder newBuilder(DMProto$MarketModeStatus dMProto$MarketModeStatus) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$MarketModeStatus);
    }

    public static DMProto$MarketModeStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$MarketModeStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$MarketModeStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$MarketModeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$MarketModeStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$MarketModeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$MarketModeStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$MarketModeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$MarketModeStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$MarketModeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$MarketModeStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$MarketModeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$MarketModeStatus parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$MarketModeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$MarketModeStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$MarketModeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$MarketModeStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$MarketModeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$MarketModeStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$MarketModeStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
