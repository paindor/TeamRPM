package com.rpm.web.contents;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarsRepository extends CrudRepository<Cars, Long> {
    public List<Cars> findByMakenm(String makenm);
    public List<Cars> findByModelGrpNm(String modelGrpNm);

    @Query(value="SELECT DISTINCT categorycd ,categorynm FROM car", nativeQuery=true)
    public List<Map<String,String>> findAllCategory();

    @Query(value="SELECT DISTINCT makecd, makenm FROM car", nativeQuery=true)
    public List<Map<String,String>>  findCarWithMakerCount();

    @Query(value="SELECT DISTINCT fule_typed , fuel_typed_name FROM car", nativeQuery=true)
    public List<Map<String,String>>  findCarWithFuleType();

    @Query(value="SELECT DISTINCT center_region_code , center_region  FROM car", nativeQuery=true)
    public List<Map<String,String>>  findCarWithCenterRegionCode();


    @Query(value="SELECT  * FROM car ", nativeQuery=true)
    public List<Cars> findCarWithPaging();


}
