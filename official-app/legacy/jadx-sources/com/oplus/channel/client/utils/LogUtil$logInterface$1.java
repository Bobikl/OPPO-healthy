package com.oplus.channel.client.utils;

import android.util.Log;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\r"}, d2 = {"com/oplus/channel/client/utils/LogUtil$logInterface$1", "Lcom/oplus/channel/client/utils/LogInterface;", "d", "", "tag", "", "msg", "th", "", MapSchema.FIELD_NAME_ENTRY, "i", "v", "w", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LogUtil$logInterface$1 implements LogInterface {
    @Override // com.oplus.channel.client.utils.LogInterface
    public void d(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (LogUtil.debuggable) {
            Log.d(Intrinsics.stringPlus(LogUtil.head, tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + msg);
        }
    }

    @Override // com.oplus.channel.client.utils.LogInterface
    public void e(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!LogUtil.debuggable) {
            Log.e(Intrinsics.stringPlus(LogUtil.head, tag), msg);
            return;
        }
        Log.e(Intrinsics.stringPlus(LogUtil.head, tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + msg);
    }

    @Override // com.oplus.channel.client.utils.LogInterface
    public void i(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!LogUtil.debuggable) {
            Log.i(Intrinsics.stringPlus(LogUtil.head, tag), msg);
            return;
        }
        Log.i(Intrinsics.stringPlus(LogUtil.head, tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + msg);
    }

    @Override // com.oplus.channel.client.utils.LogInterface
    public void v(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (LogUtil.debuggable) {
            Log.v(Intrinsics.stringPlus(LogUtil.head, tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + msg);
        }
    }

    @Override // com.oplus.channel.client.utils.LogInterface
    public void w(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!LogUtil.debuggable) {
            Log.w(Intrinsics.stringPlus(LogUtil.head, tag), msg);
            return;
        }
        Log.w(Intrinsics.stringPlus(LogUtil.head, tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + msg);
    }

    @Override // com.oplus.channel.client.utils.LogInterface
    public void d(@Nullable String tag, @NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (LogUtil.debuggable) {
            String strStringPlus = Intrinsics.stringPlus(" exception:", th == null ? "" : th.getMessage());
            Log.d(Intrinsics.stringPlus(LogUtil.head, tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + msg + strStringPlus);
        }
    }

    @Override // com.oplus.channel.client.utils.LogInterface
    public void v(@Nullable String tag, @NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (LogUtil.debuggable) {
            String strStringPlus = Intrinsics.stringPlus(" exception:", th == null ? "" : th.getMessage());
            Log.v(Intrinsics.stringPlus(LogUtil.head, tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + msg + strStringPlus);
        }
    }

    @Override // com.oplus.channel.client.utils.LogInterface
    public void e(@Nullable String tag, @NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        String strStringPlus = Intrinsics.stringPlus(" exception:", th == null ? "" : th.getMessage());
        if (LogUtil.debuggable) {
            Log.e(Intrinsics.stringPlus(LogUtil.head, tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + msg + strStringPlus);
            return;
        }
        Log.e(Intrinsics.stringPlus(LogUtil.head, tag), Intrinsics.stringPlus(msg, strStringPlus));
    }

    @Override // com.oplus.channel.client.utils.LogInterface
    public void i(@Nullable String tag, @NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        String strStringPlus = Intrinsics.stringPlus(" exception:", th == null ? "" : th.getMessage());
        if (LogUtil.debuggable) {
            Log.i(Intrinsics.stringPlus(LogUtil.head, tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + msg + strStringPlus);
            return;
        }
        Log.i(Intrinsics.stringPlus(LogUtil.head, tag), Intrinsics.stringPlus(msg, strStringPlus));
    }

    @Override // com.oplus.channel.client.utils.LogInterface
    public void w(@Nullable String tag, @NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        String strStringPlus = Intrinsics.stringPlus(" exception:", th == null ? "" : th.getMessage());
        if (LogUtil.debuggable) {
            Log.w(Intrinsics.stringPlus(LogUtil.head, tag), '(' + ((Object) Thread.currentThread().getName()) + ')' + msg + strStringPlus);
            return;
        }
        Log.w(Intrinsics.stringPlus(LogUtil.head, tag), Intrinsics.stringPlus(msg, strStringPlus));
    }
}
