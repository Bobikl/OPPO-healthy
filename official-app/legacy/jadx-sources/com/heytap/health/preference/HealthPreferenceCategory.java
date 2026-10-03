package com.heytap.health.preference;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.preference.PreferenceViewHolder;
import com.coui.appcompat.preference.COUIPreferenceCategory;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.ui.R$styleable;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ejg;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/preference/HealthPreferenceCategory;", "Lcom/coui/appcompat/preference/COUIPreferenceCategory;", "Landroidx/preference/PreferenceViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "onBindViewHolder", "", ExifInterface.LONGITUDE_EAST, "Z", "titleTextStyleBold", "Landroid/content/res/ColorStateList;", UserInfo.SEX_FEMALE, "Landroid/content/res/ColorStateList;", "titleTextColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthPreferenceCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthPreferenceCategory.kt\ncom/heytap/health/preference/HealthPreferenceCategory\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,53:1\n59#2,2:54\n*S KotlinDebug\n*F\n+ 1 HealthPreferenceCategory.kt\ncom/heytap/health/preference/HealthPreferenceCategory\n*L\n22#1:54,2\n*E\n"})
public final class HealthPreferenceCategory extends COUIPreferenceCategory {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean titleTextStyleBold;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public ColorStateList titleTextColor;

    public HealthPreferenceCategory(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context != null) {
            int[] HealthPreferenceCategory = R$styleable.HealthPreferenceCategory;
            Intrinsics.checkNotNullExpressionValue(HealthPreferenceCategory, "HealthPreferenceCategory");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, HealthPreferenceCategory, 0, 0);
            this.titleTextStyleBold = typedArrayObtainStyledAttributes.getBoolean(R$styleable.HealthPreferenceCategory_titleTextStyleBold, this.titleTextStyleBold);
            this.titleTextColor = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.HealthPreferenceCategory_titleTextColor);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // com.coui.appcompat.preference.COUIPreferenceCategory, androidx.preference.PreferenceCategory, androidx.preference.Preference
    public void onBindViewHolder(@Nullable PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);
        View viewFindViewById = holder != null ? holder.findViewById(R.id.title) : null;
        if (viewFindViewById != null && (viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(ejg.a(b78.a(), 16.0f));
            viewFindViewById.setLayoutParams(marginLayoutParams);
        }
        if (viewFindViewById == null || !(viewFindViewById instanceof TextView)) {
            return;
        }
        if (this.titleTextStyleBold) {
            TextView textView = (TextView) viewFindViewById;
            textView.setTypeface(textView.getTypeface(), 1);
        }
        ColorStateList colorStateList = this.titleTextColor;
        if (colorStateList != null) {
            ((TextView) viewFindViewById).setTextColor(colorStateList);
        }
    }
}
