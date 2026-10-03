package com.oplus.aiunit.vision;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class gkj {
    public static final int DEFAULT_TINT_COLOR = -1728053248;
    public static String h;
    public final a a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11792c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11793e;
    public View f;
    public View g;

    static {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod(ParserTag.TAG_GET, String.class);
            declaredMethod.setAccessible(true);
            h = (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
        } catch (Throwable unused) {
            h = null;
        }
    }

    @TargetApi(19)
    public gkj(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 16);
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(new int[]{R.attr.windowTranslucentStatus, R.attr.windowTranslucentNavigation});
        try {
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f11792c = typedArrayObtainStyledAttributes.getBoolean(1, false);
            typedArrayObtainStyledAttributes.recycle();
            int i = window.getAttributes().flags;
            if ((67108864 & i) != 0) {
                this.b = true;
            }
            if ((i & 134217728) != 0) {
                this.f11792c = true;
            }
            a aVar = new a(activity, this.b, this.f11792c, null);
            this.a = aVar;
            if (!aVar.j()) {
                this.f11792c = false;
            }
            if (this.b) {
                g(activity, viewGroup);
            }
            if (this.f11792c) {
                f(activity, viewGroup);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void b(boolean z) {
        this.f11793e = z;
        if (this.f11792c) {
            this.g.setVisibility(z ? 0 : 8);
        }
    }

    @TargetApi(11)
    public void c(float f) {
        if (this.b) {
            this.f.setAlpha(f);
        }
    }

    public void d(boolean z) {
        this.d = z;
        if (this.b) {
            this.f.setVisibility(z ? 0 : 8);
        }
    }

    public void e(int i) {
        if (this.b) {
            this.f.setBackgroundResource(i);
        }
    }

    public final void f(Context context, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        this.g = new View(context);
        if (this.a.k()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.a.c());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.a.e(), -1);
            layoutParams.gravity = 5;
        }
        this.g.setLayoutParams(layoutParams);
        this.g.setBackgroundColor(DEFAULT_TINT_COLOR);
        this.g.setVisibility(8);
        viewGroup.addView(this.g);
    }

    public final void g(Context context, ViewGroup viewGroup) {
        this.f = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.a.h());
        layoutParams.gravity = 48;
        if (this.f11792c && !this.a.k()) {
            layoutParams.rightMargin = this.a.e();
        }
        this.f.setLayoutParams(layoutParams);
        this.f.setBackgroundColor(DEFAULT_TINT_COLOR);
        this.f.setVisibility(8);
        viewGroup.addView(this.f);
    }

    public static class a {
        public final boolean a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11794c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f11795e;
        public final int f;
        public final int g;
        public final boolean h;
        public final float i;

        public a(Activity activity, boolean z, boolean z2) {
            Resources resources = activity.getResources();
            this.h = resources.getConfiguration().orientation == 1;
            this.i = g(activity);
            this.f11794c = b(resources, "status_bar_height");
            this.d = a(activity);
            int iD = d(activity);
            this.f = iD;
            this.g = f(activity);
            this.f11795e = iD > 0;
            this.a = z;
            this.b = z2;
        }

        @TargetApi(14)
        public final int a(Context context) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }

        public final int b(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, ResourcesUtil.ResourceType.DIMEN, "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        public int c() {
            return this.f;
        }

        @TargetApi(14)
        public final int d(Context context) {
            Resources resources = context.getResources();
            if (i(context)) {
                return b(resources, this.h ? "navigation_bar_height" : "navigation_bar_height_landscape");
            }
            return 0;
        }

        public int e() {
            return this.g;
        }

        @TargetApi(14)
        public final int f(Context context) {
            Resources resources = context.getResources();
            if (i(context)) {
                return b(resources, "navigation_bar_width");
            }
            return 0;
        }

        @SuppressLint({"NewApi"})
        public final float g(Activity activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            float f = displayMetrics.widthPixels;
            float f2 = displayMetrics.density;
            return Math.min(f / f2, displayMetrics.heightPixels / f2);
        }

        public int h() {
            return this.f11794c;
        }

        @TargetApi(14)
        public final boolean i(Context context) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier == 0) {
                return !ViewConfiguration.get(context).hasPermanentMenuKey();
            }
            boolean z = resources.getBoolean(identifier);
            if ("1".equals(gkj.h)) {
                return false;
            }
            if ("0".equals(gkj.h)) {
                return true;
            }
            return z;
        }

        public boolean j() {
            return this.f11795e;
        }

        public boolean k() {
            return this.i >= 600.0f || this.h;
        }

        public /* synthetic */ a(Activity activity, boolean z, boolean z2, a aVar) {
            this(activity, z, z2);
        }
    }
}
