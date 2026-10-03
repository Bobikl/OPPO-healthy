package com.oplus.utrace.sdk;

import android.util.Log;
import com.oplus.utrace.utils.Logs;
import com.oplus.utrace.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J$\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J&\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J.\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001c\u0010\u0012\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J$\u0010\u0012\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J&\u0010\u0012\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J.\u0010\u0012\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0003J\u001c\u0010\u0014\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J$\u0010\u0014\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J&\u0010\u0014\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J.\u0010\u0014\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J,\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0007J$\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J,\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007Jª\u0001\u0010\u0019\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2K\u0010\u001a\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\n0\u001b26\u0010 \u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\n0!H\u0082\bJ\r\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$J\u001c\u0010%\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J$\u0010%\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J&\u0010%\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J.\u0010%\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001c\u0010&\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J$\u0010&\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J&\u0010&\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J.\u0010&\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001c\u0010&\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J$\u0010&\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006'"}, d2 = {"Lcom/oplus/utrace/sdk/ULog;", "", "()V", "mLogger", "Lcom/oplus/utrace/sdk/IULogger;", "getMLogger$utrace_sdk_log_logRelease", "()Lcom/oplus/utrace/sdk/IULogger;", "setMLogger$utrace_sdk_log_logRelease", "(Lcom/oplus/utrace/sdk/IULogger;)V", "d", "", "tag", "", "message", "bypassLogcat", "", "tr", "", "e", "formatMessage", "i", "println", "bufID", "priority", "msg", "processLog", "callLogger", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "logger", "tag1", "callLog", "Lkotlin/Function2;", "releaseLogger", "", "releaseLogger$utrace_sdk_log_logRelease", "v", "w", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nULog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULog.kt\ncom/oplus/utrace/sdk/ULog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n33#1,8:284\n41#1,4:293\n33#1,8:297\n41#1,4:306\n33#1,8:310\n41#1,4:319\n33#1,8:323\n41#1,4:332\n33#1,8:336\n41#1,4:345\n33#1,8:349\n41#1,4:358\n33#1,8:362\n41#1,4:371\n33#1,8:375\n41#1,4:384\n33#1,8:388\n41#1,4:397\n33#1,8:401\n41#1,4:410\n33#1,8:414\n41#1,4:423\n33#1,8:427\n41#1,4:436\n33#1,8:440\n41#1,4:449\n33#1,8:453\n41#1,4:462\n33#1,8:466\n41#1,4:475\n33#1,8:479\n41#1,4:488\n33#1,8:492\n41#1,4:501\n33#1,8:505\n41#1,4:514\n33#1,8:518\n41#1,4:527\n33#1,8:531\n41#1,4:540\n33#1,8:544\n41#1,4:553\n33#1,8:557\n41#1,4:566\n33#1,8:570\n41#1,4:579\n33#1,8:583\n41#1,4:592\n1#2:283\n1#2:292\n1#2:305\n1#2:318\n1#2:331\n1#2:344\n1#2:357\n1#2:370\n1#2:383\n1#2:396\n1#2:409\n1#2:422\n1#2:435\n1#2:448\n1#2:461\n1#2:474\n1#2:487\n1#2:500\n1#2:513\n1#2:526\n1#2:539\n1#2:552\n1#2:565\n1#2:578\n1#2:591\n*S KotlinDebug\n*F\n+ 1 ULog.kt\ncom/oplus/utrace/sdk/ULog\n*L\n49#1:284,8\n49#1:293,4\n58#1:297,8\n58#1:306,4\n67#1:310,8\n67#1:319,4\n76#1:323,8\n76#1:332,4\n85#1:336,8\n85#1:345,4\n94#1:349,8\n94#1:358,4\n103#1:362,8\n103#1:371,4\n112#1:375,8\n112#1:384,4\n121#1:388,8\n121#1:397,4\n130#1:401,8\n130#1:410,4\n139#1:414,8\n139#1:423,4\n148#1:427,8\n148#1:436,4\n157#1:440,8\n157#1:449,4\n166#1:453,8\n166#1:462,4\n175#1:466,8\n175#1:475,4\n184#1:479,8\n184#1:488,4\n193#1:492,8\n193#1:501,4\n202#1:505,8\n202#1:514,4\n211#1:518,8\n211#1:527,4\n220#1:531,8\n220#1:540,4\n229#1:544,8\n229#1:553,4\n238#1:557,8\n238#1:566,4\n247#1:570,8\n247#1:579,4\n260#1:583,8\n260#1:592,4\n49#1:292\n58#1:305\n67#1:318\n76#1:331\n85#1:344\n94#1:357\n103#1:370\n112#1:383\n121#1:396\n130#1:409\n139#1:422\n148#1:435\n157#1:448\n166#1:461\n175#1:474\n184#1:487\n193#1:500\n202#1:513\n211#1:526\n220#1:539\n229#1:552\n238#1:565\n247#1:578\n260#1:591\n*E\n"})
public final class ULog {

    @NotNull
    public static final ULog INSTANCE = new ULog();

    @Nullable
    private static volatile IULogger mLogger;

