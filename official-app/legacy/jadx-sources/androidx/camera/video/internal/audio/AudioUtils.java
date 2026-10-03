package androidx.camera.video.internal.audio;

import android.media.AudioTimestamp;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class AudioUtils {
    private AudioUtils() {
    }

    public static int channelCountToChannelConfig(int i) {
        return i == 1 ? 16 : 12;
    }

    public static int channelCountToChannelMask(int i) {
        return i == 1 ? 16 : 12;
    }

    public static long computeInterpolatedTimeNs(int i, long j2, @NonNull AudioTimestamp audioTimestamp) {
        Preconditions.checkArgument(((long) i) > 0, "sampleRate must be greater than 0.");
        Preconditions.checkArgument(j2 >= 0, "framePosition must be no less than 0.");
        long jFrameCountToDurationNs = audioTimestamp.nanoTime + frameCountToDurationNs(j2 - audioTimestamp.framePosition, i);
        if (jFrameCountToDurationNs < 0) {
            return 0L;
        }
        return jFrameCountToDurationNs;
    }

    public static long frameCountToDurationNs(long j2, int i) {
        long j3 = i;
        Preconditions.checkArgument(j3 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j2) / j3;
    }

    public static long frameCountToSize(long j2, int i) {
        long j3 = i;
        Preconditions.checkArgument(j3 > 0, "bytesPerFrame must be greater than 0.");
        return j2 * j3;
    }

    public static int getBytesPerFrame(int i, int i2) {
        Preconditions.checkArgument(i2 > 0, "Invalid channel count: " + i2);
        if (i == 2) {
            return i2 * 2;
        }
        if (i == 3) {
            return i2;
        }
        if (i != 4) {
            if (i == 21) {
                return i2 * 3;
            }
            if (i != 22) {
                throw new IllegalArgumentException("Invalid audio encoding: " + i);
            }
        }
        return i2 * 4;
    }

    public static long sizeToFrameCount(long j2, int i) {
        long j3 = i;
        Preconditions.checkArgument(j3 > 0, "bytesPerFrame must be greater than 0.");
        return j2 / j3;
    }
}
