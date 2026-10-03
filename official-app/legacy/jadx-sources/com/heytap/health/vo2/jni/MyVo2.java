package com.heytap.health.vo2.jni;

import androidx.annotation.Keep;
import com.heytap.health.vo2.para.Input;
import com.heytap.health.vo2.para.Output;
import com.heytap.health.vo2.para.UserInfo;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class MyVo2 {
    static {
        System.loadLibrary("myVo2");
    }

    public static native short claclVo2max(int i, Input input);

    public static native short getOppoVo2max(int i, boolean z, UserInfo userInfo, Input input, Output output);

    public static native short getVo2max(float[] fArr);

    public static native short initLog(Vo2LogListener vo2LogListener);

    public static native short myCalcuVo2max(int i, Input input);

    public static native short myGetVo2max(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5);

    public static native short myUserInit(UserInfo userInfo);

    public static native void recycleGlobalRef();

    public static native short userInit(UserInfo userInfo);
}
