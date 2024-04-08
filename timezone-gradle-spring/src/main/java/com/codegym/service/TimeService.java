package com.codegym.service;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.TimeZone;

@Service
public class TimeService {
    public Date displayTime(String city) {
        // Lấy ra thời gian hiện tại
        Date date = new Date();
        // Lấy ra time zone hiện tại
        TimeZone local = TimeZone.getDefault();
        // Lấy ra time zone của 1 thành phố cụ thể
        TimeZone locale = TimeZone.getTimeZone(city);

        // Tính thời gian hiện tại của một thành phố cụ thể
        long localeTime = date.getTime() + (locale.getRawOffset() - local.getRawOffset());
        // Cài đặt lại thời gian cho biến date thành thời gian hiện tại của 1 thành phố cụ thể
        date.setTime(localeTime);

        return date;
    }
}
