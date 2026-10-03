package com.heytap.health.main.card;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.heytap.databaseengine.model.AssessmentRecord;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.cardiovascular.R$plurals;
import com.heytap.health.cardiovascular.R$string;
import com.heytap.health.cardiovascular.util.CardiovascularUtil;
import com.heytap.health.cardiovascular.util.QuicklyCheckupV2DateUtil;
import com.heytap.health.cardiovascular.viewmodel.CardiovascularCardViewModel;
import com.heytap.health.health.cardiovascular.CardiovascularService;
import com.heytap.health.health.impl.R$drawable;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.health_base.R$color;
import com.heytap.health.healthbase.ability.DevicesAbilityEnum;
import com.heytap.health.healthbase.ability.utils.DevicesAbilityUtils;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.main.card.CardiovascularCard;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.ln3;
import com.oplus.aiunit.vision.m8b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001EB\u0019\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0014J \u0010\u0014\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0016\u0010\u0019\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0017H\u0002J\u0016\u0010\u001b\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002R\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00105\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0018\u0010:\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0011\u0010=\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006F"}, d2 = {"Lcom/heytap/health/main/card/CardiovascularCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/heytap/databaseengine/model/AssessmentRecord;", "record", acl.KEY_A0, "R", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "Landroid/content/Context;", "context", "O", "N", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "L", "X", "l0", "Lcom/oplus/aiunit/vision/ln3;", "callBack", "y0", "", "q0", "assessmentRecord", "o0", "Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "z", "Lkotlin/Lazy;", "n0", "()Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "devicesAbilityUtils", "A", "Lcom/heytap/databaseengine/model/AssessmentRecord;", "getMData", "()Lcom/heytap/databaseengine/model/AssessmentRecord;", "setMData", "(Lcom/heytap/databaseengine/model/AssessmentRecord;)V", "mData", "Lcom/heytap/health/cardiovascular/viewmodel/CardiovascularCardViewModel;", acl.KEY_B, "Lcom/heytap/health/cardiovascular/viewmodel/CardiovascularCardViewModel;", "getMViewModel", "()Lcom/heytap/health/cardiovascular/viewmodel/CardiovascularCardViewModel;", "setMViewModel", "(Lcom/heytap/health/cardiovascular/viewmodel/CardiovascularCardViewModel;)V", "mViewModel", "C", "I", "title60sId", "D", "titleCardioId", ExifInterface.LONGITUDE_EAST, "Ljava/lang/Boolean;", "support60sFeature", "p0", "()Z", "isEmpty", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardiovascularCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardiovascularCard.kt\ncom/heytap/health/main/card/CardiovascularCard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,361:1\n1#2:362\n29#3:363\n1549#4:364\n1620#4,2:365\n1747#4,3:367\n1622#4:370\n1855#4,2:371\n1864#4,3:373\n*S KotlinDebug\n*F\n+ 1 CardiovascularCard.kt\ncom/heytap/health/main/card/CardiovascularCard\n*L\n349#1:363\n211#1:364\n211#1:365,2\n212#1:367,3\n211#1:370\n215#1:371,2\n220#1:373,3\n*E\n"})
public final class CardiovascularCard extends HealthBaseCard {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public AssessmentRecord mData;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public CardiovascularCardViewModel mViewModel;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final int title60sId;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final int titleCardioId;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public Boolean support60sFeature;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy devicesAbilityUtils;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/heytap/databaseengine/model/AssessmentRecord;", "record", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b implements Observer<AssessmentRecord> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@Nullable AssessmentRecord assessmentRecord) {
            CardiovascularCard.this.A0(assessmentRecord);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardiovascularCard(@NotNull FragmentActivity activity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(activity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.devicesAbilityUtils = LazyKt__LazyJVMKt.lazy(new Function0<DevicesAbilityUtils>() { // from class: com.heytap.health.main.card.CardiovascularCard$devicesAbilityUtils$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DevicesAbilityUtils invoke() {
                return new DevicesAbilityUtils();
            }
        });
        this.title60sId = R$string.health_cardiovascular_60s_title;
        this.titleCardioId = R$string.health_cardiovascular_assessment;
    }

