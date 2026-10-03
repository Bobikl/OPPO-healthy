package com.oplus.aiunit.vision;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.oplus.channel.server.IUserContext;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000fB\u0019\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/r6e;", "", "Landroid/content/BroadcastReceiver;", "receiver", "Landroid/content/IntentFilter;", "intentFilter", "", MapSchema.FIELD_NAME_ENTRY, "", "serviceName", "b", "", "d", "()Ljava/lang/Integer;", "Lcom/oplus/channel/server/IUserContext;", "a", "Lcom/oplus/channel/server/IUserContext;", "c", "()Lcom/oplus/channel/server/IUserContext;", "setUserContext", "(Lcom/oplus/channel/server/IUserContext;)V", "userContext", "Landroid/content/Context;", "Landroid/content/Context;", "()Landroid/content/Context;", "setCommonContext", "(Landroid/content/Context;)V", "commonContext", "<init>", "(Lcom/oplus/channel/server/IUserContext;Landroid/content/Context;)V", "Companion", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
public final class r6e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public IUserContext userContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Context commonContext;

    public r6e(@Nullable IUserContext iUserContext, @NotNull Context commonContext) {
        Intrinsics.checkNotNullParameter(commonContext, "commonContext");
        this.userContext = iUserContext;
        this.commonContext = commonContext;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Context getCommonContext() {
        return this.commonContext;
    }

    @Nullable
    public final Object b(@NotNull String serviceName) {
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        return this.commonContext.getSystemService(serviceName);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final IUserContext getUserContext() {
        return this.userContext;
    }

    @Nullable
    public final Integer d() {
        IUserContext iUserContext = this.userContext;
        if (iUserContext != null) {
            return Integer.valueOf(iUserContext.getUserId());
        }
        return null;
    }

    public final void e(@NotNull BroadcastReceiver receiver, @NotNull IntentFilter intentFilter) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(intentFilter, "intentFilter");
        String str = "registerReceiver pkgName:" + this.commonContext.getPackageName();
        if (this.userContext == null) {
            bs9.a.c(t6e.INSTANCE, "PantaContextProxy", str + ", common context", false, null, false, 0, false, null, 252, null);
            this.commonContext.registerReceiver(receiver, intentFilter);
            return;
        }
        bs9.a.c(t6e.INSTANCE, "PantaContextProxy", str + ", userContext userId:" + d(), false, null, false, 0, false, null, 252, null);
        IUserContext iUserContext = this.userContext;
        if (iUserContext != null) {
            iUserContext.registerReceiver(receiver, intentFilter);
        }
    }
}
