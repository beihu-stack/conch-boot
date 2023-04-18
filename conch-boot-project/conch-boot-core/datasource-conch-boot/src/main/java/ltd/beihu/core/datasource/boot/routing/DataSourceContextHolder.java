package ltd.beihu.core.datasource.boot.routing;

import org.springframework.util.Assert;

/**
 * data source context holder
 *
 * @author：恒宇少年 - 于起宇
 * <p>
 * DateTime：2019-04-01 16:12
 * Blog：http://blog.yuqiyu.com
 * WebSite：http://www.jianshu.com/u/092df3f77bca
 * Gitee：https://gitee.com/hengboy
 * GitHub：https://github.com/hengboy
 */
public class DataSourceContextHolder {
    /**
     * current thread data source pool name
     */
    private static ThreadLocal<String> DATA_SOURCE_POOL_NAME = new ThreadLocal();

    /**
     * setting current thread pool name
     *
     * @param dataSourcePoolName datasource pool name
     */
    public static void set(String dataSourcePoolName) {
        Assert.notNull(dataSourcePoolName, "DataSource pool name is required.");
        DATA_SOURCE_POOL_NAME.set(dataSourcePoolName);
    }

    /**
     * get current thread pool name
     *
     * @return data source pool name
     */
    public static String get() {
        return DATA_SOURCE_POOL_NAME.get();
    }

    /**
     * remove current thread pool name
     */
    public static void remove() {
        DATA_SOURCE_POOL_NAME.remove();
    }
}
