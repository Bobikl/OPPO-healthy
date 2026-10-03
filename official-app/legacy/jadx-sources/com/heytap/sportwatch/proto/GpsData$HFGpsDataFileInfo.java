package com.heytap.sportwatch.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.r98;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class GpsData$HFGpsDataFileInfo extends GeneratedMessageLite<GpsData$HFGpsDataFileInfo, Builder> implements GpsData$HFGpsDataFileInfoOrBuilder {
    private static final GpsData$HFGpsDataFileInfo DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    public static final int FILE_SIZE_FIELD_NUMBER = 2;
    private static volatile Parser<GpsData$HFGpsDataFileInfo> PARSER;
    private String fileName_ = "";
    private int fileSize_;

    public static final class Builder extends GeneratedMessageLite.Builder<GpsData$HFGpsDataFileInfo, Builder> implements GpsData$HFGpsDataFileInfoOrBuilder {
        public Builder clearFileName() {
            copyOnWrite();
            ((GpsData$HFGpsDataFileInfo) this.instance).clearFileName();
            return this;
        }

        public Builder clearFileSize() {
            copyOnWrite();
            ((GpsData$HFGpsDataFileInfo) this.instance).clearFileSize();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsDataFileInfoOrBuilder
        public String getFileName() {
            return ((GpsData$HFGpsDataFileInfo) this.instance).getFileName();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsDataFileInfoOrBuilder
        public ByteString getFileNameBytes() {
            return ((GpsData$HFGpsDataFileInfo) this.instance).getFileNameBytes();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsDataFileInfoOrBuilder
        public int getFileSize() {
            return ((GpsData$HFGpsDataFileInfo) this.instance).getFileSize();
        }

        public Builder setFileName(String str) {
            copyOnWrite();
            ((GpsData$HFGpsDataFileInfo) this.instance).setFileName(str);
            return this;
        }

        public Builder setFileNameBytes(ByteString byteString) {
            copyOnWrite();
            ((GpsData$HFGpsDataFileInfo) this.instance).setFileNameBytes(byteString);
            return this;
        }

        public Builder setFileSize(int i) {
            copyOnWrite();
            ((GpsData$HFGpsDataFileInfo) this.instance).setFileSize(i);
            return this;
        }

        private Builder() {
            super(GpsData$HFGpsDataFileInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        GpsData$HFGpsDataFileInfo gpsData$HFGpsDataFileInfo = new GpsData$HFGpsDataFileInfo();
        DEFAULT_INSTANCE = gpsData$HFGpsDataFileInfo;
        GeneratedMessageLite.registerDefaultInstance(GpsData$HFGpsDataFileInfo.class, gpsData$HFGpsDataFileInfo);
    }

    private GpsData$HFGpsDataFileInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileSize() {
        this.fileSize_ = 0;
    }

    public static GpsData$HFGpsDataFileInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GpsData$HFGpsDataFileInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GpsData$HFGpsDataFileInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$HFGpsDataFileInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsDataFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GpsData$HFGpsDataFileInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r98.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GpsData$HFGpsDataFileInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u000b", new Object[]{"fileName_", "fileSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GpsData$HFGpsDataFileInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GpsData$HFGpsDataFileInfo.class) {
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

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsDataFileInfoOrBuilder
    public String getFileName() {
        return this.fileName_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsDataFileInfoOrBuilder
    public ByteString getFileNameBytes() {
        return ByteString.copyFromUtf8(this.fileName_);
    }

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsDataFileInfoOrBuilder
    public int getFileSize() {
        return this.fileSize_;
    }

    public static Builder newBuilder(GpsData$HFGpsDataFileInfo gpsData$HFGpsDataFileInfo) {
        return DEFAULT_INSTANCE.createBuilder(gpsData$HFGpsDataFileInfo);
    }

    public static GpsData$HFGpsDataFileInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsDataFileInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$HFGpsDataFileInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsDataFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GpsData$HFGpsDataFileInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsDataFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GpsData$HFGpsDataFileInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsDataFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GpsData$HFGpsDataFileInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsDataFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GpsData$HFGpsDataFileInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsDataFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GpsData$HFGpsDataFileInfo parseFrom(InputStream inputStream) throws IOException {
        return (GpsData$HFGpsDataFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$HFGpsDataFileInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsDataFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$HFGpsDataFileInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GpsData$HFGpsDataFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GpsData$HFGpsDataFileInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsDataFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
