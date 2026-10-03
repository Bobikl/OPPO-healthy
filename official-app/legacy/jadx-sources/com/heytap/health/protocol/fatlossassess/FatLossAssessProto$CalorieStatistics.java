package com.heytap.health.protocol.fatlossassess;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.s77;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FatLossAssessProto$CalorieStatistics extends GeneratedMessageLite<FatLossAssessProto$CalorieStatistics, Builder> implements FatLossAssessProto$CalorieStatisticsOrBuilder {
    public static final int BASICCALORIE_FIELD_NUMBER = 3;
    public static final int CALORIETARGET_FIELD_NUMBER = 4;
    public static final int DATE_FIELD_NUMBER = 1;
    private static final FatLossAssessProto$CalorieStatistics DEFAULT_INSTANCE;
    public static final int DYNAMICCALORIE_FIELD_NUMBER = 2;
    private static volatile Parser<FatLossAssessProto$CalorieStatistics> PARSER;
    private int basicCalorie_;
    private int calorieTarget_;
    private String date_ = "";
    private int dynamicCalorie_;

    public static final class Builder extends GeneratedMessageLite.Builder<FatLossAssessProto$CalorieStatistics, Builder> implements FatLossAssessProto$CalorieStatisticsOrBuilder {
        public Builder clearBasicCalorie() {
            copyOnWrite();
            ((FatLossAssessProto$CalorieStatistics) this.instance).clearBasicCalorie();
            return this;
        }

        public Builder clearCalorieTarget() {
            copyOnWrite();
            ((FatLossAssessProto$CalorieStatistics) this.instance).clearCalorieTarget();
            return this;
        }

        public Builder clearDate() {
            copyOnWrite();
            ((FatLossAssessProto$CalorieStatistics) this.instance).clearDate();
            return this;
        }

        public Builder clearDynamicCalorie() {
            copyOnWrite();
            ((FatLossAssessProto$CalorieStatistics) this.instance).clearDynamicCalorie();
            return this;
        }

        @Override // com.heytap.health.protocol.fatlossassess.FatLossAssessProto$CalorieStatisticsOrBuilder
        public int getBasicCalorie() {
            return ((FatLossAssessProto$CalorieStatistics) this.instance).getBasicCalorie();
        }

        @Override // com.heytap.health.protocol.fatlossassess.FatLossAssessProto$CalorieStatisticsOrBuilder
        public int getCalorieTarget() {
            return ((FatLossAssessProto$CalorieStatistics) this.instance).getCalorieTarget();
        }

        @Override // com.heytap.health.protocol.fatlossassess.FatLossAssessProto$CalorieStatisticsOrBuilder
        public String getDate() {
            return ((FatLossAssessProto$CalorieStatistics) this.instance).getDate();
        }

        @Override // com.heytap.health.protocol.fatlossassess.FatLossAssessProto$CalorieStatisticsOrBuilder
        public ByteString getDateBytes() {
            return ((FatLossAssessProto$CalorieStatistics) this.instance).getDateBytes();
        }

        @Override // com.heytap.health.protocol.fatlossassess.FatLossAssessProto$CalorieStatisticsOrBuilder
        public int getDynamicCalorie() {
            return ((FatLossAssessProto$CalorieStatistics) this.instance).getDynamicCalorie();
        }

        public Builder setBasicCalorie(int i) {
            copyOnWrite();
            ((FatLossAssessProto$CalorieStatistics) this.instance).setBasicCalorie(i);
            return this;
        }

        public Builder setCalorieTarget(int i) {
            copyOnWrite();
            ((FatLossAssessProto$CalorieStatistics) this.instance).setCalorieTarget(i);
            return this;
        }

        public Builder setDate(String str) {
            copyOnWrite();
            ((FatLossAssessProto$CalorieStatistics) this.instance).setDate(str);
            return this;
        }

        public Builder setDateBytes(ByteString byteString) {
            copyOnWrite();
            ((FatLossAssessProto$CalorieStatistics) this.instance).setDateBytes(byteString);
            return this;
        }

        public Builder setDynamicCalorie(int i) {
            copyOnWrite();
            ((FatLossAssessProto$CalorieStatistics) this.instance).setDynamicCalorie(i);
            return this;
        }

        private Builder() {
            super(FatLossAssessProto$CalorieStatistics.DEFAULT_INSTANCE);
        }
    }

    static {
        FatLossAssessProto$CalorieStatistics fatLossAssessProto$CalorieStatistics = new FatLossAssessProto$CalorieStatistics();
        DEFAULT_INSTANCE = fatLossAssessProto$CalorieStatistics;
        GeneratedMessageLite.registerDefaultInstance(FatLossAssessProto$CalorieStatistics.class, fatLossAssessProto$CalorieStatistics);
    }

    private FatLossAssessProto$CalorieStatistics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBasicCalorie() {
        this.basicCalorie_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalorieTarget() {
        this.calorieTarget_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDate() {
        this.date_ = getDefaultInstance().getDate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDynamicCalorie() {
        this.dynamicCalorie_ = 0;
    }

    public static FatLossAssessProto$CalorieStatistics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FatLossAssessProto$CalorieStatistics parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FatLossAssessProto$CalorieStatistics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FatLossAssessProto$CalorieStatistics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FatLossAssessProto$CalorieStatistics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FatLossAssessProto$CalorieStatistics> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBasicCalorie(int i) {
        this.basicCalorie_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalorieTarget(int i) {
        this.calorieTarget_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(String str) {
        str.getClass();
        this.date_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.date_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDynamicCalorie(int i) {
        this.dynamicCalorie_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = s77.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FatLossAssessProto$CalorieStatistics();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"date_", "dynamicCalorie_", "basicCalorie_", "calorieTarget_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FatLossAssessProto$CalorieStatistics> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FatLossAssessProto$CalorieStatistics.class) {
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

    @Override // com.heytap.health.protocol.fatlossassess.FatLossAssessProto$CalorieStatisticsOrBuilder
    public int getBasicCalorie() {
        return this.basicCalorie_;
    }

    @Override // com.heytap.health.protocol.fatlossassess.FatLossAssessProto$CalorieStatisticsOrBuilder
    public int getCalorieTarget() {
        return this.calorieTarget_;
    }

    @Override // com.heytap.health.protocol.fatlossassess.FatLossAssessProto$CalorieStatisticsOrBuilder
    public String getDate() {
        return this.date_;
    }

    @Override // com.heytap.health.protocol.fatlossassess.FatLossAssessProto$CalorieStatisticsOrBuilder
    public ByteString getDateBytes() {
        return ByteString.copyFromUtf8(this.date_);
    }

    @Override // com.heytap.health.protocol.fatlossassess.FatLossAssessProto$CalorieStatisticsOrBuilder
    public int getDynamicCalorie() {
        return this.dynamicCalorie_;
    }

    public static Builder newBuilder(FatLossAssessProto$CalorieStatistics fatLossAssessProto$CalorieStatistics) {
        return DEFAULT_INSTANCE.createBuilder(fatLossAssessProto$CalorieStatistics);
    }

    public static FatLossAssessProto$CalorieStatistics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FatLossAssessProto$CalorieStatistics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FatLossAssessProto$CalorieStatistics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FatLossAssessProto$CalorieStatistics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FatLossAssessProto$CalorieStatistics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FatLossAssessProto$CalorieStatistics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FatLossAssessProto$CalorieStatistics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FatLossAssessProto$CalorieStatistics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FatLossAssessProto$CalorieStatistics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FatLossAssessProto$CalorieStatistics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FatLossAssessProto$CalorieStatistics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FatLossAssessProto$CalorieStatistics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FatLossAssessProto$CalorieStatistics parseFrom(InputStream inputStream) throws IOException {
        return (FatLossAssessProto$CalorieStatistics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FatLossAssessProto$CalorieStatistics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FatLossAssessProto$CalorieStatistics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FatLossAssessProto$CalorieStatistics parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FatLossAssessProto$CalorieStatistics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FatLossAssessProto$CalorieStatistics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FatLossAssessProto$CalorieStatistics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
