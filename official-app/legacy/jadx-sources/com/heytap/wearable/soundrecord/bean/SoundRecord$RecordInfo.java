package com.heytap.wearable.soundrecord.bean;

import com.google.protobuf.AbstractMessageLite;
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
public final class SoundRecord$RecordInfo extends GeneratedMessageLite<SoundRecord$RecordInfo, Builder> implements SoundRecord$RecordInfoOrBuilder {
    private static final SoundRecord$RecordInfo DEFAULT_INSTANCE;
    public static final int FILE_ID_FIELD_NUMBER = 6;
    public static final int FILE_MD5_FIELD_NUMBER = 2;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    public static final int FILE_SIZE_FIELD_NUMBER = 5;
    private static volatile Parser<SoundRecord$RecordInfo> PARSER = null;
    public static final int TIME_STAMP_FIELD_NUMBER = 3;
    public static final int TOTAL_TIME_FIELD_NUMBER = 4;
    private long fileId_;
    private int fileSize_;
    private long timeStamp_;
    private int totalTime_;
    private String fileName_ = "";
    private String fileMd5_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<SoundRecord$RecordInfo, Builder> implements SoundRecord$RecordInfoOrBuilder {
        public Builder clearFileId() {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).clearFileId();
            return this;
        }

        public Builder clearFileMd5() {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).clearFileMd5();
            return this;
        }

        public Builder clearFileName() {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).clearFileName();
            return this;
        }

        public Builder clearFileSize() {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).clearFileSize();
            return this;
        }

        public Builder clearTimeStamp() {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).clearTimeStamp();
            return this;
        }

        public Builder clearTotalTime() {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).clearTotalTime();
            return this;
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
        public long getFileId() {
            return ((SoundRecord$RecordInfo) this.instance).getFileId();
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
        public String getFileMd5() {
            return ((SoundRecord$RecordInfo) this.instance).getFileMd5();
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
        public ByteString getFileMd5Bytes() {
            return ((SoundRecord$RecordInfo) this.instance).getFileMd5Bytes();
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
        public String getFileName() {
            return ((SoundRecord$RecordInfo) this.instance).getFileName();
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
        public ByteString getFileNameBytes() {
            return ((SoundRecord$RecordInfo) this.instance).getFileNameBytes();
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
        public int getFileSize() {
            return ((SoundRecord$RecordInfo) this.instance).getFileSize();
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
        public long getTimeStamp() {
            return ((SoundRecord$RecordInfo) this.instance).getTimeStamp();
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
        public int getTotalTime() {
            return ((SoundRecord$RecordInfo) this.instance).getTotalTime();
        }

        public Builder setFileId(long j2) {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).setFileId(j2);
            return this;
        }

        public Builder setFileMd5(String str) {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).setFileMd5(str);
            return this;
        }

        public Builder setFileMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).setFileMd5Bytes(byteString);
            return this;
        }

        public Builder setFileName(String str) {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).setFileName(str);
            return this;
        }

        public Builder setFileNameBytes(ByteString byteString) {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).setFileNameBytes(byteString);
            return this;
        }

        public Builder setFileSize(int i) {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).setFileSize(i);
            return this;
        }

        public Builder setTimeStamp(long j2) {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).setTimeStamp(j2);
            return this;
        }

        public Builder setTotalTime(int i) {
            copyOnWrite();
            ((SoundRecord$RecordInfo) this.instance).setTotalTime(i);
            return this;
        }

        private Builder() {
            super(SoundRecord$RecordInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        SoundRecord$RecordInfo soundRecord$RecordInfo = new SoundRecord$RecordInfo();
        DEFAULT_INSTANCE = soundRecord$RecordInfo;
        GeneratedMessageLite.registerDefaultInstance(SoundRecord$RecordInfo.class, soundRecord$RecordInfo);
    }

    private SoundRecord$RecordInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileId() {
        this.fileId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileMd5() {
        this.fileMd5_ = getDefaultInstance().getFileMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileSize() {
        this.fileSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalTime() {
        this.totalTime_ = 0;
    }

    public static SoundRecord$RecordInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SoundRecord$RecordInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SoundRecord$RecordInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileId(long j2) {
        this.fileId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileMd5(String str) {
        str.getClass();
        this.fileMd5_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileMd5Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fileMd5_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fileName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileSize(int i) {
        this.fileSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeStamp(long j2) {
        this.timeStamp_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalTime(int i) {
        this.totalTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = c3i.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SoundRecord$RecordInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\u000b\u0005\u000b\u0006\u0003", new Object[]{"fileName_", "fileMd5_", "timeStamp_", "totalTime_", "fileSize_", "fileId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SoundRecord$RecordInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SoundRecord$RecordInfo.class) {
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

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
    public long getFileId() {
        return this.fileId_;
    }

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
    public String getFileMd5() {
        return this.fileMd5_;
    }

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
    public ByteString getFileMd5Bytes() {
        return ByteString.copyFromUtf8(this.fileMd5_);
    }

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
    public String getFileName() {
        return this.fileName_;
    }

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
    public ByteString getFileNameBytes() {
        return ByteString.copyFromUtf8(this.fileName_);
    }

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
    public int getFileSize() {
        return this.fileSize_;
    }

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
    public long getTimeStamp() {
        return this.timeStamp_;
    }

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfoOrBuilder
    public int getTotalTime() {
        return this.totalTime_;
    }

    public static Builder newBuilder(SoundRecord$RecordInfo soundRecord$RecordInfo) {
        return DEFAULT_INSTANCE.createBuilder(soundRecord$RecordInfo);
    }

    public static SoundRecord$RecordInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SoundRecord$RecordInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SoundRecord$RecordInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SoundRecord$RecordInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SoundRecord$RecordInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SoundRecord$RecordInfo parseFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SoundRecord$RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SoundRecord$RecordInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
