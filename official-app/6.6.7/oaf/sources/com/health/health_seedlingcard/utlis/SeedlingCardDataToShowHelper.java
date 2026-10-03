package com.health.health_seedlingcard.utlis;

import com.health.health_seedlingcard.R$string;
import com.health.health_seedlingcard.bean.SleepCardBean;
import com.health.health_seedlingcard.bean.SleepReminderCardBean;
import com.health.health_seedlingcard.bean.StepsBean;
import com.health.health_seedlingcard.bean.TodayStepCheckin;
import com.health.health_seedlingcard.bean.WeeklyStepBean;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.operations.bean.MedalListBean;
import com.heytap.health.operations.router.providers.IOperatorProvider;
import com.oplus.aiunit.vision.dyf;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.t15;
import com.oplus.aiunit.vision.vd8;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/health/health_seedlingcard/utlis/SeedlingCardDataToShowHelper;", "", "", "isShowEmptyCard", "Lorg/json/JSONObject;", "g", "h", "f", "Lcom/heytap/health/operations/bean/MedalListBean;", "medalListBean", "Lcom/heytap/health/base/utils/AsyncResult;", "e", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "card", "i", "", "upkVersionCode", "c", "d", "b", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class SeedlingCardDataToShowHelper {

    @NotNull
    public static final SeedlingCardDataToShowHelper INSTANCE = new SeedlingCardDataToShowHelper();

    @NotNull
    public static final String TAG = "SeedlingCardDataToShow";

    @JvmStatic
    @NotNull
    public static final AsyncResult<JSONObject> c(@NotNull final SeedlingCard card, final long upkVersionCode, final boolean isShowEmptyCard) {
        Intrinsics.checkNotNullParameter(card, "card");
        return new AsyncResult<>(new Function1<Function1<? super Result<? extends JSONObject>, ? extends Unit>, Unit>() { // from class: com.health.health_seedlingcard.utlis.SeedlingCardDataToShowHelper$getSleepData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Function1<? super Result<? extends JSONObject>, Unit>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final Function1<? super Result<? extends JSONObject>, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "block");
                if (!isShowEmptyCard) {
                    SeelingCardConvertDataHelper.i(card.getSize(), upkVersionCode).a(new Function1<dyf<SleepCardBean>, Unit>() { // from class: com.health.health_seedlingcard.utlis.SeedlingCardDataToShowHelper$getSleepData$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
                            invoke((dyf<SleepCardBean>) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull dyf<SleepCardBean> dyfVar) throws JSONException {
                            Intrinsics.checkNotNullParameter(dyfVar, "it");
                            SleepCardBean sleepCardBean = (SleepCardBean) dyfVar.b();
                            if (sleepCardBean == null) {
                                Function1<Result<? extends JSONObject>, Unit> function2 = function1;
                                m8b.f(SeedlingCardDataToShowHelper.TAG, " send UI empty data to Sleep card");
                                Result.Companion companion = Result.Companion;
                                function2.invoke(Result.box-impl(Result.constructor-impl(SeedlingCardDataToShowHelper.INSTANCE.b())));
                                return;
                            }
                            Function1<Result<? extends JSONObject>, Unit> function3 = function1;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("sleepWaveInfotitle", sleepCardBean.getUiData().getSleepWaveInfotitle());
                            jSONObject.put("sleepWaveInfotips", sleepCardBean.getUiData().getSleepWaveInfotips());
                            jSONObject.put("sleepWaveInfotitleMain", sleepCardBean.getUiData().getSleepWaveInfotitleMain());
                            jSONObject.put("sleepWaveInfotitleSub", sleepCardBean.getUiData().getSleepWaveInfotitleSub());
                            jSONObject.put("sleepWaveOpt", vd8.g(sleepCardBean.getUiData().getSleepWaveOpt()));
                            jSONObject.put("sleepWaveDarkOpt", vd8.g(sleepCardBean.getUiData().getSleepWaveDarkOpt()));
                            jSONObject.put("showCard", true);
                            jSONObject.put("showEmptyCard", false);
                            b.INSTANCE.a(SeedlingCardDataToShowHelper.TAG, "UIdata = " + jSONObject);
                            m8b.f(SeedlingCardDataToShowHelper.TAG, " send UI data to Sleep card");
                            function3.invoke(Result.box-impl(Result.constructor-impl(jSONObject)));
                        }
                    });
                } else {
                    Result.Companion companion = Result.Companion;
                    function1.invoke(Result.box-impl(Result.constructor-impl(SeedlingCardDataToShowHelper.INSTANCE.b())));
                }
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final JSONObject d() throws JSONException {
        SleepReminderCardBean sleepReminderCardBeanJ = SeelingCardConvertDataHelper.j();
        String remindertitle = sleepReminderCardBeanJ.getUiData().getSleepWaveInfo().getRemindertitle();
        String reminder1x2tips = sleepReminderCardBeanJ.getUiData().getSleepWaveInfo().getReminder1x2tips();
        String reminder2x2tips = sleepReminderCardBeanJ.getUiData().getSleepWaveInfo().getReminder2x2tips();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sleepWaveInforemindertitle", remindertitle);
        jSONObject.put("sleepWaveInforeminder2x2tips", reminder2x2tips);
        jSONObject.put("sleepWaveInforeminder1x2tips", reminder1x2tips);
        jSONObject.put("sleepWaveInforemindertitle", reminder1x2tips);
        jSONObject.put("noEmptyWrapperIconPreTitle", "noempty-wrapper-2x2-icon-pretitle");
        jSONObject.put("noEmptyWrapperReminderTitle", "noempty-wrapper-2x2-reminder-title");
        jSONObject.put("noEmptyWrapperReminderTips", "noempty-wrapper-2x2-reminder-2x2-tips");
        jSONObject.put("showEmptyCard", false);
        m8b.f(TAG, "UIdata = " + jSONObject);
        return jSONObject;
    }

    @JvmStatic
    @NotNull
    public static final AsyncResult<JSONObject> e(@Nullable final MedalListBean medalListBean, final boolean isShowEmptyCard) {
        final String string = e88.a().getString(R$string.seedling_card_unlock_medals);
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext().getStrin…dling_card_unlock_medals)");
        return new AsyncResult<>(new Function1<Function1<? super Result<? extends JSONObject>, ? extends Unit>, Unit>() { // from class: com.health.health_seedlingcard.utlis.SeedlingCardDataToShowHelper$getStepAchievementData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Function1<? super Result<? extends JSONObject>, Unit>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final Function1<? super Result<? extends JSONObject>, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "block");
                if (isShowEmptyCard) {
                    Result.Companion companion = Result.Companion;
                    function1.invoke(Result.box-impl(Result.constructor-impl(SeedlingCardDataToShowHelper.INSTANCE.a())));
                    return;
                }
                final MedalListBean medalListBeanE3 = medalListBean;
                if (medalListBeanE3 == null || medalListBeanE3 == null) {
                    SeedlingCardDataToShowHelper seedlingCardDataToShowHelper = SeedlingCardDataToShowHelper.INSTANCE;
                    medalListBeanE3 = ((IOperatorProvider) e1.d().h(IOperatorProvider.class)).E3();
                }
                m8b.f(SeedlingCardDataToShowHelper.TAG, " get medal data = " + medalListBeanE3);
                if (medalListBeanE3 == null) {
                    m8b.f(SeedlingCardDataToShowHelper.TAG, " send UI data to Step emptyAchievements card");
                    Result.Companion companion2 = Result.Companion;
                    function1.invoke(Result.box-impl(Result.constructor-impl(SeedlingCardDataToShowHelper.INSTANCE.a())));
                } else {
                    final String str = string;
                    SeelingCardConvertDataHelper seelingCardConvertDataHelper = SeelingCardConvertDataHelper.INSTANCE;
                    String imageUrl = medalListBeanE3.getImageUrl();
                    Intrinsics.checkNotNullExpressionValue(imageUrl, "medal.imageUrl");
                    seelingCardConvertDataHelper.l(imageUrl).a(new Function1<dyf<String>, Unit>() { // from class: com.health.health_seedlingcard.utlis.SeedlingCardDataToShowHelper$getStepAchievementData$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
                            invoke((dyf<String>) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull dyf<String> dyfVar) throws JSONException {
                            Intrinsics.checkNotNullParameter(dyfVar, "it");
                            JSONObject jSONObject = new JSONObject();
                            String str2 = str;
                            MedalListBean medalListBean2 = medalListBeanE3;
                            jSONObject.put("cardMedalmedalTitle2x2", str2);
                            jSONObject.put("cardMedalmedalContent2x2", medalListBean2.getName());
                            jSONObject.put("cardMedalmedalImage", dyfVar.b());
                            jSONObject.put("cardMedalmedalTitle1x2", str2);
                            jSONObject.put("cardMedalmedalContent1x2", medalListBean2.getName());
                            jSONObject.put("extra_scheme_uri", "healthap://app/path=140?typeCode=" + medalListBean2.getTypeCode() + "&code=" + medalListBean2.getCode());
                            jSONObject.put("showEmptyCard", false);
                            b.INSTANCE.a(SeedlingCardDataToShowHelper.TAG, "UIdata = " + jSONObject);
                            m8b.f(SeedlingCardDataToShowHelper.TAG, " send UI data to Step achievement card");
                            function1.invoke(Result.box-impl(Result.constructor-impl(jSONObject)));
                        }
                    });
                }
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final JSONObject f(boolean isShowEmptyCard) throws JSONException {
        if (isShowEmptyCard) {
            m8b.f(TAG, " send UI empty data to Sync to WeChat card");
            return INSTANCE.b();
        }
        StepsBean uiData = SeelingCardConvertDataHelper.p().getUiData();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("todaystepspercent", Float.valueOf(uiData.getTodaysteps().getPercent()));
        jSONObject.put("todaystepstotalSteps", uiData.getTodaysteps().getTotalSteps());
        jSONObject.put("todaystepstotalCalories", uiData.getTodaysteps().getTotalCalories());
        jSONObject.put("todaystepstotaldistance", uiData.getTodaysteps().getTips1x2());
        jSONObject.put("todaystepstitle1x2", uiData.getTodaysteps().getTitle1x2());
        jSONObject.put("todaystepstips1x2", uiData.getTodaysteps().getTips1x2());
        jSONObject.put("showEmptyCard", false);
        b.INSTANCE.a(TAG, "UIdata = " + jSONObject);
        m8b.f(TAG, " send UI data to Sync to WeChat card");
        return jSONObject;
    }

    @JvmStatic
    @NotNull
    public static final JSONObject g(boolean isShowEmptyCard) throws JSONException {
        if (isShowEmptyCard) {
            m8b.f(TAG, " send UI empty data to Today Step Checkin card");
            return INSTANCE.b();
        }
        TodayStepCheckin uiData = SeelingCardConvertDataHelper.n().getUiData();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("todayStepCheckintoday2x2Title", uiData.getTodayStepCheckin().getToday2x2Title());
        jSONObject.put("todayStepCheckintodayStepNum", uiData.getTodayStepCheckin().getTodayStepNum());
        jSONObject.put("todayStepCheckintodayStepTips", uiData.getTodayStepCheckin().getTodayStepTips());
        jSONObject.put("todayStepCheckincheckInBtnText", uiData.getTodayStepCheckin().getCheckInBtnText());
        jSONObject.put("todayStepCheckintoday1x2Title", uiData.getTodayStepCheckin().getToday1x2Title());
        jSONObject.put("todayStepCheckintoday1x2Tips", uiData.getTodayStepCheckin().getToday1x2Tips());
        jSONObject.put("showEmptyCard", false);
        b.INSTANCE.a(TAG, "UIdata = " + jSONObject);
        m8b.f(TAG, " send UI data to Today Step Checkin card");
        return jSONObject;
    }

    @JvmStatic
    @NotNull
    public static final JSONObject h(boolean isShowEmptyCard) throws JSONException {
        if (isShowEmptyCard) {
            m8b.f(TAG, " send UI empty data to Today steps card");
            return INSTANCE.b();
        }
        StepsBean uiData = SeelingCardConvertDataHelper.o().getUiData();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("todaystepspercent", Float.valueOf(uiData.getTodaysteps().getPercent()));
        jSONObject.put("todaystepstotalSteps", uiData.getTodaysteps().getTotalSteps());
        jSONObject.put("todaystepstotalCalories", uiData.getTodaysteps().getTotalCalories());
        jSONObject.put("todaystepstotaldistance", uiData.getTodaysteps().getTotalDistance());
        jSONObject.put("todaystepstitle1x2", uiData.getTodaysteps().getTitle1x2());
        jSONObject.put("todaystepstips1x2", uiData.getTodaysteps().getTips1x2());
        jSONObject.put("showEmptyCard", false);
        b.INSTANCE.a(TAG, "UIdata = " + jSONObject);
        m8b.f(TAG, " send UI data to Today steps card");
        return jSONObject;
    }

    @JvmStatic
    @NotNull
    public static final AsyncResult<JSONObject> i(@NotNull final SeedlingCard card, final boolean isShowEmptyCard) {
        Intrinsics.checkNotNullParameter(card, "card");
        return new AsyncResult<>(new Function1<Function1<? super Result<? extends JSONObject>, ? extends Unit>, Unit>() { // from class: com.health.health_seedlingcard.utlis.SeedlingCardDataToShowHelper$getWeeklyStepData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Function1<? super Result<? extends JSONObject>, Unit>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final Function1<? super Result<? extends JSONObject>, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "block");
                if (!isShowEmptyCard) {
                    SeelingCardConvertDataHelper.INSTANCE.q(card.getSize()).a(new Function1<dyf<WeeklyStepBean>, Unit>() { // from class: com.health.health_seedlingcard.utlis.SeedlingCardDataToShowHelper$getWeeklyStepData$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
                            invoke((dyf<WeeklyStepBean>) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull dyf<WeeklyStepBean> dyfVar) throws JSONException {
                            Intrinsics.checkNotNullParameter(dyfVar, "it");
                            WeeklyStepBean weeklyStepBean = (WeeklyStepBean) dyfVar.b();
                            if (weeklyStepBean == null) {
                                Function1<Result<? extends JSONObject>, Unit> function2 = function1;
                                m8b.f(SeedlingCardDataToShowHelper.TAG, " send UI data to empty Weekly step card");
                                function2.invoke(Result.box-impl(Result.constructor-impl(SeedlingCardDataToShowHelper.INSTANCE.b().put("extra_scheme_uri", "healthap://app/path=138?tab=1&extra_launch_type=7&jump_time=" + System.currentTimeMillis()))));
                                return;
                            }
                            Function1<Result<? extends JSONObject>, Unit> function3 = function1;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("stepBarInfotitle", weeklyStepBean.getUiData().getStepBarInfo().getTitle());
                            jSONObject.put("stepBarInfotips", weeklyStepBean.getUiData().getStepBarInfo().getTips());
                            jSONObject.put("stepBarOpt", vd8.g(weeklyStepBean.getUiData().getStepBarOpt()));
                            jSONObject.put("stepBarDarkOpt", vd8.g(weeklyStepBean.getUiData().getStepBarDarkOpt()));
                            jSONObject.put("extra_scheme_uri", "healthap://app/path=138?tab=1&extra_launch_type=7&jump_time=" + t15.h());
                            jSONObject.put("showCard", true);
                            jSONObject.put("showEmptyCard", false);
                            b.INSTANCE.a(SeedlingCardDataToShowHelper.TAG, "UIdata = " + jSONObject);
                            m8b.f(SeedlingCardDataToShowHelper.TAG, " send UI data to Weekly step card");
                            function3.invoke(Result.box-impl(Result.constructor-impl(jSONObject)));
                        }
                    });
                } else {
                    Result.Companion companion = Result.Companion;
                    function1.invoke(Result.box-impl(Result.constructor-impl(SeedlingCardDataToShowHelper.INSTANCE.b())));
                }
            }
        });
    }

    @NotNull
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectB = b();
        jSONObjectB.put("extra_scheme_uri", "healthap://app/path=101");
        m8b.f(TAG, " get empty card data");
        return jSONObjectB;
    }

    @NotNull
    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("showEmptyCard", true);
        m8b.f(TAG, " get empty card data");
        return jSONObject;
    }
}
