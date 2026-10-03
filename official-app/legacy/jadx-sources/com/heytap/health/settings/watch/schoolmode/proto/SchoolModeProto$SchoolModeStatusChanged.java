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
public final class SchoolModeProto$SchoolModeStatusChanged extends GeneratedMessageLite<SchoolModeProto$SchoolModeStatusChanged, Builder> implements SchoolModeProto$SchoolModeStatusChangedOrBuilder {
    private static final SchoolModeProto$SchoolModeStatusChanged DEFAULT_INSTANCE;
    private static volatile Parser<SchoolModeProto$SchoolModeStatusChanged> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    public static final class Builder extends GeneratedMessageLite.Builder<SchoolModeProto$SchoolModeStatusChanged, Builder> implements SchoolModeProto$SchoolModeStatusChangedOrBuilder {
        public Builder clearStatus() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeStatusChanged) this.instance).clearStatus();
            return this;
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeStatusChangedOrBuilder
        public int getStatus() {
            return ((SchoolModeProto$SchoolModeStatusChanged) this.instance).getStatus();
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeStatusChanged) this.instance).setStatus(i);
            return this;
        }

        private Builder() {
            super(SchoolModeProto$SchoolModeStatusChanged.DEFAULT_INSTANCE);
        }
    }

    static {
        SchoolModeProto$SchoolModeStatusChanged schoolModeProto$SchoolModeStatusChanged = new SchoolModeProto$SchoolModeStatusChanged();
        DEFAULT_INSTANCE = schoolModeProto$SchoolModeStatusChanged;
        GeneratedMessageLite.registerDefaultInstance(SchoolModeProto$SchoolModeStatusChanged.class, schoolModeProto$SchoolModeStatusChanged);
    }

    private SchoolModeProto$SchoolModeStatusChanged() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static SchoolModeProto$SchoolModeStatusChanged getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SchoolModeProto$SchoolModeStatusChanged parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SchoolModeProto$SchoolModeStatusChanged) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SchoolModeProto$SchoolModeStatusChanged parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeStatusChanged) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SchoolModeProto$SchoolModeStatusChanged> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ohg.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SchoolModeProto$SchoolModeStatusChanged();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SchoolModeProto$SchoolModeStatusChanged> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SchoolModeProto$SchoolModeStatusChanged.class) {
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

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeStatusChangedOrBuilder
    public int getStatus() {
        return this.status_;
    }

    public static Builder newBuilder(SchoolModeProto$SchoolModeStatusChanged schoolModeProto$SchoolModeStatusChanged) {
        return DEFAULT_INSTANCE.createBuilder(schoolModeProto$SchoolModeStatusChanged);
    }

    public static SchoolModeProto$SchoolModeStatusChanged parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeStatusChanged) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeStatusChanged parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeStatusChanged) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeStatusChanged parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeStatusChanged) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SchoolModeProto$SchoolModeStatusChanged parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeStatusChanged) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeStatusChanged parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeStatusChanged) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SchoolModeProto$SchoolModeStatusChanged parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeStatusChanged) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeStatusChanged parseFrom(InputStream inputStream) throws IOException {
        return (SchoolModeProto$SchoolModeStatusChanged) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SchoolModeProto$SchoolModeStatusChanged parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeStatusChanged) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeStatusChanged parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SchoolModeProto$SchoolModeStatusChanged) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SchoolModeProto$SchoolModeStatusChanged parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeStatusChanged) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
