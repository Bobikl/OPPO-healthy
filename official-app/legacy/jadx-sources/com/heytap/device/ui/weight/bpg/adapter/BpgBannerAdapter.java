package com.heytap.device.ui.weight.bpg.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.heytap.device.R$drawable;
import com.heytap.device.R$id;
import com.heytap.device.R$layout;
import com.heytap.sporthealth.blib.banner.BaseBannerAdapter;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public class BpgBannerAdapter extends BaseBannerAdapter<BaseBannerAdapter.ViewHolder, Integer> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer[] f3040j;

    public BpgBannerAdapter() {
        Integer[] numArr = {Integer.valueOf(R$drawable.deivce_bpg_guide_pic_1), Integer.valueOf(R$drawable.deivce_bpg_guide_pic_2), Integer.valueOf(R$drawable.deivce_bpg_guide_pic_3)};
        this.f3040j = numArr;
        setData(new ArrayList(Arrays.asList(numArr)));
    }

    @Override // com.heytap.sporthealth.blib.banner.BaseBannerAdapter
    public BaseBannerAdapter.ViewHolder e(@NonNull ViewGroup viewGroup, int i) {
        return new BaseBannerAdapter.ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.device_item_bpg_img, viewGroup, false));
    }

    @Override // com.heytap.sporthealth.blib.banner.BaseBannerAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void g(BaseBannerAdapter.ViewHolder viewHolder, Integer num, int i) {
        ((ImageView) viewHolder.findView(R$id.iv_bpg_item_img)).setImageResource(num.intValue());
    }
}
