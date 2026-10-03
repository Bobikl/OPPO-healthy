package com.oplus.aiunit.vision;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class mgm {
    public static DataReportRequest a(kqm kqmVar) {
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (kqmVar == null) {
            return null;
        }
        dataReportRequest.os = kqmVar.a;
        dataReportRequest.rpcVersion = kqmVar.f13386j;
        dataReportRequest.bizType = "1";
        HashMap map = new HashMap();
        dataReportRequest.bizData = map;
        map.put("apdid", kqmVar.b);
        dataReportRequest.bizData.put("apdidToken", kqmVar.f13384c);
        dataReportRequest.bizData.put("umidToken", kqmVar.d);
        dataReportRequest.bizData.put("dynamicKey", kqmVar.f13385e);
        dataReportRequest.deviceData = kqmVar.f;
        return dataReportRequest;
    }

    public static qkm b(DataReportResult dataReportResult) {
        qkm qkmVar = new qkm();
        if (dataReportResult == null) {
            return null;
        }
        qkmVar.a = dataReportResult.success;
        qkmVar.b = dataReportResult.resultCode;
        Map<String, String> map = dataReportResult.resultData;
        if (map != null) {
            qkmVar.f15838c = map.get("apdid");
            qkmVar.d = map.get("apdidToken");
            qkmVar.g = map.get("dynamicKey");
            qkmVar.h = map.get("timeInterval");
            qkmVar.i = map.get("webrtcUrl");
            qkmVar.f15840j = "";
            String str = map.get("drmSwitch");
            if (vam.f(str)) {
                if (str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.charAt(0));
                    qkmVar.f15839e = sb.toString();
                }
                if (str.length() >= 3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.charAt(2));
                    qkmVar.f = sb2.toString();
                }
            }
            if (map.containsKey("apse_degrade")) {
                qkmVar.k = map.get("apse_degrade");
            }
        }
        return qkmVar;
    }
}
