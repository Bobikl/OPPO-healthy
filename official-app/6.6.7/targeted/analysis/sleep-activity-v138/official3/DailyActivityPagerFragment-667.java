package com.heytap.health.daily.ui;

import android.os.Bundle;
import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.view.CommonScrollTopLineView;
import com.heytap.health.base.view.recyclercard.RecyclerCardController;
import com.heytap.health.base.view.recyclercard.RecyclerCardLayout;
import com.heytap.health.daily.R$id;
import com.heytap.health.daily.R$layout;
import com.heytap.health.daily.bean.DailyActivityDayBean;
import com.heytap.health.daily.bean.DailyActivityDetailBean;
import com.heytap.health.daily.ui.card.DailyActiveCard;
import com.heytap.health.daily.ui.card.DailyCaloriesCard;
import com.heytap.health.daily.ui.card.DailyStepCard;
import com.heytap.health.daily.ui.card.DailyTimeCard;
import com.heytap.health.daily.ui.card.OperationCard;
import com.heytap.health.daily.ui.card.ProgressCard;
import com.heytap.health.daily.viewmodel.DailyActivityDetailViewModel;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.oplus.aiunit.vision.DailyCardParams;
import com.oplus.aiunit.vision.kge;
import com.oplus.aiunit.vision.w4l;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes16.dex */
public class DailyActivityPagerFragment extends BaseFragment {
    public DailyActivityDetailViewModel o;
    public DailyActivityDetailViewModel p;
    public final MutableLiveData<DailyActivityDetailBean> q = new MutableLiveData<>();
    public final MutableLiveData<DailyActivityDayBean> r = new MutableLiveData<>();
    public LocalDate s;
    public FamilyMoreDataDetailConfigBean t;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(Integer num) {
        r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(Integer num) {
        r0();
        q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0() {
        q0();
        r0();
    }

    public static DailyActivityPagerFragment n0(LocalDate localDate, int i, FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("DATE", localDate);
        bundle.putSerializable("INDEX", Integer.valueOf(i));
        bundle.putSerializable("ARGUMENT_MORE_DATA_DETAIL", familyMoreDataDetailConfigBean);
        DailyActivityPagerFragment dailyActivityPagerFragment = new DailyActivityPagerFragment();
        dailyActivityPagerFragment.setArguments(bundle);
        return dailyActivityPagerFragment;
    }

    public final void f0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.s = (LocalDate) BundleCompat.getSerializable(arguments, "DATE", LocalDate.class);
            this.t = (FamilyMoreDataDetailConfigBean) BundleCompat.getSerializable(arguments, "ARGUMENT_MORE_DATA_DETAIL", FamilyMoreDataDetailConfigBean.class);
            StringBuilder sb = new StringBuilder();
            sb.append("initArgument mDate = ");
            sb.append(this.s);
            sb.append(", familyDetailConfig = ");
            sb.append(this.t);
        }
    }

    public final void g0() {
        RecyclerCardLayout recyclerCardLayout = (RecyclerCardLayout) W(R$id.rc_daily_detail);
        ((CommonScrollTopLineView) W(R$id.health_daily_detail_top_line)).n(requireContext(), recyclerCardLayout);
        RecyclerCardController recyclerCardController = new RecyclerCardController(requireContext(), recyclerCardLayout);
        DailyCardParams dailyCardParams = new DailyCardParams(this, this.r, this.q, this.s, u5());
        recyclerCardController.g(new ProgressCard(dailyCardParams));
        recyclerCardController.g(new kge(dailyCardParams));
        recyclerCardController.g(new DailyStepCard(dailyCardParams));
        recyclerCardController.g(new DailyCaloriesCard(dailyCardParams));
        recyclerCardController.g(new DailyTimeCard(dailyCardParams));
        recyclerCardController.g(new DailyActiveCard(dailyCardParams));
        recyclerCardController.g(new OperationCard(dailyCardParams));
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_daily_fragment_activity_pager;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        boolean userVisibleHint = getUserVisibleHint();
        StringBuilder sb = new StringBuilder();
        sb.append("initData getUserVisibleHint is ");
        sb.append(userVisibleHint);
        this.o = (DailyActivityDetailViewModel) new ViewModelProvider(this).get(DailyActivityDetailViewModel.class);
        this.p = (DailyActivityDetailViewModel) new ViewModelProvider(requireActivity()).get(DailyActivityDetailViewModel.class);
        if (u5()) {
            String ssoid = this.t.getSsoid();
            this.o.y(ssoid);
            this.p.y(ssoid);
        }
        p0();
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(View view) {
        f0();
        g0();
        w4l.d(this, W(com.heytap.health.base.R$id.lib_base_content_container));
        w4l.e(this, W(R$id.rc_daily_detail));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        boolean userVisibleHint = getUserVisibleHint();
        StringBuilder sb = new StringBuilder();
        sb.append("onStart isUserHint is ");
        sb.append(userVisibleHint);
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.xq4
            @Override // java.lang.Runnable
            public final void run() {
                this.i.k0();
            }
        }, userVisibleHint ? 0L : 100L);
    }

    public final void p0() {
        this.o.stepSportModeData.observe(getViewLifecycleOwner(), new Observer() { // from class: com.oplus.aiunit.vision.yq4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.h0((Integer) obj);
            }
        });
        this.p.stepSportModeData.observe(getViewLifecycleOwner(), new Observer() { // from class: com.oplus.aiunit.vision.zq4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.j0((Integer) obj);
            }
        });
    }

    public final void q0() {
        DailyActivityDetailViewModel dailyActivityDetailViewModel = this.o;
        if (dailyActivityDetailViewModel != null) {
            dailyActivityDetailViewModel.C(this.s, this.q);
        }
    }

    public final void r0() {
        DailyActivityDetailViewModel dailyActivityDetailViewModel = this.o;
        if (dailyActivityDetailViewModel != null) {
            dailyActivityDetailViewModel.B(this.s, this.r);
        }
    }

    public final boolean u5() {
        return this.t != null;
    }
}