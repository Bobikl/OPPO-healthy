package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.esim.nec.NecBrowserActivity;
import com.heytap.health.watch.notification.breeno.FlightBaggageBean;
import com.heytap.health.watch.notification.breeno.FlightBoardingBean;
import com.heytap.health.watch.notification.breeno.FlightGoToAirportBean;
import com.heytap.health.watch.notification.breeno.FlightPreparationBean;
import com.heytap.health.watch.notification.breeno.MovieMuteBean;
import com.heytap.health.watch.notification.breeno.MoviePickUpTicketBean;
import com.heytap.health.watch.notification.breeno.MoviePreparationBean;
import com.heytap.health.watch.notification.breeno.TrainBoardingBean;
import com.heytap.health.watch.notification.breeno.TrainGoToStationBean;
import com.heytap.health.watch.notification.breeno.TrainPreparationBean;
import com.heytap.health.watch.notification.impl.breeno.data.FlightData;
import com.heytap.health.watch.notification.impl.breeno.data.MovieData;
import com.heytap.health.watch.notification.impl.breeno.data.TrainData;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0014H\u0002J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0014H\u0002J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0014H\u0002J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0014H\u0002J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0014H\u0002R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/p62;", "", "", NecBrowserActivity.SUB_ID, "Lcom/heytap/health/watch/notification/impl/breeno/data/FlightData;", "flightData", "", "a", "Lcom/heytap/health/watch/notification/impl/breeno/data/MovieData;", "movieData", "b", "Lcom/heytap/health/watch/notification/impl/breeno/data/TrainData;", "trainData", "c", LogFieldKey.PROCESS_NAME_KEY, "", "d", "q", "r", MapSchema.FIELD_NAME_ENTRY, "", LogFieldKey.LEVEL_KEY, "moviePickUpTicketData", "j", "moviePreparationData", MapSchema.FIELD_NAME_KEY, "trainPreparationData", "o", "trainGotoStationData", "n", "trainBoardingData", LogFieldKey.MESSAGE_KEY, "flightPreparationData", "i", "flightGoToAirportData", b2n.g, "flightBoardingData", "f", "flightBaggageData", b2n.f, "TAG", "Ljava/lang/String;", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class p62 {

    @NotNull
    public static final p62 INSTANCE = new p62();

    @NotNull
    public static final String TAG = "NTF_BreenoSceneSender";

    @JvmStatic
    public static final void a(@NotNull String subId, @NotNull FlightData flightData) {
        Intrinsics.checkNotNullParameter(subId, "subId");
        Intrinsics.checkNotNullParameter(flightData, "flightData");
        INSTANCE.p(subId, flightData);
    }

    @JvmStatic
    public static final void b(@NotNull String subId, @NotNull MovieData movieData) {
        Intrinsics.checkNotNullParameter(subId, "subId");
        Intrinsics.checkNotNullParameter(movieData, "movieData");
        INSTANCE.q(subId, movieData);
    }

    @JvmStatic
    public static final void c(@NotNull String subId, @NotNull TrainData trainData) {
        Intrinsics.checkNotNullParameter(subId, "subId");
        Intrinsics.checkNotNullParameter(trainData, "trainData");
        INSTANCE.r(subId, trainData);
    }

    public final boolean d(String subId, FlightData flightData) {
        if (Intrinsics.areEqual(o62.SERVICE_ID_FLIGHT_BOARDING, subId) || Intrinsics.areEqual(o62.SERVICE_ID_FLIGHT_PREPARATION, subId) || Intrinsics.areEqual(o62.SERVICE_ID_FLIGHT_GO_TO_AIRPORT, subId)) {
            if (!TextUtils.isEmpty(flightData.mFlightCompanyName) && !TextUtils.isEmpty(flightData.mFlightNumber) && !TextUtils.isEmpty(flightData.mStartPlace) && !TextUtils.isEmpty(flightData.mTakeOffTime)) {
                return false;
            }
            a7b.b(TAG, "[filterFlightEvent] --> missing info ,return");
            return true;
        }
        if (!Intrinsics.areEqual(o62.SERVICE_ID_FLIGHT_GET_BAGGAGE, subId)) {
            return false;
        }
        if (!TextUtils.isEmpty(flightData.mBaggageCarousel) && !TextUtils.isEmpty(flightData.mFlightCompanyName) && !TextUtils.isEmpty(flightData.mFlightNumber)) {
            return false;
        }
        a7b.b(TAG, "[filterFlightEvent] --> missing info ,BAGGAGE,return");
        return true;
    }

    public final boolean e(TrainData trainData) {
        if (!TextUtils.isEmpty(trainData.mTakeOffTime) && !TextUtils.isEmpty(trainData.mTrainNumber) && !TextUtils.isEmpty(trainData.mStartPlace)) {
            return false;
        }
        a7b.b(TAG, "[filterTrainEvent] --> missing info ,return");
        return true;
    }

    public final void f(byte[] flightBoardingData) {
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(2, 32, flightBoardingData));
    }

    public final void g(byte[] flightBaggageData) {
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(2, 33, flightBaggageData));
    }

    public final void h(byte[] flightGoToAirportData) {
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(2, 25, flightGoToAirportData));
    }

    public final void i(byte[] flightPreparationData) {
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(2, 24, flightPreparationData));
    }

    public final void j(byte[] moviePickUpTicketData) {
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(2, 19, moviePickUpTicketData));
    }

    public final void k(byte[] moviePreparationData) {
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(2, 20, moviePreparationData));
    }

    public final void l(byte[] movieData) {
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(2, 18, movieData));
    }

    public final void m(byte[] trainBoardingData) {
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(2, 23, trainBoardingData));
    }

    public final void n(byte[] trainGotoStationData) {
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(2, 22, trainGotoStationData));
    }

    public final void o(byte[] trainPreparationData) {
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(2, 21, trainPreparationData));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void p(String subId, FlightData flightData) {
        if (d(subId, flightData)) {
        }
        switch (subId.hashCode()) {
            case 49500756:
                if (subId.equals(o62.SERVICE_ID_FLIGHT_PREPARATION)) {
                    FlightPreparationBean.Builder builderNewBuilder = FlightPreparationBean.newBuilder();
                    String str = flightData.mTakeOffTime;
                    if (str == null) {
                        str = "";
                    }
                    FlightPreparationBean.Builder takeOffTime = builderNewBuilder.setTakeOffTime(str);
                    String str2 = flightData.mTakeOffDate;
                    if (str2 == null) {
                        str2 = "";
                    }
                    FlightPreparationBean.Builder takeOffDate = takeOffTime.setTakeOffDate(str2);
                    String str3 = flightData.mFlightCompanyName;
                    if (str3 == null) {
                        str3 = "";
                    }
                    FlightPreparationBean.Builder flightCompanyName = takeOffDate.setFlightCompanyName(str3);
                    String str4 = flightData.mFlightNumber;
                    if (str4 == null) {
                        str4 = "";
                    }
                    FlightPreparationBean.Builder flightNumber = flightCompanyName.setFlightNumber(str4);
                    String str5 = flightData.mStartPlace;
                    if (str5 == null) {
                        str5 = "";
                    }
                    FlightPreparationBean.Builder startPlace = flightNumber.setStartPlace(str5);
                    String str6 = flightData.mEndPlace;
                    byte[] byteArray = startPlace.setEndPlace(str6 != null ? str6 : "").build().toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "flightPreparationBean.toByteArray()");
                    i(byteArray);
                }
                break;
            case 49500757:
                if (subId.equals(o62.SERVICE_ID_FLIGHT_GO_TO_AIRPORT)) {
                    FlightGoToAirportBean.Builder builderNewBuilder2 = FlightGoToAirportBean.newBuilder();
                    String str7 = flightData.mCheckInOffice;
                    if (str7 == null) {
                        str7 = "";
                    }
                    FlightGoToAirportBean.Builder checkInOffice = builderNewBuilder2.setCheckInOffice(str7);
                    String str8 = flightData.mFlightCompanyName;
                    if (str8 == null) {
                        str8 = "";
                    }
                    FlightGoToAirportBean.Builder flightCompanyName2 = checkInOffice.setFlightCompanyName(str8);
                    String str9 = flightData.mFlightStatus;
                    if (str9 == null) {
                        str9 = "";
                    }
                    FlightGoToAirportBean.Builder navDuration = flightCompanyName2.setFlightStatus(str9).setNavDuration(flightData.mNavDuration);
                    String str10 = flightData.mStartPlace;
                    if (str10 == null) {
                        str10 = "";
                    }
                    FlightGoToAirportBean.Builder startPlace2 = navDuration.setStartPlace(str10);
                    String str11 = flightData.mTakeOffTime;
                    if (str11 == null) {
                        str11 = "";
                    }
                    FlightGoToAirportBean.Builder takeOffTime2 = startPlace2.setTakeOffTime(str11);
                    String str12 = flightData.mFlightNumber;
                    if (str12 == null) {
                        str12 = "";
                    }
                    FlightGoToAirportBean.Builder flightNumber2 = takeOffTime2.setFlightNumber(str12);
                    String str13 = flightData.mArriveTime;
                    byte[] byteArray2 = flightNumber2.setArriveTime(str13 != null ? str13 : "").build().toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray2, "flightGoToAirportBean.toByteArray()");
                    h(byteArray2);
                    break;
                }
                break;
            case 49500758:
                if (subId.equals(o62.SERVICE_ID_FLIGHT_BOARDING)) {
                    FlightBoardingBean.Builder builderNewBuilder3 = FlightBoardingBean.newBuilder();
                    String str14 = flightData.mArriveTime;
                    if (str14 == null) {
                        str14 = "";
                    }
                    FlightBoardingBean.Builder arriveTime = builderNewBuilder3.setArriveTime(str14);
                    String str15 = flightData.mBoardingGate;
                    if (str15 == null) {
                        str15 = "";
                    }
                    FlightBoardingBean.Builder boardingGate = arriveTime.setBoardingGate(str15);
                    String str16 = flightData.mFlightCompanyName;
                    if (str16 == null) {
                        str16 = "";
                    }
                    FlightBoardingBean.Builder flightCompanyName3 = boardingGate.setFlightCompanyName(str16);
                    String str17 = flightData.mFlightNumber;
                    if (str17 == null) {
                        str17 = "";
                    }
                    FlightBoardingBean.Builder flightNumber3 = flightCompanyName3.setFlightNumber(str17);
                    String str18 = flightData.mFlightStatus;
                    if (str18 == null) {
                        str18 = "";
                    }
                    FlightBoardingBean.Builder flightStatus = flightNumber3.setFlightStatus(str18);
                    String str19 = flightData.mTakeOffTime;
                    if (str19 == null) {
                        str19 = "";
                    }
                    FlightBoardingBean.Builder takeOffTime3 = flightStatus.setTakeOffTime(str19);
                    String str20 = flightData.mStartPlace;
                    if (str20 == null) {
                        str20 = "";
                    }
                    FlightBoardingBean.Builder startPlace3 = takeOffTime3.setStartPlace(str20);
                    String str21 = flightData.mSeatNum;
                    byte[] byteArray3 = startPlace3.setSeatNum(str21 != null ? str21 : "").build().toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray3, "flightBoardingBean.toByteArray()");
                    f(byteArray3);
                    break;
                }
                break;
            case 49500759:
                if (subId.equals(o62.SERVICE_ID_FLIGHT_GET_BAGGAGE)) {
                    FlightBaggageBean.Builder builderNewBuilder4 = FlightBaggageBean.newBuilder();
                    String str22 = flightData.mBaggageCarousel;
                    if (str22 == null) {
                        str22 = "";
                    }
                    FlightBaggageBean.Builder baggageCarousel = builderNewBuilder4.setBaggageCarousel(str22);
                    String str23 = flightData.mFlightCompanyName;
                    if (str23 == null) {
                        str23 = "";
                    }
                    FlightBaggageBean.Builder flightCompanyName4 = baggageCarousel.setFlightCompanyName(str23);
                    String str24 = flightData.mFlightNumber;
                    byte[] byteArray4 = flightCompanyName4.setFlightNumber(str24 != null ? str24 : "").build().toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray4, "flightBaggageBean.toByteArray()");
                    g(byteArray4);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void q(String subId, MovieData movieData) {
        if (TextUtils.isEmpty(movieData.mMovieName)) {
            a7b.b(TAG, "[filterMovieEvent] --> missing info ,return");
        }
        switch (subId.hashCode()) {
            case 49500764:
                if (subId.equals(o62.SERVICE_ID_MOVIE_PREPARATION)) {
                    MoviePreparationBean.Builder builderNewBuilder = MoviePreparationBean.newBuilder();
                    String str = movieData.mCinema;
                    if (str == null) {
                        str = "";
                    }
                    MoviePreparationBean.Builder cinema = builderNewBuilder.setCinema(str);
                    String str2 = movieData.mMovieName;
                    byte[] byteArray = cinema.setMovieName(str2 != null ? str2 : "").setOccurTime(movieData.mOccurTime).build().toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "moviePreparationBean.toByteArray()");
                    k(byteArray);
                    break;
                }
                break;
            case 49500786:
                if (subId.equals(o62.SERVICE_ID_MOVIE_PICK_UP_TICKET)) {
                    MoviePickUpTicketBean.Builder builderNewBuilder2 = MoviePickUpTicketBean.newBuilder();
                    String str3 = movieData.mDateTime;
                    if (str3 == null) {
                        str3 = "";
                    }
                    MoviePickUpTicketBean.Builder dateTime = builderNewBuilder2.setDateTime(str3);
                    String str4 = movieData.mMovieName;
                    if (str4 == null) {
                        str4 = "";
                    }
                    MoviePickUpTicketBean.Builder movieName = dateTime.setMovieName(str4);
                    String str5 = movieData.mPickCode;
                    if (str5 == null) {
                        str5 = "";
                    }
                    MoviePickUpTicketBean.Builder pickCode = movieName.setPickCode(str5);
                    String str6 = movieData.mVerification;
                    byte[] byteArray2 = pickCode.setVerification(str6 != null ? str6 : "").build().toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray2, "moviePickUpTicketBean.toByteArray()");
                    j(byteArray2);
                    break;
                }
                break;
            case 49500787:
                if (subId.equals(o62.SERVICE_ID_MOVIE_MUTE)) {
                    MovieMuteBean.Builder builderNewBuilder3 = MovieMuteBean.newBuilder();
                    String str7 = movieData.mMovieName;
                    byte[] byteArray3 = builderNewBuilder3.setMovieName(str7 != null ? str7 : "").build().toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray3, "movieMuteBean.toByteArray()");
                    l(byteArray3);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void r(String subId, TrainData trainData) {
        if (e(trainData)) {
        }
        switch (subId.hashCode()) {
            case 49500760:
                if (subId.equals(o62.SERVICE_ID_TRAIN_PREPARATION)) {
                    TrainPreparationBean.Builder builderNewBuilder = TrainPreparationBean.newBuilder();
                    String str = trainData.mTakeOffDate;
                    if (str == null) {
                        str = "";
                    }
                    TrainPreparationBean.Builder takeOffDate = builderNewBuilder.setTakeOffDate(str);
                    String str2 = trainData.mTakeOffTime;
                    if (str2 == null) {
                        str2 = "";
                    }
                    TrainPreparationBean.Builder takeOffTime = takeOffDate.setTakeOffTime(str2);
                    String str3 = trainData.mTrainNumber;
                    if (str3 == null) {
                        str3 = "";
                    }
                    TrainPreparationBean.Builder trainNumber = takeOffTime.setTrainNumber(str3);
                    String str4 = trainData.mStartPlace;
                    if (str4 == null) {
                        str4 = "";
                    }
                    TrainPreparationBean.Builder startPlace = trainNumber.setStartPlace(str4);
                    String str5 = trainData.mEndPlace;
                    byte[] byteArray = startPlace.setEndPlace(str5 != null ? str5 : "").build().toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "trainPreparationBean.toByteArray()");
                    o(byteArray);
                    break;
                }
                break;
            case 49500761:
                if (subId.equals(o62.SERVICE_ID_TRAIN_GO_TO_STATION)) {
                    TrainGoToStationBean.Builder navDuration = TrainGoToStationBean.newBuilder().setNavDuration(trainData.mNavDuration);
                    String str6 = trainData.mSeat;
                    if (str6 == null) {
                        str6 = "";
                    }
                    TrainGoToStationBean.Builder seat = navDuration.setSeat(str6);
                    String str7 = trainData.mTakeOffTime;
                    if (str7 == null) {
                        str7 = "";
                    }
                    TrainGoToStationBean.Builder takeOffTime2 = seat.setTakeOffTime(str7);
                    String str8 = trainData.mArriveTime;
                    if (str8 == null) {
                        str8 = "";
                    }
                    TrainGoToStationBean.Builder arriveTime = takeOffTime2.setArriveTime(str8);
                    String str9 = trainData.mTicketGate;
                    if (str9 == null) {
                        str9 = "";
                    }
                    TrainGoToStationBean.Builder ticketGate = arriveTime.setTicketGate(str9);
                    String str10 = trainData.mTrainNumber;
                    if (str10 == null) {
                        str10 = "";
                    }
                    TrainGoToStationBean.Builder trainNumber2 = ticketGate.setTrainNumber(str10);
                    String str11 = trainData.mStartPlace;
                    if (str11 == null) {
                        str11 = "";
                    }
                    TrainGoToStationBean.Builder startPlace2 = trainNumber2.setStartPlace(str11);
                    String str12 = trainData.mEndPlace;
                    byte[] byteArray2 = startPlace2.setEndPlace(str12 != null ? str12 : "").build().toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray2, "trainGoToStationBean.toByteArray()");
                    n(byteArray2);
                    break;
                }
                break;
            case 49500762:
                if (subId.equals(o62.SERVICE_ID_TRAIN_BOARDING)) {
                    TrainBoardingBean.Builder builderNewBuilder2 = TrainBoardingBean.newBuilder();
                    String str13 = trainData.mArriveTime;
                    if (str13 == null) {
                        str13 = "";
                    }
                    TrainBoardingBean.Builder arriveTime2 = builderNewBuilder2.setArriveTime(str13);
                    String str14 = trainData.mSeat;
                    if (str14 == null) {
                        str14 = "";
                    }
                    TrainBoardingBean.Builder seat2 = arriveTime2.setSeat(str14);
                    String str15 = trainData.mTakeOffTime;
                    if (str15 == null) {
                        str15 = "";
                    }
                    TrainBoardingBean.Builder takeOffTime3 = seat2.setTakeOffTime(str15);
                    String str16 = trainData.mTicketGate;
                    if (str16 == null) {
                        str16 = "";
                    }
                    TrainBoardingBean.Builder ticketGate2 = takeOffTime3.setTicketGate(str16);
                    String str17 = trainData.mTrainNumber;
                    if (str17 == null) {
                        str17 = "";
                    }
                    TrainBoardingBean.Builder trainNumber3 = ticketGate2.setTrainNumber(str17);
                    String str18 = trainData.mStartPlace;
                    if (str18 == null) {
                        str18 = "";
                    }
                    TrainBoardingBean.Builder startPlace3 = trainNumber3.setStartPlace(str18);
                    String str19 = trainData.mEndPlace;
                    byte[] byteArray3 = startPlace3.setEndPlace(str19 != null ? str19 : "").build().toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray3, "trainBoardingBean.toByteArray()");
                    m(byteArray3);
                    break;
                }
                break;
        }
    }
}
