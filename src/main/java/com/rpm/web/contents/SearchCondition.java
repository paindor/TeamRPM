package com.rpm.web.contents;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@NoArgsConstructor
@Setter(AccessLevel.PUBLIC)
@Getter
public class SearchCondition {

    private List<SearchDetailCondition> categoryList;
    private List<SearchDetailCondition> makerList;
    private List<SearchDetailCondition> fuelTypeList;
    private List<SearchDetailCondition> regionList;
    private String searchWord;
    private String carcd;
    private String findKey;
}
