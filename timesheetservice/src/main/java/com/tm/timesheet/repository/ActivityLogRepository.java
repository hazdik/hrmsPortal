package com.tm.timesheet.repository;


import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tm.timesheet.domain.ActivityLog;


@Repository
public interface ActivityLogRepository extends MongoRepository<ActivityLog, UUID> {


}
