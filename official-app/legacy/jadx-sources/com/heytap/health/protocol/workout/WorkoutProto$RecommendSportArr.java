package com.heytap.health.protocol.workout;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yzl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class WorkoutProto$RecommendSportArr extends GeneratedMessageLite<WorkoutProto$RecommendSportArr, Builder> implements WorkoutProto$RecommendSportArrOrBuilder {
    private static final WorkoutProto$RecommendSportArr DEFAULT_INSTANCE;
    private static volatile Parser<WorkoutProto$RecommendSportArr> PARSER = null;
    public static final int SPORT_FIELD_NUMBER = 1;
    private Internal.ProtobufList<WorkoutProto$RecommendSport> sport_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$RecommendSportArr, Builder> implements WorkoutProto$RecommendSportArrOrBuilder {
        public Builder addAllSport(Iterable<? extends WorkoutProto$RecommendSport> iterable) {
            copyOnWrite();
            ((WorkoutProto$RecommendSportArr) this.instance).addAllSport(iterable);
            return this;
        }

        public Builder addSport(WorkoutProto$RecommendSport workoutProto$RecommendSport) {
            copyOnWrite();
            ((WorkoutProto$RecommendSportArr) this.instance).addSport(workoutProto$RecommendSport);
            return this;
        }

        public Builder clearSport() {
            copyOnWrite();
            ((WorkoutProto$RecommendSportArr) this.instance).clearSport();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecommendSportArrOrBuilder
        public WorkoutProto$RecommendSport getSport(int i) {
            return ((WorkoutProto$RecommendSportArr) this.instance).getSport(i);
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecommendSportArrOrBuilder
        public int getSportCount() {
            return ((WorkoutProto$RecommendSportArr) this.instance).getSportCount();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$RecommendSportArrOrBuilder
        public List<WorkoutProto$RecommendSport> getSportList() {
            return Collections.unmodifiableList(((WorkoutProto$RecommendSportArr) this.instance).getSportList());
        }

        public Builder removeSport(int i) {
            copyOnWrite();
            ((WorkoutProto$RecommendSportArr) this.instance).removeSport(i);
            return this;
        }

        public Builder setSport(int i, WorkoutProto$RecommendSport workoutProto$RecommendSport) {
            copyOnWrite();
            ((WorkoutProto$RecommendSportArr) this.instance).setSport(i, workoutProto$RecommendSport);
            return this;
        }

        private Builder() {
            super(WorkoutProto$RecommendSportArr.DEFAULT_INSTANCE);
        }

        public Builder addSport(int i, WorkoutProto$RecommendSport workoutProto$RecommendSport) {
            copyOnWrite();
            ((WorkoutProto$RecommendSportArr) this.instance).addSport(i, workoutProto$RecommendSport);
            return this;
        }

        public Builder setSport(int i, WorkoutProto$RecommendSport.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$RecommendSportArr) this.instance).setSport(i, builder.build());
            return this;
        }

        public Builder addSport(WorkoutProto$RecommendSport.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$RecommendSportArr) this.instance).addSport(builder.build());
            return this;
        }

        public Builder addSport(int i, WorkoutProto$RecommendSport.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$RecommendSportArr) this.instance).addSport(i, builder.build());
            return this;
        }
    }

    static {
        WorkoutProto$RecommendSportArr workoutProto$RecommendSportArr = new WorkoutProto$RecommendSportArr();
        DEFAULT_INSTANCE = workoutProto$RecommendSportArr;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$RecommendSportArr.class, workoutProto$RecommendSportArr);
    }

    private WorkoutProto$RecommendSportArr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSport(Iterable<? extends WorkoutProto$RecommendSport> iterable) {
        ensureSportIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.sport_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSport(WorkoutProto$RecommendSport workoutProto$RecommendSport) {
        workoutProto$RecommendSport.getClass();
        ensureSportIsMutable();
        this.sport_.add(workoutProto$RecommendSport);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSport() {
        this.sport_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSportIsMutable() {
        Internal.ProtobufList<WorkoutProto$RecommendSport> protobufList = this.sport_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.sport_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static WorkoutProto$RecommendSportArr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$RecommendSportArr parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$RecommendSportArr) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$RecommendSportArr parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecommendSportArr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$RecommendSportArr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSport(int i) {
        ensureSportIsMutable();
        this.sport_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSport(int i, WorkoutProto$RecommendSport workoutProto$RecommendSport) {
        workoutProto$RecommendSport.getClass();
        ensureSportIsMutable();
        this.sport_.set(i, workoutProto$RecommendSport);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$RecommendSportArr();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sport_", WorkoutProto$RecommendSport.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$RecommendSportArr> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$RecommendSportArr.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecommendSportArrOrBuilder
    public WorkoutProto$RecommendSport getSport(int i) {
        return this.sport_.get(i);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecommendSportArrOrBuilder
    public int getSportCount() {
        return this.sport_.size();
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$RecommendSportArrOrBuilder
    public List<WorkoutProto$RecommendSport> getSportList() {
        return this.sport_;
    }

    public WorkoutProto$RecommendSportOrBuilder getSportOrBuilder(int i) {
        return this.sport_.get(i);
    }

    public List<? extends WorkoutProto$RecommendSportOrBuilder> getSportOrBuilderList() {
        return this.sport_;
    }

    public static Builder newBuilder(WorkoutProto$RecommendSportArr workoutProto$RecommendSportArr) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$RecommendSportArr);
    }

    public static WorkoutProto$RecommendSportArr parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$RecommendSportArr) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$RecommendSportArr parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecommendSportArr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$RecommendSportArr parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecommendSportArr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSport(int i, WorkoutProto$RecommendSport workoutProto$RecommendSport) {
        workoutProto$RecommendSport.getClass();
        ensureSportIsMutable();
        this.sport_.add(i, workoutProto$RecommendSport);
    }

    public static WorkoutProto$RecommendSportArr parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecommendSportArr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$RecommendSportArr parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecommendSportArr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$RecommendSportArr parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$RecommendSportArr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$RecommendSportArr parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$RecommendSportArr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$RecommendSportArr parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$RecommendSportArr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$RecommendSportArr parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$RecommendSportArr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$RecommendSportArr parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$RecommendSportArr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
