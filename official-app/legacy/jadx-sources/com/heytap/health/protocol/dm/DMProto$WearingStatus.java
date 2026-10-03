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
public final class DMProto$WearingStatus extends GeneratedMessageLite<DMProto$WearingStatus, Builder> implements DMProto$WearingStatusOrBuilder {
    private static final DMProto$WearingStatus DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$WearingStatus> PARSER = null;
    public static final int RECENT_WEARING_TIME_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 1;
    private int recentWearingTime_;
    private int state_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$WearingStatus, Builder> implements DMProto$WearingStatusOrBuilder {
        public Builder clearRecentWearingTime() {
            copyOnWrite();
            ((DMProto$WearingStatus) this.instance).clearRecentWearingTime();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((DMProto$WearingStatus) this.instance).clearState();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$WearingStatusOrBuilder
        public int getRecentWearingTime() {
            return ((DMProto$WearingStatus) this.instance).getRecentWearingTime();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$WearingStatusOrBuilder
        public int getState() {
            return ((DMProto$WearingStatus) this.instance).getState();
        }

        public Builder setRecentWearingTime(int i) {
            copyOnWrite();
            ((DMProto$WearingStatus) this.instance).setRecentWearingTime(i);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((DMProto$WearingStatus) this.instance).setState(i);
            return this;
        }

        private Builder() {
            super(DMProto$WearingStatus.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$WearingStatus dMProto$WearingStatus = new DMProto$WearingStatus();
        DEFAULT_INSTANCE = dMProto$WearingStatus;
        GeneratedMessageLite.registerDefaultInstance(DMProto$WearingStatus.class, dMProto$WearingStatus);
    }

    private DMProto$WearingStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecentWearingTime() {
        this.recentWearingTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static DMProto$WearingStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$WearingStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$WearingStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$WearingStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$WearingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$WearingStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecentWearingTime(int i) {
        this.recentWearingTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$WearingStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"state_", "recentWearingTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$WearingStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$WearingStatus.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$WearingStatusOrBuilder
    public int getRecentWearingTime() {
        return this.recentWearingTime_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$WearingStatusOrBuilder
    public int getState() {
        return this.state_;
    }

    public static Builder newBuilder(DMProto$WearingStatus dMProto$WearingStatus) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$WearingStatus);
    }

    public static DMProto$WearingStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$WearingStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$WearingStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$WearingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$WearingStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$WearingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$WearingStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$WearingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$WearingStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$WearingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$WearingStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$WearingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$WearingStatus parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$WearingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$WearingStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$WearingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$WearingStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$WearingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$WearingStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$WearingStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
