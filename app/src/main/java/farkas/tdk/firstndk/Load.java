package farkas.tdk.firstndk;

/**
 * Created by tangdikun on 16/8/10.
 *
 */
public class Load {
    static {
        System.loadLibrary("myFirstLb");
    }
    public native int addInt(int a,int b);//调用库里的方法“addInt”，这是计算a和b两个整数相加
    public native int reduceInt(int a,int b);
}
