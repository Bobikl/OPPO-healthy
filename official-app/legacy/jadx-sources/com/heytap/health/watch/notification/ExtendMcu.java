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
public final class ExtendMcu extends GeneratedMessageLite<ExtendMcu, Builder> implements ExtendMcuOrBuilder {
    public static final int APPDATA_FIELD_NUMBER = 2;
    private static final ExtendMcu DEFAULT_INSTANCE;
    public static final int HASRTOSUSERDATE_FIELD_NUMBER = 7;
    private static volatile Parser<ExtendMcu> PARSER = null;
    public static final int RTOSUSERDATE_FIELD_NUMBER = 8;
    public static final int WECHATCODEFORMAT_FIELD_NUMBER = 4;
    public static final int WECHATPICPATH_FIELD_NUMBER = 5;
    public static final int WECHATPICTURE_FIELD_NUMBER = 6;
    public static final int WECHATTYPE_FIELD_NUMBER = 3;
    public static final int WIN_NAME_FIELD_NUMBER = 1;
    private long appData_;
    private boolean hasRtosUserDate_;
    private int rtosUserDate_;
    private int wechatType_;
    private String winName_ = "";
    private String wechatCodeFormat_ = "";
    private String wechatPicPath_ = "";
    private ByteString wechatPicture_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<ExtendMcu, Builder> implements ExtendMcuOrBuilder {
        public Builder clearAppData() {
            copyOnWrite();
            ((ExtendMcu) this.instance).clearAppData();
            return this;
        }

        public Builder clearHasRtosUserDate() {
            copyOnWrite();
            ((ExtendMcu) this.instance).clearHasRtosUserDate();
            return this;
        }

        public Builder clearRtosUserDate() {
            copyOnWrite();
            ((ExtendMcu) this.instance).clearRtosUserDate();
            return this;
        }

        public Builder clearWechatCodeFormat() {
            copyOnWrite();
            ((ExtendMcu) this.instance).clearWechatCodeFormat();
            return this;
        }

        public Builder clearWechatPicPath() {
            copyOnWrite();
            ((ExtendMcu) this.instance).clearWechatPicPath();
            return this;
        }

        public Builder clearWechatPicture() {
            copyOnWrite();
            ((ExtendMcu) this.instance).clearWechatPicture();
            return this;
        }

        public Builder clearWechatType() {
            copyOnWrite();
            ((ExtendMcu) this.instance).clearWechatType();
            return this;
        }

        public Builder clearWinName() {
            copyOnWrite();
            ((ExtendMcu) this.instance).clearWinName();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
        public long getAppData() {
            return ((ExtendMcu) this.instance).getAppData();
        }

        @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
        public boolean getHasRtosUserDate() {
            return ((ExtendMcu) this.instance).getHasRtosUserDate();
        }

        @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
        public int getRtosUserDate() {
            return ((ExtendMcu) this.instance).getRtosUserDate();
        }

        @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
        public String getWechatCodeFormat() {
            return ((ExtendMcu) this.instance).getWechatCodeFormat();
        }

        @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
        public ByteString getWechatCodeFormatBytes() {
            return ((ExtendMcu) this.instance).getWechatCodeFormatBytes();
        }

        @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
        public String getWechatPicPath() {
            return ((ExtendMcu) this.instance).getWechatPicPath();
        }

        @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
        public ByteString getWechatPicPathBytes() {
            return ((ExtendMcu) this.instance).getWechatPicPathBytes();
        }

        @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
        public ByteString getWechatPicture() {
            return ((ExtendMcu) this.instance).getWechatPicture();
        }

        @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
        public int getWechatType() {
            return ((ExtendMcu) this.instance).getWechatType();
        }

        @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
        public String getWinName() {
            return ((ExtendMcu) this.instance).getWinName();
        }

        @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
        public ByteString getWinNameBytes() {
            return ((ExtendMcu) this.instance).getWinNameBytes();
        }

        public Builder setAppData(long j2) {
            copyOnWrite();
            ((ExtendMcu) this.instance).setAppData(j2);
            return this;
        }

        public Builder setHasRtosUserDate(boolean z) {
            copyOnWrite();
            ((ExtendMcu) this.instance).setHasRtosUserDate(z);
            return this;
        }

        public Builder setRtosUserDate(int i) {
            copyOnWrite();
            ((ExtendMcu) this.instance).setRtosUserDate(i);
            return this;
        }

        public Builder setWechatCodeFormat(String str) {
            copyOnWrite();
            ((ExtendMcu) this.instance).setWechatCodeFormat(str);
            return this;
        }

        public Builder setWechatCodeFormatBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtendMcu) this.instance).setWechatCodeFormatBytes(byteString);
            return this;
        }

        public Builder setWechatPicPath(String str) {
            copyOnWrite();
            ((ExtendMcu) this.instance).setWechatPicPath(str);
            return this;
        }

        public Builder setWechatPicPathBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtendMcu) this.instance).setWechatPicPathBytes(byteString);
            return this;
        }

        public Builder setWechatPicture(ByteString byteString) {
            copyOnWrite();
            ((ExtendMcu) this.instance).setWechatPicture(byteString);
            return this;
        }

        public Builder setWechatType(int i) {
            copyOnWrite();
            ((ExtendMcu) this.instance).setWechatType(i);
            return this;
        }

        public Builder setWinName(String str) {
            copyOnWrite();
            ((ExtendMcu) this.instance).setWinName(str);
            return this;
        }

        public Builder setWinNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtendMcu) this.instance).setWinNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(ExtendMcu.DEFAULT_INSTANCE);
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
        ExtendMcu extendMcu = new ExtendMcu();
        DEFAULT_INSTANCE = extendMcu;
        GeneratedMessageLite.registerDefaultInstance(ExtendMcu.class, extendMcu);
    }

    private ExtendMcu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppData() {
        this.appData_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasRtosUserDate() {
        this.hasRtosUserDate_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtosUserDate() {
        this.rtosUserDate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWechatCodeFormat() {
        this.wechatCodeFormat_ = getDefaultInstance().getWechatCodeFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWechatPicPath() {
        this.wechatPicPath_ = getDefaultInstance().getWechatPicPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWechatPicture() {
        this.wechatPicture_ = getDefaultInstance().getWechatPicture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWechatType() {
        this.wechatType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWinName() {
        this.winName_ = getDefaultInstance().getWinName();
    }

    public static ExtendMcu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtendMcu parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExtendMcu) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendMcu parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExtendMcu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExtendMcu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppData(long j2) {
        this.appData_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasRtosUserDate(boolean z) {
        this.hasRtosUserDate_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtosUserDate(int i) {
        this.rtosUserDate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWechatCodeFormat(String str) {
        str.getClass();
        this.wechatCodeFormat_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWechatCodeFormatBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wechatCodeFormat_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWechatPicPath(String str) {
        str.getClass();
        this.wechatPicPath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWechatPicPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wechatPicPath_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWechatPicture(ByteString byteString) {
        byteString.getClass();
        this.wechatPicture_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWechatType(int i) {
        this.wechatType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWinName(String str) {
        str.getClass();
        this.winName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWinNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.winName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ExtendMcu();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0003\u000b\u0004Ȉ\u0005Ȉ\u0006\n\u0007\u0007\b\u000b", new Object[]{"winName_", "appData_", "wechatType_", "wechatCodeFormat_", "wechatPicPath_", "wechatPicture_", "hasRtosUserDate_", "rtosUserDate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExtendMcu> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ExtendMcu.class) {
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

    @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
    public long getAppData() {
        return this.appData_;
    }

    @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
    public boolean getHasRtosUserDate() {
        return this.hasRtosUserDate_;
    }

    @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
    public int getRtosUserDate() {
        return this.rtosUserDate_;
    }

    @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
    public String getWechatCodeFormat() {
        return this.wechatCodeFormat_;
    }

    @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
    public ByteString getWechatCodeFormatBytes() {
        return ByteString.copyFromUtf8(this.wechatCodeFormat_);
    }

    @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
    public String getWechatPicPath() {
        return this.wechatPicPath_;
    }

    @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
    public ByteString getWechatPicPathBytes() {
        return ByteString.copyFromUtf8(this.wechatPicPath_);
    }

    @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
    public ByteString getWechatPicture() {
        return this.wechatPicture_;
    }

    @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
    public int getWechatType() {
        return this.wechatType_;
    }

    @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
    public String getWinName() {
        return this.winName_;
    }

    @Override // com.heytap.health.watch.notification.ExtendMcuOrBuilder
    public ByteString getWinNameBytes() {
        return ByteString.copyFromUtf8(this.winName_);
    }

    public static Builder newBuilder(ExtendMcu extendMcu) {
        return DEFAULT_INSTANCE.createBuilder(extendMcu);
    }

    public static ExtendMcu parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendMcu) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendMcu parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendMcu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExtendMcu parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExtendMcu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExtendMcu parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendMcu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExtendMcu parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExtendMcu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtendMcu parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendMcu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExtendMcu parseFrom(InputStream inputStream) throws IOException {
        return (ExtendMcu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendMcu parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendMcu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendMcu parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExtendMcu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExtendMcu parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendMcu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
