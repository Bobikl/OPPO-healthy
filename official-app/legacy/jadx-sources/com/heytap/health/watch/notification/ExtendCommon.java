package com.heytap.health.watch.notification;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class ExtendCommon extends GeneratedMessageLite<ExtendCommon, Builder> implements ExtendCommonOrBuilder {
    private static final ExtendCommon DEFAULT_INSTANCE;
    public static final int DEVICEFLAG_FIELD_NUMBER = 6;
    public static final int DEVICEFROM_FIELD_NUMBER = 5;
    public static final int DEVICEMAC_FIELD_NUMBER = 7;
    public static final int HASREAD_FIELD_NUMBER = 1;
    public static final int HASREMOTEINPUT_FIELD_NUMBER = 4;
    public static final int MULTIPLELINK_FIELD_NUMBER = 8;
    private static volatile Parser<ExtendCommon> PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 2;
    public static final int STRFROM_FIELD_NUMBER = 3;
    private int deviceFlag_;
    private boolean hasRead_;
    private boolean hasRemoteInput_;
    private boolean multipleLink_;
    private int platform_;
    private String strFrom_ = "";
    private String deviceFrom_ = "";
    private String deviceMac_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<ExtendCommon, Builder> implements ExtendCommonOrBuilder {
        public Builder clearDeviceFlag() {
            copyOnWrite();
            ((ExtendCommon) this.instance).clearDeviceFlag();
            return this;
        }

        public Builder clearDeviceFrom() {
            copyOnWrite();
            ((ExtendCommon) this.instance).clearDeviceFrom();
            return this;
        }

        public Builder clearDeviceMac() {
            copyOnWrite();
            ((ExtendCommon) this.instance).clearDeviceMac();
            return this;
        }

        public Builder clearHasRead() {
            copyOnWrite();
            ((ExtendCommon) this.instance).clearHasRead();
            return this;
        }

        public Builder clearHasRemoteInput() {
            copyOnWrite();
            ((ExtendCommon) this.instance).clearHasRemoteInput();
            return this;
        }

        public Builder clearMultipleLink() {
            copyOnWrite();
            ((ExtendCommon) this.instance).clearMultipleLink();
            return this;
        }

        public Builder clearPlatform() {
            copyOnWrite();
            ((ExtendCommon) this.instance).clearPlatform();
            return this;
        }

        public Builder clearStrFrom() {
            copyOnWrite();
            ((ExtendCommon) this.instance).clearStrFrom();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
        public int getDeviceFlag() {
            return ((ExtendCommon) this.instance).getDeviceFlag();
        }

        @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
        public String getDeviceFrom() {
            return ((ExtendCommon) this.instance).getDeviceFrom();
        }

        @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
        public ByteString getDeviceFromBytes() {
            return ((ExtendCommon) this.instance).getDeviceFromBytes();
        }

        @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
        public String getDeviceMac() {
            return ((ExtendCommon) this.instance).getDeviceMac();
        }

        @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
        public ByteString getDeviceMacBytes() {
            return ((ExtendCommon) this.instance).getDeviceMacBytes();
        }

        @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
        public boolean getHasRead() {
            return ((ExtendCommon) this.instance).getHasRead();
        }

        @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
        public boolean getHasRemoteInput() {
            return ((ExtendCommon) this.instance).getHasRemoteInput();
        }

        @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
        public boolean getMultipleLink() {
            return ((ExtendCommon) this.instance).getMultipleLink();
        }

        @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
        public int getPlatform() {
            return ((ExtendCommon) this.instance).getPlatform();
        }

        @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
        public String getStrFrom() {
            return ((ExtendCommon) this.instance).getStrFrom();
        }

        @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
        public ByteString getStrFromBytes() {
            return ((ExtendCommon) this.instance).getStrFromBytes();
        }

        public Builder setDeviceFlag(int i) {
            copyOnWrite();
            ((ExtendCommon) this.instance).setDeviceFlag(i);
            return this;
        }

        public Builder setDeviceFrom(String str) {
            copyOnWrite();
            ((ExtendCommon) this.instance).setDeviceFrom(str);
            return this;
        }

        public Builder setDeviceFromBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtendCommon) this.instance).setDeviceFromBytes(byteString);
            return this;
        }

        public Builder setDeviceMac(String str) {
            copyOnWrite();
            ((ExtendCommon) this.instance).setDeviceMac(str);
            return this;
        }

        public Builder setDeviceMacBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtendCommon) this.instance).setDeviceMacBytes(byteString);
            return this;
        }

        public Builder setHasRead(boolean z) {
            copyOnWrite();
            ((ExtendCommon) this.instance).setHasRead(z);
            return this;
        }

        public Builder setHasRemoteInput(boolean z) {
            copyOnWrite();
            ((ExtendCommon) this.instance).setHasRemoteInput(z);
            return this;
        }

        public Builder setMultipleLink(boolean z) {
            copyOnWrite();
            ((ExtendCommon) this.instance).setMultipleLink(z);
            return this;
        }

        public Builder setPlatform(int i) {
            copyOnWrite();
            ((ExtendCommon) this.instance).setPlatform(i);
            return this;
        }

        public Builder setStrFrom(String str) {
            copyOnWrite();
            ((ExtendCommon) this.instance).setStrFrom(str);
            return this;
        }

        public Builder setStrFromBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtendCommon) this.instance).setStrFromBytes(byteString);
            return this;
        }

        private Builder() {
            super(ExtendCommon.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ExtendCommon extendCommon = new ExtendCommon();
        DEFAULT_INSTANCE = extendCommon;
        GeneratedMessageLite.registerDefaultInstance(ExtendCommon.class, extendCommon);
    }

    private ExtendCommon() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceFlag() {
        this.deviceFlag_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceFrom() {
        this.deviceFrom_ = getDefaultInstance().getDeviceFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceMac() {
        this.deviceMac_ = getDefaultInstance().getDeviceMac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasRead() {
        this.hasRead_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasRemoteInput() {
        this.hasRemoteInput_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMultipleLink() {
        this.multipleLink_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatform() {
        this.platform_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrFrom() {
        this.strFrom_ = getDefaultInstance().getStrFrom();
    }

    public static ExtendCommon getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtendCommon parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExtendCommon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendCommon parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExtendCommon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExtendCommon> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceFlag(int i) {
        this.deviceFlag_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceFrom(String str) {
        str.getClass();
        this.deviceFrom_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceFrom_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceMac(String str) {
        str.getClass();
        this.deviceMac_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceMacBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceMac_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasRead(boolean z) {
        this.hasRead_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasRemoteInput(boolean z) {
        this.hasRemoteInput_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMultipleLink(boolean z) {
        this.multipleLink_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatform(int i) {
        this.platform_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrFrom(String str) {
        str.getClass();
        this.strFrom_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.strFrom_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ExtendCommon();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0007\u0002\u000b\u0003Ȉ\u0004\u0007\u0005Ȉ\u0006\u0004\u0007Ȉ\b\u0007", new Object[]{"hasRead_", "platform_", "strFrom_", "hasRemoteInput_", "deviceFrom_", "deviceFlag_", "deviceMac_", "multipleLink_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExtendCommon> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ExtendCommon.class) {
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

    @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
    public int getDeviceFlag() {
        return this.deviceFlag_;
    }

    @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
    public String getDeviceFrom() {
        return this.deviceFrom_;
    }

    @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
    public ByteString getDeviceFromBytes() {
        return ByteString.copyFromUtf8(this.deviceFrom_);
    }

    @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
    public String getDeviceMac() {
        return this.deviceMac_;
    }

    @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
    public ByteString getDeviceMacBytes() {
        return ByteString.copyFromUtf8(this.deviceMac_);
    }

    @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
    public boolean getHasRead() {
        return this.hasRead_;
    }

    @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
    public boolean getHasRemoteInput() {
        return this.hasRemoteInput_;
    }

    @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
    public boolean getMultipleLink() {
        return this.multipleLink_;
    }

    @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
    public int getPlatform() {
        return this.platform_;
    }

    @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
    public String getStrFrom() {
        return this.strFrom_;
    }

    @Override // com.heytap.health.watch.notification.ExtendCommonOrBuilder
    public ByteString getStrFromBytes() {
        return ByteString.copyFromUtf8(this.strFrom_);
    }

    public static Builder newBuilder(ExtendCommon extendCommon) {
        return DEFAULT_INSTANCE.createBuilder(extendCommon);
    }

    public static ExtendCommon parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendCommon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendCommon parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendCommon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExtendCommon parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExtendCommon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExtendCommon parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendCommon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExtendCommon parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExtendCommon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtendCommon parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendCommon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExtendCommon parseFrom(InputStream inputStream) throws IOException {
        return (ExtendCommon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendCommon parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendCommon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendCommon parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExtendCommon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExtendCommon parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendCommon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
