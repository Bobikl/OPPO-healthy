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
public final class MusicProto$PlayState extends GeneratedMessageLite<MusicProto$PlayState, Builder> implements MusicProto$PlayStateOrBuilder {
    private static final MusicProto$PlayState DEFAULT_INSTANCE;
    private static volatile Parser<MusicProto$PlayState> PARSER = null;
    public static final int PLAY_STATE_TYPE_FIELD_NUMBER = 1;
    public static final int POSITION_FIELD_NUMBER = 2;
    public static final int SPEED_FIELD_NUMBER = 3;
    private int playStateType_;
    private int position_;
    private int speed_;

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$PlayState, Builder> implements MusicProto$PlayStateOrBuilder {
        public Builder clearPlayStateType() {
            copyOnWrite();
            ((MusicProto$PlayState) this.instance).clearPlayStateType();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((MusicProto$PlayState) this.instance).clearPosition();
            return this;
        }

        public Builder clearSpeed() {
            copyOnWrite();
            ((MusicProto$PlayState) this.instance).clearSpeed();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayStateOrBuilder
        public MusicProto$PlayStateType getPlayStateType() {
            return ((MusicProto$PlayState) this.instance).getPlayStateType();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayStateOrBuilder
        public int getPlayStateTypeValue() {
            return ((MusicProto$PlayState) this.instance).getPlayStateTypeValue();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayStateOrBuilder
        public int getPosition() {
            return ((MusicProto$PlayState) this.instance).getPosition();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$PlayStateOrBuilder
        public int getSpeed() {
            return ((MusicProto$PlayState) this.instance).getSpeed();
        }

        public Builder setPlayStateType(MusicProto$PlayStateType musicProto$PlayStateType) {
            copyOnWrite();
            ((MusicProto$PlayState) this.instance).setPlayStateType(musicProto$PlayStateType);
            return this;
        }

        public Builder setPlayStateTypeValue(int i) {
            copyOnWrite();
            ((MusicProto$PlayState) this.instance).setPlayStateTypeValue(i);
            return this;
        }

        public Builder setPosition(int i) {
            copyOnWrite();
            ((MusicProto$PlayState) this.instance).setPosition(i);
            return this;
        }

        public Builder setSpeed(int i) {
            copyOnWrite();
            ((MusicProto$PlayState) this.instance).setSpeed(i);
            return this;
        }

        private Builder() {
            super(MusicProto$PlayState.DEFAULT_INSTANCE);
        }
    }

    static {
        MusicProto$PlayState musicProto$PlayState = new MusicProto$PlayState();
        DEFAULT_INSTANCE = musicProto$PlayState;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$PlayState.class, musicProto$PlayState);
    }

    private MusicProto$PlayState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayStateType() {
        this.playStateType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeed() {
        this.speed_ = 0;
    }

    public static MusicProto$PlayState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$PlayState parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$PlayState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$PlayState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$PlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$PlayState> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayStateType(MusicProto$PlayStateType musicProto$PlayStateType) {
        this.playStateType_ = musicProto$PlayStateType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayStateTypeValue(int i) {
        this.playStateType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(int i) {
        this.position_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(int i) {
        this.speed_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$PlayState();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004", new Object[]{"playStateType_", "position_", "speed_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$PlayState> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$PlayState.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayStateOrBuilder
    public MusicProto$PlayStateType getPlayStateType() {
        MusicProto$PlayStateType musicProto$PlayStateTypeForNumber = MusicProto$PlayStateType.forNumber(this.playStateType_);
        return musicProto$PlayStateTypeForNumber == null ? MusicProto$PlayStateType.UNRECOGNIZED : musicProto$PlayStateTypeForNumber;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayStateOrBuilder
    public int getPlayStateTypeValue() {
        return this.playStateType_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayStateOrBuilder
    public int getPosition() {
        return this.position_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$PlayStateOrBuilder
    public int getSpeed() {
        return this.speed_;
    }

    public static Builder newBuilder(MusicProto$PlayState musicProto$PlayState) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$PlayState);
    }

    public static MusicProto$PlayState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$PlayState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$PlayState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$PlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$PlayState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$PlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$PlayState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$PlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$PlayState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$PlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$PlayState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$PlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$PlayState parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$PlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$PlayState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$PlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$PlayState parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$PlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$PlayState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$PlayState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
