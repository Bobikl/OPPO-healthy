package com.bumptech.glide.manager;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.oplus.aiunit.vision.am6;
import com.oplus.aiunit.vision.cpe;
import com.oplus.aiunit.vision.fy5;
import com.oplus.aiunit.vision.jh8;
import com.oplus.aiunit.vision.ng7;
import com.oplus.aiunit.vision.uqk;
import com.oplus.aiunit.vision.vqf;
import com.oplus.aiunit.vision.wqf;
import com.oplus.aiunit.vision.xy7;
import com.oplus.aiunit.vision.ze0;
import com.oplus.aiunit.vision.zva;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class b implements Handler.Callback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InterfaceC0185b f1424n = new a();
    public volatile vqf i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC0185b f1425j;
    public final ArrayMap<View, Fragment> k = new ArrayMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xy7 f1426l;
    public final com.bumptech.glide.manager.a m;

    public class a implements InterfaceC0185b {
        @Override // com.bumptech.glide.manager.b.InterfaceC0185b
        @NonNull
        public vqf a(@NonNull com.bumptech.glide.a aVar, @NonNull zva zvaVar, @NonNull wqf wqfVar, @NonNull Context context) {
            return new vqf(aVar, zvaVar, wqfVar, context);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.b$b, reason: collision with other inner class name */
    public interface InterfaceC0185b {
        @NonNull
        vqf a(@NonNull com.bumptech.glide.a aVar, @NonNull zva zvaVar, @NonNull wqf wqfVar, @NonNull Context context);
    }

    public b(@Nullable InterfaceC0185b interfaceC0185b) {
        interfaceC0185b = interfaceC0185b == null ? f1424n : interfaceC0185b;
        this.f1425j = interfaceC0185b;
        this.m = new com.bumptech.glide.manager.a(interfaceC0185b);
        this.f1426l = b();
    }

    @TargetApi(17)
    public static void a(@NonNull Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public static xy7 b() {
        return (jh8.HARDWARE_BITMAPS_SUPPORTED && jh8.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED) ? new ng7() : new fy5();
    }

    @Nullable
    public static Activity c(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void d(@Nullable Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    public static boolean k(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    @Nullable
    public final Fragment e(@NonNull View view, @NonNull FragmentActivity fragmentActivity) {
        this.k.clear();
        d(fragmentActivity.getSupportFragmentManager().getFragments(), this.k);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.k.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.k.clear();
        return fragment;
    }

    @NonNull
    public vqf f(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (uqk.t() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return i((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return f(contextWrapper.getBaseContext());
                }
            }
        }
        return j(context);
    }

    @NonNull
    public vqf g(@NonNull View view) {
        if (uqk.s()) {
            return f(view.getContext().getApplicationContext());
        }
        cpe.d(view);
        cpe.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityC = c(view.getContext());
        if (activityC != null && (activityC instanceof FragmentActivity)) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityC;
            Fragment fragmentE = e(view, fragmentActivity);
            return fragmentE != null ? h(fragmentE) : i(fragmentActivity);
        }
        return f(view.getContext().getApplicationContext());
    }

    @NonNull
    public vqf h(@NonNull Fragment fragment) {
        cpe.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (uqk.s()) {
            return f(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f1426l.a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.m.b(context, com.bumptech.glide.a.d(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    @NonNull
    public vqf i(@NonNull FragmentActivity fragmentActivity) {
        if (uqk.s()) {
            return f(fragmentActivity.getApplicationContext());
        }
        a(fragmentActivity);
        this.f1426l.a(fragmentActivity);
        boolean zK = k(fragmentActivity);
        return this.m.b(fragmentActivity, com.bumptech.glide.a.d(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), zK);
    }

    @NonNull
    public final vqf j(@NonNull Context context) {
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    this.i = this.f1425j.a(com.bumptech.glide.a.d(context.getApplicationContext()), new ze0(), new am6(), context.getApplicationContext());
                }
            }
        }
        return this.i;
    }
}
