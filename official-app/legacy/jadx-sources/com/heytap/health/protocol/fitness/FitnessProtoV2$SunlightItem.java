package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.in7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV2$SunlightItem extends GeneratedMessageLite<FitnessProtoV2$SunlightItem, Builder> implements FitnessProtoV2$SunlightItemOrBuilder {
    private static final FitnessProtoV2$SunlightItem DEFAULT_INSTANCE;
    public static final int MAX_LIGHT_INTENSITY_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProtoV2$SunlightItem> PARSER = null;
    public static final int SUNLIGHT_EXPOSED_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int maxLightIntensity_;
    private int sunlightExposed_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SunlightItem, Builder> implements FitnessProtoV2$SunlightItemOrBuilder {
        private Builder() {
            super(FitnessProtoV2$SunlightItem.DEFAULT_INSTANCE);
        }

        public Builder clearMaxLightIntensity() {
            copyOnWrite();
            ((FitnessProtoV2$SunlightItem) this.instance).clearMaxLightIntensity();
            return this;
        }

        public Builder clearSunlightExposed() {
            copyOnWrite();
            ((FitnessProtoV2$SunlightItem) this.instance).clearSunlightExposed();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProtoV2$SunlightItem) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightItemOrBuilder
        public int getMaxLightIntensity() {
            return ((FitnessProtoV2$SunlightItem) this.instance).getMaxLightIntensity();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightItemOrBuilder
        public int getSunlightExposed() {
            return ((FitnessProtoV2$SunlightItem) this.instance).getSunlightExposed();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightItemOrBuilder
        public int getTimestamp() {
            return ((FitnessProtoV2$SunlightItem) this.instance).getTimestamp();
        }

        public Builder setMaxLightIntensity(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SunlightItem) this.instance).setMaxLightIntensity(i);
            return this;
        }

        public Builder setSunlightExposed(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SunlightItem) this.instance).setSunlightExposed(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SunlightItem) this.instance).setTimestamp(i);
            return this;
        }
    }

    static {
        FitnessProtoV2$SunlightItem fitnessProtoV2$SunlightItem = new FitnessProtoV2$SunlightItem();
        DEFAULT_INSTANCE = fitnessProtoV2$SunlightItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SunlightItem.class, fitnessProtoV2$SunlightItem);
    }

    private FitnessProtoV2$SunlightItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxLightIntensity() {
        this.maxLightIntensity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSunlightExposed() {
        this.sunlightExposed_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static FitnessProtoV2$SunlightItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SunlightItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SunlightItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SunlightItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SunlightItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProtoV2$SunlightItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxLightIntensity(int i) {
        this.maxLightIntensity_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSunlightExposed(int i) {
        this.sunlightExposed_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SunlightItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"timestamp_", "sunlightExposed_", "maxLightIntensity_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SunlightItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SunlightItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightItemOrBuilder
    public int getMaxLightIntensity() {
        return this.maxLightIntensity_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightItemOrBuilder
    public int getSunlightExposed() {
        return this.sunlightExposed_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightItemOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(FitnessProtoV2$SunlightItem fitnessProtoV2$SunlightItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SunlightItem);
    }

    public static FitnessProtoV2$SunlightItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SunlightItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SunlightItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SunlightItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SunlightItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SunlightItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SunlightItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SunlightItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SunlightItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SunlightItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SunlightItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SunlightItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SunlightItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SunlightItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProtoV2$SunlightItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SunlightItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SunlightItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SunlightItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SunlightItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SunlightItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
