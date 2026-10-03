package com.heytap.health.protocol.bloodpressure;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.lq1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class BloodPressurePBData$BloodPressureItemData extends GeneratedMessageLite<BloodPressurePBData$BloodPressureItemData, Builder> implements BloodPressurePBData$BloodPressureItemDataOrBuilder {
    private static final BloodPressurePBData$BloodPressureItemData DEFAULT_INSTANCE;
    public static final int DEVICEUNIQUEID_FIELD_NUMBER = 4;
    public static final int DIASTOLIC_FIELD_NUMBER = 2;
    public static final int MEASURETIME_FIELD_NUMBER = 3;
    private static volatile Parser<BloodPressurePBData$BloodPressureItemData> PARSER = null;
    public static final int SYSTOLIC_FIELD_NUMBER = 1;
    private String deviceUniqueId_ = "";
    private int diastolic_;
    private int measureTime_;
    private int systolic_;

    public static final class Builder extends GeneratedMessageLite.Builder<BloodPressurePBData$BloodPressureItemData, Builder> implements BloodPressurePBData$BloodPressureItemDataOrBuilder {
        public Builder clearDeviceUniqueId() {
            copyOnWrite();
            ((BloodPressurePBData$BloodPressureItemData) this.instance).clearDeviceUniqueId();
            return this;
        }

        public Builder clearDiastolic() {
            copyOnWrite();
            ((BloodPressurePBData$BloodPressureItemData) this.instance).clearDiastolic();
            return this;
        }

        public Builder clearMeasureTime() {
            copyOnWrite();
            ((BloodPressurePBData$BloodPressureItemData) this.instance).clearMeasureTime();
            return this;
        }

        public Builder clearSystolic() {
            copyOnWrite();
            ((BloodPressurePBData$BloodPressureItemData) this.instance).clearSystolic();
            return this;
        }

        @Override // com.heytap.health.protocol.bloodpressure.BloodPressurePBData$BloodPressureItemDataOrBuilder
        public String getDeviceUniqueId() {
            return ((BloodPressurePBData$BloodPressureItemData) this.instance).getDeviceUniqueId();
        }

        @Override // com.heytap.health.protocol.bloodpressure.BloodPressurePBData$BloodPressureItemDataOrBuilder
        public ByteString getDeviceUniqueIdBytes() {
            return ((BloodPressurePBData$BloodPressureItemData) this.instance).getDeviceUniqueIdBytes();
        }

        @Override // com.heytap.health.protocol.bloodpressure.BloodPressurePBData$BloodPressureItemDataOrBuilder
        public int getDiastolic() {
            return ((BloodPressurePBData$BloodPressureItemData) this.instance).getDiastolic();
        }

        @Override // com.heytap.health.protocol.bloodpressure.BloodPressurePBData$BloodPressureItemDataOrBuilder
        public int getMeasureTime() {
            return ((BloodPressurePBData$BloodPressureItemData) this.instance).getMeasureTime();
        }

        @Override // com.heytap.health.protocol.bloodpressure.BloodPressurePBData$BloodPressureItemDataOrBuilder
        public int getSystolic() {
            return ((BloodPressurePBData$BloodPressureItemData) this.instance).getSystolic();
        }

        public Builder setDeviceUniqueId(String str) {
            copyOnWrite();
            ((BloodPressurePBData$BloodPressureItemData) this.instance).setDeviceUniqueId(str);
            return this;
        }

        public Builder setDeviceUniqueIdBytes(ByteString byteString) {
            copyOnWrite();
            ((BloodPressurePBData$BloodPressureItemData) this.instance).setDeviceUniqueIdBytes(byteString);
            return this;
        }

        public Builder setDiastolic(int i) {
            copyOnWrite();
            ((BloodPressurePBData$BloodPressureItemData) this.instance).setDiastolic(i);
            return this;
        }

        public Builder setMeasureTime(int i) {
            copyOnWrite();
            ((BloodPressurePBData$BloodPressureItemData) this.instance).setMeasureTime(i);
            return this;
        }

        public Builder setSystolic(int i) {
            copyOnWrite();
            ((BloodPressurePBData$BloodPressureItemData) this.instance).setSystolic(i);
            return this;
        }

        private Builder() {
            super(BloodPressurePBData$BloodPressureItemData.DEFAULT_INSTANCE);
        }
    }

    static {
        BloodPressurePBData$BloodPressureItemData bloodPressurePBData$BloodPressureItemData = new BloodPressurePBData$BloodPressureItemData();
        DEFAULT_INSTANCE = bloodPressurePBData$BloodPressureItemData;
        GeneratedMessageLite.registerDefaultInstance(BloodPressurePBData$BloodPressureItemData.class, bloodPressurePBData$BloodPressureItemData);
    }

    private BloodPressurePBData$BloodPressureItemData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceUniqueId() {
        this.deviceUniqueId_ = getDefaultInstance().getDeviceUniqueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiastolic() {
        this.diastolic_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeasureTime() {
        this.measureTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystolic() {
        this.systolic_ = 0;
    }

    public static BloodPressurePBData$BloodPressureItemData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BloodPressurePBData$BloodPressureItemData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BloodPressurePBData$BloodPressureItemData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BloodPressurePBData$BloodPressureItemData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BloodPressurePBData$BloodPressureItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BloodPressurePBData$BloodPressureItemData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceUniqueId(String str) {
        str.getClass();
        this.deviceUniqueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceUniqueIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceUniqueId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiastolic(int i) {
        this.diastolic_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeasureTime(int i) {
        this.measureTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystolic(int i) {
        this.systolic_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = lq1.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new BloodPressurePBData$BloodPressureItemData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004Ȉ", new Object[]{"systolic_", "diastolic_", "measureTime_", "deviceUniqueId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BloodPressurePBData$BloodPressureItemData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (BloodPressurePBData$BloodPressureItemData.class) {
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

    @Override // com.heytap.health.protocol.bloodpressure.BloodPressurePBData$BloodPressureItemDataOrBuilder
    public String getDeviceUniqueId() {
        return this.deviceUniqueId_;
    }

    @Override // com.heytap.health.protocol.bloodpressure.BloodPressurePBData$BloodPressureItemDataOrBuilder
    public ByteString getDeviceUniqueIdBytes() {
        return ByteString.copyFromUtf8(this.deviceUniqueId_);
    }

    @Override // com.heytap.health.protocol.bloodpressure.BloodPressurePBData$BloodPressureItemDataOrBuilder
    public int getDiastolic() {
        return this.diastolic_;
    }

    @Override // com.heytap.health.protocol.bloodpressure.BloodPressurePBData$BloodPressureItemDataOrBuilder
    public int getMeasureTime() {
        return this.measureTime_;
    }

    @Override // com.heytap.health.protocol.bloodpressure.BloodPressurePBData$BloodPressureItemDataOrBuilder
    public int getSystolic() {
        return this.systolic_;
    }

    public static Builder newBuilder(BloodPressurePBData$BloodPressureItemData bloodPressurePBData$BloodPressureItemData) {
        return DEFAULT_INSTANCE.createBuilder(bloodPressurePBData$BloodPressureItemData);
    }

    public static BloodPressurePBData$BloodPressureItemData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BloodPressurePBData$BloodPressureItemData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BloodPressurePBData$BloodPressureItemData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BloodPressurePBData$BloodPressureItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BloodPressurePBData$BloodPressureItemData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BloodPressurePBData$BloodPressureItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BloodPressurePBData$BloodPressureItemData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BloodPressurePBData$BloodPressureItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BloodPressurePBData$BloodPressureItemData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BloodPressurePBData$BloodPressureItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BloodPressurePBData$BloodPressureItemData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BloodPressurePBData$BloodPressureItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BloodPressurePBData$BloodPressureItemData parseFrom(InputStream inputStream) throws IOException {
        return (BloodPressurePBData$BloodPressureItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BloodPressurePBData$BloodPressureItemData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BloodPressurePBData$BloodPressureItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BloodPressurePBData$BloodPressureItemData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BloodPressurePBData$BloodPressureItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BloodPressurePBData$BloodPressureItemData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BloodPressurePBData$BloodPressureItemData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
