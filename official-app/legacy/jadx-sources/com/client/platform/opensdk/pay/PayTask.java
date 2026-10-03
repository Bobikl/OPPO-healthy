package com.client.platform.opensdk.pay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import com.client.platform.opensdk.pay.download.DownloadManager;
import com.client.platform.opensdk.pay.download.dialog.AtlasPayDialog;
import com.client.platform.opensdk.pay.download.dialog.DownloadHintDialog;
import com.client.platform.opensdk.pay.download.dialog.OnBottomBtnClickListener;
import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.client.platform.opensdk.pay.download.util.MarketDownloadHelper;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.aiunit.vision.en;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class PayTask implements DownloadManager.DownloadCallback {
    private static final String CHANNEL_WECHAT = "wxpay";
    private static final String EXTRA_CHANNEL = "extra_channel";
    private static final String EXTRA_PKG_NAME = "extra_pkg_name";
    public static final String HOST_BACKGROUND_CALL_ACTION_SERVICE = "fmizem&`g{|&xd}oaf&ik|agf&jzgilki{|&jikcozg}fl";
    public static final String HOST_BACKGROUND_CALL_ACTION_SERVICE_FIN_SHELL = "com.finshell.action.PAY_ACTION";
    public static final double Pay_Amount_MAX = 9999.99d;
    public static final double Pay_Amount_MIN = 0.01d;
    public static final int Product_Dsec_MAX_LENGTH = 120;
    public static final int Product_Name_MAX_LENGTH = 40;
    public static final int REQUEST_CODE = 1002;
    public static final int RESULT_CODE = 5896;
    public static final int RESULT_CODE_CANCEL_BU = 10041;
    public static final int RESULT_CODE_DOWNLOAD_CANCEL = 10044;
    public static final int RESULT_CODE_INSTALL_CANCEL = 10042;
    public static final int RESULT_CODE_IU_APP = 10040;
    public static final int RESULT_CODE_UPDATE_CANCEL = 10043;
    private static final String TAG = "PayTask";
    public Context mActivity;
    private long mLastStartTime;
    public PayRequest mPayRequest;
    IPayTaskResult mPayTaskResult;
    private int mThemeValue;
    public float mChargeLimit = 0.01f;
    private boolean isForce = false;
    boolean update = false;

    public interface CancelListener {
        void onCancel();
    }

    public enum UpdateDialogType {
        EXCHANGE_RATE,
        FULL_AND_REDUCED_COUPON,
        DISCOUNT_COUPON,
        APPOTA
    }

    public PayTask(Context context, PayRequest payRequest, int i) {
        this.mThemeValue = -1;
        this.mActivity = context;
        this.mPayRequest = payRequest;
        payRequest.mRequestCode = i;
        payRequest.mPayId = UUID.randomUUID().toString().replace("-", "");
        String str = TAG;
        Log.w(str, "mPayId:" + this.mPayRequest.mPayId);
        PayRequest payRequest2 = this.mPayRequest;
        if (payRequest2.mIsSinglePay) {
            payRequest2.mToken = getRandomToken();
            Log.w(str, "mPayRequest.mToken:" + this.mPayRequest.mToken);
        }
        if (TextUtils.isEmpty(this.mPayRequest.mPackageName) && context != null) {
            this.mPayRequest.mPackageName = context.getPackageName();
        }
        this.mThemeValue = -1;
        this.mPayRequest.paySdkVersion = BuildConfig.PAY_VERSION_NAME;
    }

    private boolean doTickerWithoutNoting() {
        String str;
        Intent intent = new Intent(getPayAction());
        Bundle bundle = new Bundle();
        if (Utils.hasInstalledFPayApk(this.mActivity)) {
            str = Constants.F_PAY_PKG_NAME;
        } else if (Utils.hasInstalledNPayApk(this.mActivity)) {
            str = Constants.N_PAY_PKG_NAME;
        } else {
            if (!Utils.hasInstalledOPayApk(this.mActivity)) {
                Log.i(TAG, "don't find pkgName");
                return false;
            }
            str = Constants.O_PAY_PKG_NAME;
        }
        intent.setPackage(str);
        intent.putExtra("jump_plugin_id", "1001");
        bundle.putString("payParams", this.mPayRequest.convert());
        bundle.putInt("operate_type", 4);
        intent.putExtras(bundle);
        Log.i(PayTask.class.getSimpleName(), "theme_value : " + this.mThemeValue);
        int i = this.mThemeValue;
        if (i != -1) {
            intent.putExtra("theme_value", i);
        }
        this.mActivity.startService(intent);
        return true;
    }

    private AtlasPayDialog.OnClickListener getCancelListener(final CancelListener cancelListener, UpdateDialogType updateDialogType, String str) {
        return new AtlasPayDialog.OnClickListener() { // from class: com.client.platform.opensdk.pay.PayTask.4
            @Override // com.client.platform.opensdk.pay.download.dialog.AtlasPayDialog.OnClickListener
            public void onClick(int i) {
                CancelListener cancelListener2 = cancelListener;
                if (cancelListener2 != null) {
                    cancelListener2.onCancel();
                }
            }
        };
    }

    private String getPayAction() {
        return Utils.hasInstalledFPayApk(this.mActivity) ? HOST_BACKGROUND_CALL_ACTION_SERVICE_FIN_SHELL : PayXorUtils.payEncrypt(HOST_BACKGROUND_CALL_ACTION_SERVICE, 8);
    }

    private String getRandomToken() {
        return "OFFLINE_" + System.nanoTime() + "_" + Math.abs(new Random().nextInt());
    }

    private AtlasPayDialog.OnClickListener getUpdateListener(UpdateDialogType updateDialogType, String str) {
        return new AtlasPayDialog.OnClickListener() { // from class: com.client.platform.opensdk.pay.PayTask.3
            @Override // com.client.platform.opensdk.pay.download.dialog.AtlasPayDialog.OnClickListener
            public void onClick(int i) {
                PayTask.this.goUpdate();
            }
        };
    }

    public static boolean isSupportAQRCode(Context context) {
        return false;
    }

    public static boolean isSupportAQRScan(Context context) {
        return false;
    }

    public static boolean isSupportARenew(Context context) {
        return Utils.getPayApkVersionCode(context) >= 160 && Utils.isAppInstalled(context, PayXorUtils.payEncrypt("kge&mo&iflzgal&IdaxiqOx`gfm", 8));
    }

    public static boolean isSupportAppota(Context context) {
        return Utils.getPayApkVersionCode(context) >= 2081;
    }

    public static boolean isSupportDiscountCoupon(Context context) {
        return Utils.getPayApkVersionCode(context) >= 211;
    }

    public static boolean isSupportExchangeRate(Context context) {
        return Utils.getPayApkVersionCode(context) >= 203;
    }

    public static boolean isSupportFullAndReducedCoupon(Context context) {
        return Utils.getPayApkVersionCode(context) >= 203;
    }

    public static boolean isSupportWechatQRCode(Context context) {
        return Utils.getPayApkVersionCode(context) >= 161 && Utils.getMMApiLevel(context) >= 8;
    }

    public static boolean isSupportWechatQRScan(Context context) {
        return false;
    }

    public static boolean isSupportWechatRenew(Context context) {
        return Utils.getPayApkVersionCode(context) >= 161 && Utils.isAppInstalled(context, "com.tencent.mm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAppInstallOrUpdate(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", i);
            if (!TextUtils.isEmpty(this.mPayRequest.mPartnerOrder)) {
                jSONObject.put("order", this.mPayRequest.mPartnerOrder);
            }
            Intent intent = new Intent(Constants.ACTION_NOTIFY_PAY_RESULT);
            intent.putExtra(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, jSONObject.toString());
            intent.setPackage(this.mActivity.getPackageName());
            this.mActivity.sendBroadcast(intent);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        IPayTaskResult iPayTaskResult = this.mPayTaskResult;
        if (iPayTaskResult != null) {
            iPayTaskResult.onTaskResult(i, this.mPayRequest.mPartnerOrder);
        }
    }

    public static void openWechatQRCode(Context context) {
        Intent intent = new Intent(Constants.ACTION_QRCODE);
        intent.putExtra(EXTRA_CHANNEL, CHANNEL_WECHAT);
        intent.putExtra(EXTRA_PKG_NAME, context.getPackageName());
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    private void showInstallDialog() {
        if (Utils.isNotSupportDownload(this.mActivity, this.mPayRequest.mCountryCode)) {
            return;
        }
        final DownloadHintDialog downloadHintDialog = new DownloadHintDialog(this.mActivity);
        if (this.mPayRequest.mIsSinglePay) {
            downloadHintDialog.setSystemAlertFlag();
        }
        downloadHintDialog.setHint("CN".equals(this.mPayRequest.mCountryCode) ? LanUtils.CN.HINT_DOWNLOAD : LanUtils.US.HINT_DOWNLOAD);
        downloadHintDialog.setLeftBtnText("CN".equals(this.mPayRequest.mCountryCode) ? LanUtils.CN.CANCEL : "CANCEL");
        downloadHintDialog.setRightBtnText("CN".equals(this.mPayRequest.mCountryCode) ? LanUtils.CN.DOWNLOAD : "DOWNLOAD");
        downloadHintDialog.setBottomBtnClickedListener(new OnBottomBtnClickListener() { // from class: com.client.platform.opensdk.pay.PayTask.1
            @Override // com.client.platform.opensdk.pay.download.dialog.OnBottomBtnClickListener
            public void leftBtnClicked() {
                downloadHintDialog.dimiss();
                PayTask.this.notifyAppInstallOrUpdate(10044);
            }

            @Override // com.client.platform.opensdk.pay.download.dialog.OnBottomBtnClickListener
            public void rightBtnClicked() {
                downloadHintDialog.dimiss();
                if (MarketDownloadHelper.jumpMarketItemDetail(PayTask.this.mActivity, Constants.N_PAY_PKG_NAME) || MarketDownloadHelper.jumpMarketItemDetail(PayTask.this.mActivity, Constants.O_PAY_PKG_NAME)) {
                    return;
                }
                if (!Utils.isNetworkAvailable(PayTask.this.mActivity)) {
                    Toast.makeText(PayTask.this.mActivity.getApplicationContext(), "CN".equals(PayTask.this.mPayRequest.mCountryCode) ? LanUtils.CN.HINT_NO_NET : LanUtils.US.HINT_NO_NET, 1).show();
                    return;
                }
                final DownloadHintDialog downloadHintDialog2 = new DownloadHintDialog(PayTask.this.mActivity);
                downloadHintDialog2.setHint("CN".equals(PayTask.this.mPayRequest.mCountryCode) ? LanUtils.CN.HINT_GPRS : LanUtils.US.HINT_GPRS);
                downloadHintDialog2.setLeftBtnText("CN".equals(PayTask.this.mPayRequest.mCountryCode) ? LanUtils.CN.CANCEL : "CANCEL");
                downloadHintDialog2.setRightBtnText("CN".equals(PayTask.this.mPayRequest.mCountryCode) ? LanUtils.CN.DOWNLOAD : "DOWNLOAD");
                downloadHintDialog2.setBottomBtnClickedListener(new OnBottomBtnClickListener() { // from class: com.client.platform.opensdk.pay.PayTask.1.1
                    @Override // com.client.platform.opensdk.pay.download.dialog.OnBottomBtnClickListener
                    public void leftBtnClicked() {
                        downloadHintDialog2.dimiss();
                    }

                    @Override // com.client.platform.opensdk.pay.download.dialog.OnBottomBtnClickListener
                    public void rightBtnClicked() {
                        PayTask payTask = PayTask.this;
                        DownloadManager downloadManager = new DownloadManager(payTask.mActivity, payTask.mPayRequest.mCountryCode, payTask.mPayTaskResult);
                        downloadManager.setDownloadCallback(PayTask.this);
                        downloadManager.start();
                        PayTask.this.notifyAppInstallOrUpdate(PayTask.RESULT_CODE_IU_APP);
                        downloadHintDialog2.dimiss();
                    }
                });
                downloadHintDialog2.show();
            }
        });
        downloadHintDialog.show();
    }

    public boolean checkAtlasSupport() {
        if (Utils.hasInstalledPayApk(this.mActivity)) {
            return true;
        }
        if (!Utils.isMatchArea(this.mActivity, this.mPayRequest.mCountryCode)) {
            return false;
        }
        showInstallDialog();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0050 A[PHI: r0
  0x0050: PHI (r0v36 java.lang.String) = (r0v32 java.lang.String), (r0v37 java.lang.String) binds: [B:24:0x008b, B:13:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[PHI: r0
  0x0054: PHI (r0v35 java.lang.String) = (r0v32 java.lang.String), (r0v37 java.lang.String), (r0v37 java.lang.String) binds: [B:24:0x008b, B:11:0x0044, B:13:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean checkParamsValid(PayRequest payRequest) {
        String str;
        String str2;
        Matcher matcher = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$").matcher(new BigDecimal(Double.toString(payRequest.mAmount)).toPlainString());
        boolean z = false;
        if (TextUtils.isEmpty(this.mPayRequest.mCountryCode)) {
            str = "mCountryCode is null";
        } else if (TextUtils.isEmpty(this.mPayRequest.mCurrencyCode)) {
            str = "mCurrencyCode is null";
        } else if (!matcher.matches()) {
            str2 = "mAmount should >= 0.01";
            if (2 == payRequest.mAutoRenew && "CN".equalsIgnoreCase(this.mPayRequest.mCountryCode)) {
                str = str2;
                z = true;
            } else {
                str = str2;
            }
        } else if (("CN".equalsIgnoreCase(this.mPayRequest.mCountryCode) && payRequest.mAmount > 9999.99d) || payRequest.mAmount < 0.01d) {
            str2 = String.format("mAmount should >= %s and <= %s", Double.valueOf(0.01d), Double.valueOf(9999.99d));
            if (2 == payRequest.mAutoRenew) {
                str = str2;
                z = true;
            } else {
                str = str2;
            }
        } else if (TextUtils.isEmpty(payRequest.mPartnerId)) {
            str = "mPartnerId is null";
        } else if (TextUtils.isEmpty(payRequest.mNotifyUrl)) {
            str = "mNotifyUrl is null";
        } else if (TextUtils.isEmpty(payRequest.mPackageName)) {
            str = "mPackageName is null";
        } else if (TextUtils.isEmpty(payRequest.mAppVersion)) {
            str = "mAppVersion is null";
        } else if (TextUtils.isEmpty(payRequest.mCurrencyName)) {
            str = "mCurrencyName is null";
        } else if (TextUtils.isEmpty(payRequest.mSource)) {
            str = "mSource is null";
        } else if (TextUtils.isEmpty(payRequest.mProductName)) {
            str = "mProductName is null";
        } else if (payRequest.mProductName.length() > 40) {
            str = "mProductName is too long";
        } else if (payRequest.mProductDesc.length() > 120) {
            str = "mProductDesc is too long";
        } else {
            int i = payRequest.mType;
            if (i == 0 || i == 1 || i == 2) {
                if (i == 1) {
                    if (TextUtils.isEmpty(payRequest.mPartnerOrder)) {
                        str = "if mType is 1，you should set mPartnerOrder";
                    } else if (TextUtils.isEmpty(payRequest.mSign)) {
                        str = "if mType is 1，you should set mSign";
                    }
                }
                str = "";
                z = true;
            } else {
                str = "mType can only be 0、1、2";
            }
        }
        Log.w(TAG, "isValid=" + z + ",tipString=" + str);
        if (!z) {
            Toast.makeText(this.mActivity.getApplicationContext(), str, 1).show();
        }
        return z;
    }

    @Deprecated
    public boolean directPay() {
        String str;
        if (!checkAtlasSupport()) {
            return false;
        }
        try {
            Intent intent = new Intent(getPayAction());
            Bundle bundle = new Bundle();
            if (Utils.hasInstalledFPayApk(this.mActivity)) {
                str = Constants.F_PAY_PKG_NAME;
            } else if (Utils.hasInstalledNPayApk(this.mActivity)) {
                str = Constants.N_PAY_PKG_NAME;
            } else {
                if (!Utils.hasInstalledOPayApk(this.mActivity)) {
                    Log.i(TAG, "don't find pkgName");
                    return false;
                }
                str = Constants.O_PAY_PKG_NAME;
            }
            intent.setPackage(str);
            intent.putExtra("jump_plugin_id", "1001");
            bundle.putString("payParams", this.mPayRequest.convert());
            bundle.putInt("operate_type", 2);
            intent.putExtras(bundle);
            int i = this.mThemeValue;
            if (i != -1) {
                intent.putExtra("theme_value", i);
            }
            Log.i(TAG, "goto directPay,send broadcast:" + str);
            this.mActivity.startService(intent);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.i(TAG, "goto directPay exception:" + e2);
            return true;
        }
    }

    @Override // com.client.platform.opensdk.pay.download.DownloadManager.DownloadCallback
    public void downloadSuccess() {
        Log.e("PayTask", "downloadSuccess");
    }

    public void goUpdate() {
        if (MarketDownloadHelper.jumpMarketItemDetail(this.mActivity, Constants.N_PAY_PKG_NAME) || MarketDownloadHelper.jumpMarketItemDetail(this.mActivity, Constants.O_PAY_PKG_NAME)) {
            return;
        }
        DownloadManager downloadManager = new DownloadManager(this.mActivity, this.mPayRequest.mCountryCode, this.mPayTaskResult);
        downloadManager.setDownloadCallback(this);
        downloadManager.start();
    }

    public boolean iSupportSinglePay() {
        String str;
        if (!checkAtlasSupport()) {
            return false;
        }
        try {
            doTickerWithoutNoting();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            if (Utils.hasInstalledFPayApk(this.mActivity)) {
                str = Constants.F_PAY_PKG_NAME;
            } else if (Utils.hasInstalledNPayApk(this.mActivity)) {
                str = Constants.N_PAY_PKG_NAME;
            } else {
                if (!Utils.hasInstalledOPayApk(this.mActivity)) {
                    Log.i(TAG, "don't find pkgName");
                    return false;
                }
                str = Constants.O_PAY_PKG_NAME;
            }
            return new JSONObject(new String(Base64.decode(this.mActivity.createPackageContext(str, 2).getSharedPreferences("single_pay_config", 0).getString(this.mPayRequest.mPackageName, ""), 0))).optBoolean("supportSiglePay");
        } catch (Exception e3) {
            Log.w(TAG, "catched exception: " + e3.getMessage());
            return true;
        }
    }

    public void installApkFromNet(final Context context, final String str) {
        if (Utils.isNotSupportDownload(this.mActivity, this.mPayRequest.mCountryCode)) {
            return;
        }
        final DownloadHintDialog downloadHintDialog = new DownloadHintDialog(context);
        downloadHintDialog.setHint("CN".equals(this.mPayRequest.mCountryCode) ? LanUtils.CN.HINT_DOWNLOAD : LanUtils.US.HINT_DOWNLOAD);
        downloadHintDialog.setLeftBtnText("CN".equals(this.mPayRequest.mCountryCode) ? LanUtils.CN.CANCEL : "CANCEL");
        "CN".equals(this.mPayRequest.mCountryCode);
        downloadHintDialog.setRightBtnText(LanUtils.CN.DOWNLOAD);
        downloadHintDialog.setBottomBtnClickedListener(new OnBottomBtnClickListener() { // from class: com.client.platform.opensdk.pay.PayTask.2
            @Override // com.client.platform.opensdk.pay.download.dialog.OnBottomBtnClickListener
            public void leftBtnClicked() {
                downloadHintDialog.dimiss();
                PayTask.this.notifyAppInstallOrUpdate(PayTask.RESULT_CODE_UPDATE_CANCEL);
            }

            @Override // com.client.platform.opensdk.pay.download.dialog.OnBottomBtnClickListener
            public void rightBtnClicked() {
                downloadHintDialog.dimiss();
                if (!Utils.isNetworkAvailable(context)) {
                    Toast.makeText(context.getApplicationContext(), "CN".equals(PayTask.this.mPayRequest.mCountryCode) ? LanUtils.CN.HINT_NO_NET : LanUtils.US.HINT_NO_NET, 1).show();
                    return;
                }
                if (Utils.isWifi(context)) {
                    new DownloadManager(context, str, PayTask.this.mPayTaskResult).start();
                    PayTask.this.notifyAppInstallOrUpdate(PayTask.RESULT_CODE_IU_APP);
                    return;
                }
                final DownloadHintDialog downloadHintDialog2 = new DownloadHintDialog(context);
                downloadHintDialog2.setHint("CN".equals(PayTask.this.mPayRequest.mCountryCode) ? LanUtils.CN.HINT_GPRS : LanUtils.US.HINT_GPRS);
                downloadHintDialog2.setLeftBtnText("CN".equals(PayTask.this.mPayRequest.mCountryCode) ? LanUtils.CN.CANCEL : "CANCEL");
                "CN".equals(PayTask.this.mPayRequest.mCountryCode);
                downloadHintDialog2.setRightBtnText(LanUtils.CN.DOWNLOAD);
                downloadHintDialog2.setBottomBtnClickedListener(new OnBottomBtnClickListener() { // from class: com.client.platform.opensdk.pay.PayTask.2.1
                    @Override // com.client.platform.opensdk.pay.download.dialog.OnBottomBtnClickListener
                    public void leftBtnClicked() {
                        downloadHintDialog2.dimiss();
                        PayTask.this.notifyAppInstallOrUpdate(PayTask.RESULT_CODE_UPDATE_CANCEL);
                    }

                    @Override // com.client.platform.opensdk.pay.download.dialog.OnBottomBtnClickListener
                    public void rightBtnClicked() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        new DownloadManager(context, str, PayTask.this.mPayTaskResult).start();
                        downloadHintDialog2.dimiss();
                        PayTask.this.notifyAppInstallOrUpdate(PayTask.RESULT_CODE_IU_APP);
                    }
                });
                downloadHintDialog2.show();
            }
        });
        downloadHintDialog.show();
    }

    public boolean pay() {
        String str = TAG;
        Log.i(str, "pay start");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.mLastStartTime < 500) {
            return false;
        }
        this.mLastStartTime = jCurrentTimeMillis;
        if (!checkParamsValid(this.mPayRequest)) {
            Log.i(str, "params invalid");
            return false;
        }
        if (!checkAtlasSupport()) {
            Log.i(str, "not support");
            return false;
        }
        Intent intent = new Intent(Constants.SINGLE_PAY_STARTUP_ACTION);
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.mPayRequest.mAutoOrderChannel)) {
            intent.putExtra("single_auto_channel", this.mPayRequest.mAutoOrderChannel);
        }
        if (Utils.hasInstalledNPayApk(this.mActivity)) {
            intent.setPackage(Constants.N_PAY_PKG_NAME);
        } else if (Utils.hasInstalledFPayApk(this.mActivity)) {
            intent.setPackage(Constants.F_PAY_PKG_NAME);
        } else if (Utils.hasInstalledOPayApk(this.mActivity)) {
            intent.setPackage(Constants.O_PAY_PKG_NAME);
        }
        this.mPayRequest.sdkStartTime = System.currentTimeMillis();
        intent.putExtra("single_show_sms", this.mPayRequest.mShowCpSmsChannel);
        intent.putExtra("single_use_cache_channel", this.mPayRequest.mUseCachedChannel);
        intent.putExtra("jump_plugin_id", "1001");
        bundle.putString("payParams", this.mPayRequest.convert());
        bundle.putFloat("charge_lower_limit", this.mChargeLimit);
        intent.putExtras(bundle);
        int i = this.mThemeValue;
        if (i != -1) {
            intent.putExtra("theme_value", i);
        }
        if (!(this.mActivity instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            this.mActivity.startActivity(intent);
            return true;
        } catch (Exception e2) {
            Log.i(TAG, e2.getMessage());
            Toast.makeText(this.mActivity, "please enable Secure payment app", 0).show();
            return false;
        }
    }

    @Deprecated
    public boolean queryBalance() {
        String str;
        if (!checkAtlasSupport()) {
            return false;
        }
        Intent intent = new Intent(getPayAction());
        Bundle bundle = new Bundle();
        if (Utils.hasInstalledFPayApk(this.mActivity)) {
            str = Constants.F_PAY_PKG_NAME;
        } else if (Utils.hasInstalledNPayApk(this.mActivity)) {
            str = Constants.N_PAY_PKG_NAME;
        } else {
            if (!Utils.hasInstalledOPayApk(this.mActivity)) {
                Log.i(TAG, "don't find pkgName");
                return false;
            }
            str = Constants.O_PAY_PKG_NAME;
        }
        intent.setPackage(str);
        intent.putExtra("jump_plugin_id", "1001");
        bundle.putString("payParams", this.mPayRequest.convert());
        bundle.putInt("operate_type", 1);
        intent.putExtras(bundle);
        Log.i(PayTask.class.getSimpleName(), "theme_value : " + this.mThemeValue);
        int i = this.mThemeValue;
        if (i != -1) {
            intent.putExtra("theme_value", i);
        }
        this.mActivity.startService(intent);
        return true;
    }

    @Deprecated
    public boolean queryOrder(String str, String str2) {
        String str3;
        String str4 = TAG;
        Log.w(str4, "start query... payRequestId=" + str + ",partnerorder=" + str2);
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            throw new NullPointerException("payRequestId 和 partnerOrderId不能同时为空!");
        }
        if (!checkAtlasSupport()) {
            return false;
        }
        Intent intent = new Intent(getPayAction());
        Bundle bundle = new Bundle();
        if (Utils.hasInstalledFPayApk(this.mActivity)) {
            str3 = Constants.F_PAY_PKG_NAME;
        } else if (Utils.hasInstalledNPayApk(this.mActivity)) {
            str3 = Constants.N_PAY_PKG_NAME;
        } else {
            if (!Utils.hasInstalledOPayApk(this.mActivity)) {
                Log.i(str4, "don't find pkgName");
                return false;
            }
            str3 = Constants.O_PAY_PKG_NAME;
        }
        intent.setPackage(str3);
        intent.putExtra("jump_plugin_id", "1001");
        bundle.putString("payParams", this.mPayRequest.convert());
        if (TextUtils.isEmpty(str)) {
            bundle.putString("payRequestId", "");
        } else {
            bundle.putString("payRequestId", str);
        }
        if (TextUtils.isEmpty(str2)) {
            bundle.putString("partnerOrder", "");
        } else {
            bundle.putString("partnerOrder", str2);
        }
        bundle.putInt("operate_type", 3);
        intent.putExtras(bundle);
        Log.i(PayTask.class.getSimpleName(), "theme_value : " + this.mThemeValue);
        int i = this.mThemeValue;
        if (i != -1) {
            intent.putExtra("theme_value", i);
        }
        this.mActivity.startService(intent);
        return true;
    }

    public void setPayTaskResultListener(IPayTaskResult iPayTaskResult) {
        this.mPayTaskResult = iPayTaskResult;
    }

    @Deprecated
    public void setTheme(int i) {
        this.mThemeValue = i;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public boolean shouldUpdateApk() throws Throwable {
        InputStream inputStreamOpen;
        String str;
        boolean z;
        int i;
        try {
            inputStreamOpen = this.mActivity.getAssets().open("opay_version");
        } catch (IOException unused) {
            inputStreamOpen = null;
        }
        if (Utils.hasInstalledFPayApk(this.mActivity)) {
            str = Constants.F_PAY_PKG_NAME;
        } else if (Utils.hasInstalledNPayApk(this.mActivity)) {
            str = Constants.N_PAY_PKG_NAME;
        } else {
            if (!Utils.hasInstalledOPayApk(this.mActivity)) {
                Log.i(TAG, "don't find pkgName");
                return false;
            }
            str = Constants.O_PAY_PKG_NAME;
        }
        int versionCode = Utils.getVersionCode(this.mActivity, str);
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStreamOpen);
            try {
                i = dataInputStream.readInt();
                try {
                    int i2 = dataInputStream.readInt();
                    int i3 = dataInputStream.readInt();
                    Log.w(TAG, "versionToInstall=" + i + ",netGameMinVersion=" + i2 + ",singleNameMinVersion=" + i3);
                    z = !this.mPayRequest.mIsSinglePay ? versionCode >= i2 || versionCode >= i : versionCode >= i3 || versionCode >= i;
                    try {
                        dataInputStream.close();
                    } catch (Exception unused2) {
                        if (i != -1) {
                            z = versionCode < i;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            dataInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    } catch (Exception unused3) {
                        z = false;
                        if (i != -1) {
                            z = versionCode < i;
                        }
                        if ("CN".equals(this.mPayRequest.mCountryCode)) {
                            return z;
                        }
                        try {
                            return !this.mActivity.getPackageManager().getApplicationInfo(str, 128).metaData.getBoolean("isSupportExpPay");
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return z;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                i = -1;
            }
        } catch (Exception unused4) {
            z = false;
            i = -1;
        }
        if ("CN".equals(this.mPayRequest.mCountryCode)) {
            return !this.mActivity.getPackageManager().getApplicationInfo(str, 128).metaData.getBoolean("isSupportExpPay");
        }
        return z;
    }

    public void showForcedUpdateDialog(Context context, String str, String str2, String str3, UpdateDialogType updateDialogType) {
        if (Utils.isNotSupportDownload(this.mActivity, this.mPayRequest.mCountryCode)) {
            return;
        }
        AtlasPayDialog atlasPayDialogCreate = new AtlasPayDialog.Builder(context).setTitle(str2).setCancelable(false).setSingleButton(str3, getUpdateListener(updateDialogType, str)).create();
        this.isForce = true;
        atlasPayDialogCreate.show();
    }

    public void showOptionalUpdateDialog(Context context, String str, CancelListener cancelListener, String str2, String str3, String str4, UpdateDialogType updateDialogType) {
        if (Utils.isNotSupportDownload(this.mActivity, this.mPayRequest.mCountryCode)) {
            return;
        }
        AtlasPayDialog atlasPayDialogCreateTwoBtnDialog = AtlasPayDialog.createTwoBtnDialog(context, str2, str3, str4, getCancelListener(cancelListener, updateDialogType, str), getUpdateListener(updateDialogType, str));
        this.isForce = false;
        atlasPayDialogCreateTwoBtnDialog.show();
    }

    public boolean singleVersionCheck() {
        InputStream inputStreamOpen;
        String str;
        int i;
        try {
            inputStreamOpen = this.mActivity.getAssets().open("opay_version");
        } catch (IOException unused) {
            inputStreamOpen = null;
        }
        boolean z = false;
        if (inputStreamOpen != null) {
            DataInputStream dataInputStream = new DataInputStream(inputStreamOpen);
            if (Utils.hasInstalledFPayApk(this.mActivity)) {
                str = Constants.F_PAY_PKG_NAME;
            } else if (Utils.hasInstalledNPayApk(this.mActivity)) {
                str = Constants.N_PAY_PKG_NAME;
            } else {
                if (!Utils.hasInstalledOPayApk(this.mActivity)) {
                    Log.i(TAG, "don't find pkgName");
                    return false;
                }
                str = Constants.O_PAY_PKG_NAME;
            }
            int versionCode = Utils.getVersionCode(this.mActivity, str);
            try {
                try {
                    try {
                        i = dataInputStream.readInt();
                        try {
                            int i2 = dataInputStream.readInt();
                            int i3 = dataInputStream.readInt();
                            if (!this.mPayRequest.mIsSinglePay ? !(versionCode >= i2 || versionCode >= i) : !(versionCode >= i3 || versionCode >= i)) {
                                z = true;
                            }
                            dataInputStream.close();
                        } catch (IOException unused2) {
                            if (-1 != i && (!this.mPayRequest.mIsSinglePay ? versionCode < i : versionCode < i)) {
                                z = true;
                            }
                            dataInputStream.close();
                        }
                    } catch (Throwable th) {
                        try {
                            dataInputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                    i = -1;
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return !z;
    }

    public boolean supportSinglePayStartup() {
        List<ResolveInfo> listD = en.d(this.mActivity.getPackageManager(), new Intent(Constants.SINGLE_PAY_STARTUP_ACTION), 65536);
        return listD != null && listD.size() > 0;
    }
}
