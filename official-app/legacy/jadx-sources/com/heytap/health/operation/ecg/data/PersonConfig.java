package com.heytap.health.operation.ecg.data;

import android.util.Pair;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.ECGRecord;
import com.oplus.aiunit.vision.e93;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.z96;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class PersonConfig {
    public static Map<String, Integer> sDiseasesHisMap = new HashMap();
    public static Map<String, Integer> sSymptomMap = new HashMap();
    public List<StateBean> diseasehisConfig;
    public List<StateBean> symptomConfig;

    @Keep
    public static class StateBean {
        public int id;
        public String name;
    }

    public static Pair perStateNames2Param(String[] strArr, ECGRecord eCGRecord) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        try {
            for (String str : strArr) {
                Integer num = sDiseasesHisMap.get(str);
                if (num == null) {
                    Integer num2 = sSymptomMap.get(str);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", str);
                    jSONObject.put("id", num2);
                    jSONArray2.put(jSONObject);
                    arrayList2.add(num2);
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("name", str);
                    jSONObject2.put("id", num);
                    arrayList.add(num);
                    jSONArray.put(jSONObject2);
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("diseasehisConfig", jSONArray);
            jSONObject3.put("symptomConfig", jSONArray2);
            eCGRecord.setPersonState(jSONObject3.toString());
        } catch (JSONException e2) {
            z96.d(e2);
        }
        return Pair.create(arrayList.toArray(), arrayList2.toArray());
    }

    public static Pair<String[], Pair> record2ShowNameParam(String str) {
        PersonConfig personConfig = (PersonConfig) sc8.a(str, PersonConfig.class);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (personConfig != null) {
            for (StateBean stateBean : personConfig.diseasehisConfig) {
                arrayList2.add(Integer.valueOf(stateBean.id));
                arrayList.add(stateBean.name);
            }
            for (StateBean stateBean2 : personConfig.symptomConfig) {
                arrayList3.add(Integer.valueOf(stateBean2.id));
                arrayList.add(stateBean2.name);
            }
        }
        return Pair.create((String[]) arrayList.toArray(new String[arrayList.size()]), Pair.create(arrayList2.toArray(), arrayList3.toArray()));
    }

    public String[] getDiseasehisConfig() {
        if (!e93.b(this.diseasehisConfig)) {
            return new String[0];
        }
        String[] strArr = new String[this.diseasehisConfig.size()];
        for (int i = 0; i < this.diseasehisConfig.size(); i++) {
            StateBean stateBean = this.diseasehisConfig.get(i);
            String str = stateBean.name;
            strArr[i] = str;
            sDiseasesHisMap.put(str, Integer.valueOf(stateBean.id));
        }
        return strArr;
    }

    public String[] getSymptomConfig() {
        if (!e93.b(this.symptomConfig)) {
            return new String[0];
        }
        String[] strArr = new String[this.symptomConfig.size()];
        for (int i = 0; i < this.symptomConfig.size(); i++) {
            StateBean stateBean = this.symptomConfig.get(i);
            String str = stateBean.name;
            strArr[i] = str;
            sSymptomMap.put(str, Integer.valueOf(stateBean.id));
        }
        return strArr;
    }
}
