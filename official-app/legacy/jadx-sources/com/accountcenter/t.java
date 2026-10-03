package com.accountcenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.platform.sdk.center.R;
import com.platform.sdk.center.sdk.mvvm.model.data.AcCardOperationResult;
import com.platform.sdk.center.statistic.AcStatisticMethod;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import com.platform.usercenter.account.newcommon.router.LinkInfoHelp;
import com.platform.usercenter.tools.datastructure.Lists;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends BaseAdapter {
    public final Context a;
    public final List<AcCardOperationResult.OperationInfo.LoginRemindListBean> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f486c;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public final void onClick(View view) {
            t tVar = t.this;
            int iIntValue = ((Integer) view.getTag()).intValue();
            AcCardOperationResult.OperationInfo.LoginRemindListBean loginRemindListBean = (!Lists.isNullOrEmpty(tVar.b) && iIntValue < tVar.b.size()) ? tVar.b.get(iIntValue) : null;
            if (loginRemindListBean != null) {
                LinkInfo linkInfoFromAccount = LinkInfoHelp.getLinkInfoFromAccount(t.this.a, loginRemindListBean.linkInfo);
                int i = loginRemindListBean.id;
                AcStatisticMethod.avatarShow(t.this.a, i + "");
                if (linkInfoFromAccount != null) {
                    linkInfoFromAccount.open(t.this.a);
                }
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class b {
        public TextView a;
    }

    public t(Context context, List<AcCardOperationResult.OperationInfo.LoginRemindListBean> list) {
        this.a = context;
        this.b = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (Lists.isNullOrEmpty(this.b)) {
            return 0;
        }
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (!Lists.isNullOrEmpty(this.b) && i < this.b.size()) {
            return this.b.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        AcCardOperationResult.OperationInfo.LoginRemindListBean loginRemindListBean = null;
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(R.layout.account_center_view_vf_unlogin_remind_textview, (ViewGroup) null);
            bVar = new b();
            bVar.a = (TextView) view.findViewById(R.id.tv_unlogin_remind);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        if (!Lists.isNullOrEmpty(this.b) && i < this.b.size()) {
            loginRemindListBean = this.b.get(i);
        }
        if (loginRemindListBean != null) {
            int i2 = this.f486c;
            if (i2 != 0) {
                bVar.a.setTextColor(i2);
            }
            bVar.a.setText(loginRemindListBean.content);
            bVar.a.setTag(Integer.valueOf(i));
            bVar.a.setOnClickListener(new a());
        }
        return view;
    }
}
