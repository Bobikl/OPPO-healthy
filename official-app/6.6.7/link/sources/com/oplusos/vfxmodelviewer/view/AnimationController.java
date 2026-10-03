package com.oplusos.vfxmodelviewer.view;

import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplusos.vfxmodelviewer.gltfio.Animator;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003/01B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000eJ\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0006j\b\u0012\u0004\u0012\u00020\u0017`\bJ\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0014J\b\u0010\u001d\u001a\u00020\u0012H\u0014J\b\u0010\u001e\u001a\u00020\u0012H\u0014J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0010H\u0014J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\fJ4\u0010\"\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020'J4\u0010\"\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\nJ\u0016\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0010J\u000e\u0010-\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0010J\u000e\u0010.\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010.\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0017R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/AnimationController;", "Lcom/oplusos/vfxmodelviewer/view/SceneComponent;", "scene", "Lcom/oplusos/vfxmodelviewer/view/ModelScene;", "(Lcom/oplusos/vfxmodelviewer/view/ModelScene;)V", "mAnimationState", "Ljava/util/ArrayList;", "Lcom/oplusos/vfxmodelviewer/view/AnimationController$AnimationState;", "Lkotlin/collections/ArrayList;", "mAnimator", "Lcom/oplusos/vfxmodelviewer/gltfio/Animator;", "mPause", "", "mPlayAnimationState", "", "mSpeed", "", "clear", "", "getAnimationCount", "getAnimationDuration", "index", "getAnimationName", "", "getAnimationNames", "isStateIndexValid", "nameToIndex", "name", "onDestroy", "onDisable", "onEnable", "onUpdate", "deltaTime", "pause", "play", "layer", ClickApiEntity.SPEED, "startTime", "wrapMode", "Lcom/oplusos/vfxmodelviewer/view/AnimationController$WrapMode;", "reset", "setAnimator", "animator", ClickApiEntity.SET_PROGRESS, ParserTag.TAG_PROGRESS, "setSpeed", "stop", "AnimationState", "State", "WrapMode", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AnimationController extends SceneComponent {

    @NotNull
    private ArrayList<AnimationState> mAnimationState;

    @Nullable
    private Animator mAnimator;
    private boolean mPause;

    @NotNull
    private ArrayList<Integer> mPlayAnimationState;
    private float mSpeed;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001b\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u000eJ\u0006\u0010\u001d\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u000eJ\u0006\u0010\u001f\u001a\u00020\u000eJ\u0006\u0010 \u001a\u00020\u0014J\u001a\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010$\u001a\u00020\u001aJ\u0006\u0010%\u001a\u00020\"J\u000e\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u000eJ\u000e\u0010(\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000eJ\u000e\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u000eJ\u000e\u0010+\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aJ\u0006\u0010,\u001a\u00020\"J\u000e\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u000eJ\u0018\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u000eH\u0002R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/AnimationController$AnimationState;", "", "index", "", "animator", "Lcom/oplusos/vfxmodelviewer/gltfio/Animator;", "(ILcom/oplusos/vfxmodelviewer/gltfio/Animator;)V", "layer", "getLayer", "()I", "setLayer", "(I)V", "mAnimator", "mDuration", "", "mIndex", "mLastPlayTime", "mName", "", "mOver", "", "mPlaySpeed", "mPlayTime", "mState", "Lcom/oplusos/vfxmodelviewer/view/AnimationController$State;", "mWrapMode", "Lcom/oplusos/vfxmodelviewer/view/AnimationController$WrapMode;", "getIndex", "getLength", "getName", "getSpeed", "getTime", "isPlaying", "play", "", ClickApiEntity.SPEED, "wrapMode", "reset", ClickApiEntity.SET_PROGRESS, ParserTag.TAG_PROGRESS, "setSpeed", "setTime", "seconds", "setWrapMode", "stop", "update", "deltaSeconds", "updateAnimation", "animationIndex", "elapsedTimeSeconds", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AnimationState {
        private int layer;

        @Nullable
        private Animator mAnimator;
        private final float mDuration;
        private final int mIndex;
        private float mLastPlayTime;

        @NotNull
        private String mName;
        private boolean mOver;
        private float mPlaySpeed;
        private float mPlayTime;

        @NotNull
        private State mState;

        @NotNull
        private WrapMode mWrapMode;

        public AnimationState(int i, @Nullable Animator animator) {
            String animationName;
            String str = "";
            this.mName = "";
            this.mAnimator = animator;
            this.mIndex = i;
            float f = vr3.UNSET;
            this.mPlayTime = vr3.UNSET;
            this.mLastPlayTime = vr3.UNSET;
            this.mPlaySpeed = 1.0f;
            this.mDuration = animator != null ? animator.getAnimationDuration(i) : f;
            this.mState = State.Stop;
            this.mWrapMode = WrapMode.Clamp;
            this.mOver = false;
            Animator animator2 = this.mAnimator;
            if (animator2 != null && (animationName = animator2.getAnimationName(i)) != null) {
                str = animationName;
            }
            this.mName = str;
        }

        public static /* synthetic */ void play$default(AnimationState animationState, float f, WrapMode wrapMode, int i, Object obj) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            if ((i & 2) != 0) {
                wrapMode = WrapMode.Clamp;
            }
            animationState.play(f, wrapMode);
        }

        private final void updateAnimation(int animationIndex, float elapsedTimeSeconds) {
            Animator animator = this.mAnimator;
            if (animator == null) {
                return;
            }
            if (animator.getAnimationCount() > 0) {
                animator.applyAnimation(animationIndex, elapsedTimeSeconds);
            }
            animator.updateBoneMatrices();
        }

        /* JADX INFO: renamed from: getIndex, reason: from getter */
        public final int getMIndex() {
            return this.mIndex;
        }

        public final int getLayer() {
            return this.layer;
        }

        /* JADX INFO: renamed from: getLength, reason: from getter */
        public final float getMDuration() {
            return this.mDuration;
        }

        @NotNull
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getMName() {
            return this.mName;
        }

        /* JADX INFO: renamed from: getSpeed, reason: from getter */
        public final float getMPlaySpeed() {
            return this.mPlaySpeed;
        }

        /* JADX INFO: renamed from: getTime, reason: from getter */
        public final float getMPlayTime() {
            return this.mPlayTime;
        }

        public final boolean isPlaying() {
            return this.mState == State.Playing;
        }

        public final void play(float speed, @NotNull WrapMode wrapMode) {
            Intrinsics.checkNotNullParameter(wrapMode, "wrapMode");
            this.mPlaySpeed = speed;
            this.mWrapMode = wrapMode;
            this.mState = State.Playing;
            this.mPlayTime = vr3.UNSET;
            this.mLastPlayTime = -1.0f;
        }

        public final void reset() {
            updateAnimation(this.mIndex, vr3.UNSET);
            this.mPlayTime = vr3.UNSET;
        }

        public final void setLayer(int i) {
            this.layer = i;
        }

        public final void setProgress(float progress) {
            setTime(progress * this.mDuration);
        }

        public final void setSpeed(float speed) {
            this.mPlaySpeed = speed;
        }

        public final void setTime(float seconds) {
            this.mPlayTime = seconds;
            float f = this.mDuration;
            if (seconds >= f) {
                WrapMode wrapMode = this.mWrapMode;
                if (wrapMode == WrapMode.Clamp) {
                    this.mPlayTime = f - 1.0E-4f;
                } else if (wrapMode == WrapMode.Once) {
                    this.mPlayTime = f;
                }
            }
        }

        public final void setWrapMode(@NotNull WrapMode wrapMode) {
            Intrinsics.checkNotNullParameter(wrapMode, "wrapMode");
            this.mWrapMode = wrapMode;
        }

        public final void stop() {
            this.mState = State.Stop;
        }

        public final void update(float deltaSeconds) {
            if (this.mState == State.Playing) {
                float f = this.mLastPlayTime;
                float f2 = this.mPlayTime;
                if (!(f == f2)) {
                    updateAnimation(this.mIndex, f2);
                    this.mLastPlayTime = this.mPlayTime;
                }
                if (this.mOver) {
                    this.mState = State.Stop;
                    this.mOver = false;
                    return;
                }
                float f3 = this.mPlayTime + (deltaSeconds * this.mPlaySpeed);
                this.mPlayTime = f3;
                float f4 = this.mDuration;
                if (f3 >= f4) {
                    WrapMode wrapMode = this.mWrapMode;
                    if (wrapMode == WrapMode.Clamp) {
                        this.mPlayTime = f4 - 1.0E-4f;
                        return;
                    } else {
                        if (wrapMode == WrapMode.Once) {
                            this.mPlayTime = vr3.UNSET;
                            this.mOver = true;
                            return;
                        }
                        return;
                    }
                }
                if (f3 < vr3.UNSET) {
                    WrapMode wrapMode2 = this.mWrapMode;
                    if (wrapMode2 == WrapMode.Clamp) {
                        this.mPlayTime = vr3.UNSET;
                    } else if (wrapMode2 != WrapMode.Once) {
                        this.mPlayTime = f4 - 1.0E-4f;
                    } else {
                        this.mPlayTime = vr3.UNSET;
                        this.mOver = true;
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/AnimationController$State;", "", "(Ljava/lang/String;I)V", "Stop", "Playing", "Pause", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum State {
        Stop,
        Playing,
        Pause
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/AnimationController$WrapMode;", "", "(Ljava/lang/String;I)V", "Once", "Clamp", "Loop", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum WrapMode {
        Once,
        Clamp,
        Loop
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationController(@NotNull ModelScene modelScene) {
        super(modelScene);
        Intrinsics.checkNotNullParameter(modelScene, "scene");
        this.mSpeed = 1.0f;
        this.mPlayAnimationState = new ArrayList<>();
        this.mAnimationState = new ArrayList<>();
    }

    private final boolean isStateIndexValid(int index) {
        return index >= 0 && index < this.mAnimationState.size();
    }

    private final int nameToIndex(String name) {
        Animator animator = this.mAnimator;
        int i = 0;
        int animationCount = animator == null ? 0 : animator.getAnimationCount();
        if (animationCount <= 0) {
            return -1;
        }
        while (true) {
            int i2 = i + 1;
            Animator animator2 = this.mAnimator;
            if (Intrinsics.areEqual(animator2 == null ? null : animator2.getAnimationName(i), name)) {
                return i;
            }
            if (i2 >= animationCount) {
                return -1;
            }
            i = i2;
        }
    }

    public static /* synthetic */ void play$default(AnimationController animationController, String str, int i, float f, float f2, WrapMode wrapMode, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f3 = f;
        if ((i2 & 8) != 0) {
            f2 = vr3.UNSET;
        }
        float f4 = f2;
        if ((i2 & 16) != 0) {
            wrapMode = WrapMode.Clamp;
        }
        animationController.play(str, i, f3, f4, wrapMode);
    }

    public final void clear() {
        this.mPlayAnimationState.clear();
        this.mAnimationState.clear();
        this.mAnimator = null;
    }

    public final int getAnimationCount() {
        Animator animator = this.mAnimator;
        if (animator == null) {
            return 0;
        }
        return animator.getAnimationCount();
    }

    public final float getAnimationDuration(int index) {
        return !isStateIndexValid(index) ? vr3.UNSET : this.mAnimationState.get(index).getMDuration();
    }

    @NotNull
    public final String getAnimationName(int index) {
        String animationName;
        Animator animator = this.mAnimator;
        return (animator == null || (animationName = animator.getAnimationName(index)) == null) ? "" : animationName;
    }

    @NotNull
    public final ArrayList<String> getAnimationNames() {
        String animationName;
        Animator animator = this.mAnimator;
        int i = 0;
        int animationCount = animator == null ? 0 : animator.getAnimationCount();
        ArrayList<String> arrayList = new ArrayList<>();
        if (animationCount > 0) {
            while (true) {
                int i2 = i + 1;
                Animator animator2 = this.mAnimator;
                if (animator2 != null && (animationName = animator2.getAnimationName(i)) != null) {
                    arrayList.add(animationName);
                }
                if (i2 >= animationCount) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    @Override // com.oplusos.vfxmodelviewer.view.SceneComponent
    public void onDestroy() {
        clear();
    }

    @Override // com.oplusos.vfxmodelviewer.view.SceneComponent
    public void onDisable() {
    }

    @Override // com.oplusos.vfxmodelviewer.view.SceneComponent
    public void onEnable() {
    }

    @Override // com.oplusos.vfxmodelviewer.view.SceneComponent
    public void onUpdate(float deltaTime) {
        if (this.mPause) {
            return;
        }
        float f = deltaTime * this.mSpeed;
        int size = this.mPlayAnimationState.size() - 1;
        if (size > 0) {
            getMScene().setRenderDirty();
        }
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            ArrayList<AnimationState> arrayList = this.mAnimationState;
            Integer num = this.mPlayAnimationState.get(size);
            Intrinsics.checkNotNullExpressionValue(num, "mPlayAnimationState[i]");
            AnimationState animationState = arrayList.get(num.intValue());
            Intrinsics.checkNotNullExpressionValue(animationState, "mAnimationState[mPlayAnimationState[i]]");
            AnimationState animationState2 = animationState;
            animationState2.update(f);
            if (!animationState2.isPlaying()) {
                this.mPlayAnimationState.remove(size);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final void pause(boolean pause) {
        this.mPause = pause;
    }

    public final void play(@NotNull String name, int layer, float speed, float startTime, @NotNull WrapMode wrapMode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(wrapMode, "wrapMode");
        int iNameToIndex = nameToIndex(name);
        if (iNameToIndex < 0) {
            return;
        }
        play(iNameToIndex, layer, speed, startTime, wrapMode);
    }

    public final void reset(int index) {
        if (isStateIndexValid(index)) {
            this.mAnimationState.get(index).reset();
        }
    }

    public final void setAnimator(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.mPlayAnimationState.clear();
        this.mAnimator = animator;
        int i = 0;
        int animationCount = animator == null ? 0 : animator.getAnimationCount();
        if (animationCount <= 0) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            this.mAnimationState.add(new AnimationState(i, this.mAnimator));
            if (i2 >= animationCount) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void setProgress(int index, float progress) {
        if (isStateIndexValid(index)) {
            this.mAnimationState.get(index).setProgress(progress);
        }
    }

    public final void setSpeed(float speed) {
        this.mSpeed = speed;
    }

    public final void stop(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int iNameToIndex = nameToIndex(name);
        if (iNameToIndex < 0) {
            return;
        }
        stop(iNameToIndex);
    }

    public static /* synthetic */ void play$default(AnimationController animationController, int i, int i2, float f, float f2, WrapMode wrapMode, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f = 1.0f;
        }
        float f3 = f;
        if ((i3 & 8) != 0) {
            f2 = vr3.UNSET;
        }
        float f4 = f2;
        if ((i3 & 16) != 0) {
            wrapMode = WrapMode.Clamp;
        }
        animationController.play(i, i2, f3, f4, wrapMode);
    }

    public final void play(int index, int layer, float speed, float startTime, @NotNull WrapMode wrapMode) {
        Intrinsics.checkNotNullParameter(wrapMode, "wrapMode");
        if (isStateIndexValid(index)) {
            int size = this.mPlayAnimationState.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    ArrayList<AnimationState> arrayList = this.mAnimationState;
                    Integer num = this.mPlayAnimationState.get(size);
                    Intrinsics.checkNotNullExpressionValue(num, "mPlayAnimationState[i]");
                    AnimationState animationState = arrayList.get(num.intValue());
                    Intrinsics.checkNotNullExpressionValue(animationState, "mAnimationState[mPlayAnimationState[i]]");
                    AnimationState animationState2 = animationState;
                    if (animationState2.getLayer() == layer || animationState2.getMIndex() == index) {
                        animationState2.stop();
                        this.mPlayAnimationState.remove(size);
                    }
                    if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            AnimationState animationState3 = this.mAnimationState.get(index);
            Intrinsics.checkNotNullExpressionValue(animationState3, "mAnimationState[index]");
            AnimationState animationState4 = animationState3;
            animationState4.setLayer(layer);
            this.mPlayAnimationState.add(Integer.valueOf(index));
            animationState4.play(speed, wrapMode);
            animationState4.setTime(startTime);
        }
    }

    public final void stop(int index) {
        if (isStateIndexValid(index)) {
            this.mAnimationState.get(index).stop();
        }
    }
}
