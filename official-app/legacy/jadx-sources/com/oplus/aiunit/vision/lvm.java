package com.oplus.aiunit.vision;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AutoCompleteTextView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.amap.api.maps.offlinemap.DownLoadExpandListView;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.heytap.health.R;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class lvm extends xam implements TextWatcher, View.OnTouchListener, AbsListView.OnScrollListener, OfflineMapManager.OfflineLoadedListener, OfflineMapManager.OfflineMapDownloadListener {
    public qtm A;
    public com.amap.api.col.p0003sl.fa F;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f13853j;
    public RelativeLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DownLoadExpandListView f13854l;
    public ListView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ExpandableListView f13855n;
    public ImageView o;
    public ImageView p;
    public AutoCompleteTextView q;
    public RelativeLayout r;
    public RelativeLayout s;
    public ImageView t;
    public ImageView u;
    public RelativeLayout v;
    public ptm x;
    public otm z;
    public List<OfflineMapProvince> w = new ArrayList();
    public OfflineMapManager y = null;
    public boolean B = true;
    public boolean C = true;
    public int D = -1;
    public long E = 0;
    public boolean G = true;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public final void onClick(View view) {
            try {
                lvm.this.q.setText("");
                lvm.this.t.setVisibility(8);
                lvm.this.k(false);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) lvm.this.u.getLayoutParams();
                layoutParams.leftMargin = lvm.this.a(95.0f);
                lvm.this.u.setLayoutParams(layoutParams);
                lvm.this.q.setPadding(lvm.this.a(105.0f), 0, 0, 0);
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            } catch (Exception e2) {
                e2.printStackTrace();
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        }
    }

    public class b implements Comparator<OfflineMapCity> {
        public b() {
        }

        public static int a(OfflineMapCity offlineMapCity, OfflineMapCity offlineMapCity2) {
            char[] charArray = offlineMapCity.getJianpin().toCharArray();
            char[] charArray2 = offlineMapCity2.getJianpin().toCharArray();
            return (charArray[0] >= charArray2[0] && charArray[1] >= charArray2[1]) ? 0 : 1;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(OfflineMapCity offlineMapCity, OfflineMapCity offlineMapCity2) {
            return a(offlineMapCity, offlineMapCity2);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.oplus.aiunit.vision.xam
    public final void c(View view) {
        try {
            int id = view.getId();
            if (id == R.dimen.NXShapeColorTopTipsRadius) {
                this.i.closeScr();
                return;
            }
            if (id == R.dimen.CommContentPadding) {
                if (this.C) {
                    this.f13854l.setVisibility(8);
                    this.o.setBackgroundResource(R.animator.bus_shift_in_first);
                    this.C = false;
                    return;
                } else {
                    this.f13854l.setVisibility(0);
                    this.o.setBackgroundResource(R.animator.account_center_vf_in);
                    this.C = true;
                    return;
                }
            }
            if (id == R.dimen.NXColorGradientLinearLayout_padding_left) {
                if (this.B) {
                    this.x.c();
                    this.p.setBackgroundResource(R.animator.bus_shift_in_first);
                    this.B = false;
                } else {
                    this.x.a();
                    this.p.setBackgroundResource(R.animator.account_center_vf_in);
                    this.B = true;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.oplus.aiunit.vision.xam
    public final void e() {
        View viewD = kxm.d(this.i, R.array.NXcolor_lunar_mounth);
        DownLoadExpandListView downLoadExpandListView = (DownLoadExpandListView) viewD.findViewById(R.dimen.CommTextSizeContentMax);
        this.f13854l = downLoadExpandListView;
        downLoadExpandListView.setOnTouchListener(this);
        this.r = (RelativeLayout) viewD.findViewById(R.dimen.CommContentPadding);
        this.o = (ImageView) viewD.findViewById(R.dimen.CommTextSizeContent);
        this.r.setOnClickListener(this.i);
        this.s = (RelativeLayout) viewD.findViewById(R.dimen.NXColorGradientLinearLayout_padding_left);
        this.p = (ImageView) viewD.findViewById(R.dimen.NXColorGradientLinearLayout_padding_right);
        this.s.setOnClickListener(this.i);
        this.v = (RelativeLayout) viewD.findViewById(R.dimen.NXColorGradientLinearLayout_padding_bottom);
        ImageView imageView = (ImageView) this.k.findViewById(R.dimen.NXShapeColorTopTipsRadius);
        this.f13853j = imageView;
        imageView.setOnClickListener(this.i);
        this.u = (ImageView) this.k.findViewById(R.dimen.NXTD01);
        ImageView imageView2 = (ImageView) this.k.findViewById(R.dimen.NXTD05);
        this.t = imageView2;
        imageView2.setOnClickListener(new a());
        this.k.findViewById(R.dimen.NXTD06).setOnTouchListener(this);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.k.findViewById(R.dimen.NXTD03);
        this.q = autoCompleteTextView;
        autoCompleteTextView.addTextChangedListener(this);
        this.q.setOnTouchListener(this);
        this.m = (ListView) this.k.findViewById(R.dimen.NXTD08);
        ExpandableListView expandableListView = (ExpandableListView) this.k.findViewById(R.dimen.NXTD07);
        this.f13855n = expandableListView;
        expandableListView.addHeaderView(viewD);
        this.f13855n.setOnTouchListener(this);
        this.f13855n.setOnScrollListener(this);
        try {
            OfflineMapManager offlineMapManager = new OfflineMapManager(this.i, this);
            this.y = offlineMapManager;
            offlineMapManager.setOnOfflineLoadedListener(this);
        } catch (Exception e2) {
            Log.e("OfflineMapPage", "e=".concat(String.valueOf(e2)));
        }
        q();
        ptm ptmVar = new ptm(this.w, this.y, this.i);
        this.x = ptmVar;
        this.f13855n.setAdapter(ptmVar);
        this.f13855n.setOnGroupCollapseListener(this.x);
        this.f13855n.setOnGroupExpandListener(this.x);
        this.f13855n.setGroupIndicator(null);
        if (this.B) {
            this.p.setBackgroundResource(R.animator.account_center_vf_in);
            this.f13855n.setVisibility(0);
        } else {
            this.p.setBackgroundResource(R.animator.bus_shift_in_first);
            this.f13855n.setVisibility(8);
        }
        if (this.C) {
            this.o.setBackgroundResource(R.animator.account_center_vf_in);
            this.f13854l.setVisibility(0);
        } else {
            this.o.setBackgroundResource(R.animator.bus_shift_in_first);
            this.f13854l.setVisibility(8);
        }
    }

    @Override // com.oplus.aiunit.vision.xam
    public final boolean f() {
        try {
            if (this.m.getVisibility() == 0) {
                this.q.setText("");
                this.t.setVisibility(8);
                k(false);
                return false;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return super.f();
    }

    @Override // com.oplus.aiunit.vision.xam
    public final RelativeLayout g() {
        if (this.k == null) {
            this.k = (RelativeLayout) kxm.d(this.i, R.array.NXcolor_theme_arrays_first_theme3);
        }
        return this.k;
    }

    @Override // com.oplus.aiunit.vision.xam
    public final void h() {
        this.y.destroy();
    }

    public final void j(OfflineMapCity offlineMapCity) {
        try {
            if (this.F == null) {
                this.F = new com.amap.api.col.p0003sl.fa(this.i, this.y);
            }
            this.F.c(offlineMapCity.getState(), offlineMapCity.getCity());
            this.F.show();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void k(boolean z) {
        if (z) {
            this.r.setVisibility(8);
            this.s.setVisibility(8);
            this.f13854l.setVisibility(8);
            this.f13855n.setVisibility(8);
            this.v.setVisibility(8);
            this.m.setVisibility(0);
            return;
        }
        this.r.setVisibility(0);
        this.s.setVisibility(0);
        this.v.setVisibility(0);
        this.f13854l.setVisibility(this.C ? 0 : 8);
        this.f13855n.setVisibility(this.B ? 0 : 8);
        this.m.setVisibility(8);
    }

    public final void n() {
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.u.getLayoutParams();
            layoutParams.leftMargin = a(18.0f);
            this.u.setLayoutParams(layoutParams);
            this.q.setPadding(a(30.0f), 0, 0, 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void o() {
        q();
        qtm qtmVar = new qtm(this.y, this.i);
        this.A = qtmVar;
        this.m.setAdapter((ListAdapter) qtmVar);
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onCheckUpdate(boolean z, String str) {
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onDownload(int i, int i2, String str) {
        if (i == 101) {
            try {
                Toast.makeText(this.i, "网络异常", 0).show();
                this.y.pause();
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (i == 2) {
            this.z.b();
        }
        if (this.D == i) {
            if (System.currentTimeMillis() - this.E > h27.FAMILY_PULL_REFRESH_DELAY) {
                if (this.G) {
                    this.z.notifyDataSetChanged();
                }
                this.E = System.currentTimeMillis();
                return;
            }
            return;
        }
        ptm ptmVar = this.x;
        if (ptmVar != null) {
            ptmVar.notifyDataSetChanged();
        }
        otm otmVar = this.z;
        if (otmVar != null) {
            otmVar.notifyDataSetChanged();
        }
        qtm qtmVar = this.A;
        if (qtmVar != null) {
            qtmVar.notifyDataSetChanged();
        }
        this.D = i;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onRemove(boolean z, String str, String str2) {
        otm otmVar = this.z;
        if (otmVar != null) {
            otmVar.c();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 2) {
            this.G = false;
        } else {
            this.G = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence)) {
            k(false);
            this.t.setVisibility(8);
            return;
        }
        this.t.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        List<OfflineMapProvince> list = this.w;
        if (list != null && list.size() > 0) {
            ArrayList<OfflineMapCity> arrayList2 = new ArrayList();
            Iterator<OfflineMapProvince> it = this.w.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().getCityList());
            }
            for (OfflineMapCity offlineMapCity : arrayList2) {
                String city = offlineMapCity.getCity();
                String pinyin = offlineMapCity.getPinyin();
                String jianpin = offlineMapCity.getJianpin();
                if (charSequence.length() == 1) {
                    if (jianpin.startsWith(String.valueOf(charSequence))) {
                        arrayList.add(offlineMapCity);
                    }
                } else if (jianpin.startsWith(String.valueOf(charSequence)) || pinyin.startsWith(String.valueOf(charSequence)) || city.startsWith(String.valueOf(charSequence))) {
                    arrayList.add(offlineMapCity);
                }
            }
        }
        if (arrayList.size() <= 0) {
            Toast.makeText(this.i, "未找到相关城市", 0).show();
            return;
        }
        k(true);
        Collections.sort(arrayList, new b());
        qtm qtmVar = this.A;
        if (qtmVar != null) {
            qtmVar.b(arrayList);
            this.A.notifyDataSetChanged();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r();
        if (view.getId() != R.dimen.NXTD03) {
            return false;
        }
        n();
        return false;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener
    public final void onVerifyComplete() {
        o();
        p();
    }

    public final void p() {
        otm otmVar = new otm(this.i, this, this.y, this.w);
        this.z = otmVar;
        this.f13854l.setAdapter(otmVar);
        this.z.notifyDataSetChanged();
    }

    public final void q() {
        ArrayList<OfflineMapProvince> offlineMapProvinceList = this.y.getOfflineMapProvinceList();
        this.w.clear();
        this.w.add(null);
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        ArrayList<OfflineMapCity> arrayList2 = new ArrayList<>();
        ArrayList<OfflineMapCity> arrayList3 = new ArrayList<>();
        for (int i = 0; i < offlineMapProvinceList.size(); i++) {
            OfflineMapProvince offlineMapProvince = offlineMapProvinceList.get(i);
            if (offlineMapProvince.getCityList().size() != 1) {
                this.w.add(i + 1, offlineMapProvince);
            } else {
                String provinceName = offlineMapProvince.getProvinceName();
                if (provinceName.contains("香港")) {
                    arrayList2.addAll(offlineMapProvince.getCityList());
                } else if (provinceName.contains("澳门")) {
                    arrayList2.addAll(offlineMapProvince.getCityList());
                } else if (provinceName.contains("全国概要图")) {
                    arrayList3.addAll(0, offlineMapProvince.getCityList());
                } else {
                    arrayList3.addAll(offlineMapProvince.getCityList());
                }
            }
        }
        OfflineMapProvince offlineMapProvince2 = new OfflineMapProvince();
        offlineMapProvince2.setProvinceName("基本功能包+直辖市");
        offlineMapProvince2.setCityList(arrayList3);
        this.w.set(0, offlineMapProvince2);
        OfflineMapProvince offlineMapProvince3 = new OfflineMapProvince();
        offlineMapProvince3.setProvinceName("直辖市");
        offlineMapProvince3.setCityList(arrayList);
        OfflineMapProvince offlineMapProvince4 = new OfflineMapProvince();
        offlineMapProvince4.setProvinceName("港澳");
        offlineMapProvince4.setCityList(arrayList2);
        this.w.add(offlineMapProvince4);
        OfflineMapProvince offlineMapProvince5 = new OfflineMapProvince();
        offlineMapProvince5.setProvinceName("台湾省");
        ArrayList<OfflineMapCity> arrayList4 = new ArrayList<>();
        OfflineMapCity offlineMapCity = new OfflineMapCity();
        offlineMapCity.setCity("暂不支持下载");
        arrayList4.add(offlineMapCity);
        offlineMapProvince5.setCityList(arrayList4);
        this.w.add(offlineMapProvince5);
    }

    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.q;
        if (autoCompleteTextView == null || !autoCompleteTextView.isFocused()) {
            return;
        }
        this.q.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.i.getSystemService("input_method");
        if (inputMethodManager != null ? inputMethodManager.isActive() : false) {
            inputMethodManager.hideSoftInputFromWindow(this.q.getWindowToken(), 2);
        }
    }
}
