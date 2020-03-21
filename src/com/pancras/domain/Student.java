package com.pancras.domain;

import lombok.*;

/**
 * @author Pancras
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long uid;

    private String uName;

    private Integer uAge;

    @Override
    public String toString() {
        return "Student{" +
                "uid=" + uid +
                ", uName='" + uName + '\'' +
                ", uAge=" + uAge +
                '}';
    }
}
