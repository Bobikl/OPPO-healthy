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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\official-device-assets\classes4.dex */
public final class BatteryInfoRequester {

    /* JADX INFO: renamed from: com.op.proto.BatteryInfoRequester$1, reason: invalid class name */
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

    public static final class BatteryInfoRequesterData extends GeneratedMessageLite<BatteryInfoRequesterData, Builder> implements BatteryInfoRequesterDataOrBuilder {
        private static final BatteryInfoRequesterData DEFAULT_INSTANCE;
        public static final int DEVICE_BT_MAC_FIELD_NUMBER = 1;
        private static volatile Parser<BatteryInfoRequesterData> PARSER;
        private String deviceBtMac_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<BatteryInfoRequesterData, Builder> implements BatteryInfoRequesterDataOrBuilder {
            public Builder clearDeviceBtMac() {
                copyOnWrite();
                ((BatteryInfoRequesterData) ((GeneratedMessageLite.Builder) this).instance).clearDeviceBtMac();
                return this;
            }

            @Override // com.op.proto.BatteryInfoRequester.BatteryInfoRequesterDataOrBuilder
            public String getDeviceBtMac() {
                return ((BatteryInfoRequesterData) ((GeneratedMessageLite.Builder) this).instance).getDeviceBtMac();
            }

            @Override // com.op.proto.BatteryInfoRequester.BatteryInfoRequesterDataOrBuilder
            public ByteString getDeviceBtMacBytes() {
                return ((BatteryInfoRequesterData) ((GeneratedMessageLite.Builder) this).instance).getDeviceBtMacBytes();
            }

            public Builder setDeviceBtMac(String str) {
                copyOnWrite();
                ((BatteryInfoRequesterData) ((GeneratedMessageLite.Builder) this).instance).setDeviceBtMac(str);
                return this;
            }

            public Builder setDeviceBtMacBytes(ByteString byteString) {
                copyOnWrite();
                ((BatteryInfoRequesterData) ((GeneratedMessageLite.Builder) this).instance).setDeviceBtMacBytes(byteString);
                return this;
            }

            private Builder() {
                super(BatteryInfoRequesterData.DEFAULT_INSTANCE);
            }
        }

        static {
            BatteryInfoRequesterData batteryInfoRequesterData = new BatteryInfoRequesterData();
            DEFAULT_INSTANCE = batteryInfoRequesterData;
            GeneratedMessageLite.registerDefaultInstance(BatteryInfoRequesterData.class, batteryInfoRequesterData);
        }

        private BatteryInfoRequesterData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceBtMac() {
            this.deviceBtMac_ = getDefaultInstance().getDeviceBtMac();
        }

        public static BatteryInfoRequesterData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BatteryInfoRequesterData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BatteryInfoRequesterData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BatteryInfoRequesterData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BatteryInfoRequesterData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BatteryInfoRequesterData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceBtMac(String str) {
            str.getClass();
            this.deviceBtMac_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceBtMacBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceBtMac_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new BatteryInfoRequesterData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"deviceBtMac_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BatteryInfoRequesterData.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

        @Override // com.op.proto.BatteryInfoRequester.BatteryInfoRequesterDataOrBuilder
        public String getDeviceBtMac() {
            return this.deviceBtMac_;
        }

        @Override // com.op.proto.BatteryInfoRequester.BatteryInfoRequesterDataOrBuilder
        public ByteString getDeviceBtMacBytes() {
            return ByteString.copyFromUtf8(this.deviceBtMac_);
        }

        public static Builder newBuilder(BatteryInfoRequesterData batteryInfoRequesterData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(batteryInfoRequesterData);
        }

        public static BatteryInfoRequesterData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BatteryInfoRequesterData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BatteryInfoRequesterData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BatteryInfoRequesterData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BatteryInfoRequesterData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BatteryInfoRequesterData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BatteryInfoRequesterData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BatteryInfoRequesterData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BatteryInfoRequesterData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BatteryInfoRequesterData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BatteryInfoRequesterData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BatteryInfoRequesterData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BatteryInfoRequesterData parseFrom(InputStream inputStream) throws IOException {
            return (BatteryInfoRequesterData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BatteryInfoRequesterData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BatteryInfoRequesterData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BatteryInfoRequesterData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BatteryInfoRequesterData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BatteryInfoRequesterData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BatteryInfoRequesterData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface BatteryInfoRequesterDataOrBuilder extends MessageLiteOrBuilder {
        String getDeviceBtMac();

        ByteString getDeviceBtMacBytes();
    }

    private BatteryInfoRequester() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
