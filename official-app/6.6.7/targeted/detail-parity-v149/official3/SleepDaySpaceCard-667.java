package com.heytap.health.sleep.day.card;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.core.operation.space.SpaceView;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.SleepHistoryActivity;
import com.heytap.health.sleep.SleepHistoryViewModel;
import com.heytap.health.sleep.day.SleepHistoryDayFragment;
import com.heytap.health.sleep.day.viewmodel.SleepCardStyleViewModel;
import com.heytap.health.sleep.day.viewmodel.SleepDayControlModel;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.Map;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\n\u001a\u00020\bH\u0002J\"\u0010\u0010\u001a\u00020\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bH\u0002R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/heytap/health/sleep/day/card/SleepDaySpaceCard;", "Lcom/heytap/health/sleep/day/card/SleepStyleCard;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.PROCESS_NAME_KEY, "H", "", "", "", "Lcom/heytap/databaseengine/model/SpaceInfo;", "spaceData", "I", "Lcom/heytap/health/core/operation/space/SpaceView;", "C", "Lcom/heytap/health/core/operation/space/SpaceView;", "mSpaceView", "Landroidx/fragment/app/FragmentActivity;", "D", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Lcom/heytap/health/sleep/day/viewmodel/SleepDayControlModel;", ExifInterface.LONGITUDE_EAST, "Lcom/heytap/health/sleep/day/viewmodel/SleepDayControlModel;", "sleepDayControlModel", UserInfo.SEX_FEMALE, "Ljava/util/Map;", "Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;", "fragment", "<init>", "(Lcom/heytap/health/sleep/day/SleepHistoryDayFragment;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepDaySpaceCard extends SleepStyleCard {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public SpaceView mSpaceView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public FragmentActivity fragmentActivity;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final SleepDayControlModel sleepDayControlModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public Map<String, ? extends List<? extends SpaceInfo>> spaceData;

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
    public SleepDaySpaceCard(@NotNull SleepHistoryDayFragment fragment) {
        super(fragment, SleepCardStyleViewModel.SleepCardStyle.NONE);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
        this.fragmentActivity = fragmentActivityRequireActivity;
        this.sleepDayControlModel = (SleepDayControlModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SleepDayControlModel.class);
    }

    public final void H() {
        MutableLiveData<Map<String, List<SpaceInfo>>> mutableLiveDataY;
        FragmentActivity fragmentActivity = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity, "null cannot be cast to non-null type com.heytap.health.sleep.SleepHistoryActivity");
        SleepHistoryViewModel viewModel = ((SleepHistoryActivity) fragmentActivity).getViewModel();
        if (viewModel == null || (mutableLiveDataY = viewModel.y()) == null) {
            return;
        }
        mutableLiveDataY.observe(this.fragmentActivity, new a(new Function1<Map<String, ? extends List<? extends SpaceInfo>>, Unit>() { // from class: com.heytap.health.sleep.day.card.SleepDaySpaceCard$initSpace$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends List<? extends SpaceInfo>> map) {
                invoke2(map);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Map<String, ? extends List<? extends SpaceInfo>> spaceData) {
                Intrinsics.checkNotNullParameter(spaceData, "spaceData");
                this.this$0.I(spaceData);
            }
        }));
    }

    public final void I(Map<String, ? extends List<? extends SpaceInfo>> spaceData) {
        this.spaceData = spaceData;
        this.sleepDayControlModel.y().postValue(spaceData);
        SpaceView spaceView = this.mSpaceView;
        if (spaceView != null) {
            spaceView.setData(spaceData);
        }
        if (this.mSpaceView == null || !(!spaceData.isEmpty())) {
            return;
        }
        F(true);
        C();
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_sleep_day_space_view;
    }

    @Override // com.oplus.aiunit.vision.dq8
    public void p(@NotNull Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        View viewA = a(cardView, R$id.space_sleep_bind_v2);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type com.heytap.health.core.operation.space.SpaceView");
        this.mSpaceView = (SpaceView) viewA;
        H();
        Map<String, ? extends List<? extends SpaceInfo>> map = this.spaceData;
        if (map != null) {
            I(map);
        }
    }
}