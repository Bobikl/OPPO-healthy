package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.lt6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class EventsProto$ExerciseUpdateListenerEvent extends GeneratedMessageLite<EventsProto$ExerciseUpdateListenerEvent, Builder> implements EventsProto$ExerciseUpdateListenerEventOrBuilder {
    public static final int AVAILABILITY_RESPONSE_FIELD_NUMBER = 3;
    private static final EventsProto$ExerciseUpdateListenerEvent DEFAULT_INSTANCE;
    public static final int EXERCISE_EXTRA_INFO_RESPONSE_FIELD_NUMBER = 2;
    public static final int EXERCISE_UPDATE_RESPONSE_FIELD_NUMBER = 1;
    public static final int LAP_SUMMARY_RESPONSE_FIELD_NUMBER = 4;
    private static volatile Parser<EventsProto$ExerciseUpdateListenerEvent> PARSER;
    private int eventCase_ = 0;
    private Object event_;

    public static final class Builder extends GeneratedMessageLite.Builder<EventsProto$ExerciseUpdateListenerEvent, Builder> implements EventsProto$ExerciseUpdateListenerEventOrBuilder {
        public Builder clearAvailabilityResponse() {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).clearAvailabilityResponse();
            return this;
        }

        public Builder clearEvent() {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).clearEvent();
            return this;
        }

        public Builder clearExerciseExtraInfoResponse() {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).clearExerciseExtraInfoResponse();
            return this;
        }

        public Builder clearExerciseUpdateResponse() {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).clearExerciseUpdateResponse();
            return this;
        }

        public Builder clearLapSummaryResponse() {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).clearLapSummaryResponse();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
        public ResponsesProto$AvailabilityResponse getAvailabilityResponse() {
            return ((EventsProto$ExerciseUpdateListenerEvent) this.instance).getAvailabilityResponse();
        }

        @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
        public EventCase getEventCase() {
            return ((EventsProto$ExerciseUpdateListenerEvent) this.instance).getEventCase();
        }

        @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
        public ResponsesProto$ExerciseExtraInfoResponse getExerciseExtraInfoResponse() {
            return ((EventsProto$ExerciseUpdateListenerEvent) this.instance).getExerciseExtraInfoResponse();
        }

        @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
        public ResponsesProto$ExerciseUpdateResponse getExerciseUpdateResponse() {
            return ((EventsProto$ExerciseUpdateListenerEvent) this.instance).getExerciseUpdateResponse();
        }

        @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
        public ResponsesProto$ExerciseLapSummaryResponse getLapSummaryResponse() {
            return ((EventsProto$ExerciseUpdateListenerEvent) this.instance).getLapSummaryResponse();
        }

        @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
        public boolean hasAvailabilityResponse() {
            return ((EventsProto$ExerciseUpdateListenerEvent) this.instance).hasAvailabilityResponse();
        }

        @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
        public boolean hasExerciseExtraInfoResponse() {
            return ((EventsProto$ExerciseUpdateListenerEvent) this.instance).hasExerciseExtraInfoResponse();
        }

        @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
        public boolean hasExerciseUpdateResponse() {
            return ((EventsProto$ExerciseUpdateListenerEvent) this.instance).hasExerciseUpdateResponse();
        }

        @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
        public boolean hasLapSummaryResponse() {
            return ((EventsProto$ExerciseUpdateListenerEvent) this.instance).hasLapSummaryResponse();
        }

        public Builder mergeAvailabilityResponse(ResponsesProto$AvailabilityResponse responsesProto$AvailabilityResponse) {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).mergeAvailabilityResponse(responsesProto$AvailabilityResponse);
            return this;
        }

        public Builder mergeExerciseExtraInfoResponse(ResponsesProto$ExerciseExtraInfoResponse responsesProto$ExerciseExtraInfoResponse) {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).mergeExerciseExtraInfoResponse(responsesProto$ExerciseExtraInfoResponse);
            return this;
        }

        public Builder mergeExerciseUpdateResponse(ResponsesProto$ExerciseUpdateResponse responsesProto$ExerciseUpdateResponse) {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).mergeExerciseUpdateResponse(responsesProto$ExerciseUpdateResponse);
            return this;
        }

        public Builder mergeLapSummaryResponse(ResponsesProto$ExerciseLapSummaryResponse responsesProto$ExerciseLapSummaryResponse) {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).mergeLapSummaryResponse(responsesProto$ExerciseLapSummaryResponse);
            return this;
        }

        public Builder setAvailabilityResponse(ResponsesProto$AvailabilityResponse responsesProto$AvailabilityResponse) {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).setAvailabilityResponse(responsesProto$AvailabilityResponse);
            return this;
        }

        public Builder setExerciseExtraInfoResponse(ResponsesProto$ExerciseExtraInfoResponse responsesProto$ExerciseExtraInfoResponse) {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).setExerciseExtraInfoResponse(responsesProto$ExerciseExtraInfoResponse);
            return this;
        }

        public Builder setExerciseUpdateResponse(ResponsesProto$ExerciseUpdateResponse responsesProto$ExerciseUpdateResponse) {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).setExerciseUpdateResponse(responsesProto$ExerciseUpdateResponse);
            return this;
        }

        public Builder setLapSummaryResponse(ResponsesProto$ExerciseLapSummaryResponse responsesProto$ExerciseLapSummaryResponse) {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).setLapSummaryResponse(responsesProto$ExerciseLapSummaryResponse);
            return this;
        }

        private Builder() {
            super(EventsProto$ExerciseUpdateListenerEvent.DEFAULT_INSTANCE);
        }

        public Builder setAvailabilityResponse(ResponsesProto$AvailabilityResponse.Builder builder) {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).setAvailabilityResponse(builder.build());
            return this;
        }

        public Builder setExerciseExtraInfoResponse(ResponsesProto$ExerciseExtraInfoResponse.Builder builder) {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).setExerciseExtraInfoResponse(builder.build());
            return this;
        }

        public Builder setExerciseUpdateResponse(ResponsesProto$ExerciseUpdateResponse.Builder builder) {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).setExerciseUpdateResponse(builder.build());
            return this;
        }

        public Builder setLapSummaryResponse(ResponsesProto$ExerciseLapSummaryResponse.Builder builder) {
            copyOnWrite();
            ((EventsProto$ExerciseUpdateListenerEvent) this.instance).setLapSummaryResponse(builder.build());
            return this;
        }
    }

    public enum EventCase {
        EXERCISE_UPDATE_RESPONSE(1),
        EXERCISE_EXTRA_INFO_RESPONSE(2),
        AVAILABILITY_RESPONSE(3),
        LAP_SUMMARY_RESPONSE(4),
        EVENT_NOT_SET(0);

        private final int value;

        EventCase(int i) {
            this.value = i;
        }

        public static EventCase forNumber(int i) {
            if (i == 0) {
                return EVENT_NOT_SET;
            }
            if (i == 1) {
                return EXERCISE_UPDATE_RESPONSE;
            }
            if (i == 2) {
                return EXERCISE_EXTRA_INFO_RESPONSE;
            }
            if (i == 3) {
                return AVAILABILITY_RESPONSE;
            }
            if (i != 4) {
                return null;
            }
            return LAP_SUMMARY_RESPONSE;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static EventCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        EventsProto$ExerciseUpdateListenerEvent eventsProto$ExerciseUpdateListenerEvent = new EventsProto$ExerciseUpdateListenerEvent();
        DEFAULT_INSTANCE = eventsProto$ExerciseUpdateListenerEvent;
        GeneratedMessageLite.registerDefaultInstance(EventsProto$ExerciseUpdateListenerEvent.class, eventsProto$ExerciseUpdateListenerEvent);
    }

    private EventsProto$ExerciseUpdateListenerEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailabilityResponse() {
        if (this.eventCase_ == 3) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.eventCase_ = 0;
        this.event_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseExtraInfoResponse() {
        if (this.eventCase_ == 2) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseUpdateResponse() {
        if (this.eventCase_ == 1) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLapSummaryResponse() {
        if (this.eventCase_ == 4) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    public static EventsProto$ExerciseUpdateListenerEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvailabilityResponse(ResponsesProto$AvailabilityResponse responsesProto$AvailabilityResponse) {
        responsesProto$AvailabilityResponse.getClass();
        if (this.eventCase_ != 3 || this.event_ == ResponsesProto$AvailabilityResponse.getDefaultInstance()) {
            this.event_ = responsesProto$AvailabilityResponse;
        } else {
            this.event_ = ResponsesProto$AvailabilityResponse.newBuilder((ResponsesProto$AvailabilityResponse) this.event_).mergeFrom(responsesProto$AvailabilityResponse).buildPartial();
        }
        this.eventCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExerciseExtraInfoResponse(ResponsesProto$ExerciseExtraInfoResponse responsesProto$ExerciseExtraInfoResponse) {
        responsesProto$ExerciseExtraInfoResponse.getClass();
        if (this.eventCase_ != 2 || this.event_ == ResponsesProto$ExerciseExtraInfoResponse.getDefaultInstance()) {
            this.event_ = responsesProto$ExerciseExtraInfoResponse;
        } else {
            this.event_ = ResponsesProto$ExerciseExtraInfoResponse.newBuilder((ResponsesProto$ExerciseExtraInfoResponse) this.event_).mergeFrom(responsesProto$ExerciseExtraInfoResponse).buildPartial();
        }
        this.eventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExerciseUpdateResponse(ResponsesProto$ExerciseUpdateResponse responsesProto$ExerciseUpdateResponse) {
        responsesProto$ExerciseUpdateResponse.getClass();
        if (this.eventCase_ != 1 || this.event_ == ResponsesProto$ExerciseUpdateResponse.getDefaultInstance()) {
            this.event_ = responsesProto$ExerciseUpdateResponse;
        } else {
            this.event_ = ResponsesProto$ExerciseUpdateResponse.newBuilder((ResponsesProto$ExerciseUpdateResponse) this.event_).mergeFrom(responsesProto$ExerciseUpdateResponse).buildPartial();
        }
        this.eventCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLapSummaryResponse(ResponsesProto$ExerciseLapSummaryResponse responsesProto$ExerciseLapSummaryResponse) {
        responsesProto$ExerciseLapSummaryResponse.getClass();
        if (this.eventCase_ != 4 || this.event_ == ResponsesProto$ExerciseLapSummaryResponse.getDefaultInstance()) {
            this.event_ = responsesProto$ExerciseLapSummaryResponse;
        } else {
            this.event_ = ResponsesProto$ExerciseLapSummaryResponse.newBuilder((ResponsesProto$ExerciseLapSummaryResponse) this.event_).mergeFrom(responsesProto$ExerciseLapSummaryResponse).buildPartial();
        }
        this.eventCase_ = 4;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EventsProto$ExerciseUpdateListenerEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EventsProto$ExerciseUpdateListenerEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventsProto$ExerciseUpdateListenerEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EventsProto$ExerciseUpdateListenerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EventsProto$ExerciseUpdateListenerEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailabilityResponse(ResponsesProto$AvailabilityResponse responsesProto$AvailabilityResponse) {
        responsesProto$AvailabilityResponse.getClass();
        this.event_ = responsesProto$AvailabilityResponse;
        this.eventCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseExtraInfoResponse(ResponsesProto$ExerciseExtraInfoResponse responsesProto$ExerciseExtraInfoResponse) {
        responsesProto$ExerciseExtraInfoResponse.getClass();
        this.event_ = responsesProto$ExerciseExtraInfoResponse;
        this.eventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseUpdateResponse(ResponsesProto$ExerciseUpdateResponse responsesProto$ExerciseUpdateResponse) {
        responsesProto$ExerciseUpdateResponse.getClass();
        this.event_ = responsesProto$ExerciseUpdateResponse;
        this.eventCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLapSummaryResponse(ResponsesProto$ExerciseLapSummaryResponse responsesProto$ExerciseLapSummaryResponse) {
        responsesProto$ExerciseLapSummaryResponse.getClass();
        this.event_ = responsesProto$ExerciseLapSummaryResponse;
        this.eventCase_ = 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = lt6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new EventsProto$ExerciseUpdateListenerEvent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"event_", "eventCase_", ResponsesProto$ExerciseUpdateResponse.class, ResponsesProto$ExerciseExtraInfoResponse.class, ResponsesProto$AvailabilityResponse.class, ResponsesProto$ExerciseLapSummaryResponse.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EventsProto$ExerciseUpdateListenerEvent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EventsProto$ExerciseUpdateListenerEvent.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
    public ResponsesProto$AvailabilityResponse getAvailabilityResponse() {
        return this.eventCase_ == 3 ? (ResponsesProto$AvailabilityResponse) this.event_ : ResponsesProto$AvailabilityResponse.getDefaultInstance();
    }

    @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
    public EventCase getEventCase() {
        return EventCase.forNumber(this.eventCase_);
    }

    @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
    public ResponsesProto$ExerciseExtraInfoResponse getExerciseExtraInfoResponse() {
        return this.eventCase_ == 2 ? (ResponsesProto$ExerciseExtraInfoResponse) this.event_ : ResponsesProto$ExerciseExtraInfoResponse.getDefaultInstance();
    }

    @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
    public ResponsesProto$ExerciseUpdateResponse getExerciseUpdateResponse() {
        return this.eventCase_ == 1 ? (ResponsesProto$ExerciseUpdateResponse) this.event_ : ResponsesProto$ExerciseUpdateResponse.getDefaultInstance();
    }

    @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
    public ResponsesProto$ExerciseLapSummaryResponse getLapSummaryResponse() {
        return this.eventCase_ == 4 ? (ResponsesProto$ExerciseLapSummaryResponse) this.event_ : ResponsesProto$ExerciseLapSummaryResponse.getDefaultInstance();
    }

    @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
    public boolean hasAvailabilityResponse() {
        return this.eventCase_ == 3;
    }

    @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
    public boolean hasExerciseExtraInfoResponse() {
        return this.eventCase_ == 2;
    }

    @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
    public boolean hasExerciseUpdateResponse() {
        return this.eventCase_ == 1;
    }

    @Override // com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEventOrBuilder
    public boolean hasLapSummaryResponse() {
        return this.eventCase_ == 4;
    }

    public static Builder newBuilder(EventsProto$ExerciseUpdateListenerEvent eventsProto$ExerciseUpdateListenerEvent) {
        return DEFAULT_INSTANCE.createBuilder(eventsProto$ExerciseUpdateListenerEvent);
    }

    public static EventsProto$ExerciseUpdateListenerEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EventsProto$ExerciseUpdateListenerEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EventsProto$ExerciseUpdateListenerEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EventsProto$ExerciseUpdateListenerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EventsProto$ExerciseUpdateListenerEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EventsProto$ExerciseUpdateListenerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EventsProto$ExerciseUpdateListenerEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EventsProto$ExerciseUpdateListenerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EventsProto$ExerciseUpdateListenerEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EventsProto$ExerciseUpdateListenerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EventsProto$ExerciseUpdateListenerEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EventsProto$ExerciseUpdateListenerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EventsProto$ExerciseUpdateListenerEvent parseFrom(InputStream inputStream) throws IOException {
        return (EventsProto$ExerciseUpdateListenerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventsProto$ExerciseUpdateListenerEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EventsProto$ExerciseUpdateListenerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EventsProto$ExerciseUpdateListenerEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EventsProto$ExerciseUpdateListenerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EventsProto$ExerciseUpdateListenerEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EventsProto$ExerciseUpdateListenerEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
