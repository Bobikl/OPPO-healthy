package com.heytap.health.device.flexadapter;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.elf;
import com.oplus.aiunit.vision.ft6;
import com.oplus.aiunit.vision.jr7;
import com.oplus.aiunit.vision.n04;
import com.oplus.aiunit.vision.n61;
import com.oplus.aiunit.vision.skf;
import com.oplus.aiunit.vision.y15;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00000\u0004:\u0001MB\u0017\u0012\u0006\u0010J\u001a\u00020\u0007\u0012\u0006\u00104\u001a\u00028\u0001¢\u0006\u0004\bK\u0010LJ\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H&J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H$J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00028\u0000H&¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u000bH\u0017J\b\u0010\u001c\u001a\u00020\u000bH\u0017J\b\u0010\u001d\u001a\u00020\u000bH\u0017J\b\u0010\u001e\u001a\u00020\u000bH\u0017J\b\u0010 \u001a\u00020\u001fH\u0016J\u0006\u0010!\u001a\u00020\u000bJ\u000e\u0010\"\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0011J\u0006\u0010#\u001a\u00020\u000bJ\u000e\u0010$\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010&\u001a\u00020%H\u0004J\b\u0010(\u001a\u00020'H\u0004J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0011H\u0004J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0011H\u0004J,\u0010/\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00112\u001a\u0010.\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u00050-H\u0004J,\u00100\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00112\u001a\u0010.\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u00050-H\u0004R\u001a\u00104\u001a\u00028\u00018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b2\u00103R$\u0010<\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u001aR\"\u0010\u0015\u001a\u00020\u00148\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006N"}, d2 = {"Lcom/heytap/health/device/flexadapter/a;", "D", "Lcom/oplus/aiunit/vision/jr7;", "A", "", "", "O", "", "K", "Lcom/oplus/aiunit/vision/ft6;", "type", "", "n", "N", "Lcom/oplus/aiunit/vision/skf;", "Z", "toString", "", "R", "G", "Landroid/view/View;", "itemView", "Y", "M", "data", "L", "(Ljava/lang/Object;)V", "i", LogFieldKey.LEVEL_KEY, "b0", "a0", "Landroid/graphics/Rect;", "S", LogFieldKey.MESSAGE_KEY, "U", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/content/Context;", "r", "Landroidx/fragment/app/FragmentActivity;", LogFieldKey.PROCESS_NAME_KEY, "position", "c0", "J", y15.PARAMS_DATA_TYPE, "Lkotlin/Function1;", "filter", SecureGcmConstants.MESSAGE_KEY, "Q", "Lcom/oplus/aiunit/vision/jr7;", ExifInterface.LONGITUDE_EAST, "()Lcom/oplus/aiunit/vision/jr7;", "controller", "Lcom/heytap/health/device/flexadapter/a$a;", "j", "Lcom/heytap/health/device/flexadapter/a$a;", "I", "()Lcom/heytap/health/device/flexadapter/a$a;", "f0", "(Lcom/heytap/health/device/flexadapter/a$a;)V", "metadata", MapSchema.FIELD_NAME_KEY, "Ljava/lang/String;", "mTag", "activate", "Ljava/lang/Object;", UserInfo.SEX_FEMALE, "()Ljava/lang/Object;", "d0", "Landroid/view/View;", "H", "()Landroid/view/View;", "e0", "(Landroid/view/View;)V", "tag", "<init>", "(Ljava/lang/String;Lcom/oplus/aiunit/vision/jr7;)V", "a", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class a<D, A extends jr7> implements Comparable<a<?, ?>> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final A controller;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public FlexItemMetadata metadata;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final String mTag;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean activate;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public D data;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public View itemView;

    /* JADX INFO: renamed from: com.heytap.health.device.flexadapter.a$a, reason: collision with other inner class name and from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/device/flexadapter/a$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "group", "<init>", "(Ljava/lang/String;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class FlexItemMetadata {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String group;

        public FlexItemMetadata(@NotNull String group) {
            Intrinsics.checkNotNullParameter(group, "group");
            this.group = group;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getGroup() {
            return this.group;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FlexItemMetadata) && Intrinsics.areEqual(this.group, ((FlexItemMetadata) other).group);
        }

        public int hashCode() {
            return this.group.hashCode();
        }

        @NotNull
        public String toString() {
            return "FlexItemMetadata(group=" + this.group + ")";
        }
    }

    public a(@NotNull String tag, @NotNull A controller) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
        this.mTag = "tab_" + tag;
    }

    public static final void W(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m();
    }

    public static final void X(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m();
    }

    public static /* synthetic */ void o(a aVar, ft6 ft6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchEvent");
        }
        if ((i & 1) != 0) {
            ft6Var = ft6.b.INSTANCE;
        }
        aVar.n(ft6Var);
    }

    @NotNull
    public final A E() {
        return this.controller;
    }

    @Nullable
    public final D F() {
        return this.data;
    }

    public abstract int G();

    @NotNull
    public final View H() {
        View view = this.itemView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemView");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: I, reason: from getter */
    public final FlexItemMetadata getMetadata() {
        return this.metadata;
    }

    public final int J(int type) {
        return this.controller.v(type);
    }

    @NotNull
    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getMTag() {
        return this.mTag;
    }

    public abstract void L(D data);

    public abstract void M(@NotNull View itemView);

    public boolean N(@NotNull ft6 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return false;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getActivate() {
        return this.activate;
    }

    public final boolean P(int dataType, @NotNull Function1<? super a<?, ?>, Boolean> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        return this.controller.j(dataType, filter);
    }

    public final boolean Q(int dataType, @NotNull Function1<? super a<?, ?>, Boolean> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        return this.controller.x(dataType, filter);
    }

    public abstract int R();

    @NotNull
    public Rect S() {
        return new Rect();
    }

    public final void T() {
        boolean z = this instanceof elf;
        getMTag();
        A a = this.controller;
        StringBuilder sb = new StringBuilder();
        sb.append("notifyView enforceRefresh:");
        sb.append(z);
        sb.append(" controller:");
        sb.append(a);
        if (z) {
            if (J(G()) == -1) {
                i();
            }
            this.controller.m(this, false);
        } else {
            if (this.controller.p(G())) {
                return;
            }
            i();
            this.controller.m(this, false);
        }
    }

    public final void U(int type) {
        this.controller.p(type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(@NotNull View itemView) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objValueOf = this.data;
            if (objValueOf != null) {
                if (this.itemView == null) {
                    getMTag();
                    int iG = G();
                    StringBuilder sb = new StringBuilder();
                    sb.append("re onCreateView type ");
                    sb.append(iG);
                    sb.append(" itemView:");
                    sb.append(itemView);
                    Y(itemView);
                }
                getMTag();
                int iG2 = G();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onBindView type ");
                sb2.append(iG2);
                if (this instanceof n61) {
                    ((n61) this).x0(itemView, ((n61) this).E0(), ((n61) this).D0());
                }
                L(objValueOf);
            } else {
                a7b.b(getMTag(), "onBindView type " + G() + " data is null");
                objValueOf = Boolean.valueOf(itemView.post(new Runnable() { // from class: com.oplus.aiunit.vision.kr7
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.heytap.health.device.flexadapter.a.W(this.i);
                    }
                }));
            }
            objM5287constructorimpl = Result.m5287constructorimpl(objValueOf);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            a7b.b(getMTag(), "onBindView type " + G() + " fail " + thM5290exceptionOrNullimpl.getMessage());
            thM5290exceptionOrNullimpl.printStackTrace();
            itemView.post(new Runnable() { // from class: com.oplus.aiunit.vision.lr7
                @Override // java.lang.Runnable
                public final void run() {
                    com.heytap.health.device.flexadapter.a.X(this.i);
                }
            });
        }
    }

    public final void Y(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        getMTag();
        e0(itemView);
        M(itemView);
    }

    @NotNull
    public skf Z(@NotNull ft6 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return skf.b.INSTANCE;
    }

    @CallSuper
    public void a0() {
        getMTag();
    }

    @CallSuper
    public void b0() {
        getMTag();
    }

    public final void c0(int position) {
        this.controller.s(position);
    }

    public final void d0(@Nullable D d) {
        this.data = d;
    }

    public final void e0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.itemView = view;
    }

    public final void f0(@Nullable FlexItemMetadata flexItemMetadata) {
        this.metadata = flexItemMetadata;
    }

    @CallSuper
    public void i() {
        this.activate = true;
        getMTag();
    }

    @CallSuper
    public void l() {
        this.activate = false;
        getMTag();
    }

    public final void m() {
        getMTag();
        this.controller.m(this, true);
        if (this.activate) {
            l();
        }
    }

    public final void n(@NotNull ft6 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (N(type)) {
            m();
            return;
        }
        skf skfVarZ = Z(type);
        if (Intrinsics.areEqual(skfVarZ, skf.a.INSTANCE)) {
            getMTag();
        } else if (Intrinsics.areEqual(skfVarZ, skf.b.INSTANCE)) {
            T();
        } else if (Intrinsics.areEqual(skfVarZ, skf.c.INSTANCE)) {
            m();
        }
    }

    @NotNull
    public final FragmentActivity p() {
        return this.controller.getActivity();
    }

    @NotNull
    public final Context r() {
        return this.controller.getContext();
    }

    @NotNull
    public String toString() {
        String mTag = getMTag();
        int iG = G();
        FlexItemMetadata flexItemMetadata = this.metadata;
        return n04.OPEN_BRACE_REGEX + mTag + " type:" + iG + " group:" + (flexItemMetadata != null ? flexItemMetadata.getGroup() : null) + " dataNull:" + (this.data == null) + "}";
    }
}
