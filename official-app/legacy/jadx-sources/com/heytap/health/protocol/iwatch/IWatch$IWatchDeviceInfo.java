package com.heytap.health.protocol.iwatch;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.f0a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class IWatch$IWatchDeviceInfo extends GeneratedMessageLite<IWatch$IWatchDeviceInfo, Builder> implements IWatch$IWatchDeviceInfoOrBuilder {
    public static final int APP_VERSION_CODE_FIELD_NUMBER = 1;
    private static final IWatch$IWatchDeviceInfo DEFAULT_INSTANCE;
    private static volatile Parser<IWatch$IWatchDeviceInfo> PARSER;
    private long appVersionCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<IWatch$IWatchDeviceInfo, Builder> implements IWatch$IWatchDeviceInfoOrBuilder {
        public Builder clearAppVersionCode() {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfo) this.instance).clearAppVersionCode();
            return this;
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoOrBuilder
        public long getAppVersionCode() {
            return ((IWatch$IWatchDeviceInfo) this.instance).getAppVersionCode();
        }

        public Builder setAppVersionCode(long j2) {
            copyOnWrite();
            ((IWatch$IWatchDeviceInfo) this.instance).setAppVersionCode(j2);
            return this;
        }

        private Builder() {
            super(IWatch$IWatchDeviceInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        IWatch$IWatchDeviceInfo iWatch$IWatchDeviceInfo = new IWatch$IWatchDeviceInfo();
        DEFAULT_INSTANCE = iWatch$IWatchDeviceInfo;
        GeneratedMessageLite.registerDefaultInstance(IWatch$IWatchDeviceInfo.class, iWatch$IWatchDeviceInfo);
    }

    private IWatch$IWatchDeviceInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersionCode() {
        this.appVersionCode_ = 0L;
    }

    public static IWatch$IWatchDeviceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IWatch$IWatchDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IWatch$IWatchDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$IWatchDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IWatch$IWatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IWatch$IWatchDeviceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersionCode(long j2) {
        this.appVersionCode_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = f0a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IWatch$IWatchDeviceInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"appVersionCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IWatch$IWatchDeviceInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IWatch$IWatchDeviceInfo.class) {
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

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoOrBuilder
    public long getAppVersionCode() {
        return this.appVersionCode_;
    }

    public static Builder newBuilder(IWatch$IWatchDeviceInfo iWatch$IWatchDeviceInfo) {
        return DEFAULT_INSTANCE.createBuilder(iWatch$IWatchDeviceInfo);
    }

    public static IWatch$IWatchDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$IWatchDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IWatch$IWatchDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IWatch$IWatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IWatch$IWatchDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IWatch$IWatchDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IWatch$IWatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IWatch$IWatchDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IWatch$IWatchDeviceInfo parseFrom(InputStream inputStream) throws IOException {
        return (IWatch$IWatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$IWatchDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$IWatchDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IWatch$IWatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IWatch$IWatchDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
