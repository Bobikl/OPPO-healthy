package com.op.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class AboutWatchProto {

    /* JADX INFO: renamed from: com.op.proto.AboutWatchProto$1, reason: invalid class name */
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

    public static final class AboutWatchInfo extends GeneratedMessageLite<AboutWatchInfo, Builder> implements AboutWatchInfoOrBuilder {
        public static final int ANDROIDVERSION_FIELD_NUMBER = 6;
        public static final int BASEBANDVERSION_FIELD_NUMBER = 7;
        public static final int BTADDRESS_FIELD_NUMBER = 13;
        private static final AboutWatchInfo DEFAULT_INSTANCE;
        public static final int IMEI_FIELD_NUMBER = 10;
        public static final int INTERNALVERSION_FIELD_NUMBER = 5;
        public static final int MACADDRESS_FIELD_NUMBER = 12;
        public static final int MODEL_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPERATOR_FIELD_NUMBER = 9;
        public static final int OSVERSION_FIELD_NUMBER = 3;
        private static volatile Parser<AboutWatchInfo> PARSER = null;
        public static final int SERIAL_FIELD_NUMBER = 11;
        public static final int STORAGESIZE_FIELD_NUMBER = 8;
        public static final int SYSTEMVERSION_FIELD_NUMBER = 4;
        private String name_ = "";
        private String model_ = "";
        private String osVersion_ = "";
        private String systemVersion_ = "";
        private String internalVersion_ = "";
        private String androidVersion_ = "";
        private String baseBandVersion_ = "";
        private String storageSize_ = "";
        private String operator_ = "";
        private String imei_ = "";
        private String serial_ = "";
        private String macAddress_ = "";
        private String btAddress_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<AboutWatchInfo, Builder> implements AboutWatchInfoOrBuilder {
            public Builder clearAndroidVersion() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearAndroidVersion();
                return this;
            }

            public Builder clearBaseBandVersion() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearBaseBandVersion();
                return this;
            }

            public Builder clearBtAddress() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearBtAddress();
                return this;
            }

            public Builder clearImei() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearImei();
                return this;
            }

            public Builder clearInternalVersion() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearInternalVersion();
                return this;
            }

            public Builder clearMacAddress() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearMacAddress();
                return this;
            }

            public Builder clearModel() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearModel();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearName();
                return this;
            }

            public Builder clearOperator() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearOperator();
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearOsVersion();
                return this;
            }

            public Builder clearSerial() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearSerial();
                return this;
            }

            public Builder clearStorageSize() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearStorageSize();
                return this;
            }

            public Builder clearSystemVersion() {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).clearSystemVersion();
                return this;
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getAndroidVersion() {
                return ((AboutWatchInfo) this.instance).getAndroidVersion();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getAndroidVersionBytes() {
                return ((AboutWatchInfo) this.instance).getAndroidVersionBytes();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getBaseBandVersion() {
                return ((AboutWatchInfo) this.instance).getBaseBandVersion();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getBaseBandVersionBytes() {
                return ((AboutWatchInfo) this.instance).getBaseBandVersionBytes();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getBtAddress() {
                return ((AboutWatchInfo) this.instance).getBtAddress();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getBtAddressBytes() {
                return ((AboutWatchInfo) this.instance).getBtAddressBytes();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getImei() {
                return ((AboutWatchInfo) this.instance).getImei();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getImeiBytes() {
                return ((AboutWatchInfo) this.instance).getImeiBytes();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getInternalVersion() {
                return ((AboutWatchInfo) this.instance).getInternalVersion();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getInternalVersionBytes() {
                return ((AboutWatchInfo) this.instance).getInternalVersionBytes();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getMacAddress() {
                return ((AboutWatchInfo) this.instance).getMacAddress();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getMacAddressBytes() {
                return ((AboutWatchInfo) this.instance).getMacAddressBytes();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getModel() {
                return ((AboutWatchInfo) this.instance).getModel();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getModelBytes() {
                return ((AboutWatchInfo) this.instance).getModelBytes();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getName() {
                return ((AboutWatchInfo) this.instance).getName();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getNameBytes() {
                return ((AboutWatchInfo) this.instance).getNameBytes();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getOperator() {
                return ((AboutWatchInfo) this.instance).getOperator();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getOperatorBytes() {
                return ((AboutWatchInfo) this.instance).getOperatorBytes();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getOsVersion() {
                return ((AboutWatchInfo) this.instance).getOsVersion();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getOsVersionBytes() {
                return ((AboutWatchInfo) this.instance).getOsVersionBytes();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getSerial() {
                return ((AboutWatchInfo) this.instance).getSerial();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getSerialBytes() {
                return ((AboutWatchInfo) this.instance).getSerialBytes();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getStorageSize() {
                return ((AboutWatchInfo) this.instance).getStorageSize();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getStorageSizeBytes() {
                return ((AboutWatchInfo) this.instance).getStorageSizeBytes();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public String getSystemVersion() {
                return ((AboutWatchInfo) this.instance).getSystemVersion();
            }

            @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
            public ByteString getSystemVersionBytes() {
                return ((AboutWatchInfo) this.instance).getSystemVersionBytes();
            }

            public Builder setAndroidVersion(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setAndroidVersion(str);
                return this;
            }

            public Builder setAndroidVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setAndroidVersionBytes(byteString);
                return this;
            }

            public Builder setBaseBandVersion(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setBaseBandVersion(str);
                return this;
            }

            public Builder setBaseBandVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setBaseBandVersionBytes(byteString);
                return this;
            }

            public Builder setBtAddress(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setBtAddress(str);
                return this;
            }

            public Builder setBtAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setBtAddressBytes(byteString);
                return this;
            }

            public Builder setImei(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setImei(str);
                return this;
            }

            public Builder setImeiBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setImeiBytes(byteString);
                return this;
            }

            public Builder setInternalVersion(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setInternalVersion(str);
                return this;
            }

            public Builder setInternalVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setInternalVersionBytes(byteString);
                return this;
            }

            public Builder setMacAddress(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setMacAddress(str);
                return this;
            }

            public Builder setMacAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setMacAddressBytes(byteString);
                return this;
            }

            public Builder setModel(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setModel(str);
                return this;
            }

            public Builder setModelBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setModelBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setOperator(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setOperator(str);
                return this;
            }

            public Builder setOperatorBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setOperatorBytes(byteString);
                return this;
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setOsVersion(str);
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setOsVersionBytes(byteString);
                return this;
            }

            public Builder setSerial(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setSerial(str);
                return this;
            }

            public Builder setSerialBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setSerialBytes(byteString);
                return this;
            }

            public Builder setStorageSize(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setStorageSize(str);
                return this;
            }

            public Builder setStorageSizeBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setStorageSizeBytes(byteString);
                return this;
            }

            public Builder setSystemVersion(String str) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setSystemVersion(str);
                return this;
            }

            public Builder setSystemVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((AboutWatchInfo) this.instance).setSystemVersionBytes(byteString);
                return this;
            }

            private Builder() {
                super(AboutWatchInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            AboutWatchInfo aboutWatchInfo = new AboutWatchInfo();
            DEFAULT_INSTANCE = aboutWatchInfo;
            GeneratedMessageLite.registerDefaultInstance(AboutWatchInfo.class, aboutWatchInfo);
        }

        private AboutWatchInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAndroidVersion() {
            this.androidVersion_ = getDefaultInstance().getAndroidVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBaseBandVersion() {
            this.baseBandVersion_ = getDefaultInstance().getBaseBandVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBtAddress() {
            this.btAddress_ = getDefaultInstance().getBtAddress();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImei() {
            this.imei_ = getDefaultInstance().getImei();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInternalVersion() {
            this.internalVersion_ = getDefaultInstance().getInternalVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMacAddress() {
            this.macAddress_ = getDefaultInstance().getMacAddress();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperator() {
            this.operator_ = getDefaultInstance().getOperator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVersion() {
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSerial() {
            this.serial_ = getDefaultInstance().getSerial();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStorageSize() {
            this.storageSize_ = getDefaultInstance().getStorageSize();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSystemVersion() {
            this.systemVersion_ = getDefaultInstance().getSystemVersion();
        }

        public static AboutWatchInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AboutWatchInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AboutWatchInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AboutWatchInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AboutWatchInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AboutWatchInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAndroidVersion(String str) {
            str.getClass();
            this.androidVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAndroidVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.androidVersion_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseBandVersion(String str) {
            str.getClass();
            this.baseBandVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseBandVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.baseBandVersion_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBtAddress(String str) {
            str.getClass();
            this.btAddress_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBtAddressBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.btAddress_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImei(String str) {
            str.getClass();
            this.imei_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImeiBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.imei_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInternalVersion(String str) {
            str.getClass();
            this.internalVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInternalVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.internalVersion_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMacAddress(String str) {
            str.getClass();
            this.macAddress_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMacAddressBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.macAddress_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.model_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperator(String str) {
            str.getClass();
            this.operator_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperatorBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.operator_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(String str) {
            str.getClass();
            this.osVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSerial(String str) {
            str.getClass();
            this.serial_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSerialBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.serial_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStorageSize(String str) {
            str.getClass();
            this.storageSize_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStorageSizeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.storageSize_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemVersion(String str) {
            str.getClass();
            this.systemVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.systemVersion_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AboutWatchInfo();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ", new Object[]{"name_", "model_", "osVersion_", "systemVersion_", "internalVersion_", "androidVersion_", "baseBandVersion_", "storageSize_", "operator_", "imei_", "serial_", "macAddress_", "btAddress_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AboutWatchInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AboutWatchInfo.class) {
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

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getAndroidVersion() {
            return this.androidVersion_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getAndroidVersionBytes() {
            return ByteString.copyFromUtf8(this.androidVersion_);
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getBaseBandVersion() {
            return this.baseBandVersion_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getBaseBandVersionBytes() {
            return ByteString.copyFromUtf8(this.baseBandVersion_);
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getBtAddress() {
            return this.btAddress_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getBtAddressBytes() {
            return ByteString.copyFromUtf8(this.btAddress_);
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getImei() {
            return this.imei_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getImeiBytes() {
            return ByteString.copyFromUtf8(this.imei_);
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getInternalVersion() {
            return this.internalVersion_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getInternalVersionBytes() {
            return ByteString.copyFromUtf8(this.internalVersion_);
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getMacAddress() {
            return this.macAddress_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getMacAddressBytes() {
            return ByteString.copyFromUtf8(this.macAddress_);
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getModel() {
            return this.model_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getModelBytes() {
            return ByteString.copyFromUtf8(this.model_);
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getOperator() {
            return this.operator_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getOperatorBytes() {
            return ByteString.copyFromUtf8(this.operator_);
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getSerial() {
            return this.serial_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getSerialBytes() {
            return ByteString.copyFromUtf8(this.serial_);
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getStorageSize() {
            return this.storageSize_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getStorageSizeBytes() {
            return ByteString.copyFromUtf8(this.storageSize_);
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public String getSystemVersion() {
            return this.systemVersion_;
        }

        @Override // com.op.proto.AboutWatchProto.AboutWatchInfoOrBuilder
        public ByteString getSystemVersionBytes() {
            return ByteString.copyFromUtf8(this.systemVersion_);
        }

        public static Builder newBuilder(AboutWatchInfo aboutWatchInfo) {
            return DEFAULT_INSTANCE.createBuilder(aboutWatchInfo);
        }

        public static AboutWatchInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AboutWatchInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AboutWatchInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AboutWatchInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AboutWatchInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AboutWatchInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AboutWatchInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AboutWatchInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AboutWatchInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AboutWatchInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AboutWatchInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AboutWatchInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AboutWatchInfo parseFrom(InputStream inputStream) throws IOException {
            return (AboutWatchInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AboutWatchInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AboutWatchInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AboutWatchInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AboutWatchInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AboutWatchInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AboutWatchInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AboutWatchInfoOrBuilder extends MessageLiteOrBuilder {
        String getAndroidVersion();

        ByteString getAndroidVersionBytes();

        String getBaseBandVersion();

        ByteString getBaseBandVersionBytes();

        String getBtAddress();

        ByteString getBtAddressBytes();

        String getImei();

        ByteString getImeiBytes();

        String getInternalVersion();

        ByteString getInternalVersionBytes();

        String getMacAddress();

        ByteString getMacAddressBytes();

        String getModel();

        ByteString getModelBytes();

        String getName();

        ByteString getNameBytes();

        String getOperator();

        ByteString getOperatorBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        String getSerial();

        ByteString getSerialBytes();

        String getStorageSize();

        ByteString getStorageSizeBytes();

        String getSystemVersion();

        ByteString getSystemVersionBytes();
    }

    private AboutWatchProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
