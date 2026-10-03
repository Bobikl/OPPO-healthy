package com.heytap.health.operation.ui.home;

import android.view.View;
import android.widget.Button;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.step.StepService;
import com.heytap.health.operation.R$id;
import com.heytap.health.operation.R$layout;
import com.oplus.aiunit.vision.x0;

/* JADX INFO: loaded from: classes17.dex */
public class OperationFragment extends BaseFragment implements View.OnClickListener {
    public static final String TAG = "OperationFragment";
    public Button o;
    public Button p;

    @Autowired
    public StepService q;

    public final void c0() {
    }

    public final void d0() {
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.operation_fragment_operation;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        x0.d().f(this);
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(View view) {
        Button button = (Button) W(R$id.btn_jump);
        this.o = button;
        button.setOnClickListener(this);
        Button button2 = (Button) W(R$id.btn_invoke);
        this.p = button2;
        button2.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.btn_jump) {
            d0();
        } else if (view.getId() == R$id.btn_invoke) {
            c0();
        }
    }
}
