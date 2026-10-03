package com.heytap.sporthealth.blib.weiget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.coui.appcompat.cardlist.COUICardListSelectedItemLayout;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.qtf;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000f\u0010\u0004\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/heytap/sporthealth/blib/weiget/ItemListAutoShapeCard;", "Lcom/coui/appcompat/cardlist/COUICardListSelectedItemLayout;", "", "onAttachedToWindow", LogFieldKey.PROCESS_NAME_KEY, "()V", "Ljava/lang/reflect/Field;", "M", "Ljava/lang/reflect/Field;", "declaredField", "", "N", "I", "dp16", "value", "O", "getMargging", "()I", "setMargging", "(I)V", "margging", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardItemLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardItemLayout.kt\ncom/heytap/sporthealth/blib/weiget/ItemListAutoShapeCard\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n*L\n1#1,312:1\n155#2:313\n*S KotlinDebug\n*F\n+ 1 CardItemLayout.kt\ncom/heytap/sporthealth/blib/weiget/ItemListAutoShapeCard\n*L\n61#1:313\n*E\n"})
public class ItemListAutoShapeCard extends COUICardListSelectedItemLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @Nullable
    public Field declaredField;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public final int dp16;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public int margging;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ItemListAutoShapeCard(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int getMargging() {
        return this.margging;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p();
    }

    public void p() {
        ViewParent parent = getParent();
        Unit unit = null;
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            int iIndexOfChild = viewGroup.indexOfChild(this);
            boolean z = iIndexOfChild == viewGroup.getChildCount() - 1;
            boolean z2 = iIndexOfChild == 0;
            if (!z && !z2) {
                setPositionInGroup(2);
            } else if (z2 && z) {
                setPositionInGroup(4);
            } else if (z2) {
                setPositionInGroup(1);
            } else if (z) {
                setPositionInGroup(3);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            setPositionInGroup(4);
        }
    }

    public final void setMargging(int i) throws IllegalAccessException, NoSuchFieldException {
        Unit unit;
        this.margging = i;
        Field field = this.declaredField;
        if (field != null) {
            field.set(this, Integer.valueOf(i));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            Field declaredField = COUICardListSelectedItemLayout.class.getDeclaredField("x");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(i));
            this.declaredField = declaredField;
        }
    }

    public /* synthetic */ ItemListAutoShapeCard(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ItemListAutoShapeCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int iB = qtf.b(16.0f);
        this.dp16 = iB;
        this.margging = iB;
    }
}
