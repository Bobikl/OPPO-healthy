package com.heytap.health.device.third.bgp;

import android.text.TextUtils;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.alibaba.android.arouter.facade.template.IProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public interface IBpgService extends IProvider {
    public static final String HEYTAP_MODEL_9200T = "OM22101";
    public static final Map<String, String> heytapModel2BpgDeivceTypeMap = new HashMap<String, String>() { // from class: com.heytap.health.device.third.bgp.IBpgService.1
        {
            put(IBpgService.HEYTAP_MODEL_9200T, "HEM-9200T");
        }
    };
    public static final Map<String, String> deivceType2HeytapModelMap = new HashMap<String, String>() { // from class: com.heytap.health.device.third.bgp.IBpgService.2
        {
            put("HEM-9200T", IBpgService.HEYTAP_MODEL_9200T);
        }
    };
    public static final List<String> deviceType2BpgSdkDeivceTypeMap = new ArrayList<String>() { // from class: com.heytap.health.device.third.bgp.IBpgService.3
        {
            add("HEM-9200T");
        }
    };

    public interface a {
        void F6(BpgBean bpgBean);

        void i3(BpgBean bpgBean);

        void o4(BpgBean bpgBean);

        void y5();
    }

    public interface b {
        void a(boolean z, String str);
    }

    static String W1(String str) {
        String str2 = heytapModel2BpgDeivceTypeMap.get(str);
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    static String k6(String str) {
        String str2 = deivceType2HeytapModelMap.get(str);
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    LiveData<BpgBean> M6(String str);

    void O0();

    void O6(BpgBean bpgBean, b bVar);

    void c4(FragmentActivity fragmentActivity, String str, ImageView imageView);

    void m4();

    void o1(a aVar);
}
