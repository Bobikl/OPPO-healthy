package com.badlogic.gdx;

/* JADX INFO: loaded from: classes13.dex */
public interface Input {

    public enum OnscreenKeyboardType {
        Default,
        NumberPad,
        PhonePad,
        Email,
        Password,
        URI
    }

    public enum Orientation {
        Landscape,
        Portrait
    }

    public enum Peripheral {
        HardwareKeyboard,
        OnscreenKeyboard,
        MultitouchScreen,
        Accelerometer,
        Compass,
        Vibrator,
        HapticFeedback,
        Gyroscope,
        RotationVector,
        Pressure
    }

    public enum VibrationType {
        LIGHT,
        MEDIUM,
        HEAVY
    }

    boolean a();

    void b(boolean z);

    void c(int i, int i2, boolean z);

    float d();

    float e();
}
