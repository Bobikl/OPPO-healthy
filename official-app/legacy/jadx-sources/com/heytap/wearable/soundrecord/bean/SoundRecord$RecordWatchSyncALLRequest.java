package com.heytap.wearable.soundrecord.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.c3i;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class SoundRecord$RecordWatchSyncALLRequest extends GeneratedMessageLite<SoundRecord$RecordWatchSyncALLRequest, Builder> implements SoundRecord$RecordWatchSyncALLRequestOrBuilder {
    private static final SoundRecord$RecordWatchSyncALLRequest DEFAULT_INSTANCE;
    private static volatile Parser<SoundRecord$RecordWatchSyncALLRequest> PARSER = null;
    public static final int TIME_STAMP_FIELD_NUMBER = 1;
    private long timeStamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<SoundRecord$RecordWatchSyncALLRequest, Builder> implements SoundRecord$RecordWatchSyncALLRequestOrBuilder {
        public Builder clearTimeStamp() {
            copyOnWrite();
            ((SoundRecord$RecordWatchSyncALLRequest) this.instance).clearTimeStamp();
            return this;
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordWatchSyncALLRequestOrBuilder
        public long getTimeStamp() {
            return ((SoundRecord$RecordWatchSyncALLRequest) this.instance).getTimeStamp();
        }

        public Builder setTimeStamp(long j2) {
            copyOnWrite();
            ((SoundRecord$RecordWatchSyncALLRequest) this.instance).setTimeStamp(j2);
            return this;
        }

        private Builder() {
            super(SoundRecord$RecordWatchSyncALLRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        SoundRecord$RecordWatchSyncALLRequest soundRecord$RecordWatchSyncALLRequest = new SoundRecord$RecordWatchSyncALLRequest();
        DEFAULT_INSTANCE = soundRecord$RecordWatchSyncALLRequest;
        GeneratedMessageLite.registerDefaultInstance(SoundRecord$RecordWatchSyncALLRequest.class, soundRecord$RecordWatchSyncALLRequest);
    }

    private SoundRecord$RecordWatchSyncALLRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = 0L;
    }

    public static SoundRecord$RecordWatchSyncALLRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SoundRecord$RecordWatchSyncALLRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordWatchSyncALLRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordWatchSyncALLRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordWatchSyncALLRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SoundRecord$RecordWatchSyncALLRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeStamp(long j2) {
        this.timeStamp_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = c3i.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SoundRecord$RecordWatchSyncALLRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"timeStamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SoundRecord$RecordWatchSyncALLRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SoundRecord$RecordWatchSyncALLRequest.class) {
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

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordWatchSyncALLRequestOrBuilder
    public long getTimeStamp() {
        return this.timeStamp_;
    }

    public static Builder newBuilder(SoundRecord$RecordWatchSyncALLRequest soundRecord$RecordWatchSyncALLRequest) {
        return DEFAULT_INSTANCE.createBuilder(soundRecord$RecordWatchSyncALLRequest);
    }

    public static SoundRecord$RecordWatchSyncALLRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordWatchSyncALLRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordWatchSyncALLRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordWatchSyncALLRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SoundRecord$RecordWatchSyncALLRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordWatchSyncALLRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SoundRecord$RecordWatchSyncALLRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordWatchSyncALLRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SoundRecord$RecordWatchSyncALLRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordWatchSyncALLRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SoundRecord$RecordWatchSyncALLRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordWatchSyncALLRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SoundRecord$RecordWatchSyncALLRequest parseFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordWatchSyncALLRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordWatchSyncALLRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordWatchSyncALLRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordWatchSyncALLRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SoundRecord$RecordWatchSyncALLRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SoundRecord$RecordWatchSyncALLRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordWatchSyncALLRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
