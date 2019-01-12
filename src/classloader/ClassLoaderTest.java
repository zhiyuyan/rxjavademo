package classloader;

public class ClassLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        // 下面语句仅仅是加载Tester类
        cl.loadClass("classloader.Tester");
        System.out.println("系统加载Tester类");
        // 下面语句才会初始化Tester类
        Class.forName("classloader.Tester");
    }

}
