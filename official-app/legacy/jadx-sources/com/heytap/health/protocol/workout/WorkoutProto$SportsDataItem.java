package com.heytap.health.protocol.workout;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yzl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class WorkoutProto$SportsDataItem extends GeneratedMessageLite<WorkoutProto$SportsDataItem, Builder> implements WorkoutProto$SportsDataItemOrBuilder {
    private static final WorkoutProto$SportsDataItem DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<WorkoutProto$SportsDataItem> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String name_ = "";
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$SportsDataItem, Builder> implements WorkoutProto$SportsDataItemOrBuilder {
        public Builder clearName() {
            copyOnWrite();
            ((WorkoutProto$SportsDataItem) this.instance).clearName();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((WorkoutProto$SportsDataItem) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsDataItemOrBuilder
        public String getName() {
            return ((WorkoutProto$SportsDataItem) this.instance).getName();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsDataItemOrBuilder
        public ByteString getNameBytes() {
            return ((WorkoutProto$SportsDataItem) this.instance).getNameBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsDataItemOrBuilder
        public int getType() {
            return ((WorkoutProto$SportsDataItem) this.instance).getType();
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((WorkoutProto$SportsDataItem) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$SportsDataItem) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((WorkoutProto$SportsDataItem) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$SportsDataItem.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$SportsDataItem workoutProto$SportsDataItem = new WorkoutProto$SportsDataItem();
        DEFAULT_INSTANCE = workoutProto$SportsDataItem;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$SportsDataItem.class, workoutProto$SportsDataItem);
    }

    private WorkoutProto$SportsDataItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static WorkoutProto$SportsDataItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$SportsDataItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$SportsDataItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$SportsDataItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$SportsDataItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$SportsDataItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"type_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$SportsDataItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$SportsDataItem.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsDataItemOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsDataItemOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsDataItemOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$SportsDataItem);
    }

    public static WorkoutProto$SportsDataItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$SportsDataItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$SportsDataItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$SportsDataItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$SportsDataItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$SportsDataItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$SportsDataItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$SportsDataItem parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$SportsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$SportsDataItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$SportsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$SportsDataItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$SportsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$SportsDataItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$SportsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
