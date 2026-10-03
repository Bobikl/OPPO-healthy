package com.oplus.aiunit.vision;

import com.heytap.health.protocol.workout.WorkoutProto$VoicePackDataItem;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b3l {
    public boolean a(@NotNull WorkoutProto$VoicePackDataItem workoutProto$VoicePackDataItem) {
        String voicePackName = workoutProto$VoicePackDataItem.getVoicePackName();
        int version = workoutProto$VoicePackDataItem.getVersion();
        if (voicePackName.isEmpty() || version <= 0) {
            return false;
        }
        File fileG = n2l.g(b78.a());
        return fileG.isDirectory() && a3l.b(fileG, voicePackName, version) != null;
    }
}
