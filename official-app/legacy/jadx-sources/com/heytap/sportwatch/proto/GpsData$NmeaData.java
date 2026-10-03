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
public final class GpsData$NmeaData extends GeneratedMessageLite<GpsData$NmeaData, Builder> implements GpsData$NmeaDataOrBuilder {
    private static final GpsData$NmeaData DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<GpsData$NmeaData> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private String message_ = "";
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<GpsData$NmeaData, Builder> implements GpsData$NmeaDataOrBuilder {
        public Builder clearMessage() {
            copyOnWrite();
            ((GpsData$NmeaData) this.instance).clearMessage();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((GpsData$NmeaData) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.GpsData$NmeaDataOrBuilder
        public String getMessage() {
            return ((GpsData$NmeaData) this.instance).getMessage();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$NmeaDataOrBuilder
        public ByteString getMessageBytes() {
            return ((GpsData$NmeaData) this.instance).getMessageBytes();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$NmeaDataOrBuilder
        public int getTimestamp() {
            return ((GpsData$NmeaData) this.instance).getTimestamp();
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((GpsData$NmeaData) this.instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((GpsData$NmeaData) this.instance).setMessageBytes(byteString);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((GpsData$NmeaData) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(GpsData$NmeaData.DEFAULT_INSTANCE);
        }
    }

    static {
        GpsData$NmeaData gpsData$NmeaData = new GpsData$NmeaData();
        DEFAULT_INSTANCE = gpsData$NmeaData;
        GeneratedMessageLite.registerDefaultInstance(GpsData$NmeaData.class, gpsData$NmeaData);
    }

    private GpsData$NmeaData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static GpsData$NmeaData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GpsData$NmeaData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GpsData$NmeaData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$NmeaData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GpsData$NmeaData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GpsData$NmeaData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r98.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GpsData$NmeaData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002Ȉ", new Object[]{"timestamp_", "message_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GpsData$NmeaData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GpsData$NmeaData.class) {
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

    @Override // com.heytap.sportwatch.proto.GpsData$NmeaDataOrBuilder
    public String getMessage() {
        return this.message_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$NmeaDataOrBuilder
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    @Override // com.heytap.sportwatch.proto.GpsData$NmeaDataOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(GpsData$NmeaData gpsData$NmeaData) {
        return DEFAULT_INSTANCE.createBuilder(gpsData$NmeaData);
    }

    public static GpsData$NmeaData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$NmeaData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$NmeaData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$NmeaData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GpsData$NmeaData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GpsData$NmeaData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GpsData$NmeaData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$NmeaData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GpsData$NmeaData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GpsData$NmeaData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GpsData$NmeaData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$NmeaData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GpsData$NmeaData parseFrom(InputStream inputStream) throws IOException {
        return (GpsData$NmeaData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$NmeaData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$NmeaData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$NmeaData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GpsData$NmeaData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GpsData$NmeaData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$NmeaData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
