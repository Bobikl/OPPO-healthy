package com.oplusos.vfxmodelviewer.view;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplusos.vfxmodelviewer.filament.Camera;
import com.oplusos.vfxmodelviewer.filament.TransformManager;
import com.oplusos.vfxmodelviewer.utils.Float2;
import com.oplusos.vfxmodelviewer.utils.Float3;
import com.oplusos.vfxmodelviewer.utils.Float4;
import com.oplusos.vfxmodelviewer.utils.Mat4;
import com.oplusos.vfxmodelviewer.view.input.TouchSlideScrollGesture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b%\b\u0007\u0018\u00002\u00020\u0001:\u0002opB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010;\u001a\u00020\bJ\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000fH\u0002J\u0006\u0010?\u001a\u00020\u0016J!\u0010@\u001a\u00020=2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0B2\u0006\u0010C\u001a\u00020\u0006¢\u0006\u0002\u0010DJ\b\u0010E\u001a\u00020=H\u0002J\b\u0010F\u001a\u00020=H\u0002J\b\u0010G\u001a\u00020=H\u0014J\b\u0010H\u001a\u00020=H\u0014J\b\u0010I\u001a\u00020=H\u0014J\u0016\u0010J\u001a\u00020=2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020LJ\u0010\u0010N\u001a\u00020=2\u0006\u0010O\u001a\u00020\u0006H\u0014J\b\u0010P\u001a\u00020=H\u0002J\b\u0010Q\u001a\u00020=H\u0002J\u0006\u0010R\u001a\u00020=J\u001e\u0010S\u001a\u00020=2\u0006\u0010T\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u0006J\u000e\u0010W\u001a\u00020=2\u0006\u0010X\u001a\u00020\u0006J\u000e\u0010Y\u001a\u00020=2\u0006\u0010X\u001a\u00020\u0006J\u000e\u0010Z\u001a\u00020=2\u0006\u0010[\u001a\u00020\u0006J\u000e\u0010\\\u001a\u00020=2\u0006\u0010]\u001a\u00020\u0006J\u0010\u0010^\u001a\u00020=2\b\u0010_\u001a\u0004\u0018\u000108J\u0006\u0010`\u001a\u00020=J\b\u0010a\u001a\u00020=H\u0002J\b\u0010b\u001a\u00020=H\u0002J\b\u0010c\u001a\u00020=H\u0002J\b\u0010d\u001a\u00020=H\u0002J\b\u0010e\u001a\u00020=H\u0002J\b\u0010f\u001a\u00020=H\u0002J\u0010\u0010g\u001a\u00020=2\u0006\u0010O\u001a\u00020\u0006H\u0002J\u0010\u0010h\u001a\u00020=2\u0006\u0010C\u001a\u00020\u0006H\u0002J\u0010\u0010i\u001a\u00020=2\u0006\u0010O\u001a\u00020\u0006H\u0002J\u0010\u0010j\u001a\u00020=2\u0006\u0010O\u001a\u00020\u0006H\u0002J\u0010\u0010k\u001a\u00020=2\u0006\u0010O\u001a\u00020\u0006H\u0002J\u0010\u0010l\u001a\u00020=2\u0006\u0010O\u001a\u00020\u0006H\u0002J\u0010\u0010m\u001a\u00020=2\u0006\u0010O\u001a\u00020\u0006H\u0002J\u0010\u0010n\u001a\u00020=2\u0006\u0010O\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006q"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/CameraController;", "Lcom/oplusos/vfxmodelviewer/view/SceneComponent;", "scene", "Lcom/oplusos/vfxmodelviewer/view/ModelScene;", "(Lcom/oplusos/vfxmodelviewer/view/ModelScene;)V", "mAspect", "", "mCamera", "Lcom/oplusos/vfxmodelviewer/filament/Camera;", "mCameraLocalMat", "Lcom/oplusos/vfxmodelviewer/utils/Mat4;", "mCameraMat", "mCameraMatArray", "", "mCenterAngle", "Lcom/oplusos/vfxmodelviewer/utils/Float3;", "mCenterForward", "mCenterMat", "mCenterPos", "mCenterRotation", "Lcom/oplusos/vfxmodelviewer/view/Quaternion;", "mControlTime", "", "mCurrentDis", "mCurrentRotateSpeed", "mCurrentSlide", "Lcom/oplusos/vfxmodelviewer/utils/Float2;", "mDampValue", "mDefaultCenterRotation", "mDefaultDis", "mGesture", "Lcom/oplusos/vfxmodelviewer/view/input/TouchSlideScrollGesture;", "mLookUp", "mMaxDis", "mMaxDisPecent", "mMinDis", "mMinDisPecent", "mNoTouchTimeCount", "mRecoverTime", "mRotateDirection", "Lcom/oplusos/vfxmodelviewer/utils/Float4;", "mRotateSpeed", "mRotateVec", "mSlideSpeed", "mStartControlTime", "mStartDis", "mStartEyePos", "mStartRecoveryRotation", "mState", "Lcom/oplusos/vfxmodelviewer/view/CameraController$State;", "mStateTime", "mTargetDis", "mTargetSlide", "mTouchListener", "Landroid/view/View$OnTouchListener;", "mView", "Landroid/view/View;", "mViewport", "", "getCamera", "getCenterAngle", "", "angle", "getControlTime", "getFrustumCorners", "resultCorners", "", "distance", "([Lcom/oplusos/vfxmodelviewer/utils/Float3;F)V", "handleEndControl", "handleStartControl", "onDestroy", "onDisable", "onEnable", "onResize", "width", "", "height", "onUpdate", "deltaTime", "refreshMinMaxDis", "resetCenter", "resetImmediately", "setCenterPos", "x", "y", "z", "setFarPecent", "pecent", "setNearPecent", "setRecoverTime", "duration", "setRotateSpeed", ClickApiEntity.SPEED, "setView", "view", "startReset", "switchToControl", "switchToControlOver", "switchToControlOverToRotate", "switchToIdle", "switchToRecover", "switchToRotate", "updateCameraMatrix", "updateCameraMatrixFromCenter", "updateControl", "updateControlOver", "updateControlOverToRotate", "updateIdle", "updateRecover", "updateRotate", "State", "TouchListener", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
public final class CameraController extends SceneComponent {
    private float mAspect;

    @NotNull
    private Camera mCamera;

    @NotNull
    private Mat4 mCameraLocalMat;

    @NotNull
    private Mat4 mCameraMat;

    @NotNull
    private float[] mCameraMatArray;

    @NotNull
    private Float3 mCenterAngle;

    @NotNull
    private Float3 mCenterForward;

    @NotNull
    private Mat4 mCenterMat;

    @NotNull
    private Float3 mCenterPos;

    @NotNull
    private Quaternion mCenterRotation;
    private long mControlTime;
    private float mCurrentDis;
    private float mCurrentRotateSpeed;

    @NotNull
    private Float2 mCurrentSlide;
    private float mDampValue;

    @NotNull
    private Quaternion mDefaultCenterRotation;
    private float mDefaultDis;

    @NotNull
    private TouchSlideScrollGesture mGesture;

    @NotNull
    private Float3 mLookUp;
    private float mMaxDis;
    private float mMaxDisPecent;
    private float mMinDis;
    private float mMinDisPecent;
    private float mNoTouchTimeCount;
    private float mRecoverTime;

    @NotNull
    private Float4 mRotateDirection;
    private float mRotateSpeed;

    @NotNull
    private Float3 mRotateVec;
    private float mSlideSpeed;
    private long mStartControlTime;
    private float mStartDis;

    @NotNull
    private Float3 mStartEyePos;

    @NotNull
    private Quaternion mStartRecoveryRotation;

    @NotNull
    private State mState;
    private float mStateTime;
    private float mTargetDis;

    @NotNull
    private Float2 mTargetSlide;

    @NotNull
    private final View.OnTouchListener mTouchListener;

    @Nullable
    private View mView;

    @NotNull
    private int[] mViewport;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/CameraController$State;", "", "(Ljava/lang/String;I)V", "None", "Idle", "Control", "ControlOver", "Rotate", "Recover", "ControlOverToRotate", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum State {
        None,
        Idle,
        Control,
        ControlOver,
        Rotate,
        Recover,
        ControlOverToRotate
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/CameraController$TouchListener;", "Landroid/view/View$OnTouchListener;", "(Lcom/oplusos/vfxmodelviewer/view/CameraController;)V", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class TouchListener implements View.OnTouchListener {
        final /* synthetic */ CameraController this$0;

        public TouchListener(CameraController cameraController) {
            Intrinsics.checkNotNullParameter(cameraController, "this$0");
            this.this$0 = cameraController;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NotNull View v, @NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(v, "v");
            Intrinsics.checkNotNullParameter(event, "event");
            if (!this.this$0.getMEnable()) {
                return true;
            }
            if (this.this$0.mState != State.Control) {
                this.this$0.switchToControl();
                this.this$0.handleStartControl();
            } else if (event.getActionMasked() == 1 || event.getActionMasked() == 3) {
                this.this$0.switchToControlOver();
                this.this$0.handleEndControl();
            }
            this.this$0.mGesture.onTouchEvent(event);
            this.this$0.mNoTouchTimeCount = vr3.UNSET;
            return true;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.Recover.ordinal()] = 1;
            iArr[State.Control.ordinal()] = 2;
            iArr[State.Idle.ordinal()] = 3;
            iArr[State.Rotate.ordinal()] = 4;
            iArr[State.ControlOver.ordinal()] = 5;
            iArr[State.ControlOverToRotate.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraController(@NotNull ModelScene modelScene) {
        super(modelScene);
        Intrinsics.checkNotNullParameter(modelScene, "scene");
        this.mTouchListener = new TouchListener(this);
        this.mViewport = new int[2];
        this.mCenterPos = new Float3(vr3.UNSET, vr3.UNSET, -4.0f);
        this.mStartEyePos = new Float3(vr3.UNSET, vr3.UNSET, 1.0f);
        this.mMinDis = 9.0f;
        this.mMaxDis = 45.0f;
        this.mMinDisPecent = 0.75f;
        this.mMaxDisPecent = 1.5f;
        this.mCenterMat = new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);
        this.mCenterForward = new Float3(vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null);
        this.mCenterRotation = new Quaternion(vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 15, null);
        this.mCenterAngle = new Float3(vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null);
        this.mDefaultCenterRotation = new Quaternion(vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 15, null);
        this.mStartRecoveryRotation = new Quaternion(vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 15, null);
        this.mTargetSlide = new Float2(vr3.UNSET, vr3.UNSET, 3, null);
        this.mCurrentSlide = new Float2(vr3.UNSET, vr3.UNSET, 3, null);
        this.mRotateDirection = new Float4(vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 15, null);
        this.mRotateVec = new Float3(vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null);
        this.mCameraLocalMat = new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);
        this.mCameraMat = new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);
        this.mCameraMatArray = new float[16];
        this.mLookUp = new Float3(vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null);
        this.mSlideSpeed = 21.0f;
        this.mRotateSpeed = 20.0f;
        this.mRecoverTime = 1.0f;
        this.mState = State.None;
        this.mDampValue = 7.2f;
        this.mGesture = new TouchSlideScrollGesture();
        this.mAspect = 1.0f;
        Camera cameraCreateCamera = getMScene().getMEngine().createCamera(getMScene().getMEngine().getEntityManager().create());
        Intrinsics.checkNotNullExpressionValue(cameraCreateCamera, "mScene.getEngine().createCamera(cameraEntity)");
        cameraCreateCamera.setExposure(16.0f, 0.008f, 100.0f);
        Unit unit = Unit.INSTANCE;
        this.mCamera = cameraCreateCamera;
        resetCenter();
        refreshMinMaxDis();
        switchToRotate();
    }

    private final void getCenterAngle(Float3 angle) {
        this.mCenterRotation.toEulerAngles(angle);
        angle.setX(angle.getX() % 360.0f);
        if (angle.getX() >= 180.0f) {
            angle.setX(angle.getX() - 360.0f);
        } else if (angle.getX() <= -180.0f) {
            angle.setX(angle.getX() + 360.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEndControl() {
        this.mControlTime += System.nanoTime() - this.mStartControlTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleStartControl() {
        this.mStartControlTime = System.nanoTime();
    }

    private final void refreshMinMaxDis() {
        Math.Companion companion = Math.INSTANCE;
        Float3 float3 = this.mCenterPos;
        Float3 float4 = this.mStartEyePos;
        float fMagnitude = companion.magnitude(new Float3(float3.getX() - float4.getX(), float3.getY() - float4.getY(), float3.getZ() - float4.getZ()));
        this.mDefaultDis = fMagnitude;
        this.mMinDis = this.mMinDisPecent * fMagnitude;
        this.mMaxDis = fMagnitude * this.mMaxDisPecent;
    }

    private final void resetCenter() {
        this.mCenterForward.setX(this.mCenterPos.getX() - this.mStartEyePos.getX());
        this.mCenterForward.setY(this.mCenterPos.getY() - this.mStartEyePos.getY());
        this.mCenterForward.setZ(this.mCenterPos.getZ() - this.mStartEyePos.getZ());
        Math.Companion companion = Math.INSTANCE;
        this.mCurrentDis = companion.magnitude(this.mCenterForward);
        companion.normalizeVec3(this.mCenterForward);
        companion.setFloat3(this.mLookUp, vr3.UNSET, 1.0f, vr3.UNSET);
        Quaternion.Companion companion2 = Quaternion.INSTANCE;
        companion2.nLookRotation(this.mCenterRotation, this.mCenterForward, this.mLookUp);
        companion2.copy(this.mCenterRotation, this.mDefaultCenterRotation);
        companion.composeMatrix(this.mCenterMat, this.mCenterPos, this.mCenterRotation, companion.getOneVec3());
        updateCameraMatrixFromCenter(this.mCurrentDis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchToControl() {
        this.mTargetDis = this.mCurrentDis;
        this.mTargetSlide.setX(this.mGesture.getSlideDeltaX());
        this.mTargetSlide.setY(this.mGesture.getSlideDeltaY());
        this.mCurrentSlide.setX(vr3.UNSET);
        this.mCurrentSlide.setY(vr3.UNSET);
        this.mState = State.Control;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchToControlOver() {
        this.mState = State.ControlOver;
        this.mTargetSlide.setX(vr3.UNSET);
        this.mTargetSlide.setY(vr3.UNSET);
        this.mStateTime = vr3.UNSET;
    }

    private final void switchToControlOverToRotate() {
        this.mState = State.ControlOverToRotate;
        this.mCurrentRotateSpeed = this.mRotateSpeed * 2.0f;
        this.mStateTime = vr3.UNSET;
    }

    private final void switchToIdle() {
        this.mState = State.Idle;
        this.mStateTime = vr3.UNSET;
        getMScene().setRenderDirty();
    }

    private final void switchToRecover() {
        this.mState = State.Recover;
        this.mStartRecoveryRotation = this.mCenterRotation;
        this.mStartDis = this.mCurrentDis;
        this.mStateTime = vr3.UNSET;
    }

    private final void switchToRotate() {
        this.mState = State.Rotate;
        this.mCurrentRotateSpeed = this.mRotateSpeed;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x009d A[PHI: r2
  0x009d: PHI (r2v18 float) = (r2v13 float), (r2v14 float) binds: [B:3:0x009b, B:6:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    private final void updateCameraMatrix(float deltaTime) {
        float f = this.mDampValue * deltaTime;
        float f2 = (-this.mSlideSpeed) * deltaTime;
        Float2 float2 = this.mCurrentSlide;
        Math.Companion companion = Math.INSTANCE;
        float2.setX(companion.lerp(float2.getX(), this.mTargetSlide.getX(), f));
        Float2 float3 = this.mCurrentSlide;
        float3.setY(companion.lerp(float3.getY(), this.mTargetSlide.getY(), f));
        companion.matToForward(this.mCenterForward, this.mCenterMat);
        companion.setFloat4(this.mRotateDirection, (16 & 2) != 0 ? 0.0f : -this.mCenterForward.getX(), (16 & 4) != 0 ? 0.0f : -this.mCenterForward.getY(), (16 & 8) != 0 ? 0.0f : -this.mCenterForward.getZ(), (16 & 16) != 0 ? 0.0f : vr3.UNSET);
        companion.rotateByYAxis(this.mRotateVec, this.mCurrentSlide.getX() * f2, this.mRotateDirection);
        companion.normalizeVec3(this.mRotateVec);
        companion.setFloat3(this.mLookUp, vr3.UNSET, 1.0f, vr3.UNSET);
        Quaternion.INSTANCE.nLookRotation(this.mCenterRotation, this.mRotateVec, this.mLookUp);
        getCenterAngle(this.mCenterAngle);
        Float3 float4 = this.mCenterAngle;
        float4.setX(float4.getX() + (this.mCurrentSlide.getY() * f2));
        Float3 float5 = this.mCenterAngle;
        float x = float5.getX();
        float f3 = -85.0f;
        if (x < -85.0f) {
            x = f3;
        } else {
            f3 = 85.0f;
            if (x > 85.0f) {
                x = f3;
            }
        }
        float5.setX(x);
        this.mCenterRotation.fromEuler(this.mCenterAngle.getX(), this.mCenterAngle.getY(), this.mCenterAngle.getZ());
        companion.composeMatrix(this.mCenterMat, this.mCenterPos, this.mCenterRotation, companion.getOneVec3());
        float fLerp = companion.lerp(this.mCurrentDis, this.mTargetDis, f);
        this.mCurrentDis = fLerp;
        updateCameraMatrixFromCenter(fLerp);
    }

    private final void updateCameraMatrixFromCenter(float distance) {
        Math.Companion companion = Math.INSTANCE;
        companion.translationMat4(this.mCameraLocalMat, vr3.UNSET, vr3.UNSET, distance);
        companion.mat4MulMat4(this.mCameraMat, this.mCenterMat, this.mCameraLocalMat);
        companion.mat4ToFloatArray(this.mCameraMat, this.mCameraMatArray);
        this.mCamera.setModelMatrix(this.mCameraMatArray);
    }

    private final void updateControl(float deltaTime) {
        this.mTargetSlide.setX(this.mGesture.getSlideDeltaX());
        this.mTargetSlide.setY(this.mGesture.getSlideDeltaY());
        float mScrollValue = this.mTargetDis + (this.mGesture.getMScrollValue() * (-0.6f) * deltaTime);
        this.mTargetDis = mScrollValue;
        float f = this.mMinDis;
        float f2 = this.mMaxDis;
        if (mScrollValue < f) {
            mScrollValue = f;
        } else if (mScrollValue > f2) {
            mScrollValue = f2;
        }
        this.mTargetDis = mScrollValue;
        updateCameraMatrix(deltaTime);
        float fAbs = java.lang.Math.abs(this.mCurrentDis - this.mTargetDis);
        if (Math.INSTANCE.sqrMagnitude(this.mCurrentSlide.getX(), this.mCurrentSlide.getY()) >= 0.01f || fAbs >= 0.001f) {
            getMScene().setRenderDirty();
        }
        float f3 = this.mNoTouchTimeCount + deltaTime;
        this.mNoTouchTimeCount = f3;
        if (f3 >= 3.0f) {
            switchToControlOver();
        }
    }

    private final void updateControlOver(float deltaTime) {
        updateCameraMatrix(deltaTime);
        this.mStateTime += deltaTime;
        if (java.lang.Math.abs(this.mCurrentDis - this.mTargetDis) > 0.01f || Math.INSTANCE.sqrMagnitude(this.mCurrentSlide.getX(), this.mCurrentSlide.getY()) > 0.01f) {
            return;
        }
        switchToControlOverToRotate();
    }

    private final void updateControlOverToRotate(float deltaTime) {
        float f = this.mStateTime + deltaTime;
        this.mStateTime = f;
        float f2 = f / 10.0f;
        if (f2 < vr3.UNSET) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        getCenterAngle(this.mCenterAngle);
        Float3 float3 = this.mCenterAngle;
        Math.Companion companion = Math.INSTANCE;
        float3.setX(companion.lerp(float3.getX(), vr3.UNSET, f2));
        this.mCenterRotation.fromEuler(this.mCenterAngle.getX(), this.mCenterAngle.getY(), this.mCenterAngle.getZ());
        companion.composeMatrix(this.mCenterMat, this.mCenterPos, this.mCenterRotation, companion.getOneVec3());
        this.mCurrentDis = companion.lerp(this.mCurrentDis, this.mDefaultDis, f2);
        this.mCurrentRotateSpeed = companion.lerp(this.mCurrentRotateSpeed, this.mRotateSpeed, f2);
        updateCameraMatrixFromCenter(this.mCurrentDis);
        updateRotate(deltaTime);
        if (f2 >= 1.0f) {
            switchToRotate();
        }
    }

    private final void updateIdle(float deltaTime) {
        float f = this.mStateTime + deltaTime;
        this.mStateTime = f;
        if (f >= 0.5f) {
            switchToRotate();
        }
    }

    private final void updateRecover(float deltaTime) {
        float f = this.mStateTime + deltaTime;
        this.mStateTime = f;
        float f2 = this.mRecoverTime;
        float f3 = f2 > vr3.UNSET ? f / f2 : 1.0f;
        if (f3 < vr3.UNSET) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        Math.Companion companion = Math.INSTANCE;
        float fEaseInOutCubic = companion.easeInOutCubic(vr3.UNSET, 1.0f, f3);
        Quaternion.INSTANCE.slerp(this.mCenterRotation, this.mStartRecoveryRotation, this.mDefaultCenterRotation, fEaseInOutCubic);
        companion.composeMatrix(this.mCenterMat, this.mCenterPos, this.mCenterRotation, companion.getOneVec3());
        float fLerp = companion.lerp(this.mStartDis, this.mDefaultDis, fEaseInOutCubic);
        this.mCurrentDis = fLerp;
        updateCameraMatrixFromCenter(fLerp);
        if (fEaseInOutCubic >= 1.0f) {
            switchToRotate();
        }
    }

    private final void updateRotate(float deltaTime) {
        Math.Companion companion = Math.INSTANCE;
        companion.matToForward(this.mCenterForward, this.mCenterMat);
        companion.setFloat4(this.mRotateDirection, (16 & 2) != 0 ? 0.0f : -this.mCenterForward.getX(), (16 & 4) != 0 ? 0.0f : -this.mCenterForward.getY(), (16 & 8) != 0 ? 0.0f : -this.mCenterForward.getZ(), (16 & 16) != 0 ? 0.0f : vr3.UNSET);
        companion.rotateByYAxis(this.mRotateVec, this.mCurrentRotateSpeed * deltaTime, this.mRotateDirection);
        companion.setFloat3(this.mLookUp, vr3.UNSET, 1.0f, vr3.UNSET);
        Quaternion.INSTANCE.lookRotation(this.mCenterRotation, this.mRotateVec, this.mLookUp);
        companion.composeMatrix(this.mCenterMat, this.mCenterPos, this.mCenterRotation, companion.getOneVec3());
        updateCameraMatrixFromCenter(this.mCurrentDis);
    }

    @NotNull
    /* JADX INFO: renamed from: getCamera, reason: from getter */
    public final Camera getMCamera() {
        return this.mCamera;
    }

    public final long getControlTime() {
        return (long) (this.mControlTime / ((double) 1000000));
    }

    public final void getFrustumCorners(@NotNull Float3[] resultCorners, float distance) {
        Intrinsics.checkNotNullParameter(resultCorners, "resultCorners");
        if (resultCorners.length < 4) {
            throw new RuntimeException("Corners size is less then 4 ");
        }
        float fTan = ((float) java.lang.Math.tan(0.3926925f)) * distance;
        float f = this.mAspect * fTan;
        TransformManager transformManager = getMScene().getMEngine().getTransformManager();
        Intrinsics.checkNotNullExpressionValue(transformManager, "mScene.getEngine().transformManager");
        transformManager.getWorldTransform(transformManager.getInstance(this.mCamera.getEntity()), this.mCameraMatArray);
        Mat4 mat4 = new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);
        Math.INSTANCE.floatArrayToMat4(mat4, this.mCameraMatArray);
        Float4 w = mat4.getW();
        Float3 float3 = new Float3(w.getX(), w.getY(), w.getZ());
        Float4 z = mat4.getZ();
        Float3 float3UnaryMinus = new Float3(z.getX(), z.getY(), z.getZ()).unaryMinus();
        Float4 y = mat4.getY();
        Float3 float4 = new Float3(y.getX(), y.getY(), y.getZ());
        Float4 x = mat4.getX();
        Float3 float5 = new Float3(x.getX(), x.getY(), x.getZ());
        float x2 = float3.getX() + (float3UnaryMinus.getX() * distance);
        float y2 = float3.getY() + (float3UnaryMinus.getY() * distance);
        float z2 = float3.getZ() + (distance * float3UnaryMinus.getZ());
        float x3 = float4.getX() * fTan;
        float y3 = float4.getY() * fTan;
        float z3 = fTan * float4.getZ();
        float x4 = float5.getX() * f;
        float y4 = float5.getY() * f;
        float z4 = f * float5.getZ();
        float f2 = x2 - x3;
        resultCorners[0].setX(f2 - x4);
        float f3 = y2 - y3;
        resultCorners[0].setY(f3 - y4);
        float f4 = z2 - z3;
        resultCorners[0].setZ(f4 - z4);
        resultCorners[1].setX(f2 + x4);
        resultCorners[1].setY(f3 + y4);
        resultCorners[1].setZ(f4 + z4);
        float f5 = x2 + x3;
        resultCorners[2].setX(f5 - x4);
        float f6 = y2 + y3;
        resultCorners[2].setY(f6 - y4);
        float f7 = z2 + z3;
        resultCorners[2].setZ(f7 - z4);
        resultCorners[3].setX(f5 + x4);
        resultCorners[3].setY(f6 + y4);
        resultCorners[3].setZ(f7 + z4);
    }

    @Override // com.oplusos.vfxmodelviewer.view.SceneComponent
    public void onDestroy() {
        getMScene().getMEngine().destroyCameraComponent(this.mCamera.getEntity());
        getMScene().getMEngine().destroyEntity(this.mCamera.getEntity());
        this.mView = null;
    }

    @Override // com.oplusos.vfxmodelviewer.view.SceneComponent
    public void onDisable() {
        if (this.mState == State.Control) {
            switchToControlOver();
            handleEndControl();
        }
        View view = this.mView;
        if (view != null) {
            view.setOnTouchListener(null);
        }
        this.mGesture.endGesture();
    }

    @Override // com.oplusos.vfxmodelviewer.view.SceneComponent
    public void onEnable() {
        View view = this.mView;
        if (view == null) {
            return;
        }
        view.setOnTouchListener(this.mTouchListener);
    }

    public final void onResize(int width, int height) {
        int[] iArr = this.mViewport;
        iArr[0] = width;
        iArr[1] = height;
        double d = ((double) width) / ((double) height);
        this.mAspect = (float) d;
        this.mCamera.setProjection(45.0d, d, 0.5d, 100.0d, Camera.Fov.VERTICAL);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.oplusos.vfxmodelviewer.view.SceneComponent
    public void onUpdate(float deltaTime) {
        boolean z = true;
        switch (WhenMappings.$EnumSwitchMapping$0[this.mState.ordinal()]) {
            case 1:
                updateRecover(deltaTime);
                break;
            case 2:
                updateControl(deltaTime);
                z = false;
                break;
            case 3:
                updateIdle(deltaTime);
                z = false;
                break;
            case 4:
                updateRotate(deltaTime);
                break;
            case 5:
                updateControlOver(deltaTime);
                break;
            case 6:
                updateControlOverToRotate(deltaTime);
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            getMScene().setRenderDirty();
        }
    }

    public final void resetImmediately() {
        resetCenter();
        switchToIdle();
    }

    public final void setCenterPos(float x, float y, float z) {
        Math.INSTANCE.setFloat3(this.mCenterPos, x, y, z);
        refreshMinMaxDis();
    }

    public final void setFarPecent(float pecent) {
        this.mMaxDisPecent = pecent;
        this.mMaxDis = this.mDefaultDis * pecent;
    }

    public final void setNearPecent(float pecent) {
        this.mMinDisPecent = pecent;
        this.mMinDis = this.mDefaultDis * pecent;
    }

    public final void setRecoverTime(float duration) {
        this.mRecoverTime = duration;
    }

    public final void setRotateSpeed(float speed) {
        this.mRotateSpeed = speed;
    }

    public final void setView(@Nullable View view) {
        if (Intrinsics.areEqual(this.mView, view)) {
            return;
        }
        View view2 = this.mView;
        if (view2 != null) {
            view2.setOnTouchListener(null);
        }
        this.mView = view;
        if (view != null && getMEnable()) {
            view.setOnTouchListener(this.mTouchListener);
        }
    }

    public final void startReset() {
        switchToRecover();
    }
}
