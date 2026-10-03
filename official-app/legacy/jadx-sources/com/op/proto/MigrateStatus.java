package com.op.proto;

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
public final class MigrateStatus {

    /* JADX INFO: renamed from: com.op.proto.MigrateStatus$1, reason: invalid class name */
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

    public static final class MigrateStatusMessage extends GeneratedMessageLite<MigrateStatusMessage, Builder> implements MigrateStatusMessageOrBuilder {
        private static final MigrateStatusMessage DEFAULT_INSTANCE;
        public static final int ISMIGRATING_FIELD_NUMBER = 1;
        private static volatile Parser<MigrateStatusMessage> PARSER;
        private boolean isMigrating_;

        public static final class Builder extends GeneratedMessageLite.Builder<MigrateStatusMessage, Builder> implements MigrateStatusMessageOrBuilder {
            public Builder clearIsMigrating() {
                copyOnWrite();
                ((MigrateStatusMessage) this.instance).clearIsMigrating();
                return this;
            }

            @Override // com.op.proto.MigrateStatus.MigrateStatusMessageOrBuilder
            public boolean getIsMigrating() {
                return ((MigrateStatusMessage) this.instance).getIsMigrating();
            }

            public Builder setIsMigrating(boolean z) {
                copyOnWrite();
                ((MigrateStatusMessage) this.instance).setIsMigrating(z);
                return this;
            }

            private Builder() {
                super(MigrateStatusMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            MigrateStatusMessage migrateStatusMessage = new MigrateStatusMessage();
            DEFAULT_INSTANCE = migrateStatusMessage;
            GeneratedMessageLite.registerDefaultInstance(MigrateStatusMessage.class, migrateStatusMessage);
        }

        private MigrateStatusMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsMigrating() {
            this.isMigrating_ = false;
        }

        public static MigrateStatusMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MigrateStatusMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MigrateStatusMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MigrateStatusMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MigrateStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MigrateStatusMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsMigrating(boolean z) {
            this.isMigrating_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new MigrateStatusMessage();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isMigrating_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MigrateStatusMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (MigrateStatusMessage.class) {
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

        @Override // com.op.proto.MigrateStatus.MigrateStatusMessageOrBuilder
        public boolean getIsMigrating() {
            return this.isMigrating_;
        }

        public static Builder newBuilder(MigrateStatusMessage migrateStatusMessage) {
            return DEFAULT_INSTANCE.createBuilder(migrateStatusMessage);
        }

        public static MigrateStatusMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MigrateStatusMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MigrateStatusMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MigrateStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MigrateStatusMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MigrateStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MigrateStatusMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MigrateStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MigrateStatusMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MigrateStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MigrateStatusMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MigrateStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MigrateStatusMessage parseFrom(InputStream inputStream) throws IOException {
            return (MigrateStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MigrateStatusMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MigrateStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MigrateStatusMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MigrateStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MigrateStatusMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MigrateStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MigrateStatusMessageOrBuilder extends MessageLiteOrBuilder {
        boolean getIsMigrating();
    }

    private MigrateStatus() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
