package com.heytap.health.watchface.business.mine.base;

import android.content.Context;
import com.heytap.health.watchface.business.legacy.main.adapter.BaseAdapter;
import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;
import com.oplus.aiunit.vision.coi;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseInstallItemAdapter<T> extends BaseAdapter<T> {
    public a z;

    public interface a {
        void B3();

        void I5(int i, WatchFaceHomeCard.Item item, long j2, String str);

        void N2(int i, int i2, coi coiVar);
    }

    public BaseInstallItemAdapter(Context context, List<T> list) {
        super(context, list, true, false);
    }

    public void setOnItemClickListener(a aVar) {
        this.z = aVar;
    }

    @Override // com.heytap.health.watchface.business.legacy.main.adapter.BaseAdapter
    public int z(int i, T t) {
        return 1;
    }
}
