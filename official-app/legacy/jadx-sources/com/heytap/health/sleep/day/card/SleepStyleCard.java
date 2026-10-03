package com.heytap.health.sleep.day.card;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.sleep.day.SleepHistoryDayFragment;
import com.heytap.health.sleep.day.viewmodel.SleepCardStyleViewModel;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.jah;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001a\u0010!\u001a\u00020\u001c8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/heytap/health/sleep/day/card/SleepStyleCard;", "Lcom/oplus/aiunit/vision/jah;", "", "C", "Lcom/heytap/health/sleep/day/viewmodel/SleepCardStyleViewModel$SleepCardStyle;", "cardStyle", "D", "Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;", "x", "Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;", ExifInterface.LONGITUDE_EAST, "()Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;", "setFragment", "(Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;)V", "fragment", "y", "Lcom/heytap/health/sleep/day/viewmodel/SleepCardStyleViewModel$SleepCardStyle;", "cardStyleVisible", "", "z", "Z", "getCardDefaultVisible", "()Z", UserInfo.SEX_FEMALE, "(Z)V", "cardDefaultVisible", "A", "curSelectCardStyle", "Lcom/heytap/health/sleep/day/viewmodel/SleepCardStyleViewModel;", c8l.KEY_B, "Lcom/heytap/health/sleep/day/viewmodel/SleepCardStyleViewModel;", "getSleepCardStyleViewModel", "()Lcom/heytap/health/sleep/day/viewmodel/SleepCardStyleViewModel;", "sleepCardStyleViewModel", "<init>", "(Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;Lcom/heytap/health/sleep/day/viewmodel/SleepCardStyleViewModel$SleepCardStyle;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public abstract class SleepStyleCard extends jah {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public SleepCardStyleViewModel.SleepCardStyle curSelectCardStyle;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final SleepCardStyleViewModel sleepCardStyleViewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public SleepHistoryDayFragment fragment;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final SleepCardStyleViewModel.SleepCardStyle cardStyleVisible;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public boolean cardDefaultVisible;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepStyleCard(@NotNull SleepHistoryDayFragment fragment, @NotNull SleepCardStyleViewModel.SleepCardStyle cardStyleVisible) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(cardStyleVisible, "cardStyleVisible");
        this.fragment = fragment;
        this.cardStyleVisible = cardStyleVisible;
        this.cardDefaultVisible = true;
        this.curSelectCardStyle = SleepCardStyleViewModel.SleepCardStyle.SLEEP_ANALYSIS;
        SleepCardStyleViewModel sleepCardStyleViewModel = (SleepCardStyleViewModel) new ViewModelProvider(fragment).get(SleepCardStyleViewModel.class);
        this.sleepCardStyleViewModel = sleepCardStyleViewModel;
        sleepCardStyleViewModel.v().observe(this.fragment.getViewLifecycleOwner(), new a(new Function1<SleepCardStyleViewModel.SleepCardStyle, Unit>() { // from class: com.heytap.health.sleep.day.card.SleepStyleCard.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SleepCardStyleViewModel.SleepCardStyle sleepCardStyle) {
                invoke2(sleepCardStyle);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SleepCardStyleViewModel.SleepCardStyle it) {
                SleepStyleCard sleepStyleCard = SleepStyleCard.this;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                sleepStyleCard.D(it);
            }
        }));
    }

    public final void C() {
        SleepCardStyleViewModel.SleepCardStyle sleepCardStyle = this.cardStyleVisible;
        if (sleepCardStyle == this.curSelectCardStyle || sleepCardStyle == SleepCardStyleViewModel.SleepCardStyle.NONE) {
            View viewT = getCardView();
            if (viewT == null) {
                return;
            }
            viewT.setVisibility(this.cardDefaultVisible ? 0 : 8);
            return;
        }
        View viewT2 = getCardView();
        if (viewT2 == null) {
            return;
        }
        viewT2.setVisibility(8);
    }

    public final void D(SleepCardStyleViewModel.SleepCardStyle cardStyle) {
        this.curSelectCardStyle = cardStyle;
        SleepCardStyleViewModel.SleepCardStyle sleepCardStyle = this.cardStyleVisible;
        if (sleepCardStyle == cardStyle || sleepCardStyle == SleepCardStyleViewModel.SleepCardStyle.NONE) {
            View viewT = getCardView();
            if (viewT == null) {
                return;
            }
            viewT.setVisibility(this.cardDefaultVisible ? 0 : 8);
            return;
        }
        View viewT2 = getCardView();
        if (viewT2 == null) {
            return;
        }
        viewT2.setVisibility(8);
    }

    @NotNull
    /* JADX INFO: renamed from: E, reason: from getter */
    public final SleepHistoryDayFragment getFragment() {
        return this.fragment;
    }

    public final void F(boolean z) {
        this.cardDefaultVisible = z;
    }
}