    public static final void m0(CardiovascularCard this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardiovascularCardViewModel cardiovascularCardViewModel = this$0.mViewModel;
        Intrinsics.checkNotNull(cardiovascularCardViewModel);
        cardiovascularCardViewModel.v();
    }

    public static final void r0(CardiovascularCard this$0, ln3 callBack, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        m8b.f("CardiovascularCard", "isSupport60s CommonCallback:" + z);
        this$0.support60sFeature = Boolean.valueOf(z);
        callBack.onResult(Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v24, types: [T, java.lang.Object, java.lang.String] */
    public static final void s0(final CardiovascularCard this$0, final Context context, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        int i = 0;
        if (!z) {
            com.heytap.health.cardiovascular.util.b.Companion companion = com.heytap.health.cardiovascular.util.b.INSTANCE;
            AssessmentRecord assessmentRecord = this$0.mData;
            Intrinsics.checkNotNull(assessmentRecord);
            String validMeasurementItems = assessmentRecord.getValidMeasurementItems();
            Intrinsics.checkNotNullExpressionValue(validMeasurementItems, "mData!!.validMeasurementItems");
            final int size = companion.n(validMeasurementItems, false).size();
            StringBuilder sb = new StringBuilder();
            sb.append("onCommonBindViewHolder() has data, no 60s:");
            sb.append(size);
            this$0.y0(new ln3() { // from class: com.oplus.aiunit.vision.e33
                @Override // com.oplus.aiunit.vision.ln3
                public final void onResult(Object obj) {
                    CardiovascularCard.u0(this.a, context, size, ((Integer) obj).intValue());
                }
            });
            View viewX = this$0.x(R$layout.health_common_cardiovascular_card);
            ImageView imageView = (ImageView) viewX.findViewById(R$id.iv_icon);
            TextView textView = (TextView) viewX.findViewById(R$id.tv_tip);
            AssessmentRecord assessmentRecord2 = this$0.mData;
            Intrinsics.checkNotNull(assessmentRecord2);
            String focusItems = assessmentRecord2.getFocusMeasurementItems();
            Intrinsics.checkNotNullExpressionValue(focusItems, "focusItems");
            int size2 = companion.n(focusItems, false).size();
            if (size2 == 0) {
                imageView.setImageResource(R$drawable.health_icon_cardiovascular_style2);
                textView.setText(context.getString(R$string.health_cardiovascular_card_normal));
                return;
            } else {
                imageView.setImageResource(R$drawable.health_icon_cardiovascular_style1);
                textView.setText(context.getResources().getQuantityString(R$plurals.health_cardiovascular_card_focus, size2, String.valueOf(size2)));
                return;
            }
        }
        Object objNavigation = e1.d().b("/cardiovascular/CardiovascularService").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.health.cardiovascular.CardiovascularService");
        CardiovascularService cardiovascularService = (CardiovascularService) objNavigation;
        AssessmentRecord assessmentRecord3 = this$0.mData;
        Intrinsics.checkNotNull(assessmentRecord3);
        int iH8 = cardiovascularService.h8(assessmentRecord3);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final Ref.IntRef intRef = new Ref.IntRef();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("exceptionCount:");
        sb2.append(iH8);
        if (iH8 <= 0) {
            ?? string = context.getString(R$string.health_cardiovascular_60s_card_no_risk);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(com.he…ascular_60s_card_no_risk)");
            objectRef.element = string;
            intRef.element = ContextCompat.getColor(context, R$color.health_base_black_90alpha);
        } else {
            ?? quantityString = context.getResources().getQuantityString(R$plurals.health_cardiovascular_card_exception_num, iH8, String.valueOf(iH8));
            Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…                        )");
            objectRef.element = quantityString;
            AssessmentRecord assessmentRecord4 = this$0.mData;
            Intrinsics.checkNotNull(assessmentRecord4);
            intRef.element = assessmentRecord4.getEndTimestamp() > 2592000000L ? ContextCompat.getColor(context, R$color.health_base_black_90alpha) : ContextCompat.getColor(context, com.heytap.health.health.impl.R$color.health_color_F50E60);
        }
        AssessmentRecord assessmentRecord5 = this$0.mData;
        Intrinsics.checkNotNull(assessmentRecord5);
        if (this$0.o0(assessmentRecord5)) {
            intRef.element = ContextCompat.getColor(context, com.heytap.health.base.R$color.lib_base_black_90alpha);
            View viewX2 = this$0.x(R$layout.health_common_cardiovascular_card2);
            ImageView imageView2 = (ImageView) viewX2.findViewById(R$id.iv_icon_heart);
            ImageView imageView3 = (ImageView) viewX2.findViewById(R$id.iv_icon_sleep);
            ImageView imageView4 = (ImageView) viewX2.findViewById(R$id.iv_icon_hrv);
            QuicklyCheckupV2DateUtil.Companion companion2 = QuicklyCheckupV2DateUtil.INSTANCE;
            AssessmentRecord assessmentRecord6 = this$0.mData;
            Intrinsics.checkNotNull(assessmentRecord6);
            Collection<List<String>> collectionValues = companion2.j(context, assessmentRecord6).values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "QuicklyCheckupV2DateUtil…(context, mData!!).values");
            Collection<List<String>> collection = collectionValues;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
            Iterator<T> it = collection.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                List it2 = (List) it.next();
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                List list = it2;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            z2 = false;
                            break;
                        }
                    } while (!(((String) it3.next()).length() > 0));
                } else {
                    z2 = false;
                    break;
                    break;
                }
                arrayList.add(Boolean.valueOf(z2));
            }
            Iterator it4 = arrayList.iterator();
            boolean z3 = false;
            while (it4.hasNext()) {
                if (((Boolean) it4.next()).booleanValue()) {
                    z3 = true;
                }
            }
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("isRiskList index:");
                sb3.append(i);
                sb3.append(", isRisk:");
                sb3.append(zBooleanValue);
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            if (zBooleanValue) {
                                imageView4.setImageResource(R$drawable.health_icon_cardiovascular_hrv_err);
                            } else if (z3) {
                                imageView4.setImageResource(R$drawable.health_icon_cardiovascular_hrv_non);
                            } else {
                                imageView4.setImageResource(R$drawable.health_icon_cardiovascular_hrv_normal);
                            }
                        }
                    } else if (zBooleanValue) {
                        imageView3.setImageResource(R$drawable.health_icon_cardiovascular_sleep_err);
                    } else if (z3) {
                        imageView3.setImageResource(R$drawable.health_icon_cardiovascular_sleep_non);
                    } else {
                        imageView3.setImageResource(R$drawable.health_icon_cardiovascular_sleep_normal);
                    }
                } else if (zBooleanValue) {
                    imageView2.setImageResource(R$drawable.health_icon_cardiovascular_heart_err);
                } else if (z3) {
                    imageView2.setImageResource(R$drawable.health_icon_cardiovascular_heart_non);
                } else {
                    imageView2.setImageResource(R$drawable.health_icon_cardiovascular_heart_normal);
                }
                i = i2;
            }
        } else {
            if (iH8 > 0) {
                intRef.element = ContextCompat.getColor(context, com.heytap.health.health.impl.R$color.health_color_F50E60);
            }
            AssessmentRecord assessmentRecord7 = this$0.mData;
            Intrinsics.checkNotNull(assessmentRecord7);
            int iF9 = cardiovascularService.F9(assessmentRecord7);
            String quantityString2 = context.getResources().getQuantityString(R$plurals.health_cardiovascular_card_testing_num, iF9, String.valueOf(iF9));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "context.resources.getQua…                        )");
            View viewX3 = this$0.x(R$layout.health_common_cardiovascular_card);
            ImageView imageView5 = (ImageView) viewX3.findViewById(R$id.iv_icon);
            TextView textView2 = (TextView) viewX3.findViewById(R$id.tv_tip);
            imageView5.setImageResource(R$drawable.health_icon_cardiovascular_style2);
            textView2.setText(quantityString2);
        }
        this$0.y0(new ln3() { // from class: com.oplus.aiunit.vision.d33
            @Override // com.oplus.aiunit.vision.ln3
            public final void onResult(Object obj2) {
                CardiovascularCard.t0(this.a, context, intRef, objectRef, ((Integer) obj2).intValue());
            }
        });
    }

    public static final void t0(CardiovascularCard this$0, Context context, Ref.IntRef tipTextColor, Ref.ObjectRef tipStr, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(tipTextColor, "$tipTextColor");
        Intrinsics.checkNotNullParameter(tipStr, "$tipStr");
        this$0.t.setDataModel(context.getString(i));
        this$0.t.f5989n.setTextSize(18.0f);
        this$0.t.f5989n.setTextColor(tipTextColor.element);
        this$0.t.p.setVisibility(8);
        this$0.t.setDataContent((CharSequence) tipStr.element);
        HealthCommonCardView healthCommonCardView = this$0.t;
        AssessmentRecord assessmentRecord = this$0.mData;
        Intrinsics.checkNotNull(assessmentRecord);
        healthCommonCardView.e(assessmentRecord.getEndTimestamp(), false);
    }

    public static final void u0(CardiovascularCard this$0, Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.t.setDataModel(context.getString(i2));
        this$0.t.f5989n.setTextSize(18.0f);
        this$0.t.p.setVisibility(8);
        this$0.t.setDataContent(context.getResources().getQuantityString(R$plurals.health_cardiovascular_card_measure_num, i, String.valueOf(i)));
        HealthCommonCardView healthCommonCardView = this$0.t;
        AssessmentRecord assessmentRecord = this$0.mData;
        Intrinsics.checkNotNull(assessmentRecord);
        healthCommonCardView.e(assessmentRecord.getEndTimestamp(), false);
    }

    public static final void v0(CardiovascularCard this$0, Context context, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.t.f(context.getString(i), this$0.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_cardiovascular_no_data_tip), this$0.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_to_understand));
    }

    public static final void w0(CardiovascularCard this$0, TextView textView, Context context, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.d(textView, context.getString(i));
    }

    public static final void x0(TextView textView, Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "$context");
        textView.setText(context.getString(i));
    }

    public static final void z0(ln3 callBack, CardiovascularCard this$0, boolean z) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        callBack.onResult(Integer.valueOf(z ? this$0.title60sId : this$0.titleCardioId));
    }

    public final void A0(@Nullable AssessmentRecord record) {
        StringBuilder sb = new StringBuilder();
        sb.append("updateData:");
        sb.append(record);
        this.mData = record;
        S();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void L(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull final Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        super.L(holder, position, context);
        boolean zP0 = p0();
        StringBuilder sb = new StringBuilder();
        sb.append("onCommonBindViewHolder isEmpty is ");
        sb.append(zP0);
        if (!zP0) {
            q0(new ln3() { // from class: com.oplus.aiunit.vision.z23
                @Override // com.oplus.aiunit.vision.ln3
                public final void onResult(Object obj) {
                    CardiovascularCard.s0(this.a, context, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            this.t.setIcon(R$drawable.health_icon_cardiovascular);
            y0(new ln3() { // from class: com.oplus.aiunit.vision.y23
                @Override // com.oplus.aiunit.vision.ln3
                public final void onResult(Object obj) {
                    CardiovascularCard.v0(this.a, context, ((Integer) obj).intValue());
                }
            });
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void N(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull final Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        super.N(holder, position, context);
        final TextView textView = (TextView) holder.itemView.findViewById(R$id.home_card_title);
        y0(new ln3() { // from class: com.oplus.aiunit.vision.x23
            @Override // com.oplus.aiunit.vision.ln3
            public final void onResult(Object obj) {
                CardiovascularCard.w0(this.a, textView, context, ((Integer) obj).intValue());
            }
        });
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void O(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull final Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        super.O(holder, position, context);
        final TextView textView = (TextView) holder.itemView.findViewById(R$id.card_content);
        y0(new ln3() { // from class: com.oplus.aiunit.vision.a33
            @Override // com.oplus.aiunit.vision.ln3
            public final void onResult(Object obj) {
                CardiovascularCard.x0(textView, context, ((Integer) obj).intValue());
            }
        });
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void R() {
        m8b.f("CardiovascularCard", "refresh start! canRefresh is ");
        l0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void V() {
        super.V();
        l0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void X(@Nullable Context context) {
        if (context == null) {
            return;
        }
        if (!n0().b(DevicesAbilityEnum.CARDIOVASCULAR) && p0() && !Intrinsics.areEqual(this.support60sFeature, Boolean.FALSE)) {
            god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=cardiovascularassessment"), null, this.t);
            return;
        }
        ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
        FragmentActivity mActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        HealthCommonCardView healthCommonCardView = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        ActivityOptionsCompat activityOptionsCompatA = companion.a(mActivity, healthCommonCardView);
        Postcard postcardWithString = e1.d().b("/cardiovascular/CardiovascularRecordsActivity").withString(ActivityTransitionUtil.KEY_ACTIVITY_TRANSITION_TARGET_NAME, this.t.getTransitionName());
        postcardWithString.withOptionsCompat(ActivityOptionsCompat.fromBundle(activityOptionsCompatA != null ? activityOptionsCompatA.toBundle() : null));
        postcardWithString.navigation(context);
    }

    public final void l0() {
        if (this.mViewModel == null) {
            FragmentActivity mActivity = this.k;
            Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
            CardiovascularCardViewModel cardiovascularCardViewModel = (CardiovascularCardViewModel) new ViewModelProvider(mActivity).get(CardiovascularCardViewModel.class);
            this.mViewModel = cardiovascularCardViewModel;
            Intrinsics.checkNotNull(cardiovascularCardViewModel);
            cardiovascularCardViewModel.w().removeObservers(this.k);
        }
        CardiovascularCardViewModel cardiovascularCardViewModel2 = this.mViewModel;
        Intrinsics.checkNotNull(cardiovascularCardViewModel2);
        cardiovascularCardViewModel2.w().observe(this.k, new b());
        ThreadUtils.doInBackground("CardiovaCard", new Runnable() { // from class: com.oplus.aiunit.vision.b33
            @Override // java.lang.Runnable
            public final void run() {
                CardiovascularCard.m0(this.i);
            }
        });
    }

    public final DevicesAbilityUtils n0() {
        return (DevicesAbilityUtils) this.devicesAbilityUtils.getValue();
    }

    public final boolean o0(AssessmentRecord assessmentRecord) {
        Integer version = assessmentRecord.getVersion();
        return (version == null ? 0 : version.intValue()) >= 3;
    }

    public final boolean p0() {
        return this.mData == null;
    }

    public final void q0(final ln3<Boolean> callBack) {
        Boolean bool = this.support60sFeature;
        if (bool == null) {
            CardiovascularUtil.INSTANCE.A(new ln3() { // from class: com.oplus.aiunit.vision.f33
                @Override // com.oplus.aiunit.vision.ln3
                public final void onResult(Object obj) {
                    CardiovascularCard.r0(this.a, callBack, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        m8b.f("CardiovascularCard", "isSupport60s:" + bool);
        callBack.onResult(this.support60sFeature);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$DataType t() {
        return HomeCardDataEnum$DataType.CARDIOVASCULAR;
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$CardUiMode y() {
        return HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_NOT_FOLLOWED;
    }

    public final void y0(final ln3<Integer> callBack) {
        q0(new ln3() { // from class: com.oplus.aiunit.vision.c33
            @Override // com.oplus.aiunit.vision.ln3
            public final void onResult(Object obj) {
                CardiovascularCard.z0(callBack, this, ((Boolean) obj).booleanValue());
            }
        });
    }
}