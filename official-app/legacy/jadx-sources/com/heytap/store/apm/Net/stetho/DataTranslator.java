package com.heytap.store.apm.Net.stetho;

import android.net.Uri;
import android.text.TextUtils;
import com.heytap.store.apm.IDataPoolHandleImpl;
import com.heytap.store.apm.Net.NetworkManager;
import com.heytap.store.apm.Net.data.NetworkFeedBean;
import com.heytap.store.apm.Net.data.NetworkRecord;
import com.heytap.store.apm.Net.utils.NetLogUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes19.dex */
public class DataTranslator {
    private static final String GZIP_ENCODING = "gzip";
    private static final String TAG = "DataTranslator";
    private Map<String, Long> mStartTimeMap = new HashMap();

    private void createRecord(String str, NetworkEventReporter.InspectorRequest inspectorRequest) {
        NetworkRecord networkRecord = new NetworkRecord();
        networkRecord.setRequestId(str);
        networkRecord.setMethod(inspectorRequest.method());
        networkRecord.setRequestLength(readBodyLength(inspectorRequest));
        NetworkManager.get().addRecord(str, networkRecord);
    }

    private boolean isSupportType(String str) {
        return str.contains("text") || str.contains("json");
    }

    private ByteArrayOutputStream parseAndSaveBody(InputStream inputStream, NetworkFeedBean networkFeedBean, String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i <= -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (IOException e2) {
                NetLogUtils.e("DataTranslator----parseAndSaveBody---" + e2);
            }
        }
        byteArrayOutputStream.flush();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        BufferedReader bufferedReader = GZIP_ENCODING.equals(str) ? new BufferedReader(new InputStreamReader(new GZIPInputStream(byteArrayInputStream))) : new BufferedReader(new InputStreamReader(byteArrayInputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line + '\n');
        }
        String string = sb.toString();
        networkFeedBean.setBody(string);
        networkFeedBean.setSize(string.getBytes().length);
        NetworkManager.get().getRecord(networkFeedBean.getRequestId()).setResponseLength(string.getBytes().length);
        return byteArrayOutputStream;
    }

    private long readBodyLength(NetworkEventReporter.InspectorRequest inspectorRequest) {
        try {
            byte[] bArrBody = inspectorRequest.body();
            if (bArrBody != null) {
                return bArrBody.length;
            }
            return 0L;
        } catch (IOException | OutOfMemoryError unused) {
            return 0L;
        }
    }

    public void saveInspectorRequest(NetworkEventReporter.InspectorRequest inspectorRequest) throws Throwable {
        String strId = inspectorRequest.id();
        this.mStartTimeMap.put(inspectorRequest.id(), Long.valueOf(System.currentTimeMillis()));
        NetLogUtils.i("DataTranslator-----saveInspectorRequest----" + inspectorRequest);
        NetworkFeedBean networkFeedModel = IDataPoolHandleImpl.getInstance().getNetworkFeedModel(strId);
        String strUrl = inspectorRequest.url();
        if (!TextUtils.isEmpty(strUrl)) {
            networkFeedModel.setHost(Uri.parse(strUrl).getHost());
            networkFeedModel.setUrl(strUrl);
        }
        networkFeedModel.setMethod(inspectorRequest.method());
        HashMap map = new HashMap();
        int iHeaderCount = inspectorRequest.headerCount();
        for (int i = 0; i < iHeaderCount; i++) {
            map.put(inspectorRequest.headerName(i), inspectorRequest.headerValue(i));
        }
        networkFeedModel.setRequestHeadersMap(map);
        createRecord(strId, inspectorRequest);
    }

    public void saveInspectorResponse(NetworkEventReporter.InspectorResponse inspectorResponse) throws Throwable {
        long jCurrentTimeMillis;
        NetLogUtils.i("DataTranslator-----saveInspectorResponse----" + inspectorResponse);
        String strRequestId = inspectorResponse.requestId();
        Map<String, Long> map = this.mStartTimeMap;
        if (map != null) {
            if (map.containsKey(strRequestId)) {
                jCurrentTimeMillis = System.currentTimeMillis() - this.mStartTimeMap.get(strRequestId).longValue();
                NetLogUtils.d(TAG, "cost time = " + jCurrentTimeMillis + "ms");
            } else {
                jCurrentTimeMillis = -1;
            }
            NetworkFeedBean networkFeedModel = IDataPoolHandleImpl.getInstance().getNetworkFeedModel(strRequestId);
            networkFeedModel.setCostTime(jCurrentTimeMillis);
            networkFeedModel.setStatus(inspectorResponse.statusCode());
            HashMap map2 = new HashMap();
            int iHeaderCount = inspectorResponse.headerCount();
            for (int i = 0; i < iHeaderCount; i++) {
                map2.put(inspectorResponse.headerName(i), inspectorResponse.headerValue(i));
            }
            networkFeedModel.setResponseHeadersMap(map2);
        }
    }

    public InputStream saveInterpretResponseStream(String str, String str2, String str3, InputStream inputStream) throws Throwable {
        NetworkFeedBean networkFeedModel = IDataPoolHandleImpl.getInstance().getNetworkFeedModel(str);
        networkFeedModel.setContentType(str2);
        if (!isSupportType(str2)) {
            networkFeedModel.setBody(str2 + " is not supported.");
            networkFeedModel.setSize(0);
            return inputStream;
        }
        ByteArrayOutputStream andSaveBody = parseAndSaveBody(inputStream, networkFeedModel, str3);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(andSaveBody.toByteArray());
        try {
            andSaveBody.close();
        } catch (IOException e2) {
            NetLogUtils.e("DataTranslator----saveInterpretResponseStream---" + e2);
        }
        return byteArrayInputStream;
    }
}
