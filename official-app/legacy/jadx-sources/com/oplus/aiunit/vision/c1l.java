package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.R$id;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class c1l<T extends View, Z> extends k91<Z> {
    private static final String TAG = "ViewTarget";
    private static boolean isTagUsedAtLeastOnce;
    private static int tagId = R$id.glide_custom_view_target_tag;

    @Nullable
    private View.OnAttachStateChangeListener attachStateListener;
    private boolean isAttachStateListenerAdded;
    private boolean isClearedByUs;
    private final b sizeDeterminer;
    protected final T view;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c1l.this.resumeMyRequest();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            c1l.this.pauseMyRequest();
        }
    }

    @VisibleForTesting
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        @VisibleForTesting
        public static Integer f9915e;
        public final View a;
        public final List<l7h> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f9916c;

        @Nullable
        public a d;

        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<b> i;

            public a(@NonNull b bVar) {
                this.i = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(c1l.TAG, 2)) {
                    Log.v(c1l.TAG, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.i.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        public b(@NonNull View view) {
            this.a = view;
        }

        public static int c(@NonNull Context context) {
            if (f9915e == null) {
                Display defaultDisplay = ((WindowManager) cpe.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f9915e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f9915e.intValue();
        }

        public void a() {
            if (this.b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.d);
            }
            this.d = null;
            this.b.clear();
        }

        public void d(@NonNull l7h l7hVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                l7hVar.d(iG, iF);
                return;
            }
            if (!this.b.contains(l7hVar)) {
                this.b.add(l7hVar);
            }
            if (this.d == null) {
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                a aVar = new a(this);
                this.d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public final int e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f9916c && this.a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable(c1l.TAG, 4)) {
                Log.i(c1l.TAG, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.a.getContext());
        }

        public final int f() {
            int paddingTop = this.a.getPaddingTop() + this.a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return e(this.a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.a.getPaddingLeft() + this.a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return e(this.a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        public final boolean i(int i, int i2) {
            return h(i) && h(i2);
        }

        public final void j(int i, int i2) {
            Iterator it = new ArrayList(this.b).iterator();
            while (it.hasNext()) {
                ((l7h) it.next()).d(i, i2);
            }
        }

        public void k(@NonNull l7h l7hVar) {
            this.b.remove(l7hVar);
        }
    }

    public c1l(@NonNull T t) {
        this.view = (T) cpe.d(t);
        this.sizeDeterminer = new b(t);
    }

    @Nullable
    private Object getTag() {
        return this.view.getTag(tagId);
    }

    private void maybeAddAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener == null || this.isAttachStateListenerAdded) {
            return;
        }
        this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.isAttachStateListenerAdded = true;
    }

    private void maybeRemoveAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener == null || !this.isAttachStateListenerAdded) {
            return;
        }
        this.view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.isAttachStateListenerAdded = false;
    }

    private void setTag(@Nullable Object obj) {
        isTagUsedAtLeastOnce = true;
        this.view.setTag(tagId, obj);
    }

    @Deprecated
    public static void setTagId(int i) {
        if (isTagUsedAtLeastOnce) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        tagId = i;
    }

    @NonNull
    public final c1l<T, Z> clearOnDetach() {
        if (this.attachStateListener != null) {
            return this;
        }
        this.attachStateListener = new a();
        maybeAddAttachStateListener();
        return this;
    }

    @Override // com.oplus.aiunit.vision.k91, com.oplus.aiunit.vision.boj
    @Nullable
    public dqf getRequest() {
        Object tag = getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof dqf) {
            return (dqf) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.oplus.aiunit.vision.boj
    @CallSuper
    public void getSize(@NonNull l7h l7hVar) {
        this.sizeDeterminer.d(l7hVar);
    }

    @NonNull
    public T getView() {
        return this.view;
    }

    @Override // com.oplus.aiunit.vision.k91, com.oplus.aiunit.vision.boj
    @CallSuper
    public void onLoadCleared(@Nullable Drawable drawable) {
        super.onLoadCleared(drawable);
        this.sizeDeterminer.b();
        if (this.isClearedByUs) {
            return;
        }
        maybeRemoveAttachStateListener();
    }

    @Override // com.oplus.aiunit.vision.k91, com.oplus.aiunit.vision.boj
    @CallSuper
    public void onLoadStarted(@Nullable Drawable drawable) {
        super.onLoadStarted(drawable);
        maybeAddAttachStateListener();
    }

    public void pauseMyRequest() {
        dqf request = getRequest();
        if (request != null) {
            this.isClearedByUs = true;
            request.clear();
            this.isClearedByUs = false;
        }
    }

    @Override // com.oplus.aiunit.vision.boj
    @CallSuper
    public void removeCallback(@NonNull l7h l7hVar) {
        this.sizeDeterminer.k(l7hVar);
    }

    public void resumeMyRequest() {
        dqf request = getRequest();
        if (request == null || !request.e()) {
            return;
        }
        request.i();
    }

    @Override // com.oplus.aiunit.vision.k91, com.oplus.aiunit.vision.boj
    public void setRequest(@Nullable dqf dqfVar) {
        setTag(dqfVar);
    }

    public String toString() {
        return "Target for: " + this.view;
    }

    @NonNull
    public final c1l<T, Z> waitForLayout() {
        this.sizeDeterminer.f9916c = true;
        return this;
    }

    @Deprecated
    public c1l(@NonNull T t, boolean z) {
        this(t);
        if (z) {
            waitForLayout();
        }
    }
}
