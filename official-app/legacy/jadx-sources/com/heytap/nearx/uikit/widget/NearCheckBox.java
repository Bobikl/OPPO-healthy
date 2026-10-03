package com.heytap.nearx.uikit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.heytap.nearx.uikit.internal.widget.InnerCheckBox;
import com.oplus.aiunit.vision.i85;
import com.oplus.aiunit.vision.vgc;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\r\u0010\u0011B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\r\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearCheckBox;", "Lcom/heytap/nearx/uikit/internal/widget/InnerCheckBox;", "Landroid/widget/Checkable;", "", "isChecked", "checked", "", "setChecked", "Lcom/oplus/aiunit/vision/vgc;", "proxy", "Lcom/oplus/aiunit/vision/vgc;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public class NearCheckBox extends InnerCheckBox implements Checkable {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @NotNull
    private final vgc proxy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearCheckBox(@NotNull Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Object objC = i85.c();
        Intrinsics.checkNotNullExpressionValue(objC, "createNearCheckBoxDelegateDelegate()");
        vgc vgcVar = (vgc) objC;
        this.proxy = vgcVar;
        this._$_findViewCache = new LinkedHashMap();
        vgcVar.a(context, this);
    }

    @Override // com.heytap.nearx.uikit.internal.widget.InnerCheckBox
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.heytap.nearx.uikit.internal.widget.InnerCheckBox
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

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return getState() == InnerCheckBox.INSTANCE.a();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        setState(checked ? InnerCheckBox.INSTANCE.a() : InnerCheckBox.INSTANCE.b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Object objC = i85.c();
        Intrinsics.checkNotNullExpressionValue(objC, "createNearCheckBoxDelegateDelegate()");
        vgc vgcVar = (vgc) objC;
        this.proxy = vgcVar;
        this._$_findViewCache = new LinkedHashMap();
        vgcVar.a(context, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Object objC = i85.c();
        Intrinsics.checkNotNullExpressionValue(objC, "createNearCheckBoxDelegateDelegate()");
        vgc vgcVar = (vgc) objC;
        this.proxy = vgcVar;
        this._$_findViewCache = new LinkedHashMap();
        vgcVar.a(context, this);
    }
}
