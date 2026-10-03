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
public final class StepGoal {

    /* JADX INFO: renamed from: com.op.proto.StepGoal$1, reason: invalid class name */
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

    public static final class StepGoalData extends GeneratedMessageLite<StepGoalData, Builder> implements StepGoalDataOrBuilder {
        private static final StepGoalData DEFAULT_INSTANCE;
        public static final int GOAL_STEP_FIELD_NUMBER = 1;
        private static volatile Parser<StepGoalData> PARSER;
        private int goalStep_;

        public static final class Builder extends GeneratedMessageLite.Builder<StepGoalData, Builder> implements StepGoalDataOrBuilder {
            public Builder clearGoalStep() {
                copyOnWrite();
                ((StepGoalData) this.instance).clearGoalStep();
                return this;
            }

            @Override // com.op.proto.StepGoal.StepGoalDataOrBuilder
            public int getGoalStep() {
                return ((StepGoalData) this.instance).getGoalStep();
            }

            public Builder setGoalStep(int i) {
                copyOnWrite();
                ((StepGoalData) this.instance).setGoalStep(i);
                return this;
            }

            private Builder() {
                super(StepGoalData.DEFAULT_INSTANCE);
            }
        }

        static {
            StepGoalData stepGoalData = new StepGoalData();
            DEFAULT_INSTANCE = stepGoalData;
            GeneratedMessageLite.registerDefaultInstance(StepGoalData.class, stepGoalData);
        }

        private StepGoalData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoalStep() {
            this.goalStep_ = 0;
        }

        public static StepGoalData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StepGoalData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StepGoalData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StepGoalData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StepGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StepGoalData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoalStep(int i) {
            this.goalStep_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new StepGoalData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"goalStep_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StepGoalData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (StepGoalData.class) {
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

        @Override // com.op.proto.StepGoal.StepGoalDataOrBuilder
        public int getGoalStep() {
            return this.goalStep_;
        }

        public static Builder newBuilder(StepGoalData stepGoalData) {
            return DEFAULT_INSTANCE.createBuilder(stepGoalData);
        }

        public static StepGoalData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StepGoalData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StepGoalData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StepGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StepGoalData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StepGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StepGoalData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StepGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StepGoalData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StepGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StepGoalData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StepGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StepGoalData parseFrom(InputStream inputStream) throws IOException {
            return (StepGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StepGoalData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StepGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StepGoalData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StepGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StepGoalData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StepGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface StepGoalDataOrBuilder extends MessageLiteOrBuilder {
        int getGoalStep();
    }

    private StepGoal() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
