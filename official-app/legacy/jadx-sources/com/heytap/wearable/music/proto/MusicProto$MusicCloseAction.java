package com.heytap.wearable.music.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.ibc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicProto$MusicCloseAction extends GeneratedMessageLite<MusicProto$MusicCloseAction, Builder> implements MusicProto$MusicCloseActionOrBuilder {
    private static final MusicProto$MusicCloseAction DEFAULT_INSTANCE;
    public static final int MUSIC_CLOSE_ACTION_FIELD_NUMBER = 1;
    private static volatile Parser<MusicProto$MusicCloseAction> PARSER;
    private int musicCloseAction_;

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$MusicCloseAction, Builder> implements MusicProto$MusicCloseActionOrBuilder {
        public Builder clearMusicCloseAction() {
            copyOnWrite();
            ((MusicProto$MusicCloseAction) this.instance).clearMusicCloseAction();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$MusicCloseActionOrBuilder
        public int getMusicCloseAction() {
            return ((MusicProto$MusicCloseAction) this.instance).getMusicCloseAction();
        }

        public Builder setMusicCloseAction(int i) {
            copyOnWrite();
            ((MusicProto$MusicCloseAction) this.instance).setMusicCloseAction(i);
            return this;
        }

        private Builder() {
            super(MusicProto$MusicCloseAction.DEFAULT_INSTANCE);
        }
    }

    static {
        MusicProto$MusicCloseAction musicProto$MusicCloseAction = new MusicProto$MusicCloseAction();
        DEFAULT_INSTANCE = musicProto$MusicCloseAction;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$MusicCloseAction.class, musicProto$MusicCloseAction);
    }

    private MusicProto$MusicCloseAction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusicCloseAction() {
        this.musicCloseAction_ = 0;
    }

    public static MusicProto$MusicCloseAction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$MusicCloseAction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$MusicCloseAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$MusicCloseAction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$MusicCloseAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$MusicCloseAction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicCloseAction(int i) {
        this.musicCloseAction_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$MusicCloseAction();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"musicCloseAction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$MusicCloseAction> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$MusicCloseAction.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$MusicCloseActionOrBuilder
    public int getMusicCloseAction() {
        return this.musicCloseAction_;
    }

    public static Builder newBuilder(MusicProto$MusicCloseAction musicProto$MusicCloseAction) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$MusicCloseAction);
    }

    public static MusicProto$MusicCloseAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicCloseAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$MusicCloseAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicCloseAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$MusicCloseAction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$MusicCloseAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$MusicCloseAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicCloseAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$MusicCloseAction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$MusicCloseAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$MusicCloseAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicCloseAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$MusicCloseAction parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$MusicCloseAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$MusicCloseAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicCloseAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$MusicCloseAction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$MusicCloseAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$MusicCloseAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicCloseAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
