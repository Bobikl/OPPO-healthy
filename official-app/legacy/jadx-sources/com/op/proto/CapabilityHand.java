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
public final class CapabilityHand {

    /* JADX INFO: renamed from: com.op.proto.CapabilityHand$1, reason: invalid class name */
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

    public static final class Capability extends GeneratedMessageLite<Capability, Builder> implements CapabilityOrBuilder {
        private static final Capability DEFAULT_INSTANCE;
        public static final int HAND_RESULT_FIELD_NUMBER = 2;
        public static final int HAND_SIGNAL_FIELD_NUMBER = 1;
        private static volatile Parser<Capability> PARSER;
        private boolean handResult_;
        private int handSignal_;

        public static final class Builder extends GeneratedMessageLite.Builder<Capability, Builder> implements CapabilityOrBuilder {
            public Builder clearHandResult() {
                copyOnWrite();
                ((Capability) this.instance).clearHandResult();
                return this;
            }

            public Builder clearHandSignal() {
                copyOnWrite();
                ((Capability) this.instance).clearHandSignal();
                return this;
            }

            @Override // com.op.proto.CapabilityHand.CapabilityOrBuilder
            public boolean getHandResult() {
                return ((Capability) this.instance).getHandResult();
            }

            @Override // com.op.proto.CapabilityHand.CapabilityOrBuilder
            public int getHandSignal() {
                return ((Capability) this.instance).getHandSignal();
            }

            public Builder setHandResult(boolean z) {
                copyOnWrite();
                ((Capability) this.instance).setHandResult(z);
                return this;
            }

            public Builder setHandSignal(int i) {
                copyOnWrite();
                ((Capability) this.instance).setHandSignal(i);
                return this;
            }

            private Builder() {
                super(Capability.DEFAULT_INSTANCE);
            }
        }

        static {
            Capability capability = new Capability();
            DEFAULT_INSTANCE = capability;
            GeneratedMessageLite.registerDefaultInstance(Capability.class, capability);
        }

        private Capability() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHandResult() {
            this.handResult_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHandSignal() {
            this.handSignal_ = 0;
        }

        public static Capability getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Capability parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Capability) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Capability parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Capability> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHandResult(boolean z) {
            this.handResult_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHandSignal(int i) {
            this.handSignal_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new Capability();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"handSignal_", "handResult_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Capability> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Capability.class) {
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

        @Override // com.op.proto.CapabilityHand.CapabilityOrBuilder
        public boolean getHandResult() {
            return this.handResult_;
        }

        @Override // com.op.proto.CapabilityHand.CapabilityOrBuilder
        public int getHandSignal() {
            return this.handSignal_;
        }

        public static Builder newBuilder(Capability capability) {
            return DEFAULT_INSTANCE.createBuilder(capability);
        }

        public static Capability parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Capability) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Capability parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Capability parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Capability parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Capability parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Capability parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Capability parseFrom(InputStream inputStream) throws IOException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Capability parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Capability parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Capability parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Capability) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface CapabilityOrBuilder extends MessageLiteOrBuilder {
        boolean getHandResult();

        int getHandSignal();
    }

    private CapabilityHand() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
