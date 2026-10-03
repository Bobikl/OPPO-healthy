package com.oplus.aiunit.vision;

import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.healthbase.bean.SupportedPhoneBean;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000\u001a\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000¨\u0006\u0007"}, d2 = {"", "Lcom/heytap/health/healthbase/bean/SupportedPhoneBean$PhoneMeasureSleep;", "b", "Lcom/heytap/health/healthbase/bean/SupportedPhoneBean$PhoneMeasureSnore;", "c", "Lcom/heytap/health/healthbase/bean/SupportedPhoneBean$PhoneMeasureHeartRate;", "a", "health_base_release"}, k = 2, mv = {1, 8, 0})
public final class uu3 {
    @NotNull
    public static final List<SupportedPhoneBean.PhoneMeasureHeartRate> a() {
        List<SupportedPhoneBean.PhoneMeasureHeartRate> phoneMeasureHeartRate;
        SupportedPhoneBean supportedPhoneBean = (SupportedPhoneBean) GsonUtil.a(v9g.x("health_common_sp_name").E("health_support_mobile_phone", ""), SupportedPhoneBean.class);
        return (supportedPhoneBean == null || (phoneMeasureHeartRate = supportedPhoneBean.getPhoneMeasureHeartRate()) == null) ? new ArrayList() : phoneMeasureHeartRate;
    }

    @NotNull
    public static final List<SupportedPhoneBean.PhoneMeasureSleep> b() {
        List<SupportedPhoneBean.PhoneMeasureSleep> phoneMeasureSleep;
        SupportedPhoneBean supportedPhoneBean = (SupportedPhoneBean) GsonUtil.a(v9g.x("health_common_sp_name").E("health_support_mobile_phone", ""), SupportedPhoneBean.class);
        return (supportedPhoneBean == null || (phoneMeasureSleep = supportedPhoneBean.getPhoneMeasureSleep()) == null) ? new ArrayList() : phoneMeasureSleep;
    }

    @NotNull
    public static final List<SupportedPhoneBean.PhoneMeasureSnore> c() {
        List<SupportedPhoneBean.PhoneMeasureSnore> phoneMeasureSnore;
        SupportedPhoneBean supportedPhoneBean = (SupportedPhoneBean) GsonUtil.a(v9g.x("health_common_sp_name").E("health_support_mobile_phone", ""), SupportedPhoneBean.class);
        return (supportedPhoneBean == null || (phoneMeasureSnore = supportedPhoneBean.getPhoneMeasureSnore()) == null) ? new ArrayList() : phoneMeasureSnore;
    }
}
