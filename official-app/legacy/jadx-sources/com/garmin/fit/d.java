package com.garmin.fit;

import androidx.core.provider.FontsContractCompat;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.oplus.aiunit.vision.bxb;
import com.oplus.aiunit.vision.p2j;
import com.oplus.aiunit.vision.s05;
import com.oplus.aiunit.vision.w07;
import com.oplus.aiunit.vision.w97;

/* JADX INFO: loaded from: classes13.dex */
public class d extends bxb {
    public static final int ManufacturerFieldNum = 1;
    public static final int NumberFieldNum = 5;
    public static final int ProductFieldNum = 2;
    public static final int ProductNameFieldNum = 8;
    public static final int SerialNumberFieldNum = 3;
    public static final int TimeCreatedFieldNum = 4;
    public static final int TypeFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb(FontsContractCompat.Columns.FILE_ID, 0);
        h = bxbVar;
        bxbVar.e(new w97("type", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.FILE));
        bxbVar.e(new w97("manufacturer", 1, 132, 1.0d, 0.0d, "", false, Profile$Type.MANUFACTURER));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("product", 2, 132, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.d.get(2).k.add(new p2j("favero_product", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(2).k.get(0).b(1, 263L);
        bxbVar.d.get(2).k.add(new p2j("garmin_product", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(2).k.get(1).b(1, 1L);
        bxbVar.d.get(2).k.get(1).b(1, 15L);
        bxbVar.d.get(2).k.get(1).b(1, 13L);
        bxbVar.d.get(2).k.get(1).b(1, 89L);
        bxbVar.e(new w97("serial_number", 3, 140, 1.0d, 0.0d, "", false, Profile$Type.UINT32Z));
        bxbVar.e(new w97("time_created", 4, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("number", 5, 132, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97(SensorsBean.PRODUCT_NAME, 8, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
    }

    public d() {
        super(w07.b(0));
    }

    public void A(Integer num) {
        v(1, 0, num, 65535);
    }

    public void B(Integer num) {
        v(2, 0, num, 65535);
    }

    public void C(Long l2) {
        v(3, 0, l2, 65535);
    }

    public void D(s05 s05Var) {
        v(4, 0, s05Var.l(), 65535);
    }

    public void E(File file) {
        v(0, 0, Short.valueOf(file.value), 65535);
    }

    public Long z() {
        return m(3, 0, 65535);
    }

    public d(bxb bxbVar) {
        super(bxbVar);
    }
}
