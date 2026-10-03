package com.vfx.Silk;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class KaleidoscopeEngine {
    private static final String TAG = "KaleidoscopeEngine";
    private static Map<Integer, a> mKaleidoscopeEngineControls = new ConcurrentHashMap();

    public interface a {
        void B1(float f);

        void J4(int i, int i2);

        void X5();

        void c4();

        void g2();

        void k4(float f, float f2);

        void n0();

        void v6();
    }

    public static void onAutoDrawFinished(int i, int i2, int i3) {
        a aVar = mKaleidoscopeEngineControls.get(Integer.valueOf(i));
        if (aVar == null) {
            Log.d(TAG, "VFX-----------------find KaleidoscopeEngineControl with vfxID: " + i + ", when onAutoDrawFinished");
            return;
        }
        Log.d(TAG, "VFX-----------------onAutoDrawFinished--------------------, vfxID: " + i + ", start: " + Integer.toHexString(i2) + ", end: " + Integer.toHexString(i3));
        aVar.J4(i2, i3);
    }

    public static void onIntroFinished(int i) {
        a aVar = mKaleidoscopeEngineControls.get(Integer.valueOf(i));
        if (aVar != null) {
            Log.d(TAG, "VFX-----------------onIntroFinished--------------------, vfxID: " + i);
            aVar.v6();
            return;
        }
        Log.d(TAG, "VFX-----------------find KaleidoscopeEngineControl with vfxID: " + i + ", when onIntroFinished");
    }

    public static void onPlaybackFinished(int i) {
        a aVar = mKaleidoscopeEngineControls.get(Integer.valueOf(i));
        if (aVar != null) {
            Log.d(TAG, "VFX-----------------onPlaybackFinished--------------------, vfxID: " + i);
            aVar.g2();
            return;
        }
        Log.d(TAG, "VFX-----------------find KaleidoscopeEngineControl with vfxID: " + i + ", when onPlaybackFinished");
    }

    public static void onPlaybackParsed(int i, float f) {
        a aVar = mKaleidoscopeEngineControls.get(Integer.valueOf(i));
        if (aVar == null) {
            Log.d(TAG, "VFX-----------------find KaleidoscopeEngineControl with vfxID: " + i + ", when onPlaybackParsed");
            return;
        }
        Log.d(TAG, "VFX-----------------onPlaybackParsed--------------------, vfxID: " + i + ", ratio: " + f);
        aVar.B1(f);
    }

    public static void onPlaybackStarted(int i, float f, float f2, int i2) {
        a aVar = mKaleidoscopeEngineControls.get(Integer.valueOf(i));
        if (aVar == null) {
            Log.d(TAG, "VFX-----------------find KaleidoscopeEngineControl with vfxID: " + i + ", when onPlaybackStarted");
            return;
        }
        Log.d(TAG, "VFX-----------------onPlaybackStarted--------------------, vfxID: " + i + ", time: " + f + ", ratio: " + f2 + ", frames: " + i2);
        aVar.k4(f, f2);
    }

    public static void onSceneCreated(int i) {
        a aVar = mKaleidoscopeEngineControls.get(Integer.valueOf(i));
        if (aVar != null) {
            Log.d(TAG, "VFX-----------------onSceneCreated--------------------, vfxID: " + i);
            aVar.X5();
            return;
        }
        Log.d(TAG, "VFX-----------------find KaleidoscopeEngineControl with vfxID: " + i + ", when onSceneCreated");
    }

    public static void onSilkBegin(int i) {
        a aVar = mKaleidoscopeEngineControls.get(Integer.valueOf(i));
        if (aVar != null) {
            Log.d(TAG, "VFX-----------------onSilkBegin--------------------, vfxID: " + i);
            aVar.c4();
            return;
        }
        Log.d(TAG, "VFX-----------------find KaleidoscopeEngineControl with vfxID: " + i + ", when onSilkBegin");
    }

    public static void onSilkCompleted(int i) {
        a aVar = mKaleidoscopeEngineControls.get(Integer.valueOf(i));
        if (aVar != null) {
            Log.d(TAG, "VFX-----------------onSilkCompleted--------------------, vfxID: " + i);
            aVar.n0();
            return;
        }
        Log.d(TAG, "VFX-----------------find KaleidoscopeEngineControl with vfxID: " + i + ", when onSilkCompleted");
    }

    public void KaleidoscopeEngine() {
    }

    public void addEngineControlListener(int i, a aVar) {
        if (aVar != null) {
            Log.d(TAG, "VFX-----------------addEngineControlListener--------------------vfxID: " + i);
            mKaleidoscopeEngineControls.put(Integer.valueOf(i), aVar);
            return;
        }
        Log.d(TAG, "VFX-----------------addEngineControlListener failed--------------------vfxID: " + i + " is null");
    }

    public void removeEngineControlListener(int i) {
        Log.d(TAG, "VFX-----------------removeEngineControlListener--------------------vfxID: " + i);
        mKaleidoscopeEngineControls.remove(Integer.valueOf(i));
    }
}
