package com.oplus.aiunit.vision;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.health.watchface.business.creation.category.outfits.bean.OutfitAlternativeVideoBean;

/* JADX INFO: loaded from: classes19.dex */
public class rud extends w3 {
    public rud(i11 i11Var) {
        super(i11Var);
    }

    @Override // com.oplus.aiunit.vision.w3
    @NonNull
    public qd4 d() {
        return new qd4(this.b.e().getOutfitWfUnique(), 1, lo9.TAG_DEFAULT_CREATION_OUTFITS, this.b.m().T());
    }

    @Override // com.oplus.aiunit.vision.w3
    public String e(k11 k11Var, String str, int i) {
        String str2;
        qud qudVar = (qud) k11Var;
        OutfitAlternativeVideoBean outfitAlternativeVideoBean = new OutfitAlternativeVideoBean();
        outfitAlternativeVideoBean.backgroundImgPath = str + "/" + qudVar.c();
        String strD = qudVar.d();
        if (TextUtils.isEmpty(strD)) {
            str2 = "";
        } else {
            str2 = str + "/" + strD;
        }
        outfitAlternativeVideoBean.backgroundPath = str2;
        outfitAlternativeVideoBean.aiShaderType = qudVar.b();
        outfitAlternativeVideoBean.mainColor = Color.parseColor(qudVar.e());
        outfitAlternativeVideoBean.secondColor = Color.parseColor(qudVar.g());
        outfitAlternativeVideoBean.thirdColor = Color.parseColor(qudVar.h());
        outfitAlternativeVideoBean.timeFilePath = this.b.m().d() + "/times/" + qudVar.i();
        return sc8.g(outfitAlternativeVideoBean);
    }
}
