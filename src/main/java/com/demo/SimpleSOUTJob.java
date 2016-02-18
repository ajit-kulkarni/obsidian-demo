package com.demo;

import com.carfey.ops.job.Context;
import com.carfey.ops.job.SchedulableJob;
import com.carfey.ops.job.param.Description;
import org.springframework.stereotype.Component;



@Component
@Description("This is a Demo JOB!")
public class SimpleSOUTJob implements SchedulableJob {

    @Override
    public void execute(Context context) throws Exception {
        System.out.println("Job executed!");
    }
}