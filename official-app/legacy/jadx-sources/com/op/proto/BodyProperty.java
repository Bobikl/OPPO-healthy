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
public final class BodyProperty {

    /* JADX INFO: renamed from: com.op.proto.BodyProperty$1, reason: invalid class name */
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

    public static final class BodyPropertyInfo extends GeneratedMessageLite<BodyPropertyInfo, Builder> implements BodyPropertyInfoOrBuilder {
        public static final int AGE_FIELD_NUMBER = 3;
        private static final BodyPropertyInfo DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        public static final int MODIFIERTIME_FIELD_NUMBER = 6;
        private static volatile Parser<BodyPropertyInfo> PARSER = null;
        public static final int SEX_FIELD_NUMBER = 4;
        public static final int WEIGHTOFG_FIELD_NUMBER = 5;
        public static final int WEIGHT_FIELD_NUMBER = 1;
        private int age_;
        private int height_;
        private long modifierTime_;
        private int sex_;
        private int weightOfg_;
        private int weight_;

        public static final class Builder extends GeneratedMessageLite.Builder<BodyPropertyInfo, Builder> implements BodyPropertyInfoOrBuilder {
            public Builder clearAge() {
                copyOnWrite();
                ((BodyPropertyInfo) this.instance).clearAge();
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((BodyPropertyInfo) this.instance).clearHeight();
                return this;
            }

            public Builder clearModifierTime() {
                copyOnWrite();
                ((BodyPropertyInfo) this.instance).clearModifierTime();
                return this;
            }

            public Builder clearSex() {
                copyOnWrite();
                ((BodyPropertyInfo) this.instance).clearSex();
                return this;
            }

            public Builder clearWeight() {
                copyOnWrite();
                ((BodyPropertyInfo) this.instance).clearWeight();
                return this;
            }

            public Builder clearWeightOfg() {
                copyOnWrite();
                ((BodyPropertyInfo) this.instance).clearWeightOfg();
                return this;
            }

            @Override // com.op.proto.BodyProperty.BodyPropertyInfoOrBuilder
            public int getAge() {
                return ((BodyPropertyInfo) this.instance).getAge();
            }

            @Override // com.op.proto.BodyProperty.BodyPropertyInfoOrBuilder
            public int getHeight() {
                return ((BodyPropertyInfo) this.instance).getHeight();
            }

            @Override // com.op.proto.BodyProperty.BodyPropertyInfoOrBuilder
            public long getModifierTime() {
                return ((BodyPropertyInfo) this.instance).getModifierTime();
            }

            @Override // com.op.proto.BodyProperty.BodyPropertyInfoOrBuilder
            public int getSex() {
                return ((BodyPropertyInfo) this.instance).getSex();
            }

            @Override // com.op.proto.BodyProperty.BodyPropertyInfoOrBuilder
            public int getWeight() {
                return ((BodyPropertyInfo) this.instance).getWeight();
            }

            @Override // com.op.proto.BodyProperty.BodyPropertyInfoOrBuilder
            public int getWeightOfg() {
                return ((BodyPropertyInfo) this.instance).getWeightOfg();
            }

            public Builder setAge(int i) {
                copyOnWrite();
                ((BodyPropertyInfo) this.instance).setAge(i);
                return this;
            }

            public Builder setHeight(int i) {
                copyOnWrite();
                ((BodyPropertyInfo) this.instance).setHeight(i);
                return this;
            }

            public Builder setModifierTime(long j2) {
                copyOnWrite();
                ((BodyPropertyInfo) this.instance).setModifierTime(j2);
                return this;
            }

            public Builder setSex(int i) {
                copyOnWrite();
                ((BodyPropertyInfo) this.instance).setSex(i);
                return this;
            }

            public Builder setWeight(int i) {
                copyOnWrite();
                ((BodyPropertyInfo) this.instance).setWeight(i);
                return this;
            }

            public Builder setWeightOfg(int i) {
                copyOnWrite();
                ((BodyPropertyInfo) this.instance).setWeightOfg(i);
                return this;
            }

            private Builder() {
                super(BodyPropertyInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            BodyPropertyInfo bodyPropertyInfo = new BodyPropertyInfo();
            DEFAULT_INSTANCE = bodyPropertyInfo;
            GeneratedMessageLite.registerDefaultInstance(BodyPropertyInfo.class, bodyPropertyInfo);
        }

        private BodyPropertyInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAge() {
            this.age_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.height_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModifierTime() {
            this.modifierTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSex() {
            this.sex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeight() {
            this.weight_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeightOfg() {
            this.weightOfg_ = 0;
        }

        public static BodyPropertyInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BodyPropertyInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BodyPropertyInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BodyPropertyInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BodyPropertyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BodyPropertyInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAge(int i) {
            this.age_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i) {
            this.height_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModifierTime(long j2) {
            this.modifierTime_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSex(int i) {
            this.sex_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeight(int i) {
            this.weight_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeightOfg(int i) {
            this.weightOfg_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new BodyPropertyInfo();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u0003", new Object[]{"weight_", "height_", "age_", "sex_", "weightOfg_", "modifierTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BodyPropertyInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BodyPropertyInfo.class) {
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

        @Override // com.op.proto.BodyProperty.BodyPropertyInfoOrBuilder
        public int getAge() {
            return this.age_;
        }

        @Override // com.op.proto.BodyProperty.BodyPropertyInfoOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.op.proto.BodyProperty.BodyPropertyInfoOrBuilder
        public long getModifierTime() {
            return this.modifierTime_;
        }

        @Override // com.op.proto.BodyProperty.BodyPropertyInfoOrBuilder
        public int getSex() {
            return this.sex_;
        }

        @Override // com.op.proto.BodyProperty.BodyPropertyInfoOrBuilder
        public int getWeight() {
            return this.weight_;
        }

        @Override // com.op.proto.BodyProperty.BodyPropertyInfoOrBuilder
        public int getWeightOfg() {
            return this.weightOfg_;
        }

        public static Builder newBuilder(BodyPropertyInfo bodyPropertyInfo) {
            return DEFAULT_INSTANCE.createBuilder(bodyPropertyInfo);
        }

        public static BodyPropertyInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BodyPropertyInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BodyPropertyInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BodyPropertyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BodyPropertyInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BodyPropertyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BodyPropertyInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BodyPropertyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BodyPropertyInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BodyPropertyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BodyPropertyInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BodyPropertyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BodyPropertyInfo parseFrom(InputStream inputStream) throws IOException {
            return (BodyPropertyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BodyPropertyInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BodyPropertyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BodyPropertyInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BodyPropertyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BodyPropertyInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BodyPropertyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface BodyPropertyInfoOrBuilder extends MessageLiteOrBuilder {
        int getAge();

        int getHeight();

        long getModifierTime();

        int getSex();

        int getWeight();

        int getWeightOfg();
    }

    private BodyProperty() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
