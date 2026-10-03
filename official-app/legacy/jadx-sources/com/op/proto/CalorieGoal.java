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
public final class CalorieGoal {

    /* JADX INFO: renamed from: com.op.proto.CalorieGoal$1, reason: invalid class name */
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

    public static final class Band1_Goal extends GeneratedMessageLite<Band1_Goal, Builder> implements Band1_GoalOrBuilder {
        private static final Band1_Goal DEFAULT_INSTANCE;
        public static final int GOAL_CALORIE_FIELD_NUMBER = 1;
        private static volatile Parser<Band1_Goal> PARSER;
        private int goalCalorie_;

        public static final class Builder extends GeneratedMessageLite.Builder<Band1_Goal, Builder> implements Band1_GoalOrBuilder {
            public Builder clearGoalCalorie() {
                copyOnWrite();
                ((Band1_Goal) this.instance).clearGoalCalorie();
                return this;
            }

            @Override // com.op.proto.CalorieGoal.Band1_GoalOrBuilder
            public int getGoalCalorie() {
                return ((Band1_Goal) this.instance).getGoalCalorie();
            }

            public Builder setGoalCalorie(int i) {
                copyOnWrite();
                ((Band1_Goal) this.instance).setGoalCalorie(i);
                return this;
            }

            private Builder() {
                super(Band1_Goal.DEFAULT_INSTANCE);
            }
        }

        static {
            Band1_Goal band1_Goal = new Band1_Goal();
            DEFAULT_INSTANCE = band1_Goal;
            GeneratedMessageLite.registerDefaultInstance(Band1_Goal.class, band1_Goal);
        }

        private Band1_Goal() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoalCalorie() {
            this.goalCalorie_ = 0;
        }

        public static Band1_Goal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Band1_Goal parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Band1_Goal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Band1_Goal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Band1_Goal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Band1_Goal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoalCalorie(int i) {
            this.goalCalorie_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new Band1_Goal();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"goalCalorie_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Band1_Goal> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Band1_Goal.class) {
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

        @Override // com.op.proto.CalorieGoal.Band1_GoalOrBuilder
        public int getGoalCalorie() {
            return this.goalCalorie_;
        }

        public static Builder newBuilder(Band1_Goal band1_Goal) {
            return DEFAULT_INSTANCE.createBuilder(band1_Goal);
        }

        public static Band1_Goal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Band1_Goal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Band1_Goal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Band1_Goal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Band1_Goal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Band1_Goal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Band1_Goal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Band1_Goal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Band1_Goal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Band1_Goal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Band1_Goal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Band1_Goal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Band1_Goal parseFrom(InputStream inputStream) throws IOException {
            return (Band1_Goal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Band1_Goal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Band1_Goal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Band1_Goal parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Band1_Goal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Band1_Goal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Band1_Goal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface Band1_GoalOrBuilder extends MessageLiteOrBuilder {
        int getGoalCalorie();
    }

    public static final class CalorieGoalData extends GeneratedMessageLite<CalorieGoalData, Builder> implements CalorieGoalDataOrBuilder {
        private static final CalorieGoalData DEFAULT_INSTANCE;
        public static final int GOAL_CALORIE_FIELD_NUMBER = 1;
        private static volatile Parser<CalorieGoalData> PARSER;
        private int goalCalorie_;

        public static final class Builder extends GeneratedMessageLite.Builder<CalorieGoalData, Builder> implements CalorieGoalDataOrBuilder {
            public Builder clearGoalCalorie() {
                copyOnWrite();
                ((CalorieGoalData) this.instance).clearGoalCalorie();
                return this;
            }

            @Override // com.op.proto.CalorieGoal.CalorieGoalDataOrBuilder
            public int getGoalCalorie() {
                return ((CalorieGoalData) this.instance).getGoalCalorie();
            }

            public Builder setGoalCalorie(int i) {
                copyOnWrite();
                ((CalorieGoalData) this.instance).setGoalCalorie(i);
                return this;
            }

            private Builder() {
                super(CalorieGoalData.DEFAULT_INSTANCE);
            }
        }

        static {
            CalorieGoalData calorieGoalData = new CalorieGoalData();
            DEFAULT_INSTANCE = calorieGoalData;
            GeneratedMessageLite.registerDefaultInstance(CalorieGoalData.class, calorieGoalData);
        }

        private CalorieGoalData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoalCalorie() {
            this.goalCalorie_ = 0;
        }

        public static CalorieGoalData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CalorieGoalData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CalorieGoalData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CalorieGoalData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CalorieGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CalorieGoalData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoalCalorie(int i) {
            this.goalCalorie_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new CalorieGoalData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"goalCalorie_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CalorieGoalData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (CalorieGoalData.class) {
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

        @Override // com.op.proto.CalorieGoal.CalorieGoalDataOrBuilder
        public int getGoalCalorie() {
            return this.goalCalorie_;
        }

        public static Builder newBuilder(CalorieGoalData calorieGoalData) {
            return DEFAULT_INSTANCE.createBuilder(calorieGoalData);
        }

        public static CalorieGoalData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CalorieGoalData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CalorieGoalData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CalorieGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CalorieGoalData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CalorieGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CalorieGoalData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CalorieGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CalorieGoalData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CalorieGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CalorieGoalData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CalorieGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CalorieGoalData parseFrom(InputStream inputStream) throws IOException {
            return (CalorieGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CalorieGoalData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CalorieGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CalorieGoalData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CalorieGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CalorieGoalData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CalorieGoalData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface CalorieGoalDataOrBuilder extends MessageLiteOrBuilder {
        int getGoalCalorie();
    }

    private CalorieGoal() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
