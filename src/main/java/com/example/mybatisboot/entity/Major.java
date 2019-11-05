package com.example.mybatisboot.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@Alias("major")
public class Major {
    private int majorId;

    private String majorName;

    public Major(String majorName){

        this.majorName = majorName;
    }

    @Override
    public String toString(){
        return "Major=[id:" + this.majorId
                + ",name:" + this.majorName + "]";
    }
}
