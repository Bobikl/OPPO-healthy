package com.oplus.aiunit.vision;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.heytap.databaseengine.callback.IDataReadResultListener;
import com.heytap.databaseengine.model.HealthOriginData;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.option.DataInsertOption;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class at4 {
    public static final int DIVIDE_INSERT_HEALTH_ORIGIN_MAX = 2;
    public static final int DIVIDE_INSERT_MAX = 300;
    public static final int DIVIDE_READ_BIG_DATA_RETURN_MAX = 30;
    public static final int DIVIDE_READ_HR_NEW_CARD_RETURN_MAX = 2;
    public static final int DIVIDE_READ_RETURN_MAX = 300;
    public static final int DIVIDE_READ_RUNNING = 0;
    public static final int DIVIDE_TRACK_LENGTH_INSERT = 262144;
    public static final int DIVIDE_TRACK_LENGTH_READ = 262144;
    public static final int READ_ALL_OVER = 2;
    public static final int READ_PART_OVER = 1;
    public static final int READ_POINT_PART = 3;
    public static final int READ_SET_PART = 4;
    public static boolean a = false;

    public static void a(List<DataInsertOption> list, SportHealthData sportHealthData, int i) {
        OneTimeSport oneTimeSport = (OneTimeSport) sportHealthData;
        me8.e("DataDivideUtil", String.format("divideInsertTrack addInsertData is dividing:%s, sportMode:%s, startTime:%s, endTime:%s", Boolean.valueOf(oneTimeSport.getBoolean("is_dividing")), Integer.valueOf(oneTimeSport.getSportMode()), Long.valueOf(sportHealthData.getStartTimestamp()), Long.valueOf(sportHealthData.getEndTimestamp())));
        ArrayList arrayList = new ArrayList();
        arrayList.add(((OneTimeSport) sportHealthData).copyData());
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDatas(arrayList);
        dataInsertOption.setDataTable(i);
        list.add(dataInsertOption);
    }

    public static void b(List<DataInsertOption> list, List<SportHealthData> list2, int i) {
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDatas(list2);
        dataInsertOption.setDataTable(i);
        list.add(dataInsertOption);
    }

    public static void c(SparseArray<List<SportHealthData>> sparseArray, List<SportHealthData> list, int i) {
        sparseArray.append(i, new ArrayList(list));
        list.clear();
    }

    public static void d(int i, List<?> list, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        if (iDataReadResultListener == null) {
            me8.i("DataDivideUtil", "divideBigDataList listener is  null, table is " + i);
            return;
        }
        if (hz.b(list)) {
            me8.i("DataDivideUtil", "divideList list is null or empty, table is " + i);
            iDataReadResultListener.onResult(null, i, 1);
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 30;
            if (i3 >= size) {
                if (a) {
                    iDataReadResultListener.onResult(cu4.x(list.subList(i2, size), i), i, 1);
                } else {
                    iDataReadResultListener.onResult(list.subList(i2, size), i, 1);
                }
            } else if (a) {
                iDataReadResultListener.onResult(cu4.x(list.subList(i2, i3), i), i, 0);
            } else {
                iDataReadResultListener.onResult(list.subList(i2, i3), i, 0);
            }
            i2 = i3;
        }
    }

    public static void e(int i, List<?> list, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        if (iDataReadResultListener == null) {
            me8.i("DataDivideUtil", "divideHRNewCardList listener is  null, table is " + i);
            return;
        }
        if (hz.b(list)) {
            me8.i("DataDivideUtil", "divideList list is null or empty, table is " + i);
            iDataReadResultListener.onResult(null, i, 1);
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 2;
            if (i3 >= size) {
                iDataReadResultListener.onResult(list.subList(i2, size), i, 1);
            } else {
                iDataReadResultListener.onResult(list.subList(i2, i3), i, 0);
            }
            i2 = i3;
        }
    }

    public static void f(int i, List<HealthOriginData> list, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        if (iDataReadResultListener == null) {
            me8.i("DataDivideUtil", "divideHealthOriginList listener is  null, table is " + i);
            return;
        }
        if (hz.b(list)) {
            me8.i("DataDivideUtil", "divideList list is null or empty, table is " + i);
            iDataReadResultListener.onResult(null, i, 1);
            return;
        }
        for (HealthOriginData healthOriginData : list) {
            String data = healthOriginData.getData();
            if (data != null && data.length() > 0) {
                try {
                    healthOriginData.setData(w7m.c(data));
                } catch (Exception e2) {
                    me8.i("DataDivideUtil", "divideHealthOriginList uncompress e = " + e2.getMessage() + ", type = " + healthOriginData.getDataType());
                }
            }
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 2;
            if (i3 >= size) {
                iDataReadResultListener.onResult(list.subList(i2, size), i, 1);
            } else {
                iDataReadResultListener.onResult(list.subList(i2, i3), i, 0);
            }
            i2 = i3;
        }
    }

    public static void g(List<SportHealthData> list, List<DataInsertOption> list2, int i) {
        int i2;
        Iterator<SportHealthData> it = list.iterator();
        String strA = "";
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            SportHealthData next = it.next();
            try {
                me8.a("DataDivideUtil", String.format("divideInsertHealthOriginData health original data:%s", ((HealthOriginData) next).getData()));
                me8.e("DataDivideUtil", String.format("divideInsertHealthOriginData health original length:%s", Integer.valueOf(((HealthOriginData) next).getData().length())));
                strA = w7m.a(((HealthOriginData) next).getData());
                ((HealthOriginData) next).setData(strA);
            } catch (IOException e2) {
                me8.b("DataDivideUtil", "divideInsertHealthOriginData e = " + e2.getMessage());
            }
            int length = strA.length();
            me8.a("DataDivideUtil", String.format("divideInsertHealthOriginData compress data:%s", strA));
            me8.e("DataDivideUtil", String.format("divideInsertHealthOriginData compress length:%s", Integer.valueOf(length)));
        }
        int size = list.size();
        while (i2 < size) {
            int i3 = i2 + 2;
            if (i3 >= size) {
                b(list2, list.subList(i2, size), i);
            } else {
                b(list2, list.subList(i2, i3), i);
            }
            i2 = i3;
        }
    }

    public static List<DataInsertOption> h(DataInsertOption dataInsertOption) {
        List<SportHealthData> datas = dataInsertOption.getDatas();
        ArrayList arrayList = new ArrayList();
        int dataTable = dataInsertOption.getDataTable();
        if (hz.b(datas)) {
            arrayList.add(dataInsertOption);
            return arrayList;
        }
        SportHealthData sportHealthData = datas.get(0);
        if (sportHealthData instanceof OneTimeSport) {
            if (hz.a(((OneTimeSport) sportHealthData).getData())) {
                i(datas, arrayList, dataTable);
            } else {
                j(datas, arrayList, dataTable);
            }
        } else if (dataTable == 1016) {
            g(datas, arrayList, dataTable);
        } else {
            i(datas, arrayList, dataTable);
        }
        return arrayList;
    }

    public static void i(List<SportHealthData> list, List<DataInsertOption> list2, int i) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 300;
            if (i3 >= size) {
                b(list2, list.subList(i2, size), i);
            } else {
                b(list2, list.subList(i2, i3), i);
            }
            i2 = i3;
        }
    }

    public static void j(List<SportHealthData> list, List<DataInsertOption> list2, int i) {
        String strA = "";
        for (SportHealthData sportHealthData : list) {
            OneTimeSport oneTimeSport = (OneTimeSport) sportHealthData;
            if (TextUtils.isEmpty(oneTimeSport.getData())) {
                strA = "";
            } else if (oneTimeSport.getData().contains(":")) {
                try {
                    me8.a("DataDivideUtil", String.format("divideInsertTrack track original data:%s", ((OneTimeSport) sportHealthData).getData()));
                    me8.e("DataDivideUtil", String.format("divideInsertTrack track original length:%s", Integer.valueOf(((OneTimeSport) sportHealthData).getData().length())));
                    strA = w7m.a(((OneTimeSport) sportHealthData).getData());
                } catch (IOException e2) {
                    me8.b("DataDivideUtil", "divideInsertTrack e = " + e2.getMessage());
                }
            } else {
                strA = oneTimeSport.getData();
            }
            int length = strA.length();
            me8.a("DataDivideUtil", String.format("divideInsertTrack compress data:%s", strA));
            me8.e("DataDivideUtil", String.format("divideInsertTrack compress length:%s", Integer.valueOf(length)));
            oneTimeSport.putBoolean("track_is_zip", true);
            if (length <= 0) {
                a(list2, sportHealthData, i);
            } else {
                int i2 = 0;
                while (i2 < length) {
                    int i3 = 262144 + i2;
                    if (i3 >= length) {
                        oneTimeSport.setData(strA.substring(i2, length));
                        oneTimeSport.putBoolean("is_dividing", false);
                    } else {
                        oneTimeSport.setData(strA.substring(i2, i3));
                        oneTimeSport.putBoolean("is_dividing", true);
                    }
                    a(list2, sportHealthData, i);
                    me8.e("DataDivideUtil", String.format("divideInsertTrack index:%s", Integer.valueOf(i3)));
                    i2 = i3;
                }
            }
        }
    }

    public static void k(int i, List<?> list, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        if (iDataReadResultListener == null) {
            me8.i("DataDivideUtil", "divideList listener is  null, table is " + i);
            return;
        }
        if (hz.b(list)) {
            me8.i("DataDivideUtil", "divideList list is null or empty, table is " + i);
            iDataReadResultListener.onResult(null, i, 1);
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 300;
            if (i3 >= size) {
                if (a) {
                    iDataReadResultListener.onResult(cu4.x(list.subList(i2, size), i), i, 1);
                } else {
                    iDataReadResultListener.onResult(list.subList(i2, size), i, 1);
                }
            } else if (a) {
                iDataReadResultListener.onResult(cu4.x(list.subList(i2, i3), i), i, 0);
            } else {
                iDataReadResultListener.onResult(list.subList(i2, i3), i, 0);
            }
            i2 = i3;
        }
    }

    public static void l(int i, List<?> list, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        if (iDataReadResultListener == null) {
            me8.i("DataDivideUtil", "divideTrackData listener is  null, table is " + i);
            return;
        }
        if (hz.b(list)) {
            me8.i("DataDivideUtil", "divideTrackData list is null or empty");
            iDataReadResultListener.onResult(null, i, 1);
            return;
        }
        OneTimeSport oneTimeSport = (OneTimeSport) list.get(0);
        if (oneTimeSport == null) {
            me8.i("DataDivideUtil", "divideTrackData data is null");
            return;
        }
        String data = oneTimeSport.getData();
        me8.a("DataDivideUtil", String.format("divideInsertTrack compress data:%s", data));
        if (hz.a(data)) {
            k(i, list, iDataReadResultListener);
            return;
        }
        int length = data.length();
        me8.e("DataDivideUtil", String.format("divideInsertTrack compress length:%s", Integer.valueOf(data.length())));
        if (length <= 0) {
            iDataReadResultListener.onResult(null, i, 1);
            return;
        }
        int i2 = 0;
        while (i2 < length) {
            int i3 = 262144 + i2;
            if (i3 >= length) {
                oneTimeSport.setData(data.substring(i2, length));
                ArrayList arrayList = new ArrayList();
                arrayList.add(oneTimeSport);
                iDataReadResultListener.onResult(arrayList, i, 1);
            } else {
                oneTimeSport.setData(data.substring(i2, i3));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(oneTimeSport);
                iDataReadResultListener.onResult(arrayList2, i, 0);
            }
            i2 = i3;
        }
    }

    public static boolean m(List<SportHealthData> list, int i, int i2, List<SportHealthData> list2, SparseArray<List<SportHealthData>> sparseArray) {
        if (i != 1004) {
            return n(list, i, i2, list2, sparseArray);
        }
        o(list, i, i2, list2, sparseArray);
        return false;
    }

    public static boolean n(List<SportHealthData> list, int i, int i2, List<SportHealthData> list2, SparseArray<List<SportHealthData>> sparseArray) {
        if (!hz.b(list)) {
            list2.addAll(list);
        }
        if (i2 != 1) {
            return i2 == 2;
        }
        if (hz.b(list2)) {
            me8.i("DataDivideUtil", "packageDivideData() partData is null");
            return false;
        }
        c(sparseArray, list2, i);
        return false;
    }

    public static void o(List<SportHealthData> list, int i, int i2, List<SportHealthData> list2, SparseArray<List<SportHealthData>> sparseArray) {
        OneTimeSport oneTimeSport;
        String data;
        if (hz.b(list2)) {
            oneTimeSport = null;
            data = null;
        } else {
            oneTimeSport = (OneTimeSport) list2.get(0);
            data = oneTimeSport.getData();
        }
        if (!hz.b(list)) {
            if (oneTimeSport == null) {
                oneTimeSport = (OneTimeSport) list.get(0);
                list2.add(oneTimeSport);
            } else {
                data = data + ((OneTimeSport) list.get(0)).getData();
                oneTimeSport.setData(data);
            }
        }
        if (oneTimeSport == null) {
            me8.i("DataDivideUtil", "packageTrackDivide data is null");
            return;
        }
        if (i2 != 1 || hz.b(list2)) {
            return;
        }
        if (oneTimeSport.getData() == null || oneTimeSport.getData().contains(".pbce")) {
            data = oneTimeSport.getData();
        } else {
            try {
                data = w7m.c(oneTimeSport.getData());
            } catch (Exception unused) {
                me8.b("DataDivideUtil", "packageDivideTrackData zip exception, track_data = " + data);
            }
        }
        oneTimeSport.setData(data);
        c(sparseArray, list2, i);
    }

    public static void p(boolean z) {
        a = z;
    }
}
