package com.heytap.health.watchface.business.mine.base;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.watchface.R$dimen;
import com.heytap.health.watchface.business.legacy.main.adapter.BaseAdapter;
import com.heytap.health.watchface.business.legacy.main.util.NoCrashLinearLayoutManager;
import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;
import com.oplus.aiunit.vision.m41;
import com.oplus.aiunit.vision.ntl;
import com.oplus.aiunit.vision.os4;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseInstallStatusActivity extends BaseInstallItemActivity<WatchFaceHomeCard.Item, InstallStatusAdapter> implements os4 {
    public static final String TAG = "BaseInstallStatusActivity";

    public class a extends RecyclerView.ItemDecoration {
        public final int a;
        public final int b;

        public a() {
            this.a = BaseInstallStatusActivity.this.getResources().getDimensionPixelSize(R$dimen.watch_face_margin_12);
            this.b = BaseInstallStatusActivity.this.getResources().getDimensionPixelSize(R$dimen.watch_face_dimen_24);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            if (childAdapterPosition == 0) {
                rect.top = this.a;
            }
            rect.bottom = this.b;
        }
    }

    @Override // com.heytap.health.watchface.business.mine.base.BaseInstallItemActivity
    public void G7(RecyclerView recyclerView, BaseAdapter baseAdapter) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new NoCrashLinearLayoutManager(this));
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new a());
    }

    @Override // com.heytap.health.watchface.business.mine.base.BaseInstallItemActivity
    /* JADX INFO: renamed from: N7, reason: merged with bridge method [inline-methods] */
    public InstallStatusAdapter C7() {
        return new InstallStatusAdapter(this, ((m41) this.o).s(), O7());
    }

    public boolean O7() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.os4
    public String getDeviceMac() {
        return ((m41) this.o).s().getDeviceMac();
    }

    @Override // com.heytap.health.watchface.business.mine.base.BaseInstallItemActivity, com.heytap.health.watchface.business.base.BaseWatchFaceStatusActivity, com.heytap.health.watchface.business.base.BaseDeviceInfoActivity, com.heytap.health.watchface.business.base.BaseWatchFaceActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.oplus.aiunit.vision.os4
    public void i6(String str, int i, int i2) {
        ((m41) this.o).i6(str, i, i2);
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceStatusActivity, com.heytap.health.watchface.business.base.BaseWatchFaceActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ntl.m().t(this);
    }

    @Override // com.heytap.health.watchface.business.base.BaseWatchFaceActivity
    public void r7(Bundle bundle) {
        super.r7(bundle);
        ntl.m().q(this);
    }
}
