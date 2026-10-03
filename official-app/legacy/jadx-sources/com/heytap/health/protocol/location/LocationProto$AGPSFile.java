package com.heytap.health.protocol.location;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.g5b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class LocationProto$AGPSFile extends GeneratedMessageLite<LocationProto$AGPSFile, Builder> implements LocationProto$AGPSFileOrBuilder {
    private static final LocationProto$AGPSFile DEFAULT_INSTANCE;
    public static final int ENDTIME_FIELD_NUMBER = 4;
    public static final int FILENAME_FIELD_NUMBER = 1;
    public static final int FILESIZE_FIELD_NUMBER = 2;
    private static volatile Parser<LocationProto$AGPSFile> PARSER = null;
    public static final int STARTTIME_FIELD_NUMBER = 3;
    private int endTime_;
    private String fileName_ = "";
    private int fileSize_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<LocationProto$AGPSFile, Builder> implements LocationProto$AGPSFileOrBuilder {
        public Builder clearEndTime() {
            copyOnWrite();
            ((LocationProto$AGPSFile) this.instance).clearEndTime();
            return this;
        }

        public Builder clearFileName() {
            copyOnWrite();
            ((LocationProto$AGPSFile) this.instance).clearFileName();
            return this;
        }

        public Builder clearFileSize() {
            copyOnWrite();
            ((LocationProto$AGPSFile) this.instance).clearFileSize();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((LocationProto$AGPSFile) this.instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.location.LocationProto$AGPSFileOrBuilder
        public int getEndTime() {
            return ((LocationProto$AGPSFile) this.instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.location.LocationProto$AGPSFileOrBuilder
        public String getFileName() {
            return ((LocationProto$AGPSFile) this.instance).getFileName();
        }

        @Override // com.heytap.health.protocol.location.LocationProto$AGPSFileOrBuilder
        public ByteString getFileNameBytes() {
            return ((LocationProto$AGPSFile) this.instance).getFileNameBytes();
        }

        @Override // com.heytap.health.protocol.location.LocationProto$AGPSFileOrBuilder
        public int getFileSize() {
            return ((LocationProto$AGPSFile) this.instance).getFileSize();
        }

        @Override // com.heytap.health.protocol.location.LocationProto$AGPSFileOrBuilder
        public int getStartTime() {
            return ((LocationProto$AGPSFile) this.instance).getStartTime();
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((LocationProto$AGPSFile) this.instance).setEndTime(i);
            return this;
        }

        public Builder setFileName(String str) {
            copyOnWrite();
            ((LocationProto$AGPSFile) this.instance).setFileName(str);
            return this;
        }

        public Builder setFileNameBytes(ByteString byteString) {
            copyOnWrite();
            ((LocationProto$AGPSFile) this.instance).setFileNameBytes(byteString);
            return this;
        }

        public Builder setFileSize(int i) {
            copyOnWrite();
            ((LocationProto$AGPSFile) this.instance).setFileSize(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((LocationProto$AGPSFile) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(LocationProto$AGPSFile.DEFAULT_INSTANCE);
        }
    }

    static {
        LocationProto$AGPSFile locationProto$AGPSFile = new LocationProto$AGPSFile();
        DEFAULT_INSTANCE = locationProto$AGPSFile;
        GeneratedMessageLite.registerDefaultInstance(LocationProto$AGPSFile.class, locationProto$AGPSFile);
    }

    private LocationProto$AGPSFile() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
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
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static LocationProto$AGPSFile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LocationProto$AGPSFile parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LocationProto$AGPSFile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocationProto$AGPSFile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LocationProto$AGPSFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LocationProto$AGPSFile> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
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
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = g5b.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new LocationProto$AGPSFile();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"fileName_", "fileSize_", "startTime_", "endTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LocationProto$AGPSFile> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LocationProto$AGPSFile.class) {
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

    @Override // com.heytap.health.protocol.location.LocationProto$AGPSFileOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.location.LocationProto$AGPSFileOrBuilder
    public String getFileName() {
        return this.fileName_;
    }

    @Override // com.heytap.health.protocol.location.LocationProto$AGPSFileOrBuilder
    public ByteString getFileNameBytes() {
        return ByteString.copyFromUtf8(this.fileName_);
    }

    @Override // com.heytap.health.protocol.location.LocationProto$AGPSFileOrBuilder
    public int getFileSize() {
        return this.fileSize_;
    }

    @Override // com.heytap.health.protocol.location.LocationProto$AGPSFileOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(LocationProto$AGPSFile locationProto$AGPSFile) {
        return DEFAULT_INSTANCE.createBuilder(locationProto$AGPSFile);
    }

    public static LocationProto$AGPSFile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocationProto$AGPSFile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocationProto$AGPSFile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocationProto$AGPSFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LocationProto$AGPSFile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LocationProto$AGPSFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LocationProto$AGPSFile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocationProto$AGPSFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LocationProto$AGPSFile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LocationProto$AGPSFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LocationProto$AGPSFile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocationProto$AGPSFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LocationProto$AGPSFile parseFrom(InputStream inputStream) throws IOException {
        return (LocationProto$AGPSFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocationProto$AGPSFile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocationProto$AGPSFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocationProto$AGPSFile parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LocationProto$AGPSFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LocationProto$AGPSFile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocationProto$AGPSFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
