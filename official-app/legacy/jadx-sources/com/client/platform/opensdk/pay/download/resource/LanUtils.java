package com.client.platform.opensdk.pay.download.resource;

/* JADX INFO: loaded from: classes13.dex */
public interface LanUtils {

    public interface CN {
        public static final String CANCEL = "取消";
        public static final String DOWNLOAD = "下载";
        public static final String DOWNLOADING = "正在下载";
        public static final String DOWNLOAD_PAUSED = "下载暂停";
        public static final String HINT_DOWNLOAD = "使用该支付需要下载安全支付。";
        public static final String HINT_DOWNLOAD_FAIL = "下载失败，请重新下载";
        public static final String HINT_GPRS = "当前为数据网络，下载将消耗手机流量，确定下载吗？";
        public static final String HINT_INSTALL = "您尚未安装'安全支付'控件，安装后可立即使用充值支付服务，并保证账户安全，取消则无法支付。";
        public static final String HINT_NO_NET = "网络未连接，请检测网络";
        public static final String HINT_SD_UNUSABLE = "sd卡未挂载，无法安装安全支付插件";
        public static final String HINT_UPDATE = "您需要更新'安全支付'控件，安装后可立即使用充值支付服务，并保证账户安全，取消则无法支付。";
        public static final String INSTALL_WITHOUT_DOWNLOAD = "安装（无需下载）";
        public static final String PAUSE = "暂停";
        public static final String RESUME_DOWNLOAD = "继续下载";
        public static final String UPDATE_WITHOUT_DOWNLOAD = "更新（无需下载）";
    }

    public interface US {
        public static final String CANCEL = "CANCEL";
        public static final String DOWNLOAD = "DOWNLOAD";
        public static final String DOWNLOADING = "DOWNLOADING";
        public static final String DOWNLOAD_PAUSED = "DOWNLOAD PAUSED";
        public static final String HINT_DOWNLOAD = "You need to download Secure Payment to use this payment method.";
        public static final String HINT_DOWNLOAD_FAIL = "Download failed. Please re-download";
        public static final String HINT_GPRS = "You're using data network. The download will consume cellular data. Download?";
        public static final String HINT_INSTALL = "You haven't installed the 'Secure Payment' widget yet. You can use the top-up and payment services immediately after the installation with your account secured. You won't be able to make the payment if you cancel.";
        public static final String HINT_NO_NET = "Network not connected. Please check the network";
        public static final String HINT_SD_UNUSABLE = "SD card not mounted. Unable to install the secure payment widget";
        public static final String HINT_UPDATE = "You need to update the 'Secure Payment' widget, and you can use the top-up and payment services immediately after the installation with your account secured. You won't be able to make the payment if you cancel.";
        public static final String INSTALL_WITHOUT_DOWNLOAD = "INSTALL (NO DOWNLOAD REQUIRED)";
        public static final String PAUSE = "PAUSE";
        public static final String RESUME_DOWNLOAD = "RESUME DOWNLOAD";
        public static final String UPDATE_WITHOUT_DOWNLOAD = "UPDATE (NO DOWNLOAD REQUIRED)";
    }
}
