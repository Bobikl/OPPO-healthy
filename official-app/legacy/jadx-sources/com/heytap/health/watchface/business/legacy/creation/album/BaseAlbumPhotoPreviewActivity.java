package com.heytap.health.watchface.business.legacy.creation.album;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.COUIRecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.heytap.health.watchface.R$color;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.R$plurals;
import com.heytap.health.watchface.R$string;
import com.heytap.health.watchface.business.base.BaseWatchFaceActivity;
import com.heytap.health.watchface.business.legacy.creation.album.adapter.AlbumWatchFacePreviewPhotoHorizontalAdapter;
import com.heytap.health.watchface.business.legacy.creation.album.adapter.AlbumWatchFacePreviewPhotoPageAdapter;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.gx;
import com.oplus.aiunit.vision.h4a;
import com.oplus.aiunit.vision.ix;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.kvi;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.mt;
import com.oplus.aiunit.vision.ntl;
import com.oplus.aiunit.vision.p06;
import com.oplus.aiunit.vision.vda;
import com.oplus.aiunit.vision.y0k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseAlbumPhotoPreviewActivity extends BaseWatchFaceActivity<Object, gx> implements View.OnClickListener, ViewPager.OnPageChangeListener, AlbumWatchFacePreviewPhotoHorizontalAdapter.a, CompoundButton.OnCheckedChangeListener {
    public static final String EXTRA_IS_NOT_SELECT = "extra_preview_mode";
    public static final String EXTRA_SELECTED_IMAGE_POSITION = "extra_selected_image_position";
    public static final int REQUEST_TYPE_ADD = 1;
    public static final int REQUEST_TYPE_DEL = 0;
    public static final String REQUEST_TYPE_TAG = "request_type_tag";
    public static final String TAG = "BaseAlbumPhotoPreviewActivity";
    public List<ImageItem> A;
    public List<ImageItem> B;
    public kvi C;
    public int D = 0;
    public ViewPager p;
    public TextView q;
    public TextView r;
    public TextView s;
    public CheckBox t;
    public COUIRecyclerView u;
    public AlbumWatchFacePreviewPhotoPageAdapter v;
    public AlbumWatchFacePreviewPhotoHorizontalAdapter w;
    public int x;
    public boolean y;
    public h4a z;

    public static void C7(Context context, Class<? extends BaseAlbumPhotoPreviewActivity> cls, int i, int i2, int i3) {
        E7(context, cls, i, true, i2, i3);
    }

    public static void D7(Context context, Class<? extends BaseAlbumPhotoPreviewActivity> cls, int i, boolean z, int i2) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("extra_selected_image_position", i);
        intent.putExtra("extra_preview_mode", z);
        ((Activity) context).startActivityForResult(intent, i2);
    }

    public static void E7(Context context, Class<? extends BaseAlbumPhotoPreviewActivity> cls, int i, boolean z, int i2, int i3) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("extra_selected_image_position", i);
        intent.putExtra("extra_preview_mode", z);
        intent.putExtra("bundle_page_type", i3);
        ((Activity) context).startActivityForResult(intent, i2);
    }

    public void A7(int i) {
        if (this.B != null) {
            TextView textView = this.s;
            String string = getString(R$string.watch_face_album_title_select_format);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(this.y ? h4a.i().j() : h4a.i().m());
            textView.setText(String.format(string, objArr));
        }
    }

    public final void B7() {
        List<ImageItem> list = this.B;
        boolean z = false;
        boolean z2 = list == null || list.size() == 0;
        if (!z2) {
            Iterator<ImageItem> it = this.B.iterator();
            do {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
            } while (it.next().mIsGray);
        } else {
            z = z2;
        }
        this.r.setTextColor(ContextCompat.getColor(this, z ? R$color.watch_face_common_dark_gray : R$color.watch_face_base_white));
        this.r.setEnabled(!z);
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    public View o7() {
        return View.inflate(this, R$layout.watch_face_activity_album_photo_preview, null);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("request_type_tag", 0);
        setResult(-1, intent);
        finish();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int iJ;
        if (compoundButton.isPressed() && this.x <= this.A.size() - 1) {
            ImageItem imageItem = this.A.get(this.x);
            if (z && this.z.k() >= (iJ = this.z.j())) {
                ltl.a(TAG, "[onClick] have max selectLimit =  " + iJ);
                int iM = this.z.m();
                y0k.i(b78.a().getResources().getQuantityString(R$plurals.watch_face_album_select_max_photos, iM, Integer.valueOf(iM)));
                this.t.setChecked(false);
                return;
            }
            this.z.a(imageItem, z);
            ltl.a(TAG, "[onCheckedChanged] mCurrentPosition " + this.x + " imageItem " + imageItem + " isChecked " + z);
            y7(z, imageItem);
            A7(this.z.l().size());
            B7();
            this.w.notifyDataSetChanged();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        p06.f(view);
        int id = view.getId();
        if (id == R$id.tv_cancle) {
            Intent intent = new Intent();
            intent.putExtra("request_type_tag", 0);
            setResult(-1, intent);
            finish();
            return;
        }
        if (id == R$id.tv_add_photo) {
            if (this.D != 0 || mt.c(this)) {
                Intent intent2 = new Intent(this, (Class<?>) AlbumPhotoTransmitActivity.class);
                intent2.putExtra("request_type_tag", 1);
                setResult(-1, intent2);
                finish();
            }
        }
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.album.adapter.AlbumWatchFacePreviewPhotoHorizontalAdapter.a
    public void onItemClick(int i) {
        this.x = i;
        ImageItem imageItem = this.B.get(i);
        ltl.a(TAG, "[onItemClick] position =  " + i + " imageItem " + imageItem);
        int iIndexOf = this.A.indexOf(imageItem);
        if (iIndexOf != -1) {
            this.p.setCurrentItem(iIndexOf, false);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        this.x = i;
        z7(i);
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    public void q7(Intent intent) {
        super.q7(intent);
        this.x = intent.getIntExtra("extra_selected_image_position", 0);
        this.y = intent.getBooleanExtra("extra_preview_mode", true);
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    public void r7(Bundle bundle) {
        super.r7(bundle);
        this.D = vda.f(getIntent(), "bundle_page_type", 0);
        this.z = h4a.i();
        this.A = new ArrayList();
        this.B = new ArrayList();
        List<ImageItem> listW7 = w7();
        if (listW7 == null || listW7.size() == 0) {
            ltl.a(TAG, "[initData] pagerImageItems is empty.");
            return;
        }
        this.A.addAll(listW7);
        this.B.addAll(this.z.l());
        AlbumWatchFacePreviewPhotoPageAdapter albumWatchFacePreviewPhotoPageAdapter = new AlbumWatchFacePreviewPhotoPageAdapter(this, this.A, this.C);
        this.v = albumWatchFacePreviewPhotoPageAdapter;
        this.p.setAdapter(albumWatchFacePreviewPhotoPageAdapter);
        this.p.setCurrentItem(this.x, false);
        this.p.setOnPageChangeListener(this);
        this.w = new AlbumWatchFacePreviewPhotoHorizontalAdapter(this, this.B, this.C);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f6663n);
        linearLayoutManager.setOrientation(0);
        this.u.setLayoutManager(linearLayoutManager);
        this.u.setAdapter(this.w);
        this.w.setOnItemClickListener(this);
        B7();
        z7(this.x);
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    public void t7(Bundle bundle) {
        h6(this, ContextCompat.getColor(this, R$color.watch_face_base_black));
        getWindow().getDecorView().setSystemUiVisibility(k18.GL_INVALID_ENUM);
        this.p = (ViewPager) findViewById(R$id.vp_pager);
        this.q = (TextView) findViewById(R$id.tv_cancle);
        this.r = (TextView) findViewById(R$id.tv_add_photo);
        this.s = (TextView) findViewById(R$id.tv_selected_title);
        this.u = (COUIRecyclerView) findViewById(R$id.crv_photo);
        CheckBox checkBox = (CheckBox) findViewById(R$id.iv_select);
        this.t = checkBox;
        checkBox.setVisibility(this.y ? 0 : 8);
        this.r.setVisibility(this.y ? 0 : 4);
        this.q.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.t.setOnCheckedChangeListener(this);
        if (this.D == 1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.p.getLayoutParams();
            layoutParams.topMargin = ejg.a(this, 50.0f);
            layoutParams.bottomMargin = ejg.a(this, 140.0f);
        }
    }

    public abstract List<ImageItem> w7();

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    /* JADX INFO: renamed from: x7, reason: merged with bridge method [inline-methods] */
    public gx s7() {
        int iF = vda.f(getIntent(), "bundle_page_type", 0);
        this.D = iF;
        if (iF == 0) {
            this.C = ntl.m().f().m();
        }
        return new ix();
    }

    public abstract void y7(boolean z, ImageItem imageItem);

    public final void z7(int i) {
        A7(this.z.l().size());
        if (i > this.A.size() - 1) {
            return;
        }
        ImageItem imageItem = this.A.get(i);
        this.t.setChecked(this.z.l().contains(imageItem));
        int iIndexOf = this.w.getData().indexOf(imageItem);
        if (iIndexOf != -1) {
            this.u.scrollToPosition(iIndexOf);
            this.w.g(imageItem);
        } else {
            this.w.g(null);
        }
        this.w.notifyDataSetChanged();
    }
}
