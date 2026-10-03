package com.coui.appcompat.poplist;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u000b\u0018\u0000 )2\u00020\u0001:\u0002*\tB\u0007¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ)\u0010\u0014\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR.\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006+"}, d2 = {"Lcom/coui/appcompat/poplist/WindowSpacingControlHelper;", "", "", "i", "", "margin", "Lcom/coui/appcompat/poplist/WindowSpacingControlHelper$AnchorViewTypeEnum;", "enumType", "", "a", "d", "Landroid/view/View;", "anchorView", "c", b2n.g, "", "anchorViewLocationInScreen", "resultOriginCenterPoint", "j", MapSchema.FIELD_NAME_ENTRY, "f", "(Ljava/lang/Integer;Landroid/view/View;Lcom/coui/appcompat/poplist/WindowSpacingControlHelper$AnchorViewTypeEnum;)I", "parentView", "parentLocation", "anchorViewLocation", b2n.f, "b", "", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "", "Ljava/util/Map;", "getMarginMap", "()Ljava/util/Map;", "setMarginMap", "(Ljava/util/Map;)V", "marginMap", "<init>", "()V", "Companion", "AnchorViewTypeEnum", "coui-support-poplist_release"}, k = 1, mv = {1, 8, 0})
public final class WindowSpacingControlHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1872c = 1;
    public static final int d = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "WindowSpacingControlHelper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Map<AnchorViewTypeEnum, Integer> marginMap = new HashMap();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/coui/appcompat/poplist/WindowSpacingControlHelper$AnchorViewTypeEnum;", "", "(Ljava/lang/String;I)V", "NORMAL", "TOOLBAR", "NAVIGATION", "START", "END", "TOP", "BOTTOM", "coui-support-poplist_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum AnchorViewTypeEnum {
        NORMAL,
        TOOLBAR,
        NAVIGATION,
        START,
        END,
        TOP,
        BOTTOM
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnchorViewTypeEnum.values().length];
            try {
                iArr[AnchorViewTypeEnum.TOOLBAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnchorViewTypeEnum.NAVIGATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void a(int margin, @NotNull AnchorViewTypeEnum enumType) {
        Intrinsics.checkNotNullParameter(enumType, "enumType");
        Map<AnchorViewTypeEnum, Integer> map = this.marginMap;
        if (map != null) {
            map.put(enumType, Integer.valueOf(margin));
        }
    }

    public final boolean b(View anchorView, AnchorViewTypeEnum enumType) {
        int i = b.$EnumSwitchMapping$0[enumType.ordinal()];
        if (i == 1) {
            return anchorView instanceof Toolbar;
        }
        if (i != 2) {
            return false;
        }
        return anchorView instanceof BottomNavigationView;
    }

    public final int c(@NotNull View anchorView, @NotNull AnchorViewTypeEnum enumType) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(enumType, "enumType");
        if (this.marginMap.isEmpty() || this.marginMap.get(enumType) == null) {
            return 0;
        }
        return f(this.marginMap.get(enumType), anchorView, enumType);
    }

    public final int d(@NotNull AnchorViewTypeEnum enumType) {
        Integer num;
        Intrinsics.checkNotNullParameter(enumType, "enumType");
        if (this.marginMap.isEmpty() || this.marginMap.get(enumType) == null || (num = this.marginMap.get(enumType)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @NotNull
    public final AnchorViewTypeEnum e(@NotNull View anchorView) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        while (!(anchorView instanceof Toolbar)) {
            if (anchorView instanceof BottomNavigationView) {
                return AnchorViewTypeEnum.NAVIGATION;
            }
            if (!(anchorView.getParent() instanceof View)) {
                Log.e(WindowSpacingControlHelper.class.getName(), "getAnchorViewTypeEnum  tempView " + anchorView.getClass().getName());
                return AnchorViewTypeEnum.NORMAL;
            }
            Object parent = anchorView.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            anchorView = (View) parent;
        }
        return AnchorViewTypeEnum.TOOLBAR;
    }

    public final int f(Integer margin, View anchorView, AnchorViewTypeEnum enumType) {
        View view = anchorView;
        while (view != null) {
            if (b(view, enumType)) {
                int[] iArr = new int[2];
                anchorView.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                Integer numValueOf = margin != null ? Integer.valueOf(margin.intValue() + g(view, anchorView, iArr2, iArr, enumType)) : null;
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            }
            if (!(view.getParent() instanceof View)) {
                Log.e(WindowSpacingControlHelper.class.getName(), "getToolbarViewSpacing  tempView " + view.getClass().getName());
                if (margin != null) {
                    return margin.intValue();
                }
                return 0;
            }
            Object parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            view = (View) parent;
        }
        if (margin != null) {
            return margin.intValue();
        }
        return 0;
    }

    public final int g(View parentView, View anchorView, int[] parentLocation, int[] anchorViewLocation, AnchorViewTypeEnum enumType) {
        int height;
        int height2;
        int iH = h(enumType);
        if (iH == f1872c) {
            height = parentLocation[1];
            height2 = anchorViewLocation[1];
        } else {
            if (iH != d) {
                return 0;
            }
            height = parentLocation[1] + parentView.getHeight();
            height2 = anchorViewLocation[1] + anchorView.getHeight();
        }
        return height - height2;
    }

    public final int h(@NotNull AnchorViewTypeEnum enumType) {
        Intrinsics.checkNotNullParameter(enumType, "enumType");
        int i = b.$EnumSwitchMapping$0[enumType.ordinal()];
        if (i != 1) {
            return i != 2 ? f1872c : f1872c;
        }
        return d;
    }

    public final boolean i() {
        return !this.marginMap.isEmpty();
    }

    @SuppressLint({"LongLogTag"})
    public final void j(@NotNull int[] anchorViewLocationInScreen, @NotNull int[] resultOriginCenterPoint, @NotNull View anchorView) {
        Intrinsics.checkNotNullParameter(anchorViewLocationInScreen, "anchorViewLocationInScreen");
        Intrinsics.checkNotNullParameter(resultOriginCenterPoint, "resultOriginCenterPoint");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        if (anchorView.getWidth() <= 0 || anchorView.getHeight() <= 0) {
            Log.e(this.TAG, "setOriginCenterPoint anchorView.width <= 0 or anchorView.height <= 0");
            resultOriginCenterPoint[0] = (int) anchorView.getPivotX();
            resultOriginCenterPoint[1] = (int) anchorView.getPivotY();
        }
        float pivotX = anchorView.getPivotX() / anchorView.getWidth();
        float pivotY = anchorView.getPivotY() / anchorView.getHeight();
        float f = 2;
        float scaleX = anchorViewLocationInScreen[0] + ((anchorView.getScaleX() * anchorView.getWidth()) / f);
        float scaleY = anchorViewLocationInScreen[1] + ((anchorView.getScaleY() * anchorView.getHeight()) / f);
        float f2 = 1;
        resultOriginCenterPoint[0] = Math.round(scaleX + ((pivotX - 0.5f) * (anchorView.getScaleX() - f2) * anchorView.getWidth()));
        resultOriginCenterPoint[1] = Math.round(scaleY + ((pivotY - 0.5f) * (anchorView.getScaleY() - f2) * anchorView.getHeight()));
    }
}
