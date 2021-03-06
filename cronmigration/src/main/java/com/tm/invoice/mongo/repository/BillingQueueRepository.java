package com.tm.invoice.mongo.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tm.invoice.domain.BillingQueue;

@Repository
public interface BillingQueueRepository extends MongoRepository<BillingQueue,UUID>,BillingQueueRepositoryCustom {

}
