package com.joi.school.fitness.tools.bean;

import com.joi.school.fitness.tools.bmobsync.SyncBmobObject;

import cn.bmob.v3.datatype.BmobDate;

/**
 * Description.
 *
 * @author Joi
 * createAt 2019/4/4 0004 10:35
 */
public class ExerciseTask extends SyncBmobObject {
    private FitnessUser targetUser;
    private String data;
    private BmobDate time;

    public FitnessUser getTargetUser() {
        return targetUser;
    }

    public ExerciseTask setTargetUser(FitnessUser targetUser) {
        this.targetUser = targetUser;
        return this;
    }

    public String getData() {
        return data;
    }

    public ExerciseTask setData(String data) {
        this.data = data;
        return this;
    }

    public BmobDate getTime() {
        return time;
    }

    public ExerciseTask setTime(BmobDate time) {
        this.time = time;
        return this;
    }
}
