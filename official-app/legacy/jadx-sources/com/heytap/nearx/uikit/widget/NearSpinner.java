package com.heytap.nearx.uikit.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\rB3\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u000e\u001a\u00060\u000fR\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0013R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearSpinner;", "Landroidx/appcompat/widget/AppCompatSpinner;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mode", "", "(Landroid/content/Context;I)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "popupTheme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V", "mListener", "Lcom/heytap/nearx/uikit/widget/NearSpinner$OnStateChangedListener;", "mOpenInitiated", "", "onDismiss", "", "onWindowFocusChanged", "hasFocus", "performClick", "setStateChangedListener", "listener", "OnStateChangedListener", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearSpinner extends AppCompatSpinner {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private OnStateChangedListener mListener;
    private boolean mOpenInitiated;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearSpinner$OnStateChangedListener;", "", "onDismiss", "", "parent", "Landroid/widget/AdapterView;", "onShow", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnStateChangedListener {
        void onDismiss(@NotNull AdapterView<?> parent);

        void onShow(@NotNull AdapterView<?> parent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearSpinner(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
    }

    private final void onDismiss() {
        this.mOpenInitiated = false;
        OnStateChangedListener onStateChangedListener = this.mListener;
        if (onStateChangedListener == null) {
            return;
        }
        onStateChangedListener.onDismiss(this);
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

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasFocus) {
        if (this.mOpenInitiated && hasFocus) {
            onDismiss();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner, android.widget.Spinner, android.view.View
    public boolean performClick() {
        this.mOpenInitiated = true;
        OnStateChangedListener onStateChangedListener = this.mListener;
        if (onStateChangedListener != null) {
            onStateChangedListener.onShow(this);
        }
        return super.performClick();
    }

    public final void setStateChangedListener(@NotNull OnStateChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearSpinner(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearSpinner(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this._$_findViewCache = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearSpinner(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this._$_findViewCache = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearSpinner(@NotNull Context context, @NotNull AttributeSet attrs, int i, int i2) {
        super(context, attrs, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this._$_findViewCache = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearSpinner(@NotNull Context context, @NotNull AttributeSet attrs, int i, int i2, @NotNull Resources.Theme popupTheme) {
        super(context, attrs, i, i2, popupTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(popupTheme, "popupTheme");
        this._$_findViewCache = new LinkedHashMap();
    }
}
