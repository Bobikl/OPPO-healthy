package com.oplus.aiunit.vision;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearHintRedDot;
import com.heytap.nearx.uikit.widget.NearRoundImageView;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 ;2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b9\u0010:J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J*\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0017R$\u0010*\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\n\u0010'\"\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001aR\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001aR\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u001aR\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u001aR\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105¨\u0006<"}, d2 = {"Lcom/oplus/aiunit/vision/wjc;", "", "", y04.TIME_STYLE_LEFT_DIR_NAME, y04.TIME_STYLE_RIGHT_DIR_NAME, "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/content/res/TypedArray;", "a", "b", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "c", "Landroidx/preference/Preference;", "preference", "Landroidx/preference/PreferenceViewHolder;", "view", "d", "", "Z", "isGroupStyle", "hasBorder", "I", "radius", "minRadius", "maxRadius", "", "f", UserInfo.SEX_FEMALE, "scale", b2n.f, "hasTitleIcon", "", b2n.g, "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "setMAssignment", "(Ljava/lang/CharSequence;)V", "mAssignment", "i", "mIconStyle", "j", "mIconRedDotMode", MapSchema.FIELD_NAME_KEY, "mEndRedDotMode", LogFieldKey.LEVEL_KEY, "mEndRedDotNum", "Landroid/view/View;", LogFieldKey.MESSAGE_KEY, "Landroid/view/View;", "iconRedDot", "n", "endRedDot", "<init>", "()V", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0})
public abstract class wjc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isGroupStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean hasBorder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int radius;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int minRadius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int maxRadius;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public float scale;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean hasTitleIcon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public CharSequence mAssignment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int mIconStyle = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int mIconRedDotMode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int mEndRedDotMode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int mEndRedDotNum;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public View iconRedDot;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View endRedDot;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CharSequence getMAssignment() {
        return this.mAssignment;
    }

    public void b(@NotNull Context context, @NotNull TypedArray a) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(a, "a");
        this.isGroupStyle = a.getBoolean(R$styleable.NearPreference_nxIsGroupMode, true);
        this.hasBorder = a.getBoolean(R$styleable.NearPreference_nxIsBorder, false);
        this.radius = a.getDimensionPixelSize(R$styleable.NearPreference_nxIconRadius, 14);
        float f = context.getResources().getDisplayMetrics().density;
        this.scale = f;
        float f2 = 3;
        this.minRadius = (int) ((14 * f) / f2);
        this.maxRadius = (int) ((36 * f) / f2);
        this.hasTitleIcon = a.getBoolean(R$styleable.NearPreference_nxHasTitleIcon, false);
        this.mAssignment = a.getText(R$styleable.NearPreference_nxAssignment);
        this.mIconStyle = a.getInt(R$styleable.NearPreference_nxIconStyle, 1);
        this.mIconRedDotMode = a.getInt(R$styleable.NearPreference_nxIconRedDotMode, 0);
        this.mEndRedDotMode = a.getInt(R$styleable.NearPreference_nxEndRedDotMode, 0);
        this.mEndRedDotNum = a.getInt(R$styleable.NearPreference_nxEndRedDotNum, 0);
    }

    public void c(@NotNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.NearPreference, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        b(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void d(@NotNull Preference preference, @NotNull PreferenceViewHolder view) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.img_layout);
        this.iconRedDot = view.findViewById(R$id.img_red_dot);
        this.endRedDot = view.findViewById(R$id.jump_icon_red_dot);
        View viewFindViewById2 = view.findViewById(R.id.icon);
        if (viewFindViewById2 instanceof NearRoundImageView) {
            if (viewFindViewById2.getHeight() != 0 && (drawable = ((NearRoundImageView) viewFindViewById2).getDrawable()) != null) {
                int intrinsicHeight = drawable.getIntrinsicHeight() / 6;
                this.radius = intrinsicHeight;
                int i = this.minRadius;
                if (intrinsicHeight < i) {
                    this.radius = i;
                } else {
                    int i2 = this.maxRadius;
                    if (intrinsicHeight > i2) {
                        this.radius = i2;
                    }
                }
            }
            NearRoundImageView nearRoundImageView = (NearRoundImageView) viewFindViewById2;
            nearRoundImageView.setHasBorder(this.hasBorder);
            nearRoundImageView.setBorderRectRadius(this.radius);
            nearRoundImageView.setType(this.mIconStyle);
        }
        View viewFindViewById3 = view.findViewById(R$id.assignment);
        TextView textView = viewFindViewById3 instanceof TextView ? (TextView) viewFindViewById3 : null;
        if (textView != null) {
            CharSequence mAssignment = getMAssignment();
            if (TextUtils.isEmpty(mAssignment)) {
                textView.setVisibility(8);
            } else {
                textView.setText(mAssignment);
                textView.setVisibility(0);
            }
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(viewFindViewById2 == null ? 8 : viewFindViewById2.getVisibility());
        }
        View view2 = this.iconRedDot;
        if (view2 instanceof NearHintRedDot) {
            if (this.mIconRedDotMode != 0) {
                if (view2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.widget.NearHintRedDot");
                }
                ((NearHintRedDot) view2).setLaidOut();
                View view3 = this.iconRedDot;
                if (view3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.widget.NearHintRedDot");
                }
                ((NearHintRedDot) view3).setVisibility(0);
                View view4 = this.iconRedDot;
                if (view4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.widget.NearHintRedDot");
                }
                ((NearHintRedDot) view4).setPointMode(this.mIconRedDotMode);
                View view5 = this.iconRedDot;
                if (view5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.widget.NearHintRedDot");
                }
                ((NearHintRedDot) view5).invalidate();
            } else {
                if (view2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.widget.NearHintRedDot");
                }
                ((NearHintRedDot) view2).setVisibility(8);
            }
        }
        View view6 = this.endRedDot;
        if (view6 instanceof NearHintRedDot) {
            if (this.mEndRedDotMode == 0) {
                if (view6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.widget.NearHintRedDot");
                }
                ((NearHintRedDot) view6).setVisibility(8);
                return;
            }
            if (view6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.widget.NearHintRedDot");
            }
            ((NearHintRedDot) view6).setLaidOut();
            View view7 = this.endRedDot;
            if (view7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.widget.NearHintRedDot");
            }
            ((NearHintRedDot) view7).setVisibility(0);
            View view8 = this.endRedDot;
            if (view8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.widget.NearHintRedDot");
            }
            ((NearHintRedDot) view8).setPointMode(this.mEndRedDotMode);
            View view9 = this.endRedDot;
            if (view9 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.widget.NearHintRedDot");
            }
            ((NearHintRedDot) view9).setPointNumber(this.mEndRedDotNum);
            View view10 = this.endRedDot;
            if (view10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.heytap.nearx.uikit.widget.NearHintRedDot");
            }
            ((NearHintRedDot) view10).invalidate();
        }
    }

    public abstract void e(int left, int right);
}
