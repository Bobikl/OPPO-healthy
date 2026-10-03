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
public final class SchoolModeProto$SchoolModePairInfo extends GeneratedMessageLite<SchoolModeProto$SchoolModePairInfo, Builder> implements SchoolModeProto$SchoolModePairInfoOrBuilder {
    private static final SchoolModeProto$SchoolModePairInfo DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    private static volatile Parser<SchoolModeProto$SchoolModePairInfo> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int id_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<SchoolModeProto$SchoolModePairInfo, Builder> implements SchoolModeProto$SchoolModePairInfoOrBuilder {
        public Builder clearId() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModePairInfo) this.instance).clearId();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModePairInfo) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModePairInfoOrBuilder
        public int getId() {
            return ((SchoolModeProto$SchoolModePairInfo) this.instance).getId();
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModePairInfoOrBuilder
        public int getType() {
            return ((SchoolModeProto$SchoolModePairInfo) this.instance).getType();
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModePairInfo) this.instance).setId(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModePairInfo) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(SchoolModeProto$SchoolModePairInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        SchoolModeProto$SchoolModePairInfo schoolModeProto$SchoolModePairInfo = new SchoolModeProto$SchoolModePairInfo();
        DEFAULT_INSTANCE = schoolModeProto$SchoolModePairInfo;
        GeneratedMessageLite.registerDefaultInstance(SchoolModeProto$SchoolModePairInfo.class, schoolModeProto$SchoolModePairInfo);
    }

    private SchoolModeProto$SchoolModePairInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static SchoolModeProto$SchoolModePairInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SchoolModeProto$SchoolModePairInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SchoolModeProto$SchoolModePairInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SchoolModeProto$SchoolModePairInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModePairInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SchoolModeProto$SchoolModePairInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ohg.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SchoolModeProto$SchoolModePairInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"type_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SchoolModeProto$SchoolModePairInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SchoolModeProto$SchoolModePairInfo.class) {
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

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModePairInfoOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModePairInfoOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(SchoolModeProto$SchoolModePairInfo schoolModeProto$SchoolModePairInfo) {
        return DEFAULT_INSTANCE.createBuilder(schoolModeProto$SchoolModePairInfo);
    }

    public static SchoolModeProto$SchoolModePairInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModePairInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModePairInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModePairInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModePairInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModePairInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SchoolModeProto$SchoolModePairInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModePairInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModePairInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModePairInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SchoolModeProto$SchoolModePairInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModePairInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModePairInfo parseFrom(InputStream inputStream) throws IOException {
        return (SchoolModeProto$SchoolModePairInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SchoolModeProto$SchoolModePairInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModePairInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModePairInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SchoolModeProto$SchoolModePairInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SchoolModeProto$SchoolModePairInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModePairInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
