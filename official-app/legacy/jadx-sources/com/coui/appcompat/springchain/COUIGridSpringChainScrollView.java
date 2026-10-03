package com.coui.appcompat.springchain;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.coui.appcompat.scrollview.COUIScrollView;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.en9;
import com.oplus.aiunit.vision.ifk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(29)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B\u001b\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/coui/appcompat/springchain/COUIGridSpringChainScrollView;", "Lcom/coui/appcompat/scrollview/COUIScrollView;", "", "onFinishInflate", "Landroid/view/MotionEvent;", "ev", "", "onTouchEvent", ExifInterface.LONGITUDE_EAST, "D", "event", UserInfo.SEX_FEMALE, "", "distance", "lastDistance", "C", "", "f0", "I", "hasReleaseSpring", "g0", "downY", "h0", "curDistance", "i0", "Z", "shouldUpdateDownY", "j0", "inheritDistance", "Lcom/oplus/aiunit/vision/en9;", "k0", "Lcom/oplus/aiunit/vision/en9;", "edgeSpringChainViewGroup", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "coui-support-springchain_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"LongLogTag"})
public final class COUIGridSpringChainScrollView extends COUIScrollView {

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public int hasReleaseSpring;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public float downY;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public float curDistance;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public boolean shouldUpdateDownY;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public float inheritDistance;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    @Nullable
    public en9 edgeSpringChainViewGroup;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public COUIGridSpringChainScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setEnableVibrator(false);
        setCustomOverScrollDistFactor(0.3f);
        setOverScrollMode(0);
    }

    public final float C(float distance, float lastDistance) {
        if (lastDistance * distance <= 0.0f) {
            return distance;
        }
        en9 en9Var = this.edgeSpringChainViewGroup;
        return (RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtLeast(1 - Math.abs(lastDistance / RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtLeast(((getHeight() * 0.5f) - Math.abs(en9Var != null ? en9Var.e() : 0.0f)) / 0.25f, 0.0f), (getHeight() * 0.5f) / 0.25f)), 0.0f), 1.0f) * (distance - lastDistance)) + lastDistance;
    }

    public final boolean D() {
        View childAt = getChildAt(0);
        return childAt != null && getScrollY() + getHeight() >= childAt.getMeasuredHeight();
    }

    public final boolean E() {
        return getScrollY() <= 0;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114  */
    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x009b, please report this as an issue */
    public final boolean F(MotionEvent event) {
        int iIntValue;
        en9 en9Var;
        en9 en9Var2;
        float rawY = event.getRawY(ifk.e(event, event.getActionIndex()));
        int action = event.getAction() & 255;
        if (action == 0) {
            this.downY = rawY;
            this.curDistance = 0.0f;
            this.inheritDistance = 0.0f;
            en9 en9Var3 = this.edgeSpringChainViewGroup;
            if ((en9Var3 != null ? Integer.valueOf(en9Var3.a()) : null) != null) {
                en9 en9Var4 = this.edgeSpringChainViewGroup;
                Integer numValueOf = en9Var4 != null ? Integer.valueOf(en9Var4.a()) : null;
                Intrinsics.checkNotNull(numValueOf);
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            this.hasReleaseSpring = iIntValue;
            if (iIntValue != 0 && (en9Var = this.edgeSpringChainViewGroup) != null) {
                en9Var.d();
            }
            Log.d("EdgeSpringChainScrollView", "onEdgeSpringEvent : ACTION_DOWN : hasReleaseSpring=:" + this.hasReleaseSpring);
        } else if (action == 1) {
            this.curDistance = C((rawY - this.downY) + this.inheritDistance, this.curDistance);
            Log.d("EdgeSpringChainScrollView", "onEdgeSpringEvent : ACTION_UP/CANCEL : curDistance=:" + this.curDistance + " ,isReachTopEdge()=:" + E() + " ,isReachBottomEdge()=:" + D() + " ,hasReleaseSpring=:" + this.hasReleaseSpring);
            if (this.curDistance <= 0.0f && E()) {
                en9 en9Var5 = this.edgeSpringChainViewGroup;
                if (en9Var5 != null) {
                    en9Var5.c(1);
                }
                return true;
            }
            if (this.curDistance >= 0.0f && D()) {
                en9 en9Var6 = this.edgeSpringChainViewGroup;
                if (en9Var6 != null) {
                    en9Var6.c(2);
                }
                return true;
            }
            if (this.hasReleaseSpring != 0) {
                this.downY = rawY;
                en9Var2 = this.edgeSpringChainViewGroup;
                if (en9Var2 != null) {
                    en9Var2.c(0);
                }
            } else {
                this.downY = rawY;
            }
        } else if (action == 2) {
            if (this.shouldUpdateDownY) {
                this.downY = rawY;
                this.shouldUpdateDownY = false;
            }
            float fC = C((rawY - this.downY) + this.inheritDistance, this.curDistance);
            this.curDistance = fC;
            if (fC > 0.0f && E()) {
                en9 en9Var7 = this.edgeSpringChainViewGroup;
                if (en9Var7 != null) {
                    en9Var7.b(this.curDistance, 1);
                }
                return true;
            }
            if (this.curDistance < 0.0f && D()) {
                en9 en9Var8 = this.edgeSpringChainViewGroup;
                if (en9Var8 != null) {
                    en9Var8.b(this.curDistance, 2);
                }
                return true;
            }
            if (this.hasReleaseSpring != 0) {
                this.downY = rawY;
                en9 en9Var9 = this.edgeSpringChainViewGroup;
                if (en9Var9 != null) {
                    en9Var9.b(0.0f, 0);
                }
            } else {
                this.downY = rawY;
            }
        } else if (action == 3) {
            this.curDistance = C((rawY - this.downY) + this.inheritDistance, this.curDistance);
            Log.d("EdgeSpringChainScrollView", "onEdgeSpringEvent : ACTION_UP/CANCEL : curDistance=:" + this.curDistance + " ,isReachTopEdge()=:" + E() + " ,isReachBottomEdge()=:" + D() + " ,hasReleaseSpring=:" + this.hasReleaseSpring);
            if (this.curDistance <= 0.0f) {
            }
            if (this.curDistance >= 0.0f) {
            }
            if (this.hasReleaseSpring != 0) {
                this.downY = rawY;
                en9Var2 = this.edgeSpringChainViewGroup;
                if (en9Var2 != null) {
                    en9Var2.c(0);
                }
            } else {
                this.downY = rawY;
            }
        } else if (action == 5 || action == 6) {
            this.inheritDistance = this.curDistance;
            this.shouldUpdateDownY = true;
            Log.d("EdgeSpringChainScrollView", "onEdgeSpringEvent : ACTION_POINTER_DOWN/UP : inheritDistance=:" + this.inheritDistance);
        }
        return false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() <= 0 || !(getChildAt(0) instanceof en9)) {
            return;
        }
        KeyEvent.Callback childAt = getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.coui.appcompat.springchain.ICOUIGridSpringChainViewGroup");
        this.edgeSpringChainViewGroup = (en9) childAt;
    }

    @Override // com.coui.appcompat.scrollview.COUIScrollView, android.widget.ScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        F(ev);
        return super.onTouchEvent(ev);
    }
}
