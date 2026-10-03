package com.oplus.anim;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.oplus.aiunit.vision.c3a;
import com.oplus.aiunit.vision.ci6;
import com.oplus.aiunit.vision.dw7;
import com.oplus.aiunit.vision.eee;
import com.oplus.aiunit.vision.goa;
import com.oplus.aiunit.vision.kh6;
import com.oplus.aiunit.vision.ki6;
import com.oplus.aiunit.vision.lh6;
import com.oplus.aiunit.vision.mh6;
import com.oplus.aiunit.vision.mi6;
import com.oplus.aiunit.vision.msj;
import com.oplus.aiunit.vision.oh6;
import com.oplus.aiunit.vision.prk;
import com.oplus.aiunit.vision.u3h;
import com.oplus.aiunit.vision.u7b;
import com.oplus.aiunit.vision.wg6;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes19.dex */
public class EffectiveAnimationView extends AppCompatImageView {
    public static final String y = "EffectiveAnimationView";
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kh6<Throwable> f19614j;
    public final kh6<wg6> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kh6<Throwable> f19615l;

    @Nullable
    public kh6<Throwable> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @DrawableRes
    public int f19616n;
    public final EffectiveAnimationDrawable o;
    public String p;

    @RawRes
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final Set<UserActionTaken> u;
    public final Set<ki6> v;

    @Nullable
    public oh6<wg6> w;

