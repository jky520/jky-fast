package com.jky.common.validator;

import org.apache.commons.lang.StringUtils;

import com.jky.common.exception.RRException;

/**
 * 数据校验
 * @author @DT人
 * @email jky1988@qq.com
 * @date 2017-03-23 15:50
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }
}
