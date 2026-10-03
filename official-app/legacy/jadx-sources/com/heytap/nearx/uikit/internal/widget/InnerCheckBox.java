package com.heytap.nearx.uikit.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatButton;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.fjc;
import com.oplus.aiunit.vision.fmc;
import com.oplus.aiunit.vision.kvi;
import com.oplus.aiunit.vision.xhc;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 :2\u00020\u0001:\u0003;<=B'\b\u0007\u0012\u0006\u00104\u001a\u000203\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00107\u001a\u00020\n¢\u0006\u0004\b8\u00109J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\nH\u0014J\b\u0010\u001d\u001a\u00020\u0002H\u0014J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\rH\u0014J\b\u0010 \u001a\u00020\u0002H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020!H\u0016R*\u0010%\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010&R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101¨\u0006>"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/InnerCheckBox;", "Landroidx/appcompat/widget/AppCompatButton;", "", "toggle", "", "performClick", "Lcom/heytap/nearx/uikit/internal/widget/InnerCheckBox$b;", "listener", "setOnStateChangeListener", "setOnStateChangeWidgetListener", "", "resid", "setButtonDrawable", "Landroid/graphics/drawable/Drawable;", "d", "Landroid/view/accessibility/AccessibilityEvent;", "event", "onInitializeAccessibilityEvent", "Landroid/view/accessibility/AccessibilityNodeInfo;", UTraceSQLiteHelperKt.COL_INFO, "onInitializeAccessibilityNodeInfo", "getCompoundPaddingLeft", "getCompoundPaddingRight", "Landroid/graphics/Canvas;", "canvas", "onDraw", "extraSpace", "", "onCreateDrawableState", "drawableStateChanged", "who", "verifyDrawable", "jumpDrawablesToCurrentState", "Landroid/os/Parcelable;", "onSaveInstanceState", "parcel", "onRestoreInstanceState", "state", "I", "getState", "()I", "setState", "(I)V", "mButtonResource", "mBroadcasting", "Z", "mButtonDrawable", "Landroid/graphics/drawable/Drawable;", "mOnStateChangeListener", "Lcom/heytap/nearx/uikit/internal/widget/InnerCheckBox$b;", "mOnStateChangeWidgetListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "b", "SavedState", "nearx_release"}, k = 1, mv = {1, 6, 0})
public class InnerCheckBox extends AppCompatButton {
    private static final int SELECT_NONE = 0;

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private boolean mBroadcasting;

    @Nullable
    private Drawable mButtonDrawable;
    private int mButtonResource;

    @Nullable
    private b mOnStateChangeListener;

    @Nullable
    private b mOnStateChangeWidgetListener;
    private int state;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_INDEX = 2;
    private static final int SELECT_PART = 1;
    private static int SELECT_ALL = 2;

    @NotNull
    private static final String TAG = "InnerCheckBox";

    @NotNull
    private static final int[] ALLSELECT_SET = {R$attr.NXtheme1_state_allSelect};

