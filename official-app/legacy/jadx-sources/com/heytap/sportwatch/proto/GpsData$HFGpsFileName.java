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
public final class GpsData$HFGpsFileName extends GeneratedMessageLite<GpsData$HFGpsFileName, Builder> implements GpsData$HFGpsFileNameOrBuilder {
    private static final GpsData$HFGpsFileName DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<GpsData$HFGpsFileName> PARSER;
    private String fileName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<GpsData$HFGpsFileName, Builder> implements GpsData$HFGpsFileNameOrBuilder {
        public Builder clearFileName() {
            copyOnWrite();
            ((GpsData$HFGpsFileName) this.instance).clearFileName();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsFileNameOrBuilder
        public String getFileName() {
            return ((GpsData$HFGpsFileName) this.instance).getFileName();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsFileNameOrBuilder
        public ByteString getFileNameBytes() {
            return ((GpsData$HFGpsFileName) this.instance).getFileNameBytes();
        }

        public Builder setFileName(String str) {
            copyOnWrite();
            ((GpsData$HFGpsFileName) this.instance).setFileName(str);
            return this;
        }

        public Builder setFileNameBytes(ByteString byteString) {
            copyOnWrite();
            ((GpsData$HFGpsFileName) this.instance).setFileNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(GpsData$HFGpsFileName.DEFAULT_INSTANCE);
        }
    }

    static {
        GpsData$HFGpsFileName gpsData$HFGpsFileName = new GpsData$HFGpsFileName();
        DEFAULT_INSTANCE = gpsData$HFGpsFileName;
        GeneratedMessageLite.registerDefaultInstance(GpsData$HFGpsFileName.class, gpsData$HFGpsFileName);
    }

    private GpsData$HFGpsFileName() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    public static GpsData$HFGpsFileName getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GpsData$HFGpsFileName parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GpsData$HFGpsFileName) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$HFGpsFileName parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsFileName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GpsData$HFGpsFileName> parser() {
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r98.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GpsData$HFGpsFileName();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GpsData$HFGpsFileName> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GpsData$HFGpsFileName.class) {
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

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsFileNameOrBuilder
    public String getFileName() {
        return this.fileName_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsFileNameOrBuilder
    public ByteString getFileNameBytes() {
        return ByteString.copyFromUtf8(this.fileName_);
    }

    public static Builder newBuilder(GpsData$HFGpsFileName gpsData$HFGpsFileName) {
        return DEFAULT_INSTANCE.createBuilder(gpsData$HFGpsFileName);
    }

    public static GpsData$HFGpsFileName parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsFileName) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$HFGpsFileName parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsFileName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GpsData$HFGpsFileName parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsFileName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GpsData$HFGpsFileName parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsFileName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GpsData$HFGpsFileName parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsFileName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GpsData$HFGpsFileName parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsFileName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GpsData$HFGpsFileName parseFrom(InputStream inputStream) throws IOException {
        return (GpsData$HFGpsFileName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$HFGpsFileName parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsFileName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$HFGpsFileName parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GpsData$HFGpsFileName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GpsData$HFGpsFileName parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsFileName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
