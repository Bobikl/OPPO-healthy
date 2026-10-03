package com.heytap.health.health_archives.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.health_archives.R$string;
import com.heytap.health.health_archives.R$styleable;
import com.heytap.health.health_archives.databinding.HealthArchivesBadgeTextLayoutBinding;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.xu5;
import com.oplus.aiunit.vision.y0k;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;
import io.protostuff.MapSchema;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/heytap/health/health_archives/view/ArchiveBadgeTextView;", "Landroid/widget/RelativeLayout;", "", "count", "", "setBadgeCount", "", "selected", "setSelected", ViewEntity.ENABLED, ClickApiEntity.SET_ENABLED, "Landroid/view/MotionEvent;", "event", "onTouchEvent", "Lcom/heytap/health/health_archives/databinding/HealthArchivesBadgeTextLayoutBinding;", "i", "Lcom/heytap/health/health_archives/databinding/HealthArchivesBadgeTextLayoutBinding;", "mBinding", "", "j", UserInfo.SEX_FEMALE, "downX", MapSchema.FIELD_NAME_KEY, "downY", LogFieldKey.LEVEL_KEY, "I", "clickThreshold", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class ArchiveBadgeTextView extends RelativeLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public HealthArchivesBadgeTextLayoutBinding mBinding;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float downX;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float downY;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int clickThreshold;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArchiveBadgeTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        COUIHintRedDot cOUIHintRedDot;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.clickThreshold = xu5.a(context, 15.0f);
        this.mBinding = HealthArchivesBadgeTextLayoutBinding.b(LayoutInflater.from(context), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ArchiveBadgeTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ble.ArchiveBadgeTextView)");
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.ArchiveBadgeTextView_badgeText);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.ArchiveBadgeTextView_badgeCount, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.ArchiveBadgeTextView_badgeTextColor);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.ArchiveBadgeTextView_badgeTextSize, xu5.a(context, 12.0f));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ArchiveBadgeTextView_badgeBackground, -1);
        typedArrayObtainStyledAttributes.recycle();
        setEnabled(false);
        HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding = this.mBinding;
        AppCompatTextView appCompatTextView4 = healthArchivesBadgeTextLayoutBinding != null ? healthArchivesBadgeTextLayoutBinding.k : null;
        if (appCompatTextView4 != null) {
            appCompatTextView4.setText(string);
        }
        HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding2 = this.mBinding;
        if (healthArchivesBadgeTextLayoutBinding2 != null && (appCompatTextView3 = healthArchivesBadgeTextLayoutBinding2.k) != null) {
            appCompatTextView3.setTextColor(colorStateList);
        }
        HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding3 = this.mBinding;
        if (healthArchivesBadgeTextLayoutBinding3 != null && (appCompatTextView2 = healthArchivesBadgeTextLayoutBinding3.k) != null) {
            appCompatTextView2.setTextSize(0, dimension);
        }
        HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding4 = this.mBinding;
        if (healthArchivesBadgeTextLayoutBinding4 != null && (appCompatTextView = healthArchivesBadgeTextLayoutBinding4.k) != null) {
            appCompatTextView.setBackgroundResource(resourceId);
        }
        if (i <= 0) {
            HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding5 = this.mBinding;
            cOUIHintRedDot = healthArchivesBadgeTextLayoutBinding5 != null ? healthArchivesBadgeTextLayoutBinding5.f4387j : null;
            if (cOUIHintRedDot == null) {
                return;
            }
            cOUIHintRedDot.setVisibility(8);
            return;
        }
        HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding6 = this.mBinding;
        COUIHintRedDot cOUIHintRedDot2 = healthArchivesBadgeTextLayoutBinding6 != null ? healthArchivesBadgeTextLayoutBinding6.f4387j : null;
        if (cOUIHintRedDot2 != null) {
            cOUIHintRedDot2.setPointNumber(i);
        }
        HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding7 = this.mBinding;
        cOUIHintRedDot = healthArchivesBadgeTextLayoutBinding7 != null ? healthArchivesBadgeTextLayoutBinding7.f4387j : null;
        if (cOUIHintRedDot == null) {
            return;
        }
        cOUIHintRedDot.setVisibility(8);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        Intrinsics.checkNotNullParameter(event, "event");
        HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding = this.mBinding;
        CharSequence text = null;
        Boolean boolValueOf = (healthArchivesBadgeTextLayoutBinding == null || (appCompatTextView2 = healthArchivesBadgeTextLayoutBinding.k) == null) ? null : Boolean.valueOf(appCompatTextView2.isEnabled());
        int action = event.getAction();
        if (action == 0) {
            this.downX = event.getX();
            this.downY = event.getY();
            return true;
        }
        if (action != 1) {
            return super.onTouchEvent(event);
        }
        float x = event.getX() - this.downX;
        float y = event.getY() - this.downY;
        if (((int) Math.sqrt((x * x) + (y * y))) < this.clickThreshold) {
            Intrinsics.checkNotNull(boolValueOf);
            if (boolValueOf.booleanValue()) {
                performClick();
            } else {
                Context context = getContext();
                int i = R$string.health_archives_no_system_exceptions;
                Object[] objArr = new Object[1];
                HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding2 = this.mBinding;
                if (healthArchivesBadgeTextLayoutBinding2 != null && (appCompatTextView = healthArchivesBadgeTextLayoutBinding2.k) != null) {
                    text = appCompatTextView.getText();
                }
                String lowerCase = String.valueOf(text).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                objArr[0] = lowerCase;
                y0k.i(context.getString(i, objArr));
            }
        }
        return true;
    }

    public final void setBadgeCount(int count) {
        COUIHintRedDot cOUIHintRedDot;
        if (count <= 0) {
            HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding = this.mBinding;
            cOUIHintRedDot = healthArchivesBadgeTextLayoutBinding != null ? healthArchivesBadgeTextLayoutBinding.f4387j : null;
            if (cOUIHintRedDot == null) {
                return;
            }
            cOUIHintRedDot.setVisibility(8);
            return;
        }
        HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding2 = this.mBinding;
        COUIHintRedDot cOUIHintRedDot2 = healthArchivesBadgeTextLayoutBinding2 != null ? healthArchivesBadgeTextLayoutBinding2.f4387j : null;
        if (cOUIHintRedDot2 != null) {
            cOUIHintRedDot2.setVisibility(8);
        }
        HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding3 = this.mBinding;
        cOUIHintRedDot = healthArchivesBadgeTextLayoutBinding3 != null ? healthArchivesBadgeTextLayoutBinding3.f4387j : null;
        if (cOUIHintRedDot == null) {
            return;
        }
        cOUIHintRedDot.setPointNumber(count);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        AppCompatTextView appCompatTextView;
        HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding = this.mBinding;
        AppCompatTextView appCompatTextView2 = healthArchivesBadgeTextLayoutBinding != null ? healthArchivesBadgeTextLayoutBinding.k : null;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setEnabled(enabled);
        }
        if (enabled) {
            HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding2 = this.mBinding;
            appCompatTextView = healthArchivesBadgeTextLayoutBinding2 != null ? healthArchivesBadgeTextLayoutBinding2.k : null;
            if (appCompatTextView != null) {
                appCompatTextView.setTypeface(Typeface.DEFAULT_BOLD);
            }
        } else {
            HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding3 = this.mBinding;
            COUIHintRedDot cOUIHintRedDot = healthArchivesBadgeTextLayoutBinding3 != null ? healthArchivesBadgeTextLayoutBinding3.f4387j : null;
            if (cOUIHintRedDot != null) {
                cOUIHintRedDot.setVisibility(8);
            }
            HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding4 = this.mBinding;
            appCompatTextView = healthArchivesBadgeTextLayoutBinding4 != null ? healthArchivesBadgeTextLayoutBinding4.k : null;
            if (appCompatTextView != null) {
                appCompatTextView.setTypeface(Typeface.DEFAULT);
            }
        }
        super.setEnabled(enabled);
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        HealthArchivesBadgeTextLayoutBinding healthArchivesBadgeTextLayoutBinding = this.mBinding;
        AppCompatTextView appCompatTextView = healthArchivesBadgeTextLayoutBinding != null ? healthArchivesBadgeTextLayoutBinding.k : null;
        if (appCompatTextView != null) {
            appCompatTextView.setSelected(selected);
        }
        super.setSelected(selected);
    }
}