    @NotNull
    private static final int[] PARTSELECT_SET = {R$attr.NXtheme1_state_partSelect};

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/InnerCheckBox$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcel;", kvi.FLEXIBLE_OUT_RES_DIR_NAME, "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "", "toString", "describeContents", "state", "I", "getState", "()I", "setState", "(I)V", "Landroid/os/Parcelable;", "superState", "<init>", "(Landroid/os/Parcelable;)V", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "a", "nearx_release"}, k = 1, mv = {1, 6, 0})
    public static final class SavedState extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private int state;

        /* JADX INFO: renamed from: com.heytap.nearx.uikit.internal.widget.InnerCheckBox$SavedState$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/InnerCheckBox$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/nearx/uikit/internal/widget/InnerCheckBox$SavedState;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/heytap/nearx/uikit/internal/widget/InnerCheckBox$SavedState;", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
        public static final class Companion implements Parcelable.Creator<SavedState> {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int getState() {
            return this.state;
        }

        public final void setState(int i) {
            this.state = i;
        }

        @NotNull
        public String toString() {
            return "CompoundButton.SavedState{" + ((Object) Integer.toHexString(System.identityHashCode(this))) + " state=" + this.state + '}';
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeValue(Integer.valueOf(this.state));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcelable superState) {
            super(superState);
            Intrinsics.checkNotNullParameter(superState, "superState");
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            Integer num = (Integer) parcel.readValue(null);
            this.state = num == null ? 0 : num.intValue();
        }
    }

    /* JADX INFO: renamed from: com.heytap.nearx.uikit.internal.widget.InnerCheckBox$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/InnerCheckBox$a;", "", "", "SELECT_NONE", "I", "b", "()I", "SELECT_ALL", "a", "setSELECT_ALL", "(I)V", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return InnerCheckBox.SELECT_ALL;
        }

        public final int b() {
            return InnerCheckBox.SELECT_NONE;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/InnerCheckBox$b;", "", "Lcom/heytap/nearx/uikit/internal/widget/InnerCheckBox;", "buttonView", "", "getState", "", "onStateChanged", "nearx_release"}, k = 1, mv = {1, 6, 0})
    public interface b {
        void onStateChanged(@NotNull InnerCheckBox buttonView, int getState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerCheckBox(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mButtonDrawable;
        if (drawable == null) {
            return;
        }
        drawable.setState(getDrawableState());
        fjc.e(TAG, Intrinsics.stringPlus("drawableStateChanged: ", Integer.valueOf(getState())));
        invalidate();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        Drawable drawable;
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return (fmc.a(this) || (drawable = this.mButtonDrawable) == null) ? compoundPaddingLeft : compoundPaddingLeft + drawable.getIntrinsicWidth();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        Drawable drawable;
        int compoundPaddingRight = super.getCompoundPaddingRight();
        return (!fmc.a(this) || (drawable = this.mButtonDrawable) == null) ? compoundPaddingRight : compoundPaddingRight + drawable.getIntrinsicWidth();
    }

    @ViewDebug.ExportedProperty
    public final int getState() {
        return this.state;
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mButtonDrawable;
        if (drawable == null) {
            return;
        }
        drawable.jumpToCurrentState();
    }

    @Override // android.widget.TextView, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
        fjc.e(TAG, Intrinsics.stringPlus("onCreateDrawableState: ", Integer.valueOf(this.state)));
        if (this.state == SELECT_PART) {
            View.mergeDrawableStates(drawableState, PARTSELECT_SET);
        }
        if (this.state == SELECT_ALL) {
            View.mergeDrawableStates(drawableState, ALLSELECT_SET);
        }
        Intrinsics.checkNotNullExpressionValue(drawableState, "drawableState");
        return drawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        int height;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = this.mButtonDrawable;
        if (drawable != null) {
            int gravity = getGravity() & 112;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (gravity != 16) {
                height = gravity != 80 ? 0 : getHeight() - intrinsicHeight;
            } else {
                height = (getHeight() - intrinsicHeight) / 2;
            }
            int i = intrinsicHeight + height;
            int width = fmc.a(this) ? getWidth() - intrinsicWidth : 0;
            if (fmc.a(this)) {
                intrinsicWidth = getWidth();
            }
            drawable.setBounds(width, height, intrinsicWidth, i);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(width, height, intrinsicWidth, i);
            }
            drawable.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(InnerCheckBox.class.getName());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(InnerCheckBox.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        SavedState savedState = (SavedState) parcel;
        super.onRestoreInstanceState(savedState.getSuperState());
        setState(savedState.getState());
        requestLayout();
    }

    @Override // android.widget.TextView, android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        setFreezesText(true);
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.setState(getState());
        return savedState;
    }

    @Override // android.view.View
    public boolean performClick() {
        fjc.e(TAG, "performClick: ");
        toggle();
        return super.performClick();
    }

    public final void setButtonDrawable(int resid) {
        Drawable drawableA;
        if (resid == 0 || resid != this.mButtonResource) {
            this.mButtonResource = resid;
            if (resid != 0) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                drawableA = xhc.a(context, this.mButtonResource);
            } else {
                drawableA = null;
            }
            setButtonDrawable(drawableA);
        }
    }

    public final void setOnStateChangeListener(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnStateChangeListener = listener;
    }

    public final void setOnStateChangeWidgetListener(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnStateChangeWidgetListener = listener;
    }

    public final void setState(int i) {
        if (this.state != i) {
            this.state = i;
            refreshDrawableState();
            if (this.mBroadcasting) {
                return;
            }
            this.mBroadcasting = true;
            b bVar = this.mOnStateChangeListener;
            if (bVar != null) {
                bVar.onStateChanged(this, this.state);
            }
            b bVar2 = this.mOnStateChangeWidgetListener;
            if (bVar2 != null) {
                bVar2.onStateChanged(this, this.state);
            }
            this.mBroadcasting = false;
        }
    }

    public final void toggle() {
        fjc.e(TAG, Intrinsics.stringPlus("toggle: mState", Integer.valueOf(this.state)));
        int i = this.state;
        int i2 = MAX_INDEX;
        if (i >= i2) {
            i2 = SELECT_NONE;
        }
        setState(i2);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(@NotNull Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        return super.verifyDrawable(who) || who == this.mButtonDrawable;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearCheckBox, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…earCheckBox, defStyle, 0)");
        Drawable drawableB = xhc.b(context, typedArrayObtainStyledAttributes, R$styleable.NearCheckBox_nxBackground);
        if (drawableB != null) {
            setButtonDrawable(drawableB);
        }
        setState(typedArrayObtainStyledAttributes.getInteger(R$styleable.NearCheckBox_nxCheckState, SELECT_NONE));
        typedArrayObtainStyledAttributes.recycle();
        this._$_findViewCache = new LinkedHashMap();
    }

    public final void setButtonDrawable(@Nullable Drawable d) {
        if (d != null) {
            Drawable drawable = this.mButtonDrawable;
            if (drawable != null) {
                Intrinsics.checkNotNull(drawable);
                drawable.setCallback(null);
                unscheduleDrawable(this.mButtonDrawable);
            }
            d.setCallback(this);
            d.setState(getDrawableState());
            d.setVisible(getVisibility() == 0, false);
            this.mButtonDrawable = d;
            setMinHeight(d.getIntrinsicHeight());
        }
        refreshDrawableState();
    }

    public /* synthetic */ InnerCheckBox(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.NearCheckBoxStyle : i);
    }
}
