package com.heytap.store.platform.htrouter.compiler.utils;

import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import javax.annotation.processing.Messager;
import javax.tools.Diagnostic;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tJ\u001b\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/platform/htrouter/compiler/utils/Logger;", "", "msg", "Ljavax/annotation/processing/Messager;", "(Ljavax/annotation/processing/Messager;)V", "error", "", UTraceSQLiteHelperKt.COL_INFO, "", "", "formatStackTrace", "", "stackTrace", "", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)Ljava/lang/String;", "warning", "htrouter-compiler"}, k = 1, mv = {1, 1, 15})
public final class Logger {
    private Messager msg;

    public Logger(@NotNull Messager msg) {
        Intrinsics.checkParameterIsNotNull(msg, "msg");
        this.msg = msg;
    }

    private final String formatStackTrace(StackTraceElement[] stackTrace) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("    at " + stackTraceElement + '\n');
        }
        String string = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "sb.toString()");
        return string;
    }

    public final void error(@NotNull CharSequence info) {
        Intrinsics.checkParameterIsNotNull(info, "info");
        if (info.length() > 0) {
            this.msg.printMessage(Diagnostic.Kind.ERROR, "HTRouter::Compiler An exception is encountered, [" + info + ']');
        }
    }

    public final void info(@NotNull CharSequence info) {
        Intrinsics.checkParameterIsNotNull(info, "info");
        if (info.length() > 0) {
            this.msg.printMessage(Diagnostic.Kind.NOTE, Consts.PREFIX_OF_LOGGER + info);
        }
    }

    public final void warning(@NotNull CharSequence warning) {
        Intrinsics.checkParameterIsNotNull(warning, "warning");
        if (warning.length() > 0) {
            this.msg.printMessage(Diagnostic.Kind.WARNING, Consts.PREFIX_OF_LOGGER + warning);
        }
    }

    public final void error(@NotNull Throwable error) {
        Intrinsics.checkParameterIsNotNull(error, "error");
        Messager messager = this.msg;
        Diagnostic.Kind kind = Diagnostic.Kind.ERROR;
        StringBuilder sb = new StringBuilder();
        sb.append("HTRouter::Compiler An exception is encountered, [");
        sb.append(error.getMessage());
        sb.append("]\n");
        StackTraceElement[] stackTrace = error.getStackTrace();
        Intrinsics.checkExpressionValueIsNotNull(stackTrace, "error.stackTrace");
        sb.append(formatStackTrace(stackTrace));
        messager.printMessage(kind, sb.toString());
    }
}
