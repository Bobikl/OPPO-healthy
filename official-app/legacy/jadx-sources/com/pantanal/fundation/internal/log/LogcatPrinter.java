package com.pantanal.fundation.internal.log;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.EncryptConfig;
import com.oplus.aiunit.vision.PrinterConfig;
import com.oplus.aiunit.vision.pv9;
import com.oplus.utrace.sdk.ULog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0011J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\"\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/pantanal/fundation/internal/log/LogcatPrinter;", "Lcom/oplus/aiunit/vision/pv9;", "", "logLevel", "", "tag", "msg", "", "throwable", "", "doPrint", "Lcom/oplus/aiunit/vision/oue;", "logConfig", "Lcom/oplus/aiunit/vision/oue;", "getLogConfig", "()Lcom/oplus/aiunit/vision/oue;", "setLogConfig", "(Lcom/oplus/aiunit/vision/oue;)V", "<init>", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
public final class LogcatPrinter implements pv9 {

    @NotNull
    private PrinterConfig logConfig;

    public LogcatPrinter(@NotNull PrinterConfig logConfig) {
        Intrinsics.checkNotNullParameter(logConfig, "logConfig");
        this.logConfig = logConfig;
    }

    @Override // com.oplus.aiunit.vision.pv9
    public void appendCurTraceElementToNxtLine(@NotNull StringBuilder sb, int i, @Nullable StackTraceElement stackTraceElement) {
        pv9.a.a(this, sb, i, stackTraceElement);
    }

    @Override // com.oplus.aiunit.vision.pv9
    public void doPrint(int logLevel, @NotNull String tag, @NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (throwable == null) {
            ULog.println(logLevel, tag, msg);
            return;
        }
        if (logLevel == 2) {
            ULog.v(tag, msg, throwable);
            return;
        }
        if (logLevel == 3) {
            ULog.d(tag, msg, throwable);
            return;
        }
        if (logLevel == 4) {
            ULog.i(tag, msg, throwable);
            return;
        }
        if (logLevel == 5) {
            ULog.w(tag, msg, throwable);
        } else if (logLevel != 6) {
            ULog.i("olog", "log level not match.");
        } else {
            ULog.e(tag, msg, throwable);
        }
    }

    @Override // com.oplus.aiunit.vision.pv9
    @NotNull
    public String formatClassNameAndMethodName() {
        return pv9.a.c(this);
    }

    @Override // com.oplus.aiunit.vision.pv9
    @NotNull
    public String formatThreadInfo() {
        return pv9.a.d(this);
    }

    @Override // com.oplus.aiunit.vision.pv9
    @NotNull
    public String fortmatFileNameAndLineNumber() {
        return pv9.a.e(this);
    }

    @Override // com.oplus.aiunit.vision.pv9
    @NotNull
    public String genEncryptedMsgViaRsa(@NotNull String str, @Nullable EncryptConfig encryptConfig) {
        return pv9.a.f(this, str, encryptConfig);
    }

    @Override // com.oplus.aiunit.vision.pv9
    @NotNull
    public PrinterConfig getLogConfig() {
        return this.logConfig;
    }

    @NotNull
    public StringBuilder handleLongMsg(@NotNull StringBuilder sb, @NotNull PrinterConfig printerConfig) {
        return pv9.a.g(this, sb, printerConfig);
    }

    @Override // com.oplus.aiunit.vision.pv9
    @NotNull
    public StringBuilder handleLongMsgV2(@NotNull StringBuilder sb, @NotNull PrinterConfig printerConfig) {
        return pv9.a.h(this, sb, printerConfig);
    }

    @Override // com.oplus.aiunit.vision.pv9
    @NotNull
    public String handleOriginMsg(@NotNull String str, boolean z) {
        return pv9.a.j(this, str, z);
    }

    @Override // com.oplus.aiunit.vision.pv9
    @NotNull
    public String handleSensitiveMsg(@NotNull String str) {
        return pv9.a.k(this, str);
    }

    @Override // com.oplus.aiunit.vision.pv9
    @NotNull
    public String handleTag(@NotNull String str, @NotNull PrinterConfig printerConfig) {
        return pv9.a.m(this, str, printerConfig);
    }

    @Override // com.oplus.aiunit.vision.pv9
    public void println(int i, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, boolean z2, int i2, boolean z3, @Nullable Throwable th) {
        pv9.a.n(this, i, str, str2, z, str3, z2, i2, z3, th);
    }

    public void setLogConfig(@NotNull PrinterConfig printerConfig) {
        Intrinsics.checkNotNullParameter(printerConfig, "<set-?>");
        this.logConfig = printerConfig;
    }

    @Override // com.oplus.aiunit.vision.pv9
    public boolean shouldPrint(int i, @NotNull String str, @NotNull String str2) {
        return pv9.a.o(this, i, str, str2);
    }
}