    private ULog() {
    }

    @JvmStatic
    public static final int d(@Nullable String tag, @Nullable String message) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.d(tag == null ? "" : tag, "processLog message = " + message + ", onFailure error:" + th2.getMessage());
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        if (iULogger != null) {
            iULogger.d(tag, message2);
        }
        return Log.d(tag, message2);
    }

    @JvmStatic
    public static final int e(@Nullable String tag, @Nullable String message) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.e(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null));
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        if (iULogger != null) {
            iULogger.e(tag, message2);
        }
        return Log.e(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null));
    }

    @JvmStatic
    private static final String formatMessage(String message) {
        return UtilsKt.transformLogMessage$default(message, false, 2, null);
    }

    @JvmStatic
    public static final int i(@Nullable String tag, @Nullable String message) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.i(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null));
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        if (iULogger != null) {
            iULogger.i(tag, message2);
        }
        return Log.i(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null));
    }

    @JvmStatic
    public static final int println(int bufID, int priority, @Nullable String tag, @Nullable String msg) {
        return println(priority, tag, msg);
    }

    private final int processLog(String tag, String message, boolean bypassLogcat, Function3<? super IULogger, ? super String, ? super String, Integer> callLogger, Function2<? super String, ? super String, Integer> callLog) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            callLog.invoke(tag == null ? "" : tag, "processLog message = " + message + ", onFailure error:" + th2.getMessage());
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        return !bypassLogcat ? ((Number) callLog.invoke(tag, message2)).intValue() : iULogger != null ? ((Number) callLogger.invoke(iULogger, tag, message2)).intValue() : 0;
    }

    @JvmStatic
    public static final void releaseLogger$utrace_sdk_log_logRelease() {
        IULogger iULogger = mLogger;
        mLogger = null;
        if (iULogger != null) {
            iULogger.release();
        }
    }

    @JvmStatic
    public static final int v(@Nullable String tag, @Nullable String message) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.v(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null));
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        if (iULogger != null) {
            iULogger.v(tag, message2);
        }
        return Log.v(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null));
    }

    @JvmStatic
    public static final int w(@Nullable String tag, @Nullable Throwable tr) {
        Object obj;
        String strValueOf = tr != null ? String.valueOf(tr) : null;
        try {
            Result.Companion companion = Result.Companion;
            if (strValueOf == null || StringsKt.isBlank(strValueOf)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            String str = tag == null ? "" : tag;
            th2.getMessage();
            Log.w(str, tr);
        }
        if (tag == null) {
            tag = "";
        }
        if (strValueOf == null) {
            strValueOf = "";
        }
        String message = formatMessage(strValueOf);
        IULogger iULogger = mLogger;
        if (iULogger != null) {
            iULogger.w(tag, message, tr);
        }
        return Log.w(tag, tr);
    }

    @Nullable
    public final IULogger getMLogger$utrace_sdk_log_logRelease() {
        return mLogger;
    }

    public final void setMLogger$utrace_sdk_log_logRelease(@Nullable IULogger iULogger) {
        mLogger = iULogger;
    }

    @JvmStatic
    public static final int println(int priority, @Nullable String tag, @Nullable String message) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.println(priority, tag == null ? "" : tag, Logs.INSTANCE.appendWhenDebug("processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, priority >= 4));
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        if (iULogger != null) {
            iULogger.println(priority, tag, message2);
        }
        return Log.println(priority, tag, Logs.INSTANCE.appendWhenDebug(message2, mLogger != null, priority >= 4));
    }

    @JvmStatic
    public static final int d(@Nullable String tag, @Nullable String message, boolean bypassLogcat) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.d(tag == null ? "" : tag, "processLog message = " + message + ", onFailure error:" + th2.getMessage());
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        return !bypassLogcat ? Log.d(tag, message2) : iULogger != null ? iULogger.d(tag, message2) : 0;
    }

    @JvmStatic
    public static final int e(@Nullable String tag, @Nullable String message, boolean bypassLogcat) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.e(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null));
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        int iE = iULogger != null ? iULogger.e(tag, message2) : 0;
        if (bypassLogcat) {
            return iE;
        }
        return Log.e(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null));
    }

    @JvmStatic
    public static final int i(@Nullable String tag, @Nullable String message, boolean bypassLogcat) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.i(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null));
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        int i = iULogger != null ? iULogger.i(tag, message2) : 0;
        if (bypassLogcat) {
            return i;
        }
        return Log.i(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null));
    }

    @JvmStatic
    public static final int v(@Nullable String tag, @Nullable String message, boolean bypassLogcat) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.v(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null));
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        int iV = iULogger != null ? iULogger.v(tag, message2) : 0;
        if (bypassLogcat) {
            return iV;
        }
        return Log.v(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null));
    }

    @JvmStatic
    public static final int w(@Nullable String tag, @Nullable Throwable tr, boolean bypassLogcat) {
        Object obj;
        String strValueOf = tr != null ? String.valueOf(tr) : null;
        try {
            Result.Companion companion = Result.Companion;
            if (strValueOf == null || StringsKt.isBlank(strValueOf)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            String str = tag == null ? "" : tag;
            th2.getMessage();
            Log.w(str, tr);
        }
        if (tag == null) {
            tag = "";
        }
        if (strValueOf == null) {
            strValueOf = "";
        }
        String message = formatMessage(strValueOf);
        IULogger iULogger = mLogger;
        return !bypassLogcat ? Log.w(tag, tr) : iULogger != null ? iULogger.w(tag, message, tr) : 0;
    }

    @JvmStatic
    public static final int println(int priority, @Nullable String tag, @Nullable String message, boolean bypassLogcat) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.println(priority, tag == null ? "" : tag, "processLog message = " + message + ", onFailure error:" + th2.getMessage());
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        return !bypassLogcat ? Log.println(priority, tag, message2) : iULogger != null ? iULogger.println(priority, tag, message2) : 0;
    }

    @JvmStatic
    public static final int d(@Nullable String tag, @Nullable String message, @Nullable Throwable tr) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.d(tag == null ? "" : tag, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), tr);
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        if (iULogger != null) {
            iULogger.d(tag, message2, tr);
        }
        return Log.d(tag, message2, tr);
    }

    @JvmStatic
    public static final int e(@Nullable String tag, @Nullable String message, @Nullable Throwable tr) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.e(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null), tr);
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        if (iULogger != null) {
            iULogger.e(tag, message2, tr);
        }
        return Log.e(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null), tr);
    }

    @JvmStatic
    public static final int i(@Nullable String tag, @Nullable String message, @Nullable Throwable tr) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.i(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null), tr);
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        if (iULogger != null) {
            iULogger.i(tag, message2, tr);
        }
        return Log.i(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null), tr);
    }

    @JvmStatic
    public static final int v(@Nullable String tag, @Nullable String message, @Nullable Throwable tr) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.v(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null), tr);
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        if (iULogger != null) {
            iULogger.v(tag, message2, tr);
        }
        return Log.v(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null), tr);
    }

    @JvmStatic
    public static final int w(@Nullable String tag, @Nullable String message) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.w(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null));
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        if (iULogger != null) {
            iULogger.w(tag, message2);
        }
        return Log.w(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null));
    }

    @JvmStatic
    public static final int d(@Nullable String tag, @Nullable String message, @Nullable Throwable tr, boolean bypassLogcat) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.d(tag == null ? "" : tag, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), tr);
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        return !bypassLogcat ? Log.d(tag, message2, tr) : iULogger != null ? iULogger.d(tag, message2, tr) : 0;
    }

    @JvmStatic
    public static final int e(@Nullable String tag, @Nullable String message, @Nullable Throwable tr, boolean bypassLogcat) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.e(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null), tr);
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        int iE = iULogger != null ? iULogger.e(tag, message2, tr) : 0;
        if (bypassLogcat) {
            return iE;
        }
        return Log.e(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null), tr);
    }

    @JvmStatic
    public static final int i(@Nullable String tag, @Nullable String message, @Nullable Throwable tr, boolean bypassLogcat) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.i(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null), tr);
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        int i = iULogger != null ? iULogger.i(tag, message2, tr) : 0;
        if (bypassLogcat) {
            return i;
        }
        return Log.i(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null), tr);
    }

    @JvmStatic
    public static final int v(@Nullable String tag, @Nullable String message, @Nullable Throwable tr, boolean bypassLogcat) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.v(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null), tr);
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        int iV = iULogger != null ? iULogger.v(tag, message2, tr) : 0;
        if (bypassLogcat) {
            return iV;
        }
        return Log.v(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null), tr);
    }

    @JvmStatic
    public static final int w(@Nullable String tag, @Nullable String message, boolean bypassLogcat) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.w(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null));
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        int iW = iULogger != null ? iULogger.w(tag, message2) : 0;
        if (bypassLogcat) {
            return iW;
        }
        return Log.w(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null));
    }

    @JvmStatic
    public static final int w(@Nullable String tag, @Nullable String message, @Nullable Throwable tr) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.w(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null), tr);
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        if (iULogger != null) {
            iULogger.w(tag, message2, tr);
        }
        return Log.w(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null), tr);
    }

    @JvmStatic
    public static final int w(@Nullable String tag, @Nullable String message, @Nullable Throwable tr, boolean bypassLogcat) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            if (message == null || StringsKt.isBlank(message)) {
                return 0;
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Log.w(tag == null ? "" : tag, Logs.appendWhenDebug$default(Logs.INSTANCE, "processLog message = " + message + ", onFailure error:" + th2.getMessage(), mLogger != null, false, 4, null), tr);
        }
        if (tag == null) {
            tag = "";
        }
        if (message == null) {
            message = "";
        }
        String message2 = formatMessage(message);
        IULogger iULogger = mLogger;
        int iW = iULogger != null ? iULogger.w(tag, message2, tr) : 0;
        if (bypassLogcat) {
            return iW;
        }
        return Log.w(tag, Logs.appendWhenDebug$default(Logs.INSTANCE, message2, mLogger != null, false, 4, null), tr);
    }
}
