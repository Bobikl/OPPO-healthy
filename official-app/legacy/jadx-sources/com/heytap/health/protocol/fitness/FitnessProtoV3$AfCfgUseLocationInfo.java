package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.aq7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV3$AfCfgUseLocationInfo extends GeneratedMessageLite<FitnessProtoV3$AfCfgUseLocationInfo, Builder> implements FitnessProtoV3$AfCfgUseLocationInfoOrBuilder {
    public static final int APPEAR_NUM_COMPANY_FIELD_NUMBER = 7;
    public static final int APPEAR_NUM_HOME_FIELD_NUMBER = 3;
    private static final FitnessProtoV3$AfCfgUseLocationInfo DEFAULT_INSTANCE;
    public static final int LATITUDE_COMPANY_FIELD_NUMBER = 9;
    public static final int LATITUDE_CURRENT_FIELD_NUMBER = 2;
    public static final int LATITUDE_HOME_FIELD_NUMBER = 5;
    public static final int LONGTITUDE_COMPANY_FIELD_NUMBER = 8;
    public static final int LONGTITUDE_CURRENT_FIELD_NUMBER = 1;
    public static final int LONGTITUDE_HOME_FIELD_NUMBER = 4;
    private static volatile Parser<FitnessProtoV3$AfCfgUseLocationInfo> PARSER = null;
    public static final int RADIUS_COMPANY_FIELD_NUMBER = 10;
    public static final int RADIUS_HOME_FIELD_NUMBER = 6;
    private int appearNumCompany_;
    private int appearNumHome_;
    private float latitudeCompany_;
    private float latitudeCurrent_;
    private float latitudeHome_;
    private float longtitudeCompany_;
    private float longtitudeCurrent_;
    private float longtitudeHome_;
    private float radiusCompany_;
    private float radiusHome_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV3$AfCfgUseLocationInfo, Builder> implements FitnessProtoV3$AfCfgUseLocationInfoOrBuilder {
        public Builder clearAppearNumCompany() {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).clearAppearNumCompany();
            return this;
        }

        public Builder clearAppearNumHome() {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).clearAppearNumHome();
            return this;
        }

        public Builder clearLatitudeCompany() {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).clearLatitudeCompany();
            return this;
        }

        public Builder clearLatitudeCurrent() {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).clearLatitudeCurrent();
            return this;
        }

        public Builder clearLatitudeHome() {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).clearLatitudeHome();
            return this;
        }

        public Builder clearLongtitudeCompany() {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).clearLongtitudeCompany();
            return this;
        }

        public Builder clearLongtitudeCurrent() {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).clearLongtitudeCurrent();
            return this;
        }

        public Builder clearLongtitudeHome() {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).clearLongtitudeHome();
            return this;
        }

        public Builder clearRadiusCompany() {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).clearRadiusCompany();
            return this;
        }

        public Builder clearRadiusHome() {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).clearRadiusHome();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
        public int getAppearNumCompany() {
            return ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).getAppearNumCompany();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
        public int getAppearNumHome() {
            return ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).getAppearNumHome();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
        public float getLatitudeCompany() {
            return ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).getLatitudeCompany();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
        public float getLatitudeCurrent() {
            return ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).getLatitudeCurrent();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
        public float getLatitudeHome() {
            return ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).getLatitudeHome();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
        public float getLongtitudeCompany() {
            return ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).getLongtitudeCompany();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
        public float getLongtitudeCurrent() {
            return ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).getLongtitudeCurrent();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
        public float getLongtitudeHome() {
            return ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).getLongtitudeHome();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
        public float getRadiusCompany() {
            return ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).getRadiusCompany();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
        public float getRadiusHome() {
            return ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).getRadiusHome();
        }

        public Builder setAppearNumCompany(int i) {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).setAppearNumCompany(i);
            return this;
        }

        public Builder setAppearNumHome(int i) {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).setAppearNumHome(i);
            return this;
        }

        public Builder setLatitudeCompany(float f) {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).setLatitudeCompany(f);
            return this;
        }

        public Builder setLatitudeCurrent(float f) {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).setLatitudeCurrent(f);
            return this;
        }

        public Builder setLatitudeHome(float f) {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).setLatitudeHome(f);
            return this;
        }

        public Builder setLongtitudeCompany(float f) {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).setLongtitudeCompany(f);
            return this;
        }

        public Builder setLongtitudeCurrent(float f) {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).setLongtitudeCurrent(f);
            return this;
        }

        public Builder setLongtitudeHome(float f) {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).setLongtitudeHome(f);
            return this;
        }

        public Builder setRadiusCompany(float f) {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).setRadiusCompany(f);
            return this;
        }

        public Builder setRadiusHome(float f) {
            copyOnWrite();
            ((FitnessProtoV3$AfCfgUseLocationInfo) this.instance).setRadiusHome(f);
            return this;
        }

        private Builder() {
            super(FitnessProtoV3$AfCfgUseLocationInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV3$AfCfgUseLocationInfo fitnessProtoV3$AfCfgUseLocationInfo = new FitnessProtoV3$AfCfgUseLocationInfo();
        DEFAULT_INSTANCE = fitnessProtoV3$AfCfgUseLocationInfo;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV3$AfCfgUseLocationInfo.class, fitnessProtoV3$AfCfgUseLocationInfo);
    }

    private FitnessProtoV3$AfCfgUseLocationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppearNumCompany() {
        this.appearNumCompany_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppearNumHome() {
        this.appearNumHome_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitudeCompany() {
        this.latitudeCompany_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitudeCurrent() {
        this.latitudeCurrent_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitudeHome() {
        this.latitudeHome_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongtitudeCompany() {
        this.longtitudeCompany_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongtitudeCurrent() {
        this.longtitudeCurrent_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongtitudeHome() {
        this.longtitudeHome_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRadiusCompany() {
        this.radiusCompany_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRadiusHome() {
        this.radiusHome_ = 0.0f;
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV3$AfCfgUseLocationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$AfCfgUseLocationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV3$AfCfgUseLocationInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppearNumCompany(int i) {
        this.appearNumCompany_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppearNumHome(int i) {
        this.appearNumHome_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitudeCompany(float f) {
        this.latitudeCompany_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitudeCurrent(float f) {
        this.latitudeCurrent_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitudeHome(float f) {
        this.latitudeHome_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongtitudeCompany(float f) {
        this.longtitudeCompany_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongtitudeCurrent(float f) {
        this.longtitudeCurrent_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongtitudeHome(float f) {
        this.longtitudeHome_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRadiusCompany(float f) {
        this.radiusCompany_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRadiusHome(float f) {
        this.radiusHome_ = f;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = aq7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV3$AfCfgUseLocationInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u000b\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u000b\b\u0001\t\u0001\n\u0001", new Object[]{"longtitudeCurrent_", "latitudeCurrent_", "appearNumHome_", "longtitudeHome_", "latitudeHome_", "radiusHome_", "appearNumCompany_", "longtitudeCompany_", "latitudeCompany_", "radiusCompany_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV3$AfCfgUseLocationInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV3$AfCfgUseLocationInfo.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
    public int getAppearNumCompany() {
        return this.appearNumCompany_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
    public int getAppearNumHome() {
        return this.appearNumHome_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
    public float getLatitudeCompany() {
        return this.latitudeCompany_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
    public float getLatitudeCurrent() {
        return this.latitudeCurrent_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
    public float getLatitudeHome() {
        return this.latitudeHome_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
    public float getLongtitudeCompany() {
        return this.longtitudeCompany_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
    public float getLongtitudeCurrent() {
        return this.longtitudeCurrent_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
    public float getLongtitudeHome() {
        return this.longtitudeHome_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
    public float getRadiusCompany() {
        return this.radiusCompany_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$AfCfgUseLocationInfoOrBuilder
    public float getRadiusHome() {
        return this.radiusHome_;
    }

    public static Builder newBuilder(FitnessProtoV3$AfCfgUseLocationInfo fitnessProtoV3$AfCfgUseLocationInfo) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV3$AfCfgUseLocationInfo);
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV3$AfCfgUseLocationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$AfCfgUseLocationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$AfCfgUseLocationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$AfCfgUseLocationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$AfCfgUseLocationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$AfCfgUseLocationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV3$AfCfgUseLocationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV3$AfCfgUseLocationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV3$AfCfgUseLocationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV3$AfCfgUseLocationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV3$AfCfgUseLocationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
