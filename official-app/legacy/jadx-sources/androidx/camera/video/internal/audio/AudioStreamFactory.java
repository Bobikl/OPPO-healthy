package androidx.camera.video.internal.audio;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
interface AudioStreamFactory {
    @NonNull
    AudioStream create(@NonNull AudioSettings audioSettings, @Nullable Context context) throws AudioStream.AudioStreamException;
}
