package com.coder.hotel.util;

import javax.swing.*;

/**
 * @author ZQC
 * @date 2024-12-04
 * @project HotelManager
 */
public class UiUtil {
    public static void indent(JFrame src, JFrame dest){
        if (src!=null)
            src.setVisible(false);
        if (dest!=null)
            dest.setVisible(true);
    }
}
