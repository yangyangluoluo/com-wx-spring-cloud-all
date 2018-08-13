package com.wx.service.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/3
 * @time: 下午2:25
 * @description : 用于保存当前线程使用的数据源名
 */
public class DataSourceContextHolder {

    public static final Logger log = LoggerFactory.getLogger(DataSourceContextHolder.class);

    /**
     * 默认数据源
     */
    public static final String DEFAULT_DS = "FS";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    /**
     * 设置数据源名
     * @Author LJG
     * @date  2018/08/03
     */
    public static void setDB(String dbType) {
        log.debug("切换到{}数据源", dbType);
        contextHolder.set(dbType);
    }

    /**
     * 获取数据源名
     * @Author LJG
     * @date  2018/08/03
     */
    public static String getDB() {
        return (contextHolder.get());
    }

    /**
     * 清除数据源名
     * @Author LJG
     * @date  2018/08/03
     */
    public static void clearDB() {
        contextHolder.remove();
    }
}
