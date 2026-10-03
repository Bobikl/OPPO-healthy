package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class RecordingStats {
    @NonNull
    public static RecordingStats of(long j2, long j3, @NonNull AudioStats audioStats) {
        Preconditions.checkArgument(j2 >= 0, "duration must be positive value.");
        Preconditions.checkArgument(j3 >= 0, "bytes must be positive value.");
        return new AutoValue_RecordingStats(j2, j3, audioStats);
    }

    @NonNull
    public abstract AudioStats getAudioStats();

    public abstract long getNumBytesRecorded();

    public abstract long getRecordedDurationNanos();
}
