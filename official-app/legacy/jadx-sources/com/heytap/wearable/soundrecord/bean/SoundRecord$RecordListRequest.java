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
public final class SoundRecord$RecordListRequest extends GeneratedMessageLite<SoundRecord$RecordListRequest, Builder> implements SoundRecord$RecordListRequestOrBuilder {
    private static final SoundRecord$RecordListRequest DEFAULT_INSTANCE;
    public static final int PAGE_NO_FIELD_NUMBER = 1;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    private static volatile Parser<SoundRecord$RecordListRequest> PARSER = null;
    public static final int TIME_STAMP_FIELD_NUMBER = 3;
    private int pageNo_;
    private int pageSize_;
    private long timeStamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<SoundRecord$RecordListRequest, Builder> implements SoundRecord$RecordListRequestOrBuilder {
        public Builder clearPageNo() {
            copyOnWrite();
            ((SoundRecord$RecordListRequest) this.instance).clearPageNo();
            return this;
        }

        public Builder clearPageSize() {
            copyOnWrite();
            ((SoundRecord$RecordListRequest) this.instance).clearPageSize();
            return this;
        }

        public Builder clearTimeStamp() {
            copyOnWrite();
            ((SoundRecord$RecordListRequest) this.instance).clearTimeStamp();
            return this;
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordListRequestOrBuilder
        public int getPageNo() {
            return ((SoundRecord$RecordListRequest) this.instance).getPageNo();
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordListRequestOrBuilder
        public int getPageSize() {
            return ((SoundRecord$RecordListRequest) this.instance).getPageSize();
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordListRequestOrBuilder
        public long getTimeStamp() {
            return ((SoundRecord$RecordListRequest) this.instance).getTimeStamp();
        }

        public Builder setPageNo(int i) {
            copyOnWrite();
            ((SoundRecord$RecordListRequest) this.instance).setPageNo(i);
            return this;
        }

        public Builder setPageSize(int i) {
            copyOnWrite();
            ((SoundRecord$RecordListRequest) this.instance).setPageSize(i);
            return this;
        }

        public Builder setTimeStamp(long j2) {
            copyOnWrite();
            ((SoundRecord$RecordListRequest) this.instance).setTimeStamp(j2);
            return this;
        }

        private Builder() {
            super(SoundRecord$RecordListRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        SoundRecord$RecordListRequest soundRecord$RecordListRequest = new SoundRecord$RecordListRequest();
        DEFAULT_INSTANCE = soundRecord$RecordListRequest;
        GeneratedMessageLite.registerDefaultInstance(SoundRecord$RecordListRequest.class, soundRecord$RecordListRequest);
    }

    private SoundRecord$RecordListRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageNo() {
        this.pageNo_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageSize() {
        this.pageSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = 0L;
    }

    public static SoundRecord$RecordListRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SoundRecord$RecordListRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordListRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordListRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SoundRecord$RecordListRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageNo(int i) {
        this.pageNo_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageSize(int i) {
        this.pageSize_ = i;
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
                return new SoundRecord$RecordListRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u0003", new Object[]{"pageNo_", "pageSize_", "timeStamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SoundRecord$RecordListRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SoundRecord$RecordListRequest.class) {
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

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordListRequestOrBuilder
    public int getPageNo() {
        return this.pageNo_;
    }

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordListRequestOrBuilder
    public int getPageSize() {
        return this.pageSize_;
    }

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordListRequestOrBuilder
    public long getTimeStamp() {
        return this.timeStamp_;
    }

    public static Builder newBuilder(SoundRecord$RecordListRequest soundRecord$RecordListRequest) {
        return DEFAULT_INSTANCE.createBuilder(soundRecord$RecordListRequest);
    }

    public static SoundRecord$RecordListRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordListRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordListRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SoundRecord$RecordListRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SoundRecord$RecordListRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SoundRecord$RecordListRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SoundRecord$RecordListRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SoundRecord$RecordListRequest parseFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordListRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordListRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SoundRecord$RecordListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SoundRecord$RecordListRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
