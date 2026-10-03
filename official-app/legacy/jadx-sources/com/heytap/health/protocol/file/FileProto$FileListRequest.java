package com.heytap.health.protocol.file;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.zb7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FileProto$FileListRequest extends GeneratedMessageLite<FileProto$FileListRequest, Builder> implements FileProto$FileListRequestOrBuilder {
    private static final FileProto$FileListRequest DEFAULT_INSTANCE;
    public static final int FILE_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<FileProto$FileListRequest> PARSER;
    private int fileType_;

    public static final class Builder extends GeneratedMessageLite.Builder<FileProto$FileListRequest, Builder> implements FileProto$FileListRequestOrBuilder {
        public Builder clearFileType() {
            copyOnWrite();
            ((FileProto$FileListRequest) this.instance).clearFileType();
            return this;
        }

        @Override // com.heytap.health.protocol.file.FileProto$FileListRequestOrBuilder
        public int getFileType() {
            return ((FileProto$FileListRequest) this.instance).getFileType();
        }

        public Builder setFileType(int i) {
            copyOnWrite();
            ((FileProto$FileListRequest) this.instance).setFileType(i);
            return this;
        }

        private Builder() {
            super(FileProto$FileListRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        FileProto$FileListRequest fileProto$FileListRequest = new FileProto$FileListRequest();
        DEFAULT_INSTANCE = fileProto$FileListRequest;
        GeneratedMessageLite.registerDefaultInstance(FileProto$FileListRequest.class, fileProto$FileListRequest);
    }

    private FileProto$FileListRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileType() {
        this.fileType_ = 0;
    }

    public static FileProto$FileListRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FileProto$FileListRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FileProto$FileListRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FileProto$FileListRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FileProto$FileListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FileProto$FileListRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileType(int i) {
        this.fileType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = zb7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FileProto$FileListRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"fileType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FileProto$FileListRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FileProto$FileListRequest.class) {
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

    @Override // com.heytap.health.protocol.file.FileProto$FileListRequestOrBuilder
    public int getFileType() {
        return this.fileType_;
    }

    public static Builder newBuilder(FileProto$FileListRequest fileProto$FileListRequest) {
        return DEFAULT_INSTANCE.createBuilder(fileProto$FileListRequest);
    }

    public static FileProto$FileListRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FileProto$FileListRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FileProto$FileListRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FileProto$FileListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FileProto$FileListRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FileProto$FileListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FileProto$FileListRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FileProto$FileListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FileProto$FileListRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FileProto$FileListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FileProto$FileListRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FileProto$FileListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FileProto$FileListRequest parseFrom(InputStream inputStream) throws IOException {
        return (FileProto$FileListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FileProto$FileListRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FileProto$FileListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FileProto$FileListRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FileProto$FileListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FileProto$FileListRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FileProto$FileListRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
