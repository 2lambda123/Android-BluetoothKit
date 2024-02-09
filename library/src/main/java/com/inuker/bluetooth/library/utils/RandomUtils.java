package com.inuker.bluetooth.library.utils;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by dingjikerbo on 2016/1/13.
 */
public class RandomUtils {

    private static Random mRandom;

    public static double randFloat() {
        if (mRandom == null) {
            mRandom = new SecureRandom();
            mRandom.setSeed(System.currentTimeMillis());
        }
        return mRandom.nextDouble();
    }
}
