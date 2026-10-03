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
public final class MenstrualCycle$SymptomRangeRequest extends GeneratedMessageLite<MenstrualCycle$SymptomRangeRequest, Builder> implements MenstrualCycle$SymptomRangeRequestOrBuilder {
    private static final MenstrualCycle$SymptomRangeRequest DEFAULT_INSTANCE;
    public static final int ENDTIME_FIELD_NUMBER = 2;
    private static volatile Parser<MenstrualCycle$SymptomRangeRequest> PARSER = null;
    public static final int STARTTIME_FIELD_NUMBER = 1;
    private int endTime_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$SymptomRangeRequest, Builder> implements MenstrualCycle$SymptomRangeRequestOrBuilder {
        public Builder clearEndTime() {
            copyOnWrite();
            ((MenstrualCycle$SymptomRangeRequest) this.instance).clearEndTime();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((MenstrualCycle$SymptomRangeRequest) this.instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomRangeRequestOrBuilder
        public int getEndTime() {
            return ((MenstrualCycle$SymptomRangeRequest) this.instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomRangeRequestOrBuilder
        public int getStartTime() {
            return ((MenstrualCycle$SymptomRangeRequest) this.instance).getStartTime();
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((MenstrualCycle$SymptomRangeRequest) this.instance).setEndTime(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((MenstrualCycle$SymptomRangeRequest) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$SymptomRangeRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        MenstrualCycle$SymptomRangeRequest menstrualCycle$SymptomRangeRequest = new MenstrualCycle$SymptomRangeRequest();
        DEFAULT_INSTANCE = menstrualCycle$SymptomRangeRequest;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$SymptomRangeRequest.class, menstrualCycle$SymptomRangeRequest);
    }

    private MenstrualCycle$SymptomRangeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static MenstrualCycle$SymptomRangeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$SymptomRangeRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$SymptomRangeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$SymptomRangeRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$SymptomRangeRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$SymptomRangeRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"startTime_", "endTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$SymptomRangeRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$SymptomRangeRequest.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomRangeRequestOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomRangeRequestOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(MenstrualCycle$SymptomRangeRequest menstrualCycle$SymptomRangeRequest) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$SymptomRangeRequest);
    }

    public static MenstrualCycle$SymptomRangeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SymptomRangeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomRangeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomRangeRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MenstrualCycle$SymptomRangeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomRangeRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$SymptomRangeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomRangeRequest parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$SymptomRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$SymptomRangeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SymptomRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomRangeRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$SymptomRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$SymptomRangeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SymptomRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
