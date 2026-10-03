package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u00109\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001e\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001a\u0010.\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u001a\u00101\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$R\u001a\u00104\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/ExerciseIntensityPOJO;", "", "()V", "algoExerciseLoad", "", "getAlgoExerciseLoad", "()Ljava/lang/Integer;", "setAlgoExerciseLoad", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "algoResult", "getAlgoResult", "setAlgoResult", "clientModel", "", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "dataClient", "getDataClient", "setDataClient", "exerciseIntensity", "getExerciseIntensity", "setExerciseIntensity", "flashId", "", "getFlashId", "()Ljava/lang/Long;", "setFlashId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "modifiedTimestamp", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "modifySource", "getModifySource", "setModifySource", "rawExerciseIntensity", "getRawExerciseIntensity", "setRawExerciseIntensity", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "updateTimestamp", "getUpdateTimestamp", "setUpdateTimestamp", "workoutDuration", "getWorkoutDuration", "setWorkoutDuration", "workoutType", "getWorkoutType", "()I", "setWorkoutType", "(I)V", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExerciseIntensityPOJO {

    @Nullable
    private Integer algoExerciseLoad;

    @Nullable
    private Integer algoResult;

    @Nullable
    private String clientModel;

    @Nullable
    private String dataClient;

    @Nullable
    private Integer exerciseIntensity;

    @Nullable
    private Long flashId;
    private long modifiedTimestamp;

    @Nullable
    private Integer modifySource;

    @Nullable
    private Integer rawExerciseIntensity;
    private long startTimestamp;
    private long updateTimestamp;
    private long workoutDuration;
    private int workoutType;

    @Nullable
    public final Integer getAlgoExerciseLoad() {
        return this.algoExerciseLoad;
    }

    @Nullable
    public final Integer getAlgoResult() {
        return this.algoResult;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    @Nullable
    public final Integer getExerciseIntensity() {
        return this.exerciseIntensity;
    }

    @Nullable
    public final Long getFlashId() {
        return this.flashId;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final Integer getModifySource() {
        return this.modifySource;
    }

    @Nullable
    public final Integer getRawExerciseIntensity() {
        return this.rawExerciseIntensity;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public final long getWorkoutDuration() {
        return this.workoutDuration;
    }

    public final int getWorkoutType() {
        return this.workoutType;
    }

    public final void setAlgoExerciseLoad(@Nullable Integer num) {
        this.algoExerciseLoad = num;
    }

    public final void setAlgoResult(@Nullable Integer num) {
        this.algoResult = num;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setExerciseIntensity(@Nullable Integer num) {
        this.exerciseIntensity = num;
    }

    public final void setFlashId(@Nullable Long l2) {
        this.flashId = l2;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setModifySource(@Nullable Integer num) {
        this.modifySource = num;
    }

    public final void setRawExerciseIntensity(@Nullable Integer num) {
        this.rawExerciseIntensity = num;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    public final void setWorkoutDuration(long j2) {
        this.workoutDuration = j2;
    }

    public final void setWorkoutType(int i) {
        this.workoutType = i;
    }

    @NotNull
    public String toString() {
        return "ExerciseIntensityPOJO(algoExerciseLoad=" + this.algoExerciseLoad + ", dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", startTimestamp=" + this.startTimestamp + ", workoutDuration=" + this.workoutDuration + ", workoutType=" + this.workoutType + ", exerciseIntensity=" + this.exerciseIntensity + ", rawExerciseIntensity=" + this.rawExerciseIntensity + ", algoResult=" + this.algoResult + ", flashId=" + this.flashId + ", modifySource=" + this.modifySource + ", updateTimestamp=" + this.updateTimestamp + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
