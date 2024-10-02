package org.example._20241001_equals;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        MyIdentifier myIdentifier1 = new MyIdentifier("first", 1);
        MyIdentifier myIdentifier2 = new MyIdentifier("second", 2);
        MyIdentifier myIdentifier3 = new MyIdentifier("first", 1);

        System.out.println(myIdentifier1.equals(myIdentifier2));
        System.out.println(myIdentifier1.equals(myIdentifier3));

        MyDateTime myDateTime = new MyDateTime(1, 1);
        MyDateTimeDetail myDateTimeDetail = new MyDateTimeDetail(1, 1, 1);

        System.out.println(myDateTimeDetail.equals(myDateTime));
        System.out.println(myDateTime.equals(myDateTimeDetail));

        Timestamp timestamp = new Timestamp(1);
        Date date = new Date(1);
        System.out.println(timestamp.equals(date));
        System.out.println(date.equals(timestamp));
    }
}
