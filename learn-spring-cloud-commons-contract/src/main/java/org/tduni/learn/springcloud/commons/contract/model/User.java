package org.tduni.learn.springcloud.commons.contract.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by kidal on 2017/6/13.
 *
 * @author kidal
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /**
     *
     */
    private String name;

    /**
     *
     */
    private Integer age;

    /**
     *
     */
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
