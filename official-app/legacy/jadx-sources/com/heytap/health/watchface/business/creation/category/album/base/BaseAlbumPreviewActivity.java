package com.heytap.health.watchface.business.creation.category.album.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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
import com.heytap.health.watchface.business.base.BaseDeviceInfoActivity;
import com.heytap.health.watchface.business.creation.category.album.AlbumEditActivity;
import com.heytap.health.watchface.business.creation.category.album.adapter.AlbumPreviewPhotoAdapter;
import com.heytap.health.watchface.business.creation.category.album.adapter.AlbumPreviewPhotoHorizontalAdapter;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.h4a;
import com.oplus.aiunit.vision.hx;
import com.oplus.aiunit.vision.jx;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.kvi;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.p06;
import com.oplus.aiunit.vision.y0k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseAlbumPreviewActivity extends BaseDeviceInfoActivity<Object, hx> implements View.OnClickListener, ViewPager.OnPageChangeListener, AlbumPreviewPhotoHorizontalAdapter.a, CompoundButton.OnCheckedChangeListener {
    public static final String EXTRA_IS_NOT_SELECT = "extra_preview_mode";
    public static final String EXTRA_SELECTED_IMAGE_POSITION = "extra_selected_image_position";
    public static final int REQUEST_TYPE_ADD = 1;
    public static final int REQUEST_TYPE_DEL = 0;
    public static final String REQUEST_TYPE_TAG = "request_type_tag";
    public static final String TAG = "BaseAlbumPhotoPreview2Activity";
    public h4a A;
    public List<ImageItem> B;
    public List<ImageItem> C;
    public ViewPager q;
    public TextView r;
    public TextView s;
    public TextView t;
    public CheckBox u;
    public COUIRecyclerView v;
    public AlbumPreviewPhotoAdapter w;
    public AlbumPreviewPhotoHorizontalAdapter x;
    public int y;
    public boolean z;

    public static void C7(Context context, Class<? extends BaseAlbumPreviewActivity> cls, int i, int i2) {
        D7(context, cls, i, true, i2);
    }

    public static void D7(Context context, Class<? extends BaseAlbumPreviewActivity> cls, int i, boolean z, int i2) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("extra_selected_image_position", i);
        intent.putExtra("extra_preview_mode", z);
        ((Activity) context).startActivityForResult(intent, i2);
    }

    public void A7(int i) {
        if (this.C != null) {
            TextView textView = this.t;
            String string = getString(R$string.watch_face_album_title_select_format);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(this.z ? h4a.i().j() : h4a.i().m());
            textView.setText(String.format(string, objArr));
        }
    }

    public final void B7() {
        List<ImageItem> list = this.C;
        boolean z = false;
        boolean z2 = list == null || list.size() == 0;
        if (!z2) {
            Iterator<ImageItem> it = this.C.iterator();
            do {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
            } while (it.next().mIsGray);
        } else {
            z = z2;
        }
        this.s.setTextColor(ContextCompat.getColor(this, z ? R$color.watch_face_common_dark_gray : R$color.watch_face_base_white));
        this.s.setEnabled(!z);
    }

    @Override // com.heytap.health.watchface.business.base.BaseDeviceInfoActivity, com.heytap.health.watchface.business.base.BaseWatchFaceActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
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
        if (compoundButton.isPressed() && this.y <= this.B.size() - 1) {
            ImageItem imageItem = this.B.get(this.y);
            if (z && this.A.k() >= (iJ = this.A.j())) {
                ltl.a(TAG, "[onClick] have max selectLimit =  " + iJ);
                int iM = this.A.m();
                y0k.i(b78.a().getResources().getQuantityString(R$plurals.watch_face_album_select_max_photos, iM, Integer.valueOf(iM)));
                this.u.setChecked(false);
                return;
            }
            this.A.a(imageItem, z);
            ltl.a(TAG, "[onCheckedChanged] mCurrentPosition " + this.y + " imageItem " + imageItem + " isChecked " + z);
            y7(z, imageItem);
            A7(this.A.l().size());
            B7();
            this.x.notifyDataSetChanged();
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
            Intent intent2 = new Intent(this, (Class<?>) AlbumEditActivity.class);
            intent2.putExtra("request_type_tag", 1);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // com.heytap.health.watchface.business.creation.category.album.adapter.AlbumPreviewPhotoHorizontalAdapter.a
    public void onItemClick(int i) {
        this.y = i;
        ImageItem imageItem = this.C.get(i);
        ltl.a(TAG, "[onItemClick] position =  " + i + " imageItem " + imageItem);
        int iIndexOf = this.B.indexOf(imageItem);
        if (iIndexOf != -1) {
            this.q.setCurrentItem(iIndexOf, false);
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
        this.y = i;
        z7(i);
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    public void q7(Intent intent) {
        super.q7(intent);
        this.y = intent.getIntExtra("extra_selected_image_position", 0);
        this.z = intent.getBooleanExtra("extra_preview_mode", true);
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    public void r7(Bundle bundle) {
        super.r7(bundle);
        this.A = h4a.i();
        this.B = new ArrayList();
        this.C = new ArrayList();
        List<ImageItem> listW7 = w7();
        if (listW7 == null || listW7.size() == 0) {
            return;
        }
        this.B.addAll(listW7);
        this.C.addAll(this.A.l());
        kvi kviVar = new kvi(((hx) this.o).s());
        AlbumPreviewPhotoAdapter albumPreviewPhotoAdapter = new AlbumPreviewPhotoAdapter(this, this.B, kviVar);
        this.w = albumPreviewPhotoAdapter;
        this.q.setAdapter(albumPreviewPhotoAdapter);
        this.q.setCurrentItem(this.y, false);
        this.q.setOnPageChangeListener(this);
        this.x = new AlbumPreviewPhotoHorizontalAdapter(this, this.C, kviVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f6663n);
        linearLayoutManager.setOrientation(0);
        this.v.setLayoutManager(linearLayoutManager);
        this.v.setAdapter(this.x);
        this.x.setOnItemClickListener(this);
        B7();
        z7(this.y);
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    public void t7(Bundle bundle) {
        h6(this, ContextCompat.getColor(this, R$color.watch_face_base_black));
        getWindow().getDecorView().setSystemUiVisibility(k18.GL_INVALID_ENUM);
        this.q = (ViewPager) findViewById(R$id.vp_pager);
        this.r = (TextView) findViewById(R$id.tv_cancle);
        this.s = (TextView) findViewById(R$id.tv_add_photo);
        this.t = (TextView) findViewById(R$id.tv_selected_title);
        this.v = (COUIRecyclerView) findViewById(R$id.crv_photo);
        CheckBox checkBox = (CheckBox) findViewById(R$id.iv_select);
        this.u = checkBox;
        checkBox.setVisibility(this.z ? 0 : 8);
        this.s.setVisibility(this.z ? 0 : 4);
        this.r.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.u.setOnCheckedChangeListener(this);
    }

    public abstract List<ImageItem> w7();

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    /* JADX INFO: renamed from: x7, reason: merged with bridge method [inline-methods] */
    public hx s7() {
        return new jx();
    }

    public abstract void y7(boolean z, ImageItem imageItem);

    public final void z7(int i) {
        A7(this.A.l().size());
        if (i > this.B.size() - 1) {
            return;
        }
        ImageItem imageItem = this.B.get(i);
        this.u.setChecked(this.A.l().contains(imageItem));
        int iIndexOf = this.x.getData().indexOf(imageItem);
        if (iIndexOf != -1) {
            this.v.scrollToPosition(iIndexOf);
            this.x.g(imageItem);
        } else {
            this.x.g(null);
        }
        this.x.notifyDataSetChanged();
    }
}
