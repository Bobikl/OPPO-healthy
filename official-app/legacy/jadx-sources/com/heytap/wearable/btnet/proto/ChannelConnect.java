package com.heytap.wearable.btnet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ChannelConnect extends GeneratedMessageLite<ChannelConnect, Builder> implements ChannelConnectOrBuilder {
    public static final int CONNECTED_FIELD_NUMBER = 1;
    private static final ChannelConnect DEFAULT_INSTANCE;
    public static final int ENABLEVPN_FIELD_NUMBER = 2;
    private static volatile Parser<ChannelConnect> PARSER;
    private boolean connected_;
    private boolean enablevpn_;

    /* JADX INFO: renamed from: com.heytap.wearable.btnet.proto.ChannelConnect$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ChannelConnect, Builder> implements ChannelConnectOrBuilder {
        public Builder clearConnected() {
            copyOnWrite();
            ((ChannelConnect) this.instance).clearConnected();
            return this;
        }

        public Builder clearEnablevpn() {
            copyOnWrite();
            ((ChannelConnect) this.instance).clearEnablevpn();
            return this;
        }

        @Override // com.heytap.wearable.btnet.proto.ChannelConnectOrBuilder
        public boolean getConnected() {
            return ((ChannelConnect) this.instance).getConnected();
        }

        @Override // com.heytap.wearable.btnet.proto.ChannelConnectOrBuilder
        public boolean getEnablevpn() {
            return ((ChannelConnect) this.instance).getEnablevpn();
        }

        public Builder setConnected(boolean z) {
            copyOnWrite();
            ((ChannelConnect) this.instance).setConnected(z);
            return this;
        }

        public Builder setEnablevpn(boolean z) {
            copyOnWrite();
            ((ChannelConnect) this.instance).setEnablevpn(z);
            return this;
        }

        private Builder() {
            super(ChannelConnect.DEFAULT_INSTANCE);
        }
    }

    static {
        ChannelConnect channelConnect = new ChannelConnect();
        DEFAULT_INSTANCE = channelConnect;
        GeneratedMessageLite.registerDefaultInstance(ChannelConnect.class, channelConnect);
    }

    private ChannelConnect() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnected() {
        this.connected_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnablevpn() {
        this.enablevpn_ = false;
    }

    public static ChannelConnect getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ChannelConnect parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ChannelConnect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChannelConnect parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ChannelConnect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ChannelConnect> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnected(boolean z) {
        this.connected_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnablevpn(boolean z) {
        this.enablevpn_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ChannelConnect();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"connected_", "enablevpn_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ChannelConnect> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ChannelConnect.class) {
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

    @Override // com.heytap.wearable.btnet.proto.ChannelConnectOrBuilder
    public boolean getConnected() {
        return this.connected_;
    }

    @Override // com.heytap.wearable.btnet.proto.ChannelConnectOrBuilder
    public boolean getEnablevpn() {
        return this.enablevpn_;
    }

    public static Builder newBuilder(ChannelConnect channelConnect) {
        return DEFAULT_INSTANCE.createBuilder(channelConnect);
    }

    public static ChannelConnect parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChannelConnect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChannelConnect parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChannelConnect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ChannelConnect parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ChannelConnect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ChannelConnect parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChannelConnect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ChannelConnect parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ChannelConnect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChannelConnect parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChannelConnect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ChannelConnect parseFrom(InputStream inputStream) throws IOException {
        return (ChannelConnect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChannelConnect parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChannelConnect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChannelConnect parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ChannelConnect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ChannelConnect parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChannelConnect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
