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
public final class MusicProto$DeviceMusicControlConfig extends GeneratedMessageLite<MusicProto$DeviceMusicControlConfig, Builder> implements MusicProto$DeviceMusicControlConfigOrBuilder {
    private static final MusicProto$DeviceMusicControlConfig DEFAULT_INSTANCE;
    private static volatile Parser<MusicProto$DeviceMusicControlConfig> PARSER = null;
    public static final int SHOWCONTROLVIEW_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private boolean showControlView_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$DeviceMusicControlConfig, Builder> implements MusicProto$DeviceMusicControlConfigOrBuilder {
        public Builder clearShowControlView() {
            copyOnWrite();
            ((MusicProto$DeviceMusicControlConfig) this.instance).clearShowControlView();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((MusicProto$DeviceMusicControlConfig) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$DeviceMusicControlConfigOrBuilder
        public boolean getShowControlView() {
            return ((MusicProto$DeviceMusicControlConfig) this.instance).getShowControlView();
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$DeviceMusicControlConfigOrBuilder
        public int getType() {
            return ((MusicProto$DeviceMusicControlConfig) this.instance).getType();
        }

        public Builder setShowControlView(boolean z) {
            copyOnWrite();
            ((MusicProto$DeviceMusicControlConfig) this.instance).setShowControlView(z);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((MusicProto$DeviceMusicControlConfig) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(MusicProto$DeviceMusicControlConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        MusicProto$DeviceMusicControlConfig musicProto$DeviceMusicControlConfig = new MusicProto$DeviceMusicControlConfig();
        DEFAULT_INSTANCE = musicProto$DeviceMusicControlConfig;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$DeviceMusicControlConfig.class, musicProto$DeviceMusicControlConfig);
    }

    private MusicProto$DeviceMusicControlConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowControlView() {
        this.showControlView_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static MusicProto$DeviceMusicControlConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$DeviceMusicControlConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$DeviceMusicControlConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$DeviceMusicControlConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$DeviceMusicControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$DeviceMusicControlConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowControlView(boolean z) {
        this.showControlView_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$DeviceMusicControlConfig();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u0007", new Object[]{"type_", "showControlView_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$DeviceMusicControlConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$DeviceMusicControlConfig.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$DeviceMusicControlConfigOrBuilder
    public boolean getShowControlView() {
        return this.showControlView_;
    }

    @Override // com.heytap.wearable.music.proto.MusicProto$DeviceMusicControlConfigOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(MusicProto$DeviceMusicControlConfig musicProto$DeviceMusicControlConfig) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$DeviceMusicControlConfig);
    }

    public static MusicProto$DeviceMusicControlConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$DeviceMusicControlConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$DeviceMusicControlConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$DeviceMusicControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$DeviceMusicControlConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$DeviceMusicControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$DeviceMusicControlConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$DeviceMusicControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$DeviceMusicControlConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$DeviceMusicControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$DeviceMusicControlConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$DeviceMusicControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$DeviceMusicControlConfig parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$DeviceMusicControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$DeviceMusicControlConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$DeviceMusicControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$DeviceMusicControlConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$DeviceMusicControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$DeviceMusicControlConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$DeviceMusicControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
