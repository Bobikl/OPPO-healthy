package android.os;

import android.annotation.SuppressLint;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NotCloseable"})
public class HapticPlayer {
    private static final String TAG = "HapticPlayer";
    DynamicEffect mEffect;

    private HapticPlayer() {
    }

    public HapticPlayer(DynamicEffect dynamicEffect) {
        this();
        Log.d(TAG, "new player");
        this.mEffect = dynamicEffect;
    }

    public static boolean isAvailable() {
        return false;
    }

    public void start(int i) {
        Log.e(TAG, "not support Haptic player api, start with loop");
    }

    public void stop() {
        Log.e(TAG, "not support Haptic player api, stop");
    }

    public void updateAmplitude(int i) {
        Log.e(TAG, "not support Haptic player api, updateAmplitude with amplitude");
    }

    public void updateFrequency(int i) {
        Log.e(TAG, "not support Haptic player api, updateFrequency with freq");
    }

    public void updateInterval(int i) {
        Log.e(TAG, "not support Haptic player api, updateInterval with interval");
    }

    public void updateParameter(int i, int i2, int i3) {
        Log.e(TAG, "not support Haptic player api, updateParameter with interval/amplitude/freq");
    }

    public void start(int i, int i2, int i3) {
        Log.e(TAG, "not support Haptic player api, start with loop & interval & amplitude");
    }

    public void start(int i, int i2, int i3, int i4) {
        Log.e(TAG, "not support Haptic player api, start with loop & interval & amplitude & freq");
    }
}
