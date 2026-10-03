package com.heytap.wearable.health;

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
public final class Exercise$ExerciseSetting extends GeneratedMessageLite<Exercise$ExerciseSetting, Builder> implements Exercise$ExerciseSettingOrBuilder {
    private static final Exercise$ExerciseSetting DEFAULT_INSTANCE;
    public static final int IS_AUTO_PAUSE_FIELD_NUMBER = 1;
    private static volatile Parser<Exercise$ExerciseSetting> PARSER;
    private boolean isAutoPause_;

    public static final class Builder extends GeneratedMessageLite.Builder<Exercise$ExerciseSetting, Builder> implements Exercise$ExerciseSettingOrBuilder {
        public Builder clearIsAutoPause() {
            copyOnWrite();
            ((Exercise$ExerciseSetting) this.instance).clearIsAutoPause();
            return this;
        }

        @Override // com.heytap.wearable.health.Exercise$ExerciseSettingOrBuilder
        public boolean getIsAutoPause() {
            return ((Exercise$ExerciseSetting) this.instance).getIsAutoPause();
        }

        public Builder setIsAutoPause(boolean z) {
            copyOnWrite();
            ((Exercise$ExerciseSetting) this.instance).setIsAutoPause(z);
            return this;
        }

        private Builder() {
            super(Exercise$ExerciseSetting.DEFAULT_INSTANCE);
        }
    }

    static {
        Exercise$ExerciseSetting exercise$ExerciseSetting = new Exercise$ExerciseSetting();
        DEFAULT_INSTANCE = exercise$ExerciseSetting;
        GeneratedMessageLite.registerDefaultInstance(Exercise$ExerciseSetting.class, exercise$ExerciseSetting);
    }

    private Exercise$ExerciseSetting() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAutoPause() {
        this.isAutoPause_ = false;
    }

    public static Exercise$ExerciseSetting getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Exercise$ExerciseSetting parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Exercise$ExerciseSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$ExerciseSetting parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Exercise$ExerciseSetting> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAutoPause(boolean z) {
        this.isAutoPause_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = dv6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Exercise$ExerciseSetting();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isAutoPause_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Exercise$ExerciseSetting> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Exercise$ExerciseSetting.class) {
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

    @Override // com.heytap.wearable.health.Exercise$ExerciseSettingOrBuilder
    public boolean getIsAutoPause() {
        return this.isAutoPause_;
    }

    public static Builder newBuilder(Exercise$ExerciseSetting exercise$ExerciseSetting) {
        return DEFAULT_INSTANCE.createBuilder(exercise$ExerciseSetting);
    }

    public static Exercise$ExerciseSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$ExerciseSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$ExerciseSetting parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Exercise$ExerciseSetting parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Exercise$ExerciseSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Exercise$ExerciseSetting parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Exercise$ExerciseSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$ExerciseSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Exercise$ExerciseSetting parseFrom(InputStream inputStream) throws IOException {
        return (Exercise$ExerciseSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$ExerciseSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$ExerciseSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$ExerciseSetting parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Exercise$ExerciseSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Exercise$ExerciseSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$ExerciseSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
