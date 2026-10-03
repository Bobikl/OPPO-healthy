package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.l8l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchAppProto$WatchDeviceInfo extends GeneratedMessageLite<WatchAppProto$WatchDeviceInfo, Builder> implements WatchAppProto$WatchDeviceInfoOrBuilder {
    public static final int CHANNEL_FIELD_NUMBER = 1;
    public static final int COLOR_OS_VERSION_FIELD_NUMBER = 3;
    private static final WatchAppProto$WatchDeviceInfo DEFAULT_INSTANCE;
    public static final int FIRMWARE_ID_FIELD_NUMBER = 4;
    public static final int INSTANT_SW_CLOSE_FIELD_NUMBER = 9;
    public static final int INSTANT_VERSION_FIELD_NUMBER = 8;
    public static final int LOCALE_FIELD_NUMBER = 2;
    private static volatile Parser<WatchAppProto$WatchDeviceInfo> PARSER = null;
    public static final int SCREEN_TYPE_FIELD_NUMBER = 10;
    public static final int STORE_VERSION_FIELD_NUMBER = 7;
    public static final int UA_FIELD_NUMBER = 6;
    public static final int UNIQUE_ID_FIELD_NUMBER = 5;
    private boolean instantSwClose_;
    private int instantVersion_;
    private int screenType_;
    private int storeVersion_;
    private String channel_ = "";
    private String locale_ = "";
    private String colorOsVersion_ = "";
    private String firmwareId_ = "";
    private String uniqueId_ = "";
    private String ua_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$WatchDeviceInfo, Builder> implements WatchAppProto$WatchDeviceInfoOrBuilder {
        public Builder clearChannel() {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).clearChannel();
            return this;
        }

        public Builder clearColorOsVersion() {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).clearColorOsVersion();
            return this;
        }

        public Builder clearFirmwareId() {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).clearFirmwareId();
            return this;
        }

        public Builder clearInstantSwClose() {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).clearInstantSwClose();
            return this;
        }

        public Builder clearInstantVersion() {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).clearInstantVersion();
            return this;
        }

        public Builder clearLocale() {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).clearLocale();
            return this;
        }

        public Builder clearScreenType() {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).clearScreenType();
            return this;
        }

        public Builder clearStoreVersion() {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).clearStoreVersion();
            return this;
        }

        public Builder clearUa() {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).clearUa();
            return this;
        }

        public Builder clearUniqueId() {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).clearUniqueId();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public String getChannel() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getChannel();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public ByteString getChannelBytes() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getChannelBytes();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public String getColorOsVersion() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getColorOsVersion();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public ByteString getColorOsVersionBytes() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getColorOsVersionBytes();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public String getFirmwareId() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getFirmwareId();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public ByteString getFirmwareIdBytes() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getFirmwareIdBytes();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public boolean getInstantSwClose() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getInstantSwClose();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public int getInstantVersion() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getInstantVersion();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public String getLocale() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getLocale();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public ByteString getLocaleBytes() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getLocaleBytes();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public WatchAppProto$WatchScreenType getScreenType() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getScreenType();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public int getScreenTypeValue() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getScreenTypeValue();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public int getStoreVersion() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getStoreVersion();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public String getUa() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getUa();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public ByteString getUaBytes() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getUaBytes();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public String getUniqueId() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getUniqueId();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
        public ByteString getUniqueIdBytes() {
            return ((WatchAppProto$WatchDeviceInfo) this.instance).getUniqueIdBytes();
        }

        public Builder setChannel(String str) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setChannel(str);
            return this;
        }

        public Builder setChannelBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setChannelBytes(byteString);
            return this;
        }

        public Builder setColorOsVersion(String str) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setColorOsVersion(str);
            return this;
        }

        public Builder setColorOsVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setColorOsVersionBytes(byteString);
            return this;
        }

        public Builder setFirmwareId(String str) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setFirmwareId(str);
            return this;
        }

        public Builder setFirmwareIdBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setFirmwareIdBytes(byteString);
            return this;
        }

        public Builder setInstantSwClose(boolean z) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setInstantSwClose(z);
            return this;
        }

        public Builder setInstantVersion(int i) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setInstantVersion(i);
            return this;
        }

        public Builder setLocale(String str) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setLocale(str);
            return this;
        }

        public Builder setLocaleBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setLocaleBytes(byteString);
            return this;
        }

        public Builder setScreenType(WatchAppProto$WatchScreenType watchAppProto$WatchScreenType) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setScreenType(watchAppProto$WatchScreenType);
            return this;
        }

        public Builder setScreenTypeValue(int i) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setScreenTypeValue(i);
            return this;
        }

        public Builder setStoreVersion(int i) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setStoreVersion(i);
            return this;
        }

        public Builder setUa(String str) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setUa(str);
            return this;
        }

        public Builder setUaBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setUaBytes(byteString);
            return this;
        }

        public Builder setUniqueId(String str) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setUniqueId(str);
            return this;
        }

        public Builder setUniqueIdBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchAppProto$WatchDeviceInfo) this.instance).setUniqueIdBytes(byteString);
            return this;
        }

        private Builder() {
            super(WatchAppProto$WatchDeviceInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        WatchAppProto$WatchDeviceInfo watchAppProto$WatchDeviceInfo = new WatchAppProto$WatchDeviceInfo();
        DEFAULT_INSTANCE = watchAppProto$WatchDeviceInfo;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$WatchDeviceInfo.class, watchAppProto$WatchDeviceInfo);
    }

    private WatchAppProto$WatchDeviceInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChannel() {
        this.channel_ = getDefaultInstance().getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColorOsVersion() {
        this.colorOsVersion_ = getDefaultInstance().getColorOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirmwareId() {
        this.firmwareId_ = getDefaultInstance().getFirmwareId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstantSwClose() {
        this.instantSwClose_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstantVersion() {
        this.instantVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenType() {
        this.screenType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoreVersion() {
        this.storeVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUa() {
        this.ua_ = getDefaultInstance().getUa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUniqueId() {
        this.uniqueId_ = getDefaultInstance().getUniqueId();
    }

    public static WatchAppProto$WatchDeviceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchAppProto$WatchDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$WatchDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$WatchDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$WatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$WatchDeviceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannel(String str) {
        str.getClass();
        this.channel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.channel_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorOsVersion(String str) {
        str.getClass();
        this.colorOsVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorOsVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.colorOsVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirmwareId(String str) {
        str.getClass();
        this.firmwareId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirmwareIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.firmwareId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstantSwClose(boolean z) {
        this.instantSwClose_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstantVersion(int i) {
        this.instantVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        str.getClass();
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.locale_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenType(WatchAppProto$WatchScreenType watchAppProto$WatchScreenType) {
        this.screenType_ = watchAppProto$WatchScreenType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenTypeValue(int i) {
        this.screenType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoreVersion(int i) {
        this.storeVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUa(String str) {
        str.getClass();
        this.ua_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUaBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ua_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUniqueId(String str) {
        str.getClass();
        this.uniqueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUniqueIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uniqueId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l8l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchAppProto$WatchDeviceInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0004\b\u0004\t\u0007\n\f", new Object[]{"channel_", "locale_", "colorOsVersion_", "firmwareId_", "uniqueId_", "ua_", "storeVersion_", "instantVersion_", "instantSwClose_", "screenType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$WatchDeviceInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$WatchDeviceInfo.class) {
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

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public String getChannel() {
        return this.channel_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public ByteString getChannelBytes() {
        return ByteString.copyFromUtf8(this.channel_);
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public String getColorOsVersion() {
        return this.colorOsVersion_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public ByteString getColorOsVersionBytes() {
        return ByteString.copyFromUtf8(this.colorOsVersion_);
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public String getFirmwareId() {
        return this.firmwareId_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public ByteString getFirmwareIdBytes() {
        return ByteString.copyFromUtf8(this.firmwareId_);
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public boolean getInstantSwClose() {
        return this.instantSwClose_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public int getInstantVersion() {
        return this.instantVersion_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public String getLocale() {
        return this.locale_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public ByteString getLocaleBytes() {
        return ByteString.copyFromUtf8(this.locale_);
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public WatchAppProto$WatchScreenType getScreenType() {
        WatchAppProto$WatchScreenType watchAppProto$WatchScreenTypeForNumber = WatchAppProto$WatchScreenType.forNumber(this.screenType_);
        return watchAppProto$WatchScreenTypeForNumber == null ? WatchAppProto$WatchScreenType.UNRECOGNIZED : watchAppProto$WatchScreenTypeForNumber;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public int getScreenTypeValue() {
        return this.screenType_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public int getStoreVersion() {
        return this.storeVersion_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public String getUa() {
        return this.ua_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public ByteString getUaBytes() {
        return ByteString.copyFromUtf8(this.ua_);
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public String getUniqueId() {
        return this.uniqueId_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$WatchDeviceInfoOrBuilder
    public ByteString getUniqueIdBytes() {
        return ByteString.copyFromUtf8(this.uniqueId_);
    }

    public static Builder newBuilder(WatchAppProto$WatchDeviceInfo watchAppProto$WatchDeviceInfo) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$WatchDeviceInfo);
    }

    public static WatchAppProto$WatchDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$WatchDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$WatchDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$WatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$WatchDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$WatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchAppProto$WatchDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$WatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$WatchDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$WatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$WatchDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$WatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$WatchDeviceInfo parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$WatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$WatchDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$WatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$WatchDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$WatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$WatchDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$WatchDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
