package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.exception.NoRouteFoundException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.enums.TypeKind;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IInterceptorGroup;
import com.alibaba.android.arouter.facade.template.ILogger;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes12.dex */
public class t8b {
    public static Context a;
    public static ThreadPoolExecutor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f16922c;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RouteType.values().length];
            a = iArr;
            try {
                iArr[RouteType.PROVIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RouteType.FRAGMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static synchronized void a(String str, IRouteGroup iRouteGroup) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        if (y7l.a.containsKey(str)) {
            y7l.a.get(str).getConstructor(new Class[0]).newInstance(new Object[0]).loadInto(y7l.b);
            y7l.a.remove(str);
        }
        if (iRouteGroup != null) {
            iRouteGroup.loadInto(y7l.b);
        }
    }

    public static Postcard b(String str) {
        RouteMeta routeMeta = y7l.d.get(str);
        if (routeMeta == null) {
            return null;
        }
        return new Postcard(routeMeta.getPath(), routeMeta.getGroup());
    }

    public static synchronized void c(Postcard postcard) {
        if (postcard == null) {
            throw new NoRouteFoundException("ARouter::No postcard!");
        }
        RouteMeta routeMeta = y7l.b.get(postcard.getPath());
        if (routeMeta != null) {
            postcard.setDestination(routeMeta.getDestination());
            postcard.setType(routeMeta.getType());
            postcard.setPriority(routeMeta.getPriority());
            postcard.setExtra(routeMeta.getExtra());
            Uri uri = postcard.getUri();
            if (uri != null) {
                Map<String, String> mapC = mtj.c(uri);
                Map<String, Integer> paramsType = routeMeta.getParamsType();
                if (qfb.b(paramsType)) {
                    for (Map.Entry<String, Integer> entry : paramsType.entrySet()) {
                        k(postcard, entry.getValue(), entry.getKey(), mapC.get(entry.getKey()));
                    }
                    postcard.getExtras().putStringArray("wmHzgD4lOj5o4241", (String[]) paramsType.keySet().toArray(new String[0]));
                }
                postcard.withString("NTeRQWvye18AkPd6G", uri.toString());
            }
            int i = a.a[routeMeta.getType().ordinal()];
            if (i == 1) {
                Class<?> destination = routeMeta.getDestination();
                IProvider iProvider = y7l.f18917c.get(destination);
                if (iProvider == null) {
                    try {
                        iProvider = (IProvider) destination.getConstructor(new Class[0]).newInstance(new Object[0]);
                        iProvider.init(a);
                        y7l.f18917c.put(destination, iProvider);
                    } catch (Exception e2) {
                        x0.logger.error(ILogger.defaultTag, "Init provider failed!", e2);
                        throw new HandlerException("Init provider failed!");
                    }
                }
                postcard.setProvider(iProvider);
                postcard.greenChannel();
            } else if (i == 2) {
                postcard.greenChannel();
            }
        } else {
            if (!y7l.a.containsKey(postcard.getGroup())) {
                throw new NoRouteFoundException("ARouter::There is no route match the path [" + postcard.getPath() + "], in group [" + postcard.getGroup() + "]");
            }
            try {
                if (x0.c()) {
                    x0.logger.debug(ILogger.defaultTag, String.format(Locale.getDefault(), "The group [%s] starts loading, trigger by [%s]", postcard.getGroup(), postcard.getPath()));
                }
                a(postcard.getGroup(), null);
                if (x0.c()) {
                    x0.logger.debug(ILogger.defaultTag, String.format(Locale.getDefault(), "The group [%s] has already been loaded, trigger by [%s]", postcard.getGroup(), postcard.getPath()));
                }
                c(postcard);
            } catch (Exception e3) {
                throw new HandlerException("ARouter::Fatal exception when loading group meta. [" + e3.getMessage() + "]");
            }
        }
    }

    public static synchronized void d(Context context, ThreadPoolExecutor threadPoolExecutor) throws HandlerException {
        Set<String> setA;
        a = context;
        b = threadPoolExecutor;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            e();
            if (f16922c) {
                x0.logger.info(ILogger.defaultTag, "Load router map by arouter-auto-register plugin.");
            } else {
                if (x0.c() || j3e.b(context)) {
                    x0.logger.info(ILogger.defaultTag, "Run with debug mode or new install, rebuild router map.");
                    setA = qc3.a(a, "com.alibaba.android.arouter.routes");
                    if (!setA.isEmpty()) {
                        context.getSharedPreferences("SP_AROUTER_CACHE", 0).edit().putStringSet("ROUTER_MAP", setA).apply();
                    }
                    j3e.c(context);
                } else {
                    x0.logger.info(ILogger.defaultTag, "Load router map from cache.");
                    setA = new HashSet<>(context.getSharedPreferences("SP_AROUTER_CACHE", 0).getStringSet("ROUTER_MAP", new HashSet()));
                }
                x0.logger.info(ILogger.defaultTag, "Find router map finished, map size = " + setA.size() + ", cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms.");
                jCurrentTimeMillis = System.currentTimeMillis();
                for (String str : setA) {
                    if (str.startsWith("com.alibaba.android.arouter.routes.ARouter$$Root")) {
                        ((IRouteRoot) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0])).loadInto(y7l.a);
                    } else if (str.startsWith("com.alibaba.android.arouter.routes.ARouter$$Interceptors")) {
                        ((IInterceptorGroup) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0])).loadInto(y7l.f18918e);
                    } else if (str.startsWith("com.alibaba.android.arouter.routes.ARouter$$Providers")) {
                        ((IProviderGroup) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0])).loadInto(y7l.d);
                    }
                }
            }
            x0.logger.info(ILogger.defaultTag, "Load root element finished, cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms.");
            if (y7l.a.size() == 0) {
                x0.logger.error(ILogger.defaultTag, "No mapping files were found, check your configuration please!");
            }
            if (x0.c()) {
                x0.logger.debug(ILogger.defaultTag, String.format(Locale.getDefault(), "LogisticsCenter has already been loaded, GroupIndex[%d], InterceptorIndex[%d], ProviderIndex[%d]", Integer.valueOf(y7l.a.size()), Integer.valueOf(y7l.f18918e.size()), Integer.valueOf(y7l.d.size())));
            }
        } catch (Exception e2) {
            throw new HandlerException("ARouter::ARouter init logistics center exception! [" + e2.getMessage() + "]");
        }
    }

    public static void e() {
        f16922c = false;
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$watchface_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$family");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$device_app_store_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$music_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$cervical_vertebra");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$step");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$relax");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$blood_glucose");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$esim_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$device_settings_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$sleep");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$ecg");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$bus");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$settings_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$menstrual_period_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$stress");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$voiceassistant_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$home_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$account_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$bus");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$linkage_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$operations");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$device_data_sync_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$sleep_heartrate");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$lib_track");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$interconnection_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$heartrate");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$commonsync_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$contactnetnumber_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$entrance");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$health_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$commonsync_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$esim_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$device_manager_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$daily");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$watchface_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$music_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$hrv");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$health_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$recommend");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$app");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$linkage_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$walletmain");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$device_third_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$device_app_store_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$home_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$thirdservice_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$deviceota_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$sport_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$device_third_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$blood_oxygen");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$health_seedlingcard");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$bodyfat");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$sport_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Interceptors$$watchface_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$hearing");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$blood_pressure");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$health_archives");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$voiceassistant_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$partner");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$contactnetnumber_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$wrist_temperature");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$telecom_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$device_notification_impl2");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$calendar_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$calendar_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$heybreeno_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$contactsync_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$sunshine");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$wifi_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$emergency_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$cardiovascular");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$operation_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$deviceota_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$community_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$blood_pressure");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$device_pair_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$account_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$device_settings_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$fitness_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$interconnection_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$settings_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$walletmain");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$recommend");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$emergency_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$step");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$contactsync_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$device_notification_impl2");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$entrance");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$arouterapi");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$bandface_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$hrv");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$operation_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$health_seedlingcard");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$telecom_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$heybreeno_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$device_manager_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$arouterapi");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$app");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$thirdparty_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$recordfilemanager_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$operations");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$cardiovascular");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$hearing");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$community_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$wifi_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$fitness_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$family");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$thirdparty_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$cervical_vertebra");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$recordfilemanager_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$sleep");
        g("com.alibaba.android.arouter.routes.ARouter$$Interceptors$$lib_base");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$partner");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$bandface_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$menstrual_period_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$device_pair_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Root$$bodyfat");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$lib_track");
        g("com.alibaba.android.arouter.routes.ARouter$$Providers$$device_data_sync_impl");
        g("com.alibaba.android.arouter.routes.ARouter$$Interceptors$$bandface_impl");
    }

    public static void f() {
        if (f16922c) {
            return;
        }
        f16922c = true;
    }

    public static void g(String str) {
        if (mtj.b(str)) {
            return;
        }
        try {
            Object objNewInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IRouteRoot) {
                j((IRouteRoot) objNewInstance);
            } else if (objNewInstance instanceof IProviderGroup) {
                i((IProviderGroup) objNewInstance);
            } else if (objNewInstance instanceof IInterceptorGroup) {
                h((IInterceptorGroup) objNewInstance);
            } else {
                x0.logger.info(ILogger.defaultTag, "register failed, class name: " + str + " should implements one of IRouteRoot/IProviderGroup/IInterceptorGroup.");
            }
        } catch (Exception e2) {
            x0.logger.error(ILogger.defaultTag, "register class error:" + str, e2);
        }
    }

    public static void h(IInterceptorGroup iInterceptorGroup) {
        f();
        if (iInterceptorGroup != null) {
            iInterceptorGroup.loadInto(y7l.f18918e);
        }
    }

    public static void i(IProviderGroup iProviderGroup) {
        f();
        if (iProviderGroup != null) {
            iProviderGroup.loadInto(y7l.d);
        }
    }

    public static void j(IRouteRoot iRouteRoot) {
        f();
        if (iRouteRoot != null) {
            iRouteRoot.loadInto(y7l.a);
        }
    }

    public static void k(Postcard postcard, Integer num, String str, String str2) {
        if (mtj.b(str) || mtj.b(str2)) {
            return;
        }
        try {
            if (num == null) {
                postcard.withString(str, str2);
            } else if (num.intValue() == TypeKind.BOOLEAN.ordinal()) {
                postcard.withBoolean(str, Boolean.parseBoolean(str2));
            } else if (num.intValue() == TypeKind.BYTE.ordinal()) {
                postcard.withByte(str, Byte.parseByte(str2));
            } else if (num.intValue() == TypeKind.SHORT.ordinal()) {
                postcard.withShort(str, Short.parseShort(str2));
            } else if (num.intValue() == TypeKind.INT.ordinal()) {
                postcard.withInt(str, Integer.parseInt(str2));
            } else if (num.intValue() == TypeKind.LONG.ordinal()) {
                postcard.withLong(str, Long.parseLong(str2));
            } else if (num.intValue() == TypeKind.FLOAT.ordinal()) {
                postcard.withFloat(str, Float.parseFloat(str2));
            } else if (num.intValue() == TypeKind.DOUBLE.ordinal()) {
                postcard.withDouble(str, Double.parseDouble(str2));
            } else if (num.intValue() == TypeKind.STRING.ordinal()) {
                postcard.withString(str, str2);
            } else if (num.intValue() != TypeKind.PARCELABLE.ordinal()) {
                if (num.intValue() == TypeKind.OBJECT.ordinal()) {
                    postcard.withString(str, str2);
                } else {
                    postcard.withString(str, str2);
                }
            }
        } catch (Throwable th) {
            x0.logger.warning(ILogger.defaultTag, "LogisticsCenter setValue failed! " + th.getMessage());
        }
    }
}
