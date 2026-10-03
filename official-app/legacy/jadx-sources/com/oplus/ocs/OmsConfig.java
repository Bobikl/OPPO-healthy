package com.oplus.ocs;

import androidx.annotation.Keep;
import com.oplus.oms.split.full.common.ProcessInfoData;
import com.oplus.oms.split.full.common.SplitInfoData;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class OmsConfig {
    public static final String DEFAULT_SPLIT_INFO_VERSION = "1.0";
    public static final String OMS_ID = "splitApk";
    public static final boolean OMS_MODE = true;
    public static final String VERSION_NAME = "1.0.0";
    public static final HashMap<String, SplitInfoData> sSplitMap;
    public static final String[] DYNAMIC_FEATURES = {"operation"};
    public static final HashMap<String, ProcessInfoData> sProcessMap = new HashMap<>();

    static {
        HashMap<String, SplitInfoData> map = new HashMap<>();
        sSplitMap = map;
        map.put("operation", new SplitInfoData("operation", "null", new ArrayList()));
    }
}
