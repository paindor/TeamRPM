package com.rpm.web.contents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CarsServiceImpl implements CarsService {
    @Autowired private CarsRepository carsRepository;

    @Override
    public Map<String, List<Cars>> getCategoryByCarType(Iterable<Cars> cars) {
        return StreamSupport.stream(cars.spliterator(), false)
                .filter(distinctByKey(Cars::getMakenm))
                .collect(Collectors.groupingBy(Cars::getCarType));
    }

    @Override
    public Map<String, Map<String, Long>> getCategory1(Iterable<Cars> cars) {
        return StreamSupport.stream(cars.spliterator(), false)
                .collect(Collectors.groupingBy(Cars::getCarType,
                        Collectors.groupingBy(Cars::getMakenm,Collectors.counting())));
    }
    @Override
    public Map<String, Long> getCategory2(String param) {
        return StreamSupport.stream(carsRepository.findByMakenm(param).spliterator(), false)
                .collect(Collectors.groupingBy(Cars::getModelGrpNm, Collectors.counting()));
    }
    @Override
    public Map<String, Long> getCategory3(String param) {
        return StreamSupport.stream(carsRepository.findByModelGrpNm(param).spliterator(), false)
                .collect(Collectors.groupingBy(Cars::getModelnmText, Collectors.counting()));
    }

    @Override
    public List<Cars>  findAllByDistinct(List<Cars> carsList) {
        return carsList.stream()
                .filter(distinctByKey(Cars::getCarcd))
                .collect(Collectors.toList());
    }

    @Override
    public List<Cars> findAllByDistinct(Iterable<Cars> cars) {
        return null;
    }

    @Override
    public <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

    @Override
    public List<SearchDetailCondition> findByMakecdWithCount(List<Cars> carsList) {
        List<SearchDetailCondition> tmpMakecd = findByMakecd(carsList);
        for (SearchDetailCondition detailCondition : tmpMakecd) {
            int cnt = 0;
            for (Cars cars : carsList) {
                if (detailCondition.getCode().equals(cars.getMakecd())) cnt++;
            }
            detailCondition.setCount(cnt);
        }
        return tmpMakecd;
    }

    @Override
    public List<SearchDetailCondition> findByMakecd(List<Cars> carsList) {
        List<SearchDetailCondition> tmpMakecd = new ArrayList<>();
        int cnt = 0 ;
        for (Cars cars : carsList.stream()
                .filter(distinctByKey(Cars::getMakecd))
                .collect(Collectors.toList())) {
            SearchDetailCondition tmpCondition = new SearchDetailCondition();
            tmpCondition.setCode(cars.getMakecd());
            tmpCondition.setName(cars.getMakenm());
            tmpMakecd.add(tmpCondition);
        }
        return tmpMakecd;
    }
    @Override
    public List<Cars> findCarWithFuleType(List<Cars> carsList) {
        return carsList.stream()
                .filter(distinctByKey(Cars::getFuelTyped))
                .collect(Collectors.toList());
    }

    @Override
    public List<Cars> findCarWithCenterRegionCode(List<Cars> carsList) {
        return carsList.stream()
                .filter(distinctByKey(Cars::getCenterRegionCode))
                .collect(Collectors.toList());
    }

    @Override
    public List<Cars> findAllCategory(List<Cars> carsList) {
        return carsList.stream()
                .filter(distinctByKey(Cars::getCategorycd))
                .collect(Collectors.toList());
    }

    @Override
    public List<Cars> findCarBySelectedCategory(List<Cars> carsList, String categorycode) {
        return carsList.stream()
                .filter(cars -> categorycode.equals(cars.getCategorycd()))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends Cars> findCarBySelectedMaker(List<Cars> carsList, String makercode) {
        return carsList.stream()
                .filter(cars -> makercode.equals(cars.getCategorycd()))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends Cars> findCarBySelectedFuelType(List<Cars> carsList, String fuelTypecode) {
        return carsList.stream()
                .filter(cars -> fuelTypecode.equals(cars.getCategorycd()))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends Cars> findCarBySelectedRegion(List<Cars> carsList, String regioncode) {
        return carsList.stream()
                .filter(cars -> regioncode.equals(cars.getCategorycd()))
                .collect(Collectors.toList());
    }


}
