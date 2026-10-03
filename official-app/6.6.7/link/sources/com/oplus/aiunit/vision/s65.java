package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.airbnb.lottie.LottieAnimationView;
import com.oplus.pay.opensdk.web.R$id;
import com.oplus.pay.opensdk.web.R$layout;
import com.oplus.pay.opensdk.web.R$string;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.web.container.webview.core.WebContainerFragment;
import com.oplus.web.container.webview.core.WebContainerLifecycleObserver;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\r)B\u000f\u0012\u0006\u0010'\u001a\u00020%¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013J\u0012\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0002J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020\u0002H\u0002R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u00106R\u0016\u0010:\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u00106R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010?R\u0016\u0010B\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010DR\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010FR\u0016\u0010I\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0016\u0010K\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010F¨\u0006N"}, d2 = {"Lcom/oplus/aiunit/vision/s65;", "Lcom/oplus/aiunit/vision/wz9;", "", "onPageStarted", "onPageFinished", "", ParserTag.TAG_PROGRESS, "onProgressChanged", "errorCode", "", qmm.a.f, "", "isMainFrame", "a", "Landroid/view/ViewGroup;", "layer", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "g", "outState", "onSaveInstanceState", WebContainerLifecycleObserver.JS_FUNCTION_ON_RESUME, "onPause", "onDestroy", "show", "l", "k", "m", "Lcom/airbnb/lottie/LottieAnimationView;", "animView", "", "jsonImg", "i", "j", "Lcom/oplus/web/container/webview/core/WebContainerFragment;", "Lcom/oplus/web/container/webview/core/WebContainerFragment;", "fragment", "Landroid/view/View;", "b", "Landroid/view/View;", "mLoadingView", "c", "mErrorView", "d", "Landroid/view/ViewGroup;", "mLayer", "e", "Lcom/airbnb/lottie/LottieAnimationView;", "mAnimView", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "mTitle", "mDesc", "h", "mClick", "Lcom/oplus/aiunit/vision/s65$b;", "Lcom/oplus/aiunit/vision/s65$b;", "mDelayShowErrorRunnable", "Lcom/oplus/aiunit/vision/s65$a;", "Lcom/oplus/aiunit/vision/s65$a;", "mDelayHideLoadingRunnable", "I", "mStatus", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Z", "mIsViewCreated", "n", "mPageStarted", "o", "mIsLoadingHideScheduled", "<init>", "(Lcom/oplus/web/container/webview/core/WebContainerFragment;)V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class s65 implements wz9 {

    @NotNull
    public final WebContainerFragment a;
    public View b;
    public View c;
    public ViewGroup d;
    public LottieAnimationView e;
    public TextView f;
    public TextView g;
    public TextView h;

    @NotNull
    public final b i;

    @NotNull
    public final a j;
    public int k;

    @NotNull
    public final Handler l;
    public boolean m;
    public boolean n;
    public boolean o;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/s65$a;", "Ljava/lang/Runnable;", "", "run", "Ljava/lang/ref/SoftReference;", "Lcom/oplus/aiunit/vision/s65;", "i", "Ljava/lang/ref/SoftReference;", "adapter", "<init>", "(Ljava/lang/ref/SoftReference;)V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Runnable {

        @NotNull
        public final SoftReference<s65> i;

        public a(@NotNull SoftReference<s65> softReference) {
            Intrinsics.checkNotNullParameter(softReference, "adapter");
            this.i = softReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            s65 s65Var = this.i.get();
            if (s65Var != null) {
                s65Var.l(false);
                s65Var.o = false;
                hrl.a("DefaultStateViewAdapter - delay hide loading done");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/s65$b;", "Ljava/lang/Runnable;", "", "run", "Ljava/lang/ref/SoftReference;", "Lcom/oplus/aiunit/vision/s65;", "i", "Ljava/lang/ref/SoftReference;", "adapter", "<init>", "(Ljava/lang/ref/SoftReference;)V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements Runnable {

        @NotNull
        public final SoftReference<s65> i;

        public b(@NotNull SoftReference<s65> softReference) {
            Intrinsics.checkNotNullParameter(softReference, "adapter");
            this.i = softReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            s65 s65Var = this.i.get();
            if (s65Var != null) {
                s65Var.k = 4;
                s65Var.k(true);
                s65Var.l(false);
            }
        }
    }

    public s65(@NotNull WebContainerFragment webContainerFragment) {
        Intrinsics.checkNotNullParameter(webContainerFragment, "fragment");
        this.a = webContainerFragment;
        this.i = new b(new SoftReference(this));
        this.j = new a(new SoftReference(this));
        this.l = new Handler(Looper.getMainLooper());
    }

    @SensorsDataInstrumented
    public static final void h(s65 s65Var, View view) {
        Intrinsics.checkNotNullParameter(s65Var, "this$0");
        s65Var.j();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @Override // com.oplus.aiunit.vision.wz9
    public void a(int errorCode, @NotNull CharSequence description, boolean isMainFrame) {
        Intrinsics.checkNotNullParameter(description, qmm.a.f);
        this.o = false;
        if (isMainFrame) {
            this.k = 3;
            this.l.removeCallbacks(this.i);
            this.l.removeCallbacks(this.j);
            k(true);
            l(false);
        }
        hrl.e("isMainFrame:" + isMainFrame + ", errorCode:" + errorCode + ", description:" + ((Object) description));
    }

    public final boolean g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public final void i(LottieAnimationView animView, String jsonImg) {
        animView.setAnimation(jsonImg);
        animView.loop(false);
        animView.playAnimation();
    }

    public final void j() {
        this.k = 1;
        this.l.removeCallbacks(this.j);
        this.o = false;
        l(true);
        k(false);
        this.a.getWebView().reload();
    }

    public final void k(boolean show) {
        if (this.m) {
            View view = null;
            if (!show) {
                View view2 = this.c;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mErrorView");
                    view2 = null;
                }
                view2.setVisibility(8);
                View view3 = this.e;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAnimView");
                } else {
                    view = view3;
                }
                view.setVisibility(8);
                return;
            }
            View view4 = this.c;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mErrorView");
                view4 = null;
            }
            view4.setVisibility(0);
            Context contextRequireContext = this.a.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "this.fragment.requireContext()");
            if (!noc.a(contextRequireContext)) {
                m();
                return;
            }
            View view5 = this.e;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAnimView");
            } else {
                view = view5;
            }
            view.setVisibility(0);
            Context contextRequireContext2 = this.a.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "fragment.requireContext()");
            if (g(contextRequireContext2)) {
                i(view, "anim/loading_dark.json");
            } else {
                i(view, "anim/loading_light.json");
            }
        }
    }

    public final void l(boolean show) {
        if (this.m) {
            View view = this.b;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
                view = null;
            }
            view.setVisibility(show ? 0 : 8);
            StringBuilder sb = new StringBuilder();
            sb.append("DefaultStateViewAdapter - Loading视图状态：");
            sb.append(show ? "显示" : "隐藏");
            hrl.a(sb.toString());
        }
    }

    public final void m() {
        View view = this.e;
        TextView textView = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAnimView");
            view = null;
        }
        view.setVisibility(0);
        Context contextRequireContext = this.a.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "fragment.requireContext()");
        if (g(contextRequireContext)) {
            i(view, "anim/opay_network_error_night.json");
        } else {
            i(view, "anim/opay_network_error.json");
        }
        TextView textView2 = this.f;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitle");
            textView2 = null;
        }
        textView2.setText(this.a.requireContext().getString(R$string.pay_sdk_web_web_no_network_title));
        TextView textView3 = this.g;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDesc");
        } else {
            textView = textView3;
        }
        textView.setText(this.a.requireContext().getString(R$string.pay_sdk_web_web_no_network_desc));
    }

    @Override // com.oplus.aiunit.vision.wz9
    public void onCreate(@NotNull ViewGroup layer, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        this.d = layer;
        View viewInflate = LayoutInflater.from(layer.getContext()).inflate(R$layout.default_pay_sdk_status_layout, layer, false);
        View viewFindViewById = viewInflate.findViewById(R$id.default_status_loading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "root.findViewById(R.id.default_status_loading)");
        this.b = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R$id.default_status_error);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "root.findViewById(R.id.default_status_error)");
        this.c = viewFindViewById2;
        LottieAnimationView lottieAnimationViewFindViewById = viewInflate.findViewById(R$id.opay_paysub_abnormal_animview);
        Intrinsics.checkNotNullExpressionValue(lottieAnimationViewFindViewById, "root.findViewById(R.id.o…paysub_abnormal_animview)");
        this.e = lottieAnimationViewFindViewById;
        View viewFindViewById3 = viewInflate.findViewById(R$id.opay_paysub_abnormal_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "root.findViewById(R.id.opay_paysub_abnormal_title)");
        this.f = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R$id.opay_paysub_abnormal_desc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "root.findViewById(R.id.opay_paysub_abnormal_desc)");
        this.g = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R$id.opay_paysub_abnormal_operate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "root.findViewById(R.id.o…_paysub_abnormal_operate)");
        TextView textView = (TextView) viewFindViewById5;
        this.h = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mClick");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.r65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s65.h(this.i, view);
            }
        });
        l(false);
        k(false);
        layer.addView(viewInflate);
        this.m = true;
        if (this.n) {
            return;
        }
        l(true);
    }

    @Override // com.oplus.aiunit.vision.wz9
    public void onDestroy() {
        this.l.removeCallbacks(this.i);
        this.l.removeCallbacks(this.j);
        this.o = false;
        this.m = false;
        ViewGroup viewGroup = this.d;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayer");
            viewGroup = null;
        }
        viewGroup.removeAllViews();
    }

    @Override // com.oplus.aiunit.vision.wz9
    public void onPageFinished() {
        if (this.k == 3) {
            hrl.h("STATUS_ERROR return");
            return;
        }
        this.k = 2;
        hrl.a("onPageFinished");
        this.l.removeCallbacks(this.i);
        k(false);
        if (!this.o) {
            this.o = true;
            this.l.postDelayed(this.j, 600L);
            hrl.a("DefaultStateViewAdapter - delay loading：600ms");
        }
        this.n = false;
    }

    @Override // com.oplus.aiunit.vision.wz9
    public void onPageStarted() {
        this.n = true;
        this.k = 1;
        this.l.removeCallbacks(this.i);
        this.l.removeCallbacks(this.j);
        this.o = false;
        this.l.postDelayed(this.i, 30000L);
        l(true);
        k(false);
    }

    @Override // com.oplus.aiunit.vision.wz9
    public void onPause() {
        this.l.removeCallbacks(this.j);
        this.l.removeCallbacks(this.i);
        this.o = false;
    }

    @Override // com.oplus.aiunit.vision.wz9
    public void onProgressChanged(int progress) {
    }

    @Override // com.oplus.aiunit.vision.wz9
    public void onResume() {
    }

    @Override // com.oplus.aiunit.vision.wz9
    public void onSaveInstanceState(@NonNull @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
    }
}
