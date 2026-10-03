package com.heytap.wearable.health;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.dv6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Exercise$ExerciseRemindData extends GeneratedMessageLite<Exercise$ExerciseRemindData, Builder> implements Exercise$ExerciseRemindDataOrBuilder {
    public static final int ACTION_DATA_FIELD_NUMBER = 3;
    private static final Exercise$ExerciseRemindData DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Exercise$ExerciseRemindData> PARSER = null;
    public static final int REMIND_TYPE_FIELD_NUMBER = 2;
    private Object payload_;
    private int remindType_;
    private int payloadCase_ = 0;
    private String packageName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Exercise$ExerciseRemindData, Builder> implements Exercise$ExerciseRemindDataOrBuilder {
        public Builder clearActionData() {
            copyOnWrite();
            ((Exercise$ExerciseRemindData) this.instance).clearActionData();
            return this;
        }

        public Builder clearPackageName() {
            copyOnWrite();
            ((Exercise$ExerciseRemindData) this.instance).clearPackageName();
            return this;
        }

        public Builder clearPayload() {
            copyOnWrite();
            ((Exercise$ExerciseRemindData) this.instance).clearPayload();
            return this;
        }

        public Builder clearRemindType() {
            copyOnWrite();
            ((Exercise$ExerciseRemindData) this.instance).clearRemindType();
            return this;
        }

        @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
        public Exercise$ExerciseActionData getActionData() {
            return ((Exercise$ExerciseRemindData) this.instance).getActionData();
        }

        @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
        public String getPackageName() {
            return ((Exercise$ExerciseRemindData) this.instance).getPackageName();
        }

        @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
        public ByteString getPackageNameBytes() {
            return ((Exercise$ExerciseRemindData) this.instance).getPackageNameBytes();
        }

        @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
        public PayloadCase getPayloadCase() {
            return ((Exercise$ExerciseRemindData) this.instance).getPayloadCase();
        }

        @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
        public Exercise$ExerciseRemindType getRemindType() {
            return ((Exercise$ExerciseRemindData) this.instance).getRemindType();
        }

        @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
        public int getRemindTypeValue() {
            return ((Exercise$ExerciseRemindData) this.instance).getRemindTypeValue();
        }

        @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
        public boolean hasActionData() {
            return ((Exercise$ExerciseRemindData) this.instance).hasActionData();
        }

        public Builder mergeActionData(Exercise$ExerciseActionData exercise$ExerciseActionData) {
            copyOnWrite();
            ((Exercise$ExerciseRemindData) this.instance).mergeActionData(exercise$ExerciseActionData);
            return this;
        }

        public Builder setActionData(Exercise$ExerciseActionData exercise$ExerciseActionData) {
            copyOnWrite();
            ((Exercise$ExerciseRemindData) this.instance).setActionData(exercise$ExerciseActionData);
            return this;
        }

        public Builder setPackageName(String str) {
            copyOnWrite();
            ((Exercise$ExerciseRemindData) this.instance).setPackageName(str);
            return this;
        }

        public Builder setPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Exercise$ExerciseRemindData) this.instance).setPackageNameBytes(byteString);
            return this;
        }

        public Builder setRemindType(Exercise$ExerciseRemindType exercise$ExerciseRemindType) {
            copyOnWrite();
            ((Exercise$ExerciseRemindData) this.instance).setRemindType(exercise$ExerciseRemindType);
            return this;
        }

        public Builder setRemindTypeValue(int i) {
            copyOnWrite();
            ((Exercise$ExerciseRemindData) this.instance).setRemindTypeValue(i);
            return this;
        }

        private Builder() {
            super(Exercise$ExerciseRemindData.DEFAULT_INSTANCE);
        }

        public Builder setActionData(Exercise$ExerciseActionData.Builder builder) {
            copyOnWrite();
            ((Exercise$ExerciseRemindData) this.instance).setActionData(builder.build());
            return this;
        }
    }

    public enum PayloadCase {
        ACTION_DATA(3),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i) {
            this.value = i;
        }

        public static PayloadCase forNumber(int i) {
            if (i == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i != 3) {
                return null;
            }
            return ACTION_DATA;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Exercise$ExerciseRemindData exercise$ExerciseRemindData = new Exercise$ExerciseRemindData();
        DEFAULT_INSTANCE = exercise$ExerciseRemindData;
        GeneratedMessageLite.registerDefaultInstance(Exercise$ExerciseRemindData.class, exercise$ExerciseRemindData);
    }

    private Exercise$ExerciseRemindData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionData() {
        if (this.payloadCase_ == 3) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payloadCase_ = 0;
        this.payload_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemindType() {
        this.remindType_ = 0;
    }

    public static Exercise$ExerciseRemindData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActionData(Exercise$ExerciseActionData exercise$ExerciseActionData) {
        exercise$ExerciseActionData.getClass();
        if (this.payloadCase_ != 3 || this.payload_ == Exercise$ExerciseActionData.getDefaultInstance()) {
            this.payload_ = exercise$ExerciseActionData;
        } else {
            this.payload_ = Exercise$ExerciseActionData.newBuilder((Exercise$ExerciseActionData) this.payload_).mergeFrom(exercise$ExerciseActionData).buildPartial();
        }
        this.payloadCase_ = 3;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Exercise$ExerciseRemindData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Exercise$ExerciseRemindData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$ExerciseRemindData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Exercise$ExerciseRemindData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionData(Exercise$ExerciseActionData exercise$ExerciseActionData) {
        exercise$ExerciseActionData.getClass();
        this.payload_ = exercise$ExerciseActionData;
        this.payloadCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(String str) {
        str.getClass();
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.packageName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemindType(Exercise$ExerciseRemindType exercise$ExerciseRemindType) {
        this.remindType_ = exercise$ExerciseRemindType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemindTypeValue(int i) {
        this.remindType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = dv6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Exercise$ExerciseRemindData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003<\u0000", new Object[]{"payload_", "payloadCase_", "packageName_", "remindType_", Exercise$ExerciseActionData.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Exercise$ExerciseRemindData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Exercise$ExerciseRemindData.class) {
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

    @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
    public Exercise$ExerciseActionData getActionData() {
        return this.payloadCase_ == 3 ? (Exercise$ExerciseActionData) this.payload_ : Exercise$ExerciseActionData.getDefaultInstance();
    }

    @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
    public String getPackageName() {
        return this.packageName_;
    }

    @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
    public ByteString getPackageNameBytes() {
        return ByteString.copyFromUtf8(this.packageName_);
    }

    @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
    public Exercise$ExerciseRemindType getRemindType() {
        Exercise$ExerciseRemindType exercise$ExerciseRemindTypeForNumber = Exercise$ExerciseRemindType.forNumber(this.remindType_);
        return exercise$ExerciseRemindTypeForNumber == null ? Exercise$ExerciseRemindType.UNRECOGNIZED : exercise$ExerciseRemindTypeForNumber;
    }

    @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
    public int getRemindTypeValue() {
        return this.remindType_;
    }

    @Override // com.heytap.wearable.health.Exercise$ExerciseRemindDataOrBuilder
    public boolean hasActionData() {
        return this.payloadCase_ == 3;
    }

    public static Builder newBuilder(Exercise$ExerciseRemindData exercise$ExerciseRemindData) {
        return DEFAULT_INSTANCE.createBuilder(exercise$ExerciseRemindData);
    }

    public static Exercise$ExerciseRemindData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$ExerciseRemindData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$ExerciseRemindData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Exercise$ExerciseRemindData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Exercise$ExerciseRemindData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Exercise$ExerciseRemindData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Exercise$ExerciseRemindData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Exercise$ExerciseRemindData parseFrom(InputStream inputStream) throws IOException {
        return (Exercise$ExerciseRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$ExerciseRemindData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$ExerciseRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$ExerciseRemindData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Exercise$ExerciseRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Exercise$ExerciseRemindData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$ExerciseRemindData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
