package com.heytap.wearable.soundrecord.bean;

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
public final class SoundRecord$RecordSwitchAutoSyncResponse extends GeneratedMessageLite<SoundRecord$RecordSwitchAutoSyncResponse, Builder> implements SoundRecord$RecordSwitchAutoSyncResponseOrBuilder {
    private static final SoundRecord$RecordSwitchAutoSyncResponse DEFAULT_INSTANCE;
    private static volatile Parser<SoundRecord$RecordSwitchAutoSyncResponse> PARSER = null;
    public static final int SWITCH_FIELD_NUMBER = 1;
    private int switch_;

    public static final class Builder extends GeneratedMessageLite.Builder<SoundRecord$RecordSwitchAutoSyncResponse, Builder> implements SoundRecord$RecordSwitchAutoSyncResponseOrBuilder {
        public Builder clearSwitch() {
            copyOnWrite();
            ((SoundRecord$RecordSwitchAutoSyncResponse) this.instance).clearSwitch();
            return this;
        }

        @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordSwitchAutoSyncResponseOrBuilder
        public int getSwitch() {
            return ((SoundRecord$RecordSwitchAutoSyncResponse) this.instance).getSwitch();
        }

        public Builder setSwitch(int i) {
            copyOnWrite();
            ((SoundRecord$RecordSwitchAutoSyncResponse) this.instance).setSwitch(i);
            return this;
        }

        private Builder() {
            super(SoundRecord$RecordSwitchAutoSyncResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        SoundRecord$RecordSwitchAutoSyncResponse soundRecord$RecordSwitchAutoSyncResponse = new SoundRecord$RecordSwitchAutoSyncResponse();
        DEFAULT_INSTANCE = soundRecord$RecordSwitchAutoSyncResponse;
        GeneratedMessageLite.registerDefaultInstance(SoundRecord$RecordSwitchAutoSyncResponse.class, soundRecord$RecordSwitchAutoSyncResponse);
    }

    private SoundRecord$RecordSwitchAutoSyncResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitch() {
        this.switch_ = 0;
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordSwitchAutoSyncResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSwitchAutoSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SoundRecord$RecordSwitchAutoSyncResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitch(int i) {
        this.switch_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = c3i.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SoundRecord$RecordSwitchAutoSyncResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"switch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SoundRecord$RecordSwitchAutoSyncResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SoundRecord$RecordSwitchAutoSyncResponse.class) {
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

    @Override // com.heytap.wearable.soundrecord.bean.SoundRecord$RecordSwitchAutoSyncResponseOrBuilder
    public int getSwitch() {
        return this.switch_;
    }

    public static Builder newBuilder(SoundRecord$RecordSwitchAutoSyncResponse soundRecord$RecordSwitchAutoSyncResponse) {
        return DEFAULT_INSTANCE.createBuilder(soundRecord$RecordSwitchAutoSyncResponse);
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordSwitchAutoSyncResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSwitchAutoSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSwitchAutoSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSwitchAutoSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSwitchAutoSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SoundRecord$RecordSwitchAutoSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse parseFrom(InputStream inputStream) throws IOException {
        return (SoundRecord$RecordSwitchAutoSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordSwitchAutoSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SoundRecord$RecordSwitchAutoSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SoundRecord$RecordSwitchAutoSyncResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SoundRecord$RecordSwitchAutoSyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
