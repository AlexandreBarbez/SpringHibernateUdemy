package com.halx.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static String getDateFormattedLikeSpringBoot(){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss:SSS").format(LocalDateTime.now());
    }
}
