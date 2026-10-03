package com.heytap.health.sleep.day.card;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.sleep.R$color;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.R$string;
import com.heytap.health.sleep.algorithm.SleepScoreRanking;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sleep.day.SleepHistoryDayFragment;
import com.heytap.health.sleep.day.card.SleepOverviewCard;
import com.heytap.health.sleep.day.view.SleepScoreProgressView;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.beh;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.mmh;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import io.protostuff.MapSchema;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bB\u0010CJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010*R\u0018\u00101\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010*R\u0018\u00102\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0016\u00104\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u0012R\u0016\u00105\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u001b\u0010A\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/heytap/health/sleep/day/card/SleepOverviewCard;", "Lcom/oplus/aiunit/vision/beh;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.PROCESS_NAME_KEY, "", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/sleep/bean/SleepDayBean;", "curSleepDayBean", "z", "Landroid/widget/TextView;", "textView", UserInfo.SEX_FEMALE, DeviceInfoCompat.DeviceType.TV, "H", "I", "Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;", "x", "Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;", "getFragment", "()Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;", "setFragment", "(Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;)V", "fragment", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "y", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "getFamilyConfigBean", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "setFamilyConfigBean", "(Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "familyConfigBean", "Landroid/view/View;", "rootView", "Lcom/heytap/health/sleep/day/view/SleepScoreProgressView;", "A", "Lcom/heytap/health/sleep/day/view/SleepScoreProgressView;", "sleepScoreProgressView", acl.KEY_B, "Landroid/widget/TextView;", "tvSleepRanking", "C", "tvSleepAssess", "D", "tvSleepAssess2", ExifInterface.LONGITUDE_EAST, "tvNoOverview", "tvNoOverviewTip", "G", "gradientTopColor", "gradientBottomColor", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "sleepRankingLayoutListener", "Lcom/oplus/aiunit/vision/mmh;", "J", "Lkotlin/Lazy;", "()Lcom/oplus/aiunit/vision/mmh;", "sleepHelpUtil", "Lcom/heytap/health/sleep/algorithm/SleepScoreRanking;", "K", "()Lcom/heytap/health/sleep/algorithm/SleepScoreRanking;", "sleepScoreRanking", "<init>", "(Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepOverviewCard extends beh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public SleepScoreProgressView sleepScoreProgressView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public TextView tvSleepRanking;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public TextView tvSleepAssess;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public TextView tvSleepAssess2;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public TextView tvNoOverview;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public TextView tvNoOverviewTip;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public int gradientTopColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public int gradientBottomColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public View.OnLayoutChangeListener sleepRankingLayoutListener;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public final Lazy sleepHelpUtil;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final Lazy sleepScoreRanking;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public SleepHistoryDayFragment fragment;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public FamilyMoreDataDetailConfigBean familyConfigBean;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public View rootView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepOverviewCard(@NotNull SleepHistoryDayFragment fragment, @Nullable FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.familyConfigBean = familyMoreDataDetailConfigBean;
        this.sleepHelpUtil = LazyKt__LazyJVMKt.lazy(new Function0<mmh>() { // from class: com.heytap.health.sleep.day.card.SleepOverviewCard$sleepHelpUtil$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final mmh invoke() {
                return new mmh();
            }
        });
        this.sleepScoreRanking = LazyKt__LazyJVMKt.lazy(new Function0<SleepScoreRanking>() { // from class: com.heytap.health.sleep.day.card.SleepOverviewCard$sleepScoreRanking$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final SleepScoreRanking invoke() {
                return new SleepScoreRanking();
            }
        });
    }

    public static final void G(TextView tv, SleepOverviewCard this$0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(tv, "$tv");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (tv.getWidth() <= 0 || tv.getHeight() <= 0) {
            return;
        }
        this$0.H(tv);
    }

    public final void F(final TextView textView) {
        if (textView == null) {
            return;
        }
        I();
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.oplus.aiunit.vision.soh
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                SleepOverviewCard.G(textView, this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.sleepRankingLayoutListener = onLayoutChangeListener;
        textView.addOnLayoutChangeListener(onLayoutChangeListener);
        if (textView.getWidth() <= 0 || textView.getHeight() <= 0) {
            return;
        }
        H(textView);
    }

    public final void H(TextView tv) {
        tv.getPaint().setShader(new LinearGradient(0.0f, tv.getHeight(), tv.getWidth(), 0.0f, this.gradientTopColor, this.gradientBottomColor, Shader.TileMode.CLAMP));
        tv.invalidate();
    }

    public final void I() {
        TextView textView;
        View.OnLayoutChangeListener onLayoutChangeListener = this.sleepRankingLayoutListener;
        if (onLayoutChangeListener != null && (textView = this.tvSleepRanking) != null) {
            textView.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        this.sleepRankingLayoutListener = null;
        TextView textView2 = this.tvSleepRanking;
        TextPaint paint = textView2 != null ? textView2.getPaint() : null;
        if (paint == null) {
            return;
        }
        paint.setShader(null);
    }

    public final mmh J() {
        return (mmh) this.sleepHelpUtil.getValue();
    }

    public final SleepScoreRanking K() {
        return (SleepScoreRanking) this.sleepScoreRanking.getValue();
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_sleep_overview_card;
    }

    @Override // com.oplus.aiunit.vision.dq8
    public void p(@NotNull Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        I();
        View viewA = a(cardView, R$id.rootView);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.view.View");
        this.rootView = viewA;
        View viewA2 = a(cardView, R$id.sleepScoreProgressView);
        Intrinsics.checkNotNull(viewA2, "null cannot be cast to non-null type com.heytap.health.sleep.day.view.SleepScoreProgressView");
        this.sleepScoreProgressView = (SleepScoreProgressView) viewA2;
        View viewA3 = a(cardView, R$id.tv_sleep_ranking);
        Intrinsics.checkNotNull(viewA3, "null cannot be cast to non-null type android.widget.TextView");
        this.tvSleepRanking = (TextView) viewA3;
        View viewA4 = a(cardView, R$id.tv_sleep_assess);
        Intrinsics.checkNotNull(viewA4, "null cannot be cast to non-null type android.widget.TextView");
        this.tvSleepAssess = (TextView) viewA4;
        View viewA5 = a(cardView, R$id.tv_sleep_assess2);
        Intrinsics.checkNotNull(viewA5, "null cannot be cast to non-null type android.widget.TextView");
        this.tvSleepAssess2 = (TextView) viewA5;
        View viewA6 = a(cardView, R$id.tv_no_overview);
        Intrinsics.checkNotNull(viewA6, "null cannot be cast to non-null type android.widget.TextView");
        this.tvNoOverview = (TextView) viewA6;
        View viewA7 = a(cardView, R$id.tv_no_overview_tip);
        Intrinsics.checkNotNull(viewA7, "null cannot be cast to non-null type android.widget.TextView");
        this.tvNoOverviewTip = (TextView) viewA7;
        this.gradientTopColor = ContextCompat.getColor(context, R$color.health_sleep_color_b462f4);
        this.gradientBottomColor = ContextCompat.getColor(context, R$color.health_sleep_color_7366ff);
    }

    @Override // com.oplus.aiunit.vision.beh
    public void z(@NotNull SleepDayBean curSleepDayBean) {
        Intrinsics.checkNotNullParameter(curSleepDayBean, "curSleepDayBean");
        super.z(curSleepDayBean);
        if (curSleepDayBean.getTotalSleepTime() < 180) {
            SleepScoreProgressView sleepScoreProgressView = this.sleepScoreProgressView;
            if (sleepScoreProgressView != null) {
                sleepScoreProgressView.setVisibility(8);
            }
            TextView textView = this.tvSleepAssess;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = this.tvSleepAssess2;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            I();
            TextView textView3 = this.tvSleepRanking;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = this.tvNoOverview;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            TextView textView5 = this.tvNoOverviewTip;
            if (textView5 == null) {
                return;
            }
            textView5.setVisibility(0);
            return;
        }
        SleepScoreProgressView sleepScoreProgressView2 = this.sleepScoreProgressView;
        if (sleepScoreProgressView2 != null) {
            sleepScoreProgressView2.setVisibility(0);
        }
        TextView textView6 = this.tvSleepAssess;
        if (textView6 != null) {
            textView6.setVisibility(0);
        }
        TextView textView7 = this.tvNoOverview;
        if (textView7 != null) {
            textView7.setVisibility(8);
        }
        TextView textView8 = this.tvNoOverviewTip;
        if (textView8 != null) {
            textView8.setVisibility(8);
        }
        SleepScoreProgressView sleepScoreProgressView3 = this.sleepScoreProgressView;
        if (sleepScoreProgressView3 != null) {
            int score = curSleepDayBean.getScore();
            String string = this.fragment.getString(R$string.health_sleep_score_unit);
            Intrinsics.checkNotNullExpressionValue(string, "fragment.getString(R.str….health_sleep_score_unit)");
            sleepScoreProgressView3.setData(100, score, string, "--");
        }
        mmh mmhVarJ = J();
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        String strB = mmhVarJ.b(contextA, curSleepDayBean);
        if (this.familyConfigBean == null) {
            TextView textView9 = this.tvSleepAssess;
            if (textView9 != null) {
                textView9.setText(strB);
            }
            TextView textView10 = this.tvSleepAssess;
            if (textView10 != null) {
                textView10.setVisibility(0);
            }
            TextView textView11 = this.tvSleepAssess2;
            if (textView11 != null) {
                textView11.setVisibility(8);
            }
            K().c(curSleepDayBean.getAge(), curSleepDayBean.getScore(), new Function1<Integer, Unit>() { // from class: com.heytap.health.sleep.day.card.SleepOverviewCard$refreshCardView$1
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    if (i <= 0) {
                        this.this$0.I();
                        TextView textView12 = this.this$0.tvSleepRanking;
                        if (textView12 == null) {
                            return;
                        }
                        textView12.setVisibility(8);
                        return;
                    }
                    TextView textView13 = this.this$0.tvSleepRanking;
                    if (textView13 != null) {
                        textView13.setVisibility(0);
                    }
                    TextView textView14 = this.this$0.tvSleepRanking;
                    if (textView14 != null) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String string2 = e88.a().getString(R$string.health_sleep_overview_ranking);
                        Intrinsics.checkNotNullExpressionValue(string2, "getAppContext().getStrin…h_sleep_overview_ranking)");
                        String str = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        textView14.setText(str);
                    }
                    SleepOverviewCard sleepOverviewCard = this.this$0;
                    sleepOverviewCard.F(sleepOverviewCard.tvSleepRanking);
                }
            });
            return;
        }
        TextView textView12 = this.tvSleepAssess2;
        if (textView12 != null) {
            textView12.setText(strB);
        }
        TextView textView13 = this.tvSleepAssess;
        if (textView13 != null) {
            textView13.setVisibility(8);
        }
        TextView textView14 = this.tvSleepAssess2;
        if (textView14 != null) {
            textView14.setVisibility(0);
        }
        I();
        TextView textView15 = this.tvSleepRanking;
        if (textView15 == null) {
            return;
        }
        textView15.setVisibility(8);
    }
}