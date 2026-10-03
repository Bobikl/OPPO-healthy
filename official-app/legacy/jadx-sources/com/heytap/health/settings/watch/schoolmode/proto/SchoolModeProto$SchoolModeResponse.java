package com.heytap.health.settings.watch.schoolmode.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.ohg;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes18.dex */
public final class SchoolModeProto$SchoolModeResponse extends GeneratedMessageLite<SchoolModeProto$SchoolModeResponse, Builder> implements SchoolModeProto$SchoolModeResponseOrBuilder {
    public static final int ACKRESULT_FIELD_NUMBER = 1;
    private static final SchoolModeProto$SchoolModeResponse DEFAULT_INSTANCE;
    private static volatile Parser<SchoolModeProto$SchoolModeResponse> PARSER;
    private int ackResult_;

    public static final class Builder extends GeneratedMessageLite.Builder<SchoolModeProto$SchoolModeResponse, Builder> implements SchoolModeProto$SchoolModeResponseOrBuilder {
        public Builder clearAckResult() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeResponse) this.instance).clearAckResult();
            return this;
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeResponseOrBuilder
        public int getAckResult() {
            return ((SchoolModeProto$SchoolModeResponse) this.instance).getAckResult();
        }

        public Builder setAckResult(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeResponse) this.instance).setAckResult(i);
            return this;
        }

        private Builder() {
            super(SchoolModeProto$SchoolModeResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        SchoolModeProto$SchoolModeResponse schoolModeProto$SchoolModeResponse = new SchoolModeProto$SchoolModeResponse();
        DEFAULT_INSTANCE = schoolModeProto$SchoolModeResponse;
        GeneratedMessageLite.registerDefaultInstance(SchoolModeProto$SchoolModeResponse.class, schoolModeProto$SchoolModeResponse);
    }

    private SchoolModeProto$SchoolModeResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAckResult() {
        this.ackResult_ = 0;
    }

    public static SchoolModeProto$SchoolModeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SchoolModeProto$SchoolModeResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SchoolModeProto$SchoolModeResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SchoolModeProto$SchoolModeResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SchoolModeProto$SchoolModeResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckResult(int i) {
        this.ackResult_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ohg.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SchoolModeProto$SchoolModeResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ackResult_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SchoolModeProto$SchoolModeResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SchoolModeProto$SchoolModeResponse.class) {
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

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeResponseOrBuilder
    public int getAckResult() {
        return this.ackResult_;
    }

    public static Builder newBuilder(SchoolModeProto$SchoolModeResponse schoolModeProto$SchoolModeResponse) {
        return DEFAULT_INSTANCE.createBuilder(schoolModeProto$SchoolModeResponse);
    }

    public static SchoolModeProto$SchoolModeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SchoolModeProto$SchoolModeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SchoolModeProto$SchoolModeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeResponse parseFrom(InputStream inputStream) throws IOException {
        return (SchoolModeProto$SchoolModeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SchoolModeProto$SchoolModeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SchoolModeProto$SchoolModeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SchoolModeProto$SchoolModeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
