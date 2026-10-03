package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\r\u0010\n\u0012\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0010\u0010\n\u0012\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0012\u0010\n\u0012\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0014\u0010\n\u0012\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\bR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\bR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\bR\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\bR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\bR\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\bR\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\bR\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\b¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/e04;", "", "", "errorType", "", "errorMsg", "a", "TAG", "Ljava/lang/String;", "ORIEN_DEFAULT", "I", "ORIEN_PORTRAIT", "ORIEN_LANDSCAPE", "VIDEO_MODE_SPLIT_HORIZONTAL", "VIDEO_MODE_SPLIT_HORIZONTAL$annotations", "()V", "VIDEO_MODE_SPLIT_VERTICAL", "VIDEO_MODE_SPLIT_VERTICAL$annotations", "VIDEO_MODE_SPLIT_HORIZONTAL_REVERSE", "VIDEO_MODE_SPLIT_HORIZONTAL_REVERSE$annotations", "VIDEO_MODE_SPLIT_VERTICAL_REVERSE", "VIDEO_MODE_SPLIT_VERTICAL_REVERSE$annotations", "OK", "REPORT_ERROR_TYPE_EXTRACTOR_EXC", "REPORT_ERROR_TYPE_DECODE_EXC", "REPORT_ERROR_TYPE_CREATE_THREAD", "REPORT_ERROR_TYPE_CREATE_RENDER", "REPORT_ERROR_TYPE_PARSE_CONFIG", "REPORT_ERROR_TYPE_CONFIG_PLUGIN_MIX", "REPORT_ERROR_TYPE_FILE_ERROR", "REPORT_ERROR_TYPE_HEVC_NOT_SUPPORT", "ERROR_MSG_EXTRACTOR_EXC", "ERROR_MSG_DECODE_EXC", "ERROR_MSG_CREATE_THREAD", "ERROR_MSG_CREATE_RENDER", "ERROR_MSG_PARSE_CONFIG", "ERROR_MSG_CONFIG_PLUGIN_MIX", "ERROR_MSG_FILE_ERROR", "ERROR_MSG_HEVC_NOT_SUPPORT", "<init>", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class e04 {

    @NotNull
    public static final String ERROR_MSG_CONFIG_PLUGIN_MIX = "0x6 vapx fail";

    @NotNull
    public static final String ERROR_MSG_CREATE_RENDER = "0x4 render create fail";

    @NotNull
    public static final String ERROR_MSG_CREATE_THREAD = "0x3 thread create fail";

    @NotNull
    public static final String ERROR_MSG_DECODE_EXC = "0x2 MediaCodec exception";

    @NotNull
    public static final String ERROR_MSG_EXTRACTOR_EXC = "0x1 MediaExtractor exception";

    @NotNull
    public static final String ERROR_MSG_FILE_ERROR = "0x7 file can't read";

    @NotNull
    public static final String ERROR_MSG_HEVC_NOT_SUPPORT = "0x8 hevc not support";

    @NotNull
    public static final String ERROR_MSG_PARSE_CONFIG = "0x5 parse config fail";
    public static final e04 INSTANCE = new e04();
    public static final int OK = 0;
    public static final int ORIEN_DEFAULT = 0;
    public static final int ORIEN_LANDSCAPE = 2;
    public static final int ORIEN_PORTRAIT = 1;
    public static final int REPORT_ERROR_TYPE_CONFIG_PLUGIN_MIX = 10006;
    public static final int REPORT_ERROR_TYPE_CREATE_RENDER = 10004;
    public static final int REPORT_ERROR_TYPE_CREATE_THREAD = 10003;
    public static final int REPORT_ERROR_TYPE_DECODE_EXC = 10002;
    public static final int REPORT_ERROR_TYPE_EXTRACTOR_EXC = 10001;
    public static final int REPORT_ERROR_TYPE_FILE_ERROR = 10007;
    public static final int REPORT_ERROR_TYPE_HEVC_NOT_SUPPORT = 10008;
    public static final int REPORT_ERROR_TYPE_PARSE_CONFIG = 10005;

    @NotNull
    public static final String TAG = "AnimPlayer";
    public static final int VIDEO_MODE_SPLIT_HORIZONTAL = 1;
    public static final int VIDEO_MODE_SPLIT_HORIZONTAL_REVERSE = 3;
    public static final int VIDEO_MODE_SPLIT_VERTICAL = 2;
    public static final int VIDEO_MODE_SPLIT_VERTICAL_REVERSE = 4;

    public static /* synthetic */ String b(e04 e04Var, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return e04Var.a(i, str);
    }

    @NotNull
    public final String a(int errorType, @Nullable String errorMsg) {
        String str;
        StringBuilder sb = new StringBuilder();
        switch (errorType) {
            case 10001:
                str = ERROR_MSG_EXTRACTOR_EXC;
                break;
            case 10002:
                str = ERROR_MSG_DECODE_EXC;
                break;
            case 10003:
                str = ERROR_MSG_CREATE_THREAD;
                break;
            case 10004:
                str = ERROR_MSG_CREATE_RENDER;
                break;
            case 10005:
                str = ERROR_MSG_PARSE_CONFIG;
                break;
            case 10006:
                str = ERROR_MSG_CONFIG_PLUGIN_MIX;
                break;
            default:
                str = "unknown";
                break;
        }
        sb.append(str);
        sb.append(StringUtil.SPACE);
        if (errorMsg == null) {
            errorMsg = "";
        }
        sb.append(errorMsg);
        return sb.toString();
    }
}
