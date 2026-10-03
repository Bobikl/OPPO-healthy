package com.heytap.health.step.card.ui;

import androidx.lifecycle.Observer;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.step.card.bean.StepCardCheckInBean;
import com.heytap.health.step.card.bean.StepCardDetailsBean;

/* JADX INFO: loaded from: classes18.dex */
public abstract class StepCardBaseFragment extends BaseFragment {

    public class StepCardCheckInResultObserver implements Observer<StepCardCheckInBean> {
        public final /* synthetic */ StepCardBaseFragment i;

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(StepCardCheckInBean stepCardCheckInBean) {
            this.i.c0(stepCardCheckInBean);
        }
    }

    public class StepCardDetailObserver implements Observer<StepCardDetailsBean> {
        public final /* synthetic */ StepCardBaseFragment i;

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(StepCardDetailsBean stepCardDetailsBean) {
            this.i.d0(stepCardDetailsBean);
        }
    }

    public void c0(StepCardCheckInBean stepCardCheckInBean) {
    }

    public void d0(StepCardDetailsBean stepCardDetailsBean) {
    }

    public abstract void e0();
}