    @Nullable
    public wg6 x;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String animationName;
        int animationResId;
        String imageAssetsFolder;
        boolean isAnimating;
        float progress;
        int repeatCount;
        int repeatMode;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.animationName);
            parcel.writeFloat(this.progress);
            parcel.writeInt(this.isAnimating ? 1 : 0);
            parcel.writeString(this.imageAssetsFolder);
            parcel.writeInt(this.repeatMode);
            parcel.writeInt(this.repeatCount);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.animationName = parcel.readString();
            this.progress = parcel.readFloat();
            this.isAnimating = parcel.readInt() == 1;
            this.imageAssetsFolder = parcel.readString();
            this.repeatMode = parcel.readInt();
            this.repeatCount = parcel.readInt();
        }
    }

    public enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public class a implements kh6<Throwable> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.kh6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            if (EffectiveAnimationView.this.f19616n != 0) {
                EffectiveAnimationView effectiveAnimationView = EffectiveAnimationView.this;
                effectiveAnimationView.setImageResource(effectiveAnimationView.f19616n);
            }
            kh6 kh6Var = EffectiveAnimationView.this.m;
            EffectiveAnimationView effectiveAnimationView2 = EffectiveAnimationView.this;
            (kh6Var == null ? effectiveAnimationView2.f19614j : effectiveAnimationView2.m).onResult(th);
        }
    }

    public EffectiveAnimationView(Context context) {
        super(context);
        this.i = "";
        this.f19614j = new kh6() { // from class: com.oplus.aiunit.vision.sh6
            @Override // com.oplus.aiunit.vision.kh6
            public final void onResult(Object obj) {
                this.a.l((Throwable) obj);
            }
        };
        this.k = new kh6() { // from class: com.oplus.aiunit.vision.th6
            @Override // com.oplus.aiunit.vision.kh6
            public final void onResult(Object obj) {
                this.a.setComposition((wg6) obj);
            }
        };
        this.f19615l = new a();
        this.f19616n = 0;
        this.o = new EffectiveAnimationDrawable();
        this.r = false;
        this.s = false;
        this.t = true;
        this.u = new HashSet();
        this.v = new HashSet();
        init(null, R$attr.effectiveAnimationViewStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ mh6 j(String str) throws Exception {
        return this.t ? ci6.l(getContext(), str) : ci6.m(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ mh6 k(int i) throws Exception {
        return this.t ? ci6.u(getContext(), i) : ci6.v(getContext(), i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(Throwable th) {
        if (prk.l(th)) {
            u7b.d("Unable to load composition.", th);
            return;
        }
        Log.d(y, "Unable to parse composition callers:" + this.i);
        throw new IllegalStateException("Unable to parse composition", th);
    }

    private void setCompositionTask(oh6<wg6> oh6Var) {
        this.u.add(UserActionTaken.SET_ANIMATION);
        clearComposition();
        cancelLoaderTask();
        this.w = oh6Var.d(this.k).c(this.f19615l);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.o.p(animatorListener);
    }

    @MainThread
    public void cancelAnimation() {
        this.u.add(UserActionTaken.PLAY_OPTION);
        this.o.t();
    }

    public final void cancelLoaderTask() {
        oh6<wg6> oh6Var = this.w;
        if (oh6Var != null) {
            oh6Var.j(this.k);
            this.w.i(this.f19615l);
        }
    }

    public final void clearComposition() {
        this.x = null;
        this.o.u();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.o.z(z);
    }

    public <T> void g(goa goaVar, T t, mi6<T> mi6Var) {
        this.o.q(goaVar, t, mi6Var);
    }

    public boolean getClipToCompositionBounds() {
        return this.o.F();
    }

    @Nullable
    public wg6 getComposition() {
        return this.x;
    }

    public long getDuration() {
        wg6 wg6Var = this.x;
        if (wg6Var != null) {
            return (long) wg6Var.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.o.J();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.o.L();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.o.N();
    }

    public float getMaxFrame() {
        return this.o.O();
    }

    public float getMinFrame() {
        return this.o.P();
    }

    @Nullable
    public eee getPerformanceTracker() {
        return this.o.Q();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.o.R();
    }

    public RenderMode getRenderMode() {
        return this.o.S();
    }

    public int getRepeatCount() {
        return this.o.T();
    }

    public int getRepeatMode() {
        return this.o.U();
    }

    public float getSpeed() {
        return this.o.V();
    }

    public final oh6<wg6> h(final String str) {
        if (isInEditMode()) {
            return new oh6<>(new Callable() { // from class: com.oplus.aiunit.vision.qh6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.i.j(str);
                }
            }, true);
        }
        return this.t ? ci6.j(getContext(), str) : ci6.k(getContext(), str, null);
    }

    public final oh6<wg6> i(@RawRes final int i) {
        if (isInEditMode()) {
            return new oh6<>(new Callable() { // from class: com.oplus.aiunit.vision.rh6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.i.k(i);
                }
            }, true);
        }
        return this.t ? ci6.s(getContext(), i) : ci6.t(getContext(), i, null);
    }

    public final void init(@Nullable AttributeSet attributeSet, @AttrRes int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.EffectiveAnimationView, i, 0);
        this.t = typedArrayObtainStyledAttributes.getBoolean(R$styleable.EffectiveAnimationView_anim_cacheComposition, true);
        int i2 = R$styleable.EffectiveAnimationView_anim_rawRes;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
        int i3 = R$styleable.EffectiveAnimationView_anim_fileName;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i3);
        int i4 = R$styleable.EffectiveAnimationView_anim_url;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i4);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("anim_rawRes and anim_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i3);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i4)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(R$styleable.EffectiveAnimationView_anim_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.EffectiveAnimationView_anim_autoPlay, false)) {
            this.s = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.EffectiveAnimationView_anim_loop, false)) {
            this.o.S0(-1);
        }
        int i5 = R$styleable.EffectiveAnimationView_anim_repeatMode;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = R$styleable.EffectiveAnimationView_anim_repeatCount;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = R$styleable.EffectiveAnimationView_anim_speed;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i7, 1.0f));
        }
        int i8 = R$styleable.EffectiveAnimationView_anim_clipToCompositionBounds;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(i8, true));
        }
        int i9 = R$styleable.EffectiveAnimationView_anim_defaultFontFileExtension;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(i9));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(R$styleable.EffectiveAnimationView_anim_imageAssetsFolder));
        int i10 = R$styleable.EffectiveAnimationView_anim_progress;
        setProgressInternal(typedArrayObtainStyledAttributes.getFloat(i10, 0.0f), typedArrayObtainStyledAttributes.hasValue(i10));
        enableMergePathsForKitKatAndAbove(typedArrayObtainStyledAttributes.getBoolean(R$styleable.EffectiveAnimationView_anim_enableMergePathsForKitKatAndAbove, false));
        int i11 = R$styleable.EffectiveAnimationView_anim_colorFilter;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            g(new goa("**"), lh6.COLOR_FILTER, new mi6(new u3h(AppCompatResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(i11, -1)).getDefaultColor())));
        }
        int i12 = R$styleable.EffectiveAnimationView_anim_renderMode;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i12, renderMode.ordinal());
            if (iOrdinal >= RenderMode.values().length) {
                iOrdinal = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[iOrdinal]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(R$styleable.EffectiveAnimationView_anim_ignoreDisabledSystemAnimations, false));
        int i13 = R$styleable.EffectiveAnimationView_anim_useCompositionFrameRate;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(i13, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.o.W0(Boolean.valueOf(prk.f(getContext()) != 0.0f));
        this.i = prk.g();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof EffectiveAnimationDrawable) && ((EffectiveAnimationDrawable) drawable).S() == RenderMode.SOFTWARE) {
            this.o.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        EffectiveAnimationDrawable effectiveAnimationDrawable = this.o;
        if (drawable2 == effectiveAnimationDrawable) {
            super.invalidateDrawable(effectiveAnimationDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.o.Z();
    }

    @Deprecated
    public void loop(boolean z) {
        this.o.S0(z ? -1 : 0);
    }

    public final void m() {
        boolean zIsAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.o);
        if (zIsAnimating) {
            this.o.t0();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.s) {
            return;
        }
        this.o.q0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.p = savedState.animationName;
        Set<UserActionTaken> set = this.u;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        if (!set.contains(userActionTaken) && !TextUtils.isEmpty(this.p)) {
            setAnimation(this.p);
        }
        this.q = savedState.animationResId;
        if (!this.u.contains(userActionTaken) && (i = this.q) != 0) {
            setAnimation(i);
        }
        if (!this.u.contains(UserActionTaken.SET_PROGRESS)) {
            setProgressInternal(savedState.progress, false);
        }
        if (!this.u.contains(UserActionTaken.PLAY_OPTION) && savedState.isAnimating) {
            playAnimation();
        }
        if (!this.u.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.imageAssetsFolder);
        }
        if (!this.u.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.repeatMode);
        }
        if (this.u.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.repeatCount);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.p;
        savedState.animationResId = this.q;
        savedState.progress = this.o.R();
        savedState.isAnimating = this.o.a0();
        savedState.imageAssetsFolder = this.o.L();
        savedState.repeatMode = this.o.U();
        savedState.repeatCount = this.o.T();
        return savedState;
    }

    @MainThread
    public void pauseAnimation() {
        this.s = false;
        this.o.p0();
    }

    @MainThread
    public void playAnimation() {
        this.u.add(UserActionTaken.PLAY_OPTION);
        this.o.q0();
    }

    @MainThread
    public void resumeAnimation() {
        this.u.add(UserActionTaken.PLAY_OPTION);
        this.o.t0();
    }

    public void setAnimation(@RawRes int i) {
        this.q = i;
        this.p = null;
        setCompositionTask(i(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.t ? ci6.w(getContext(), str) : ci6.x(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.o.v0(z);
    }

    public void setCacheComposition(boolean z) {
        this.t = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.o.w0(z);
    }

    public void setComposition(@NonNull wg6 wg6Var) {
        this.o.setCallback(this);
        this.x = wg6Var;
        this.r = true;
        boolean zX0 = this.o.x0(wg6Var);
        this.r = false;
        if (getDrawable() != this.o || zX0) {
            if (!zX0) {
                m();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<ki6> it = this.v.iterator();
            while (it.hasNext()) {
                it.next().a(wg6Var);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.o.y0(str);
    }

    public void setFailureListener(@Nullable kh6<Throwable> kh6Var) {
        this.m = kh6Var;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.f19616n = i;
    }

    public void setFontAssetDelegate(dw7 dw7Var) {
        this.o.z0(dw7Var);
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        this.o.A0(map);
    }

    public void setFrame(int i) {
        this.o.B0(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.o.C0(z);
    }

    public void setImageAssetDelegate(c3a c3aVar) {
        this.o.D0(c3aVar);
    }

    public void setImageAssetsFolder(String str) {
        this.o.E0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.o.F0(z);
    }

    public void setMaxFrame(int i) {
        this.o.G0(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.o.I0(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.o.K0(str);
    }

    public void setMinFrame(int i) {
        this.o.L0(i);
    }

    public void setMinProgress(float f) {
        this.o.N0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.o.O0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.o.P0(z);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        setProgressInternal(f, true);
    }

    public final void setProgressInternal(@FloatRange(from = 0.0d, to = 1.0d) float f, boolean z) {
        if (z) {
            this.u.add(UserActionTaken.SET_PROGRESS);
        }
        this.o.Q0(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.o.R0(renderMode);
    }

    public void setRepeatCount(int i) {
        this.u.add(UserActionTaken.SET_REPEAT_COUNT);
        this.o.S0(i);
    }

    public void setRepeatMode(int i) {
        this.u.add(UserActionTaken.SET_REPEAT_MODE);
        this.o.T0(i);
    }

    public void setSafeMode(boolean z) {
        this.o.U0(z);
    }

    public void setSpeed(float f) {
        this.o.V0(f);
    }

    public void setTextDelegate(msj msjVar) {
        this.o.X0(msjVar);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.o.Y0(z);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        EffectiveAnimationDrawable effectiveAnimationDrawable;
        if (!this.r && drawable == (effectiveAnimationDrawable = this.o) && effectiveAnimationDrawable.Z()) {
            pauseAnimation();
        } else if (!this.r && (drawable instanceof EffectiveAnimationDrawable)) {
            EffectiveAnimationDrawable effectiveAnimationDrawable2 = (EffectiveAnimationDrawable) drawable;
            if (effectiveAnimationDrawable2.Z()) {
                effectiveAnimationDrawable2.p0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.o.H0(str);
    }

    public void setMinFrame(String str) {
        this.o.M0(str);
    }

    public void setAnimation(String str) {
        this.p = str;
        this.q = 0;
        setCompositionTask(h(str));
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        setCompositionTask(ci6.n(inputStream, str));
    }

    public EffectiveAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = "";
        this.f19614j = new kh6() { // from class: com.oplus.aiunit.vision.sh6
            @Override // com.oplus.aiunit.vision.kh6
            public final void onResult(Object obj) {
                this.a.l((Throwable) obj);
            }
        };
        this.k = new kh6() { // from class: com.oplus.aiunit.vision.th6
            @Override // com.oplus.aiunit.vision.kh6
            public final void onResult(Object obj) {
                this.a.setComposition((wg6) obj);
            }
        };
        this.f19615l = new a();
        this.f19616n = 0;
        this.o = new EffectiveAnimationDrawable();
        this.r = false;
        this.s = false;
        this.t = true;
        this.u = new HashSet();
        this.v = new HashSet();
        init(attributeSet, R$attr.effectiveAnimationViewStyle);
    }

    public EffectiveAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = "";
        this.f19614j = new kh6() { // from class: com.oplus.aiunit.vision.sh6
            @Override // com.oplus.aiunit.vision.kh6
            public final void onResult(Object obj) {
                this.a.l((Throwable) obj);
            }
        };
        this.k = new kh6() { // from class: com.oplus.aiunit.vision.th6
            @Override // com.oplus.aiunit.vision.kh6
            public final void onResult(Object obj) {
                this.a.setComposition((wg6) obj);
            }
        };
        this.f19615l = new a();
        this.f19616n = 0;
        this.o = new EffectiveAnimationDrawable();
        this.r = false;
        this.s = false;
        this.t = true;
        this.u = new HashSet();
        this.v = new HashSet();
        init(attributeSet, i);
    }
}
