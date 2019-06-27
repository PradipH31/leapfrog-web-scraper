/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.scrapper.dao.impl;

import com.leapfrog.scrapper.dao.JobDAO;
import com.leapfrog.scrapper.entity.Job;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP B&O
 */
public class JobDAOImpl implements JobDAO {

    List<Job> jobList = new ArrayList<>();

    @Override
    public List<Job> getAll() {
        return jobList;
    }

    @Override
    public int insert(Job job) {
        return jobList.add(job) ? 1 : 0;

    }

}
