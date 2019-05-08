package com.yeomer.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.util.Date;

public class TestJob implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("Elastic Job 运行中 "+ new Date());
    }
}
