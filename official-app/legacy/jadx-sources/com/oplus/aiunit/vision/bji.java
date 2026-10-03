package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0003\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/bji;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", iim.a.f, "Lkotlin/Function0;", "", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", CardAction.LIFE_CIRCLE_VALUE_HIDE, "", "d", "ignore", sgm.f16582n, "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class bji {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<Boolean> hide;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> ignore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> auth;

    public bji(@NotNull String description, @NotNull Function0<Boolean> hide, @NotNull Function0<Unit> ignore, @NotNull Function0<Unit> auth) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(hide, "hide");
        Intrinsics.checkNotNullParameter(ignore, "ignore");
        Intrinsics.checkNotNullParameter(auth, "auth");
        this.description = description;
        this.hide = hide;
        this.ignore = ignore;
        this.auth = auth;
    }

    @NotNull
    public final Function0<Unit> a() {
        return this.auth;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Function0<Boolean> c() {
        return this.hide;
    }

    @NotNull
    public final Function0<Unit> d() {
        return this.ignore;
    }
}
