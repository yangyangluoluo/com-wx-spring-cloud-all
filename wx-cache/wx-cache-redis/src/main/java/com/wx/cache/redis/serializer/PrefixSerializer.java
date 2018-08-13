package com.wx.cache.redis.serializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.nio.charset.Charset;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/8
 * @time: 下午2:55
 * @description : 序列化的key的设置
 */
@Component
public class PrefixSerializer implements RedisSerializer<String> {

    private final Logger logger = LoggerFactory.getLogger ( this.getClass () );

    private final Charset charset;

    @Value("${spring.redis.prefix}"+"::")
    private String prefix;


    public PrefixSerializer() {
        this ( Charset.forName ( "UTF8" ) );
    }

    public PrefixSerializer(Charset charset) {
        Assert.notNull ( charset, "Charset must not be null!" );
        this.charset = charset;
    }

    @Override
    public String deserialize(byte[] bytes) {
        String saveKey = new String ( bytes, charset );
        int indexOf = saveKey.indexOf ( prefix );
        if (indexOf > 0) {
            logger.info ( "key缺少前缀" );
        } else {
            saveKey = saveKey.substring ( indexOf );
        }
        logger.info ( "saveKey:{}",saveKey);
        return (saveKey.getBytes () == null ? null : saveKey);
    }

    @Override
    public byte[] serialize(String string) {
        String key = prefix + string;
        logger.info ( "key:{},getBytes:{}",key, key.getBytes ( charset ));
        return (key == null ? null : key.getBytes ( charset ));
    }

}
