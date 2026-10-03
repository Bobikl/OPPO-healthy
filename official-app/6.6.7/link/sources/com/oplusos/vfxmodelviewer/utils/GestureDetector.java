package com.oplusos.vfxmodelviewer.utils;

import android.view.MotionEvent;
import android.view.View;
import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.ParserTag;
import com.oplusos.vfxmodelviewer.view.Math;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002()B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\nH\u0002J\b\u0010#\u001a\u00020\nH\u0002J\b\u0010$\u001a\u00020\nH\u0002J\u000e\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/GestureDetector;", "", "view", "Landroid/view/View;", "manipulator", "Lcom/oplusos/vfxmodelviewer/utils/Manipulator;", "(Landroid/view/View;Lcom/oplusos/vfxmodelviewer/utils/Manipulator;)V", "currentGesture", "Lcom/oplusos/vfxmodelviewer/utils/GestureDetector$Gesture;", "enableZoom", "", "getEnableZoom", "()Z", "setEnableZoom", "(Z)V", "kGestureConfidenceCount", "", "kPanConfidenceDistance", "kZoomConfidenceDistance", "kZoomSpeed", "", "previousTouch", "Lcom/oplusos/vfxmodelviewer/utils/GestureDetector$TouchPair;", "tentativeOrbitEvents", "Ljava/util/ArrayList;", "tentativePanEvents", "tentativeZoomEvents", "zoomValue", "getZoomValue", "()F", "setZoomValue", "(F)V", "endGesture", "", "isOrbitGesture", "isPanGesture", "isZoomGesture", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "Gesture", "TouchPair", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GestureDetector {

    @NotNull
    private Gesture currentGesture;
    private boolean enableZoom;
    private final int kGestureConfidenceCount;
    private final int kPanConfidenceDistance;
    private final int kZoomConfidenceDistance;
    private final float kZoomSpeed;

    @NotNull
    private final Manipulator manipulator;

    @NotNull
    private TouchPair previousTouch;

    @NotNull
    private final ArrayList<TouchPair> tentativeOrbitEvents;

    @NotNull
    private final ArrayList<TouchPair> tentativePanEvents;

    @NotNull
    private final ArrayList<TouchPair> tentativeZoomEvents;

    @NotNull
    private final View view;
    private float zoomValue;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/GestureDetector$Gesture;", "", "(Ljava/lang/String;I)V", "NONE", "ORBIT", "PAN", "ZOOM", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Gesture {
        NONE,
        ORBIT,
        PAN,
        ZOOM
    }

    public GestureDetector(@NotNull View view, @NotNull Manipulator manipulator) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(manipulator, "manipulator");
        this.view = view;
        this.manipulator = manipulator;
        this.currentGesture = Gesture.NONE;
        this.previousTouch = new TouchPair();
        this.tentativePanEvents = new ArrayList<>();
        this.tentativeOrbitEvents = new ArrayList<>();
        this.tentativeZoomEvents = new ArrayList<>();
        this.kGestureConfidenceCount = 2;
        this.kPanConfidenceDistance = 4;
        this.kZoomConfidenceDistance = 10;
        this.kZoomSpeed = 0.1f;
        this.enableZoom = true;
    }

    private final void endGesture() {
        this.tentativePanEvents.clear();
        this.tentativeOrbitEvents.clear();
        this.tentativeZoomEvents.clear();
        this.currentGesture = Gesture.NONE;
        this.manipulator.grabEnd();
    }

    private final boolean isOrbitGesture() {
        return this.tentativeOrbitEvents.size() > this.kGestureConfidenceCount;
    }

    private final boolean isPanGesture() {
        if (this.tentativePanEvents.size() <= this.kGestureConfidenceCount) {
            return false;
        }
        Float2 midpoint = ((TouchPair) CollectionsKt.first(this.tentativePanEvents)).getMidpoint();
        Float2 midpoint2 = ((TouchPair) CollectionsKt.last(this.tentativePanEvents)).getMidpoint();
        Float2 float2 = new Float2(midpoint.getX() - midpoint2.getX(), midpoint.getY() - midpoint2.getY());
        return ((float) Math.sqrt((double) ((float2.getX() * float2.getX()) + (float2.getY() * float2.getY())))) > ((float) this.kPanConfidenceDistance);
    }

    private final boolean isZoomGesture() {
        if (this.tentativeZoomEvents.size() <= this.kGestureConfidenceCount) {
            return false;
        }
        return Math.abs(((TouchPair) CollectionsKt.last(this.tentativeZoomEvents)).getSeparation() - ((TouchPair) CollectionsKt.first(this.tentativeZoomEvents)).getSeparation()) > ((float) this.kZoomConfidenceDistance);
    }

    public final boolean getEnableZoom() {
        return this.enableZoom;
    }

    public final float getZoomValue() {
        return this.zoomValue;
    }

    public final void onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        TouchPair touchPair = new TouchPair(event, this.view.getHeight());
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if ((event.getPointerCount() != 1 && this.currentGesture == Gesture.ORBIT) || ((event.getPointerCount() != 2 && this.currentGesture == Gesture.PAN) || (event.getPointerCount() != 2 && this.currentGesture == Gesture.ZOOM))) {
                    endGesture();
                    return;
                }
                Gesture gesture = this.currentGesture;
                Gesture gesture2 = Gesture.ZOOM;
                if (gesture == gesture2) {
                    this.zoomValue = this.previousTouch.getSeparation() - touchPair.getSeparation();
                    if (this.enableZoom) {
                        this.manipulator.scroll(touchPair.getX(), touchPair.getY(), this.zoomValue * this.kZoomSpeed);
                    }
                    this.previousTouch = touchPair;
                    return;
                }
                if (gesture != Gesture.NONE) {
                    this.manipulator.grabUpdate(touchPair.getX(), touchPair.getY());
                    return;
                }
                if (event.getPointerCount() == 1) {
                    this.tentativeOrbitEvents.add(touchPair);
                }
                if (event.getPointerCount() == 2) {
                    this.tentativeZoomEvents.add(touchPair);
                }
                if (isOrbitGesture()) {
                    this.manipulator.grabBegin(touchPair.getX(), touchPair.getY(), false);
                    this.currentGesture = Gesture.ORBIT;
                    return;
                } else if (!isZoomGesture()) {
                    isPanGesture();
                    return;
                } else {
                    this.currentGesture = gesture2;
                    this.previousTouch = touchPair;
                    return;
                }
            }
            if (actionMasked != 3) {
                return;
            }
        }
        endGesture();
    }

    public final void setEnableZoom(boolean z) {
        this.enableZoom = z;
    }

    public final void setZoomValue(float f) {
        this.zoomValue = f;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\b\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001d\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u0006\u0010\"\u001a\u00020\u0000J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J'\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\t\u0010-\u001a\u00020.HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0014\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000eR\u0011\u0010 \u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\u000e¨\u00060"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/GestureDetector$TouchPair;", "", "()V", "me", "Landroid/view/MotionEvent;", "height", "", "(Landroid/view/MotionEvent;I)V", "pt0", "Lcom/oplusos/vfxmodelviewer/utils/Float2;", "pt1", ParserTag.DATA_SAME_COUNT, "(Lcom/oplusos/vfxmodelviewer/utils/Float2;Lcom/oplusos/vfxmodelviewer/utils/Float2;I)V", "getCount", "()I", "setCount", "(I)V", "lerpVec", "midpoint", "getMidpoint", "()Lcom/oplusos/vfxmodelviewer/utils/Float2;", "getPt0", "setPt0", "(Lcom/oplusos/vfxmodelviewer/utils/Float2;)V", "getPt1", "setPt1", "separation", "", "getSeparation", "()F", "x", "getX", "y", "getY", "clone", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "set", "", "toString", "", "Companion", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class TouchPair {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private int count;

        @NotNull
        private Float2 lerpVec;

        @NotNull
        private Float2 pt0;

        @NotNull
        private Float2 pt1;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/GestureDetector$TouchPair$Companion;", "", "()V", "copy", "", "source", "Lcom/oplusos/vfxmodelviewer/utils/GestureDetector$TouchPair;", "from", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void copy(@NotNull TouchPair source, @NotNull TouchPair from) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(from, "from");
                Float2 pt0 = source.getPt0();
                Float2 pt1 = from.getPt0();
                pt0.setX(pt1.getX());
                pt0.setY(pt1.getY());
                Float2 pt2 = source.getPt1();
                Float2 pt3 = from.getPt1();
                pt2.setX(pt3.getX());
                pt2.setY(pt3.getY());
                source.setCount(from.getCount());
            }
        }

        public TouchPair(@NotNull Float2 float2, @NotNull Float2 float3, int i) {
            Intrinsics.checkNotNullParameter(float2, "pt0");
            Intrinsics.checkNotNullParameter(float3, "pt1");
            this.pt0 = float2;
            this.pt1 = float3;
            this.count = i;
            this.lerpVec = new Float2(vr3.UNSET, vr3.UNSET, 3, null);
        }

        public static /* synthetic */ TouchPair copy$default(TouchPair touchPair, Float2 float2, Float2 float3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                float2 = touchPair.pt0;
            }
            if ((i2 & 2) != 0) {
                float3 = touchPair.pt1;
            }
            if ((i2 & 4) != 0) {
                i = touchPair.count;
            }
            return touchPair.copy(float2, float3, i);
        }

        @NotNull
        public final TouchPair clone() {
            TouchPair touchPair = new TouchPair();
            INSTANCE.copy(touchPair, this);
            return touchPair;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Float2 getPt0() {
            return this.pt0;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Float2 getPt1() {
            return this.pt1;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        @NotNull
        public final TouchPair copy(@NotNull Float2 pt0, @NotNull Float2 pt1, int count) {
            Intrinsics.checkNotNullParameter(pt0, "pt0");
            Intrinsics.checkNotNullParameter(pt1, "pt1");
            return new TouchPair(pt0, pt1, count);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TouchPair)) {
                return false;
            }
            TouchPair touchPair = (TouchPair) other;
            return Intrinsics.areEqual(this.pt0, touchPair.pt0) && Intrinsics.areEqual(this.pt1, touchPair.pt1) && this.count == touchPair.count;
        }

        public final int getCount() {
            return this.count;
        }

        @NotNull
        public final Float2 getMidpoint() {
            Math.INSTANCE.lerp(this.lerpVec, this.pt0, this.pt1, 0.5f);
            return this.lerpVec;
        }

        @NotNull
        public final Float2 getPt0() {
            return this.pt0;
        }

        @NotNull
        public final Float2 getPt1() {
            return this.pt1;
        }

        public final float getSeparation() {
            return Math.INSTANCE.distance(this.pt0, this.pt1);
        }

        public final int getX() {
            return (int) getMidpoint().getX();
        }

        public final int getY() {
            return (int) getMidpoint().getY();
        }

        public int hashCode() {
            return (((this.pt0.hashCode() * 31) + this.pt1.hashCode()) * 31) + Integer.hashCode(this.count);
        }

        public final void set(@NotNull MotionEvent me, int height) {
            Intrinsics.checkNotNullParameter(me, "me");
            if (me.getPointerCount() >= 1) {
                this.pt0.setX(me.getX(0));
                this.pt0.setY(height - me.getY(0));
                this.pt1.setX(this.pt0.getX());
                this.pt1.setY(this.pt0.getY());
                this.count++;
            }
            if (me.getPointerCount() >= 2) {
                this.pt1.setX(me.getX(1));
                this.pt1.setY(height - me.getY(1));
                this.count++;
            }
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public final void setPt0(@NotNull Float2 float2) {
            Intrinsics.checkNotNullParameter(float2, "<set-?>");
            this.pt0 = float2;
        }

        public final void setPt1(@NotNull Float2 float2) {
            Intrinsics.checkNotNullParameter(float2, "<set-?>");
            this.pt1 = float2;
        }

        @NotNull
        public String toString() {
            return "TouchPair(pt0=" + this.pt0 + ", pt1=" + this.pt1 + ", count=" + this.count + ')';
        }

        public TouchPair() {
            this(new Float2(vr3.UNSET), new Float2(vr3.UNSET), 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TouchPair(@NotNull MotionEvent motionEvent, int i) {
            this();
            Intrinsics.checkNotNullParameter(motionEvent, "me");
            set(motionEvent, i);
        }
    }
}
