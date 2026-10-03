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
public final class IWatch$IWatchBatteryInfo extends GeneratedMessageLite<IWatch$IWatchBatteryInfo, Builder> implements IWatch$IWatchBatteryInfoOrBuilder {
    public static final int BATTERY_PERCENT_FIELD_NUMBER = 1;
    private static final IWatch$IWatchBatteryInfo DEFAULT_INSTANCE;
    public static final int IS_CHARGING_FIELD_NUMBER = 2;
    private static volatile Parser<IWatch$IWatchBatteryInfo> PARSER;
    private int batteryPercent_;
    private int isCharging_;

    public static final class Builder extends GeneratedMessageLite.Builder<IWatch$IWatchBatteryInfo, Builder> implements IWatch$IWatchBatteryInfoOrBuilder {
        public Builder clearBatteryPercent() {
            copyOnWrite();
            ((IWatch$IWatchBatteryInfo) this.instance).clearBatteryPercent();
            return this;
        }

        public Builder clearIsCharging() {
            copyOnWrite();
            ((IWatch$IWatchBatteryInfo) this.instance).clearIsCharging();
            return this;
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchBatteryInfoOrBuilder
        public int getBatteryPercent() {
            return ((IWatch$IWatchBatteryInfo) this.instance).getBatteryPercent();
        }

        @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchBatteryInfoOrBuilder
        public int getIsCharging() {
            return ((IWatch$IWatchBatteryInfo) this.instance).getIsCharging();
        }

        public Builder setBatteryPercent(int i) {
            copyOnWrite();
            ((IWatch$IWatchBatteryInfo) this.instance).setBatteryPercent(i);
            return this;
        }

        public Builder setIsCharging(int i) {
            copyOnWrite();
            ((IWatch$IWatchBatteryInfo) this.instance).setIsCharging(i);
            return this;
        }

        private Builder() {
            super(IWatch$IWatchBatteryInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        IWatch$IWatchBatteryInfo iWatch$IWatchBatteryInfo = new IWatch$IWatchBatteryInfo();
        DEFAULT_INSTANCE = iWatch$IWatchBatteryInfo;
        GeneratedMessageLite.registerDefaultInstance(IWatch$IWatchBatteryInfo.class, iWatch$IWatchBatteryInfo);
    }

    private IWatch$IWatchBatteryInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryPercent() {
        this.batteryPercent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCharging() {
        this.isCharging_ = 0;
    }

    public static IWatch$IWatchBatteryInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IWatch$IWatchBatteryInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IWatch$IWatchBatteryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$IWatchBatteryInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IWatch$IWatchBatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IWatch$IWatchBatteryInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryPercent(int i) {
        this.batteryPercent_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCharging(int i) {
        this.isCharging_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = f0a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IWatch$IWatchBatteryInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u000b", new Object[]{"batteryPercent_", "isCharging_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IWatch$IWatchBatteryInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IWatch$IWatchBatteryInfo.class) {
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

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchBatteryInfoOrBuilder
    public int getBatteryPercent() {
        return this.batteryPercent_;
    }

    @Override // com.heytap.health.protocol.iwatch.IWatch$IWatchBatteryInfoOrBuilder
    public int getIsCharging() {
        return this.isCharging_;
    }

    public static Builder newBuilder(IWatch$IWatchBatteryInfo iWatch$IWatchBatteryInfo) {
        return DEFAULT_INSTANCE.createBuilder(iWatch$IWatchBatteryInfo);
    }

    public static IWatch$IWatchBatteryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchBatteryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$IWatchBatteryInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchBatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IWatch$IWatchBatteryInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IWatch$IWatchBatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IWatch$IWatchBatteryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchBatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IWatch$IWatchBatteryInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IWatch$IWatchBatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IWatch$IWatchBatteryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IWatch$IWatchBatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IWatch$IWatchBatteryInfo parseFrom(InputStream inputStream) throws IOException {
        return (IWatch$IWatchBatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IWatch$IWatchBatteryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchBatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IWatch$IWatchBatteryInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IWatch$IWatchBatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IWatch$IWatchBatteryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IWatch$IWatchBatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
