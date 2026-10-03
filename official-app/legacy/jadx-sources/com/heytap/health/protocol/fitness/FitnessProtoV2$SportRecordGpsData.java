package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.in7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV2$SportRecordGpsData extends GeneratedMessageLite<FitnessProtoV2$SportRecordGpsData, Builder> implements FitnessProtoV2$SportRecordGpsDataOrBuilder {
    private static final FitnessProtoV2$SportRecordGpsData DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 2;
    public static final int LONGITUDE_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProtoV2$SportRecordGpsData> PARSER = null;
    public static final int SPEED_FIELD_NUMBER = 5;
    public static final int STATE_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int timestampMemoizedSerializedSize = -1;
    private int latitudeMemoizedSerializedSize = -1;
    private int longitudeMemoizedSerializedSize = -1;
    private int stateMemoizedSerializedSize = -1;
    private int speedMemoizedSerializedSize = -1;
    private Internal.LongList timestamp_ = GeneratedMessageLite.emptyLongList();
    private Internal.IntList latitude_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList longitude_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList state_ = GeneratedMessageLite.emptyIntList();
    private Internal.FloatList speed_ = GeneratedMessageLite.emptyFloatList();

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SportRecordGpsData, Builder> implements FitnessProtoV2$SportRecordGpsDataOrBuilder {
        public Builder addAllLatitude(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).addAllLatitude(iterable);
            return this;
        }

        public Builder addAllLongitude(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).addAllLongitude(iterable);
            return this;
        }

        public Builder addAllSpeed(Iterable<? extends Float> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).addAllSpeed(iterable);
            return this;
        }

        public Builder addAllState(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).addAllState(iterable);
            return this;
        }

        public Builder addAllTimestamp(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).addAllTimestamp(iterable);
            return this;
        }

        public Builder addLatitude(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).addLatitude(i);
            return this;
        }

        public Builder addLongitude(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).addLongitude(i);
            return this;
        }

        public Builder addSpeed(float f) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).addSpeed(f);
            return this;
        }

        public Builder addState(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).addState(i);
            return this;
        }

        public Builder addTimestamp(long j2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).addTimestamp(j2);
            return this;
        }

        public Builder clearLatitude() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).clearLatitude();
            return this;
        }

        public Builder clearLongitude() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).clearLongitude();
            return this;
        }

        public Builder clearSpeed() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).clearSpeed();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).clearState();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public int getLatitude(int i) {
            return ((FitnessProtoV2$SportRecordGpsData) this.instance).getLatitude(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public int getLatitudeCount() {
            return ((FitnessProtoV2$SportRecordGpsData) this.instance).getLatitudeCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public List<Integer> getLatitudeList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordGpsData) this.instance).getLatitudeList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public int getLongitude(int i) {
            return ((FitnessProtoV2$SportRecordGpsData) this.instance).getLongitude(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public int getLongitudeCount() {
            return ((FitnessProtoV2$SportRecordGpsData) this.instance).getLongitudeCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public List<Integer> getLongitudeList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordGpsData) this.instance).getLongitudeList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public float getSpeed(int i) {
            return ((FitnessProtoV2$SportRecordGpsData) this.instance).getSpeed(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public int getSpeedCount() {
            return ((FitnessProtoV2$SportRecordGpsData) this.instance).getSpeedCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public List<Float> getSpeedList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordGpsData) this.instance).getSpeedList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public int getState(int i) {
            return ((FitnessProtoV2$SportRecordGpsData) this.instance).getState(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public int getStateCount() {
            return ((FitnessProtoV2$SportRecordGpsData) this.instance).getStateCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public List<Integer> getStateList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordGpsData) this.instance).getStateList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public long getTimestamp(int i) {
            return ((FitnessProtoV2$SportRecordGpsData) this.instance).getTimestamp(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public int getTimestampCount() {
            return ((FitnessProtoV2$SportRecordGpsData) this.instance).getTimestampCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
        public List<Long> getTimestampList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordGpsData) this.instance).getTimestampList());
        }

        public Builder setLatitude(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).setLatitude(i, i2);
            return this;
        }

        public Builder setLongitude(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).setLongitude(i, i2);
            return this;
        }

        public Builder setSpeed(int i, float f) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).setSpeed(i, f);
            return this;
        }

        public Builder setState(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).setState(i, i2);
            return this;
        }

        public Builder setTimestamp(int i, long j2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordGpsData) this.instance).setTimestamp(i, j2);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SportRecordGpsData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SportRecordGpsData fitnessProtoV2$SportRecordGpsData = new FitnessProtoV2$SportRecordGpsData();
        DEFAULT_INSTANCE = fitnessProtoV2$SportRecordGpsData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SportRecordGpsData.class, fitnessProtoV2$SportRecordGpsData);
    }

    private FitnessProtoV2$SportRecordGpsData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLatitude(Iterable<? extends Integer> iterable) {
        ensureLatitudeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.latitude_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLongitude(Iterable<? extends Integer> iterable) {
        ensureLongitudeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.longitude_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpeed(Iterable<? extends Float> iterable) {
        ensureSpeedIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.speed_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllState(Iterable<? extends Integer> iterable) {
        ensureStateIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.state_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimestamp(Iterable<? extends Long> iterable) {
        ensureTimestampIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.timestamp_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLatitude(int i) {
        ensureLatitudeIsMutable();
        this.latitude_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLongitude(int i) {
        ensureLongitudeIsMutable();
        this.longitude_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpeed(float f) {
        ensureSpeedIsMutable();
        this.speed_.addFloat(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addState(int i) {
        ensureStateIsMutable();
        this.state_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimestamp(long j2) {
        ensureTimestampIsMutable();
        this.timestamp_.addLong(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeed() {
        this.speed_ = GeneratedMessageLite.emptyFloatList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = GeneratedMessageLite.emptyLongList();
    }

    private void ensureLatitudeIsMutable() {
        Internal.IntList intList = this.latitude_;
        if (intList.isModifiable()) {
            return;
        }
        this.latitude_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureLongitudeIsMutable() {
        Internal.IntList intList = this.longitude_;
        if (intList.isModifiable()) {
            return;
        }
        this.longitude_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureSpeedIsMutable() {
        Internal.FloatList floatList = this.speed_;
        if (floatList.isModifiable()) {
            return;
        }
        this.speed_ = GeneratedMessageLite.mutableCopy(floatList);
    }

    private void ensureStateIsMutable() {
        Internal.IntList intList = this.state_;
        if (intList.isModifiable()) {
            return;
        }
        this.state_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureTimestampIsMutable() {
        Internal.LongList longList = this.timestamp_;
        if (longList.isModifiable()) {
            return;
        }
        this.timestamp_ = GeneratedMessageLite.mutableCopy(longList);
    }

    public static FitnessProtoV2$SportRecordGpsData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SportRecordGpsData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SportRecordGpsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SportRecordGpsData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportRecordGpsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SportRecordGpsData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(int i, int i2) {
        ensureLatitudeIsMutable();
        this.latitude_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(int i, int i2) {
        ensureLongitudeIsMutable();
        this.longitude_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(int i, float f) {
        ensureSpeedIsMutable();
        this.speed_.setFloat(i, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i, int i2) {
        ensureStateIsMutable();
        this.state_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i, long j2) {
        ensureTimestampIsMutable();
        this.timestamp_.setLong(i, j2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SportRecordGpsData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0005\u0000\u0001&\u0002'\u0003'\u0004+\u0005$", new Object[]{"timestamp_", "latitude_", "longitude_", "state_", "speed_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SportRecordGpsData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SportRecordGpsData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public int getLatitude(int i) {
        return this.latitude_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public int getLatitudeCount() {
        return this.latitude_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public List<Integer> getLatitudeList() {
        return this.latitude_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public int getLongitude(int i) {
        return this.longitude_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public int getLongitudeCount() {
        return this.longitude_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public List<Integer> getLongitudeList() {
        return this.longitude_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public float getSpeed(int i) {
        return this.speed_.getFloat(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public int getSpeedCount() {
        return this.speed_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public List<Float> getSpeedList() {
        return this.speed_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public int getState(int i) {
        return this.state_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public int getStateCount() {
        return this.state_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public List<Integer> getStateList() {
        return this.state_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public long getTimestamp(int i) {
        return this.timestamp_.getLong(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public int getTimestampCount() {
        return this.timestamp_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordGpsDataOrBuilder
    public List<Long> getTimestampList() {
        return this.timestamp_;
    }

    public static Builder newBuilder(FitnessProtoV2$SportRecordGpsData fitnessProtoV2$SportRecordGpsData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SportRecordGpsData);
    }

    public static FitnessProtoV2$SportRecordGpsData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SportRecordGpsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportRecordGpsData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportRecordGpsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportRecordGpsData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportRecordGpsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SportRecordGpsData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportRecordGpsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportRecordGpsData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportRecordGpsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SportRecordGpsData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportRecordGpsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportRecordGpsData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SportRecordGpsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SportRecordGpsData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SportRecordGpsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportRecordGpsData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SportRecordGpsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SportRecordGpsData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SportRecordGpsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
