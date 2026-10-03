package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/k19;", "Lcom/oplus/aiunit/vision/pn9;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "curDeviceMac", "Lkotlin/Pair;", "", "", "b", "Lkotlin/Pair;", "()Lkotlin/Pair;", "d", "(Lkotlin/Pair;)V", "posToOnOff", "c", "()Z", "isDeviceMacEmpty", "<init>", "(Ljava/lang/String;Lkotlin/Pair;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class k19 implements pn9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String curDeviceMac;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Pair<Integer, Boolean> posToOnOff;

    public k19(@NotNull String curDeviceMac, @NotNull Pair<Integer, Boolean> posToOnOff) {
        Intrinsics.checkNotNullParameter(curDeviceMac, "curDeviceMac");
        Intrinsics.checkNotNullParameter(posToOnOff, "posToOnOff");
        this.curDeviceMac = curDeviceMac;
        this.posToOnOff = posToOnOff;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurDeviceMac() {
        return this.curDeviceMac;
    }

    @NotNull
    public final Pair<Integer, Boolean> b() {
        return this.posToOnOff;
    }

    public final boolean c() {
        return TextUtils.isEmpty(this.curDeviceMac);
    }

    public final void d(@NotNull Pair<Integer, Boolean> pair) {
        Intrinsics.checkNotNullParameter(pair, "<set-?>");
        this.posToOnOff = pair;
    }

    public /* synthetic */ k19(String str, Pair pair, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? TuplesKt.to(-1, null) : pair);
    }
}
