package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class qxm {
    public static double a(double d) {
        return Double.parseDouble(new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.US)).format(d));
    }

    public static float b(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
        if (latLonPoint != null && latLonPoint2 != null) {
            try {
                double longitude = latLonPoint.getLongitude();
                double d = longitude * 0.01745329251994329d;
                double latitude = latLonPoint.getLatitude() * 0.01745329251994329d;
                double longitude2 = latLonPoint2.getLongitude() * 0.01745329251994329d;
                double latitude2 = latLonPoint2.getLatitude() * 0.01745329251994329d;
                double dSin = Math.sin(d);
                double dSin2 = Math.sin(latitude);
                double dCos = Math.cos(d);
                double dCos2 = Math.cos(latitude);
                double dSin3 = Math.sin(longitude2);
                double dSin4 = Math.sin(latitude2);
                double dCos3 = Math.cos(longitude2);
                double dCos4 = Math.cos(latitude2);
                double[] dArr = {dCos * dCos2, dCos2 * dSin, dSin2};
                double d2 = dCos3 * dCos4;
                double d3 = dCos4 * dSin3;
                double d4 = dArr[0];
                double d5 = (d4 - d2) * (d4 - d2);
                double d6 = dArr[1];
                double d7 = dArr[2];
                return (float) (Math.asin(Math.sqrt((d5 + ((d6 - d3) * (d6 - d3))) + ((d7 - dSin4) * (d7 - dSin4))) / 2.0d) * 1.27420015798544E7d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return 0.0f;
    }

    public static String c(Date date) {
        return date != null ? new SimpleDateFormat(v05.DATE_FORMAT_HOUR).format(date) : "";
    }

    public static String d(List<LatLonPoint> list) {
        return e(list, ";");
    }

    public static String e(List<LatLonPoint> list, String str) {
        if (list == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            LatLonPoint latLonPoint = list.get(i);
            if (latLonPoint != null) {
                double dA = a(latLonPoint.getLongitude());
                double dA2 = a(latLonPoint.getLatitude());
                stringBuffer.append(dA);
                stringBuffer.append(",");
                stringBuffer.append(dA2);
                stringBuffer.append(str);
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }

    public static void f(int i, String str) throws JSONException, AMapException {
        if (i != 0) {
            if (i == 22000) {
                throw new AMapException(AMapException.AMAP_SERVICE_TABLEID_NOT_EXIST, 2, str);
            }
            if (i == 32200) {
                throw new AMapException(AMapException.AMAP_NEARBY_INVALID_USERID, 2, str);
            }
            if (i == 32201) {
                throw new AMapException(AMapException.AMAP_NEARBY_KEY_NOT_BIND, 2, str);
            }
            switch (i) {
                case 10000:
                    return;
                case 10001:
                    throw new AMapException(AMapException.AMAP_INVALID_USER_KEY, 2, str);
                case 10002:
                    throw new AMapException(AMapException.AMAP_SERVICE_NOT_AVAILBALE, 2, str);
                case 10003:
                    throw new AMapException(AMapException.AMAP_DAILY_QUERY_OVER_LIMIT, 2, str);
                case 10004:
                    throw new AMapException(AMapException.AMAP_ACCESS_TOO_FREQUENT, 2, str);
                case 10005:
                    throw new AMapException(AMapException.AMAP_INVALID_USER_IP, 2, str);
                case 10006:
                    throw new AMapException(AMapException.AMAP_INVALID_USER_DOMAIN, 2, str);
                case 10007:
                    throw new AMapException("用户签名未通过", 2, str);
                case 10008:
                    throw new AMapException(AMapException.AMAP_INVALID_USER_SCODE, 2, str);
                case 10009:
                    throw new AMapException(AMapException.AMAP_USERKEY_PLAT_NOMATCH, 2, str);
                case 10010:
                    throw new AMapException(AMapException.AMAP_IP_QUERY_OVER_LIMIT, 2, str);
                case 10011:
                    throw new AMapException(AMapException.AMAP_NOT_SUPPORT_HTTPS, 2, str);
                case 10012:
                    throw new AMapException(AMapException.AMAP_INSUFFICIENT_PRIVILEGES, 2, str);
                case 10013:
                    throw new AMapException(AMapException.AMAP_USER_KEY_RECYCLED, 2, str);
                default:
                    switch (i) {
                        case 20000:
                            throw new AMapException(AMapException.AMAP_SERVICE_INVALID_PARAMS, 2, str);
                        case 20001:
                            throw new AMapException(AMapException.AMAP_SERVICE_MISSING_REQUIRED_PARAMS, 2, str);
                        case 20002:
                            throw new AMapException(AMapException.AMAP_SERVICE_ILLEGAL_REQUEST, 2, str);
                        case 20003:
                            throw new AMapException(AMapException.AMAP_SERVICE_UNKNOWN_ERROR, 2, str);
                        default:
                            switch (i) {
                                case 20800:
                                    throw new AMapException(AMapException.AMAP_ROUTE_OUT_OF_SERVICE, 2, str);
                                case com.coloros.sceneservice.m.b.Tc /* 20801 */:
                                    throw new AMapException(AMapException.AMAP_ROUTE_NO_ROADS_NEARBY, 2, str);
                                case 20802:
                                    throw new AMapException(AMapException.AMAP_ROUTE_FAIL, 2, str);
                                case 20803:
                                    throw new AMapException(AMapException.AMAP_OVER_DIRECTION_RANGE, 2, str);
                                default:
                                    switch (i) {
                                        case 30000:
                                            throw new AMapException(AMapException.AMAP_ENGINE_RESPONSE_ERROR, 2, str);
                                        case 30001:
                                            throw new AMapException(AMapException.AMAP_ENGINE_RESPONSE_DATA_ERROR, 2, str);
                                        case 30002:
                                            throw new AMapException(AMapException.AMAP_ENGINE_CONNECT_TIMEOUT, 2, str);
                                        case 30003:
                                            throw new AMapException(AMapException.AMAP_ENGINE_RETURN_TIMEOUT, 2, str);
                                        default:
                                            switch (i) {
                                                case 32000:
                                                    throw new AMapException(AMapException.AMAP_ENGINE_TABLEID_NOT_EXIST, 2, str);
                                                case 32001:
                                                    throw new AMapException(AMapException.AMAP_ID_NOT_EXIST, 2, str);
                                                case 32002:
                                                    throw new AMapException(AMapException.AMAP_SERVICE_MAINTENANCE, 2, str);
                                                default:
                                                    if (!TextUtils.isEmpty(str) && i > 0) {
                                                        throw new AMapException(str, 2, str, i);
                                                    }
                                                    throw new AMapException(str, 2, str);
                                            }
                                    }
                            }
                    }
            }
        }
    }

    public static void g(Throwable th, String str, String str2) {
        try {
            c2n c2nVarT = c2n.t();
            if (c2nVarT != null) {
                c2nVarT.p(th, str, str2);
            }
            th.printStackTrace();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static boolean h(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static void i(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errcode")) {
                f(jSONObject.getInt("errcode"), jSONObject.getString("errmsg"));
                return;
            }
            if (jSONObject.has("status")) {
                String string = jSONObject.getString("status");
                if (string.equals("1")) {
                    return;
                }
                if (string.equals("0") && !jSONObject.has("infocode")) {
                    throw new AMapException(AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
                }
                int i = jSONObject.getInt("infocode");
                if (string.equals("0")) {
                    f(i, jSONObject.getString(UTraceSQLiteHelperKt.COL_INFO));
                }
            }
        } catch (JSONException e2) {
            g(e2, "CoreUtil", "paseAuthFailurJson");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    public static Date j(String str) {
        if (str == null || str.trim().equals("")) {
            return null;
        }
        try {
            return new SimpleDateFormat(v05.DATE_FORMAT_HOUR).parse(str);
        } catch (ParseException e2) {
            g(e2, "CoreUtil", "parseTime");
            return null;
        }
    }
}
