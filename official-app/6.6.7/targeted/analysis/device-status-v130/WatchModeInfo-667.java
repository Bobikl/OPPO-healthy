package com.heytap.wearable.oaf.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.rjl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\official-device-assets\classes3.dex */
public final class WatchMode$WatchModeInfo extends GeneratedMessageLite<WatchMode$WatchModeInfo, Builder> implements WatchMode$WatchModeInfoOrBuilder {
    private static final WatchMode$WatchModeInfo DEFAULT_INSTANCE;
    public static final int PARING_SEQUENCE_FIELD_NUMBER = 5;
    private static volatile Parser<WatchMode$WatchModeInfo> PARSER = null;
    public static final int PHONE_MAC_FIELD_NUMBER = 6;
    public static final int PHONE_TYPE_FIELD_NUMBER = 4;
    public static final int REPLAY_SEQ_FIELD_NUMBER = 3;
    public static final int REQUEST_SEQ_FIELD_NUMBER = 2;
    public static final int WORK_MODE_FIELD_NUMBER = 1;
    private int paringSequence_;
    private ByteString phoneMac_ = ByteString.EMPTY;
    private int phoneType_;
    private int replaySeq_;
    private int requestSeq_;
    private int workMode_;

    public static final class Builder extends GeneratedMessageLite.Builder<WatchMode$WatchModeInfo, Builder> implements WatchMode$WatchModeInfoOrBuilder {
        public Builder clearParingSequence() {
            copyOnWrite();
            ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).clearParingSequence();
            return this;
        }

        public Builder clearPhoneMac() {
            copyOnWrite();
            ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).clearPhoneMac();
            return this;
        }

        public Builder clearPhoneType() {
            copyOnWrite();
            ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).clearPhoneType();
            return this;
        }

        public Builder clearReplaySeq() {
            copyOnWrite();
            ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).clearReplaySeq();
            return this;
        }

        public Builder clearRequestSeq() {
            copyOnWrite();
            ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).clearRequestSeq();
            return this;
        }

        public Builder clearWorkMode() {
            copyOnWrite();
            ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).clearWorkMode();
            return this;
        }

        @Override // com.heytap.wearable.oaf.proto.WatchMode$WatchModeInfoOrBuilder
        public int getParingSequence() {
            return ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).getParingSequence();
        }

        @Override // com.heytap.wearable.oaf.proto.WatchMode$WatchModeInfoOrBuilder
        public ByteString getPhoneMac() {
            return ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).getPhoneMac();
        }

        @Override // com.heytap.wearable.oaf.proto.WatchMode$WatchModeInfoOrBuilder
        public int getPhoneType() {
            return ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).getPhoneType();
        }

        @Override // com.heytap.wearable.oaf.proto.WatchMode$WatchModeInfoOrBuilder
        public int getReplaySeq() {
            return ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).getReplaySeq();
        }

        @Override // com.heytap.wearable.oaf.proto.WatchMode$WatchModeInfoOrBuilder
        public int getRequestSeq() {
            return ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).getRequestSeq();
        }

        @Override // com.heytap.wearable.oaf.proto.WatchMode$WatchModeInfoOrBuilder
        public int getWorkMode() {
            return ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).getWorkMode();
        }

        public Builder setParingSequence(int i) {
            copyOnWrite();
            ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).setParingSequence(i);
            return this;
        }

        public Builder setPhoneMac(ByteString byteString) {
            copyOnWrite();
            ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).setPhoneMac(byteString);
            return this;
        }

        public Builder setPhoneType(int i) {
            copyOnWrite();
            ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).setPhoneType(i);
            return this;
        }

        public Builder setReplaySeq(int i) {
            copyOnWrite();
            ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).setReplaySeq(i);
            return this;
        }

        public Builder setRequestSeq(int i) {
            copyOnWrite();
            ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).setRequestSeq(i);
            return this;
        }

        public Builder setWorkMode(int i) {
            copyOnWrite();
            ((WatchMode$WatchModeInfo) ((GeneratedMessageLite.Builder) this).instance).setWorkMode(i);
            return this;
        }

        private Builder() {
            super(WatchMode$WatchModeInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        WatchMode$WatchModeInfo watchMode$WatchModeInfo = new WatchMode$WatchModeInfo();
        DEFAULT_INSTANCE = watchMode$WatchModeInfo;
        GeneratedMessageLite.registerDefaultInstance(WatchMode$WatchModeInfo.class, watchMode$WatchModeInfo);
    }

    private WatchMode$WatchModeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParingSequence() {
        this.paringSequence_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhoneMac() {
        this.phoneMac_ = getDefaultInstance().getPhoneMac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhoneType() {
        this.phoneType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplaySeq() {
        this.replaySeq_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestSeq() {
        this.requestSeq_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkMode() {
        this.workMode_ = 0;
    }

    public static WatchMode$WatchModeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchMode$WatchModeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchMode$WatchModeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchMode$WatchModeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchMode$WatchModeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchMode$WatchModeInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParingSequence(int i) {
        this.paringSequence_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneMac(ByteString byteString) {
        byteString.getClass();
        this.phoneMac_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneType(int i) {
        this.phoneType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplaySeq(int i) {
        this.replaySeq_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestSeq(int i) {
        this.requestSeq_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkMode(int i) {
        this.workMode_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rjl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchMode$WatchModeInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u0004\u0005\u0004\u0006\n", new Object[]{"workMode_", "requestSeq_", "replaySeq_", "phoneType_", "paringSequence_", "phoneMac_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchMode$WatchModeInfo.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.wearable.oaf.proto.WatchMode$WatchModeInfoOrBuilder
    public int getParingSequence() {
        return this.paringSequence_;
    }

    @Override // com.heytap.wearable.oaf.proto.WatchMode$WatchModeInfoOrBuilder
    public ByteString getPhoneMac() {
        return this.phoneMac_;
    }

    @Override // com.heytap.wearable.oaf.proto.WatchMode$WatchModeInfoOrBuilder
    public int getPhoneType() {
        return this.phoneType_;
    }

    @Override // com.heytap.wearable.oaf.proto.WatchMode$WatchModeInfoOrBuilder
    public int getReplaySeq() {
        return this.replaySeq_;
    }

    @Override // com.heytap.wearable.oaf.proto.WatchMode$WatchModeInfoOrBuilder
    public int getRequestSeq() {
        return this.requestSeq_;
    }

    @Override // com.heytap.wearable.oaf.proto.WatchMode$WatchModeInfoOrBuilder
    public int getWorkMode() {
        return this.workMode_;
    }

    public static Builder newBuilder(WatchMode$WatchModeInfo watchMode$WatchModeInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(watchMode$WatchModeInfo);
    }

    public static WatchMode$WatchModeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchMode$WatchModeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchMode$WatchModeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchMode$WatchModeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchMode$WatchModeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchMode$WatchModeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchMode$WatchModeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchMode$WatchModeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchMode$WatchModeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchMode$WatchModeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchMode$WatchModeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchMode$WatchModeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchMode$WatchModeInfo parseFrom(InputStream inputStream) throws IOException {
        return (WatchMode$WatchModeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchMode$WatchModeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchMode$WatchModeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchMode$WatchModeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchMode$WatchModeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchMode$WatchModeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchMode$WatchModeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
