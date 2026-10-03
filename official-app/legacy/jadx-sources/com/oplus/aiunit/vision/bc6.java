package com.oplus.aiunit.vision;

import com.heytap.mcssdk.constant.MessageConstant$CommandId;
import javax.microedition.khronos.egl.EGL11;

/* JADX INFO: loaded from: classes2.dex */
public class bc6 implements EGL11 {
    public static String a(int i) {
        switch (i) {
            case MessageConstant$CommandId.COMMAND_BASE /* 12288 */:
                return "EGL_SUCCESS";
            case MessageConstant$CommandId.COMMAND_REGISTER /* 12289 */:
                return "EGL_NOT_INITIALIZED";
            case MessageConstant$CommandId.COMMAND_UNREGISTER /* 12290 */:
                return "EGL_BAD_ACCESS";
            case MessageConstant$CommandId.COMMAND_STATISTIC /* 12291 */:
                return "EGL_BAD_ALLOC";
            case MessageConstant$CommandId.COMMAND_SET_ALIAS /* 12292 */:
                return "EGL_BAD_ATTRIBUTE";
            case 12293:
                return "EGL_BAD_CONFIG";
            case 12294:
                return "EGL_BAD_CONTEXT";
            case 12295:
                return "EGL_BAD_CURRENT_SURFACE";
            case 12296:
                return "EGL_BAD_DISPLAY";
            case 12297:
                return "EGL_BAD_MATCH";
            case MessageConstant$CommandId.COMMAND_SET_PUSH_TIME /* 12298 */:
                return "EGL_BAD_NATIVE_PIXMAP";
            case MessageConstant$CommandId.COMMAND_PAUSE_PUSH /* 12299 */:
                return "EGL_BAD_NATIVE_WINDOW";
            case MessageConstant$CommandId.COMMAND_RESUME_PUSH /* 12300 */:
                return "EGL_BAD_PARAMETER";
            case 12301:
                return "EGL_BAD_SURFACE";
            case 12302:
                return "EGL_CONTEXT_LOST";
            default:
                return b(i);
        }
    }

    public static String b(int i) {
        return "0x" + Integer.toHexString(i);
    }
}
