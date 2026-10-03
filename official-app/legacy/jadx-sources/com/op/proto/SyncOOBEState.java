package com.op.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class SyncOOBEState {

    /* JADX INFO: renamed from: com.op.proto.SyncOOBEState$1, reason: invalid class name */
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

    public enum OOBE_FROM implements Internal.EnumLite {
        FROM_NORMAL(0),
        FROM_MIRGATE(1),
        FROM_SECOND(2),
        UNRECOGNIZED(-1);

        public static final int FROM_MIRGATE_VALUE = 1;
        public static final int FROM_NORMAL_VALUE = 0;
        public static final int FROM_SECOND_VALUE = 2;
        private static final Internal.EnumLiteMap<OOBE_FROM> internalValueMap = new Internal.EnumLiteMap<OOBE_FROM>() { // from class: com.op.proto.SyncOOBEState.OOBE_FROM.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public OOBE_FROM findValueByNumber(int i) {
                return OOBE_FROM.forNumber(i);
            }
        };
        private final int value;

        public static final class OOBE_FROMVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new OOBE_FROMVerifier();

            private OOBE_FROMVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return OOBE_FROM.forNumber(i) != null;
            }
        }

        OOBE_FROM(int i) {
            this.value = i;
        }

        public static OOBE_FROM forNumber(int i) {
            if (i == 0) {
                return FROM_NORMAL;
            }
            if (i == 1) {
                return FROM_MIRGATE;
            }
            if (i != 2) {
                return null;
            }
            return FROM_SECOND;
        }

        public static Internal.EnumLiteMap<OOBE_FROM> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return OOBE_FROMVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static OOBE_FROM valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class SyncState extends GeneratedMessageLite<SyncState, Builder> implements SyncStateOrBuilder {
        private static final SyncState DEFAULT_INSTANCE;
        public static final int DEVICETYPE_FIELD_NUMBER = 2;
        public static final int OOBEFROM_FIELD_NUMBER = 3;
        private static volatile Parser<SyncState> PARSER = null;
        public static final int RESULT_FIELD_NUMBER = 1;
        private int deviceType_;
        private int oobeFrom_;
        private int result_;

        public static final class Builder extends GeneratedMessageLite.Builder<SyncState, Builder> implements SyncStateOrBuilder {
            public Builder clearDeviceType() {
                copyOnWrite();
                ((SyncState) this.instance).clearDeviceType();
                return this;
            }

            public Builder clearOobeFrom() {
                copyOnWrite();
                ((SyncState) this.instance).clearOobeFrom();
                return this;
            }

            public Builder clearResult() {
                copyOnWrite();
                ((SyncState) this.instance).clearResult();
                return this;
            }

            @Override // com.op.proto.SyncOOBEState.SyncStateOrBuilder
            public int getDeviceType() {
                return ((SyncState) this.instance).getDeviceType();
            }

            @Override // com.op.proto.SyncOOBEState.SyncStateOrBuilder
            public int getOobeFrom() {
                return ((SyncState) this.instance).getOobeFrom();
            }

            @Override // com.op.proto.SyncOOBEState.SyncStateOrBuilder
            public int getResult() {
                return ((SyncState) this.instance).getResult();
            }

            public Builder setDeviceType(int i) {
                copyOnWrite();
                ((SyncState) this.instance).setDeviceType(i);
                return this;
            }

            public Builder setOobeFrom(int i) {
                copyOnWrite();
                ((SyncState) this.instance).setOobeFrom(i);
                return this;
            }

            public Builder setResult(int i) {
                copyOnWrite();
                ((SyncState) this.instance).setResult(i);
                return this;
            }

            private Builder() {
                super(SyncState.DEFAULT_INSTANCE);
            }
        }

        static {
            SyncState syncState = new SyncState();
            DEFAULT_INSTANCE = syncState;
            GeneratedMessageLite.registerDefaultInstance(SyncState.class, syncState);
        }

        private SyncState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceType() {
            this.deviceType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOobeFrom() {
            this.oobeFrom_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResult() {
            this.result_ = 0;
        }

        public static SyncState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SyncState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SyncState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SyncState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SyncState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SyncState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceType(int i) {
            this.deviceType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOobeFrom(int i) {
            this.oobeFrom_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResult(int i) {
            this.result_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new SyncState();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"result_", "deviceType_", "oobeFrom_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SyncState> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SyncState.class) {
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

        @Override // com.op.proto.SyncOOBEState.SyncStateOrBuilder
        public int getDeviceType() {
            return this.deviceType_;
        }

        @Override // com.op.proto.SyncOOBEState.SyncStateOrBuilder
        public int getOobeFrom() {
            return this.oobeFrom_;
        }

        @Override // com.op.proto.SyncOOBEState.SyncStateOrBuilder
        public int getResult() {
            return this.result_;
        }

        public static Builder newBuilder(SyncState syncState) {
            return DEFAULT_INSTANCE.createBuilder(syncState);
        }

        public static SyncState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SyncState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SyncState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SyncState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SyncState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SyncState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SyncState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SyncState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SyncState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SyncState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SyncState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SyncState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SyncState parseFrom(InputStream inputStream) throws IOException {
            return (SyncState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SyncState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SyncState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SyncState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SyncState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SyncState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SyncState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SyncStateOrBuilder extends MessageLiteOrBuilder {
        int getDeviceType();

        int getOobeFrom();

        int getResult();
    }

    private SyncOOBEState() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
