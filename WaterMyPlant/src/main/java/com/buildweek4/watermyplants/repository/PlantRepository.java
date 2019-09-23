package com.buildweek4.watermyplants.repository;

import com.buildweek4.watermyplants.models.Plant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PlantRepository extends PagingAndSortingRepository<Plant, Long>
    {
    }
