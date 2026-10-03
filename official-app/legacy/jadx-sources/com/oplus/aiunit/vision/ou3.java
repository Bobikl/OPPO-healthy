package com.oplus.aiunit.vision;

import com.oplus.drs.core.config.entity.AppEventInfo;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import com.oplus.drs.core.net.entity.UploadStateAware;
import com.oppo.obus.common.configmetadata.core.entity.AreaConfig;
import com.oppo.obus.common.configmetadata.core.entity.common.MinCommonConfig;
import com.oppo.obus.common.configmetadata.core.entity.host.AppHost;
import com.oppo.obus.common.configmetadata.core.entity.host.MinHostConfig;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface ou3 {
    int a();

    void b(String str, String str2, String str3);

    List<zs6> c(AreaConfig areaConfig);

    DebugModeEntity d(String str);

    MinHostConfig e(String str);

    void f();

    void g();

    List<zs6> h(String str);

    List<String> i();

    MinCommonConfig j();

    void k(List<String> list);

    void l();

    UploadStateAware m(List<String> list);

    AppHost n(String str, String str2);

    zb0 o(String str);

    zs6 p(String str, String str2, String str3);

    AppEventInfo q(String str);

    int r(String str);

    AreaConfig s(String str);
}
