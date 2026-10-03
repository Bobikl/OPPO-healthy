package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public enum LSAppCategory {
    Unknown(1048575),
    IncomingCall(65520),
    All(1048561),
    Other(1048562),
    Sms(0),
    Wechat(1),
    QQ(2),
    Facebook(7),
    Twitter(8),
    Line(9),
    Gmail(10),
    WhatsApp(11),
    Instagram(12),
    Applemusic(13),
    GoogleMaps(14),
    Likee(15),
    LinkedIn(16),
    Messenger(17),
    Momo(18),
    Odnoklassniki(19),
    Privat24(20),
    VK(21),
    YouTube(22),
    YouTubeMusic(23),
    Zoom(24),
    Skype(25),
    Telegram(26),
    Tiktok(27),
    Viber(28),
    Lestfit(29),
    WoWgoHealth(65530),
    iCare(65531),
    TianruiHealth(65532),
    SeWellness(65533),
    KaKao(65534),
    WeatherInfo(3),
    MusicInfo(4),
    IotDevice(5);

    private int value;

    LSAppCategory(int i) {
        this.value = i;
    }

    public static LSAppCategory getMessageID(int i) {
        for (LSAppCategory lSAppCategory : values()) {
            if (lSAppCategory.getValue() == i) {
                return lSAppCategory;
            }
        }
        return Unknown;
    }

    public int getValue() {
        return this.value;
    }
}
