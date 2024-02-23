//package com.example.springboot.common;
//
//import com.example.springboot.entity.DormRoom;
//
//public class CalPeopleNum {
//
//    public static int calNum(DormRoom dormRoom) {
//        int count = 0;
//
//        if (dormRoom.getFirstBed() != null) {
//            count++;
//        }
//        if (dormRoom.getSecondBed() != null) {
//            count++;
//        }
//        if (dormRoom.getThirdBed() != null) {
//            count++;
//        }
//        if (dormRoom.getFourthBed() != null) {
//            count++;
//        }
//        return count;
//    }
//}
package com.example.springboot.common;

import com.example.springboot.entity.DormRoom;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CalPeopleNum {

    public static int calNum(DormRoom dormRoom) {
        List<Object> beds = Arrays.asList(
            dormRoom.getFirstBed(),
            dormRoom.getSecondBed(),
            dormRoom.getThirdBed(),
            dormRoom.getFourthBed()
        );

        return (int) beds.stream().filter(Objects::nonNull).count();
    }
}