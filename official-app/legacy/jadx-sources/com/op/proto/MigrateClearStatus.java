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
public final class MigrateClearStatus {

    /* JADX INFO: renamed from: com.op.proto.MigrateClearStatus$1, reason: invalid class name */
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

    public static final class MigrateClearMessage extends GeneratedMessageLite<MigrateClearMessage, Builder> implements MigrateClearMessageOrBuilder {
        private static final MigrateClearMessage DEFAULT_INSTANCE;
        public static final int ISCLEARDATADONE_FIELD_NUMBER = 1;
        private static volatile Parser<MigrateClearMessage> PARSER;
        private boolean isClearDataDone_;

        public static final class Builder extends GeneratedMessageLite.Builder<MigrateClearMessage, Builder> implements MigrateClearMessageOrBuilder {
            public Builder clearIsClearDataDone() {
                copyOnWrite();
                ((MigrateClearMessage) this.instance).clearIsClearDataDone();
                return this;
            }

            @Override // com.op.proto.MigrateClearStatus.MigrateClearMessageOrBuilder
            public boolean getIsClearDataDone() {
                return ((MigrateClearMessage) this.instance).getIsClearDataDone();
            }

            public Builder setIsClearDataDone(boolean z) {
                copyOnWrite();
                ((MigrateClearMessage) this.instance).setIsClearDataDone(z);
                return this;
            }

            private Builder() {
                super(MigrateClearMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            MigrateClearMessage migrateClearMessage = new MigrateClearMessage();
            DEFAULT_INSTANCE = migrateClearMessage;
            GeneratedMessageLite.registerDefaultInstance(MigrateClearMessage.class, migrateClearMessage);
        }

        private MigrateClearMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsClearDataDone() {
            this.isClearDataDone_ = false;
        }

        public static MigrateClearMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MigrateClearMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MigrateClearMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MigrateClearMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MigrateClearMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MigrateClearMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsClearDataDone(boolean z) {
            this.isClearDataDone_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new MigrateClearMessage();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isClearDataDone_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MigrateClearMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (MigrateClearMessage.class) {
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

        @Override // com.op.proto.MigrateClearStatus.MigrateClearMessageOrBuilder
        public boolean getIsClearDataDone() {
            return this.isClearDataDone_;
        }

        public static Builder newBuilder(MigrateClearMessage migrateClearMessage) {
            return DEFAULT_INSTANCE.createBuilder(migrateClearMessage);
        }

        public static MigrateClearMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MigrateClearMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MigrateClearMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MigrateClearMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MigrateClearMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MigrateClearMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MigrateClearMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MigrateClearMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MigrateClearMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MigrateClearMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MigrateClearMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MigrateClearMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MigrateClearMessage parseFrom(InputStream inputStream) throws IOException {
            return (MigrateClearMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MigrateClearMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MigrateClearMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MigrateClearMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MigrateClearMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MigrateClearMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MigrateClearMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MigrateClearMessageOrBuilder extends MessageLiteOrBuilder {
        boolean getIsClearDataDone();
    }

    private MigrateClearStatus() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
