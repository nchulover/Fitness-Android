package com.joi.school.fitness.core.sport.doing;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.joi.school.fitness.R;
import com.joi.school.fitness.tools.bean.Sport;

import java.util.List;

/**
 * Description.
 *
 * @author Joi
 * createAt 2019/4/17 0017 21:21
 */
public class DoingExerciseListAdapter extends RecyclerView.Adapter<DoingExerciseViewHolder> {

    private List<Sport> mSportList;
    private List<Integer> mTimeList;

    public DoingExerciseListAdapter(List<Sport> mSportList, List<Integer> mTimeList) {
        this.mSportList = mSportList;
        this.mTimeList = mTimeList;
    }

    @NonNull
    @Override
    public DoingExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        DoingExerciseViewHolder viewHolder = new DoingExerciseViewHolder(
                LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_exercise_task, viewGroup, false)
        );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DoingExerciseViewHolder exerciseTaskViewHolder, int i) {
        Sport sport = mSportList.get(i);
        int timeInMinute = mTimeList.get(i);
        exerciseTaskViewHolder.build(sport, timeInMinute);
    }

    @Override
    public int getItemCount() {
        return mSportList.size();
    }

}
