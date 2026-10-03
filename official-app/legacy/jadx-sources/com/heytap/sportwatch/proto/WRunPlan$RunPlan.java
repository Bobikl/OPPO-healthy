package com.heytap.sportwatch.proto;

import androidx.room.util.TableInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.i5l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class WRunPlan$RunPlan extends GeneratedMessageLite<WRunPlan$RunPlan, Builder> implements WRunPlan$RunPlanOrBuilder {
    private static final WRunPlan$RunPlan DEFAULT_INSTANCE;
    public static final int DISTANCE_FIELD_NUMBER = 6;
    public static final int DURATION_FIELD_NUMBER = 7;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile Parser<WRunPlan$RunPlan> PARSER = null;
    public static final int SPEED_FIELD_NUMBER = 4;
    public static final int SPEED_MAX_FIELD_NUMBER = 3;
    public static final int SPEED_MIN_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 5;
    private int distance_;
    private int duration_;
    private int index_;
    private float speedMax_;
    private float speedMin_;
    private float speed_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<WRunPlan$RunPlan, Builder> implements WRunPlan$RunPlanOrBuilder {
        public Builder clearDistance() {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).clearDistance();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).clearDuration();
            return this;
        }

        public Builder clearIndex() {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).clearIndex();
            return this;
        }

        public Builder clearSpeed() {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).clearSpeed();
            return this;
        }

        public Builder clearSpeedMax() {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).clearSpeedMax();
            return this;
        }

        public Builder clearSpeedMin() {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).clearSpeedMin();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
        public int getDistance() {
            return ((WRunPlan$RunPlan) this.instance).getDistance();
        }

        @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
        public int getDuration() {
            return ((WRunPlan$RunPlan) this.instance).getDuration();
        }

        @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
        public int getIndex() {
            return ((WRunPlan$RunPlan) this.instance).getIndex();
        }

        @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
        public float getSpeed() {
            return ((WRunPlan$RunPlan) this.instance).getSpeed();
        }

        @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
        public float getSpeedMax() {
            return ((WRunPlan$RunPlan) this.instance).getSpeedMax();
        }

        @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
        public float getSpeedMin() {
            return ((WRunPlan$RunPlan) this.instance).getSpeedMin();
        }

        @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
        public int getType() {
            return ((WRunPlan$RunPlan) this.instance).getType();
        }

        public Builder setDistance(int i) {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).setDistance(i);
            return this;
        }

        public Builder setDuration(int i) {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).setDuration(i);
            return this;
        }

        public Builder setIndex(int i) {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).setIndex(i);
            return this;
        }

        public Builder setSpeed(float f) {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).setSpeed(f);
            return this;
        }

        public Builder setSpeedMax(float f) {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).setSpeedMax(f);
            return this;
        }

        public Builder setSpeedMin(float f) {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).setSpeedMin(f);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((WRunPlan$RunPlan) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(WRunPlan$RunPlan.DEFAULT_INSTANCE);
        }
    }

    static {
        WRunPlan$RunPlan wRunPlan$RunPlan = new WRunPlan$RunPlan();
        DEFAULT_INSTANCE = wRunPlan$RunPlan;
        GeneratedMessageLite.registerDefaultInstance(WRunPlan$RunPlan.class, wRunPlan$RunPlan);
    }

    private WRunPlan$RunPlan() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistance() {
        this.distance_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeed() {
        this.speed_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedMax() {
        this.speedMax_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedMin() {
        this.speedMin_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static WRunPlan$RunPlan getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WRunPlan$RunPlan parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WRunPlan$RunPlan) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WRunPlan$RunPlan parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WRunPlan$RunPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WRunPlan$RunPlan> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistance(int i) {
        this.distance_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i) {
        this.duration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.index_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(float f) {
        this.speed_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedMax(float f) {
        this.speedMax_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedMin(float f) {
        this.speedMin_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = i5l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WRunPlan$RunPlan();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u000b\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u000b\u0006\u000b\u0007\u000b", new Object[]{TableInfo.Index.DEFAULT_PREFIX, "speedMin_", "speedMax_", "speed_", "type_", "distance_", "duration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WRunPlan$RunPlan> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WRunPlan$RunPlan.class) {
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

    @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
    public int getDistance() {
        return this.distance_;
    }

    @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
    public int getDuration() {
        return this.duration_;
    }

    @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
    public int getIndex() {
        return this.index_;
    }

    @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
    public float getSpeed() {
        return this.speed_;
    }

    @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
    public float getSpeedMax() {
        return this.speedMax_;
    }

    @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
    public float getSpeedMin() {
        return this.speedMin_;
    }

    @Override // com.heytap.sportwatch.proto.WRunPlan$RunPlanOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(WRunPlan$RunPlan wRunPlan$RunPlan) {
        return DEFAULT_INSTANCE.createBuilder(wRunPlan$RunPlan);
    }

    public static WRunPlan$RunPlan parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WRunPlan$RunPlan) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WRunPlan$RunPlan parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WRunPlan$RunPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WRunPlan$RunPlan parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WRunPlan$RunPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WRunPlan$RunPlan parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WRunPlan$RunPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WRunPlan$RunPlan parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WRunPlan$RunPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WRunPlan$RunPlan parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WRunPlan$RunPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WRunPlan$RunPlan parseFrom(InputStream inputStream) throws IOException {
        return (WRunPlan$RunPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WRunPlan$RunPlan parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WRunPlan$RunPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WRunPlan$RunPlan parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WRunPlan$RunPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WRunPlan$RunPlan parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WRunPlan$RunPlan) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
