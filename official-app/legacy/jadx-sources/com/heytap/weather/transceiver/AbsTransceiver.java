package com.heytap.weather.transceiver;

import com.allawn.weather.common.vo.CityVO;
import com.allawn.weather.common.vo.WeatherSummaryVO;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.base.track.quality.QualityTrack;
import com.heytap.health.base.track.quality.Scenes;
import com.heytap.health.interconnection.weather.UltraVioleBean;
import com.heytap.health.interconnection.weather.UltravioletItem;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.wearable.weather.Weather;
import com.heytap.weather.module.WeatherMainApi;
import com.heytap.weather.module.WeatherModule;
import com.heytap.weather.service.WeatherBaseResponse;
import com.heytap.weather.service.WeatherCloud;
import com.heytap.weather.service.WeatherCloud2;
import com.heytap.weather.service.WeatherService;
import com.heytap.weather.transceiver.AbsTransceiver;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.akl;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b5b;
import com.oplus.aiunit.vision.fll;
import com.oplus.aiunit.vision.fml;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.kll;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.tkl;
import com.oplus.aiunit.vision.yjl;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.weatherservicesdk.BaseCallBack;
import com.oplus.weatherservicesdk.model.WatchAttendCity;
import com.oplus.weatherservicesdk.model.WatchWeatherInfo;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u0000 %2\u00020\u0001:\u0003 \u0018\u0019B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/heytap/weather/transceiver/AbsTransceiver;", "Lcom/heytap/weather/transceiver/d;", "", "I", "Lcom/heytap/weather/service/WeatherBaseResponse;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "C", "A", "", "Lcom/oplus/weatherservicesdk/model/WatchAttendCity;", "cities", "J", "Lcom/heytap/health/interconnection/weather/UltraVioleBean;", "uvData", "Lcom/heytap/wearable/weather/Weather$UltraVioleResponse;", "z", "Lcom/heytap/wearable/weather/Weather$SyncAttendCity;", "watchCities", "L", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "i", "f", b2n.f, "b", "c", MapSchema.FIELD_NAME_ENTRY, b2n.g, "Lcom/heytap/weather/transceiver/AbsTransceiver$c;", "result", "j", "", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "Companion", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAbsTransceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsTransceiver.kt\ncom/heytap/weather/transceiver/AbsTransceiver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n1#2:374\n1549#3:375\n1620#3,3:376\n*S KotlinDebug\n*F\n+ 1 AbsTransceiver.kt\ncom/heytap/weather/transceiver/AbsTransceiver\n*L\n297#1:375\n297#1:376,3\n*E\n"})
public abstract class AbsTransceiver implements com.heytap.weather.transceiver.d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    public static LocationCache b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String tag = "HtWeather_BaseTransceiver";

    /* JADX INFO: renamed from: com.heytap.weather.transceiver.AbsTransceiver$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/heytap/weather/transceiver/AbsTransceiver$a;", "", "Lcom/heytap/weather/transceiver/AbsTransceiver$b;", "locationCache", "Lcom/heytap/weather/transceiver/AbsTransceiver$b;", "<init>", "()V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.heytap.weather.transceiver.AbsTransceiver$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/heytap/weather/transceiver/AbsTransceiver$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", "timeSnap", "Lcom/oplus/aiunit/vision/b5b;", "Lcom/oplus/aiunit/vision/b5b;", "()Lcom/oplus/aiunit/vision/b5b;", "data", "<init>", "(JLcom/oplus/aiunit/vision/b5b;)V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class LocationCache {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final long timeSnap;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final b5b data;

        public LocationCache(long j2, @NotNull b5b data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.timeSnap = j2;
            this.data = data;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b5b getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTimeSnap() {
            return this.timeSnap;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationCache)) {
                return false;
            }
            LocationCache locationCache = (LocationCache) other;
            return this.timeSnap == locationCache.timeSnap && Intrinsics.areEqual(this.data, locationCache.data);
        }

        public int hashCode() {
            return (Long.hashCode(this.timeSnap) * 31) + this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "LocationCache(timeSnap=" + this.timeSnap + ", data=" + this.data + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/weather/transceiver/AbsTransceiver$c;", "", "Lcom/oplus/aiunit/vision/b5b;", "data", "", "b", "a", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface c {
        void a();

        void b(@NotNull b5b data);
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\n"}, d2 = {"com/heytap/weather/transceiver/AbsTransceiver$d", "Lcom/oplus/weatherservicesdk/BaseCallBack;", "", "Lcom/oplus/weatherservicesdk/model/WatchAttendCity;", "cities", "", "c", "", "msg", "onFail", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d implements BaseCallBack<List<WatchAttendCity>> {

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\n"}, d2 = {"com/heytap/weather/transceiver/AbsTransceiver$d$a", "Lcom/oplus/weatherservicesdk/BaseCallBack;", "", "Lcom/oplus/weatherservicesdk/model/WatchAttendCity;", "list", "", "a", "", "p0", "onFail", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
        public static final class a implements BaseCallBack<List<WatchAttendCity>> {
            public final /* synthetic */ AbsTransceiver a;
            public final /* synthetic */ String b;

            public a(AbsTransceiver absTransceiver, String str) {
                this.a = absTransceiver;
                this.b = str;
            }

            @Override // com.oplus.weatherservicesdk.BaseCallBack
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(@Nullable List<WatchAttendCity> list) {
                this.a.J(list);
            }

            @Override // com.oplus.weatherservicesdk.BaseCallBack
            public void onFail(@Nullable String p0) {
                this.a.I();
                QualityTrack.INSTANCE.e(Scenes.WEATHER_GET_CITY_LIST, String.valueOf(this.b));
            }
        }

        public d() {
        }

        public static final void b(AbsTransceiver this$0, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            a7b.m(this$0.tag, "onWatchGetCityList,error=" + str);
            if (Intrinsics.areEqual(str, WeatherService.GET_CITY_LIST_ERROR_NOT_LINK) || Intrinsics.areEqual(str, WeatherService.GET_CITY_LIST_SUCCESS_EMPTY)) {
                this$0.I();
            } else {
                WeatherCloud2.INSTANCE.g(new a(this$0, str));
            }
        }

        @Override // com.oplus.weatherservicesdk.BaseCallBack
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@Nullable List<WatchAttendCity> cities) {
            AbsTransceiver.this.J(cities);
        }

        @Override // com.oplus.weatherservicesdk.BaseCallBack
        public void onFail(@Nullable final String msg) {
            WeatherModule weatherModule = WeatherModule.INSTANCE;
            final AbsTransceiver absTransceiver = AbsTransceiver.this;
            weatherModule.d(new Runnable() { // from class: com.oplus.aiunit.vision.q5
                @Override // java.lang.Runnable
                public final void run() {
                    AbsTransceiver.d.b(absTransceiver, msg);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/weather/transceiver/AbsTransceiver$e", "Lcom/heytap/weather/transceiver/AbsTransceiver$c;", "Lcom/oplus/aiunit/vision/b5b;", "data", "", "b", "a", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class e implements c {
        @Override // com.heytap.weather.transceiver.AbsTransceiver.c
        public void a() {
            fll.INSTANCE.e();
        }

        @Override // com.heytap.weather.transceiver.AbsTransceiver.c
        public void b(@NotNull b5b data) {
            Intrinsics.checkNotNullParameter(data, "data");
            tkl tklVar = tkl.INSTANCE;
            int iG = data.g();
            String strJ = data.j();
            String strD = data.d();
            String strF = data.f();
            String strH = data.h();
            Intrinsics.checkNotNullExpressionValue(strH, "data.latitude");
            double d = Double.parseDouble(strH);
            String strI = data.i();
            Intrinsics.checkNotNullExpressionValue(strI, "data.longitude");
            fll.INSTANCE.f(tklVar.l(iG, strJ, strD, strF, d, Double.parseDouble(strI), data.c()));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/weather/transceiver/AbsTransceiver$f", "Lcom/heytap/weather/transceiver/AbsTransceiver$c;", "Lcom/oplus/aiunit/vision/b5b;", "data", "", "b", "a", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class f implements c {
        public f() {
        }

        public static final void e(AbsTransceiver this$0, WeatherBaseResponse response) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(response, "response");
            this$0.C(response);
        }

        public static final void f(AbsTransceiver this$0, Throwable throwable) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            a7b.b(this$0.tag, "onWatchGetCityList: getWeatherDetail error, " + throwable.getMessage());
            this$0.A();
            QualityTrack.INSTANCE.e(Scenes.WEATHER_GET_CITY_LIST, " " + throwable.getMessage());
        }

        @Override // com.heytap.weather.transceiver.AbsTransceiver.c
        public void a() {
            a7b.f(AbsTransceiver.this.tag, "onWatchGetCityList, location fail");
            AbsTransceiver.this.A();
            QualityTrack.INSTANCE.e(Scenes.WEATHER_GET_CITY_LIST, "获取定位城市失败");
        }

        @Override // com.heytap.weather.transceiver.AbsTransceiver.c
        public void b(@NotNull b5b data) throws IllegalAccessException {
            Intrinsics.checkNotNullParameter(data, "data");
            WeatherCloud weatherCloud = WeatherCloud.INSTANCE;
            String strI = data.i();
            String strH = data.h();
            String serverUnit = tkl.INSTANCE.w().getServerUnit();
            final AbsTransceiver absTransceiver = AbsTransceiver.this;
            o14<WeatherBaseResponse> o14Var = new o14() { // from class: com.oplus.aiunit.vision.r5
                @Override // com.oplus.aiunit.vision.o14
                public final void accept(Object obj) {
                    AbsTransceiver.f.e(absTransceiver, (WeatherBaseResponse) obj);
                }
            };
            final AbsTransceiver absTransceiver2 = AbsTransceiver.this;
            weatherCloud.o(strI, strH, serverUnit, o14Var, new o14() { // from class: com.oplus.aiunit.vision.s5
                @Override // com.oplus.aiunit.vision.o14
                public final void accept(Object obj) {
                    AbsTransceiver.f.f(absTransceiver2, (Throwable) obj);
                }
            });
        }
    }

    public static final void B() {
        yjl yjlVarA = akl.a(gl4.managerApi.getCurrActiveMac());
        int iD = yjlVarA.a8() ? fml.INSTANCE.d() : -1;
        if (iD == 1 || yjlVarA.q()) {
            fll fllVar = fll.INSTANCE;
            tkl tklVar = tkl.INSTANCE;
            WeatherModule weatherModule = WeatherModule.INSTANCE;
            fllVar.d(tklVar.b(null, iD, 0, weatherModule.f(), weatherModule.k()));
        }
    }

    public static final void D(AbsTransceiver this$0, WeatherBaseResponse response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "$response");
        a7b.f(this$0.tag, "onWatchGetCityList: location success, make list");
        WeatherSummaryVO weatherSummaryVO = response.getWeatherSummaryVO();
        CityVO cityVO = response.getCityVO();
        if (cityVO == null) {
            return;
        }
        tkl tklVar = tkl.INSTANCE;
        List<? extends WatchAttendCity> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(tklVar.s(cityVO, weatherSummaryVO));
        WeatherModule weatherModule = WeatherModule.INSTANCE;
        fll.INSTANCE.d(tklVar.b(listMutableListOf, 0, 0, weatherModule.f(), weatherModule.k()));
    }

    public static final void E(final String key, final AbsTransceiver this$0, final WeatherBaseResponse response) {
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        WeatherModule.INSTANCE.d(new Runnable() { // from class: com.oplus.aiunit.vision.n5
            @Override // java.lang.Runnable
            public final void run() {
                AbsTransceiver.F(response, key, this$0);
            }
        });
    }

    public static final void F(WeatherBaseResponse response, String key, AbsTransceiver this$0) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        tkl tklVar = tkl.INSTANCE;
        List<WatchWeatherInfo> listT = tklVar.t(response);
        CityVO cityVO = response.getCityVO();
        Weather.WeatherDetailResponse weatherDetailResponseM = tklVar.m(key, 0, listT, cityVO != null ? cityVO.getTimezone() : null, response);
        fll.INSTANCE.i(weatherDetailResponseM);
        String str = this$0.tag;
        StringBuilder sb = new StringBuilder();
        sb.append("onWatchGetWeatherDetails: ");
        sb.append(weatherDetailResponseM);
    }

    public static final void G(final String key, final AbsTransceiver this$0, final Throwable error) {
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "error");
        WeatherModule.INSTANCE.d(new Runnable() { // from class: com.oplus.aiunit.vision.m5
            @Override // java.lang.Runnable
            public final void run() {
                AbsTransceiver.H(key, this$0, error);
            }
        });
    }

    public static final void H(String key, AbsTransceiver this$0, Throwable error) {
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Weather.WeatherDetailResponse weatherDetailResponseH = tkl.INSTANCE.h(key, -1);
        fll.INSTANCE.i(weatherDetailResponseH);
        String str = this$0.tag;
        StringBuilder sb = new StringBuilder();
        sb.append("onWatchGetWeatherDetails: ");
        sb.append(error);
        sb.append(", ");
        sb.append(weatherDetailResponseH);
    }

    public static final void K(List list) {
        long jCurrentTimeMillis;
        QualityTrack.INSTANCE.g(Scenes.WEATHER_GET_CITY_LIST, "获取城市列表成功");
        if (fml.INSTANCE.h(list)) {
            jCurrentTimeMillis = WeatherModule.INSTANCE.f();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            WeatherModule.INSTANCE.l(jCurrentTimeMillis);
        }
        fll.INSTANCE.d(tkl.INSTANCE.b(list, 0, 0, jCurrentTimeMillis, WeatherModule.INSTANCE.k()));
    }

    public final void A() {
        WeatherModule.INSTANCE.d(new Runnable() { // from class: com.oplus.aiunit.vision.o5
            @Override // java.lang.Runnable
            public final void run() {
                AbsTransceiver.B();
            }
        });
    }

    public final void C(final WeatherBaseResponse response) {
        WeatherModule.INSTANCE.d(new Runnable() { // from class: com.oplus.aiunit.vision.p5
            @Override // java.lang.Runnable
            public final void run() {
                AbsTransceiver.D(this.i, response);
            }
        });
    }

    public final void I() {
        j(new f());
    }

    public final void J(final List<WatchAttendCity> cities) {
        WeatherModule.INSTANCE.d(new Runnable() { // from class: com.oplus.aiunit.vision.l5
            @Override // java.lang.Runnable
            public final void run() {
                AbsTransceiver.K(cities);
            }
        });
    }

    public final void L(Weather.SyncAttendCity watchCities) {
        long modifyDataTime = watchCities.getModifyDataTime();
        a7b.f(this.tag, "syncCityList2WeatherService: watchModifyTime=" + modifyDataTime);
        WeatherModule weatherModule = WeatherModule.INSTANCE;
        if (weatherModule.f() > modifyDataTime) {
            TransceiverManager.INSTANCE.D();
            return;
        }
        a7b.f(this.tag, "syncCityList2WeatherService: time +1");
        weatherModule.l(modifyDataTime + 1);
        tkl tklVar = tkl.INSTANCE;
        List<Weather.AttendCity> dataList = watchCities.getDataList();
        Intrinsics.checkNotNullExpressionValue(dataList, "watchCities.dataList");
        List<WatchAttendCity> listC = tklVar.c(dataList);
        fml.INSTANCE.h(listC);
        WeatherService.INSTANCE.x(listC);
    }

    @Override // com.heytap.weather.transceiver.d
    public void b() {
        j(new e());
    }

    @Override // com.heytap.weather.transceiver.d
    public void c(@NotNull final MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (fml.INSTANCE.g() && WeatherModule.INSTANCE.k()) {
            TransceiverManager.INSTANCE.q(true, new Function0<Unit>() { // from class: com.heytap.weather.transceiver.AbsTransceiver$onWatchReverseSyncCityList$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws InvalidProtocolBufferException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws InvalidProtocolBufferException {
                    Weather.SyncAttendCity watchCityList = Weather.SyncAttendCity.parseFrom(event.getData());
                    String unused = this.tag;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onWatchReverseSyncCityList, list= ");
                    sb.append(watchCityList);
                    AbsTransceiver absTransceiver = this;
                    Intrinsics.checkNotNullExpressionValue(watchCityList, "watchCityList");
                    absTransceiver.L(watchCityList);
                }
            });
        } else {
            a7b.m(this.tag, "onWatchReverseSyncCityList: no permission, ignore");
        }
    }

    @Override // com.heytap.weather.transceiver.d
    public void e(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            Weather.WeatherPage from = Weather.WeatherPage.parseFrom(event.getData());
            Intrinsics.checkNotNullExpressionValue(from, "parseFrom(event.data)");
            WeatherMainApi.INSTANCE.b(from.getPage());
        } catch (InvalidProtocolBufferException e2) {
            a7b.b(this.tag, "[openPage] --> " + e2.getMessage());
        }
    }

    @Override // com.heytap.weather.transceiver.d
    public void f(@NotNull MessageEvent event) {
        Weather.WeatherDetailRequest from;
        final String locationKey;
        Intrinsics.checkNotNullParameter(event, "event");
        byte[] data = event.getData();
        if (data != null) {
            try {
                from = Weather.WeatherDetailRequest.parseFrom(data);
            } catch (Exception e2) {
                a7b.b(this.tag, "onWatchGetWeatherDetails: " + e2.getMessage());
                from = null;
            }
            String language = from != null ? from.getLanguage() : null;
            boolean z = false;
            if (language != null) {
                if (language.length() > 0) {
                    z = true;
                }
            }
            String str = z ? language : null;
            WeatherCloud.INSTANCE.w(str);
            if (from == null || (locationKey = from.getLocationKey()) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(locationKey, "locationKey");
            WeatherCloud2.INSTANCE.l(locationKey, str, new o14() { // from class: com.oplus.aiunit.vision.j5
                @Override // com.oplus.aiunit.vision.o14
                public final void accept(Object obj) {
                    AbsTransceiver.E(locationKey, this, (WeatherBaseResponse) obj);
                }
            }, new o14() { // from class: com.oplus.aiunit.vision.k5
                @Override // com.oplus.aiunit.vision.o14
                public final void accept(Object obj) {
                    AbsTransceiver.G(locationKey, this, (Throwable) obj);
                }
            });
        }
    }

    @Override // com.heytap.weather.transceiver.d
    public void g(@Nullable MessageEvent event) {
        byte[] data;
        if (event == null || (data = event.getData()) == null) {
            return;
        }
        boolean result = Weather.OOBESyncResult.parseFrom(data).getResult();
        a7b.f(this.tag, "onSyncOobeResult: " + result);
        if (result) {
            WeatherMainApi.INSTANCE.a(true);
        }
    }

    @Override // com.heytap.weather.transceiver.d
    public void h(@NotNull MessageEvent event) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            Weather.UltraVioleRequest from = Weather.UltraVioleRequest.parseFrom(event.getData());
            Intrinsics.checkNotNullExpressionValue(from, "parseFrom(event.data)");
            WeatherService.INSTANCE.p(from.getForceUpdate(), new Function1<UltraVioleBean, Unit>() { // from class: com.heytap.weather.transceiver.AbsTransceiver$onUltraVioleRequest$1
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UltraVioleBean ultraVioleBean) {
                    invoke2(ultraVioleBean);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull UltraVioleBean it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    fll.INSTANCE.g(this.this$0.z(it));
                }
            }, new Function1<Throwable, Unit>() { // from class: com.heytap.weather.transceiver.AbsTransceiver$onUltraVioleRequest$2
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    fll.INSTANCE.g(this.this$0.z(null));
                }
            });
        } catch (InvalidProtocolBufferException e2) {
            a7b.b(this.tag, "[onUltraVioleRequest] --> " + e2.getMessage());
        }
    }

    @Override // com.heytap.weather.transceiver.d
    public void i(@Nullable MessageEvent event) {
        QualityTrack.INSTANCE.c(Scenes.WEATHER_GET_CITY_LIST, "开始获取城市列表");
        if (event != null) {
            kll.a(event);
        }
        WeatherService.INSTANCE.h(new d());
    }

    @Override // com.heytap.weather.transceiver.d
    public void j(@NotNull c result) {
        Intrinsics.checkNotNullParameter(result, "result");
        LocationCache locationCache = b;
        if (locationCache != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - locationCache.getTimeSnap();
            if (0 < jCurrentTimeMillis && jCurrentTimeMillis < 600000) {
                a7b.f(this.tag, "weatherOnceLocation: locate less than 10 min, use cache");
                result.b(locationCache.getData());
                return;
            }
        }
        QualityTrack qualityTrack = QualityTrack.INSTANCE;
        Scenes scenes = Scenes.WEATHER_LOCATION;
        qualityTrack.c(scenes, "触发定位");
        if (fml.INSTANCE.a()) {
            com.heytap.health.location.a.INSTANCE.c(new AbsTransceiver$weatherOnceLocation$callBack$1(this, result));
        } else {
            a7b.m(this.tag, "weatherOnceLocation: location failed, can not locate");
            result.a();
            qualityTrack.e(scenes, "无定位权限或者无授权使用网络");
        }
    }

    public final Weather.UltraVioleResponse z(UltraVioleBean uvData) {
        Weather.UltraVioleResponse ultraVioleResponseBuild = null;
        List listEmptyList = null;
        if (uvData != null) {
            List<UltravioletItem> hourlyWeatherForecastDetailList = uvData.getHourlyWeatherForecastDetailList();
            if (hourlyWeatherForecastDetailList != null) {
                List<UltravioletItem> list = hourlyWeatherForecastDetailList;
                listEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (UltravioletItem ultravioletItem : list) {
                    Weather.UltravioletItem.Builder builderNewBuilder = Weather.UltravioletItem.newBuilder();
                    Integer temp = ultravioletItem.getTemp();
                    if (temp != null) {
                        builderNewBuilder.setTemp(temp.intValue());
                    }
                    Integer uvIndex = ultravioletItem.getUvIndex();
                    if (uvIndex != null) {
                        builderNewBuilder.setUvIndex(uvIndex.intValue());
                    }
                    listEmptyList.add(builderNewBuilder.setTime(ultravioletItem.getTime()).setHourth(ultravioletItem.getHourth()).build());
                }
            }
            Weather.UltraVioleResponse.Builder forecastTime = Weather.UltraVioleResponse.newBuilder().setCode(0).setExpireTime(uvData.getExpireTime()).setSunriseTime(uvData.getSunriseTime()).setSunsetTime(uvData.getSunsetTime()).setForecastTime(uvData.getForecastTime());
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            ultraVioleResponseBuild = forecastTime.addAllUltravioletList(listEmptyList).build();
        }
        if (ultraVioleResponseBuild != null) {
            return ultraVioleResponseBuild;
        }
        Weather.UltraVioleResponse ultraVioleResponseBuild2 = Weather.UltraVioleResponse.newBuilder().setCode(-1).build();
        Intrinsics.checkNotNullExpressionValue(ultraVioleResponseBuild2, "newBuilder().setCode(-1).build()");
        return ultraVioleResponseBuild2;
    }
}
