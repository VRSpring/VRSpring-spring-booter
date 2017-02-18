package com.vrspring.web.util;

import com.alibaba.media.MediaDir;

import java.util.Comparator;

public class DateComparator implements Comparator{  
	  
    public int compare(Object o1, Object o2) {  
        if(null!=o1&&null!=o2)  
        {  
            MediaDir menu1=(MediaDir)o1;
            MediaDir menu2=(MediaDir)o2;
            if(menu1.getCreateDate().compareTo(menu2.getCreateDate())>0){  
                return 1;  
            }else {  
                return 0;  
            }  
        }  
        return 0;  
    }  
      
}