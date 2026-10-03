package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class oy1 {
    public static final int CODE = 3000;
    public int a;
    public String b;

    public oy1() {
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean c() {
        return this.a == 0;
    }

    public void d() {
        switch (this.a) {
            case 0:
                this.b = "操作成功";
                break;
            case 23200:
                this.b = "成员名称重复";
                break;
            case 23201:
                this.b = "成员名称不能为空";
                break;
            case 23202:
                this.b = "添加成员已经达到上限";
                break;
            case 23205:
                this.b = "数据唯一标识不存在";
                break;
            case 23206:
                this.b = "数据已经被其他成员认领";
                break;
            case 23207:
                this.b = "手工添加体重没有人体阻抗，不支持称重计算";
                break;
            case 23208:
                this.b = "称重数据计算中，请在计算成功后再次查询";
                break;
            case 100001:
                this.b = "参数错误";
                break;
            case 100002:
                this.b = "数据平台数据库处理异常";
                break;
            case jp6.ERR_LOGIN_STATUS /* 100004 */:
                this.b = "数据平台账号登录状态错误";
                break;
            case 100005:
                this.b = "数据平台远程调用异常";
                break;
            case 101002:
                this.b = "数据读取失败，请稍后再试";
                break;
            case 101003:
                this.b = "数据删除失败，请稍后再试";
                break;
            case 101004:
                this.b = "数据同步中";
                break;
            default:
                this.b = "操作频繁，请稍后再试";
                break;
        }
    }

    public oy1(int i) {
        this.a = i;
        d();
    }

    public oy1(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
