package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
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
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.oplus.aiunit.vision.cbb;
import com.oplus.aiunit.vision.d3a;
import com.oplus.aiunit.vision.dbb;
import com.oplus.aiunit.vision.dee;
import com.oplus.aiunit.vision.ebb;
import com.oplus.aiunit.vision.ew7;
import com.oplus.aiunit.vision.frk;
import com.oplus.aiunit.vision.gqa;
import com.oplus.aiunit.vision.hbb;
import com.oplus.aiunit.vision.hoa;
import com.oplus.aiunit.vision.k9b;
import com.oplus.aiunit.vision.mbb;
import com.oplus.aiunit.vision.nsj;
import com.oplus.aiunit.vision.o7b;
import com.oplus.aiunit.vision.v3h;
import com.oplus.aiunit.vision.w9b;
import com.oplus.aiunit.vision.wab;
import com.oplus.aiunit.vision.y3h;
import com.oplus.aiunit.vision.yab;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes12.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final yab<Throwable> DEFAULT_FAILURE_LISTENER = new yab() { // from class: com.oplus.aiunit.vision.h9b
        @Override // com.oplus.aiunit.vision.yab
        public final void onResult(Object obj) {
            LottieAnimationView.lambda$static$0((Throwable) obj);
        }
    };
    private static final String TAG = "LottieAnimationView";
    private String animationName;

    @RawRes
    private int animationResId;
    private boolean autoPlay;
    private boolean cacheComposition;

    @Nullable
    private hbb<k9b> compositionTask;

    @Nullable
    private yab<Throwable> failureListener;

    @DrawableRes
    private int fallbackResource;
    private boolean ignoreUnschedule;
    private final yab<k9b> loadedListener;
    private final LottieDrawable lottieDrawable;
    private final Set<cbb> lottieOnCompositionLoadedListeners;
    private final Set<UserActionTaken> userActionsTaken;
    private final yab<Throwable> wrappedFailureListener;

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

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends mbb<T> {
        public final /* synthetic */ y3h d;

        public a(y3h y3hVar) {
            this.d = y3hVar;
        }

        @Override // com.oplus.aiunit.vision.mbb
        public T a(wab<T> wabVar) {
            return (T) this.d.a(wabVar);
        }
    }

    public static class b implements yab<Throwable> {
        public final WeakReference<LottieAnimationView> a;

        public b(LottieAnimationView lottieAnimationView) {
            this.a = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.oplus.aiunit.vision.yab
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            LottieAnimationView lottieAnimationView = this.a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.fallbackResource != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
            }
            (lottieAnimationView.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : lottieAnimationView.failureListener).onResult(th);
        }
    }

    public static class c implements yab<k9b> {
        public final WeakReference<LottieAnimationView> a;

        public c(LottieAnimationView lottieAnimationView) {
            this.a = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.oplus.aiunit.vision.yab
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(k9b k9bVar) {
            LottieAnimationView lottieAnimationView = this.a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(k9bVar);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.loadedListener = new c(this);
        this.wrappedFailureListener = new b(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(null, R$attr.lottieAnimationViewStyle);
    }

    private void cancelLoaderTask() {
        hbb<k9b> hbbVar = this.compositionTask;
        if (hbbVar != null) {
            hbbVar.k(this.loadedListener);
            this.compositionTask.j(this.wrappedFailureListener);
        }
    }

    private void clearComposition() {
        this.lottieDrawable.z();
    }

    private hbb<k9b> fromAssets(final String str) {
        if (isInEditMode()) {
            return new hbb<>(new Callable() { // from class: com.oplus.aiunit.vision.i9b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.i.lambda$fromAssets$2(str);
                }
            }, true);
        }
        return this.cacheComposition ? w9b.m(getContext(), str) : w9b.n(getContext(), str, null);
    }

    private hbb<k9b> fromRawRes(@RawRes final int i) {
        if (isInEditMode()) {
            return new hbb<>(new Callable() { // from class: com.oplus.aiunit.vision.g9b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.i.lambda$fromRawRes$1(i);
                }
            }, true);
        }
        return this.cacheComposition ? w9b.y(getContext(), i) : w9b.z(getContext(), i, null);
    }

    private void init(@Nullable AttributeSet attributeSet, @AttrRes int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LottieAnimationView, i, 0);
        this.cacheComposition = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i2 = R$styleable.LottieAnimationView_lottie_rawRes;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
        int i3 = R$styleable.LottieAnimationView_lottie_fileName;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i3);
        int i4 = R$styleable.LottieAnimationView_lottie_url;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i4);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
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
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.autoPlay = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_loop, false)) {
            this.lottieDrawable.v1(-1);
        }
        int i5 = R$styleable.LottieAnimationView_lottie_repeatMode;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = R$styleable.LottieAnimationView_lottie_repeatCount;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = R$styleable.LottieAnimationView_lottie_speed;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i7, 1.0f));
        }
        int i8 = R$styleable.LottieAnimationView_lottie_clipToCompositionBounds;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(i8, true));
        }
        int i9 = R$styleable.LottieAnimationView_lottie_clipTextToBoundingBox;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(i9, false));
        }
        int i10 = R$styleable.LottieAnimationView_lottie_defaultFontFileExtension;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(i10));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_imageAssetsFolder));
        int i11 = R$styleable.LottieAnimationView_lottie_progress;
        setProgressInternal(typedArrayObtainStyledAttributes.getFloat(i11, 0.0f), typedArrayObtainStyledAttributes.hasValue(i11));
        enableMergePathsForKitKatAndAbove(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        int i12 = R$styleable.LottieAnimationView_lottie_colorFilter;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            addValueCallback(new hoa("**"), dbb.COLOR_FILTER, (mbb<ColorFilter>) new mbb(new v3h(AppCompatResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(i12, -1)).getDefaultColor())));
        }
        int i13 = R$styleable.LottieAnimationView_lottie_renderMode;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i13, renderMode.ordinal());
            if (iOrdinal >= RenderMode.values().length) {
                iOrdinal = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[iOrdinal]);
        }
        int i14 = R$styleable.LottieAnimationView_lottie_asyncUpdates;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            AsyncUpdates asyncUpdates = AsyncUpdates.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i14, asyncUpdates.ordinal());
            if (iOrdinal2 >= RenderMode.values().length) {
                iOrdinal2 = asyncUpdates.ordinal();
            }
            setAsyncUpdates(AsyncUpdates.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        int i15 = R$styleable.LottieAnimationView_lottie_useCompositionFrameRate;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(i15, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.lottieDrawable.z1(Boolean.valueOf(frk.f(getContext()) != 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ebb lambda$fromAssets$2(String str) throws Exception {
        return this.cacheComposition ? w9b.o(getContext(), str) : w9b.p(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ebb lambda$fromRawRes$1(int i) throws Exception {
        return this.cacheComposition ? w9b.A(getContext(), i) : w9b.B(getContext(), i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Throwable th) {
        if (!frk.k(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        o7b.d("Unable to load composition.", th);
    }

    private void setCompositionTask(hbb<k9b> hbbVar) {
        ebb<k9b> ebbVarE = hbbVar.e();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (ebbVarE != null && lottieDrawable == getDrawable() && lottieDrawable.Q() == ebbVarE.b()) {
            return;
        }
        this.userActionsTaken.add(UserActionTaken.SET_ANIMATION);
        clearComposition();
        cancelLoaderTask();
        this.compositionTask = hbbVar.d(this.loadedListener).c(this.wrappedFailureListener);
    }

    private void setLottieDrawable() {
        boolean zIsAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.lottieDrawable);
        if (zIsAnimating) {
            this.lottieDrawable.R0();
        }
    }

    private void setProgressInternal(@FloatRange(from = 0.0d, to = 1.0d) float f, boolean z) {
        if (z) {
            this.userActionsTaken.add(UserActionTaken.SET_PROGRESS);
        }
        this.lottieDrawable.t1(f);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.s(animatorListener);
    }

    @RequiresApi(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.t(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.u(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull cbb cbbVar) {
        k9b composition = getComposition();
        if (composition != null) {
            cbbVar.a(composition);
        }
        return this.lottieOnCompositionLoadedListeners.add(cbbVar);
    }

    public <T> void addValueCallback(hoa hoaVar, T t, mbb<T> mbbVar) {
        this.lottieDrawable.v(hoaVar, t, mbbVar);
    }

    @MainThread
    public void cancelAnimation() {
        this.autoPlay = false;
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.y();
    }

    public <T> void clearValueCallback(hoa hoaVar, T t) {
        this.lottieDrawable.v(hoaVar, t, null);
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.D();
    }

    public void enableFeatureFlag(LottieFeatureFlag lottieFeatureFlag, boolean z) {
        this.lottieDrawable.G(lottieFeatureFlag, z);
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.lottieDrawable.G(LottieFeatureFlag.MergePathsApi19, z);
    }

    public AsyncUpdates getAsyncUpdates() {
        return this.lottieDrawable.L();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.lottieDrawable.M();
    }

    public boolean getClipTextToBoundingBox() {
        return this.lottieDrawable.O();
    }

    public boolean getClipToCompositionBounds() {
        return this.lottieDrawable.P();
    }

    @Nullable
    public k9b getComposition() {
        Drawable drawable = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable == lottieDrawable) {
            return lottieDrawable.Q();
        }
        return null;
    }

    public long getDuration() {
        k9b composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.lottieDrawable.T();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.lottieDrawable.V();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.lottieDrawable.X();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.Z();
    }

    public float getMinFrame() {
        return this.lottieDrawable.a0();
    }

    @Nullable
    public dee getPerformanceTracker() {
        return this.lottieDrawable.b0();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.lottieDrawable.c0();
    }

    public RenderMode getRenderMode() {
        return this.lottieDrawable.d0();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.e0();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.f0();
    }

    public float getSpeed() {
        return this.lottieDrawable.g0();
    }

    public boolean hasMasks() {
        return this.lottieDrawable.j0();
    }

    public boolean hasMatte() {
        return this.lottieDrawable.k0();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).d0() == RenderMode.SOFTWARE) {
            this.lottieDrawable.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.lottieDrawable.m0();
    }

    public boolean isFeatureFlagEnabled(LottieFeatureFlag lottieFeatureFlag) {
        return this.lottieDrawable.p0(lottieFeatureFlag);
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.p0(LottieFeatureFlag.MergePathsApi19);
    }

    @Deprecated
    public void loop(boolean z) {
        this.lottieDrawable.v1(z ? -1 : 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.autoPlay) {
            return;
        }
        this.lottieDrawable.J0();
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
        this.animationName = savedState.animationName;
        Set<UserActionTaken> set = this.userActionsTaken;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        if (!set.contains(userActionTaken) && !TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = savedState.animationResId;
        if (!this.userActionsTaken.contains(userActionTaken) && (i = this.animationResId) != 0) {
            setAnimation(i);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_PROGRESS)) {
            setProgressInternal(savedState.progress, false);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.PLAY_OPTION) && savedState.isAnimating) {
            playAnimation();
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.imageAssetsFolder);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.repeatMode);
        }
        if (this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.repeatCount);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.animationName;
        savedState.animationResId = this.animationResId;
        savedState.progress = this.lottieDrawable.c0();
        savedState.isAnimating = this.lottieDrawable.n0();
        savedState.imageAssetsFolder = this.lottieDrawable.V();
        savedState.repeatMode = this.lottieDrawable.f0();
        savedState.repeatCount = this.lottieDrawable.e0();
        return savedState;
    }

    @MainThread
    public void pauseAnimation() {
        this.autoPlay = false;
        this.lottieDrawable.I0();
    }

    @MainThread
    public void playAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.J0();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.K0();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.L0();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.M0(animatorListener);
    }

    @RequiresApi(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.N0(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(@NonNull cbb cbbVar) {
        return this.lottieOnCompositionLoadedListeners.remove(cbbVar);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.O0(animatorUpdateListener);
    }

    public List<hoa> resolveKeyPath(hoa hoaVar) {
        return this.lottieDrawable.Q0(hoaVar);
    }

    @MainThread
    public void resumeAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.R0();
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.S0();
    }

    public void setAnimation(@RawRes int i) {
        this.animationResId = i;
        this.animationName = null;
        setCompositionTask(fromRawRes(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.cacheComposition ? w9b.C(getContext(), str) : w9b.D(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.lottieDrawable.U0(z);
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.lottieDrawable.V0(asyncUpdates);
    }

    public void setCacheComposition(boolean z) {
        this.cacheComposition = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        this.lottieDrawable.W0(z);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.lottieDrawable.X0(z);
    }

    public void setComposition(@NonNull k9b k9bVar) {
        if (gqa.DBG) {
            Log.v(TAG, "Set Composition \n" + k9bVar);
        }
        this.lottieDrawable.setCallback(this);
        this.ignoreUnschedule = true;
        boolean zY0 = this.lottieDrawable.Y0(k9bVar);
        if (this.autoPlay) {
            this.lottieDrawable.J0();
        }
        this.ignoreUnschedule = false;
        if (getDrawable() != this.lottieDrawable || zY0) {
            if (!zY0) {
                setLottieDrawable();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<cbb> it = this.lottieOnCompositionLoadedListeners.iterator();
            while (it.hasNext()) {
                it.next().a(k9bVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.lottieDrawable.Z0(str);
    }

    public void setFailureListener(@Nullable yab<Throwable> yabVar) {
        this.failureListener = yabVar;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.fallbackResource = i;
    }

    public void setFontAssetDelegate(ew7 ew7Var) {
        this.lottieDrawable.a1(ew7Var);
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        this.lottieDrawable.b1(map);
    }

    public void setFrame(int i) {
        this.lottieDrawable.c1(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.lottieDrawable.d1(z);
    }

    public void setImageAssetDelegate(d3a d3aVar) {
        this.lottieDrawable.e1(d3aVar);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.f1(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.lottieDrawable.g1(z);
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.h1(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.lottieDrawable.j1(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.l1(str);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.lottieDrawable.n1(f, f2);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.o1(i);
    }

    public void setMinProgress(float f) {
        this.lottieDrawable.q1(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.lottieDrawable.r1(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.lottieDrawable.s1(z);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        setProgressInternal(f, true);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.lottieDrawable.u1(renderMode);
    }

    public void setRepeatCount(int i) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_COUNT);
        this.lottieDrawable.v1(i);
    }

    public void setRepeatMode(int i) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_MODE);
        this.lottieDrawable.w1(i);
    }

    public void setSafeMode(boolean z) {
        this.lottieDrawable.x1(z);
    }

    public void setSpeed(float f) {
        this.lottieDrawable.y1(f);
    }

    public void setTextDelegate(nsj nsjVar) {
        this.lottieDrawable.A1(nsjVar);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.lottieDrawable.B1(z);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.ignoreUnschedule && drawable == (lottieDrawable = this.lottieDrawable) && lottieDrawable.m0()) {
            pauseAnimation();
        } else if (!this.ignoreUnschedule && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.m0()) {
                lottieDrawable2.I0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        return this.lottieDrawable.D1(str, bitmap);
    }

    public <T> void addValueCallback(hoa hoaVar, T t, y3h<T> y3hVar) {
        this.lottieDrawable.v(hoaVar, t, new a(y3hVar));
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.i1(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.lottieDrawable.m1(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.p1(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.k1(i, i2);
    }

    public void setAnimation(String str) {
        this.animationName = str;
        this.animationResId = 0;
        setCompositionTask(fromAssets(str));
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
        setCompositionTask(w9b.D(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        setCompositionTask(w9b.q(inputStream, str));
    }

    public void setAnimation(ZipInputStream zipInputStream, @Nullable String str) {
        setCompositionTask(w9b.F(zipInputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadedListener = new c(this);
        this.wrappedFailureListener = new b(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, R$attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.loadedListener = new c(this);
        this.wrappedFailureListener = new b(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, i);
    }
}
