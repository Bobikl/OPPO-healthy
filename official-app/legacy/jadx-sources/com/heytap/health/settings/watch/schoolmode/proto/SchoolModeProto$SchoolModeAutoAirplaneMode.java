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
public final class SchoolModeProto$SchoolModeAutoAirplaneMode extends GeneratedMessageLite<SchoolModeProto$SchoolModeAutoAirplaneMode, Builder> implements SchoolModeProto$SchoolModeAutoAirplaneModeOrBuilder {
    private static final SchoolModeProto$SchoolModeAutoAirplaneMode DEFAULT_INSTANCE;
    public static final int ENABLE_FIELD_NUMBER = 2;
    private static volatile Parser<SchoolModeProto$SchoolModeAutoAirplaneMode> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int enable_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<SchoolModeProto$SchoolModeAutoAirplaneMode, Builder> implements SchoolModeProto$SchoolModeAutoAirplaneModeOrBuilder {
        public Builder clearEnable() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeAutoAirplaneMode) this.instance).clearEnable();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeAutoAirplaneMode) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAutoAirplaneModeOrBuilder
        public int getEnable() {
            return ((SchoolModeProto$SchoolModeAutoAirplaneMode) this.instance).getEnable();
        }

        @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAutoAirplaneModeOrBuilder
        public int getType() {
            return ((SchoolModeProto$SchoolModeAutoAirplaneMode) this.instance).getType();
        }

        public Builder setEnable(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeAutoAirplaneMode) this.instance).setEnable(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((SchoolModeProto$SchoolModeAutoAirplaneMode) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(SchoolModeProto$SchoolModeAutoAirplaneMode.DEFAULT_INSTANCE);
        }
    }

    static {
        SchoolModeProto$SchoolModeAutoAirplaneMode schoolModeProto$SchoolModeAutoAirplaneMode = new SchoolModeProto$SchoolModeAutoAirplaneMode();
        DEFAULT_INSTANCE = schoolModeProto$SchoolModeAutoAirplaneMode;
        GeneratedMessageLite.registerDefaultInstance(SchoolModeProto$SchoolModeAutoAirplaneMode.class, schoolModeProto$SchoolModeAutoAirplaneMode);
    }

    private SchoolModeProto$SchoolModeAutoAirplaneMode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnable() {
        this.enable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SchoolModeProto$SchoolModeAutoAirplaneMode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeAutoAirplaneMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SchoolModeProto$SchoolModeAutoAirplaneMode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnable(int i) {
        this.enable_ = i;
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
                return new SchoolModeProto$SchoolModeAutoAirplaneMode();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"type_", "enable_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SchoolModeProto$SchoolModeAutoAirplaneMode> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SchoolModeProto$SchoolModeAutoAirplaneMode.class) {
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

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAutoAirplaneModeOrBuilder
    public int getEnable() {
        return this.enable_;
    }

    @Override // com.heytap.health.settings.watch.schoolmode.proto.SchoolModeProto$SchoolModeAutoAirplaneModeOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(SchoolModeProto$SchoolModeAutoAirplaneMode schoolModeProto$SchoolModeAutoAirplaneMode) {
        return DEFAULT_INSTANCE.createBuilder(schoolModeProto$SchoolModeAutoAirplaneMode);
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeAutoAirplaneMode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeAutoAirplaneMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeAutoAirplaneMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeAutoAirplaneMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeAutoAirplaneMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SchoolModeProto$SchoolModeAutoAirplaneMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode parseFrom(InputStream inputStream) throws IOException {
        return (SchoolModeProto$SchoolModeAutoAirplaneMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeAutoAirplaneMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SchoolModeProto$SchoolModeAutoAirplaneMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SchoolModeProto$SchoolModeAutoAirplaneMode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SchoolModeProto$SchoolModeAutoAirplaneMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
