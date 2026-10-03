package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATMessageRemindType {
    Unknown(255),
    All(0),
    IncomingCall(1),
    DefaultMessage(2),
    Antilost(3),
    Sms(4),
    Wechat(5),
    QQ(6),
    FaceBook(7),
    Twitter(8),
    Line(9),
    Gmail(10),
    Kakao(11),
    WhatsApp(12),
    Instagram(13),
    Applemusic(14),
    GoogleMaps(15),
    Likee(16),
    LinkedIn(17),
    Messenger(18),
    Momo(19),
    Odnoklassniki(20),
    Privat24(21),
    VK(22),
    YouTube(23),
    YouTubeMusic(24),
    Zoom(25),
    Skype(26),
    Telegram(27),
    Tiktok(28),
    Viber(29),
    Lestfit(30),
    SeWellness(254),
    Other(253);

    private int value;

    ATMessageRemindType(int i) {
        this.value = i;
    }

    public static ATMessageRemindType getMessageRemindCmd(int i) {
        for (ATMessageRemindType aTMessageRemindType : values()) {
            if (aTMessageRemindType.getValue() == i) {
                return aTMessageRemindType;
            }
        }
        return DefaultMessage;
    }

    public int getValue() {
        return this.value;
    }
}
