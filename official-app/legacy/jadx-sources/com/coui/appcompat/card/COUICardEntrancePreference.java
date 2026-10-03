package com.coui.appcompat.card;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.preference.PreferenceViewHolder;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.sm2;
import com.support.appcompat.R$attr;
import com.support.card.R$layout;
import com.support.card.R$styleable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 32\u00020\u0001:\u00014B1\b\u0007\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010/\u001a\u00020\u0006\u0012\b\b\u0002\u00100\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0004J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002R*\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR*\u0010&\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u00065"}, d2 = {"Lcom/coui/appcompat/card/COUICardEntrancePreference;", "Lcom/coui/appcompat/card/COUIPressFeedbackJumpPreference;", "", "summary", "", "setSummary", "", "summaryResId", "Landroidx/preference/PreferenceViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "r", "onBindViewHolder", "", "statusOn", "G", "n", "cardType", LogFieldKey.PROCESS_NAME_KEY, "value", "R", "I", "o", "()I", ExifInterface.LONGITUDE_EAST, "(I)V", "S", "Z", "getShowSummary", "()Z", UserInfo.SEX_FEMALE, "(Z)V", "showSummary", ExifInterface.GPS_DIRECTION_TRUE, "getStatusOn", "setStatusOn", "U", "getTintIcon", "H", "tintIcon", "Landroid/widget/TextView;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/widget/TextView;", "summaryView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "a", "coui-support-card_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCOUICardEntrancePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 COUICardEntrancePreference.kt\ncom/coui/appcompat/card/COUICardEntrancePreference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
public class COUICardEntrancePreference extends COUIPressFeedbackJumpPreference {
    public static final int CARD_TYPE_LARGE = 2;
    public static final int CARD_TYPE_SMALL = 1;
    public static final int TINT_ICON_ANYWAY = 2;
    public static final int TINT_ICON_BY_GLOBAL_THEME = 1;
    public static final int TINT_ICON_NONE = 0;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public int cardType;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public boolean showSummary;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public boolean statusOn;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public int tintIcon;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @Nullable
    public TextView summaryView;
    public static final int W = R$layout.coui_component_card_entrance_preference_type_small;
    public static final int X = R$layout.coui_component_card_entrance_preference_type_large;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public COUICardEntrancePreference(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void E(int i) {
        setLayoutResource(p(i));
        this.cardType = i;
        notifyChanged();
    }

    public final void F(boolean z) {
        this.showSummary = z;
        notifyChanged();
    }

    @SuppressLint({"PrivateResource"})
    public final void G(boolean statusOn) {
        int iB = lh2.b(getContext(), R$attr.couiColorSecondNeutral, 0);
        int iB2 = lh2.b(getContext(), R$attr.couiColorPrimaryText, 0);
        TextView textView = this.summaryView;
        if (textView != null) {
            if (statusOn) {
                iB = iB2;
            }
            textView.setTextColor(iB);
        }
    }

    public final void H(int i) {
        this.tintIcon = i;
        notifyChanged();
    }

    public final void n(PreferenceViewHolder holder) {
        int i = this.tintIcon;
        if (i == 2 || i == 1) {
            sm2 sm2VarI = sm2.i();
            Context context = getContext();
            View viewFindViewById = holder.findViewById(R.id.icon);
            sm2VarI.a(context, viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null, this.tintIcon == 2);
        }
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    @Override // com.coui.appcompat.card.COUIPressFeedbackJumpPreference, com.coui.appcompat.preference.COUIPreference, androidx.preference.Preference
    public void onBindViewHolder(@NotNull PreferenceViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onBindViewHolder(holder);
        ph2.c(holder.itemView, false);
        r(holder);
        n(holder);
    }

    public final int p(int cardType) {
        if (cardType != 1 && cardType == 2) {
            return X;
        }
        return W;
    }

    public final void r(@NotNull PreferenceViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View viewFindViewById = holder.findViewById(R.id.summary);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        this.summaryView = textView;
        if (textView != null) {
            ph2.c(textView, false);
        }
        G(this.statusOn);
    }

    @Override // androidx.preference.Preference
    public void setSummary(@Nullable CharSequence summary) {
        if (this.showSummary) {
            super.setSummary(summary);
        } else {
            setStatusText1(summary);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public COUICardEntrancePreference(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ COUICardEntrancePreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? com.support.preference.R$attr.couiJumpPreferenceStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // androidx.preference.Preference
    public void setSummary(int summaryResId) {
        setSummary(getContext().getString(summaryResId));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public COUICardEntrancePreference(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cardType = 1;
        this.showSummary = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICardEntrancePreference, i, i2);
        E(typedArrayObtainStyledAttributes.getInteger(R$styleable.COUICardEntrancePreference_entranceCardType, 1));
        F(typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICardEntrancePreference_showSummary, true));
        H(typedArrayObtainStyledAttributes.getInteger(R$styleable.COUICardEntrancePreference_tintIcon, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
